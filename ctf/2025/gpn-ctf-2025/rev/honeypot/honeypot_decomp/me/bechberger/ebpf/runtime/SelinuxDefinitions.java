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
import me.bechberger.ebpf.runtime.AvcDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CommonDefinitions;
import me.bechberger.ebpf.runtime.ConvertDefinitions;
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
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SctpDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SidtabDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SelinuxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_audit_rule_free(Ptr<?> vrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_audit_rule_init(@Unsigned int field, @Unsigned int op, String rulestr, Ptr<Ptr<?>> vrule, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_audit_rule_known(Ptr<AuditDefinitions.audit_krule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_audit_rule_match(@Unsigned int sid, @Unsigned int field, @Unsigned int op, Ptr<?> vrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_avc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_notify_policy_change(@Unsigned int seqno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_policy_cancel(Ptr<selinux_load_state> load_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_policy_commit(Ptr<selinux_load_state> load_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_policy_genfs_sid($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int selinux_policy_genfs_sid(Ptr<selinux_policy> policy, String fstype, String path2, @Unsigned short orig_sclass, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_add_opt($arg1, (const u8*)$arg2, $arg3)")
    public static int selinux_add_opt(int token, String s2, Ptr<Ptr<?>> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_binder_set_context_mgr((const struct cred*)$arg1)")
    public static int selinux_binder_set_context_mgr(Ptr<runtime.cred> mgr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_binder_transaction((const struct cred*)$arg1, (const struct cred*)$arg2)")
    public static int selinux_binder_transaction(Ptr<runtime.cred> from, Ptr<runtime.cred> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_binder_transfer_binder((const struct cred*)$arg1, (const struct cred*)$arg2)")
    public static int selinux_binder_transfer_binder(Ptr<runtime.cred> from, Ptr<runtime.cred> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_binder_transfer_file((const struct cred*)$arg1, (const struct cred*)$arg2, (const struct file*)$arg3)")
    public static int selinux_binder_transfer_file(Ptr<runtime.cred> from, Ptr<runtime.cred> to, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_bpf(int cmd, Ptr<BpfDefinitions.bpf_attr> attr2, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_bpf_map(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned @OriginalName(value="fmode_t") int fmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_bpf_map_create(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_bpf_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_bpf_prog(Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_bpf_prog_free(Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_bpf_prog_load(Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_bpf_token_create($arg1, $arg2, (const struct path*)$arg3)")
    public static int selinux_bpf_token_create(Ptr<BpfDefinitions.bpf_token> token, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_bpf_token_free(Ptr<BpfDefinitions.bpf_token> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_bprm_committed_creds((const struct linux_binprm*)$arg1)")
    public static void selinux_bprm_committed_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_bprm_committing_creds((const struct linux_binprm*)$arg1)")
    public static void selinux_bprm_committing_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_bprm_creds_for_exec(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_capable((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int selinux_capable(Ptr<runtime.cred> cred2, Ptr<UserDefinitions.user_namespace> ns, int cap, @Unsigned int opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_capget((const struct task_struct*)$arg1, $arg2, $arg3, $arg4)")
    public static int selinux_capget(Ptr<TaskDefinitions.task_struct> target, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_capset($arg1, (const struct cred*)$arg2, (const struct {\n  long long unsigned int val;\n}*)$arg3, (const struct {\n  long long unsigned int val;\n}*)$arg4, (const struct {\n  long long unsigned int val;\n}*)$arg5)")
    public static int selinux_capset(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_complete_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_cred_getsecid((const struct cred*)$arg1, $arg2)")
    public static void selinux_cred_getsecid(Ptr<runtime.cred> c, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_cred_prepare($arg1, (const struct cred*)$arg2, $arg3)")
    public static int selinux_cred_prepare(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_cred_transfer($arg1, (const struct cred*)$arg2)")
    public static void selinux_cred_transfer(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_current_getsecid_subj(Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_d_instantiate(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_dentry_create_files_as($arg1, $arg2, $arg3, (const struct cred*)$arg4, $arg5)")
    public static int selinux_dentry_create_files_as(Ptr<runtime.dentry> dentry2, int mode, Ptr<runtime.qstr> name, Ptr<runtime.cred> old, Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_dentry_init_security($arg1, $arg2, (const struct qstr*)$arg3, (const u8**)$arg4, $arg5, $arg6)")
    public static int selinux_dentry_init_security(Ptr<runtime.dentry> dentry2, int mode, Ptr<runtime.qstr> name, Ptr<String> xattr_name2, Ptr<Ptr<?>> ctx, Ptr<@Unsigned Integer> ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_determine_inode_label((const struct task_security_struct*)$arg1, $arg2, (const struct qstr*)$arg3, $arg4, $arg5)")
    public static int selinux_determine_inode_label(Ptr<TaskDefinitions.task_security_struct> tsec, Ptr<runtime.inode> dir, Ptr<runtime.qstr> name, @Unsigned short tclass, Ptr<@Unsigned Integer> _new_isid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_enabled_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_alloc_security(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_fcntl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_ioctl_compat(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_lock(Ptr<runtime.file> file2, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_mprotect(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long reqprot, @Unsigned long prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_open(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_permission(Ptr<runtime.file> file2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_receive(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_file_send_sigiotask(Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.fown_struct> fown, int signum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_file_set_fowner(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_free_mnt_opts(Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_fs_context_dup(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_context> src_fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_fs_context_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_fs_context_submount(Ptr<FsDefinitions.fs_context> fc, Ptr<SuperDefinitions.super_block> reference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_getprocattr($arg1, (const u8*)$arg2, $arg3)")
    public static int selinux_getprocattr(Ptr<TaskDefinitions.task_struct> p, String name, Ptr<String> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_getselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> ctx, Ptr<@Unsigned Integer> size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_ib_alloc_security(Ptr<?> ib_sec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_ib_endport_manage_subnet($arg1, (const u8*)$arg2, $arg3)")
    public static int selinux_ib_endport_manage_subnet(Ptr<?> ib_sec, String dev_name, char port_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_ib_pkey_access(Ptr<?> ib_sec, @Unsigned long subnet_prefix, @Unsigned short pkey_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String selinux_ima_collect_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_ima_measure_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_ima_measure_state_locked() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_inet_conn_established(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inet_conn_request((const struct sock*)$arg1, $arg2, $arg3)")
    public static int selinux_inet_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inet_csk_clone($arg1, (const struct request_sock*)$arg2)")
    public static void selinux_inet_csk_clone(Ptr<runtime.sock> newsk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inet_sys_rcv_skb(Ptr<runtime.net> ns, int ifindex, String addrp, @Unsigned short family, @Unsigned int peer_sid, Ptr<CommonDefinitions.common_audit_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_alloc_security(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_copy_up(Ptr<runtime.dentry> src, Ptr<Ptr<runtime.cred>> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_copy_up_xattr($arg1, (const u8*)$arg2)")
    public static int selinux_inode_copy_up_xattr(Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_create(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_follow_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, boolean rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_inode_free_security(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_get_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int selinux_inode_get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_getattr((const struct path*)$arg1)")
    public static int selinux_inode_getattr(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_getsecctx(Ptr<runtime.inode> inode2, Ptr<Ptr<?>> ctx, Ptr<@Unsigned Integer> ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_inode_getsecid(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_getsecurity($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int selinux_inode_getsecurity(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, String name, Ptr<Ptr<?>> buffer, boolean alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_getxattr($arg1, (const u8*)$arg2)")
    public static int selinux_inode_getxattr(Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_init_security($arg1, $arg2, (const struct qstr*)$arg3, $arg4, $arg5)")
    public static int selinux_inode_init_security(Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> qstr2, Ptr<runtime.xattr> xattrs, Ptr<Integer> xattr_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_init_security_anon($arg1, (const struct qstr*)$arg2, (const struct inode*)$arg3)")
    public static int selinux_inode_init_security_anon(Ptr<runtime.inode> inode2, Ptr<runtime.qstr> name, Ptr<runtime.inode> context_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_inode_invalidate_secctx(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_listsecurity(Ptr<runtime.inode> inode2, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_listxattr(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_mkdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_mknod(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_notifysecctx(Ptr<runtime.inode> inode2, Ptr<?> ctx, @Unsigned int ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_permission(Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_post_setxattr($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static void selinux_inode_post_setxattr(Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_readlink(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int selinux_inode_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int selinux_inode_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_rename(Ptr<runtime.inode> old_inode, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_inode, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_set_acl($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int selinux_inode_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_setsecctx(Ptr<runtime.dentry> dentry2, Ptr<?> ctx, @Unsigned int ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_setsecurity($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int selinux_inode_setsecurity(Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_setxattr($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int selinux_inode_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_symlink($arg1, $arg2, (const u8*)$arg3)")
    public static int selinux_inode_symlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_inode_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_inode_xattr_skipcap((const u8*)$arg1)")
    public static int selinux_inode_xattr_skipcap(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_ip_forward($arg1, $arg2, (const struct nf_hook_state*)$arg3)")
    public static @Unsigned int selinux_ip_forward(Ptr<?> priv, Ptr<SkDefinitions.sk_buff> skb, Ptr<NfDefinitions.nf_hook_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_ip_output($arg1, $arg2, (const struct nf_hook_state*)$arg3)")
    public static @Unsigned int selinux_ip_output(Ptr<?> priv, Ptr<SkDefinitions.sk_buff> skb, Ptr<NfDefinitions.nf_hook_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_ip_postroute($arg1, $arg2, (const struct nf_hook_state*)$arg3)")
    public static @Unsigned int selinux_ip_postroute(Ptr<?> priv, Ptr<SkDefinitions.sk_buff> skb, Ptr<NfDefinitions.nf_hook_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_ip_postroute_compat($arg1, (const struct nf_hook_state*)$arg2)")
    public static @Unsigned int selinux_ip_postroute_compat(Ptr<SkDefinitions.sk_buff> skb, Ptr<NfDefinitions.nf_hook_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_ipc_getsecid(Ptr<misc.kern_ipc_perm> ipcp, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_ipc_permission(Ptr<misc.kern_ipc_perm> ipcp, short flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_ismaclabel((const u8*)$arg1)")
    public static int selinux_ismaclabel(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_kernel_act_as(Ptr<runtime.cred> _new, @Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_kernel_create_files_as(Ptr<runtime.cred> _new, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_kernel_load_data(KernelDefinitions.kernel_load_data_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_kernel_module_from_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_kernel_module_request(String kmod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_kernel_read_file(Ptr<runtime.file> file2, KernelDefinitions.kernel_read_file_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_kernfs_init_security(Ptr<KernfsDefinitions.kernfs_node> kn_dir, Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_key_alloc($arg1, (const struct cred*)$arg2, $arg3)")
    public static int selinux_key_alloc(Ptr<runtime.key> k, Ptr<runtime.cred> cred2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_key_getsecurity(Ptr<runtime.key> key2, Ptr<String> _buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_key_permission($arg1, (const struct cred*)$arg2, $arg3)")
    public static int selinux_key_permission(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> key_ref, Ptr<runtime.cred> cred2, KeyDefinitions.key_need_perm need_perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_lsm_getattr(@Unsigned int attr2, Ptr<TaskDefinitions.task_struct> p, Ptr<String> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_lsm_notifier_avc_callback(@Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_lsm_setattr(@Unsigned long attr2, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_mmap_addr(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_mmap_file(Ptr<runtime.file> file2, @Unsigned long reqprot, @Unsigned long prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_mount((const u8*)$arg1, (const struct path*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int selinux_mount(String dev_name, Ptr<runtime.path> path2, String type2, @Unsigned long flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_move_mount((const struct path*)$arg1, (const struct path*)$arg2)")
    public static int selinux_move_mount(Ptr<runtime.path> from_path, Ptr<runtime.path> to_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_mptcp_add_subflow(Ptr<runtime.sock> sk, Ptr<runtime.sock> ssk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_msg_msg_alloc_security(Ptr<MsgDefinitions.msg_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_msg_queue_alloc_security(Ptr<misc.kern_ipc_perm> msq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_msg_queue_associate(Ptr<misc.kern_ipc_perm> msq, int msqflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_msg_queue_msgctl(Ptr<misc.kern_ipc_perm> msq, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_msg_queue_msgrcv(Ptr<misc.kern_ipc_perm> msq, Ptr<MsgDefinitions.msg_msg> msg, Ptr<TaskDefinitions.task_struct> target, long type2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_msg_queue_msgsnd(Ptr<misc.kern_ipc_perm> msq, Ptr<MsgDefinitions.msg_msg> msg, int msqflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netcache_avc_callback(@Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlink_send(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_nf_ip_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_nf_register(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_nf_unregister(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_parse_skb(Ptr<SkDefinitions.sk_buff> skb, Ptr<CommonDefinitions.common_audit_data> ad, Ptr<String> _addrp, int src, Ptr<Character> proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_parse_skb_ipv4(Ptr<SkDefinitions.sk_buff> skb, Ptr<CommonDefinitions.common_audit_data> ad, Ptr<Character> proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_parse_skb_ipv6(Ptr<SkDefinitions.sk_buff> skb, Ptr<CommonDefinitions.common_audit_data> ad, Ptr<Character> proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_path_notify((const struct path*)$arg1, $arg2, $arg3)")
    public static int selinux_path_notify(Ptr<runtime.path> path2, @Unsigned long mask, @Unsigned int obj_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_perf_event_alloc(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_perf_event_open(Ptr<PerfDefinitions.perf_event_attr> attr2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_perf_event_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_perf_event_write(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_ptrace_access_check(Ptr<TaskDefinitions.task_struct> child, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_ptrace_traceme(Ptr<TaskDefinitions.task_struct> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_quota_on(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_quotactl($arg1, $arg2, $arg3, (const struct super_block*)$arg4)")
    public static int selinux_quotactl(int cmds, int type2, int id, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_release_secctx(String secdata, @Unsigned int seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_req_classify_flow((const struct request_sock*)$arg1, $arg2)")
    public static void selinux_req_classify_flow(Ptr<RequestDefinitions.request_sock> req2, Ptr<misc.flowi_common> flic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sb_alloc_security(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_sb_clone_mnt_opts((const struct super_block*)$arg1, $arg2, $arg3, $arg4)")
    public static int selinux_sb_clone_mnt_opts(Ptr<SuperDefinitions.super_block> oldsb, Ptr<SuperDefinitions.super_block> newsb, @Unsigned long kern_flags, Ptr<@Unsigned Long> set_kern_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sb_eat_lsm_opts(String options, Ptr<Ptr<?>> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_sb_kern_mount((const struct super_block*)$arg1)")
    public static int selinux_sb_kern_mount(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sb_mnt_opts_compat(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sb_remount(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sb_show_options(Ptr<SeqDefinitions.seq_file> m, Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sb_statfs(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sctp_assoc_established(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sctp_assoc_request(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sctp_bind_connect(Ptr<runtime.sock> sk, int optname, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sctp_process_new_assoc(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_sctp_sk_clone(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_secctx_to_secid((const u8*)$arg1, $arg2, $arg3)")
    public static int selinux_secctx_to_secid(String secdata, @Unsigned int seclen, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_secid_to_secctx(@Unsigned int secid, Ptr<String> secdata, Ptr<@Unsigned Integer> seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_secmark_refcount_dec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_secmark_refcount_inc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_secmark_relabel_packet(@Unsigned int sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sem_alloc_security(Ptr<misc.kern_ipc_perm> sma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sem_associate(Ptr<misc.kern_ipc_perm> sma, int semflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sem_semctl(Ptr<misc.kern_ipc_perm> sma, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sem_semop(Ptr<misc.kern_ipc_perm> sma, Ptr<runtime.sembuf> sops, @Unsigned int nsops, int alter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_set_mnt_opts(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts, @Unsigned long kern_flags, Ptr<@Unsigned Long> set_kern_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_setprocattr((const u8*)$arg1, $arg2, $arg3)")
    public static int selinux_setprocattr(String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_setselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> ctx, @Unsigned int size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_shm_alloc_security(Ptr<misc.kern_ipc_perm> shp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_shm_associate(Ptr<misc.kern_ipc_perm> shp, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_shm_shmat(Ptr<misc.kern_ipc_perm> shp, String shmaddr, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_shm_shmctl(Ptr<misc.kern_ipc_perm> shp, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sk_alloc_security(Ptr<runtime.sock> sk, int family, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_sk_clone_security((const struct sock*)$arg1, $arg2)")
    public static void selinux_sk_clone_security(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_sk_free_security(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_sk_getsecid((const struct sock*)$arg1, $arg2)")
    public static void selinux_sk_getsecid(Ptr<runtime.sock> sk, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_skb_peerlbl_sid(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_sock_graft(Ptr<runtime.sock> sk, Ptr<runtime.socket> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_sock_rcv_skb_compat(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_create(int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_getpeername(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_getpeersec_dgram(Ptr<runtime.socket> sock2, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_getpeersec_stream(Ptr<runtime.socket> sock2, misc.sockptr_t optval, misc.sockptr_t optlen, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_getsockname(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_getsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_post_create(Ptr<runtime.socket> sock2, int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_setsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_shutdown(Ptr<runtime.socket> sock2, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_sock_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_socketpair(Ptr<runtime.socket> socka, Ptr<runtime.socket> sockb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_unix_may_send(Ptr<runtime.socket> sock2, Ptr<runtime.socket> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_socket_unix_stream_connect(Ptr<runtime.sock> sock2, Ptr<runtime.sock> other, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_syslog(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_alloc(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_getioprio(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_getpgid(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_getscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_task_getsecid_obj(Ptr<TaskDefinitions.task_struct> p, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_getsid(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_task_kill($arg1, $arg2, $arg3, (const struct cred*)$arg4)")
    public static int selinux_task_kill(Ptr<TaskDefinitions.task_struct> p, Ptr<KernelDefinitions.kernel_siginfo> info2, int sig, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_movememory(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_task_prlimit((const struct cred*)$arg1, (const struct cred*)$arg2, $arg3)")
    public static int selinux_task_prlimit(Ptr<runtime.cred> cred2, Ptr<runtime.cred> tcred, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_setioprio(Ptr<TaskDefinitions.task_struct> p, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_setnice(Ptr<TaskDefinitions.task_struct> p, int nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_setpgid(Ptr<TaskDefinitions.task_struct> p, @OriginalName(value="pid_t") int pgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_setrlimit(Ptr<TaskDefinitions.task_struct> p, @Unsigned int resource2, Ptr<runtime.rlimit> new_rlim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_task_setscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_task_to_inode(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_tun_dev_alloc_security(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_tun_dev_attach(Ptr<runtime.sock> sk, Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_tun_dev_attach_queue(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_tun_dev_create() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_tun_dev_open(Ptr<?> security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_umount(Ptr<runtime.vfsmount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_uring_cmd(Ptr<IoDefinitions.io_uring_cmd> ioucmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_uring_override_creds((const struct cred*)$arg1)")
    public static int selinux_uring_override_creds(Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_uring_sqpoll() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_userns_create((const struct cred*)$arg1)")
    public static int selinux_userns_create(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_vm_enough_memory(Ptr<MmDefinitions.mm_struct> mm, long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_watch_key(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_alloc_user(Ptr<Ptr<XfrmDefinitions.xfrm_sec_ctx>> ctxp, Ptr<XfrmDefinitions.xfrm_user_sec_ctx> uctx, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_decode_session(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> sid, int ckall) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_policy_alloc(Ptr<Ptr<XfrmDefinitions.xfrm_sec_ctx>> ctxp, Ptr<XfrmDefinitions.xfrm_user_sec_ctx> uctx, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_policy_clone(Ptr<XfrmDefinitions.xfrm_sec_ctx> old_ctx, Ptr<Ptr<XfrmDefinitions.xfrm_sec_ctx>> new_ctxp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_policy_delete(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_xfrm_policy_free(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_policy_lookup(Ptr<XfrmDefinitions.xfrm_sec_ctx> ctx, @Unsigned int fl_secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_postroute_last(@Unsigned int sk_sid, Ptr<SkDefinitions.sk_buff> skb, Ptr<CommonDefinitions.common_audit_data> ad, char proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_skb_sid(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_skb_sid_ingress(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> sid, int ckall) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_sock_rcv_skb(@Unsigned int sk_sid, Ptr<SkDefinitions.sk_buff> skb, Ptr<CommonDefinitions.common_audit_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_state_alloc(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_user_sec_ctx> uctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_state_alloc_acquire(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_sec_ctx> polsec, @Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_xfrm_state_delete(Ptr<XfrmDefinitions.xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_xfrm_state_free(Ptr<XfrmDefinitions.xfrm_state> x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_xfrm_state_pol_flow_match($arg1, $arg2, (const struct flowi_common*)$arg3)")
    public static int selinux_xfrm_state_pol_flow_match(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<XfrmDefinitions.xfrm_policy> xp, Ptr<misc.flowi_common> flic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_fs_info_free(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.page> selinux_kernel_status_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_netlbl_cache_invalidate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_netlbl_err(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, int error, int gateway) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_inet_conn_request(Ptr<RequestDefinitions.request_sock> req2, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_netlbl_inet_csk_clone(Ptr<runtime.sock> sk, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_sctp_assoc_request(Ptr<SctpDefinitions.sctp_association> asoc, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_netlbl_sctp_sk_clone(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_netlbl_sk_security_free(Ptr<SkDefinitions.sk_security_struct> sksec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_netlbl_sk_security_reset(Ptr<SkDefinitions.sk_security_struct> sksec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_skbuff_getsid(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<@Unsigned Integer> type2, Ptr<@Unsigned Integer> sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_skbuff_setsid(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, @Unsigned int sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetlblDefinitions.netlbl_lsm_secattr> selinux_netlbl_sock_genattr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_sock_rcv_skb(Ptr<SkDefinitions.sk_security_struct> sksec, Ptr<SkDefinitions.sk_buff> skb, @Unsigned short family, Ptr<CommonDefinitions.common_audit_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_socket_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_socket_connect_locked(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_socket_post_create(Ptr<runtime.sock> sk, @Unsigned short family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_netlbl_socket_setsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int selinux_nlmsg_lookup(@Unsigned short sclass, @Unsigned short nlmsg_type, Ptr<@Unsigned Integer> perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_status_update_policyload(@Unsigned int seqno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void selinux_status_update_setenforce(boolean enforcing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="selinux_transaction_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long selinux_transaction_write(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum selinux_nlgroups")
    public static enum selinux_nlgroups implements Enum<selinux_nlgroups>,
    TypedEnum<selinux_nlgroups, Integer>
    {
        SELNLGRP_NONE,
        SELNLGRP_AVC,
        __SELNLGRP_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct selinux_mnt_opts")
    @NotUsableInJava
    public static class selinux_mnt_opts
    extends Struct {
        public @Unsigned int fscontext_sid;
        public @Unsigned int context_sid;
        public @Unsigned int rootcontext_sid;
        public @Unsigned int defcontext_sid;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_audit_rule")
    @NotUsableInJava
    public static class selinux_audit_rule
    extends Struct {
        public @Unsigned int au_seqno;
        public runtime.context au_ctxt;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_map")
    @NotUsableInJava
    public static class selinux_map
    extends Struct {
        public Ptr<selinux_mapping> mapping;
        public @Unsigned short size;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_mapping")
    @NotUsableInJava
    public static class selinux_mapping
    extends Struct {
        public @Unsigned short value;
        public @Unsigned short num_perms;
        public @Unsigned int @Size(value=32) [] perms;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_policy_convert_data")
    @NotUsableInJava
    public static class selinux_policy_convert_data
    extends Struct {
        public ConvertDefinitions.convert_context_args args;
        public SidtabDefinitions.sidtab_convert_params sidtab_params;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_policy")
    @NotUsableInJava
    public static class selinux_policy
    extends Struct {
        public Ptr<runtime.sidtab> sidtab;
        public runtime.policydb policydb;
        public selinux_map map;
        public @Unsigned int latest_granting;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_avc")
    @NotUsableInJava
    public static class selinux_avc
    extends Struct {
        public @Unsigned int avc_cache_threshold;
        public AvcDefinitions.avc_cache avc_cache;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_kernel_status")
    @NotUsableInJava
    public static class selinux_kernel_status
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int sequence;
        public @Unsigned int enforcing;
        public @Unsigned int policyload;
        public @Unsigned int deny_unknown;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_fs_info")
    @NotUsableInJava
    public static class selinux_fs_info
    extends Struct {
        public Ptr<runtime.dentry> bool_dir;
        public @Unsigned int bool_num;
        public Ptr<String> bool_pending_names;
        public Ptr<Integer> bool_pending_values;
        public Ptr<runtime.dentry> class_dir;
        public @Unsigned long last_class_ino;
        public boolean policy_opened;
        public Ptr<runtime.dentry> policycap_dir;
        public @Unsigned long last_ino;
        public Ptr<SuperDefinitions.super_block> sb;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_load_state")
    @NotUsableInJava
    public static class selinux_load_state
    extends Struct {
        public Ptr<selinux_policy> policy;
        public Ptr<selinux_policy_convert_data> convert_data;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_state")
    @NotUsableInJava
    public static class selinux_state
    extends Struct {
        public boolean enforcing;
        public boolean initialized;
        public boolean @Size(value=9) [] policycap;
        public Ptr<runtime.page> status_page;
        public runtime.mutex status_lock;
        public Ptr<selinux_policy> policy;
        public runtime.mutex policy_mutex;
    }

    @Type(noCCodeGeneration=true, cType="struct selinux_audit_data")
    @NotUsableInJava
    public static class selinux_audit_data
    extends Struct {
        public @Unsigned int ssid;
        public @Unsigned int tsid;
        public @Unsigned short tclass;
        public @Unsigned int requested;
        public @Unsigned int audited;
        public @Unsigned int denied;
        public int result;
    }
}

