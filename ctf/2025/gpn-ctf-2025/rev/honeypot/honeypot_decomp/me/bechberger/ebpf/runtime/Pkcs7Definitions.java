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
import me.bechberger.ebpf.runtime.HashDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.X509Definitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Pkcs7Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs7_validate_trust(Ptr<pkcs7_message> pkcs7, Ptr<runtime.key> trust_keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_check_content_type($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_check_content_type(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs7_digest(Ptr<pkcs7_message> pkcs7, Ptr<pkcs7_signed_info> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_extract_cert($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_extract_cert(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pkcs7_free_message(Ptr<pkcs7_message> pkcs7) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_get_content_data((const struct pkcs7_message*)$arg1, (const void**)$arg2, $arg3, $arg4)")
    public static int pkcs7_get_content_data(Ptr<pkcs7_message> pkcs7, Ptr<Ptr<?>> _data, Ptr<@Unsigned Long> _data_len, Ptr<@Unsigned Long> _headerlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_get_digest($arg1, (const u8**)$arg2, $arg3, $arg4)")
    public static int pkcs7_get_digest(Ptr<pkcs7_message> pkcs7, Ptr<Ptr<Character>> buf, Ptr<@Unsigned Integer> len, Ptr<HashDefinitions.hash_algo> hash_algo2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_note_OID($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_note_OID(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_note_certificate_list($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_note_certificate_list(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_note_content($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_note_content(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_note_data($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_note_data(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_note_signed_info($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_note_signed_info(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_note_signeddata_version($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_note_signeddata_version(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_note_signerinfo_version($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_note_signerinfo_version(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_parse_message((const void*)$arg1, $arg2)")
    public static Ptr<pkcs7_message> pkcs7_parse_message(Ptr<?> data, @Unsigned long datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_sig_note_authenticated_attr($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_sig_note_authenticated_attr(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_sig_note_digest_algo($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_sig_note_digest_algo(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_sig_note_issuer($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_sig_note_issuer(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_sig_note_pkey_algo($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_sig_note_pkey_algo(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_sig_note_serial($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_sig_note_serial(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_sig_note_set_of_authattrs($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_sig_note_set_of_authattrs(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_sig_note_signature($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_sig_note_signature(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_sig_note_skid($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int pkcs7_sig_note_skid(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pkcs7_supply_detached_data($arg1, (const void*)$arg2, $arg3)")
    public static int pkcs7_supply_detached_data(Ptr<pkcs7_message> pkcs7, Ptr<?> data, @Unsigned long datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs7_verify(Ptr<pkcs7_message> pkcs7, KeyDefinitions.key_being_used_for usage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pkcs7_verify_sig_chain(Ptr<pkcs7_message> pkcs7, Ptr<pkcs7_signed_info> sinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pkcs7_parse_context")
    @NotUsableInJava
    public static class pkcs7_parse_context
    extends Struct {
        public Ptr<pkcs7_message> msg;
        public Ptr<pkcs7_signed_info> sinfo;
        public Ptr<Ptr<pkcs7_signed_info>> ppsinfo;
        public Ptr<X509Definitions.x509_certificate> certs;
        public Ptr<Ptr<X509Definitions.x509_certificate>> ppcerts;
        public @Unsigned long data;
        public runtime.OID last_oid;
        public @Unsigned int x509_index;
        public @Unsigned int sinfo_index;
        public Ptr<?> raw_serial;
        public @Unsigned int raw_serial_size;
        public @Unsigned int raw_issuer_size;
        public Ptr<?> raw_issuer;
        public Ptr<?> raw_skid;
        public @Unsigned int raw_skid_size;
        public boolean expect_skid;
    }

    @Type(noCCodeGeneration=true, cType="struct pkcs7_signed_info")
    @NotUsableInJava
    public static class pkcs7_signed_info
    extends Struct {
        public Ptr<pkcs7_signed_info> next;
        public Ptr<X509Definitions.x509_certificate> signer;
        public @Unsigned int index;
        public boolean unsupported_crypto;
        public boolean blacklisted;
        public Ptr<?> msgdigest;
        public @Unsigned int msgdigest_len;
        public @Unsigned int authattrs_len;
        public Ptr<?> authattrs;
        public @Unsigned long aa_set;
        public @OriginalName(value="time64_t") long signing_time;
        public Ptr<misc.public_key_signature> sig;
    }

    @Type(noCCodeGeneration=true, cType="enum pkcs7_actions")
    public static enum pkcs7_actions implements Enum<pkcs7_actions>,
    TypedEnum<pkcs7_actions, Integer>
    {
        ACT_pkcs7_check_content_type,
        ACT_pkcs7_extract_cert,
        ACT_pkcs7_note_OID,
        ACT_pkcs7_note_certificate_list,
        ACT_pkcs7_note_content,
        ACT_pkcs7_note_data,
        ACT_pkcs7_note_signed_info,
        ACT_pkcs7_note_signeddata_version,
        ACT_pkcs7_note_signerinfo_version,
        ACT_pkcs7_sig_note_authenticated_attr,
        ACT_pkcs7_sig_note_digest_algo,
        ACT_pkcs7_sig_note_issuer,
        ACT_pkcs7_sig_note_pkey_algo,
        ACT_pkcs7_sig_note_serial,
        ACT_pkcs7_sig_note_set_of_authattrs,
        ACT_pkcs7_sig_note_signature,
        ACT_pkcs7_sig_note_skid,
        NR__pkcs7_actions;

    }

    @Type(noCCodeGeneration=true, cType="struct pkcs7_message")
    @NotUsableInJava
    public static class pkcs7_message
    extends Struct {
        public Ptr<X509Definitions.x509_certificate> certs;
        public Ptr<X509Definitions.x509_certificate> crl;
        public Ptr<pkcs7_signed_info> signed_infos;
        public char version;
        public boolean have_authattrs;
        public runtime.OID data_type;
        public @Unsigned long data_len;
        public @Unsigned long data_hdrlen;
        public Ptr<?> data;
    }
}

