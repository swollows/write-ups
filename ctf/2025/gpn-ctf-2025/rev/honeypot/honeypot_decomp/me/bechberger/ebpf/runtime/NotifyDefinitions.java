/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NotifyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void notify_cpu_starting(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void notify_key(Ptr<runtime.key> key2, KeyDefinitions.key_notification_subtype subtype, @Unsigned int aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void notify_new_max_latency(@Unsigned long latency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void notify_rule_change(int event2, Ptr<FibDefinitions.fib_rule> rule, Ptr<FibDefinitions.fib_rules_ops> ops, Ptr<runtime.nlmsghdr> nlh, @Unsigned int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int notify_change(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<runtime.dentry> dentry2, Ptr<runtime.iattr> attr2, Ptr<Ptr<runtime.inode>> delegated_inode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void notify_hwp_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void notify_remote_via_irq(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="notify_user_space($arg1, (const struct thermal_trip*)$arg2, $arg3)")
    public static void notify_user_space(Ptr<ThermalDefinitions.thermal_zone_device> tz, Ptr<ThermalDefinitions.thermal_trip> trip, boolean crossed_up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="notify_die($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int notify_die(misc.die_val val, String str, Ptr<PtDefinitions.pt_regs> regs, long err, int trap, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum notify_state")
    public static enum notify_state implements Enum<notify_state>,
    TypedEnum<notify_state, Integer>
    {
        SECCOMP_NOTIFY_INIT,
        SECCOMP_NOTIFY_SENT,
        SECCOMP_NOTIFY_REPLIED;

    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int flags; }")
    @NotUsableInJava
    public static class notify_of_anon_member_of_kvm_run_and_v2_of_jailhouse_setup_data
    extends Struct {
        public @Unsigned int flags;
    }
}

