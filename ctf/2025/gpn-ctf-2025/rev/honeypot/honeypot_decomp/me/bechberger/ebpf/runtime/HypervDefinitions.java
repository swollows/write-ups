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
import me.bechberger.ebpf.runtime.FlushDefinitions;
import me.bechberger.ebpf.runtime.HvDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class HypervDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="hyperv_flush_tlb_multi((const struct cpumask*)$arg1, (const struct flush_tlb_info*)$arg2)")
    public static void hyperv_flush_tlb_multi(Ptr<runtime.cpumask> cpus, Ptr<FlushDefinitions.flush_tlb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hyperv_flush_tlb_others_ex((const struct cpumask*)$arg1, (const struct flush_tlb_info*)$arg2)")
    public static @Unsigned long hyperv_flush_tlb_others_ex(Ptr<runtime.cpumask> cpus, Ptr<FlushDefinitions.flush_tlb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hyperv_setup_mmu_ops() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hyperv_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hyperv_enable_irq_remapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hyperv_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hyperv_ir_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int hyperv_ir_set_affinity(Ptr<IrqDefinitions.irq_data> data, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hyperv_irq_remapping_alloc(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hyperv_irq_remapping_free(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hyperv_irq_remapping_select(Ptr<IrqDefinitions.irq_domain> d, Ptr<IrqDefinitions.irq_fwspec> fwspec, IrqDefinitions.irq_domain_bus_token bus_token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hyperv_prepare_irq_remapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hyperv_report_panic(Ptr<PtDefinitions.pt_regs> regs, long err, boolean in_die) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hyperv_root_ir_compose_msi_msg(Ptr<IrqDefinitions.irq_data> irq_data2, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hyperv_root_ir_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int hyperv_root_ir_set_affinity(Ptr<IrqDefinitions.irq_data> data, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hyperv_root_irq_remapping_alloc(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hyperv_root_irq_remapping_free(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hyperv_stop_tsc_emulation() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hyperv_fill_flush_guest_mapping_list(Ptr<HvDefinitions.hv_guest_mapping_flush_list> flush, @Unsigned long start_gfn, @Unsigned long pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hyperv_flush_guest_mapping(@Unsigned long as) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hyperv_flush_guest_mapping_range(@Unsigned long as, @OriginalName(value="hyperv_fill_flush_list_func") Ptr<?> fill_flush_list_func, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hyperv_root_ir_data")
    @NotUsableInJava
    public static class hyperv_root_ir_data
    extends Struct {
        public char ioapic_id;
        public boolean is_level;
        public HvDefinitions.hv_interrupt_entry entry;
    }
}

