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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class RpmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__rpm_callback((int (*)(struct device*))$arg1, $arg2)")
    public static int __rpm_callback(Ptr<?> cb, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pm_callback_t") Ptr<?> __rpm_get_callback(Ptr<runtime.device> dev, @Unsigned long cb_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rpm_put_suppliers(Ptr<runtime.device> dev, boolean try_to_suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rpm_callback((int (*)(struct device*))$arg1, $arg2)")
    public static int rpm_callback(Ptr<?> cb, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rpm_check_suspend_allowed(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rpm_drop_usage_count(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rpm_get_suppliers(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rpm_idle(Ptr<runtime.device> dev, int rpmflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rpm_resume(Ptr<runtime.device> dev, int rpmflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rpm_suspend(Ptr<runtime.device> dev, int rpmflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rpm_sysfs_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum rpm_request")
    public static enum rpm_request implements Enum<rpm_request>,
    TypedEnum<rpm_request, Integer>
    {
        RPM_REQ_NONE,
        RPM_REQ_IDLE,
        RPM_REQ_SUSPEND,
        RPM_REQ_AUTOSUSPEND,
        RPM_REQ_RESUME;

    }

    @Type(noCCodeGeneration=true, cType="enum rpm_status")
    public static enum rpm_status implements Enum<rpm_status>,
    TypedEnum<rpm_status, Integer>
    {
        RPM_INVALID,
        RPM_ACTIVE,
        RPM_RESUMING,
        RPM_SUSPENDED,
        RPM_SUSPENDING;

    }
}

