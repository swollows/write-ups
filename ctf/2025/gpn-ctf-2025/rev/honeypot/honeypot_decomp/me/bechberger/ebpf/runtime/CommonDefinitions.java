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
import me.bechberger.ebpf.runtime.ApparmorDefinitions;
import me.bechberger.ebpf.runtime.KDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SelinuxDefinitions;
import me.bechberger.ebpf.runtime.SmackDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CommonDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="common_perm_cond((const u8*)$arg1, (const struct path*)$arg2, $arg3)")
    public static int common_perm_cond(String op, Ptr<runtime.path> path2, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __common_interrupt(Ptr<PtDefinitions.pt_regs> regs, @Unsigned int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_cpu_up(@Unsigned int cpu2, Ptr<TaskDefinitions.task_struct> idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_destroy(Ptr<?> key2, Ptr<?> datum, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_index(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void common_interrupt(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_read(Ptr<runtime.policydb> p, Ptr<runtime.symtab> s2, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_write(Ptr<?> vkey, Ptr<?> datum, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="common_lsm_audit($arg1, (void (*)(struct audit_buffer*, void*))$arg2, (void (*)(struct audit_buffer*, void*))$arg3)")
    public static void common_lsm_audit(Ptr<common_audit_data> a, Ptr<?> pre_audit, Ptr<?> post_audit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_branch_type(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void common_hrtimer_arm(Ptr<KDefinitions.k_itimer> timr, @OriginalName(value="ktime_t") long expires, boolean absolute, boolean sigev_none) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long common_hrtimer_forward(Ptr<KDefinitions.k_itimer> timr, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void common_hrtimer_rearm(Ptr<KDefinitions.k_itimer> timr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ktime_t") long common_hrtimer_remaining(Ptr<KDefinitions.k_itimer> timr, @OriginalName(value="ktime_t") long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_hrtimer_try_to_cancel(Ptr<KDefinitions.k_itimer> timr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="common_nsleep((const int)$arg1, $arg2, (const struct timespec64*)$arg3)")
    public static int common_nsleep(@OriginalName(value="clockid_t") int which_clock, int flags, Ptr<runtime.timespec64> rqtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="common_nsleep_timens((const int)$arg1, $arg2, (const struct timespec64*)$arg3)")
    public static int common_nsleep_timens(@OriginalName(value="clockid_t") int which_clock, int flags, Ptr<runtime.timespec64> rqtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_timer_create(Ptr<KDefinitions.k_itimer> new_timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_timer_del(Ptr<KDefinitions.k_itimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void common_timer_get(Ptr<KDefinitions.k_itimer> timr, Ptr<runtime.itimerspec64> cur_setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int common_timer_set(Ptr<KDefinitions.k_itimer> timr, int flags, Ptr<runtime.itimerspec64> new_setting, Ptr<runtime.itimerspec64> old_setting) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void common_timer_wait_running(Ptr<KDefinitions.k_itimer> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct common_datum")
    @NotUsableInJava
    public static class common_datum
    extends Struct {
        public @Unsigned int value;
        public runtime.symtab permissions;
    }

    @Type(noCCodeGeneration=true, cType="struct common_audit_data")
    @NotUsableInJava
    public static class common_audit_data
    extends Struct {
        public char type;
        public UDefinitions.u_of_common_audit_data u;
        @InlineUnion(value=12610)
        public @InlineUnion(value=12610) Ptr<SmackDefinitions.smack_audit_data> smack_audit_data;
        @InlineUnion(value=12610)
        public @InlineUnion(value=12610) Ptr<SelinuxDefinitions.selinux_audit_data> selinux_audit_data;
        @InlineUnion(value=12610)
        public @InlineUnion(value=12610) Ptr<ApparmorDefinitions.apparmor_audit_data> apparmor_audit_data;
    }
}

