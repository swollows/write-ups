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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.MboxDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PccDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_chan_reg_init(Ptr<pcc_chan_reg> reg, Ptr<AcpiDefinitions.acpi_generic_address> gas, @Unsigned long preserve_mask, @Unsigned long set_mask, @Unsigned long status_mask, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_chan_reg_read_modify_write(Ptr<pcc_chan_reg> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcc_clear_mapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_cpufreq_cpu_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_cpufreq_do_osc(Ptr<@OriginalName(value="acpi_handle") Ptr<?>> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_cpufreq_evaluate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcc_cpufreq_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_cpufreq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_cpufreq_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcc_cpufreq_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_cpufreq_target(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int target_freq, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_cpufreq_verify(Ptr<CpufreqDefinitions.cpufreq_policy_data> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pcc_get_freq(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_get_offset(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcc_mbox_free_channel(Ptr<pcc_mbox_chan> pchan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn pcc_mbox_irq(int irq, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_mbox_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pcc_mbox_chan> pcc_mbox_request_channel(Ptr<MboxDefinitions.mbox_client> cl, int subspace_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_send_data(Ptr<MboxDefinitions.mbox_chan> chan, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcc_shutdown(Ptr<MboxDefinitions.mbox_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pcc_startup(Ptr<MboxDefinitions.mbox_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pcc_rx_callback(Ptr<MboxDefinitions.mbox_client> cl, Ptr<?> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pcc_chan_info")
    @NotUsableInJava
    public static class pcc_chan_info
    extends Struct {
        public pcc_mbox_chan chan;
        public pcc_chan_reg db;
        public pcc_chan_reg plat_irq_ack;
        public pcc_chan_reg cmd_complete;
        public pcc_chan_reg cmd_update;
        public pcc_chan_reg error;
        public int plat_irq;
        public char type;
        public @Unsigned int plat_irq_flags;
        public boolean chan_in_use;
    }

    @Type(noCCodeGeneration=true, cType="struct pcc_chan_reg")
    @NotUsableInJava
    public static class pcc_chan_reg
    extends Struct {
        public Ptr<?> vaddr;
        public Ptr<AcpiDefinitions.acpi_generic_address> gas;
        public @Unsigned long preserve_mask;
        public @Unsigned long set_mask;
        public @Unsigned long status_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct pcc_cpu")
    @NotUsableInJava
    public static class pcc_cpu
    extends Struct {
        public @Unsigned int input_offset;
        public @Unsigned int output_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct pcc_header")
    @NotUsableInJava
    public static class pcc_header
    extends Struct {
        public @Unsigned int signature;
        public @Unsigned short length;
        public char major;
        public char minor;
        public @Unsigned int features;
        public @Unsigned short command;
        public @Unsigned short status;
        public @Unsigned int latency;
        public @Unsigned int minimum_time;
        public @Unsigned int maximum_time;
        public @Unsigned int nominal;
        public @Unsigned int throttled_frequency;
        public @Unsigned int minimum_frequency;
    }

    @Type(noCCodeGeneration=true, cType="struct pcc_memory_resource")
    @NotUsableInJava
    public static class pcc_memory_resource
    extends Struct {
        public char descriptor;
        public @Unsigned short length;
        public char space_id;
        public char resource_usage;
        public char type_specific;
        public @Unsigned long granularity;
        public @Unsigned long minimum;
        public @Unsigned long maximum;
        public @Unsigned long translation_offset;
        public @Unsigned long address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct pcc_register_resource")
    @NotUsableInJava
    public static class pcc_register_resource
    extends Struct {
        public char descriptor;
        public @Unsigned short length;
        public char space_id;
        public char bit_width;
        public char bit_offset;
        public char access_size;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct pcc_data")
    @NotUsableInJava
    public static class pcc_data
    extends Struct {
        public Ptr<pcc_mbox_chan> pcc_chan;
        public Ptr<?> pcc_comm_addr;
        public runtime.completion done;
        public MboxDefinitions.mbox_client cl;
        public AcpiDefinitions.acpi_pcc_info ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct pcc_mbox_chan")
    @NotUsableInJava
    public static class pcc_mbox_chan
    extends Struct {
        public Ptr<MboxDefinitions.mbox_chan> mchan;
        public @Unsigned long shmem_base_addr;
        public @Unsigned long shmem_size;
        public @Unsigned int latency;
        public @Unsigned int max_access_rate;
        public @Unsigned short min_turnaround_time;
    }
}

