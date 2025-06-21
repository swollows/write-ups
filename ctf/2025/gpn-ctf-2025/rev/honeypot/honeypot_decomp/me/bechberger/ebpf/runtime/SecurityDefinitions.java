/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.OriginalNames;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MsgDefinitions;
import me.bechberger.ebpf.runtime.NetlblDefinitions;
import me.bechberger.ebpf.runtime.NvdimmDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SctpDefinitions;
import me.bechberger.ebpf.runtime.SelinuxDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class SecurityDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__security_genfs_sid($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int __security_genfs_sid(Ptr<SelinuxDefinitions.selinux_policy> policy, String fstype, String path2, @Unsigned short orig_sclass, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bounded_transition(@Unsigned int old_sid, @Unsigned int new_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_change_sid(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, Ptr<@Unsigned Integer> out_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_compute_av(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short orig_tclass, Ptr<misc.av_decision> avd, Ptr<misc.extended_perms> xperms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_compute_av_user(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, Ptr<misc.av_decision> avd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_compute_sid($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6, $arg7)")
    public static int security_compute_sid(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short orig_tclass, @Unsigned short specified, String objname, Ptr<@Unsigned Integer> out_sid, boolean kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_compute_validatetrans(@Unsigned int oldsid, @Unsigned int newsid, @Unsigned int tasksid, @Unsigned short orig_tclass, boolean user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_compute_xperms_decision(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short orig_tclass, char driver, Ptr<misc.extended_perms_decision> xpermd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_context_str_to_sid((const u8*)$arg1, $arg2, $arg3)")
    public static int security_context_str_to_sid(String scontext, Ptr<@Unsigned Integer> sid, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_context_to_sid((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static int security_context_to_sid(String scontext, @Unsigned int scontext_len, Ptr<@Unsigned Integer> sid, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_context_to_sid_core((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int security_context_to_sid_core(String scontext, @Unsigned int scontext_len, Ptr<@Unsigned Integer> sid, @Unsigned int def_sid, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, int force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_context_to_sid_default((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int security_context_to_sid_default(String scontext, @Unsigned int scontext_len, Ptr<@Unsigned Integer> sid, @Unsigned int def_sid, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_context_to_sid_force((const u8*)$arg1, $arg2, $arg3)")
    public static int security_context_to_sid_force(String scontext, @Unsigned int scontext_len, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_dump_masked_av($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6)")
    public static void security_dump_masked_av(Ptr<runtime.policydb> policydb2, Ptr<runtime.context> scontext, Ptr<runtime.context> tcontext, @Unsigned short tclass, @Unsigned int permissions, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_fs_use(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_genfs_sid((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int security_genfs_sid(String fstype, String path2, @Unsigned short orig_sclass, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_get_allow_unknown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_get_bool_value(@Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_get_bools(Ptr<SelinuxDefinitions.selinux_policy> policy, Ptr<@Unsigned Integer> len, Ptr<Ptr<String>> names, Ptr<Ptr<Integer>> values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_get_classes(Ptr<SelinuxDefinitions.selinux_policy> policy, Ptr<Ptr<String>> classes, Ptr<@Unsigned Integer> nclasses) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)security_get_initial_sid_context($arg1))")
    public static String security_get_initial_sid_context(@Unsigned int sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_get_permissions($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int security_get_permissions(Ptr<SelinuxDefinitions.selinux_policy> policy, String _class2, Ptr<Ptr<String>> perms, Ptr<@Unsigned Integer> nperms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_get_reject_unknown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_get_user_sids(@Unsigned int fromsid, String username, Ptr<Ptr<@Unsigned Integer>> sids, Ptr<@Unsigned Integer> nel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_ib_endport_sid((const u8*)$arg1, $arg2, $arg3)")
    public static int security_ib_endport_sid(String dev_name, char port_num, Ptr<@Unsigned Integer> out_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_ib_pkey_sid(@Unsigned long subnet_prefix, @Unsigned short pkey_num, Ptr<@Unsigned Integer> out_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_load_policy(Ptr<?> data, @Unsigned long len, Ptr<SelinuxDefinitions.selinux_load_state> load_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_member_sid(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, Ptr<@Unsigned Integer> out_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_mls_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_net_peersid_resolve(@Unsigned int nlbl_sid, @Unsigned int nlbl_type, @Unsigned int xfrm_sid, Ptr<@Unsigned Integer> peer_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_netif_sid(String name, Ptr<@Unsigned Integer> if_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_netlbl_secattr_to_sid(Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_netlbl_sid_to_secattr(@Unsigned int sid, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_node_sid(@Unsigned short domain, Ptr<?> addrp, @Unsigned int addrlen, Ptr<@Unsigned Integer> out_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_policycap_supported(@Unsigned int req_cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_port_sid(char protocol, @Unsigned short port2, Ptr<@Unsigned Integer> out_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_read_policy(Ptr<Ptr<?>> data, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_read_state_kernel(Ptr<Ptr<?>> data, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_set_bools(@Unsigned int len, Ptr<Integer> values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long security_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sid_mls_copy(@Unsigned int sid, @Unsigned int mls_sid, Ptr<@Unsigned Integer> new_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sid_to_context(@Unsigned int sid, Ptr<String> scontext, Ptr<@Unsigned Integer> scontext_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sid_to_context_core(@Unsigned int sid, Ptr<String> scontext, Ptr<@Unsigned Integer> scontext_len, int force, int only_invalid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sid_to_context_force(@Unsigned int sid, Ptr<String> scontext, Ptr<@Unsigned Integer> scontext_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sid_to_context_inval(@Unsigned int sid, Ptr<String> scontext, Ptr<@Unsigned Integer> scontext_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sidtab_hash_stats(String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long security_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_transition_sid($arg1, $arg2, $arg3, (const struct qstr*)$arg4, $arg5)")
    public static int security_transition_sid(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, Ptr<runtime.qstr> qstr2, Ptr<@Unsigned Integer> out_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_transition_sid_user($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int security_transition_sid_user(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, String objname, Ptr<@Unsigned Integer> out_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_validate_transition(@Unsigned int oldsid, @Unsigned int newsid, @Unsigned int tasksid, @Unsigned short orig_tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_validate_transition_user(@Unsigned int oldsid, @Unsigned int newsid, @Unsigned int tasksid, @Unsigned short tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_add_hooks($arg1, $arg2, (const struct lsm_id*)$arg3)")
    public static void security_add_hooks(Ptr<security_hook_list> hooks, int count, Ptr<LsmDefinitions.lsm_id> lsmid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_audit_rule_free(Ptr<?> lsmrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_audit_rule_init(@Unsigned int field, @Unsigned int op, String rulestr, Ptr<Ptr<?>> lsmrule, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_audit_rule_known(Ptr<AuditDefinitions.audit_krule> krule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_audit_rule_match(@Unsigned int secid, @Unsigned int field, @Unsigned int op, Ptr<?> lsmrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bdev_alloc(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_bdev_free(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_bdev_setintegrity($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int security_bdev_setintegrity(Ptr<BlockDefinitions.block_device> bdev, LsmDefinitions.lsm_integrity_type type2, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_binder_set_context_mgr((const struct cred*)$arg1)")
    public static int security_binder_set_context_mgr(Ptr<runtime.cred> mgr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_binder_transaction((const struct cred*)$arg1, (const struct cred*)$arg2)")
    public static int security_binder_transaction(Ptr<runtime.cred> from, Ptr<runtime.cred> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_binder_transfer_binder((const struct cred*)$arg1, (const struct cred*)$arg2)")
    public static int security_binder_transfer_binder(Ptr<runtime.cred> from, Ptr<runtime.cred> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_binder_transfer_file((const struct cred*)$arg1, (const struct cred*)$arg2, (const struct file*)$arg3)")
    public static int security_binder_transfer_file(Ptr<runtime.cred> from, Ptr<runtime.cred> to, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bpf(int cmd, Ptr<BpfDefinitions.bpf_attr> attr2, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bpf_map(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned @OriginalName(value="fmode_t") int fmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bpf_map_create(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_bpf_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bpf_prog(Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_bpf_prog_free(Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bpf_prog_load(Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_bpf_token_capable((const struct bpf_token*)$arg1, $arg2)")
    public static int security_bpf_token_capable(Ptr<BpfDefinitions.bpf_token> token, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_bpf_token_cmd((const struct bpf_token*)$arg1, $arg2)")
    public static int security_bpf_token_cmd(Ptr<BpfDefinitions.bpf_token> token, BpfDefinitions.bpf_cmd cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_bpf_token_create($arg1, $arg2, (const struct path*)$arg3)")
    public static int security_bpf_token_create(Ptr<BpfDefinitions.bpf_token> token, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_bpf_token_free(Ptr<BpfDefinitions.bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bprm_check(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_bprm_committed_creds((const struct linux_binprm*)$arg1)")
    public static void security_bprm_committed_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_bprm_committing_creds((const struct linux_binprm*)$arg1)")
    public static void security_bprm_committing_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_bprm_creds_for_exec(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_bprm_creds_from_file($arg1, (const struct file*)$arg2)")
    public static int security_bprm_creds_from_file(Ptr<LinuxDefinitions.linux_binprm> bprm, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_capable((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int security_capable(Ptr<runtime.cred> cred2, Ptr<UserDefinitions.user_namespace> ns, int cap, @Unsigned int opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_capget((const struct task_struct*)$arg1, $arg2, $arg3, $arg4)")
    public static int security_capget(Ptr<TaskDefinitions.task_struct> target, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_capset($arg1, (const struct cred*)$arg2, (const struct {\n  long long unsigned int val;\n}*)$arg3, (const struct {\n  long long unsigned int val;\n}*)$arg4, (const struct {\n  long long unsigned int val;\n}*)$arg5)")
    public static int security_capset(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_create_user_ns((const struct cred*)$arg1)")
    public static int security_create_user_ns(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_cred_alloc_blank(Ptr<runtime.cred> cred2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_cred_free(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_cred_getsecid((const struct cred*)$arg1, $arg2)")
    public static void security_cred_getsecid(Ptr<runtime.cred> c, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_current_getsecid_subj(Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_d_instantiate(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_dentry_create_files_as($arg1, $arg2, $arg3, (const struct cred*)$arg4, $arg5)")
    public static int security_dentry_create_files_as(Ptr<runtime.dentry> dentry2, int mode, Ptr<runtime.qstr> name, Ptr<runtime.cred> old, Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_dentry_init_security($arg1, $arg2, (const struct qstr*)$arg3, (const u8**)$arg4, $arg5, $arg6)")
    public static int security_dentry_init_security(Ptr<runtime.dentry> dentry2, int mode, Ptr<runtime.qstr> name, Ptr<String> xattr_name2, Ptr<Ptr<?>> ctx, Ptr<@Unsigned Integer> ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_alloc(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_fcntl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_file_free(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_ioctl_compat(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_lock(Ptr<runtime.file> file2, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_mprotect(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long reqprot, @Unsigned long prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_open(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_permission(Ptr<runtime.file> file2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_post_open(Ptr<runtime.file> file2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_receive(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_file_release(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_send_sigiotask(Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.fown_struct> fown, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_file_set_fowner(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_file_truncate(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_free_mnt_opts(Ptr<Ptr<?>> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_fs_context_dup(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_context> src_fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_fs_context_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_fs_context_submount(Ptr<FsDefinitions.fs_context> fc, Ptr<SuperDefinitions.super_block> reference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_getprocattr($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int security_getprocattr(Ptr<TaskDefinitions.task_struct> p, int lsmid, String name, Ptr<String> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_getselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> uctx, Ptr<@Unsigned Integer> size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_ib_alloc_security(Ptr<Ptr<?>> sec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_ib_endport_manage_subnet($arg1, (const u8*)$arg2, $arg3)")
    public static int security_ib_endport_manage_subnet(Ptr<?> sec, String dev_name, char port_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_ib_free_security(Ptr<?> sec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_ib_pkey_access(Ptr<?> sec, @Unsigned long subnet_prefix, @Unsigned short pkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_inet_conn_established(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inet_conn_request((const struct sock*)$arg1, $arg2, $arg3)")
    public static int security_inet_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inet_csk_clone($arg1, (const struct request_sock*)$arg2)")
    public static void security_inet_csk_clone(Ptr<runtime.sock> newsk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_initramfs_populated() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_alloc(Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_copy_up(Ptr<runtime.dentry> src, Ptr<Ptr<runtime.cred>> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_copy_up_xattr($arg1, (const u8*)$arg2)")
    public static int security_inode_copy_up_xattr(Ptr<runtime.dentry> src, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_create(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_follow_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, boolean rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_inode_free(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_get_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int security_inode_get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_getattr((const struct path*)$arg1)")
    public static int security_inode_getattr(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_getsecctx(Ptr<runtime.inode> inode2, Ptr<Ptr<?>> ctx, Ptr<@Unsigned Integer> ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_inode_getsecid(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_getsecurity($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int security_inode_getsecurity(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, String name, Ptr<Ptr<?>> buffer, boolean alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_getxattr($arg1, (const u8*)$arg2)")
    public static int security_inode_getxattr(Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_init_security($arg1, $arg2, (const struct qstr*)$arg3, (const int (struct inode*, const struct xattr*, void*)*)$arg4, $arg5)")
    public static int security_inode_init_security(Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> qstr2, @OriginalName(value="initxattrs") Ptr<?> initxattrs, Ptr<?> fs_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_init_security_anon($arg1, (const struct qstr*)$arg2, (const struct inode*)$arg3)")
    public static int security_inode_init_security_anon(Ptr<runtime.inode> inode2, Ptr<runtime.qstr> name, Ptr<runtime.inode> context_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_inode_invalidate_secctx(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_killpriv(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_listsecurity(Ptr<runtime.inode> inode2, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_listxattr(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_mkdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_mknod(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_need_killpriv(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_notifysecctx(Ptr<runtime.inode> inode2, Ptr<?> ctx, @Unsigned int ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_permission(Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_inode_post_create_tmpfile(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_post_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static void security_inode_post_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_post_removexattr($arg1, (const u8*)$arg2)")
    public static void security_inode_post_removexattr(Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_post_set_acl($arg1, (const u8*)$arg2, $arg3)")
    public static void security_inode_post_set_acl(Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_inode_post_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, int ia_valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_post_setxattr($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static void security_inode_post_setxattr(Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_readlink(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int security_inode_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int security_inode_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_rename(Ptr<runtime.inode> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_set_acl($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int security_inode_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_setintegrity((const struct inode*)$arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int security_inode_setintegrity(Ptr<runtime.inode> inode2, LsmDefinitions.lsm_integrity_type type2, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_setsecctx(Ptr<runtime.dentry> dentry2, Ptr<?> ctx, @Unsigned int ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_setsecurity($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int security_inode_setsecurity(Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_setxattr($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int security_inode_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_inode_symlink($arg1, $arg2, (const u8*)$arg3)")
    public static int security_inode_symlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String old_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_inode_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_ipc_getsecid(Ptr<misc.kern_ipc_perm> ipcp, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_ipc_permission(Ptr<misc.kern_ipc_perm> ipcp, short flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_ismaclabel((const u8*)$arg1)")
    public static int security_ismaclabel(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_kernel_act_as(Ptr<runtime.cred> _new, @Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_kernel_create_files_as(Ptr<runtime.cred> _new, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_kernel_load_data(KernelDefinitions.kernel_load_data_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_kernel_module_request(String kmod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_kernel_post_load_data(String buf, @OriginalName(value="loff_t") long size, KernelDefinitions.kernel_load_data_id id, String description) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_kernel_post_read_file(Ptr<runtime.file> file2, String buf, @OriginalName(value="loff_t") long size, KernelDefinitions.kernel_read_file_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_kernel_read_file(Ptr<runtime.file> file2, KernelDefinitions.kernel_read_file_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_kernfs_init_security(Ptr<KernfsDefinitions.kernfs_node> kn_dir, Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_key_alloc($arg1, (const struct cred*)$arg2, $arg3)")
    public static int security_key_alloc(Ptr<runtime.key> key2, Ptr<runtime.cred> cred2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_key_free(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_key_getsecurity(Ptr<runtime.key> key2, Ptr<String> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_key_permission($arg1, (const struct cred*)$arg2, $arg3)")
    public static int security_key_permission(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> key_ref, Ptr<runtime.cred> cred2, KeyDefinitions.key_need_perm need_perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_key_post_create_or_update($arg1, $arg2, (const void*)$arg3, $arg4, $arg5, $arg6)")
    public static void security_key_post_create_or_update(Ptr<runtime.key> keyring, Ptr<runtime.key> key2, Ptr<?> payload, @Unsigned long payload_len, @Unsigned long flags, boolean create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_lock_kernel_down((const u8*)$arg1, $arg2)")
    public static int security_lock_kernel_down(String where, misc.lockdown_reason level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_locked_down(misc.lockdown_reason what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_mmap_addr(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_mmap_file(Ptr<runtime.file> file2, @Unsigned long prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_move_mount((const struct path*)$arg1, (const struct path*)$arg2)")
    public static int security_move_mount(Ptr<runtime.path> from_path, Ptr<runtime.path> to_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_mptcp_add_subflow(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_msg_msg_alloc(Ptr<MsgDefinitions.msg_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_msg_msg_free(Ptr<MsgDefinitions.msg_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_msg_queue_alloc(Ptr<misc.kern_ipc_perm> msq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_msg_queue_associate(Ptr<misc.kern_ipc_perm> msq, int msqflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_msg_queue_free(Ptr<misc.kern_ipc_perm> msq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_msg_queue_msgctl(Ptr<misc.kern_ipc_perm> msq, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_msg_queue_msgrcv(Ptr<misc.kern_ipc_perm> msq, Ptr<MsgDefinitions.msg_msg> msg, Ptr<TaskDefinitions.task_struct> target, long type2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_msg_queue_msgsnd(Ptr<misc.kern_ipc_perm> msq, Ptr<MsgDefinitions.msg_msg> msg, int msqflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_netlink_send(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_chmod((const struct path*)$arg1, $arg2)")
    public static int security_path_chmod(Ptr<runtime.path> path2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_chown((const struct path*)$arg1, $arg2, $arg3)")
    public static int security_path_chown(Ptr<runtime.path> path2, misc.kuid_t uid, misc.kgid_t gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_chroot((const struct path*)$arg1)")
    public static int security_path_chroot(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_link($arg1, (const struct path*)$arg2, $arg3)")
    public static int security_path_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_mkdir((const struct path*)$arg1, $arg2, $arg3)")
    public static int security_path_mkdir(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_mknod((const struct path*)$arg1, $arg2, $arg3, $arg4)")
    public static int security_path_mknod(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_notify((const struct path*)$arg1, $arg2, $arg3)")
    public static int security_path_notify(Ptr<runtime.path> path2, @Unsigned long mask, @Unsigned int obj_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_path_post_mknod(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_rename((const struct path*)$arg1, $arg2, (const struct path*)$arg3, $arg4, $arg5)")
    public static int security_path_rename(Ptr<runtime.path> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_rmdir((const struct path*)$arg1, $arg2)")
    public static int security_path_rmdir(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_symlink((const struct path*)$arg1, $arg2, (const u8*)$arg3)")
    public static int security_path_symlink(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, String old_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_truncate((const struct path*)$arg1)")
    public static int security_path_truncate(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_path_unlink((const struct path*)$arg1, $arg2)")
    public static int security_path_unlink(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_perf_event_alloc(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_perf_event_free(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_perf_event_open(Ptr<PerfDefinitions.perf_event_attr> attr2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_perf_event_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_perf_event_write(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_post_notification((const struct cred*)$arg1, (const struct cred*)$arg2, $arg3)")
    public static int security_post_notification(Ptr<runtime.cred> w_cred, Ptr<runtime.cred> cred2, Ptr<WatchDefinitions.watch_notification> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_prepare_creds($arg1, (const struct cred*)$arg2, $arg3)")
    public static int security_prepare_creds(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_ptrace_access_check(Ptr<TaskDefinitions.task_struct> child, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_ptrace_traceme(Ptr<TaskDefinitions.task_struct> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_quota_on(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_quotactl($arg1, $arg2, $arg3, (const struct super_block*)$arg4)")
    public static int security_quotactl(int cmds, int type2, int id, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_release_secctx(String secdata, @Unsigned int seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_req_classify_flow((const struct request_sock*)$arg1, $arg2)")
    public static void security_req_classify_flow(Ptr<RequestDefinitions.request_sock> req2, Ptr<misc.flowi_common> flic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sb_alloc(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_sb_clone_mnt_opts((const struct super_block*)$arg1, $arg2, $arg3, $arg4)")
    public static int security_sb_clone_mnt_opts(Ptr<SuperDefinitions.super_block> oldsb, Ptr<SuperDefinitions.super_block> newsb, @Unsigned long kern_flags, Ptr<@Unsigned Long> set_kern_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_sb_delete(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sb_eat_lsm_opts(String options, Ptr<Ptr<?>> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_sb_free(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_sb_kern_mount((const struct super_block*)$arg1)")
    public static int security_sb_kern_mount(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sb_mnt_opts_compat(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_sb_mount((const u8*)$arg1, (const struct path*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int security_sb_mount(String dev_name, Ptr<runtime.path> path2, String type2, @Unsigned long flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_sb_pivotroot((const struct path*)$arg1, (const struct path*)$arg2)")
    public static int security_sb_pivotroot(Ptr<runtime.path> old_path, Ptr<runtime.path> new_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sb_remount(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sb_set_mnt_opts(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts, @Unsigned long kern_flags, Ptr<@Unsigned Long> set_kern_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sb_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sb_statfs(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sb_umount(Ptr<runtime.vfsmount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sctp_assoc_established(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sctp_assoc_request(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sctp_bind_connect(Ptr<runtime.sock> sk, int optname, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_sctp_sk_clone(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_secctx_to_secid((const u8*)$arg1, $arg2, $arg3)")
    public static int security_secctx_to_secid(String secdata, @Unsigned int seclen, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_secid_to_secctx(@Unsigned int secid, Ptr<String> secdata, Ptr<@Unsigned Integer> seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_secmark_refcount_dec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_secmark_refcount_inc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_secmark_relabel_packet(@Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sem_alloc(Ptr<misc.kern_ipc_perm> sma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sem_associate(Ptr<misc.kern_ipc_perm> sma, int semflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_sem_free(Ptr<misc.kern_ipc_perm> sma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sem_semctl(Ptr<misc.kern_ipc_perm> sma, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sem_semop(Ptr<misc.kern_ipc_perm> sma, Ptr<runtime.sembuf> sops, @Unsigned int nsops, int alter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_setprocattr($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int security_setprocattr(int lsmid, String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_setselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> uctx, @Unsigned int size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_settime64((const struct timespec64*)$arg1, (const struct timezone*)$arg2)")
    public static int security_settime64(Ptr<runtime.timespec64> ts, Ptr<runtime.timezone> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_shm_alloc(Ptr<misc.kern_ipc_perm> shp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_shm_associate(Ptr<misc.kern_ipc_perm> shp, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_shm_free(Ptr<misc.kern_ipc_perm> shp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_shm_shmat(Ptr<misc.kern_ipc_perm> shp, String shmaddr, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_shm_shmctl(Ptr<misc.kern_ipc_perm> shp, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sk_alloc(Ptr<runtime.sock> sk, int family, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_sk_classify_flow((const struct sock*)$arg1, $arg2)")
    public static void security_sk_classify_flow(Ptr<runtime.sock> sk, Ptr<misc.flowi_common> flic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_sk_clone((const struct sock*)$arg1, $arg2)")
    public static void security_sk_clone(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_sk_free(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_skb_classify_flow(Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.flowi_common> flic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_sock_graft(Ptr<runtime.sock> sk, Ptr<runtime.socket> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_sock_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_create(int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_getpeername(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_getpeersec_dgram(Ptr<runtime.socket> sock2, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_getpeersec_stream(Ptr<runtime.socket> sock2, misc.sockptr_t optval, misc.sockptr_t optlen, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_getsockname(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_getsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_post_create(Ptr<runtime.socket> sock2, int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_setsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_shutdown(Ptr<runtime.socket> sock2, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_socket_socketpair(Ptr<runtime.socket> socka, Ptr<runtime.socket> sockb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_syslog(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_alloc(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_task_fix_setgid($arg1, (const struct cred*)$arg2, $arg3)")
    public static int security_task_fix_setgid(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_task_fix_setgroups($arg1, (const struct cred*)$arg2)")
    public static int security_task_fix_setgroups(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_task_fix_setuid($arg1, (const struct cred*)$arg2, $arg3)")
    public static int security_task_fix_setuid(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_task_free(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_getioprio(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_getpgid(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_getscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_task_getsecid_obj(Ptr<TaskDefinitions.task_struct> p, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_getsid(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_task_kill($arg1, $arg2, $arg3, (const struct cred*)$arg4)")
    public static int security_task_kill(Ptr<TaskDefinitions.task_struct> p, Ptr<KernelDefinitions.kernel_siginfo> info2, int sig, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_movememory(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_prctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_task_prlimit((const struct cred*)$arg1, (const struct cred*)$arg2, $arg3)")
    public static int security_task_prlimit(Ptr<runtime.cred> cred2, Ptr<runtime.cred> tcred, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_setioprio(Ptr<TaskDefinitions.task_struct> p, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_setnice(Ptr<TaskDefinitions.task_struct> p, int nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_setpgid(Ptr<TaskDefinitions.task_struct> p, @OriginalName(value="pid_t") int pgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_setrlimit(Ptr<TaskDefinitions.task_struct> p, @Unsigned int resource2, Ptr<runtime.rlimit> new_rlim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_task_setscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_task_to_inode(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_transfer_creds($arg1, (const struct cred*)$arg2)")
    public static void security_transfer_creds(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_tun_dev_alloc_security(Ptr<Ptr<?>> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_tun_dev_attach(Ptr<runtime.sock> sk, Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_tun_dev_attach_queue(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_tun_dev_create() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_tun_dev_free_security(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_tun_dev_open(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_unix_may_send(Ptr<runtime.socket> sock2, Ptr<runtime.socket> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_unix_stream_connect(Ptr<runtime.sock> sock2, Ptr<runtime.sock> other, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_uring_cmd(Ptr<IoDefinitions.io_uring_cmd> ioucmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_uring_override_creds((const struct cred*)$arg1)")
    public static int security_uring_override_creds(Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_uring_sqpoll() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_vm_enough_memory_mm(Ptr<MmDefinitions.mm_struct> mm, long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_watch_key(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_xfrm_decode_session(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_xfrm_policy_alloc(Ptr<Ptr<XfrmDefinitions.xfrm_sec_ctx>> ctxp, Ptr<XfrmDefinitions.xfrm_user_sec_ctx> sec_ctx, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_xfrm_policy_clone(Ptr<XfrmDefinitions.xfrm_sec_ctx> old_ctx, Ptr<Ptr<XfrmDefinitions.xfrm_sec_ctx>> new_ctxp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_xfrm_policy_delete(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_xfrm_policy_free(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_xfrm_policy_lookup(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx, @Unsigned int fl_secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_xfrm_state_alloc(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_user_sec_ctx> sec_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_xfrm_state_alloc_acquire(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_sec_ctx> polsec, @Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_xfrm_state_delete(Ptr<XfrmDefinitions.xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void security_xfrm_state_free(Ptr<XfrmDefinitions.xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="security_xfrm_state_pol_flow_match($arg1, $arg2, (const struct flowi_common*)$arg3)")
    public static int security_xfrm_state_pol_flow_match(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_policy> xp, Ptr<misc.flowi_common> flic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_disable(Ptr<runtime.nvdimm> nvdimm2, @Unsigned int keyid, NvdimmDefinitions.nvdimm_passphrase_type pass_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_erase(Ptr<runtime.nvdimm> nvdimm2, @Unsigned int keyid, NvdimmDefinitions.nvdimm_passphrase_type pass_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_overwrite(Ptr<runtime.nvdimm> nvdimm2, @Unsigned int keyid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int security_update(Ptr<runtime.nvdimm> nvdimm2, @Unsigned int keyid, @Unsigned int new_keyid, NvdimmDefinitions.nvdimm_passphrase_type pass_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum security_cmd_enabled_bits")
    public static enum security_cmd_enabled_bits implements Enum<security_cmd_enabled_bits>,
    TypedEnum<security_cmd_enabled_bits, Integer>
    {
        CXL_SEC_ENABLED_SANITIZE,
        CXL_SEC_ENABLED_SECURE_ERASE,
        CXL_SEC_ENABLED_GET_SECURITY_STATE,
        CXL_SEC_ENABLED_SET_PASSPHRASE,
        CXL_SEC_ENABLED_DISABLE_PASSPHRASE,
        CXL_SEC_ENABLED_UNLOCK,
        CXL_SEC_ENABLED_FREEZE_SECURITY,
        CXL_SEC_ENABLED_PASSPHRASE_SECURE_ERASE,
        CXL_SEC_ENABLED_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct security_class_mapping")
    @NotUsableInJava
    public static class security_class_mapping
    extends Struct {
        public String name;
        public String @Size(value=33) [] perms;
    }

    @Type(noCCodeGeneration=true, cType="struct security_hook_list")
    @NotUsableInJava
    public static class security_hook_list
    extends Struct {
        public misc.hlist_node list;
        public Ptr<misc.hlist_head> head;
        public security_list_options hook;
        public Ptr<LsmDefinitions.lsm_id> lsmid;
    }

    @Type(noCCodeGeneration=true, cType="struct security_hook_heads")
    @NotUsableInJava
    public static class security_hook_heads
    extends Struct {
        public misc.hlist_head binder_set_context_mgr;
        public misc.hlist_head binder_transaction;
        public misc.hlist_head binder_transfer_binder;
        public misc.hlist_head binder_transfer_file;
        public misc.hlist_head ptrace_access_check;
        public misc.hlist_head ptrace_traceme;
        public misc.hlist_head capget;
        public misc.hlist_head capset;
        public misc.hlist_head capable;
        public misc.hlist_head quotactl;
        public misc.hlist_head quota_on;
        public misc.hlist_head syslog;
        public misc.hlist_head settime;
        public misc.hlist_head vm_enough_memory;
        public misc.hlist_head bprm_creds_for_exec;
        public misc.hlist_head bprm_creds_from_file;
        public misc.hlist_head bprm_check_security;
        public misc.hlist_head bprm_committing_creds;
        public misc.hlist_head bprm_committed_creds;
        public misc.hlist_head fs_context_submount;
        public misc.hlist_head fs_context_dup;
        public misc.hlist_head fs_context_parse_param;
        public misc.hlist_head sb_alloc_security;
        public misc.hlist_head sb_delete;
        public misc.hlist_head sb_free_security;
        public misc.hlist_head sb_free_mnt_opts;
        public misc.hlist_head sb_eat_lsm_opts;
        public misc.hlist_head sb_mnt_opts_compat;
        public misc.hlist_head sb_remount;
        public misc.hlist_head sb_kern_mount;
        public misc.hlist_head sb_show_options;
        public misc.hlist_head sb_statfs;
        public misc.hlist_head sb_mount;
        public misc.hlist_head sb_umount;
        public misc.hlist_head sb_pivotroot;
        public misc.hlist_head sb_set_mnt_opts;
        public misc.hlist_head sb_clone_mnt_opts;
        public misc.hlist_head move_mount;
        public misc.hlist_head dentry_init_security;
        public misc.hlist_head dentry_create_files_as;
        public misc.hlist_head path_unlink;
        public misc.hlist_head path_mkdir;
        public misc.hlist_head path_rmdir;
        public misc.hlist_head path_mknod;
        public misc.hlist_head path_post_mknod;
        public misc.hlist_head path_truncate;
        public misc.hlist_head path_symlink;
        public misc.hlist_head path_link;
        public misc.hlist_head path_rename;
        public misc.hlist_head path_chmod;
        public misc.hlist_head path_chown;
        public misc.hlist_head path_chroot;
        public misc.hlist_head path_notify;
        public misc.hlist_head inode_alloc_security;
        public misc.hlist_head inode_free_security;
        public misc.hlist_head inode_free_security_rcu;
        public misc.hlist_head inode_init_security;
        public misc.hlist_head inode_init_security_anon;
        public misc.hlist_head inode_create;
        public misc.hlist_head inode_post_create_tmpfile;
        public misc.hlist_head inode_link;
        public misc.hlist_head inode_unlink;
        public misc.hlist_head inode_symlink;
        public misc.hlist_head inode_mkdir;
        public misc.hlist_head inode_rmdir;
        public misc.hlist_head inode_mknod;
        public misc.hlist_head inode_rename;
        public misc.hlist_head inode_readlink;
        public misc.hlist_head inode_follow_link;
        public misc.hlist_head inode_permission;
        public misc.hlist_head inode_setattr;
        public misc.hlist_head inode_post_setattr;
        public misc.hlist_head inode_getattr;
        public misc.hlist_head inode_xattr_skipcap;
        public misc.hlist_head inode_setxattr;
        public misc.hlist_head inode_post_setxattr;
        public misc.hlist_head inode_getxattr;
        public misc.hlist_head inode_listxattr;
        public misc.hlist_head inode_removexattr;
        public misc.hlist_head inode_post_removexattr;
        public misc.hlist_head inode_set_acl;
        public misc.hlist_head inode_post_set_acl;
        public misc.hlist_head inode_get_acl;
        public misc.hlist_head inode_remove_acl;
        public misc.hlist_head inode_post_remove_acl;
        public misc.hlist_head inode_need_killpriv;
        public misc.hlist_head inode_killpriv;
        public misc.hlist_head inode_getsecurity;
        public misc.hlist_head inode_setsecurity;
        public misc.hlist_head inode_listsecurity;
        public misc.hlist_head inode_getsecid;
        public misc.hlist_head inode_copy_up;
        public misc.hlist_head inode_copy_up_xattr;
        public misc.hlist_head inode_setintegrity;
        public misc.hlist_head kernfs_init_security;
        public misc.hlist_head file_permission;
        public misc.hlist_head file_alloc_security;
        public misc.hlist_head file_release;
        public misc.hlist_head file_free_security;
        public misc.hlist_head file_ioctl;
        public misc.hlist_head file_ioctl_compat;
        public misc.hlist_head mmap_addr;
        public misc.hlist_head mmap_file;
        public misc.hlist_head file_mprotect;
        public misc.hlist_head file_lock;
        public misc.hlist_head file_fcntl;
        public misc.hlist_head file_set_fowner;
        public misc.hlist_head file_send_sigiotask;
        public misc.hlist_head file_receive;
        public misc.hlist_head file_open;
        public misc.hlist_head file_post_open;
        public misc.hlist_head file_truncate;
        public misc.hlist_head task_alloc;
        public misc.hlist_head task_free;
        public misc.hlist_head cred_alloc_blank;
        public misc.hlist_head cred_free;
        public misc.hlist_head cred_prepare;
        public misc.hlist_head cred_transfer;
        public misc.hlist_head cred_getsecid;
        public misc.hlist_head kernel_act_as;
        public misc.hlist_head kernel_create_files_as;
        public misc.hlist_head kernel_module_request;
        public misc.hlist_head kernel_load_data;
        public misc.hlist_head kernel_post_load_data;
        public misc.hlist_head kernel_read_file;
        public misc.hlist_head kernel_post_read_file;
        public misc.hlist_head task_fix_setuid;
        public misc.hlist_head task_fix_setgid;
        public misc.hlist_head task_fix_setgroups;
        public misc.hlist_head task_setpgid;
        public misc.hlist_head task_getpgid;
        public misc.hlist_head task_getsid;
        public misc.hlist_head current_getsecid_subj;
        public misc.hlist_head task_getsecid_obj;
        public misc.hlist_head task_setnice;
        public misc.hlist_head task_setioprio;
        public misc.hlist_head task_getioprio;
        public misc.hlist_head task_prlimit;
        public misc.hlist_head task_setrlimit;
        public misc.hlist_head task_setscheduler;
        public misc.hlist_head task_getscheduler;
        public misc.hlist_head task_movememory;
        public misc.hlist_head task_kill;
        public misc.hlist_head task_prctl;
        public misc.hlist_head task_to_inode;
        public misc.hlist_head userns_create;
        public misc.hlist_head ipc_permission;
        public misc.hlist_head ipc_getsecid;
        public misc.hlist_head msg_msg_alloc_security;
        public misc.hlist_head msg_msg_free_security;
        public misc.hlist_head msg_queue_alloc_security;
        public misc.hlist_head msg_queue_free_security;
        public misc.hlist_head msg_queue_associate;
        public misc.hlist_head msg_queue_msgctl;
        public misc.hlist_head msg_queue_msgsnd;
        public misc.hlist_head msg_queue_msgrcv;
        public misc.hlist_head shm_alloc_security;
        public misc.hlist_head shm_free_security;
        public misc.hlist_head shm_associate;
        public misc.hlist_head shm_shmctl;
        public misc.hlist_head shm_shmat;
        public misc.hlist_head sem_alloc_security;
        public misc.hlist_head sem_free_security;
        public misc.hlist_head sem_associate;
        public misc.hlist_head sem_semctl;
        public misc.hlist_head sem_semop;
        public misc.hlist_head netlink_send;
        public misc.hlist_head d_instantiate;
        public misc.hlist_head getselfattr;
        public misc.hlist_head setselfattr;
        public misc.hlist_head getprocattr;
        public misc.hlist_head setprocattr;
        public misc.hlist_head ismaclabel;
        public misc.hlist_head secid_to_secctx;
        public misc.hlist_head secctx_to_secid;
        public misc.hlist_head release_secctx;
        public misc.hlist_head inode_invalidate_secctx;
        public misc.hlist_head inode_notifysecctx;
        public misc.hlist_head inode_setsecctx;
        public misc.hlist_head inode_getsecctx;
        public misc.hlist_head post_notification;
        public misc.hlist_head watch_key;
        public misc.hlist_head unix_stream_connect;
        public misc.hlist_head unix_may_send;
        public misc.hlist_head socket_create;
        public misc.hlist_head socket_post_create;
        public misc.hlist_head socket_socketpair;
        public misc.hlist_head socket_bind;
        public misc.hlist_head socket_connect;
        public misc.hlist_head socket_listen;
        public misc.hlist_head socket_accept;
        public misc.hlist_head socket_sendmsg;
        public misc.hlist_head socket_recvmsg;
        public misc.hlist_head socket_getsockname;
        public misc.hlist_head socket_getpeername;
        public misc.hlist_head socket_getsockopt;
        public misc.hlist_head socket_setsockopt;
        public misc.hlist_head socket_shutdown;
        public misc.hlist_head socket_sock_rcv_skb;
        public misc.hlist_head socket_getpeersec_stream;
        public misc.hlist_head socket_getpeersec_dgram;
        public misc.hlist_head sk_alloc_security;
        public misc.hlist_head sk_free_security;
        public misc.hlist_head sk_clone_security;
        public misc.hlist_head sk_getsecid;
        public misc.hlist_head sock_graft;
        public misc.hlist_head inet_conn_request;
        public misc.hlist_head inet_csk_clone;
        public misc.hlist_head inet_conn_established;
        public misc.hlist_head secmark_relabel_packet;
        public misc.hlist_head secmark_refcount_inc;
        public misc.hlist_head secmark_refcount_dec;
        public misc.hlist_head req_classify_flow;
        public misc.hlist_head tun_dev_alloc_security;
        public misc.hlist_head tun_dev_create;
        public misc.hlist_head tun_dev_attach_queue;
        public misc.hlist_head tun_dev_attach;
        public misc.hlist_head tun_dev_open;
        public misc.hlist_head sctp_assoc_request;
        public misc.hlist_head sctp_bind_connect;
        public misc.hlist_head sctp_sk_clone;
        public misc.hlist_head sctp_assoc_established;
        public misc.hlist_head mptcp_add_subflow;
        public misc.hlist_head ib_pkey_access;
        public misc.hlist_head ib_endport_manage_subnet;
        public misc.hlist_head ib_alloc_security;
        public misc.hlist_head xfrm_policy_alloc_security;
        public misc.hlist_head xfrm_policy_clone_security;
        public misc.hlist_head xfrm_policy_free_security;
        public misc.hlist_head xfrm_policy_delete_security;
        public misc.hlist_head xfrm_state_alloc;
        public misc.hlist_head xfrm_state_alloc_acquire;
        public misc.hlist_head xfrm_state_free_security;
        public misc.hlist_head xfrm_state_delete_security;
        public misc.hlist_head xfrm_policy_lookup;
        public misc.hlist_head xfrm_state_pol_flow_match;
        public misc.hlist_head xfrm_decode_session;
        public misc.hlist_head key_alloc;
        public misc.hlist_head key_permission;
        public misc.hlist_head key_getsecurity;
        public misc.hlist_head key_post_create_or_update;
        public misc.hlist_head audit_rule_init;
        public misc.hlist_head audit_rule_known;
        public misc.hlist_head audit_rule_match;
        public misc.hlist_head audit_rule_free;
        public misc.hlist_head bpf;
        public misc.hlist_head bpf_map;
        public misc.hlist_head bpf_prog;
        public misc.hlist_head bpf_map_create;
        public misc.hlist_head bpf_map_free;
        public misc.hlist_head bpf_prog_load;
        public misc.hlist_head bpf_prog_free;
        public misc.hlist_head bpf_token_create;
        public misc.hlist_head bpf_token_free;
        public misc.hlist_head bpf_token_cmd;
        public misc.hlist_head bpf_token_capable;
        public misc.hlist_head locked_down;
        public misc.hlist_head lock_kernel_down;
        public misc.hlist_head perf_event_open;
        public misc.hlist_head perf_event_alloc;
        public misc.hlist_head perf_event_read;
        public misc.hlist_head perf_event_write;
        public misc.hlist_head uring_override_creds;
        public misc.hlist_head uring_sqpoll;
        public misc.hlist_head uring_cmd;
        public misc.hlist_head initramfs_populated;
        public misc.hlist_head bdev_alloc_security;
        public misc.hlist_head bdev_free_security;
        public misc.hlist_head bdev_setintegrity;
    }

    @Type(noCCodeGeneration=true, cType="union security_list_options")
    @NotUsableInJava
    public static class security_list_options
    extends Union {
        public Ptr<?> binder_set_context_mgr;
        public Ptr<?> binder_transaction;
        public Ptr<?> binder_transfer_binder;
        public Ptr<?> binder_transfer_file;
        public Ptr<?> ptrace_access_check;
        public Ptr<?> ptrace_traceme;
        public Ptr<?> capget;
        public Ptr<?> capset;
        public Ptr<?> capable;
        public Ptr<?> quotactl;
        public Ptr<?> quota_on;
        public Ptr<?> syslog;
        public Ptr<?> settime;
        public Ptr<?> vm_enough_memory;
        public Ptr<?> bprm_creds_for_exec;
        public Ptr<?> bprm_creds_from_file;
        public Ptr<?> bprm_check_security;
        public Ptr<?> bprm_committing_creds;
        public Ptr<?> bprm_committed_creds;
        public Ptr<?> fs_context_submount;
        public Ptr<?> fs_context_dup;
        public Ptr<?> fs_context_parse_param;
        public Ptr<?> sb_alloc_security;
        public Ptr<?> sb_delete;
        public Ptr<?> sb_free_security;
        public Ptr<?> sb_free_mnt_opts;
        public Ptr<?> sb_eat_lsm_opts;
        public Ptr<?> sb_mnt_opts_compat;
        public Ptr<?> sb_remount;
        public Ptr<?> sb_kern_mount;
        public Ptr<?> sb_show_options;
        public Ptr<?> sb_statfs;
        public Ptr<?> sb_mount;
        public Ptr<?> sb_umount;
        public Ptr<?> sb_pivotroot;
        public Ptr<?> sb_set_mnt_opts;
        public Ptr<?> sb_clone_mnt_opts;
        public Ptr<?> move_mount;
        public Ptr<?> dentry_init_security;
        public Ptr<?> dentry_create_files_as;
        public Ptr<?> path_unlink;
        public Ptr<?> path_mkdir;
        public Ptr<?> path_rmdir;
        public Ptr<?> path_mknod;
        public Ptr<?> path_post_mknod;
        public Ptr<?> path_truncate;
        public Ptr<?> path_symlink;
        public Ptr<?> path_link;
        public Ptr<?> path_rename;
        public Ptr<?> path_chmod;
        public Ptr<?> path_chown;
        public Ptr<?> path_chroot;
        public Ptr<?> path_notify;
        public Ptr<?> inode_alloc_security;
        public Ptr<?> inode_free_security;
        public Ptr<?> inode_free_security_rcu;
        public Ptr<?> inode_init_security;
        public Ptr<?> inode_init_security_anon;
        public Ptr<?> inode_create;
        public Ptr<?> inode_post_create_tmpfile;
        public Ptr<?> inode_link;
        public Ptr<?> inode_unlink;
        public Ptr<?> inode_symlink;
        public Ptr<?> inode_mkdir;
        public Ptr<?> inode_rmdir;
        public Ptr<?> inode_mknod;
        public Ptr<?> inode_rename;
        public Ptr<?> inode_readlink;
        public Ptr<?> inode_follow_link;
        public Ptr<?> inode_permission;
        public Ptr<?> inode_setattr;
        public Ptr<?> inode_post_setattr;
        public Ptr<?> inode_getattr;
        public Ptr<?> inode_xattr_skipcap;
        public Ptr<?> inode_setxattr;
        public Ptr<?> inode_post_setxattr;
        public Ptr<?> inode_getxattr;
        public Ptr<?> inode_listxattr;
        public Ptr<?> inode_removexattr;
        public Ptr<?> inode_post_removexattr;
        public Ptr<?> inode_set_acl;
        public Ptr<?> inode_post_set_acl;
        public Ptr<?> inode_get_acl;
        public Ptr<?> inode_remove_acl;
        public Ptr<?> inode_post_remove_acl;
        public Ptr<?> inode_need_killpriv;
        public Ptr<?> inode_killpriv;
        public Ptr<?> inode_getsecurity;
        public Ptr<?> inode_setsecurity;
        public Ptr<?> inode_listsecurity;
        public Ptr<?> inode_getsecid;
        public Ptr<?> inode_copy_up;
        public Ptr<?> inode_copy_up_xattr;
        public Ptr<?> inode_setintegrity;
        public Ptr<?> kernfs_init_security;
        public Ptr<?> file_permission;
        public Ptr<?> file_alloc_security;
        public Ptr<?> file_release;
        public Ptr<?> file_free_security;
        public Ptr<?> file_ioctl;
        public Ptr<?> file_ioctl_compat;
        public Ptr<?> mmap_addr;
        public Ptr<?> mmap_file;
        public Ptr<?> file_mprotect;
        public Ptr<?> file_lock;
        public Ptr<?> file_fcntl;
        public Ptr<?> file_set_fowner;
        public Ptr<?> file_send_sigiotask;
        public Ptr<?> file_receive;
        public Ptr<?> file_open;
        public Ptr<?> file_post_open;
        public Ptr<?> file_truncate;
        public Ptr<?> task_alloc;
        public Ptr<?> task_free;
        public Ptr<?> cred_alloc_blank;
        public Ptr<?> cred_free;
        public Ptr<?> cred_prepare;
        public Ptr<?> cred_transfer;
        public Ptr<?> cred_getsecid;
        public Ptr<?> kernel_act_as;
        public Ptr<?> kernel_create_files_as;
        public Ptr<?> kernel_module_request;
        public Ptr<?> kernel_load_data;
        public Ptr<?> kernel_post_load_data;
        public Ptr<?> kernel_read_file;
        public Ptr<?> kernel_post_read_file;
        public Ptr<?> task_fix_setuid;
        public Ptr<?> task_fix_setgid;
        public Ptr<?> task_fix_setgroups;
        public Ptr<?> task_setpgid;
        public Ptr<?> task_getpgid;
        public Ptr<?> task_getsid;
        public Ptr<?> current_getsecid_subj;
        public Ptr<?> task_getsecid_obj;
        public Ptr<?> task_setnice;
        public Ptr<?> task_setioprio;
        public Ptr<?> task_getioprio;
        public Ptr<?> task_prlimit;
        public Ptr<?> task_setrlimit;
        public Ptr<?> task_setscheduler;
        public Ptr<?> task_getscheduler;
        public Ptr<?> task_movememory;
        public Ptr<?> task_kill;
        public Ptr<?> task_prctl;
        public Ptr<?> task_to_inode;
        public Ptr<?> userns_create;
        public Ptr<?> ipc_permission;
        public Ptr<?> ipc_getsecid;
        public Ptr<?> msg_msg_alloc_security;
        public Ptr<?> msg_msg_free_security;
        public Ptr<?> msg_queue_alloc_security;
        public Ptr<?> msg_queue_free_security;
        public Ptr<?> msg_queue_associate;
        public Ptr<?> msg_queue_msgctl;
        public Ptr<?> msg_queue_msgsnd;
        public Ptr<?> msg_queue_msgrcv;
        public Ptr<?> shm_alloc_security;
        public Ptr<?> shm_free_security;
        public Ptr<?> shm_associate;
        public Ptr<?> shm_shmctl;
        public Ptr<?> shm_shmat;
        public Ptr<?> sem_alloc_security;
        public Ptr<?> sem_free_security;
        public Ptr<?> sem_associate;
        public Ptr<?> sem_semctl;
        public Ptr<?> sem_semop;
        public Ptr<?> netlink_send;
        public Ptr<?> d_instantiate;
        public Ptr<?> getselfattr;
        public Ptr<?> setselfattr;
        public Ptr<?> getprocattr;
        public Ptr<?> setprocattr;
        public Ptr<?> ismaclabel;
        public Ptr<?> secid_to_secctx;
        public Ptr<?> secctx_to_secid;
        public Ptr<?> release_secctx;
        public Ptr<?> inode_invalidate_secctx;
        public Ptr<?> inode_notifysecctx;
        public Ptr<?> inode_setsecctx;
        public Ptr<?> inode_getsecctx;
        public Ptr<?> post_notification;
        public Ptr<?> watch_key;
        public Ptr<?> unix_stream_connect;
        public Ptr<?> unix_may_send;
        public Ptr<?> socket_create;
        public Ptr<?> socket_post_create;
        public Ptr<?> socket_socketpair;
        public Ptr<?> socket_bind;
        public Ptr<?> socket_connect;
        public Ptr<?> socket_listen;
        public Ptr<?> socket_accept;
        public Ptr<?> socket_sendmsg;
        public Ptr<?> socket_recvmsg;
        public Ptr<?> socket_getsockname;
        public Ptr<?> socket_getpeername;
        public Ptr<?> socket_getsockopt;
        public Ptr<?> socket_setsockopt;
        public Ptr<?> socket_shutdown;
        public Ptr<?> socket_sock_rcv_skb;
        public Ptr<?> socket_getpeersec_stream;
        public Ptr<?> socket_getpeersec_dgram;
        public Ptr<?> sk_alloc_security;
        public Ptr<?> sk_free_security;
        public Ptr<?> sk_clone_security;
        public Ptr<?> sk_getsecid;
        public Ptr<?> sock_graft;
        public Ptr<?> inet_conn_request;
        public Ptr<?> inet_csk_clone;
        public Ptr<?> inet_conn_established;
        public Ptr<?> secmark_relabel_packet;
        public Ptr<?> secmark_refcount_inc;
        public Ptr<?> secmark_refcount_dec;
        public Ptr<?> req_classify_flow;
        public Ptr<?> tun_dev_alloc_security;
        public Ptr<?> tun_dev_create;
        public Ptr<?> tun_dev_attach_queue;
        public Ptr<?> tun_dev_attach;
        public Ptr<?> tun_dev_open;
        public Ptr<?> sctp_assoc_request;
        public Ptr<?> sctp_bind_connect;
        public Ptr<?> sctp_sk_clone;
        public Ptr<?> sctp_assoc_established;
        public Ptr<?> mptcp_add_subflow;
        public Ptr<?> ib_pkey_access;
        public Ptr<?> ib_endport_manage_subnet;
        public Ptr<?> ib_alloc_security;
        public Ptr<?> xfrm_policy_alloc_security;
        public Ptr<?> xfrm_policy_clone_security;
        public Ptr<?> xfrm_policy_free_security;
        public Ptr<?> xfrm_policy_delete_security;
        public Ptr<?> xfrm_state_alloc;
        public Ptr<?> xfrm_state_alloc_acquire;
        public Ptr<?> xfrm_state_free_security;
        public Ptr<?> xfrm_state_delete_security;
        public Ptr<?> xfrm_policy_lookup;
        public Ptr<?> xfrm_state_pol_flow_match;
        public Ptr<?> xfrm_decode_session;
        public Ptr<?> key_alloc;
        public Ptr<?> key_permission;
        public Ptr<?> key_getsecurity;
        public Ptr<?> key_post_create_or_update;
        public Ptr<?> audit_rule_init;
        public Ptr<?> audit_rule_known;
        public Ptr<?> audit_rule_match;
        public Ptr<?> audit_rule_free;
        public Ptr<?> bpf;
        public Ptr<?> bpf_map;
        public Ptr<?> bpf_prog;
        public Ptr<?> bpf_map_create;
        public Ptr<?> bpf_map_free;
        public Ptr<?> bpf_prog_load;
        public Ptr<?> bpf_prog_free;
        public Ptr<?> bpf_token_create;
        public Ptr<?> bpf_token_free;
        public Ptr<?> bpf_token_cmd;
        public Ptr<?> bpf_token_capable;
        public Ptr<?> locked_down;
        public Ptr<?> lock_kernel_down;
        public Ptr<?> perf_event_open;
        public Ptr<?> perf_event_alloc;
        public Ptr<?> perf_event_read;
        public Ptr<?> perf_event_write;
        public Ptr<?> uring_override_creds;
        public Ptr<?> uring_sqpoll;
        public Ptr<?> uring_cmd;
        public Ptr<?> initramfs_populated;
        public Ptr<?> bdev_alloc_security;
        public Ptr<?> bdev_free_security;
        public Ptr<?> bdev_setintegrity;
    }
}

