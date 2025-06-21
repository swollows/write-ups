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
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DnsDefinitions {
    public static final @Unsigned int dns_key_data = 0;
    public static final @Unsigned int dns_key_error = 1;

    @NotUsableInJava
    @BuiltinBPFFunction(value="dns_resolver_cmp((const struct key*)$arg1, (const struct key_match_data*)$arg2)")
    public static boolean dns_resolver_cmp(Ptr<runtime.key> key2, Ptr<KeyDefinitions.key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dns_resolver_describe((const struct key*)$arg1, $arg2)")
    public static void dns_resolver_describe(Ptr<runtime.key> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dns_resolver_free_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dns_resolver_match_preparse(Ptr<KeyDefinitions.key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dns_resolver_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dns_resolver_read((const struct key*)$arg1, $arg2, $arg3)")
    public static long dns_resolver_read(Ptr<runtime.key> key2, String buffer, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dns_query($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5, $arg6, $arg7, $arg8)")
    public static int dns_query(Ptr<runtime.net> net2, String type2, String name, @Unsigned long namelen, String options, Ptr<String> _result, Ptr<@OriginalName(value="time64_t") Long> _expiry, boolean invalidate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dns_server_list_v1_header")
    @NotUsableInJava
    public static class dns_server_list_v1_header
    extends Struct {
        public dns_payload_header hdr;
        public char source;
        public char status;
        public char nr_servers;
    }

    @Type(noCCodeGeneration=true, cType="struct dns_payload_header")
    @NotUsableInJava
    public static class dns_payload_header
    extends Struct {
        public char zero;
        public char content;
        public char version;
    }

    @Type(noCCodeGeneration=true, cType="enum dns_lookup_status")
    public static enum dns_lookup_status implements Enum<dns_lookup_status>,
    TypedEnum<dns_lookup_status, Integer>
    {
        DNS_LOOKUP_NOT_DONE,
        DNS_LOOKUP_GOOD,
        DNS_LOOKUP_GOOD_WITH_BAD,
        DNS_LOOKUP_BAD,
        DNS_LOOKUP_GOT_NOT_FOUND,
        DNS_LOOKUP_GOT_LOCAL_FAILURE,
        DNS_LOOKUP_GOT_TEMP_FAILURE,
        DNS_LOOKUP_GOT_NS_FAILURE,
        NR__dns_lookup_status;

    }

    @Type(noCCodeGeneration=true, cType="enum dns_payload_content_type")
    public static enum dns_payload_content_type implements Enum<dns_payload_content_type>,
    TypedEnum<dns_payload_content_type, Integer>
    {
        DNS_PAYLOAD_IS_SERVER_LIST;

    }

    @Type(noCCodeGeneration=true, cType="enum dns_key")
    public static enum dns_key implements Enum<dns_key>,
    TypedEnum<dns_key, Integer>
    {
        dns_key_data,
        dns_key_error;

    }
}

