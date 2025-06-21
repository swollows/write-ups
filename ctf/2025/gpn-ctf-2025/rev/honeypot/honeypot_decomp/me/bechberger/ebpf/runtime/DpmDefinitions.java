/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.SuspendDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class DpmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_save_errno(int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpm_save_failed_dev((const u8*)$arg1)")
    public static void dpm_save_failed_dev(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_save_failed_step(SuspendDefinitions.suspend_stat_step step) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_sysfs_add(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_sysfs_change_owner(Ptr<runtime.device> dev, misc.kuid_t kuid, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_sysfs_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dpm_async_fn(Ptr<runtime.device> dev, @OriginalName(value="async_func_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_complete( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpm_for_each_dev($arg1, (void (*)(struct device*, void*))$arg2)")
    public static void dpm_for_each_dev(Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_noirq_resume_devices( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_prepare( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_resume( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_resume_early( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_resume_end( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_resume_noirq( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_resume_start( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpm_run_callback($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int dpm_run_callback(@OriginalName(value="pm_callback_t") Ptr<?> cb, Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2, String info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dpm_show_time($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void dpm_show_time(@OriginalName(value="ktime_t") long starttime,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2, int error, String info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_suspend( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_suspend_end( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_suspend_late( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_suspend_noirq( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_suspend_start( @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dpm_wait_fn(Ptr<runtime.device> dev, Ptr<?> async_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dpm_wait_for_subordinate(Ptr<runtime.device> dev, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dpm_wait_for_superior(Ptr<runtime.device> dev, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum dpm_order")
    public static enum dpm_order implements Enum<dpm_order>,
    TypedEnum<dpm_order, Integer>
    {
        DPM_ORDER_NONE,
        DPM_ORDER_DEV_AFTER_PARENT,
        DPM_ORDER_PARENT_BEFORE_DEV,
        DPM_ORDER_DEV_LAST;

    }
}

