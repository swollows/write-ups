/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.ApparmorDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LabelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PathDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class AaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_bind_mount((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, (const u8*)$arg4, $arg5)")
    public static int aa_bind_mount(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.path> path2, String dev_name, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_change_hat((const u8**)$arg1, $arg2, $arg3, $arg4)")
    public static int aa_change_hat(Ptr<String> hats, int count, @Unsigned long token, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_change_profile((const u8*)$arg1, $arg2)")
    public static int aa_change_profile(String fqname, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_dfa_free_kref(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_dfa_leftmatch($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @Unsigned int aa_dfa_leftmatch(Ptr<aa_dfa> dfa, @Unsigned int start, String str, Ptr<@Unsigned Integer> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_dfa_match($arg1, $arg2, (const u8*)$arg3)")
    public static @Unsigned int aa_dfa_match(Ptr<aa_dfa> dfa, @Unsigned int start, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_dfa_match_len($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @Unsigned int aa_dfa_match_len(Ptr<aa_dfa> dfa, @Unsigned int start, String str, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_dfa_match_until($arg1, $arg2, (const u8*)$arg3, (const u8**)$arg4)")
    public static @Unsigned int aa_dfa_match_until(Ptr<aa_dfa> dfa, @Unsigned int start, String str, Ptr<String> retpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_dfa_matchn_until($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8**)$arg5)")
    public static @Unsigned int aa_dfa_matchn_until(Ptr<aa_dfa> dfa, @Unsigned int start, String str, int n, Ptr<String> retpos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_dfa_next($arg1, $arg2, (const u8)$arg3)")
    public static @Unsigned int aa_dfa_next(Ptr<aa_dfa> dfa, @Unsigned int state2, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int aa_dfa_outofband_transition(Ptr<aa_dfa> dfa, @Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_dfa> aa_dfa_unpack(Ptr<?> blob, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String aa_get_buffer(boolean in_atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_profile> aa_get_newest_profile(Ptr<aa_profile> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_profile> aa_get_profile(Ptr<aa_profile> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_label> aa_get_task_label(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_may_ptrace((const struct cred*)$arg1, $arg2, (const struct cred*)$arg3, $arg4, $arg5)")
    public static int aa_may_ptrace(Ptr<runtime.cred> tracer_cred, Ptr<aa_label> tracer2, Ptr<runtime.cred> tracee_cred, Ptr<aa_label> tracee, @Unsigned int request2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_mount_change_type((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, $arg4)")
    public static int aa_mount_change_type(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.path> path2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_move_mount((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, (const struct path*)$arg4)")
    public static int aa_move_mount(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.path> from_path, Ptr<runtime.path> to_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_move_mount_old((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, (const u8*)$arg4)")
    public static int aa_move_mount_old(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.path> path2, String orig_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_new_mount((const struct cred*)$arg1, $arg2, (const u8*)$arg3, (const struct path*)$arg4, (const u8*)$arg5, $arg6, $arg7)")
    public static int aa_new_mount(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, String dev_name, Ptr<runtime.path> path2, String type2, @Unsigned long flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_pivotroot((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, (const struct path*)$arg4)")
    public static int aa_pivotroot(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.path> old_path, Ptr<runtime.path> new_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_profile_ns_perm(Ptr<aa_profile> profile, Ptr<ApparmorDefinitions.apparmor_audit_data> ad, @Unsigned int request2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_put_buffer(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_put_dfa(Ptr<aa_dfa> dfa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_put_pdb(Ptr<aa_policydb> pdb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_remount((const struct cred*)$arg1, $arg2, (const struct path*)$arg3, $arg4, $arg5)")
    public static int aa_remount(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.path> path2, @Unsigned long flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_replace_current_label(Ptr<aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_restore_previous_label(@Unsigned long token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_set_current_hat(Ptr<aa_label> label, @Unsigned long token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_set_current_onexec(Ptr<aa_label> label, boolean stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_umount((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int aa_umount(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.vfsmount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_profile> __aa_label_next_not_in_set(Ptr<LabelDefinitions.label_it> I, Ptr<aa_label> set, Ptr<aa_label> sub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aa_labelset_update_subtree(Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aa_proxy_redirect(Ptr<aa_label> orig, Ptr<aa_label> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_proxy> aa_alloc_proxy(Ptr<aa_label> label, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_alloc_secid(Ptr<aa_label> label, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_apply_modes_to_perms(Ptr<aa_profile> profile, Ptr<aa_perms> perms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_audit($arg1, $arg2, $arg3, (void (*)(struct audit_buffer*, void*))$arg4)")
    public static int aa_audit(int type2, Ptr<aa_profile> profile, Ptr<ApparmorDefinitions.apparmor_audit_data> ad, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_audit_msg($arg1, $arg2, (void (*)(struct audit_buffer*, void*))$arg3)")
    public static void aa_audit_msg(int type2, Ptr<ApparmorDefinitions.apparmor_audit_data> ad, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_audit_perm_mask($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8**)$arg5, $arg6)")
    public static void aa_audit_perm_mask(Ptr<AuditDefinitions.audit_buffer> ab, @Unsigned int mask, String chrs, @Unsigned int chrsmask, Ptr<String> names, @Unsigned int namesmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_audit_perm_names($arg1, (const u8**)$arg2, $arg3)")
    public static void aa_audit_perm_names(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<String> names, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_audit_perms_cb(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_audit_rule_free(Ptr<?> vrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_audit_rule_init(@Unsigned int field, @Unsigned int op, String rulestr, Ptr<Ptr<?>> vrule, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_audit_rule_known(Ptr<AuditDefinitions.audit_krule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_audit_rule_match(@Unsigned int sid, @Unsigned int field, @Unsigned int op, Ptr<?> vrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_check_perms($arg1, $arg2, $arg3, $arg4, (void (*)(struct audit_buffer*, void*))$arg5)")
    public static int aa_check_perms(Ptr<aa_profile> profile, Ptr<aa_perms> perms, @Unsigned int request2, Ptr<ApparmorDefinitions.apparmor_audit_data> ad, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_free_secid(@Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_free_str_table(Ptr<aa_str_table> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_ns> aa_get_current_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_getprocattr(Ptr<aa_label> label, Ptr<String> string, boolean newline) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_info_message((const u8*)$arg1)")
    public static void aa_info_message(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_label_acntsxprint(Ptr<String> strp, Ptr<aa_ns> ns, Ptr<aa_label> label, int flags, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_label> aa_label_alloc(int size, Ptr<aa_proxy> proxy, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_label_asxprint(Ptr<String> strp, Ptr<aa_ns> ns, Ptr<aa_label> label, int flags, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_audit(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<aa_label> label, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_destroy(Ptr<aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_label> aa_label_find(Ptr<aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_label> aa_label_find_merge(Ptr<aa_label> a, Ptr<aa_label> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_free(Ptr<aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_label_init(Ptr<aa_label> label, int size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_label> aa_label_insert(Ptr<aa_labelset> ls, Ptr<aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_label_is_subset(Ptr<aa_label> set, Ptr<aa_label> sub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_label_is_unconfined_subset(Ptr<aa_label> set, Ptr<aa_label> sub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_kref(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_label_match(Ptr<aa_profile> profile, Ptr<aa_ruleset> rules, Ptr<aa_label> label, @Unsigned int state2, boolean subns, @Unsigned int request2, Ptr<aa_perms> perms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_label> aa_label_merge(Ptr<aa_label> a, Ptr<aa_label> b, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_label_next_confined(Ptr<aa_label> label, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_profile> aa_label_next_in_merge(Ptr<LabelDefinitions.label_it> I, Ptr<aa_label> a, Ptr<aa_label> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_label_parse($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<aa_label> aa_label_parse(Ptr<aa_label> base, String str, @Unsigned @OriginalName(value="gfp_t") int gfp, boolean create, boolean force_stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_printk(Ptr<aa_label> label, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_label_remove(Ptr<aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_label_replace(Ptr<aa_label> old, Ptr<aa_label> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_seq_print(Ptr<SeqDefinitions.seq_file> f, Ptr<aa_label> label, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_seq_xprint(Ptr<SeqDefinitions.seq_file> f, Ptr<aa_ns> ns, Ptr<aa_label> label, int flags, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_label_snxprint(String str, @Unsigned long size, Ptr<aa_ns> ns, Ptr<aa_label> label, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_label_strn_parse($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<aa_label> aa_label_strn_parse(Ptr<aa_label> base, String str, @Unsigned long n, @Unsigned @OriginalName(value="gfp_t") int gfp, boolean create, boolean force_stack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_xaudit(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<aa_ns> ns, Ptr<aa_label> label, int flags, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_label_xprintk(Ptr<aa_ns> ns, Ptr<aa_label> label, int flags, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_labelset_destroy(Ptr<aa_labelset> ls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_labelset_init(Ptr<aa_labelset> ls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_perm_mask_to_str($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static void aa_perm_mask_to_str(String str, @Unsigned long str_size, String chrs, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_policy_destroy(Ptr<aa_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_policy_init($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static boolean aa_policy_init(Ptr<aa_policy> policy, String prefix, String name, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_profile_label_perm(Ptr<aa_profile> profile, Ptr<aa_profile> target, @Unsigned int request2, int type2, Ptr<@Unsigned Integer> deny, Ptr<ApparmorDefinitions.apparmor_audit_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_profile_match_label(Ptr<aa_profile> profile, Ptr<aa_ruleset> rules, Ptr<aa_label> label, int type2, @Unsigned int request2, Ptr<aa_perms> perms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_proxy_kref(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_put_ns(Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_label> aa_secid_to_label(@Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_secid_update(@Unsigned int secid, Ptr<aa_label> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_setprocattr_changehat(String args, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String aa_split_fqname(String fqname, Ptr<String> ns_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)aa_splitn_fqname((const u8*)$arg1, $arg2, (const u8**)$arg3, $arg4))")
    public static String aa_splitn_fqname(String fqname, @Unsigned long n, Ptr<String> ns_name, Ptr<@Unsigned Long> ns_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String aa_str_alloc(int size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_str_kref(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_update_label_name(Ptr<aa_ns> ns, Ptr<aa_label> label, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_label> aa_vec_find_or_create_label(Ptr<Ptr<aa_profile>> vec, int len, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_vec_unique(Ptr<Ptr<aa_profile>> vec, int n, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aa_bump_ns_revision(Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__aa_create_ns($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<aa_ns> __aa_create_ns(Ptr<aa_ns> parent, String name, Ptr<runtime.dentry> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__aa_find_or_create_ns($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<aa_ns> __aa_find_or_create_ns(Ptr<aa_ns> parent, String name, Ptr<runtime.dentry> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __aa_fs_create_rawdata(Ptr<aa_ns> ns, Ptr<aa_loaddata> rawdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aa_fs_remove_rawdata(Ptr<aa_loaddata> rawdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__aa_lookupn_ns($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<aa_ns> __aa_lookupn_ns(Ptr<aa_ns> view, String hname, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aa_profile_list_release(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aa_remove_ns(Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aa_transition_rlimits(Ptr<aa_label> old_l, Ptr<aa_label> new_l) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_alloc_null($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<aa_profile> aa_alloc_null(Ptr<aa_profile> parent, String name, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_policydb> aa_alloc_pdb(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_alloc_profile((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<aa_profile> aa_alloc_profile(String hname, Ptr<aa_proxy> proxy, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_alloc_root_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_ruleset> aa_alloc_ruleset(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String aa_calc_hash(Ptr<?> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_calc_profile_hash(Ptr<aa_profile> profile, @Unsigned int version, Ptr<?> start, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_compat_map_file(Ptr<aa_policydb> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_compat_map_policy(Ptr<aa_policydb> policy, @Unsigned int version) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_compat_map_xmatch(Ptr<aa_policydb> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_create_aafs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_current_policy_admin_capable(Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_current_policy_view_capable(Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_destroy_aafs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_find_child($arg1, (const u8*)$arg2)")
    public static Ptr<aa_profile> aa_find_child(Ptr<aa_profile> parent, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_fqlookupn_profile($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<aa_profile> aa_fqlookupn_profile(Ptr<aa_label> base, String fqname, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_free_data(Ptr<?> ptr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_free_ns(Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_free_profile(Ptr<aa_profile> profile) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_free_root_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_policydb> aa_get_pdb(Ptr<aa_policydb> pdb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int aa_hash_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_lookup_profile($arg1, (const u8*)$arg2)")
    public static Ptr<aa_profile> aa_lookup_profile(Ptr<aa_ns> ns, String hname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_lookupn_ns($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<aa_ns> aa_lookupn_ns(Ptr<aa_ns> view, String name, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_lookupn_profile($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<aa_profile> aa_lookupn_profile(Ptr<aa_ns> ns, String hname, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_map_resource(int resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_may_manage_policy((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int aa_may_manage_policy(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<aa_ns> ns, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_may_signal((const struct cred*)$arg1, $arg2, (const struct cred*)$arg3, $arg4, $arg5)")
    public static int aa_may_signal(Ptr<runtime.cred> subj_cred, Ptr<aa_label> sender, Ptr<runtime.cred> target_cred, Ptr<aa_label> target, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_new_learning_profile($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<aa_profile> aa_new_learning_profile(Ptr<aa_profile> parent, boolean hat, String base, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)aa_ns_name($arg1, $arg2, $arg3))")
    public static String aa_ns_name(Ptr<aa_ns> curr, Ptr<aa_ns> view, boolean subns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_ns_visible(Ptr<aa_ns> curr, Ptr<aa_ns> view, boolean subns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_pdb_free_kref(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_policy_admin_capable((const struct cred*)$arg1, $arg2, $arg3)")
    public static boolean aa_policy_admin_capable(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_policy_view_capable((const struct cred*)$arg1, $arg2, $arg3)")
    public static boolean aa_policy_view_capable(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_prepare_ns($arg1, (const u8*)$arg2)")
    public static Ptr<aa_ns> aa_prepare_ns(Ptr<aa_ns> parent, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aa_remove_profiles(Ptr<aa_ns> policy_ns, Ptr<aa_label> subj, String fqname, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aa_replace_profiles(Ptr<aa_ns> policy_ns, Ptr<aa_label> label, @Unsigned int mask, Ptr<aa_loaddata> udata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_sfs_seq_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_sfs_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_simple_write_to_buffer((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<aa_loaddata> aa_simple_write_to_buffer(String userbuf, @Unsigned long alloc_size, @Unsigned long copy_size, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_task_setrlimit((const struct cred*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int aa_task_setrlimit(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<TaskDefinitions.task_struct> task2, @Unsigned int resource2, Ptr<runtime.rlimit> new_rlim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_write_access($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long aa_write_access(Ptr<runtime.file> file2, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aa_loaddata_update(Ptr<aa_loaddata> data, long revision) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_af_perm((const struct cred*)$arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int aa_af_perm(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, String op, @Unsigned int request2, @Unsigned short family, int type2, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_audit_file((const struct cred*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, (const u8*)$arg6, (const u8*)$arg7, $arg8, $arg9, (const u8*)$arg10, $arg11)")
    public static int aa_audit_file(Ptr<runtime.cred> subj_cred, Ptr<aa_profile> profile, Ptr<aa_perms> perms, String op, @Unsigned int request2, String name, String target, Ptr<aa_label> tlabel, misc.kuid_t ouid, String info2, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_capable((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int aa_capable(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, int cap, @Unsigned int opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_file_perm((const u8*)$arg1, (const struct cred*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int aa_file_perm(String op, Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.file> file2, @Unsigned int request2, boolean in_atomic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_inherit_files((const struct cred*)$arg1, $arg2)")
    public static void aa_inherit_files(Ptr<runtime.cred> cred2, Ptr<misc.files_struct> files) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_label_sk_perm((const struct cred*)$arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int aa_label_sk_perm(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, String op, @Unsigned int request2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_load_ent> aa_load_ent_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_load_ent_free(Ptr<aa_load_ent> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_loaddata> aa_loaddata_alloc(@Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aa_loaddata_kref(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<aa_perms> aa_lookup_fperms(Ptr<aa_policydb> file_rules, @Unsigned int state2, Ptr<PathDefinitions.path_cond> cond) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_path_link((const struct cred*)$arg1, $arg2, $arg3, (const struct path*)$arg4, $arg5)")
    public static int aa_path_link(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_path_name((const struct path*)$arg1, $arg2, $arg3, (const u8**)$arg4, (const u8**)$arg5, (const u8*)$arg6)")
    public static int aa_path_name(Ptr<runtime.path> path2, int flags, String buffer, Ptr<String> name, Ptr<String> info2, String disconnected) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_path_perm((const u8*)$arg1, (const struct cred*)$arg2, $arg3, (const struct path*)$arg4, $arg5, $arg6, $arg7)")
    public static int aa_path_perm(String op, Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, Ptr<runtime.path> path2, int flags, @Unsigned int request2, Ptr<PathDefinitions.path_cond> cond) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aa_profile_af_perm(Ptr<aa_profile> profile, Ptr<ApparmorDefinitions.apparmor_audit_data> ad, @Unsigned int request2, @Unsigned short family, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean aa_rawdata_eq(Ptr<aa_loaddata> l, Ptr<aa_loaddata> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_sk_perm((const u8*)$arg1, $arg2, $arg3)")
    public static int aa_sk_perm(String op, @Unsigned int request2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_sock_file_perm((const struct cred*)$arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int aa_sock_file_perm(Ptr<runtime.cred> subj_cred, Ptr<aa_label> label, String op, @Unsigned int request2, Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_str_perms($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static @Unsigned int aa_str_perms(Ptr<aa_policydb> file_rules, @Unsigned int start, String name, Ptr<PathDefinitions.path_cond> cond, Ptr<aa_perms> perms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_unpack($arg1, $arg2, (const u8**)$arg3)")
    public static int aa_unpack(Ptr<aa_loaddata> udata, Ptr<ListDefinitions.list_head> lh, Ptr<String> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_unpack_blob($arg1, $arg2, (const u8*)$arg3)")
    public static @Unsigned long aa_unpack_blob(Ptr<aa_ext> e, Ptr<String> blob, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_unpack_cap_high($arg1, $arg2, (const u8*)$arg3)")
    public static boolean aa_unpack_cap_high(Ptr<aa_ext> e, Ptr<KernelDefinitions.kernel_cap_t> data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_unpack_cap_low($arg1, $arg2, (const u8*)$arg3)")
    public static boolean aa_unpack_cap_low(Ptr<aa_ext> e, Ptr<KernelDefinitions.kernel_cap_t> data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_unpack_nameX($arg1, $arg2, (const u8*)$arg3)")
    public static boolean aa_unpack_nameX(Ptr<aa_ext> e, aa_code code2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_unpack_str($arg1, (const u8**)$arg2, (const u8*)$arg3)")
    public static int aa_unpack_str(Ptr<aa_ext> e, Ptr<String> string, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_unpack_strdup($arg1, $arg2, (const u8*)$arg3)")
    public static int aa_unpack_strdup(Ptr<aa_ext> e, Ptr<String> string, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="aa_unpack_u32($arg1, $arg2, (const u8*)$arg3)")
    public static boolean aa_unpack_u32(Ptr<aa_ext> e, Ptr<@Unsigned Integer> data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct aa_revision")
    @NotUsableInJava
    public static class aa_revision
    extends Struct {
        public Ptr<aa_ns> ns;
        public long last_read;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_audit_rule")
    @NotUsableInJava
    public static class aa_audit_rule
    extends Struct {
        public Ptr<aa_label> label;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_local_cache")
    @NotUsableInJava
    public static class aa_local_cache
    extends Struct {
        public @Unsigned int hold;
        public @Unsigned int count;
        public ListDefinitions.list_head head;
    }

    @Type(noCCodeGeneration=true, cType="union aa_buffer")
    @NotUsableInJava
    public static class aa_buffer
    extends Union {
        public ListDefinitions.list_head list;
        public AnonDefinitions.anon_member_of_aa_buffer anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_task_ctx")
    @NotUsableInJava
    public static class aa_task_ctx
    extends Struct {
        public Ptr<aa_label> nnp;
        public Ptr<aa_label> onexec;
        public Ptr<aa_label> previous;
        public @Unsigned long token;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_sk_ctx")
    @NotUsableInJava
    public static class aa_sk_ctx
    extends Struct {
        public Ptr<aa_label> label;
        public Ptr<aa_label> peer;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_file_ctx")
    @NotUsableInJava
    public static class aa_file_ctx
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<aa_label> label;
        public @Unsigned int allow;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_ext")
    @NotUsableInJava
    public static class aa_ext
    extends Struct {
        public Ptr<?> start;
        public Ptr<?> end;
        public Ptr<?> pos;
        public @Unsigned int version;
    }

    @Type(noCCodeGeneration=true, cType="enum aa_code")
    public static enum aa_code implements Enum<aa_code>,
    TypedEnum<aa_code, Integer>
    {
        AA_U8,
        AA_U16,
        AA_U32,
        AA_U64,
        AA_NAME,
        AA_STRING,
        AA_BLOB,
        AA_STRUCT,
        AA_STRUCTEND,
        AA_LIST,
        AA_LISTEND,
        AA_ARRAY,
        AA_ARRAYEND;

    }

    @Type(noCCodeGeneration=true, cType="struct aa_load_ent")
    @NotUsableInJava
    public static class aa_load_ent
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<aa_profile> _new;
        public Ptr<aa_profile> old;
        public Ptr<aa_profile> rename;
        public String ns_name;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_loaddata")
    @NotUsableInJava
    public static class aa_loaddata
    extends Struct {
        public runtime.kref count;
        public ListDefinitions.list_head list;
        public misc.work_struct work;
        public Ptr<runtime.dentry> @Size(value=6) [] dents;
        public Ptr<aa_ns> ns;
        public String name;
        public @Unsigned long size;
        public @Unsigned long compressed_size;
        public long revision;
        public int abi;
        public String hash;
        public String data;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_data")
    @NotUsableInJava
    public static class aa_data
    extends Struct {
        public String key;
        public @Unsigned int size;
        public String data;
        public misc.rhash_head head;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_ns_acct")
    @NotUsableInJava
    public static class aa_ns_acct
    extends Struct {
        public int max_size;
        public int max_count;
        public int size;
        public int count;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_ns")
    @NotUsableInJava
    public static class aa_ns
    extends Struct {
        public aa_policy base;
        public Ptr<aa_ns> parent;
        public runtime.mutex lock;
        public aa_ns_acct acct;
        public Ptr<aa_profile> unconfined;
        public ListDefinitions.list_head sub_ns;
        public AtomicDefinitions.atomic_t uniq_null;
        public long uniq_id;
        public int level;
        public long revision;
        public  @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public aa_labelset labels;
        public ListDefinitions.list_head rawdata_list;
        public Ptr<runtime.dentry> @Size(value=13) [] dents;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_attachment")
    @NotUsableInJava
    public static class aa_attachment
    extends Struct {
        public String xmatch_str;
        public Ptr<aa_policydb> xmatch;
        public @Unsigned int xmatch_len;
        public int xattr_count;
        public Ptr<String> xattrs;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_ruleset")
    @NotUsableInJava
    public static class aa_ruleset
    extends Struct {
        public ListDefinitions.list_head list;
        public int size;
        public Ptr<aa_policydb> policy;
        public Ptr<aa_policydb> file;
        public aa_caps caps;
        public aa_rlimit rlimits;
        public int secmark_count;
        public Ptr<aa_secmark> secmark;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_policydb")
    @NotUsableInJava
    public static class aa_policydb
    extends Struct {
        public runtime.kref count;
        public Ptr<aa_dfa> dfa;
        public AnonDefinitions.anon_member_of_aa_policydb anon2;
        public aa_str_table trans;
        public @Unsigned int @Size(value=33) [] start;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_rlimit")
    @NotUsableInJava
    public static class aa_rlimit
    extends Struct {
        public @Unsigned int mask;
        public runtime.rlimit @Size(value=16) [] limits;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_secmark")
    @NotUsableInJava
    public static class aa_secmark
    extends Struct {
        public char audit;
        public char deny;
        public @Unsigned int secid;
        public String label;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_perms")
    @NotUsableInJava
    public static class aa_perms
    extends Struct {
        public @Unsigned int allow;
        public @Unsigned int deny;
        public @Unsigned int subtree;
        public @Unsigned int cond;
        public @Unsigned int kill;
        public @Unsigned int complain;
        public @Unsigned int prompt;
        public @Unsigned int audit;
        public @Unsigned int quiet;
        public @Unsigned int hide;
        public @Unsigned int xindex;
        public @Unsigned int tag;
        public @Unsigned int label;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_profile")
    @NotUsableInJava
    public static class aa_profile
    extends Struct {
        public aa_policy base;
        public Ptr<aa_profile> parent;
        public Ptr<aa_ns> ns;
        public String rename;
        public AuditDefinitions.audit_mode audit;
        public long mode;
        public @Unsigned int path_flags;
        public String disconnected;
        public aa_attachment attach;
        public ListDefinitions.list_head rules;
        public Ptr<aa_loaddata> rawdata;
        public String hash;
        public String dirname;
        public Ptr<runtime.dentry> @Size(value=9) [] dents;
        public Ptr<runtime.rhashtable> data;
        public aa_label label;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_label")
    @NotUsableInJava
    public static class aa_label
    extends Struct {
        public runtime.kref count;
        public RbDefinitions.rb_node node;
        public misc.callback_head rcu;
        public Ptr<aa_proxy> proxy;
        public String hname;
        public long flags;
        public @Unsigned int secid;
        public int size;
        public Ptr<aa_profile> @Size(value=0) [] vec;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_proxy")
    @NotUsableInJava
    public static class aa_proxy
    extends Struct {
        public runtime.kref count;
        public Ptr<aa_label> label;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_labelset")
    @NotUsableInJava
    public static class aa_labelset
    extends Struct {
        public misc.rwlock_t lock;
        public RbDefinitions.rb_root root;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_policy")
    @NotUsableInJava
    public static class aa_policy
    extends Struct {
        public String name;
        public String hname;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head profiles;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_str_table")
    @NotUsableInJava
    public static class aa_str_table
    extends Struct {
        public int size;
        public Ptr<String> table;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_dfa")
    @NotUsableInJava
    public static class aa_dfa
    extends Struct {
        public runtime.kref count;
        public @Unsigned short flags;
        public @Unsigned int max_oob;
        public Ptr<misc.table_header> @Size(value=8) [] tables;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_caps")
    @NotUsableInJava
    public static class aa_caps
    extends Struct {
        public KernelDefinitions.kernel_cap_t allow;
        public KernelDefinitions.kernel_cap_t audit;
        public KernelDefinitions.kernel_cap_t denied;
        public KernelDefinitions.kernel_cap_t quiet;
        public KernelDefinitions.kernel_cap_t kill;
        public KernelDefinitions.kernel_cap_t extended;
    }

    @Type(noCCodeGeneration=true, cType="struct aa_sfs_entry")
    @NotUsableInJava
    public static class aa_sfs_entry
    extends Struct {
        public String name;
        public Ptr<runtime.dentry> dentry;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public aa_sfs_type v_type;
        public misc.v_of_aa_sfs_entry v;
        public Ptr<FileDefinitions.file_operations> file_ops;
    }

    @Type(noCCodeGeneration=true, cType="enum aa_sfs_type")
    public static enum aa_sfs_type implements Enum<aa_sfs_type>,
    TypedEnum<aa_sfs_type, Integer>
    {
        AA_SFS_TYPE_BOOLEAN,
        AA_SFS_TYPE_STRING,
        AA_SFS_TYPE_U64,
        AA_SFS_TYPE_FOPS,
        AA_SFS_TYPE_DIR;

    }
}

