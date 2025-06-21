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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.Tpm1Definitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class CapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cap_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_validate_magic(@OriginalName(value="cap_user_header_t") Ptr<UserDefinitions.__user_cap_header_struct> header, Ptr<@Unsigned Integer> tocopy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_audit_hotplug(Ptr<IntelDefinitions.intel_iommu> iommu, cap_audit_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_bprm_creds_from_file($arg1, (const struct file*)$arg2)")
    public static int cap_bprm_creds_from_file(Ptr<LinuxDefinitions.linux_binprm> bprm, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_capable((const struct cred*)$arg1, $arg2, $arg3, $arg4)")
    public static int cap_capable(Ptr<runtime.cred> cred2, Ptr<UserDefinitions.user_namespace> targ_ns, int cap, @Unsigned int opts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_capget((const struct task_struct*)$arg1, $arg2, $arg3, $arg4)")
    public static int cap_capget(Ptr<TaskDefinitions.task_struct> target, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_capset($arg1, (const struct cred*)$arg2, (const struct {\n  long long unsigned int val;\n}*)$arg3, (const struct {\n  long long unsigned int val;\n}*)$arg4, (const struct {\n  long long unsigned int val;\n}*)$arg5)")
    public static int cap_capset(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, Ptr<KernelDefinitions.kernel_cap_t> effective, Ptr<KernelDefinitions.kernel_cap_t> inheritable, Ptr<KernelDefinitions.kernel_cap_t> permitted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_convert_nscap($arg1, $arg2, (const void**)$arg3, $arg4)")
    public static int cap_convert_nscap(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<Ptr<?>> ivalue, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_inode_getsecurity($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int cap_inode_getsecurity(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.inode> inode2, String name, Ptr<Ptr<?>> buffer, boolean alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_inode_killpriv(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_inode_need_killpriv(Ptr<runtime.dentry> dentry2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_inode_removexattr($arg1, $arg2, (const u8*)$arg3)")
    public static int cap_inode_removexattr(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_inode_setxattr($arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int cap_inode_setxattr(Ptr<runtime.dentry> dentry2, String name, Ptr<?> value, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_mmap_addr(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_mmap_file(Ptr<runtime.file> file2, @Unsigned long reqprot, @Unsigned long prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_ptrace_access_check(Ptr<TaskDefinitions.task_struct> child, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_ptrace_traceme(Ptr<TaskDefinitions.task_struct> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_safe_nice(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_settime((const struct timespec64*)$arg1, (const struct timezone*)$arg2)")
    public static int cap_settime(Ptr<runtime.timespec64> ts, Ptr<runtime.timezone> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cap_task_fix_setuid($arg1, (const struct cred*)$arg2, $arg3)")
    public static int cap_task_fix_setuid(Ptr<runtime.cred> _new, Ptr<runtime.cred> old, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_task_prctl(int option, @Unsigned long arg2, @Unsigned long arg3, @Unsigned long arg4, @Unsigned long arg5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_task_setioprio(Ptr<TaskDefinitions.task_struct> p, int ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_task_setnice(Ptr<TaskDefinitions.task_struct> p, int nice2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_task_setscheduler(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cap_vm_enough_memory(Ptr<MmDefinitions.mm_struct> mm, long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union { struct permanent_flags_t perm_flags; struct stclear_flags_t stclear_flags; u8 owned; unsigned int num_pcrs; struct tpm1_version version1; struct tpm1_version2 version2; unsigned int manufacturer_id; struct timeout_t timeout; struct duration_t duration; }")
    @NotUsableInJava
    public static class cap_t
    extends Union {
        public misc.permanent_flags_t perm_flags;
        public misc.stclear_flags_t stclear_flags;
        public char owned;
        public @Unsigned @OriginalName(value="__be32") int num_pcrs;
        public Tpm1Definitions.tpm1_version version1;
        public Tpm1Definitions.tpm1_version2 version2;
        public @Unsigned @OriginalName(value="__be32") int manufacturer_id;
        public misc.timeout_t timeout;
        public misc.duration_t duration;
    }

    @Type(noCCodeGeneration=true, cType="enum cap_audit_type")
    public static enum cap_audit_type implements Enum<cap_audit_type>,
    TypedEnum<cap_audit_type, Integer>
    {
        CAP_AUDIT_STATIC_DMAR,
        CAP_AUDIT_STATIC_IRQR,
        CAP_AUDIT_HOTPLUG_DMAR,
        CAP_AUDIT_HOTPLUG_IRQR;

    }
}

