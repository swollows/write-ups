/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VmwareDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmware_cmd_stealclock(@Unsigned int addr_hi, @Unsigned int addr_lo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmware_cpu_down_prepare(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmware_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmware_get_tsc_khz() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmware_guest_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmware_hypercall3(@Unsigned long cmd, @Unsigned long in1, Ptr<@Unsigned Integer> out1, Ptr<@Unsigned Integer> out2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmware_hypercall_slow(@Unsigned long cmd, @Unsigned long in1, @Unsigned long in3, @Unsigned long in4, @Unsigned long in5, Ptr<@Unsigned Integer> out1, Ptr<@Unsigned Integer> out2, Ptr<@Unsigned Integer> out3, Ptr<@Unsigned Integer> out4, Ptr<@Unsigned Integer> out5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vmware_legacy_x2apic_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int vmware_platform() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmware_platform_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmware_pv_guest_cpu_reboot(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vmware_pv_reboot_notify(Ptr<misc.notifier_block> nb, @Unsigned long code2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmware_sched_clock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmware_set_capabilities() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vmware_sev_es_hcall_finish(Ptr<runtime.ghcb> ghcb2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmware_sev_es_hcall_prepare(Ptr<runtime.ghcb> ghcb2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vmware_smp_prepare_boot_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmware_steal_clock(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long vmware_tdx_hypercall(@Unsigned long cmd, @Unsigned long in1, @Unsigned long in3, @Unsigned long in4, @Unsigned long in5, Ptr<@Unsigned Integer> out1, Ptr<@Unsigned Integer> out2, Ptr<@Unsigned Integer> out3, Ptr<@Unsigned Integer> out4, Ptr<@Unsigned Integer> out5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vmware_steal_time")
    @NotUsableInJava
    public static class vmware_steal_time
    extends Struct {
        @InlineUnion(value=4883)
        public @InlineUnion(value=4883) @Unsigned long clock;
        @InlineUnion(value=4883)
        public  @InlineUnion(value=4883) AnonDefinitions.anon_member_of_anon_member_of_vmware_steal_time anon0$1;
        public @Unsigned long @Size(value=7) [] reserved;
    }
}

