/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class ApicDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int apic_default_calc_apicid(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int apic_flat_calc_apicid(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_install_driver(Ptr<apic> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_setup_apic_calls() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_ap_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_intr_mode_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_intr_mode_select() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apic_is_clustered_box() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean apic_needs_pit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_read_boot_cpu_id(boolean x2apic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apic_set_extnmi(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_set_fixmap(boolean read_apic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apic_set_verbosity(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_soft_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_ack_edge(Ptr<IrqDefinitions.irq_data> irqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_ack_irq(Ptr<IrqDefinitions.irq_data> irqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apic_retrigger_irq(Ptr<IrqDefinitions.irq_data> irqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="apic_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int apic_set_affinity(Ptr<IrqDefinitions.irq_data> irqd, Ptr<runtime.cpumask> dest, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_update_irq_cfg(Ptr<IrqDefinitions.irq_data> irqd, @Unsigned int vector, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_update_vector(Ptr<IrqDefinitions.irq_data> irqd, @Unsigned int newvec, @Unsigned int newcpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int apic_ipi_shorthand(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_mem_wait_icr_idle() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int apic_mem_wait_icr_idle_timeout() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_send_IPI_allbutself(@Unsigned int vector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_send_nmi_to_offline_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void apic_smt_update() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct apic")
    @NotUsableInJava
    public static class apic
    extends Struct {
        public Ptr<?> eoi;
        public Ptr<?> native_eoi;
        public Ptr<?> write;
        public Ptr<?> read;
        public Ptr<?> wait_icr_idle;
        public Ptr<?> safe_wait_icr_idle;
        public Ptr<?> send_IPI;
        public Ptr<?> send_IPI_mask;
        public Ptr<?> send_IPI_mask_allbutself;
        public Ptr<?> send_IPI_allbutself;
        public Ptr<?> send_IPI_all;
        public Ptr<?> send_IPI_self;
        public @Unsigned int disable_esr;
        public @Unsigned int dest_mode_logical;
        public @Unsigned int x2apic_set_max_apicid;
        public @Unsigned int nmi_to_offline_cpu;
        public Ptr<?> calc_dest_apicid;
        public Ptr<?> icr_read;
        public Ptr<?> icr_write;
        public @Unsigned int max_apic_id;
        public Ptr<?> probe;
        public Ptr<?> acpi_madt_oem_check;
        public Ptr<?> init_apic_ldr;
        public Ptr<?> cpu_present_to_apicid;
        public Ptr<?> get_apic_id;
        public Ptr<?> wakeup_secondary_cpu;
        public Ptr<?> wakeup_secondary_cpu_64;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct apic_chip_data")
    @NotUsableInJava
    public static class apic_chip_data
    extends Struct {
        public IrqDefinitions.irq_cfg hw_irq_cfg;
        public @Unsigned int vector;
        public @Unsigned int prev_vector;
        public @Unsigned int cpu;
        public @Unsigned int prev_cpu;
        public @Unsigned int irq;
        public misc.hlist_node clist;
        public @Unsigned int move_in_progress;
        public @Unsigned int is_managed;
        public @Unsigned int can_reserve;
        public @Unsigned int has_reserved;
    }

    @Type(noCCodeGeneration=true, cType="union apic_ir")
    @NotUsableInJava
    public static class apic_ir
    extends Union {
        public @Unsigned long @Size(value=4) [] map;
        public @Unsigned int @Size(value=8) [] regs;
    }

    @Type(noCCodeGeneration=true, cType="enum apic_intr_mode_id")
    public static enum apic_intr_mode_id implements Enum<apic_intr_mode_id>,
    TypedEnum<apic_intr_mode_id, Integer>
    {
        APIC_PIC,
        APIC_VIRTUAL_WIRE,
        APIC_VIRTUAL_WIRE_NO_CONFIG,
        APIC_SYMMETRIC_IO,
        APIC_SYMMETRIC_IO_NO_ROUTING;

    }

    @Type(noCCodeGeneration=true, cType="struct apic_override")
    @NotUsableInJava
    public static class apic_override
    extends Struct {
        public Ptr<?> eoi;
        public Ptr<?> native_eoi;
        public Ptr<?> write;
        public Ptr<?> read;
        public Ptr<?> send_IPI;
        public Ptr<?> send_IPI_mask;
        public Ptr<?> send_IPI_mask_allbutself;
        public Ptr<?> send_IPI_allbutself;
        public Ptr<?> send_IPI_all;
        public Ptr<?> send_IPI_self;
        public Ptr<?> icr_read;
        public Ptr<?> icr_write;
        public Ptr<?> wakeup_secondary_cpu;
        public Ptr<?> wakeup_secondary_cpu_64;
    }
}

