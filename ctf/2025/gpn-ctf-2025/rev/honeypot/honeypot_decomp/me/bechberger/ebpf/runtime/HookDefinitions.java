/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class HookDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_file_alloc_security((const struct file*)$arg1)")
    public static int hook_file_alloc_security(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hook_file_free_security(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hook_file_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hook_file_ioctl_compat(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_file_open((const struct file*)$arg1)")
    public static int hook_file_open(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hook_file_set_fowner(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_file_truncate((const struct file*)$arg1)")
    public static int hook_file_truncate(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hook_inode_free_security_rcu(Ptr<?> inode_security) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_move_mount((const const struct path*)$arg1, (const const struct path*)$arg2)")
    public static int hook_move_mount(Ptr<runtime.path> from_path, Ptr<runtime.path> to_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_path_link((const struct dentry*)$arg1, (const const struct path*)$arg2, (const struct dentry*)$arg3)")
    public static int hook_path_link(Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_path_mkdir((const const struct path*)$arg1, (const struct dentry*)$arg2, (const short unsigned int)$arg3)")
    public static int hook_path_mkdir(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_path_mknod((const const struct path*)$arg1, (const struct dentry*)$arg2, (const short unsigned int)$arg3, (const unsigned int)$arg4)")
    public static int hook_path_mknod(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode, @Unsigned int dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_path_rename((const const struct path*)$arg1, (const struct dentry*)$arg2, (const const struct path*)$arg3, (const struct dentry*)$arg4, (const unsigned int)$arg5)")
    public static int hook_path_rename(Ptr<runtime.path> old_dir, Ptr<runtime.dentry> old_dentry, Ptr<runtime.path> new_dir, Ptr<runtime.dentry> new_dentry, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_path_rmdir((const const struct path*)$arg1, (const struct dentry*)$arg2)")
    public static int hook_path_rmdir(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_path_symlink((const const struct path*)$arg1, (const struct dentry*)$arg2, (const const u8*)$arg3)")
    public static int hook_path_symlink(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2, String old_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_path_truncate((const const struct path*)$arg1)")
    public static int hook_path_truncate(Ptr<runtime.path> path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_path_unlink((const const struct path*)$arg1, (const struct dentry*)$arg2)")
    public static int hook_path_unlink(Ptr<runtime.path> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_sb_delete((const struct super_block*)$arg1)")
    public static void hook_sb_delete(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_sb_mount((const const u8*)$arg1, (const const struct path*)$arg2, (const const u8*)$arg3, (const long unsigned int)$arg4, (const void*)$arg5)")
    public static int hook_sb_mount(String dev_name, Ptr<runtime.path> path2, String type2, @Unsigned long flags, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_sb_pivotroot((const const struct path*)$arg1, (const const struct path*)$arg2)")
    public static int hook_sb_pivotroot(Ptr<runtime.path> old_path, Ptr<runtime.path> new_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_sb_remount((const struct super_block*)$arg1, (const void*)$arg2)")
    public static int hook_sb_remount(Ptr<SuperDefinitions.super_block> sb, Ptr<?> mnt_opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_sb_umount((const struct vfsmount*)$arg1, (const int)$arg2)")
    public static int hook_sb_umount(Ptr<runtime.vfsmount> mnt, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hook_file_send_sigiotask(Ptr<TaskDefinitions.task_struct> tsk, Ptr<misc.fown_struct> fown, int signum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_ptrace_access_check((const struct task_struct*)$arg1, (const unsigned int)$arg2)")
    public static int hook_ptrace_access_check(Ptr<TaskDefinitions.task_struct> child, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_ptrace_traceme((const struct task_struct*)$arg1)")
    public static int hook_ptrace_traceme(Ptr<TaskDefinitions.task_struct> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_task_kill((const struct task_struct*)$arg1, (const struct kernel_siginfo*)$arg2, (const int)$arg3, (const const struct cred*)$arg4)")
    public static int hook_task_kill(Ptr<TaskDefinitions.task_struct> p, Ptr<KernelDefinitions.kernel_siginfo> info2, int sig, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_unix_may_send((const struct socket*)$arg1, (const struct socket*)$arg2)")
    public static int hook_unix_may_send(Ptr<runtime.socket> sock2, Ptr<runtime.socket> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_unix_stream_connect((const struct sock*)$arg1, (const struct sock*)$arg2, (const struct sock*)$arg3)")
    public static int hook_unix_stream_connect(Ptr<runtime.sock> sock2, Ptr<runtime.sock> other, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_cred_free((const struct cred*)$arg1)")
    public static void hook_cred_free(Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_cred_prepare((const struct cred*)$arg1, (const const struct cred*)$arg2, (const unsigned int)$arg3)")
    public static int hook_cred_prepare(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_cred_transfer((const struct cred*)$arg1, (const const struct cred*)$arg2)")
    public static void hook_cred_transfer(Ptr<runtime.cred> _new, Ptr<runtime.cred> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_socket_bind((const struct socket*)$arg1, (const struct sockaddr*)$arg2, (const int)$arg3)")
    public static int hook_socket_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hook_socket_connect((const struct socket*)$arg1, (const struct sockaddr*)$arg2, (const int)$arg3)")
    public static int hook_socket_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> address, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }
}

