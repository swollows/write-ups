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
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.EvmDefinitions;
import me.bechberger.ebpf.runtime.HashDefinitions;
import me.bechberger.ebpf.runtime.IntegrityDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PolicyDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ImaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_add_kexec_buffer(Ptr<runtime.kimage> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_add_violation($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, (const u8*)$arg5)")
    public static void ima_add_violation(Ptr<runtime.file> file2, String filename2, Ptr<ima_iint_cache> iint, String op, String cause) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_alloc_init_template(Ptr<ima_event_data> event_data, Ptr<Ptr<ima_template_entry>> entry, Ptr<ima_template_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_ascii_measurements_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_ascii_measurements_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_audit_measurement($arg1, (const u8*)$arg2)")
    public static void ima_audit_measurement(Ptr<ima_iint_cache> iint, String filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_collect_measurement(Ptr<ima_iint_cache> iint, Ptr<runtime.file> file2, Ptr<?> buf, @OriginalName(value="loff_t") long size, HashDefinitions.hash_algo algo, Ptr<runtime.modsig> modsig2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)ima_d_path((const struct path*)$arg1, $arg2, $arg3))")
    public static String ima_d_path(Ptr<runtime.path> path2, Ptr<String> pathbuf, String namebuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_dump_measurement_list(Ptr<@Unsigned Long> buffer_size, Ptr<Ptr<?>> buffer, @Unsigned long segment_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventbuf_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventdigest_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_eventdigest_init_common((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ima_eventdigest_init_common(Ptr<Character> digest, @Unsigned int digestsize, char digest_type2, char hash_algo2, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventdigest_modsig_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventdigest_ng_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventdigest_ngv2_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventevmsig_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventinodegid_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventinodemode_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventinodeuid_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventinodexattrlengths_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventinodexattrnames_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventinodexattrs_init_common(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventinodexattrvalues_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventmodsig_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventname_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventname_init_common(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data, boolean size_limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventname_ng_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_eventsig_init(Ptr<ima_event_data> event_data, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_free_template_entry(Ptr<ima_template_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_fs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_get_action($arg1, $arg2, (const struct cred*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, (const u8*)$arg9, $arg10)")
    public static int ima_get_action(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.cred> cred2, @Unsigned int secid, int mask, ima_hooks func, Ptr<Integer> pcr, Ptr<Ptr<ima_template_desc>> template_desc, String func_data, Ptr<@Unsigned Integer> allowed_algos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_load_kexec_buffer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ima_measurements_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_measurements_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_measurements_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ima_measurements_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_measurements_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_open_policy(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_parse_buf(Ptr<?> bufstartp, Ptr<?> bufendp, Ptr<Ptr<?>> bufcurp, int maxfields, Ptr<ima_field_data> fields, Ptr<Integer> curfields, Ptr<@Unsigned Long> len_mask, int enforce_mask, String bufname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_print_digest(Ptr<SeqDefinitions.seq_file> m, Ptr<Character> digest, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_putc(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data, int datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ima_read_policy(String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_release_policy(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ima_show_htable_violations(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ima_show_measurements_count(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_show_template_buf(Ptr<SeqDefinitions.seq_file> m, ima_show_type show, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_show_template_digest(Ptr<SeqDefinitions.seq_file> m, ima_show_type show, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_show_template_digest_ng(Ptr<SeqDefinitions.seq_file> m, ima_show_type show, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_show_template_digest_ngv2(Ptr<SeqDefinitions.seq_file> m, ima_show_type show, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_show_template_field_data(Ptr<SeqDefinitions.seq_file> m, ima_show_type show, DataDefinitions.data_formats datafmt, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_show_template_sig(Ptr<SeqDefinitions.seq_file> m, ima_show_type show, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_show_template_string(Ptr<SeqDefinitions.seq_file> m, ima_show_type show, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_show_template_uint(Ptr<SeqDefinitions.seq_file> m, ima_show_type show, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_store_measurement($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, (const struct modsig*)$arg6, $arg7, $arg8)")
    public static void ima_store_measurement(Ptr<ima_iint_cache> iint, Ptr<runtime.file> file2, String filename2, Ptr<EvmDefinitions.evm_ima_xattr_data> xattr_value, int xattr_len, Ptr<runtime.modsig> modsig2, int pcr, Ptr<ima_template_desc> template_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_store_template($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int ima_store_template(Ptr<ima_template_entry> entry, int violation, Ptr<runtime.inode> inode2, String filename2, int pcr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_write_policy($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ima_write_policy(Ptr<runtime.file> file2, String buf, @Unsigned long datalen, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_write_template_field_data((const void*)$arg1, (const unsigned int)$arg2, $arg3, $arg4)")
    public static int ima_write_template_field_data(Ptr<?> data, @Unsigned int datalen, DataDefinitions.data_formats datafmt, Ptr<ima_field_data> field_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_add_boot_aggregate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_alloc_rule_opt_list((const struct {\n  u8 *from;\n  u8 *to;\n}*)$arg1)")
    public static Ptr<ima_rule_opt_list> ima_alloc_rule_opt_list(Ptr<misc.substring_t> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ima_appraise_signature(KernelDefinitions.kernel_read_file_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_check_policy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_delete_rules() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_free_rule(Ptr<ima_rule_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_init_arch_policy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_init_policy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_log_string_op(Ptr<AuditDefinitions.audit_buffer> ab, String key2, String value, PolicyDefinitions.policy_opt rule_operator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ima_rule_entry> ima_lsm_copy_rule(Ptr<ima_rule_entry> entry, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_lsm_policy_change(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> lsm_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_lsm_rule_init(Ptr<ima_rule_entry> entry, Ptr<misc.substring_t> args, int lsm_rule, int audit_type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_match_policy($arg1, $arg2, (const struct cred*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, (const u8*)$arg10, $arg11)")
    public static int ima_match_policy(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.cred> cred2, @Unsigned int secid, ima_hooks func, int mask, int flags, Ptr<Integer> pcr, Ptr<Ptr<ima_template_desc>> template_desc, String func_data, Ptr<@Unsigned Integer> allowed_algos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_match_rules($arg1, $arg2, $arg3, (const struct cred*)$arg4, $arg5, $arg6, $arg7, (const u8*)$arg8)")
    public static boolean ima_match_rules(Ptr<ima_rule_entry> rule, Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, Ptr<runtime.cred> cred2, @Unsigned int secid, ima_hooks func, int mask, String func_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ima_parse_add_rule(String rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_parse_rule(String rule, Ptr<ima_rule_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_post_key_create_or_update($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static void ima_post_key_create_or_update(Ptr<runtime.key> keyring, Ptr<runtime.key> key2, Ptr<?> payload, @Unsigned long payload_len, @Unsigned long flags, boolean create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_update_policy() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_update_policy_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ima_validate_rule(Ptr<ima_rule_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_add_digest_entry(Ptr<ima_template_entry> entry, boolean update_htable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_add_template_entry($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5)")
    public static int ima_add_template_entry(Ptr<ima_template_entry> entry, int violation, String op, Ptr<runtime.inode> inode2, String filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CryptoDefinitions.crypto_ahash> ima_alloc_atfm(HashDefinitions.hash_algo algo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ima_alloc_pages(@OriginalName(value="loff_t") long max_size, Ptr<@Unsigned Long> allocated_size, int last_warn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CryptoDefinitions.crypto_shash> ima_alloc_tfm(HashDefinitions.hash_algo algo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_appraise_measurement($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6, (const struct modsig*)$arg7)")
    public static int ima_appraise_measurement(ima_hooks func, Ptr<ima_iint_cache> iint, Ptr<runtime.file> file2, String filename2, Ptr<EvmDefinitions.evm_ima_xattr_data> xattr_value, int xattr_len, Ptr<runtime.modsig> modsig2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_appraise_parse_cmdline() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_calc_boot_aggregate(Ptr<ima_digest_data> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_calc_boot_aggregate_tfm(String digest, @Unsigned short alg_id, Ptr<CryptoDefinitions.crypto_shash> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_calc_buffer_hash((const void*)$arg1, $arg2, $arg3)")
    public static int ima_calc_buffer_hash(Ptr<?> buf, @OriginalName(value="loff_t") long len, Ptr<ima_digest_data> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_calc_field_array_hash(Ptr<ima_field_data> field_data, Ptr<ima_template_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_calc_field_array_hash_tfm(Ptr<ima_field_data> field_data, Ptr<ima_template_entry> entry, int tfm_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_calc_file_hash(Ptr<runtime.file> file2, Ptr<ima_digest_data> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_calc_file_hash_atfm(Ptr<runtime.file> file2, Ptr<ima_digest_data> hash2, Ptr<CryptoDefinitions.crypto_ahash> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_calc_file_hash_tfm(Ptr<runtime.file> file2, Ptr<ima_digest_data> hash2, Ptr<CryptoDefinitions.crypto_shash> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_check_blacklist($arg1, (const struct modsig*)$arg2, $arg3)")
    public static int ima_check_blacklist(Ptr<ima_iint_cache> iint, Ptr<runtime.modsig> modsig2, int pcr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_fix_xattr(Ptr<runtime.dentry> dentry2, Ptr<ima_iint_cache> iint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_free_pages(Ptr<?> ptr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_free_tfm(Ptr<CryptoDefinitions.crypto_shash> tfm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ima_get_binary_runtime_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static IntegrityDefinitions.integrity_status ima_get_cache_status(Ptr<ima_iint_cache> iint, ima_hooks func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_get_hash_algo((const struct evm_ima_xattr_data*)$arg1, $arg2)")
    public static HashDefinitions.hash_algo ima_get_hash_algo(Ptr<EvmDefinitions.evm_ima_xattr_data> xattr_value, int xattr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ima_iint_cache> ima_iint_find(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_iint_init_once(Ptr<?> foo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_iintcache_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_init_crypto() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_init_digests() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_inode_free_rcu(Ptr<?> inode_security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ima_iint_cache> ima_inode_get(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_inode_post_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, int ia_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_inode_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int ima_inode_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_inode_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int ima_inode_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String xattr_name2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_inode_set_acl($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int ima_inode_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_inode_setxattr($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int ima_inode_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String xattr_name2, Ptr<?> xattr_value, @Unsigned long xattr_value_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_must_appraise(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, int mask, ima_hooks func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_read_xattr(Ptr<runtime.dentry> dentry2, Ptr<Ptr<EvmDefinitions.evm_ima_xattr_data>> xattr_value, int xattr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_reset_appraise_flags(Ptr<runtime.inode> inode2, int digsig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_restore_measurement_entry(Ptr<ima_template_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_update_xattr(Ptr<ima_iint_cache> iint, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ima_inode_hash(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2, String buf, @Unsigned long buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_bprm_check(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_check_last_writer(Ptr<ima_iint_cache> iint, Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_collect_modsig($arg1, (const void*)$arg2, $arg3)")
    public static void ima_collect_modsig(Ptr<runtime.modsig> modsig2, Ptr<?> buf, @OriginalName(value="loff_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_file_check(Ptr<runtime.file> file2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_file_free(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_file_hash(Ptr<runtime.file> file2, String buf, @Unsigned long buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_file_mmap(Ptr<runtime.file> file2, @Unsigned long reqprot, @Unsigned long prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_file_mprotect(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long reqprot, @Unsigned long prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_free_kexec_buffer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_free_modsig(Ptr<runtime.modsig> modsig2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HashDefinitions.hash_algo ima_get_current_hash_algo() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_get_kexec_buffer(Ptr<Ptr<?>> addr2, Ptr<@Unsigned Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_get_modsig_digest((const struct modsig*)$arg1, $arg2, (const u8**)$arg3, $arg4)")
    public static int ima_get_modsig_digest(Ptr<runtime.modsig> modsig2, Ptr<HashDefinitions.hash_algo> algo, Ptr<Ptr<Character>> digest, Ptr<@Unsigned Integer> digest_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_get_raw_modsig((const struct modsig*)$arg1, (const void**)$arg2, $arg3)")
    public static int ima_get_raw_modsig(Ptr<runtime.modsig> modsig2, Ptr<Ptr<?>> data, Ptr<@Unsigned Integer> data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_init_key_queue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_init_template() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_init_template_list() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_inode_hash(Ptr<runtime.inode> inode2, String buf, @Unsigned long buf_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_kernel_module_request(String kmod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_kexec_cmdline($arg1, (const void*)$arg2, $arg3)")
    public static void ima_kexec_cmdline(int kernel_fd, Ptr<?> buf, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_keys_handler(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_load_data(KernelDefinitions.kernel_load_data_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_measure_critical_data((const u8*)$arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int ima_measure_critical_data(String event_label, String event_name, Ptr<?> buf, @Unsigned long buf_len, boolean hash2, Ptr<Character> digest, @Unsigned long digest_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_modsig_verify($arg1, (const struct modsig*)$arg2)")
    public static int ima_modsig_verify(Ptr<runtime.key> keyring, Ptr<runtime.modsig> modsig2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_post_create_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_post_load_data(String buf, @OriginalName(value="loff_t") long size, KernelDefinitions.kernel_load_data_id load_id, String description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_post_path_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_post_read_file(Ptr<runtime.file> file2, String buf, @OriginalName(value="loff_t") long size, KernelDefinitions.kernel_read_file_id read_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ima_process_queued_keys() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_queue_key($arg1, (const void*)$arg2, $arg3)")
    public static boolean ima_queue_key(Ptr<runtime.key> keyring, Ptr<?> payload, @Unsigned long payload_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_read_file(Ptr<runtime.file> file2, KernelDefinitions.kernel_read_file_id read_id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_read_modsig($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int ima_read_modsig(ima_hooks func, Ptr<?> buf, @OriginalName(value="loff_t") long buf_len, Ptr<Ptr<runtime.modsig>> modsig2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_restore_measurement_list(@OriginalName(value="loff_t") long size, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_restore_template_data(Ptr<ima_template_desc> template_desc, Ptr<?> template_data, int template_data_size, Ptr<Ptr<ima_template_entry>> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ima_should_queue_key() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ima_template_desc> ima_template_desc_buf() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ima_template_desc> ima_template_desc_current() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_template_fmt_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ima_template_has_modsig((const struct ima_template_desc*)$arg1)")
    public static boolean ima_template_has_modsig(Ptr<ima_template_desc> ima_template) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ima_template_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { void *rule; u8 *args_p; int type; }")
    @NotUsableInJava
    public static class AnonymousType496425074C50
    extends Struct {
        public Ptr<?> rule;
        public String args_p;
        public int type;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_file_id")
    @NotUsableInJava
    public static class ima_file_id
    extends Struct {
        public char hash_type;
        public char hash_algorithm;
        public char @Size(value=64) [] hash;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_rule_entry")
    @NotUsableInJava
    public static class ima_rule_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public int action;
        public @Unsigned int flags;
        public ima_hooks func;
        public int mask;
        public @Unsigned long fsmagic;
        public misc.uuid_t fsuuid;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public misc.kuid_t fowner;
        public misc.kgid_t fgroup;
        public Ptr<?> uid_op;
        public Ptr<?> gid_op;
        public Ptr<?> fowner_op;
        public Ptr<?> fgroup_op;
        public int pcr;
        public @Unsigned int allowed_algos;
        public AnonymousType496425074C50 @Size(value=6) [] lsm;
        public String fsname;
        public Ptr<ima_rule_opt_list> keyrings;
        public Ptr<ima_rule_opt_list> label;
        public Ptr<ima_template_desc> template;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_rule_opt_list")
    @NotUsableInJava
    public static class ima_rule_opt_list
    extends Struct {
        public @Unsigned long count;
        public String @Size(value=0) [] items;
    }

    @Type(noCCodeGeneration=true, cType="enum ima_fs_flags")
    public static enum ima_fs_flags implements Enum<ima_fs_flags>,
    TypedEnum<ima_fs_flags, Integer>
    {
        IMA_FS_BUSY;

    }

    @Type(noCCodeGeneration=true, cType="struct ima_h_table")
    @NotUsableInJava
    public static class ima_h_table
    extends Struct {
        public @OriginalName(value="atomic_long_t") misc.atomic64_t len;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t violations;
        public misc.hlist_head @Size(value=1024) [] queue;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_queue_entry")
    @NotUsableInJava
    public static class ima_queue_entry
    extends Struct {
        public misc.hlist_node hnext;
        public ListDefinitions.list_head later;
        public Ptr<ima_template_entry> entry;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_algo_desc")
    @NotUsableInJava
    public static class ima_algo_desc
    extends Struct {
        public Ptr<CryptoDefinitions.crypto_shash> tfm;
        public HashDefinitions.hash_algo algo;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_key_entry")
    @NotUsableInJava
    public static class ima_key_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> payload;
        public @Unsigned long payload_len;
        public String keyring_name;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_kexec_hdr")
    @NotUsableInJava
    public static class ima_kexec_hdr
    extends Struct {
        public @Unsigned short version;
        public @Unsigned short _reserved0;
        public @Unsigned int _reserved1;
        public @Unsigned long buffer_size;
        public @Unsigned long count;
    }

    @Type(noCCodeGeneration=true, cType="enum ima_hooks")
    public static enum ima_hooks implements Enum<ima_hooks>,
    TypedEnum<ima_hooks, Integer>
    {
        NONE,
        FILE_CHECK,
        MMAP_CHECK,
        MMAP_CHECK_REQPROT,
        BPRM_CHECK,
        CREDS_CHECK,
        POST_SETATTR,
        MODULE_CHECK,
        FIRMWARE_CHECK,
        KEXEC_KERNEL_CHECK,
        KEXEC_INITRAMFS_CHECK,
        POLICY_CHECK,
        KEXEC_CMDLINE,
        KEY_CHECK,
        CRITICAL_DATA,
        SETXATTR_CHECK,
        MAX_CHECK;

    }

    @Type(noCCodeGeneration=true, cType="struct ima_template_entry")
    @NotUsableInJava
    public static class ima_template_entry
    extends Struct {
        public int pcr;
        public Ptr<TpmDefinitions.tpm_digest> digests;
        public Ptr<ima_template_desc> template_desc;
        public @Unsigned int template_data_len;
        public ima_field_data @Size(value=0) [] template_data;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_template_desc")
    @NotUsableInJava
    public static class ima_template_desc
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public String fmt;
        public int num_fields;
        public Ptr<Ptr<ima_template_field>> fields;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_template_field")
    @NotUsableInJava
    public static class ima_template_field
    extends Struct {
        public char @Size(value=16) [] field_id;
        public Ptr<?> field_init;
        public Ptr<?> field_show;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_field_data")
    @NotUsableInJava
    public static class ima_field_data
    extends Struct {
        public Ptr<Character> data;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_iint_cache")
    @NotUsableInJava
    public static class ima_iint_cache
    extends Struct {
        public runtime.mutex mutex;
        public IntegrityDefinitions.integrity_inode_attributes real_inode;
        public @Unsigned long flags;
        public @Unsigned long measured_pcrs;
        public @Unsigned long atomic_flags;
        public IntegrityDefinitions.integrity_status ima_file_status;
        public IntegrityDefinitions.integrity_status ima_mmap_status;
        public IntegrityDefinitions.integrity_status ima_bprm_status;
        public IntegrityDefinitions.integrity_status ima_read_status;
        public IntegrityDefinitions.integrity_status ima_creds_status;
        public Ptr<ima_digest_data> ima_hash;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_event_data")
    @NotUsableInJava
    public static class ima_event_data
    extends Struct {
        public Ptr<ima_iint_cache> iint;
        public Ptr<runtime.file> file;
        public String filename;
        public Ptr<EvmDefinitions.evm_ima_xattr_data> xattr_value;
        public int xattr_len;
        public Ptr<runtime.modsig> modsig;
        public String violation;
        public Ptr<?> buf;
        public int buf_len;
    }

    @Type(noCCodeGeneration=true, cType="enum ima_show_type")
    public static enum ima_show_type implements Enum<ima_show_type>,
    TypedEnum<ima_show_type, Integer>
    {
        IMA_SHOW_BINARY,
        IMA_SHOW_BINARY_NO_FIELD_LEN,
        IMA_SHOW_BINARY_OLD_STRING_FMT,
        IMA_SHOW_ASCII;

    }

    @Type(noCCodeGeneration=true, cType="struct ima_max_digest_data")
    @NotUsableInJava
    public static class ima_max_digest_data
    extends Struct {
        public ima_digest_data_hdr hdr;
        public char @Size(value=64) [] digest;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_digest_data")
    @NotUsableInJava
    public static class ima_digest_data
    extends Struct {
        @InlineUnion(value=13624)
        public  @InlineUnion(value=13624) AnonDefinitions.anon_member_of_anon_member_of_ima_digest_data anon0$0;
        @InlineUnion(value=13624)
        public @InlineUnion(value=13624) ima_digest_data_hdr hdr;
        public char @Size(value=0) [] digest;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_digest_data_hdr")
    @NotUsableInJava
    public static class ima_digest_data_hdr
    extends Struct {
        public char algo;
        public char length;
        public XattrDefinitions.xattr_of_anon_member_of_anon_member_of_ima_digest_data_and_xattr_of_ima_digest_data_hdr xattr;
    }

    @Type(noCCodeGeneration=true, cType="struct ima_setup_data")
    @NotUsableInJava
    public static class ima_setup_data
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned long size;
    }
}

