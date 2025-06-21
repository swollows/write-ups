/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.OriginalNames;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AssocDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.KeyringDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.Nl80211Definitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.StaticDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class KeyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__key_create_or_update($arg1, (const u8*)$arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> __key_create_or_update(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring_ref, String type2, String description, Ptr<?> payload, @Unsigned long plen, @Unsigned @OriginalName(value="key_perm_t") int perm, @Unsigned long flags, boolean allow_update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __key_instantiate_and_link(Ptr<runtime.key> key2, Ptr<key_preparsed_payload> prep, Ptr<runtime.key> keyring, Ptr<runtime.key> authkey, Ptr<Ptr<AssocDefinitions.assoc_array_edit>> _edit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_alloc($arg1, (const u8*)$arg2, $arg3, $arg4, (const struct cred*)$arg5, $arg6, $arg7, $arg8)")
    public static Ptr<runtime.key> key_alloc(Ptr<key_type> type2, String desc, misc.kuid_t uid, misc.kgid_t gid, Ptr<runtime.cred> cred2, @Unsigned @OriginalName(value="key_perm_t") int perm, @Unsigned long flags, Ptr<key_restriction> restrict_link) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_create($arg1, (const u8*)$arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> key_create(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring_ref, String type2, String description, Ptr<?> payload, @Unsigned long plen, @Unsigned @OriginalName(value="key_perm_t") int perm, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_create_or_update($arg1, (const u8*)$arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> key_create_or_update(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring_ref, String type2, String description, Ptr<?> payload, @Unsigned long plen, @Unsigned @OriginalName(value="key_perm_t") int perm, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_instantiate_and_link($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int key_instantiate_and_link(Ptr<runtime.key> key2, Ptr<?> data, @Unsigned long datalen, Ptr<runtime.key> keyring, Ptr<runtime.key> authkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_invalidate(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.key> key_lookup(@OriginalName(value="key_serial_t") int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int key_payload_reserve(Ptr<runtime.key> key2, @Unsigned long datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_put(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int key_reject_and_link(Ptr<runtime.key> key2, @Unsigned int timeout, @Unsigned int error, Ptr<runtime.key> keyring, Ptr<runtime.key> authkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_revoke(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_set_timeout(Ptr<runtime.key> key2, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_task_permission((const __key_reference_with_attributes*)$arg1, (const struct cred*)$arg2, $arg3)")
    public static int key_task_permission(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> key_ref, Ptr<runtime.cred> cred2, key_need_perm need_perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_type_lookup((const u8*)$arg1)")
    public static Ptr<key_type> key_type_lookup(String type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_type_put(Ptr<key_type> ktype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_update($arg1, (const void*)$arg2, $arg3)")
    public static int key_update(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> key_ref, Ptr<?> payload, @Unsigned long plen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<key_user> key_user_lookup(misc.kuid_t uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_user_put(Ptr<key_user> user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_validate((const struct key*)$arg1)")
    public static int key_validate(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __key_link(Ptr<runtime.key> keyring, Ptr<runtime.key> key2, Ptr<Ptr<AssocDefinitions.assoc_array_edit>> _edit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__key_link_begin($arg1, (const struct keyring_index_key*)$arg2, $arg3)")
    public static int __key_link_begin(Ptr<runtime.key> keyring, Ptr<KeyringDefinitions.keyring_index_key> index_key, Ptr<Ptr<AssocDefinitions.assoc_array_edit>> _edit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __key_link_check_live_key(Ptr<runtime.key> keyring, Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__key_link_end($arg1, (const struct keyring_index_key*)$arg2, $arg3)")
    public static void __key_link_end(Ptr<runtime.key> keyring, Ptr<KeyringDefinitions.keyring_index_key> index_key, Ptr<AssocDefinitions.assoc_array_edit> edit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__key_link_lock($arg1, (const struct keyring_index_key*)$arg2)")
    public static int __key_link_lock(Ptr<runtime.key> keyring, Ptr<KeyringDefinitions.keyring_index_key> index_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__key_move_lock($arg1, $arg2, (const struct keyring_index_key*)$arg3)")
    public static int __key_move_lock(Ptr<runtime.key> l_keyring, Ptr<runtime.key> u_keyring, Ptr<KeyringDefinitions.keyring_index_key> index_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_change_session_keyring(Ptr<misc.callback_head> twork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_default_cmp((const struct key*)$arg1, (const struct key_match_data*)$arg2)")
    public static boolean key_default_cmp(Ptr<runtime.key> key2, Ptr<key_match_data> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_free_user_ns(Ptr<UserDefinitions.user_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_fsgid_changed(Ptr<runtime.cred> new_cred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_fsuid_changed(Ptr<runtime.cred> new_cred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int key_link(Ptr<runtime.key> keyring, Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int key_move(Ptr<runtime.key> key2, Ptr<runtime.key> from_keyring, Ptr<runtime.key> to_keyring, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean key_put_tag(Ptr<key_tag> tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_remove_domain(Ptr<key_tag> domain_tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_set_index_key(Ptr<KeyringDefinitions.keyring_index_key> index_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int key_unlink(Ptr<runtime.key> keyring, Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_garbage_collector(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_gc_keytype(Ptr<key_type> ktype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_gc_timer_func(Ptr<TimerDefinitions.timer_list> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_gc_unused_keys(Ptr<ListDefinitions.list_head> keys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.key> key_get_instantiation_authkey(@OriginalName(value="key_serial_t") int target_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long key_get_persistent(Ptr<UserDefinitions.user_namespace> ns, misc.kuid_t uid, @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> dest_ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="key_or_keyring_common($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4, $arg5)")
    public static int key_or_keyring_common(Ptr<runtime.key> dest_keyring, Ptr<key_type> type2, Ptr<key_payload> payload, Ptr<runtime.key> trusted, boolean check_dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_schedule_gc(@OriginalName(value="time64_t") long gc_at) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_schedule_gc_links() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void key_set_expiry(Ptr<runtime.key> key2, @OriginalName(value="time64_t") long expiry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int key_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { enum cgroup_filetype type; struct pid_namespace *ns; }")
    @NotUsableInJava
    public static class key_of_cgroup_pidlist
    extends Struct {
        public CgroupDefinitions.cgroup_filetype type;
        public Ptr<PidDefinitions.pid_namespace> ns;
    }

    @Type(noCCodeGeneration=true, cType="struct key_security_struct")
    @NotUsableInJava
    public static class key_security_struct
    extends Struct {
        public @Unsigned int sid;
    }

    @Type(noCCodeGeneration=true, cType="enum key_lookup_flag")
    public static enum key_lookup_flag implements Enum<key_lookup_flag>,
    TypedEnum<key_lookup_flag, Integer>
    {
        KEY_LOOKUP_CREATE,
        KEY_LOOKUP_PARTIAL,
        KEY_LOOKUP_ALL;

    }

    @Type(noCCodeGeneration=true, cType="struct key_params")
    @NotUsableInJava
    public static class key_params
    extends Struct {
        public Ptr<Character> key;
        public Ptr<Character> seq;
        public int key_len;
        public int seq_len;
        public @Unsigned short vlan_id;
        public @Unsigned int cipher;
        public Nl80211Definitions.nl80211_key_mode mode;
    }

    @Type(noCCodeGeneration=true, cType="struct key_vector")
    @NotUsableInJava
    public static class key_vector
    extends Struct {
        public @Unsigned @OriginalName(value="t_key") int key;
        public char pos;
        public char bits;
        public char slen;
        @InlineUnion(value=34503)
        public @InlineUnion(value=34503) misc.hlist_head leaf;
        @InlineUnion(value=34503)
        public  @InlineUnion(value=34503) AnonDefinitions.anon_member_of_anon_member_of_key_vector anon4$1;
    }

    @Type(noCCodeGeneration=true, cType="struct key_notification")
    @NotUsableInJava
    public static class key_notification
    extends Struct {
        public WatchDefinitions.watch_notification watch;
        public @Unsigned int key_id;
        public @Unsigned int aux;
    }

    @Type(noCCodeGeneration=true, cType="enum key_notification_subtype")
    public static enum key_notification_subtype implements Enum<key_notification_subtype>,
    TypedEnum<key_notification_subtype, Integer>
    {
        NOTIFY_KEY_INSTANTIATED,
        NOTIFY_KEY_UPDATED,
        NOTIFY_KEY_LINKED,
        NOTIFY_KEY_UNLINKED,
        NOTIFY_KEY_CLEARED,
        NOTIFY_KEY_REVOKED,
        NOTIFY_KEY_INVALIDATED,
        NOTIFY_KEY_SETATTR;

    }

    @Type(noCCodeGeneration=true, cType="struct { int key; u8 *key_desc; }")
    @NotUsableInJava
    public static class key_struct_of_u_of_common_audit_data
    extends Struct {
        public @OriginalName(value="key_serial_t") int key;
        public String key_desc;
    }

    @Type(noCCodeGeneration=true, cType="enum key_state")
    public static enum key_state implements Enum<key_state>,
    TypedEnum<key_state, Integer>
    {
        KEY_IS_UNINSTANTIATED,
        KEY_IS_POSITIVE;

    }

    @Type(noCCodeGeneration=true, cType="struct key_user")
    @NotUsableInJava
    public static class key_user
    extends Struct {
        public RbDefinitions.rb_node node;
        public runtime.mutex cons_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @OriginalName(value="refcount_t") misc.refcount_struct usage;
        public AtomicDefinitions.atomic_t nkeys;
        public AtomicDefinitions.atomic_t nikeys;
        public misc.kuid_t uid;
        public int qnkeys;
        public int qnbytes;
    }

    @Type(noCCodeGeneration=true, cType="enum key_need_perm")
    public static enum key_need_perm implements Enum<key_need_perm>,
    TypedEnum<key_need_perm, Integer>
    {
        KEY_NEED_UNSPECIFIED,
        KEY_NEED_VIEW,
        KEY_NEED_READ,
        KEY_NEED_WRITE,
        KEY_NEED_SEARCH,
        KEY_NEED_LINK,
        KEY_NEED_SETATTR,
        KEY_NEED_UNLINK,
        KEY_SYSADMIN_OVERRIDE,
        KEY_AUTHTOKEN_OVERRIDE,
        KEY_DEFER_PERM_CHECK;

    }

    @Type(noCCodeGeneration=true, cType="struct key_match_data")
    @NotUsableInJava
    public static class key_match_data
    extends Struct {
        public Ptr<?> cmp;
        public Ptr<?> raw_data;
        public Ptr<?> preparsed;
        public @Unsigned int lookup_type;
    }

    @Type(noCCodeGeneration=true, cType="struct key_preparsed_payload")
    @NotUsableInJava
    public static class key_preparsed_payload
    extends Struct {
        public String orig_description;
        public String description;
        public key_payload payload;
        public Ptr<?> data;
        public @Unsigned long datalen;
        public @Unsigned long quotalen;
        public @OriginalName(value="time64_t") long expiry;
    }

    @Type(noCCodeGeneration=true, cType="union { struct frag_v4_compare_key v4; struct frag_v6_compare_key v6; }")
    @NotUsableInJava
    public static class key_of_inet_frag_queue
    extends Union {
        public misc.frag_v4_compare_key v4;
        public misc.frag_v6_compare_key v6;
    }

    @Type(noCCodeGeneration=true, cType="enum key_being_used_for")
    public static enum key_being_used_for implements Enum<key_being_used_for>,
    TypedEnum<key_being_used_for, Integer>
    {
        VERIFYING_MODULE_SIGNATURE,
        VERIFYING_FIRMWARE_SIGNATURE,
        VERIFYING_KEXEC_PE_SIGNATURE,
        VERIFYING_KEY_SIGNATURE,
        VERIFYING_KEY_SELF_SIGNATURE,
        VERIFYING_UNSPECIFIED_SIGNATURE,
        NR__KEY_BEING_USED_FOR;

    }

    @Type(noCCodeGeneration=true, cType="struct key_restriction")
    @NotUsableInJava
    public static class key_restriction
    extends Struct {
        public @OriginalName(value="key_restrict_link_func_t") Ptr<?> check;
        public Ptr<runtime.key> key;
        public Ptr<key_type> keytype;
    }

    @Type(noCCodeGeneration=true, cType="union key_payload")
    @NotUsableInJava
    public static class key_payload
    extends Union {
        public Ptr<?> rcu_data0;
        public Ptr<?> @Size(value=4) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct key_type")
    @NotUsableInJava
    public static class key_type
    extends Struct {
        public String name;
        public @Unsigned long def_datalen;
        public @Unsigned int flags;
        public Ptr<?> vet_description;
        public Ptr<?> preparse;
        public Ptr<?> free_preparse;
        public Ptr<?> instantiate;
        public Ptr<?> update;
        public Ptr<?> match_preparse;
        public Ptr<?> match_free;
        public Ptr<?> revoke;
        public Ptr<?> destroy;
        public Ptr<?> describe;
        public Ptr<?> read;
        public @OriginalName(value="request_key_actor_t") Ptr<?> request_key;
        public Ptr<?> lookup_restriction;
        public Ptr<?> asym_query;
        public Ptr<?> asym_eds_op;
        public Ptr<?> asym_verify_signature;
        public ListDefinitions.list_head link;
        public LockDefinitions.lock_class_key lock_class;
    }

    @Type(noCCodeGeneration=true, cType="struct key_tag")
    @NotUsableInJava
    public static class key_tag
    extends Struct {
        public misc.callback_head rcu;
        public @OriginalName(value="refcount_t") misc.refcount_struct usage;
        public boolean removed;
    }

    @Type(noCCodeGeneration=true, cType="union { struct static_key_true dd_key_true; struct static_key_false dd_key_false; }")
    @NotUsableInJava
    public static class key_of__ddebug
    extends Union {
        public StaticDefinitions.static_key_true dd_key_true;
        public StaticDefinitions.static_key_false dd_key_false;
    }
}

