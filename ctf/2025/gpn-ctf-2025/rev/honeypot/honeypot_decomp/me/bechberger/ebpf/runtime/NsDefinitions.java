/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ns_capable(Ptr<UserDefinitions.user_namespace> ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ns_capable_noaudit(Ptr<UserDefinitions.user_namespace> ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ns_capable_setid(Ptr<UserDefinitions.user_namespace> ns, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String ns_dname(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ns_get_name($arg1, $arg2, $arg3, (const struct proc_ns_operations*)$arg4)")
    public static int ns_get_name(String buf, @Unsigned long size, Ptr<TaskDefinitions.task_struct> task2, Ptr<ProcDefinitions.proc_ns_operations> ns_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ns_get_path($arg1, $arg2, (const struct proc_ns_operations*)$arg3)")
    public static int ns_get_path(Ptr<runtime.path> path2, Ptr<TaskDefinitions.task_struct> task2, Ptr<ProcDefinitions.proc_ns_operations> ns_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ns_get_path_cb(Ptr<runtime.path> path2, Ptr<?> ns_get_cb, Ptr<?> private_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ns_ioctl(Ptr<runtime.file> filp, @Unsigned int ioctl, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ns_match((const struct ns_common*)$arg1, $arg2, $arg3)")
    public static boolean ns_match(Ptr<ns_common> ns, @Unsigned @OriginalName(value="dev_t") int dev, @Unsigned @OriginalName(value="ino_t") long ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static KernelDefinitions.__kernel_old_timeval ns_to_kernel_old_timeval(long nsec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static runtime.timespec64 ns_to_timespec64(long nsec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ns_common> ns_get_owner(Ptr<ns_common> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ns_mkdir_op(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ns_revision_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int ns_revision_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> pt2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long ns_revision_read(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ns_revision_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ns_rmdir_op(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ns_get_path_task_args")
    @NotUsableInJava
    public static class ns_get_path_task_args
    extends Struct {
        public Ptr<ProcDefinitions.proc_ns_operations> ns_ops;
        public Ptr<TaskDefinitions.task_struct> task;
    }

    @Type(noCCodeGeneration=true, cType="struct ns_get_path_bpf_map_args")
    @NotUsableInJava
    public static class ns_get_path_bpf_map_args
    extends Struct {
        public Ptr<BpfDefinitions.bpf_offloaded_map> offmap;
        public Ptr<BpfDefinitions.bpf_map_info> info;
    }

    @Type(noCCodeGeneration=true, cType="struct ns_get_path_bpf_prog_args")
    @NotUsableInJava
    public static class ns_get_path_bpf_prog_args
    extends Struct {
        public Ptr<BpfDefinitions.bpf_prog> prog;
        public Ptr<BpfDefinitions.bpf_prog_info> info;
    }

    @Type(noCCodeGeneration=true, cType="struct ns_common")
    @NotUsableInJava
    public static class ns_common
    extends Struct {
        public Ptr<runtime.dentry> stashed;
        public Ptr<ProcDefinitions.proc_ns_operations> ops;
        public @Unsigned int inum;
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
    }
}

