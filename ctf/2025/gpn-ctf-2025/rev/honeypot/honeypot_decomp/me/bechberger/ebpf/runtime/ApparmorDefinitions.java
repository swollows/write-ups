/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.CommonDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ApparmorDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_bprm_committed_creds((const struct linux_binprm*)$arg1)")
    public static void apparmor_bprm_committed_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_bprm_committing_creds((const struct linux_binprm*)$arg1)")
    public static void apparmor_bprm_committing_creds(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_bprm_creds_for_exec(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_capable((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int apparmor_capable(Ptr<runtime.cred> cred2, Ptr<UserDefinitions.user_namespace> ns, int cap, @Unsigned int opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_capget((const struct task_struct*)$arg1, $arg2, $arg3, $arg4)")
    public static int apparmor_capget(Ptr<TaskDefinitions.task_struct> target, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_cred_alloc_blank(Ptr<runtime.cred> cred2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_cred_free(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_cred_prepare($arg1, (const struct cred*)$arg2, $arg3)")
    public static int apparmor_cred_prepare(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_cred_transfer($arg1, (const struct cred*)$arg2)")
    public static void apparmor_cred_transfer(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_current_getsecid_subj(Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_dointvec((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int apparmor_dointvec(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_enabled_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_file_alloc_security(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_file_free_security(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_file_lock(Ptr<runtime.file> file2, @Unsigned int cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_file_mprotect(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long reqprot, @Unsigned long prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_file_open(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_file_permission(Ptr<runtime.file> file2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_file_receive(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_file_truncate(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_getprocattr($arg1, (const u8*)$arg2, $arg3)")
    public static int apparmor_getprocattr(Ptr<TaskDefinitions.task_struct> task2, String name, Ptr<String> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_getselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> lx, Ptr<@Unsigned Integer> size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_inet_conn_request((const struct sock*)$arg1, $arg2, $arg3)")
    public static int apparmor_inet_conn_request(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_inode_getattr((const struct path*)$arg1)")
    public static int apparmor_inode_getattr(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_ip_postroute($arg1, $arg2, (const struct nf_hook_state*)$arg3)")
    public static @Unsigned int apparmor_ip_postroute(Ptr<?> priv, Ptr<SkDefinitions.sk_buff> skb, Ptr<NfDefinitions.nf_hook_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_mmap_file(Ptr<runtime.file> file2, @Unsigned long reqprot, @Unsigned long prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_move_mount((const struct path*)$arg1, (const struct path*)$arg2)")
    public static int apparmor_move_mount(Ptr<runtime.path> from_path, Ptr<runtime.path> to_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_nf_ip_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_nf_register(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_nf_unregister(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_chmod((const struct path*)$arg1, $arg2)")
    public static int apparmor_path_chmod(Ptr<runtime.path> path2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_chown((const struct path*)$arg1, $arg2, $arg3)")
    public static int apparmor_path_chown(Ptr<runtime.path> path2, misc.kuid_t uid, misc.kgid_t gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_link($arg1, (const struct path*)$arg2, $arg3)")
    public static int apparmor_path_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_mkdir((const struct path*)$arg1, $arg2, $arg3)")
    public static int apparmor_path_mkdir(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_mknod((const struct path*)$arg1, $arg2, $arg3, $arg4)")
    public static int apparmor_path_mknod(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_rename((const struct path*)$arg1, $arg2, (const struct path*)$arg3, $arg4, (const unsigned int)$arg5)")
    public static int apparmor_path_rename(Ptr<runtime.path> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_rmdir((const struct path*)$arg1, $arg2)")
    public static int apparmor_path_rmdir(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_symlink((const struct path*)$arg1, $arg2, (const u8*)$arg3)")
    public static int apparmor_path_symlink(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, String old_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_truncate((const struct path*)$arg1)")
    public static int apparmor_path_truncate(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_path_unlink((const struct path*)$arg1, $arg2)")
    public static int apparmor_path_unlink(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_ptrace_access_check(Ptr<TaskDefinitions.task_struct> child, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_ptrace_traceme(Ptr<TaskDefinitions.task_struct> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_sb_mount((const u8*)$arg1, (const struct path*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int apparmor_sb_mount(String dev_name, Ptr<runtime.path> path2, String type2, @Unsigned long flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_sb_pivotroot((const struct path*)$arg1, (const struct path*)$arg2)")
    public static int apparmor_sb_pivotroot(Ptr<runtime.path> old_path, Ptr<runtime.path> new_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_sb_umount(Ptr<runtime.vfsmount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_setprocattr((const u8*)$arg1, $arg2, $arg3)")
    public static int apparmor_setprocattr(String name, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_setselfattr(@Unsigned int attr2, Ptr<LsmDefinitions.lsm_ctx> ctx, @Unsigned int size, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_sk_clone_security((const struct sock*)$arg1, $arg2)")
    public static void apparmor_sk_clone_security(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_sk_free_security(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_sock_graft(Ptr<runtime.sock> sk, Ptr<runtime.socket> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_create(int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_getpeername(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_getpeersec_dgram(Ptr<runtime.socket> sock2, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_getpeersec_stream(Ptr<runtime.socket> sock2, misc.sockptr_t optval, misc.sockptr_t optlen, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_getsockname(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_getsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_post_create(Ptr<runtime.socket> sock2, int family, int type2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_setsockopt(Ptr<runtime.socket> sock2, int level, int optname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_shutdown(Ptr<runtime.socket> sock2, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_socket_sock_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_task_alloc(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long clone_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_task_free(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_task_getsecid_obj(Ptr<TaskDefinitions.task_struct> p, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_task_kill($arg1, $arg2, $arg3, (const struct cred*)$arg4)")
    public static int apparmor_task_kill(Ptr<TaskDefinitions.task_struct> target, Ptr<KernelDefinitions.kernel_siginfo> info2, int sig, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_task_setrlimit(Ptr<TaskDefinitions.task_struct> task2, @Unsigned int resource2, Ptr<runtime.rlimit> new_rlim) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_uring_override_creds((const struct cred*)$arg1)")
    public static int apparmor_uring_override_creds(Ptr<runtime.cred> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_uring_sqpoll() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_userns_create((const struct cred*)$arg1)")
    public static int apparmor_userns_create(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apparmor_release_secctx(String secdata, @Unsigned int seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_secctx_to_secid((const u8*)$arg1, $arg2, $arg3)")
    public static int apparmor_secctx_to_secid(String secdata, @Unsigned int seclen, Ptr<@Unsigned Integer> secid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apparmor_secid_to_secctx(@Unsigned int secid, Ptr<String> secdata, Ptr<@Unsigned Integer> seclen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apparmor_secmark_check($arg1, $arg2, $arg3, $arg4, (const struct sock*)$arg5)")
    public static int apparmor_secmark_check(Ptr<AaDefinitions.aa_label> label, String op, @Unsigned int request2, @Unsigned int secid, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct apparmor_audit_data")
    @NotUsableInJava
    public static class apparmor_audit_data
    extends Struct {
        public int error;
        public int type;
        public @Unsigned short _class;
        public String op;
        public Ptr<runtime.cred> subj_cred;
        public Ptr<AaDefinitions.aa_label> subj_label;
        public String name;
        public String info;
        public @Unsigned int request;
        public @Unsigned int denied;
        @InlineUnion(value=13403)
        public  @InlineUnion(value=13403) AnonDefinitions.anon_member_of_anon_member_of_apparmor_audit_data anon10$0;
        @InlineUnion(value=13403)
        public @InlineUnion(value=13403) misc.iface_of_anon_member_of_apparmor_audit_data iface;
        @InlineUnion(value=13403)
        public @InlineUnion(value=13403) MntDefinitions.mnt_of_anon_member_of_apparmor_audit_data mnt;
        @InlineUnion(value=13403)
        public @InlineUnion(value=13403) misc.uring_of_anon_member_of_apparmor_audit_data uring;
        public CommonDefinitions.common_audit_data common;
    }
}

