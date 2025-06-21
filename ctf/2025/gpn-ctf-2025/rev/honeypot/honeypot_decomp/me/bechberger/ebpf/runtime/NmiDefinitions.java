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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NmiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="nmi_backtrace_stall_check((const struct cpumask*)$arg1)")
    public static void nmi_backtrace_stall_check(Ptr<runtime.cpumask> btp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nmi_backtrace_stall_snap((const struct cpumask*)$arg1)")
    public static void nmi_backtrace_stall_snap(Ptr<runtime.cpumask> btp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nmi_handle(@Unsigned int type2, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nmi_panic($arg1, (const u8*)$arg2)")
    public static void nmi_panic(Ptr<PtDefinitions.pt_regs> regs, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nmi_panic_self_stop(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nmi_uaccess_okay() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nmi_warning_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean nmi_cpu_backtrace(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nmi_cpu_backtrace_handler(@Unsigned int cmd, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nmi_raise_cpu_backtrace(Ptr< @OriginalName(value="cpumask_t") runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nmi_shootdown_cpus(@OriginalName(value="nmi_shootdown_cb") Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nmi_trigger_cpumask_backtrace((const cpumask*)$arg1, $arg2, (void (*)(cpumask*))$arg3)")
    public static void nmi_trigger_cpumask_backtrace(Ptr< @OriginalName(value="cpumask_t") runtime.cpumask> mask, int exclude_cpu, Ptr<?> raise) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum nmi_states")
    public static enum nmi_states implements Enum<nmi_states>,
    TypedEnum<nmi_states, Integer>
    {
        NMI_NOT_RUNNING,
        NMI_EXECUTING,
        NMI_LATCHED;

    }

    @Type(noCCodeGeneration=true, cType="struct nmi_stats")
    @NotUsableInJava
    public static class nmi_stats
    extends Struct {
        public @Unsigned int normal;
        public @Unsigned int unknown;
        public @Unsigned int external;
        public @Unsigned int swallow;
        public @Unsigned long recv_jiffies;
        public @Unsigned long idt_seq;
        public @Unsigned long idt_nmi_seq;
        public @Unsigned long idt_ignored;
        public  @OriginalName(value="atomic_long_t") misc.atomic64_t idt_calls;
        public @Unsigned long idt_seq_snap;
        public @Unsigned long idt_nmi_seq_snap;
        public @Unsigned long idt_ignored_snap;
        public long idt_calls_snap;
    }

    @Type(noCCodeGeneration=true, cType="struct nmi_desc")
    @NotUsableInJava
    public static class nmi_desc
    extends Struct {
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public ListDefinitions.list_head head;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 injected; u8 pending; u8 masked; u8 pad; }")
    @NotUsableInJava
    public static class nmi_of_kvm_vcpu_events
    extends Struct {
        public char injected;
        public char pending;
        public char masked;
        public char pad;
    }
}

