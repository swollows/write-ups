/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.runtime.TrustedDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Tpm2Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_auto_startup(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tpm2_calc_ordinal_duration(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int ordinal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_do_selftest(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_find_cc(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int cc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm2_flush_context(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_get_cc_attrs_tbl(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm2_get_pcr_allocation(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_get_random(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<Character> dest, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_get_timeouts(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm2_get_tpm_pt($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static @OriginalName(value="ssize_t") long tpm2_get_tpm_pt(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int property_id, Ptr<@Unsigned Integer> value, String desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_key_decode(Ptr<TrustedDefinitions.trusted_key_payload> payload, Ptr<TrustedDefinitions.trusted_key_options> options, Ptr<Ptr<Character>> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_key_encode(Ptr<TrustedDefinitions.trusted_key_payload> payload, Ptr<TrustedDefinitions.trusted_key_options> options, Ptr<Character> src, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm2_key_parent($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int tpm2_key_parent(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm2_key_priv($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int tpm2_key_priv(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm2_key_pub($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int tpm2_key_pub(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm2_key_type($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int tpm2_key_type(Ptr<?> context2, @Unsigned long hdrlen, char tag, Ptr<?> value, @Unsigned long vlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_load_cmd(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<TrustedDefinitions.trusted_key_payload> payload, Ptr<TrustedDefinitions.trusted_key_options> options, Ptr<@Unsigned Integer> blob_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_pcr_extend(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int pcr_idx, Ptr<TpmDefinitions.tpm_digest> digests) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_pcr_read(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int pcr_idx, Ptr<TpmDefinitions.tpm_digest> digest, Ptr<@Unsigned Short> digest_size_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_probe(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_seal_trusted(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<TrustedDefinitions.trusted_key_payload> payload, Ptr<TrustedDefinitions.trusted_key_options> options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm2_shutdown(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned short shutdown_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_unseal_cmd(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<TrustedDefinitions.trusted_key_payload> payload, Ptr<TrustedDefinitions.trusted_key_options> options, @Unsigned int blob_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_unseal_trusted(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<TrustedDefinitions.trusted_key_payload> payload, Ptr<TrustedDefinitions.trusted_key_options> options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_calc_event_log_size(Ptr<?> data, int count, Ptr<?> size_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_binary_bios_measurements_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tpm2_bios_measurements_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> tpm2_bios_measurements_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm2_bios_measurements_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_commit_space(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<TpmDefinitions.tpm_space> space, Ptr<?> buf, Ptr<@Unsigned Long> bufsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm2_del_space(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<TpmDefinitions.tpm_space> space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm2_flush_space(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_init_space(Ptr<TpmDefinitions.tpm_space> space, @Unsigned int buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_load_context(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<Character> buf, Ptr<@Unsigned Integer> offset, Ptr<@Unsigned Integer> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_prepare_space(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<TpmDefinitions.tpm_space> space, Ptr<Character> cmd, @Unsigned long cmdsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm2_save_context(Ptr<TpmDefinitions.tpm_chip> chip, @Unsigned int handle, Ptr<Character> buf, @Unsigned int buf_size, Ptr<@Unsigned Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_crb_pluton")
    @NotUsableInJava
    public static class tpm2_crb_pluton
    extends Struct {
        public @Unsigned long start_addr;
        public @Unsigned long reply_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_crb_smc")
    @NotUsableInJava
    public static class tpm2_crb_smc
    extends Struct {
        public @Unsigned int interrupt;
        public char interrupt_flags;
        public char op_flags;
        public @Unsigned short reserved2;
        public @Unsigned int smc_func_id;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_auth")
    @NotUsableInJava
    public static class tpm2_auth
    extends Struct {
        public @Unsigned int handle;
        public @Unsigned int session;
        public char @Size(value=32) [] our_nonce;
        public char @Size(value=32) [] tpm_nonce;
        @InlineUnion(value=32072)
        public @InlineUnion(value=32072) char @Size(value=32) [] salt;
        @InlineUnion(value=32072)
        public @InlineUnion(value=32072) char @Size(value=32) [] scratch;
        public char @Size(value=32) [] session_key;
        public char @Size(value=32) [] passphrase;
        public int passphrase_len;
        public CryptoDefinitions.crypto_aes_ctx aes_ctx;
        public char attrs;
        public @Unsigned @OriginalName(value="__be32") int ordinal;
        public @Unsigned int @Size(value=3) [] name_h;
        public char @Size(value=198) [] name;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_permanent_handles")
    public static enum tpm2_permanent_handles implements Enum<tpm2_permanent_handles>,
    TypedEnum<tpm2_permanent_handles, Integer>
    {
        TPM2_RH_NULL,
        TPM2_RS_PW;

    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_pcr_selection")
    @NotUsableInJava
    public static class tpm2_pcr_selection
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short hash_alg;
        public char size_of_select;
        public char @Size(value=3) [] pcr_select;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_get_cap_out")
    @NotUsableInJava
    public static class tpm2_get_cap_out
    extends Struct {
        public char more_data;
        public @Unsigned @OriginalName(value="__be32") int subcap_id;
        public @Unsigned @OriginalName(value="__be32") int property_cnt;
        public @Unsigned @OriginalName(value="__be32") int property_id;
        public @Unsigned @OriginalName(value="__be32") int value;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_get_random_out")
    @NotUsableInJava
    public static class tpm2_get_random_out
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short size;
        public char @Size(value=128) [] buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_pcr_read_out")
    @NotUsableInJava
    public static class tpm2_pcr_read_out
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int update_cnt;
        public @Unsigned @OriginalName(value="__be32") int pcr_selects_cnt;
        public @Unsigned @OriginalName(value="__be16") short hash_alg;
        public char pcr_select_size;
        public char @Size(value=3) [] pcr_select;
        public @Unsigned @OriginalName(value="__be32") int digests_cnt;
        public @Unsigned @OriginalName(value="__be16") short digest_size;
        public char @Size(value=0) [] digest;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_properties")
    public static enum tpm2_properties implements Enum<tpm2_properties>,
    TypedEnum<tpm2_properties, Integer>
    {
        TPM_PT_TOTAL_COMMANDS;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_const")
    public static enum tpm2_const implements Enum<tpm2_const>,
    TypedEnum<tpm2_const, Integer>
    {
        TPM2_PLATFORM_PCR,
        TPM2_PCR_SELECT_MIN;

    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_key_context")
    @NotUsableInJava
    public static class tpm2_key_context
    extends Struct {
        public @Unsigned int parent;
        public Ptr<Character> pub;
        public @Unsigned int pub_len;
        public Ptr<Character> priv;
        public @Unsigned int priv_len;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_hash")
    @NotUsableInJava
    public static class tpm2_hash
    extends Struct {
        public @Unsigned int crypto_id;
        public @Unsigned int tpm_id;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_session_attributes")
    public static enum tpm2_session_attributes implements Enum<tpm2_session_attributes>,
    TypedEnum<tpm2_session_attributes, Integer>
    {
        TPM2_SA_CONTINUE_SESSION,
        TPM2_SA_AUDIT_EXCLUSIVE,
        TPM2_SA_AUDIT_RESET,
        TPM2_SA_DECRYPT,
        TPM2_SA_ENCRYPT,
        TPM2_SA_AUDIT;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_object_attributes")
    public static enum tpm2_object_attributes implements Enum<tpm2_object_attributes>,
    TypedEnum<tpm2_object_attributes, Integer>
    {
        TPM2_OA_FIXED_TPM,
        TPM2_OA_ST_CLEAR,
        TPM2_OA_FIXED_PARENT,
        TPM2_OA_SENSITIVE_DATA_ORIGIN,
        TPM2_OA_USER_WITH_AUTH,
        TPM2_OA_ADMIN_WITH_POLICY,
        TPM2_OA_NO_DA,
        TPM2_OA_ENCRYPTED_DUPLICATION,
        TPM2_OA_RESTRICTED,
        TPM2_OA_DECRYPT,
        TPM2_OA_SIGN;

    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_cap_handles")
    @NotUsableInJava
    public static class tpm2_cap_handles
    extends Struct {
        public char more_data;
        public @Unsigned @OriginalName(value="__be32") int capability;
        public @Unsigned @OriginalName(value="__be32") int count;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=0) [] handles;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm2_context")
    @NotUsableInJava
    public static class tpm2_context
    extends Struct {
        public @Unsigned @OriginalName(value="__be64") long sequence;
        public @Unsigned @OriginalName(value="__be32") int saved_handle;
        public @Unsigned @OriginalName(value="__be32") int hierarchy;
        public @Unsigned @OriginalName(value="__be16") short blob_size;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_handle_types")
    public static enum tpm2_handle_types implements Enum<tpm2_handle_types>,
    TypedEnum<tpm2_handle_types, Integer>
    {
        TPM2_HT_HMAC_SESSION,
        TPM2_HT_POLICY_SESSION,
        TPM2_HT_TRANSIENT;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_cc_attrs")
    public static enum tpm2_cc_attrs implements Enum<tpm2_cc_attrs>,
    TypedEnum<tpm2_cc_attrs, Integer>
    {
        TPM2_CC_ATTR_CHANDLES,
        TPM2_CC_ATTR_RHANDLE,
        TPM2_CC_ATTR_VENDOR;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_capabilities")
    public static enum tpm2_capabilities implements Enum<tpm2_capabilities>,
    TypedEnum<tpm2_capabilities, Integer>
    {
        TPM2_CAP_HANDLES,
        TPM2_CAP_COMMANDS,
        TPM2_CAP_PCRS,
        TPM2_CAP_TPM_PROPERTIES;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_structures")
    public static enum tpm2_structures implements Enum<tpm2_structures>,
    TypedEnum<tpm2_structures, Integer>
    {
        TPM2_ST_NO_SESSIONS,
        TPM2_ST_SESSIONS,
        TPM2_ST_CREATION;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_startup_types")
    public static enum tpm2_startup_types implements Enum<tpm2_startup_types>,
    TypedEnum<tpm2_startup_types, Integer>
    {
        TPM2_SU_CLEAR,
        TPM2_SU_STATE;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_command_codes")
    public static enum tpm2_command_codes implements Enum<tpm2_command_codes>,
    TypedEnum<tpm2_command_codes, Integer>
    {
        TPM2_CC_FIRST,
        TPM2_CC_HIERARCHY_CONTROL,
        TPM2_CC_HIERARCHY_CHANGE_AUTH,
        TPM2_CC_CREATE_PRIMARY,
        TPM2_CC_SEQUENCE_COMPLETE,
        TPM2_CC_SELF_TEST,
        TPM2_CC_STARTUP,
        TPM2_CC_SHUTDOWN,
        TPM2_CC_NV_READ,
        TPM2_CC_CREATE,
        TPM2_CC_LOAD,
        TPM2_CC_SEQUENCE_UPDATE,
        TPM2_CC_UNSEAL,
        TPM2_CC_CONTEXT_LOAD,
        TPM2_CC_CONTEXT_SAVE,
        TPM2_CC_FLUSH_CONTEXT,
        TPM2_CC_READ_PUBLIC,
        TPM2_CC_START_AUTH_SESS,
        TPM2_CC_VERIFY_SIGNATURE,
        TPM2_CC_GET_CAPABILITY,
        TPM2_CC_GET_RANDOM,
        TPM2_CC_PCR_READ,
        TPM2_CC_PCR_EXTEND,
        TPM2_CC_EVENT_SEQUENCE_COMPLETE,
        TPM2_CC_HASH_SEQUENCE_START,
        TPM2_CC_CREATE_LOADED,
        TPM2_CC_LAST;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_return_codes")
    public static enum tpm2_return_codes implements Enum<tpm2_return_codes>,
    TypedEnum<tpm2_return_codes, Integer>
    {
        TPM2_RC_SUCCESS,
        TPM2_RC_HASH,
        TPM2_RC_HANDLE,
        TPM2_RC_INTEGRITY,
        TPM2_RC_INITIALIZE,
        TPM2_RC_FAILURE,
        TPM2_RC_DISABLED,
        TPM2_RC_UPGRADE,
        TPM2_RC_COMMAND_CODE,
        TPM2_RC_TESTING,
        TPM2_RC_REFERENCE_H0,
        TPM2_RC_RETRY;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm2_timeouts")
    public static enum tpm2_timeouts implements Enum<tpm2_timeouts>,
    TypedEnum<tpm2_timeouts, Integer>
    {
        TPM2_TIMEOUT_A,
        TPM2_TIMEOUT_B,
        TPM2_TIMEOUT_C,
        TPM2_TIMEOUT_D,
        TPM2_DURATION_SHORT,
        TPM2_DURATION_MEDIUM,
        TPM2_DURATION_LONG,
        TPM2_DURATION_LONG_LONG,
        TPM2_DURATION_DEFAULT;

    }
}

