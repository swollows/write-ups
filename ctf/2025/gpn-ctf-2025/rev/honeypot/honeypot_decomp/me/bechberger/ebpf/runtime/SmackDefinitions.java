/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.OriginalNames;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.MsgDefinitions;
import me.bechberger.ebpf.runtime.NetlblDefinitions;
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.PosixDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SmkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WatchDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SmackDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_add_opt($arg1, (const u8*)$arg2, $arg3)")
    public static int smack_add_opt(int token, String s2, Ptr<Ptr<?>> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_audit_rule_init(@Unsigned int field, @Unsigned int op, String rulestr, Ptr<Ptr<?>> vrule, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_audit_rule_known(Ptr<AuditDefinitions.audit_krule> krule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_audit_rule_match(@Unsigned int secid, @Unsigned int field, @Unsigned int op, Ptr<?> vrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_bprm_creds_for_exec(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_cred_alloc_blank(Ptr<runtime.cred> cred2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_cred_free(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_cred_getsecid((const struct cred*)$arg1, $arg2)")
    public static void smack_cred_getsecid(Ptr<runtime.cred> cred2, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_cred_prepare($arg1, (const struct cred*)$arg2, $arg3)")
    public static int smack_cred_prepare(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_cred_transfer($arg1, (const struct cred*)$arg2)")
    public static void smack_cred_transfer(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_current_getsecid_subj(Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_d_instantiate(Ptr<runtime.dentry> opt_dentry, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_dentry_create_files_as($arg1, $arg2, $arg3, (const struct cred*)$arg4, $arg5)")
    public static int smack_dentry_create_files_as(Ptr<runtime.dentry> dentry2, int mode, Ptr<runtime.qstr> name, Ptr<runtime.cred> old, Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_file_alloc_security(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_file_fcntl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_file_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_file_lock(Ptr<runtime.file> file2, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_file_open(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_file_receive(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_file_send_sigiotask(Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.fown_struct> fown, int signum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_file_set_fowner(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_free_mnt_opts(Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_from_netlbl((const struct sock*)$arg1, $arg2, $arg3)")
    public static Ptr<smack_known> smack_from_netlbl(Ptr<runtime.sock> sk, @Unsigned short family, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_fs_context_dup(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_context> src_fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_fs_context_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_fs_context_submount(Ptr<FsDefinitions.fs_context> fc, Ptr<SuperDefinitions.super_block> reference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_getprocattr($arg1, (const u8*)$arg2, $arg3)")
    public static int smack_getprocattr(Ptr<TaskDefinitions.task_struct> p, String name, Ptr<String> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_getselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> ctx, Ptr<@Unsigned Integer> size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inet_conn_request((const struct sock*)$arg1, $arg2, $arg3)")
    public static int smack_inet_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inet_csk_clone($arg1, (const struct request_sock*)$arg2)")
    public static void smack_inet_csk_clone(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_alloc_security(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_copy_up(Ptr<runtime.dentry> dentry2, Ptr<Ptr<runtime.cred>> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_copy_up_xattr($arg1, (const u8*)$arg2)")
    public static int smack_inode_copy_up_xattr(Ptr<runtime.dentry> src, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_get_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int smack_inode_get_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_getattr((const struct path*)$arg1)")
    public static int smack_inode_getattr(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_getsecctx(Ptr<runtime.inode> inode2, Ptr<Ptr<?>> ctx, Ptr<@Unsigned Integer> ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_inode_getsecid(Ptr<runtime.inode> inode2, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_getsecurity($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int smack_inode_getsecurity(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, String name, Ptr<Ptr<?>> buffer, boolean alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_getxattr($arg1, (const u8*)$arg2)")
    public static int smack_inode_getxattr(Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_init_security($arg1, $arg2, (const struct qstr*)$arg3, $arg4, $arg5)")
    public static int smack_inode_init_security(Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> qstr2, Ptr<runtime.xattr> xattrs, Ptr<Integer> xattr_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_listsecurity(Ptr<runtime.inode> inode2, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_notifysecctx(Ptr<runtime.inode> inode2, Ptr<?> ctx, @Unsigned int ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_permission(Ptr<runtime.inode> inode2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_post_setxattr($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static void smack_inode_post_setxattr(Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_remove_acl($arg1, $arg2, (const u8*)$arg3)")
    public static int smack_inode_remove_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int smack_inode_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_rename(Ptr<runtime.inode> old_inode, Ptr<runtime.dentry> old_dentry, Ptr<runtime.inode> new_inode, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_rmdir(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_set_acl($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int smack_inode_set_acl(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String acl_name, Ptr<PosixDefinitions.posix_acl> kacl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_setattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> iattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_setsecctx(Ptr<runtime.dentry> dentry2, Ptr<?> ctx, @Unsigned int ctxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_setsecurity($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int smack_inode_setsecurity(Ptr<runtime.inode> inode2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_setxattr($arg1, $arg2, (const u8*)$arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int smack_inode_setxattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_inode_unlink(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_inode_xattr_skipcap((const u8*)$arg1)")
    public static int smack_inode_xattr_skipcap(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_ipc_alloc_security(Ptr<misc.kern_ipc_perm> isp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_ipc_getsecid(Ptr<misc.kern_ipc_perm> ipp, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_ipc_permission(Ptr<misc.kern_ipc_perm> ipp, short flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<smack_known> smack_ipv6host_label(Ptr<misc.sockaddr_in6> sip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_ismaclabel((const u8*)$arg1)")
    public static int smack_ismaclabel(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_kernel_act_as(Ptr<runtime.cred> _new, @Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_kernel_create_files_as(Ptr<runtime.cred> _new, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_key_alloc($arg1, (const struct cred*)$arg2, $arg3)")
    public static int smack_key_alloc(Ptr<runtime.key> key2, Ptr<runtime.cred> cred2, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_key_getsecurity(Ptr<runtime.key> key2, Ptr<String> _buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_key_permission($arg1, (const struct cred*)$arg2, $arg3)")
    public static int smack_key_permission(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> key_ref, Ptr<runtime.cred> cred2, KeyDefinitions.key_need_perm need_perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_mmap_file(Ptr<runtime.file> file2, @Unsigned long reqprot, @Unsigned long prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_msg_msg_alloc_security(Ptr<MsgDefinitions.msg_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_msg_queue_associate(Ptr<misc.kern_ipc_perm> isp, int msqflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_msg_queue_msgctl(Ptr<misc.kern_ipc_perm> isp, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_msg_queue_msgrcv(Ptr<misc.kern_ipc_perm> isp, Ptr<MsgDefinitions.msg_msg> msg, Ptr<TaskDefinitions.task_struct> target, long type2, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_msg_queue_msgsnd(Ptr<misc.kern_ipc_perm> isp, Ptr<MsgDefinitions.msg_msg> msg, int msqflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_netlbl_add(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_post_notification((const struct cred*)$arg1, (const struct cred*)$arg2, $arg3)")
    public static int smack_post_notification(Ptr<runtime.cred> w_cred, Ptr<runtime.cred> cred2, Ptr<WatchDefinitions.watch_notification> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_ptrace_access_check(Ptr<TaskDefinitions.task_struct> ctp, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_ptrace_traceme(Ptr<TaskDefinitions.task_struct> ptp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_sb_alloc_security(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_sb_eat_lsm_opts(String options, Ptr<Ptr<?>> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_sb_statfs(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_secctx_to_secid((const u8*)$arg1, $arg2, $arg3)")
    public static int smack_secctx_to_secid(String secdata, @Unsigned int seclen, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_secid_to_secctx(@Unsigned int secid, Ptr<String> secdata, Ptr<@Unsigned Integer> seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_sem_associate(Ptr<misc.kern_ipc_perm> isp, int semflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_sem_semctl(Ptr<misc.kern_ipc_perm> isp, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_sem_semop(Ptr<misc.kern_ipc_perm> isp, Ptr<runtime.sembuf> sops, @Unsigned int nsops, int alter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_set_mnt_opts(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts, @Unsigned long kern_flags, Ptr<@Unsigned Long> set_kern_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_setprocattr((const u8*)$arg1, $arg2, $arg3)")
    public static int smack_setprocattr(String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_setselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> ctx, @Unsigned int size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_shm_associate(Ptr<misc.kern_ipc_perm> isp, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_shm_shmat(Ptr<misc.kern_ipc_perm> isp, String shmaddr, int shmflg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_shm_shmctl(Ptr<misc.kern_ipc_perm> isp, int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_sk_alloc_security(Ptr<runtime.sock> sk, int family, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_sk_clone_security((const struct sock*)$arg1, $arg2)")
    public static void smack_sk_clone_security(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_sock_graft(Ptr<runtime.sock> sk, Ptr<runtime.socket> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_socket_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> sap, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_socket_getpeersec_dgram(Ptr<runtime.socket> sock2, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_socket_getpeersec_stream(Ptr<runtime.socket> sock2, misc.sockptr_t optval, misc.sockptr_t optlen, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_socket_post_create(Ptr<runtime.socket> sock2, int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_socket_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_socket_sock_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_socket_socketpair(Ptr<runtime.socket> socka, Ptr<runtime.socket> sockb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_syslog(int typefrom_file) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_getioprio(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_getpgid(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_getscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_task_getsecid_obj(Ptr<TaskDefinitions.task_struct> p, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_getsid(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_task_kill($arg1, $arg2, $arg3, (const struct cred*)$arg4)")
    public static int smack_task_kill(Ptr<TaskDefinitions.task_struct> p, Ptr<KernelDefinitions.kernel_siginfo> info2, int sig, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_movememory(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_setioprio(Ptr<TaskDefinitions.task_struct> p, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_setnice(Ptr<TaskDefinitions.task_struct> p, int nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_setpgid(Ptr<TaskDefinitions.task_struct> p, @OriginalName(value="pid_t") int pgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_task_setscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_task_to_inode(Ptr<TaskDefinitions.task_struct> p, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_unix_may_send(Ptr<runtime.socket> sock2, Ptr<runtime.socket> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_unix_stream_connect(Ptr<runtime.sock> sock2, Ptr<runtime.sock> other, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_uring_cmd(Ptr<IoDefinitions.io_uring_cmd> ioucmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_uring_override_creds((const struct cred*)$arg1)")
    public static int smack_uring_override_creds(Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_uring_sqpoll() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_watch_key(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_ip_output($arg1, $arg2, (const struct nf_hook_state*)$arg3)")
    public static @Unsigned int smack_ip_output(Ptr<?> priv, Ptr<SkDefinitions.sk_buff> skb, Ptr<NfDefinitions.nf_hook_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_nf_ip_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_nf_register(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_nf_unregister(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_from_secid((const unsigned int)$arg1)")
    public static Ptr<smack_known> smack_from_secid(@Unsigned int secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_log(String subject_label, String object_label, int request2, int result, Ptr<SmkDefinitions.smk_audit_info> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void smack_log_callback(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<?> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int smack_populate_secattr(Ptr<smack_known> skp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean smack_privileged(int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="smack_privileged_cred($arg1, (const struct cred*)$arg2)")
    public static boolean smack_privileged_cred(int cap, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct smack_mnt_opts")
    @NotUsableInJava
    public static class smack_mnt_opts
    extends Struct {
        public String fsdefault;
        public String fsfloor;
        public String fshat;
        public String fsroot;
        public String fstransmute;
    }

    @Type(noCCodeGeneration=true, cType="struct smack_parsed_rule")
    @NotUsableInJava
    public static class smack_parsed_rule
    extends Struct {
        public Ptr<smack_known> smk_subject;
        public Ptr<smack_known> smk_object;
        public int smk_access1;
        public int smk_access2;
    }

    @Type(noCCodeGeneration=true, cType="struct smack_known_list_elem")
    @NotUsableInJava
    public static class smack_known_list_elem
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<smack_known> smk_label;
    }

    @Type(noCCodeGeneration=true, cType="struct smack_rule")
    @NotUsableInJava
    public static class smack_rule
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<smack_known> smk_subject;
        public Ptr<smack_known> smk_object;
        public int smk_access;
    }

    @Type(noCCodeGeneration=true, cType="struct smack_known")
    @NotUsableInJava
    public static class smack_known
    extends Struct {
        public ListDefinitions.list_head list;
        public misc.hlist_node smk_hashed;
        public String smk_known;
        public @Unsigned int smk_secid;
        public NetlblDefinitions.netlbl_lsm_secattr smk_netlabel;
        public ListDefinitions.list_head smk_rules;
        public runtime.mutex smk_rules_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct smack_audit_data")
    @NotUsableInJava
    public static class smack_audit_data
    extends Struct {
        public String function;
        public String subject;
        public String object;
        public String request;
        public int result;
    }
}

