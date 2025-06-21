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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.ApparmorDefinitions;
import me.bechberger.ebpf.runtime.ContextDefinitions;
import me.bechberger.ebpf.runtime.FanotifyDefinitions;
import me.bechberger.ebpf.runtime.FsnotifyDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmapDefinitions;
import me.bechberger.ebpf.runtime.MqDefinitions;
import me.bechberger.ebpf.runtime.OpenDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class AuditDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_add_watch(Ptr<audit_krule> krule, Ptr<Ptr<ListDefinitions.list_head>> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_fsnotify_mark> audit_alloc_mark(Ptr<audit_krule> krule, String pathname, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_cb(Ptr<audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_dupe_exe(Ptr<audit_krule> _new, Ptr<audit_krule> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_exe_compare(Ptr<TaskDefinitions.task_struct> tsk, Ptr<audit_fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_fsnotify_free_mark(Ptr<FsnotifyDefinitions.fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_fsnotify_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_get_watch(Ptr<audit_watch> watch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_watch> audit_init_watch(String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_mark_compare(Ptr<audit_fsnotify_mark> mark, @Unsigned long ino, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_mark_handle_event($arg1, $arg2, $arg3, $arg4, (const struct qstr*)$arg5, $arg6)")
    public static int audit_mark_handle_event(Ptr<FsnotifyDefinitions.fsnotify_mark> inode_mark, @Unsigned int mask, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> dname, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String audit_mark_path(Ptr<audit_fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_mnt_flags(Ptr<audit_buffer> ab, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_ns_cb(Ptr<audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_ptrace_cb(Ptr<audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_put_watch(Ptr<audit_watch> watch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_remove_mark(Ptr<audit_fsnotify_mark> audit_mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_remove_mark_rule(Ptr<audit_krule> krule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_remove_parent_watches(Ptr<audit_parent> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_remove_watch_rule(Ptr<audit_krule> krule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_to_watch(Ptr<audit_krule> krule, String path2, int len, @Unsigned int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_update_watch($arg1, (const struct qstr*)$arg2, $arg3, $arg4, $arg5)")
    public static void audit_update_watch(Ptr<audit_parent> parent, Ptr<runtime.qstr> dname, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned long ino, @Unsigned int invalidating) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_uring_cb(Ptr<audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_watch_compare(Ptr<audit_watch> watch2, @Unsigned long ino, @Unsigned @OriginalName(value="dev_t") int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_watch_free_mark(Ptr<FsnotifyDefinitions.fsnotify_mark> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_watch_handle_event($arg1, $arg2, $arg3, $arg4, (const struct qstr*)$arg5, $arg6)")
    public static int audit_watch_handle_event(Ptr<FsnotifyDefinitions.fsnotify_mark> inode_mark, @Unsigned int mask, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> dname, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_watch_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String audit_watch_path(Ptr<audit_watch> watch2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_bprm(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_fanotify(@Unsigned int response, Ptr<FanotifyDefinitions.fanotify_response_info_audit_rule> friar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_fd_pair(int fd1, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_file((const struct file*)$arg1)")
    public static void __audit_file(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __audit_filter_op(Ptr<TaskDefinitions.task_struct> tsk, Ptr<audit_context> ctx, Ptr<ListDefinitions.list_head> list, Ptr<audit_names> name, @Unsigned long op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_free(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_getname(Ptr<runtime.filename> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_inode($arg1, (const struct dentry*)$arg2, $arg3)")
    public static void __audit_inode(Ptr<runtime.filename> name, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_inode_child($arg1, (const struct dentry*)$arg2, (const u8)$arg3)")
    public static void __audit_inode_child(Ptr<runtime.inode> parent, Ptr<runtime.dentry> dentry2, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_ipc_obj(Ptr<misc.kern_ipc_perm> ipcp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_ipc_set_perm(@Unsigned long qbytes, @Unsigned @OriginalName(value="uid_t") int uid, @Unsigned @OriginalName(value="gid_t") int gid, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_log_bprm_fcaps($arg1, (const struct cred*)$arg2, (const struct cred*)$arg3)")
    public static int __audit_log_bprm_fcaps(Ptr<LinuxDefinitions.linux_binprm> bprm, Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_log_capset((const struct cred*)$arg1, (const struct cred*)$arg2)")
    public static void __audit_log_capset(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_log_kern_module(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_log_nfcfg((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static void __audit_log_nfcfg(String name, char af, @Unsigned int nentries, audit_nfcfgop op, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_mmap_fd(int fd2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_mq_getsetattr(@OriginalName(value="mqd_t") int mqdes, Ptr<MqDefinitions.mq_attr> mqstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_mq_notify($arg1, (const struct sigevent*)$arg2)")
    public static void __audit_mq_notify(@OriginalName(value="mqd_t") int mqdes, Ptr<runtime.sigevent> notification2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_mq_open(int oflag, @Unsigned @OriginalName(value="umode_t") short mode, Ptr<MqDefinitions.mq_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_mq_sendrecv($arg1, $arg2, $arg3, (const struct timespec64*)$arg4)")
    public static void __audit_mq_sendrecv(@OriginalName(value="mqd_t") int mqdes, @Unsigned long msg_len, @Unsigned int msg_prio, Ptr<runtime.timespec64> abs_timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_ntp_log((const struct audit_ntp_data*)$arg1)")
    public static void __audit_ntp_log(Ptr<audit_ntp_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_openat2_how(Ptr<OpenDefinitions.open_how> how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_ptrace(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__audit_reusename((const u8*)$arg1)")
    public static Ptr<runtime.filename> __audit_reusename(String uptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __audit_sockaddr(int len, Ptr<?> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __audit_socketcall(int nargs, Ptr<@Unsigned Long> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_syscall_entry(int major, @Unsigned long a1, @Unsigned long a2, @Unsigned long a3, @Unsigned long a4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_syscall_exit(int success, long return_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_tk_injoffset(runtime.timespec64 offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_uring_entry(char op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __audit_uring_exit(int success, long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_alloc(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_names> audit_alloc_name(Ptr<audit_context> context2, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_compare_gid(misc.kgid_t gid, Ptr<audit_names> name, Ptr<audit_field> f, Ptr<audit_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_compare_uid(misc.kuid_t uid, Ptr<audit_names> name, Ptr<audit_field> f, Ptr<audit_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_copy_inode($arg1, (const struct dentry*)$arg2, $arg3, $arg4)")
    public static void audit_copy_inode(Ptr<audit_names> name, Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_core_dumps(long signr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_field_compare($arg1, (const struct cred*)$arg2, $arg3, $arg4, $arg5)")
    public static int audit_field_compare(Ptr<TaskDefinitions.task_struct> tsk, Ptr<runtime.cred> cred2, Ptr<audit_field> f, Ptr<audit_context> ctx, Ptr<audit_names> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_filter_inodes(Ptr<TaskDefinitions.task_struct> tsk, Ptr<audit_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_filter_rules(Ptr<TaskDefinitions.task_struct> tsk, Ptr<audit_krule> rule, Ptr<audit_context> ctx, Ptr<audit_names> name, Ptr<audit_state> state2, boolean task_creation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_inode_permission(Ptr<runtime.inode> inode2, @Unsigned int perms, @Unsigned int audited, @Unsigned int denied, int result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> audit_killed_trees() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_execve_info(Ptr<audit_context> context2, Ptr<Ptr<audit_buffer>> ab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_log_pid_context(Ptr<audit_context> context2, @OriginalName(value="pid_t") int pid2, misc.kuid_t auid, misc.kuid_t uid, @Unsigned int sessionid, @Unsigned int sid, String comm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_proctitle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_task(Ptr<audit_buffer> ab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_uring(Ptr<audit_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_match_perm(Ptr<audit_context> ctx, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_pre(Ptr<audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_reset_context(Ptr<audit_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_seccomp(@Unsigned long syscall2, long signr, int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_seccomp_actions_logged((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static void audit_seccomp_actions_logged(String names, String old_names, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_signal_info_syscall(Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_actions_logged(@Unsigned int actions_logged, @Unsigned int old_actions_logged, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_backlog_limit_set(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_ctl_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_ctl_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_enable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TtyDefinitions.tty_struct> audit_get_tty() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static void audit_log(Ptr<audit_context> ctx, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int type2, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_common_recv_msg(Ptr<audit_context> context2, Ptr<Ptr<audit_buffer>> ab, @Unsigned short msg_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_log_config_change(String function_name, @Unsigned int _new, @Unsigned int old, int allow_changes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_d_path($arg1, (const u8*)$arg2, (const struct path*)$arg3)")
    public static void audit_log_d_path(Ptr<audit_buffer> ab, String prefix, Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_d_path_exe(Ptr<audit_buffer> ab, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_end(Ptr<audit_buffer> ab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_feature_change(int which, @Unsigned int old_feature, @Unsigned int new_feature, @Unsigned int old_lock, @Unsigned int new_lock, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_format($arg1, (const u8*)$arg2, $arg3_)")
    public static void audit_log_format(Ptr<audit_buffer> ab, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_key(Ptr<audit_buffer> ab, String key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_lost((const u8*)$arg1)")
    public static void audit_log_lost(String message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_multicast($arg1, (const u8*)$arg2, $arg3)")
    public static void audit_log_multicast(int group, String op, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_n_hex($arg1, (const u8*)$arg2, $arg3)")
    public static void audit_log_n_hex(Ptr<audit_buffer> ab, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_n_string($arg1, (const u8*)$arg2, $arg3)")
    public static void audit_log_n_string(Ptr<audit_buffer> ab, String string, @Unsigned long slen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_n_untrustedstring($arg1, (const u8*)$arg2, $arg3)")
    public static void audit_log_n_untrustedstring(Ptr<audit_buffer> ab, String string, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_path_denied($arg1, (const u8*)$arg2)")
    public static void audit_log_path_denied(int type2, String operation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_session_info(Ptr<audit_buffer> ab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_buffer> audit_log_start(Ptr<audit_context> ctx, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_log_task_context(Ptr<audit_buffer> ab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_task_info(Ptr<audit_buffer> ab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_untrustedstring($arg1, (const u8*)$arg2)")
    public static void audit_log_untrustedstring(Ptr<audit_buffer> ab, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_log_vformat($arg1, (const u8*)$arg2, $arg3)")
    public static void audit_log_vformat(Ptr<audit_buffer> ab, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_make_reply($arg1, $arg2, $arg3, $arg4, (const void*)$arg5, $arg6)")
    public static Ptr<SkDefinitions.sk_buff> audit_make_reply(int seq, int type2, int done, int multi, Ptr<?> payload, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_multicast_bind(Ptr<runtime.net> net2, int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_multicast_unbind(Ptr<runtime.net> net2, int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_panic((const u8*)$arg1)")
    public static void audit_panic(String message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_put_tty(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_receive(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_receive_msg(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<@OriginalName(value="bool") Boolean> ack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_replace(Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_resource((const struct cred*)$arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, $arg7)")
    public static int audit_resource(Ptr<runtime.cred> subj_cred, Ptr<AaDefinitions.aa_profile> profile, @Unsigned int resource2, @Unsigned long value, Ptr<AaDefinitions.aa_label> peer, String info2, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_send_list_thread(Ptr<?> _dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_send_reply_thread(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int audit_serial() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_set_enabled(@Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_set_loginuid(misc.kuid_t loginuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_signal_cb(Ptr<audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_signal_info(int sig, Ptr<TaskDefinitions.task_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_string_contains_control((const u8*)$arg1, $arg2)")
    public static boolean audit_string_contains_control(String string, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_add_rule(Ptr<audit_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_add_tree_rule(Ptr<audit_krule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_caps(Ptr<ApparmorDefinitions.apparmor_audit_data> ad, Ptr<AaDefinitions.aa_profile> profile, int cap, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_classes_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_classify_arch(int arch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_classify_syscall(int abi, @Unsigned int syscall2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_comparator(@Unsigned int left, @Unsigned int op, @Unsigned int right) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_compare_dname_path((const struct qstr*)$arg1, (const u8*)$arg2, $arg3)")
    public static int audit_compare_dname_path(Ptr<runtime.qstr> dname, String path2, int parentlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_compare_rule(Ptr<audit_krule> a, Ptr<audit_krule> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_entry> audit_data_to_entry(Ptr<audit_rule_data> data, @Unsigned long datasz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_del_rule(Ptr<audit_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_entry> audit_dupe_rule(Ptr<audit_krule> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_filter(int msgtype, @Unsigned int listtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_entry> audit_find_rule(Ptr<audit_entry> entry, Ptr<Ptr<ListDefinitions.list_head>> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_free_rule_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_gid_comparator(misc.kgid_t left, @Unsigned int op, misc.kgid_t right) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_entry> audit_init_entry(@Unsigned int field_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_kill_trees(Ptr<audit_context> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<audit_rule_data> audit_krule_to_data(Ptr<audit_krule> krule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_list_rules_send(Ptr<SkDefinitions.sk_buff> request_skb, int seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_log_rule_change(String action, Ptr<audit_krule> rule, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_make_tree(Ptr<audit_krule> rule, String pathname, @Unsigned int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_match_class(int _class2, @Unsigned int syscall2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_match_signal(Ptr<audit_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_net_cb(Ptr<audit_buffer> ab, Ptr<?> va) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_pack_string($arg1, (const u8*)$arg2)")
    public static @Unsigned long audit_pack_string(Ptr<Ptr<?>> bufp, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_put_chunk(Ptr<audit_chunk> chunk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_put_tree(Ptr<audit_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_register_class(int _class2, Ptr<@Unsigned Integer> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_remove_tree_rule(Ptr<audit_krule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_rule_change(int type2, int seq, Ptr<?> data, @Unsigned long datasz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_tag_tree(String old, String _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_tree_destroy_watch(Ptr<FsnotifyDefinitions.fsnotify_mark> mark) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_tree_freeing_mark(Ptr<FsnotifyDefinitions.fsnotify_mark> mark, Ptr<FsnotifyDefinitions.fsnotify_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_tree_handle_event($arg1, $arg2, $arg3, $arg4, (const struct qstr*)$arg5, $arg6)")
    public static int audit_tree_handle_event(Ptr<FsnotifyDefinitions.fsnotify_mark> mark, @Unsigned int mask, Ptr<runtime.inode> inode2, Ptr<runtime.inode> dir, Ptr<runtime.qstr> file_name, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_tree_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="audit_tree_lookup((const struct inode*)$arg1)")
    public static Ptr<audit_chunk> audit_tree_lookup(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean audit_tree_match(Ptr<audit_chunk> chunk, Ptr<audit_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)audit_tree_path($arg1))")
    public static String audit_tree_path(Ptr<audit_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void audit_trim_trees() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_uid_comparator(misc.kuid_t left, @Unsigned int op, misc.kuid_t right) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String audit_unpack_string(Ptr<Ptr<?>> bufp, Ptr<@Unsigned Long> remain, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int audit_update_lsm_rules() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct audit_reply")
    @NotUsableInJava
    public static class audit_reply
    extends Struct {
        public @Unsigned int portid;
        public Ptr<runtime.net> net;
        public Ptr<SkDefinitions.sk_buff> skb;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_buffer")
    @NotUsableInJava
    public static class audit_buffer
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<audit_context> ctx;
        public @Unsigned @OriginalName(value="gfp_t") int gfp_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_ctl_mutex")
    @NotUsableInJava
    public static class audit_ctl_mutex
    extends Struct {
        public runtime.mutex lock;
        public Ptr<?> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_net")
    @NotUsableInJava
    public static class audit_net
    extends Struct {
        public Ptr<runtime.sock> sk;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_sig_info")
    @NotUsableInJava
    public static class audit_sig_info
    extends Struct {
        public @Unsigned @OriginalName(value="uid_t") int uid;
        public @OriginalName(value="pid_t") int pid;
        public char @Size(value=0) [] ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_tty_status")
    @NotUsableInJava
    public static class audit_tty_status
    extends Struct {
        public @Unsigned int enabled;
        public @Unsigned int log_passwd;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_features")
    @NotUsableInJava
    public static class audit_features
    extends Struct {
        public @Unsigned int vers;
        public @Unsigned int mask;
        public @Unsigned int features;
        public @Unsigned int lock;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_status")
    @NotUsableInJava
    public static class audit_status
    extends Struct {
        public @Unsigned int mask;
        public @Unsigned int enabled;
        public @Unsigned int failure;
        public @Unsigned int pid;
        public @Unsigned int rate_limit;
        public @Unsigned int backlog_limit;
        public @Unsigned int lost;
        public @Unsigned int backlog;
        @InlineUnion(value=90414)
        public @InlineUnion(value=90414) @Unsigned int version;
        @InlineUnion(value=90414)
        public @InlineUnion(value=90414) @Unsigned int feature_bitmap;
        public @Unsigned int backlog_wait_time;
        public @Unsigned int backlog_wait_time_actual;
    }

    @Type(noCCodeGeneration=true, cType="enum audit_nlgrps")
    public static enum audit_nlgrps implements Enum<audit_nlgrps>,
    TypedEnum<audit_nlgrps, Integer>
    {
        AUDIT_NLGRP_NONE,
        AUDIT_NLGRP_READLOG,
        __AUDIT_NLGRP_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct audit_nfcfgop_tab")
    @NotUsableInJava
    public static class audit_nfcfgop_tab
    extends Struct {
        public audit_nfcfgop op;
        public String s;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_aux_data_bprm_fcaps")
    @NotUsableInJava
    public static class audit_aux_data_bprm_fcaps
    extends Struct {
        public audit_aux_data d;
        public audit_cap_data fcap;
        public @Unsigned int fcap_ver;
        public audit_cap_data old_pcap;
        public audit_cap_data new_pcap;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_aux_data_pids")
    @NotUsableInJava
    public static class audit_aux_data_pids
    extends Struct {
        public audit_aux_data d;
        public @OriginalName(value="pid_t") int @Size(value=16) [] target_pid;
        public misc.kuid_t @Size(value=16) [] target_auid;
        public misc.kuid_t @Size(value=16) [] target_uid;
        public @Unsigned int @Size(value=16) [] target_sessionid;
        public @Unsigned int @Size(value=16) [] target_sid;
        public char @Size(value=256) [] target_comm;
        public int pid_count;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_tree_refs")
    @NotUsableInJava
    public static class audit_tree_refs
    extends Struct {
        public Ptr<audit_tree_refs> next;
        public Ptr<audit_chunk> @Size(value=31) [] c;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_aux_data")
    @NotUsableInJava
    public static class audit_aux_data
    extends Struct {
        public Ptr<audit_aux_data> next;
        public int type;
    }

    @Type(noCCodeGeneration=true, cType="enum audit_nfcfgop")
    public static enum audit_nfcfgop implements Enum<audit_nfcfgop>,
    TypedEnum<audit_nfcfgop, Integer>
    {
        AUDIT_XT_OP_REGISTER,
        AUDIT_XT_OP_REPLACE,
        AUDIT_XT_OP_UNREGISTER,
        AUDIT_NFT_OP_TABLE_REGISTER,
        AUDIT_NFT_OP_TABLE_UNREGISTER,
        AUDIT_NFT_OP_CHAIN_REGISTER,
        AUDIT_NFT_OP_CHAIN_UNREGISTER,
        AUDIT_NFT_OP_RULE_REGISTER,
        AUDIT_NFT_OP_RULE_UNREGISTER,
        AUDIT_NFT_OP_SET_REGISTER,
        AUDIT_NFT_OP_SET_UNREGISTER,
        AUDIT_NFT_OP_SETELEM_REGISTER,
        AUDIT_NFT_OP_SETELEM_UNREGISTER,
        AUDIT_NFT_OP_GEN_REGISTER,
        AUDIT_NFT_OP_OBJ_REGISTER,
        AUDIT_NFT_OP_OBJ_UNREGISTER,
        AUDIT_NFT_OP_OBJ_RESET,
        AUDIT_NFT_OP_FLOWTABLE_REGISTER,
        AUDIT_NFT_OP_FLOWTABLE_UNREGISTER,
        AUDIT_NFT_OP_SETELEM_RESET,
        AUDIT_NFT_OP_RULE_RESET,
        AUDIT_NFT_OP_INVALID;

    }

    @Type(noCCodeGeneration=true, cType="struct audit_fsnotify_mark")
    @NotUsableInJava
    public static class audit_fsnotify_mark
    extends Struct {
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned long ino;
        public String path;
        public FsnotifyDefinitions.fsnotify_mark mark;
        public Ptr<audit_krule> rule;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_parent")
    @NotUsableInJava
    public static class audit_parent
    extends Struct {
        public ListDefinitions.list_head watches;
        public FsnotifyDefinitions.fsnotify_mark mark;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_watch")
    @NotUsableInJava
    public static class audit_watch
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public String path;
        public @Unsigned long ino;
        public Ptr<audit_parent> parent;
        public ListDefinitions.list_head wlist;
        public ListDefinitions.list_head rules;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_cache")
    @NotUsableInJava
    public static class audit_cache
    extends Struct {
        public Ptr<AaDefinitions.aa_profile> profile;
        public KernelDefinitions.kernel_cap_t caps;
    }

    @Type(noCCodeGeneration=true, cType="enum audit_type")
    public static enum audit_type implements Enum<audit_type>,
    TypedEnum<audit_type, Integer>
    {
        AUDIT_APPARMOR_AUDIT,
        AUDIT_APPARMOR_ALLOWED,
        AUDIT_APPARMOR_DENIED,
        AUDIT_APPARMOR_HINT,
        AUDIT_APPARMOR_STATUS,
        AUDIT_APPARMOR_ERROR,
        AUDIT_APPARMOR_KILL,
        AUDIT_APPARMOR_AUTO;

    }

    @Type(noCCodeGeneration=true, cType="enum audit_mode")
    public static enum audit_mode implements Enum<audit_mode>,
    TypedEnum<audit_mode, Integer>
    {
        AUDIT_NORMAL,
        AUDIT_QUIET_DENIED,
        AUDIT_QUIET,
        AUDIT_NOQUIET,
        AUDIT_ALL;

    }

    @Type(noCCodeGeneration=true, cType="struct audit_tree_mark")
    @NotUsableInJava
    public static class audit_tree_mark
    extends Struct {
        public FsnotifyDefinitions.fsnotify_mark mark;
        public Ptr<audit_chunk> chunk;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_node")
    @NotUsableInJava
    public static class audit_node
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<audit_tree> owner;
        public @Unsigned int index;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_chunk")
    @NotUsableInJava
    public static class audit_chunk
    extends Struct {
        public ListDefinitions.list_head hash;
        public @Unsigned long key;
        public Ptr<FsnotifyDefinitions.fsnotify_mark> mark;
        public ListDefinitions.list_head trees;
        public int count;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t refs;
        public misc.callback_head head;
        public audit_node @Size(value=0) [] owners;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_tree")
    @NotUsableInJava
    public static class audit_tree
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public int goner;
        public Ptr<audit_chunk> root;
        public ListDefinitions.list_head chunks;
        public ListDefinitions.list_head rules;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head same_root;
        public misc.callback_head head;
        public char @Size(value=0) [] pathname;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_netlink_list")
    @NotUsableInJava
    public static class audit_netlink_list
    extends Struct {
        public @Unsigned int portid;
        public Ptr<runtime.net> net;
        public SkDefinitions.sk_buff_head q;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_proctitle")
    @NotUsableInJava
    public static class audit_proctitle
    extends Struct {
        public int len;
        public String value;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_cap_data")
    @NotUsableInJava
    public static class audit_cap_data
    extends Struct {
        public KernelDefinitions.kernel_cap_t permitted;
        public KernelDefinitions.kernel_cap_t inheritable;
        @InlineUnion(value=8134)
        public @InlineUnion(value=8134) @Unsigned int fE;
        @InlineUnion(value=8134)
        public  @InlineUnion(value=8134) KernelDefinitions.kernel_cap_t effective;
        public KernelDefinitions.kernel_cap_t ambient;
        public misc.kuid_t rootid;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_entry")
    @NotUsableInJava
    public static class audit_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
        public audit_krule rule;
    }

    @Type(noCCodeGeneration=true, cType="enum audit_state")
    public static enum audit_state implements Enum<audit_state>,
    TypedEnum<audit_state, Integer>
    {
        AUDIT_STATE_DISABLED,
        AUDIT_STATE_BUILD,
        AUDIT_STATE_RECORD;

    }

    @Type(noCCodeGeneration=true, cType="struct audit_field")
    @NotUsableInJava
    public static class audit_field
    extends Struct {
        public @Unsigned int type;
        @InlineUnion(value=8121)
        public @InlineUnion(value=8121) @Unsigned int val;
        @InlineUnion(value=8121)
        public @InlineUnion(value=8121) misc.kuid_t uid;
        @InlineUnion(value=8121)
        public @InlineUnion(value=8121) misc.kgid_t gid;
        @InlineUnion(value=8121)
        public  @InlineUnion(value=8121) AnonDefinitions.anon_member_of_anon_member_of_audit_field anon1$3;
        public @Unsigned int op;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_krule")
    @NotUsableInJava
    public static class audit_krule
    extends Struct {
        public @Unsigned int pflags;
        public @Unsigned int flags;
        public @Unsigned int listnr;
        public @Unsigned int action;
        public @Unsigned int @Size(value=64) [] mask;
        public @Unsigned int buflen;
        public @Unsigned int field_count;
        public String filterkey;
        public Ptr<audit_field> fields;
        public Ptr<audit_field> arch_f;
        public Ptr<audit_field> inode_f;
        public Ptr<audit_watch> watch;
        public Ptr<audit_tree> tree;
        public Ptr<audit_fsnotify_mark> exe;
        public ListDefinitions.list_head rlist;
        public ListDefinitions.list_head list;
        public @Unsigned long prio;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_rule_data")
    @NotUsableInJava
    public static class audit_rule_data
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int action;
        public @Unsigned int field_count;
        public @Unsigned int @Size(value=64) [] mask;
        public @Unsigned int @Size(value=64) [] fields;
        public @Unsigned int @Size(value=64) [] values;
        public @Unsigned int @Size(value=64) [] fieldflags;
        public @Unsigned int buflen;
        public char @Size(value=0) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_names")
    @NotUsableInJava
    public static class audit_names
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.filename> name;
        public int name_len;
        public boolean hidden;
        public @Unsigned long ino;
        public @Unsigned @OriginalName(value="dev_t") int dev;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public misc.kuid_t uid;
        public misc.kgid_t gid;
        public @Unsigned @OriginalName(value="dev_t") int rdev;
        public @Unsigned int osid;
        public audit_cap_data fcap;
        public @Unsigned int fcap_ver;
        public char type;
        public boolean should_free;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_context")
    @NotUsableInJava
    public static class audit_context
    extends Struct {
        public int dummy;
        public ContextDefinitions.context_of_audit_context context;
        public audit_state state;
        public audit_state current_state;
        public @Unsigned int serial;
        public int major;
        public int uring_op;
        public runtime.timespec64 ctime;
        public @Unsigned long @Size(value=4) [] argv;
        public long return_code;
        public @Unsigned long prio;
        public int return_valid;
        public audit_names @Size(value=5) [] preallocated_names;
        public int name_count;
        public ListDefinitions.list_head names_list;
        public String filterkey;
        public runtime.path pwd;
        public Ptr<audit_aux_data> aux;
        public Ptr<audit_aux_data> aux_pids;
        public Ptr<KernelDefinitions.__kernel_sockaddr_storage> sockaddr;
        public @Unsigned long sockaddr_len;
        public @OriginalName(value="pid_t") int ppid;
        public misc.kuid_t uid;
        public misc.kuid_t euid;
        public misc.kuid_t suid;
        public misc.kuid_t fsuid;
        public misc.kgid_t gid;
        public misc.kgid_t egid;
        public misc.kgid_t sgid;
        public misc.kgid_t fsgid;
        public @Unsigned long personality;
        public int arch;
        public @OriginalName(value="pid_t") int target_pid;
        public misc.kuid_t target_auid;
        public misc.kuid_t target_uid;
        public @Unsigned int target_sessionid;
        public @Unsigned int target_sid;
        public char @Size(value=16) [] target_comm;
        public Ptr<audit_tree_refs> trees;
        public Ptr<audit_tree_refs> first_trees;
        public ListDefinitions.list_head killed_trees;
        public int tree_count;
        public int type;
        @InlineUnion(value=8149)
        public @InlineUnion(value=8149) misc.socketcall_of_anon_member_of_audit_context socketcall;
        @InlineUnion(value=8149)
        public  @InlineUnion(value=8149) IpcDefinitions.ipc_of_anon_member_of_audit_context ipc;
        @InlineUnion(value=8149)
        public  @InlineUnion(value=8149) MqDefinitions.mq_getsetattr_of_anon_member_of_audit_context mq_getsetattr;
        @InlineUnion(value=8149)
        public  @InlineUnion(value=8149) MqDefinitions.mq_notify_of_anon_member_of_audit_context mq_notify;
        @InlineUnion(value=8149)
        public  @InlineUnion(value=8149) MqDefinitions.mq_sendrecv_of_anon_member_of_audit_context mq_sendrecv;
        @InlineUnion(value=8149)
        public  @InlineUnion(value=8149) MqDefinitions.mq_open_of_anon_member_of_audit_context mq_open;
        @InlineUnion(value=8149)
        public @InlineUnion(value=8149) misc.capset_of_anon_member_of_audit_context capset;
        @InlineUnion(value=8149)
        public @InlineUnion(value=8149) MmapDefinitions.mmap_of_anon_member_of_audit_context mmap;
        @InlineUnion(value=8149)
        public  @InlineUnion(value=8149) OpenDefinitions.open_how openat2;
        @InlineUnion(value=8149)
        public @InlineUnion(value=8149) misc.execve_of_anon_member_of_audit_context execve;
        @InlineUnion(value=8149)
        public  @InlineUnion(value=8149) ModuleDefinitions.module_of_anon_member_of_audit_context module;
        @InlineUnion(value=8149)
        public @InlineUnion(value=8149) misc.time_of_anon_member_of_audit_context time;
        public int @Size(value=2) [] fds;
        public audit_proctitle proctitle;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_ntp_data")
    @NotUsableInJava
    public static class audit_ntp_data
    extends Struct {
        public audit_ntp_val @Size(value=6) [] vals;
    }

    @Type(noCCodeGeneration=true, cType="struct audit_ntp_val")
    @NotUsableInJava
    public static class audit_ntp_val
    extends Struct {
        public long oldval;
        public long newval;
    }

    @Type(noCCodeGeneration=true, cType="enum audit_ntp_type")
    public static enum audit_ntp_type implements Enum<audit_ntp_type>,
    TypedEnum<audit_ntp_type, Integer>
    {
        AUDIT_NTP_OFFSET,
        AUDIT_NTP_FREQ,
        AUDIT_NTP_STATUS,
        AUDIT_NTP_TAI,
        AUDIT_NTP_TICK,
        AUDIT_NTP_ADJUST,
        AUDIT_NTP_NVALS;

    }
}

