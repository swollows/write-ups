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
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.CtxDefinitions;
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ToDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KillDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kill_accessing_process(Ptr<TaskDefinitions.task_struct> p, @Unsigned long pfn, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_fasync(Ptr<Ptr<misc.fasync_struct>> fp, int sig, int band) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kill_proc(Ptr<ToDefinitions.to_kill> tk, @Unsigned long pfn, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_procs(Ptr<ListDefinitions.list_head> to_kill2, int forcekill, @Unsigned long pfn, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kill_pgrp_info(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<runtime.pid> pgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_dev_dax(Ptr<DevDefinitions.dev_dax> dev_dax2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_kprobe(Ptr<runtime.kprobe> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_me_maybe(Ptr<misc.callback_head> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_me_never(Ptr<misc.callback_head> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_me_now(Ptr<misc.callback_head> ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_pending_fw_fallback_reqs(boolean kill_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kill_pgrp(Ptr<runtime.pid> pid2, int sig, int priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kill_pid(Ptr<runtime.pid> pid2, int sig, int priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kill_pid_info(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<runtime.pid> pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kill_pid_info_type(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, Ptr<runtime.pid> pid2, PidDefinitions.pid_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kill_pid_usb_asyncio($arg1, $arg2, $arg3, $arg4, (const struct cred*)$arg5)")
    public static int kill_pid_usb_asyncio(int sig, int errno,  @OriginalName(value="sigval_t") runtime.sigval addr2, Ptr<runtime.pid> pid2, Ptr<runtime.cred> cred2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kill_something_info(int sig, Ptr<KernelDefinitions.kernel_siginfo> info2, @OriginalName(value="pid_t") int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kill_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kill_ioctx(Ptr<MmDefinitions.mm_struct> mm, Ptr<runtime.kioctx> ctx, Ptr<CtxDefinitions.ctx_rq_wait> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_orphaned_pgrp(Ptr<TaskDefinitions.task_struct> tsk, Ptr<TaskDefinitions.task_struct> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_anon_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_block_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_dax(Ptr<DaxDefinitions.dax_device> dax_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_litter_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_rules(Ptr<AuditDefinitions.audit_context> context2, Ptr<AuditDefinitions.audit_tree> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kill_super_notify(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { int _pid; unsigned int _uid; }")
    @NotUsableInJava
    public static class _kill_of__sifields_of_compat_siginfo_and__sifields_of_compat_siginfo_t
    extends Struct {
        public @OriginalName(value="compat_pid_t") int _pid;
        public @Unsigned @OriginalName(value="__compat_uid32_t") int _uid;
    }

    @Type(noCCodeGeneration=true, cType="struct { int _pid; unsigned int _uid; }")
    @NotUsableInJava
    public static class _kill_of___sifields
    extends Struct {
        public @OriginalName(value="__kernel_pid_t") int _pid;
        public @Unsigned @OriginalName(value="__kernel_uid32_t") int _uid;
    }
}

