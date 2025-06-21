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
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.InodeDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.NsDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PidDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pid_controller(Ptr<ThermalDefinitions.thermal_zone_device> tz, int control_temp, @Unsigned int max_allocatable_power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pid_for_clock((const int)$arg1, $arg2)")
    public static Ptr<runtime.pid> pid_for_clock(@OriginalName(value="clockid_t") int clock, boolean gettime) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pid_mfd_noexec_dointvec_minmax((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int pid_mfd_noexec_dointvec_minmax(Ptr<misc.ctl_table> table, int write2, Ptr<?> buf, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pid_namespaces_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pid_ns_ctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int pid_ns_ctl_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pid_maps_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pid_numa_maps_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pid_smaps_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pid_child_should_wake(Ptr<WaitDefinitions.wait_opts> wo, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pid_idr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pid_t") int pid_nr_ns(Ptr<runtime.pid> pid2, Ptr<pid_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> pid_task(Ptr<runtime.pid> pid2, pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pid_t") int pid_vnr(Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pid_delete_dentry((const struct dentry*)$arg1)")
    public static int pid_delete_dentry(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pid_entry_nlink((const struct pid_entry*)$arg1, $arg2)")
    public static @Unsigned int pid_entry_nlink(Ptr<pid_entry> entries, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pid_getattr($arg1, (const struct path*)$arg2, $arg3, $arg4, $arg5)")
    public static int pid_getattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.path> path2, Ptr<runtime.kstat> stat2, @Unsigned int request_mask, @Unsigned int query_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pid_list_refill_irq(Ptr<IrqDefinitions.irq_work> iwork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pid_revalidate(Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pid_update_inode(Ptr<TaskDefinitions.task_struct> task2, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pid_entry")
    @NotUsableInJava
    public static class pid_entry
    extends Struct {
        public String name;
        public @Unsigned int len;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public Ptr<InodeDefinitions.inode_operations> iop;
        public Ptr<FileDefinitions.file_operations> fop;
        public ProcDefinitions.proc_op op;
    }

    @Type(noCCodeGeneration=true, cType="struct pid_namespace")
    @NotUsableInJava
    public static class pid_namespace
    extends Struct {
        public runtime.idr idr;
        public misc.callback_head rcu;
        public @Unsigned int pid_allocated;
        public Ptr<TaskDefinitions.task_struct> child_reaper;
        public Ptr<KmemDefinitions.kmem_cache> pid_cachep;
        public @Unsigned int level;
        public Ptr<pid_namespace> parent;
        public Ptr<FsDefinitions.fs_pin> bacct;
        public Ptr<UserDefinitions.user_namespace> user_ns;
        public Ptr<runtime.ucounts> ucounts;
        public int reboot;
        public NsDefinitions.ns_common ns;
        public int memfd_noexec_scope;
    }

    @Type(noCCodeGeneration=true, cType="enum pid_type")
    public static enum pid_type implements Enum<pid_type>,
    TypedEnum<pid_type, Integer>
    {
        PIDTYPE_PID,
        PIDTYPE_TGID,
        PIDTYPE_PGID,
        PIDTYPE_SID,
        PIDTYPE_MAX;

    }
}

