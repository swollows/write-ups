/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PvclockDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pvclock_clocksource_read(Ptr<pvclock_vcpu_time_info> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pvclock_clocksource_read_nowd(Ptr<pvclock_vcpu_time_info> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pvclock_vsyscall_time_info> pvclock_get_pvti_cpu0_va() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char pvclock_read_flags(Ptr<pvclock_vcpu_time_info> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pvclock_read_wallclock(Ptr<pvclock_wall_clock> wall_clock, Ptr<pvclock_vcpu_time_info> vcpu_time, Ptr<runtime.timespec64> ts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pvclock_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pvclock_set_flags(char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pvclock_set_pvti_cpu0_va(Ptr<pvclock_vsyscall_time_info> pvti) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pvclock_touch_watchdogs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pvclock_tsc_khz(Ptr<pvclock_vcpu_time_info> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pvclock_gtod_register_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pvclock_gtod_unregister_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pvclock_wall_clock")
    @NotUsableInJava
    public static class pvclock_wall_clock
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int sec;
        public @Unsigned int nsec;
    }

    @Type(noCCodeGeneration=true, cType="struct pvclock_vsyscall_time_info")
    @NotUsableInJava
    public static class pvclock_vsyscall_time_info
    extends Struct {
        public pvclock_vcpu_time_info pvti;
    }

    @Type(noCCodeGeneration=true, cType="struct pvclock_vcpu_time_info")
    @NotUsableInJava
    public static class pvclock_vcpu_time_info
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int pad0;
        public @Unsigned long tsc_timestamp;
        public @Unsigned long system_time;
        public @Unsigned int tsc_to_system_mul;
        public @OriginalName(value="s8") byte tsc_shift;
        public char flags;
        public char @Size(value=2) [] pad;
    }
}

