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
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MboxDefinitions;
import me.bechberger.ebpf.runtime.PccDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CppcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_enable(boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_init_perf(Ptr<AmdDefinitions.amd_cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cppc_update_perf(Ptr<AmdDefinitions.amd_cpudata> cpudata2, @Unsigned int min_perf, @Unsigned int des_perf, @Unsigned int max_perf, boolean fast_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cppc_allow_fast_switch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cppc_chan_tx_done(Ptr<MboxDefinitions.mbox_client> cl, Ptr<?> msg, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cppc_find_dmi_mhz((const struct dmi_header*)$arg1, $arg2)")
    public static void cppc_find_dmi_mhz(Ptr<DmiDefinitions.dmi_header> dm, Ptr<?> _private) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_get_auto_sel_caps(int cpunum, Ptr<cppc_perf_caps> perf_caps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_get_desired_perf(int cpunum, Ptr<@Unsigned Long> desired_perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_get_epp_perf(int cpunum, Ptr<@Unsigned Long> epp_perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_get_highest_perf(int cpunum, Ptr<@Unsigned Long> highest_perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_get_nominal_perf(int cpunum, Ptr<@Unsigned Long> nominal_perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_get_perf(int cpunum, cppc_regs reg_idx, Ptr<@Unsigned Long> perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_get_perf_caps(int cpunum, Ptr<cppc_perf_caps> perf_caps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_get_perf_ctrs(int cpunum, Ptr<cppc_perf_fb_ctrs> perf_fb_ctrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cppc_get_transition_latency(int cpu_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cppc_khz_to_perf(Ptr<cppc_perf_caps> caps, @Unsigned int freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cppc_perf_ctrs_in_pcc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cppc_perf_to_khz(Ptr<cppc_perf_caps> caps, @Unsigned int perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_set_auto_sel(int cpu2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_set_enable(int cpu2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_set_epp_perf(int cpu2, Ptr<cppc_perf_ctrls> perf_ctrls, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cppc_set_perf(int cpu2, Ptr<cppc_perf_ctrls> perf_ctrls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cppc_pcc_data")
    @NotUsableInJava
    public static class cppc_pcc_data
    extends Struct {
        public Ptr<PccDefinitions.pcc_mbox_chan> pcc_channel;
        public Ptr<?> pcc_comm_addr;
        public boolean pcc_channel_acquired;
        public @Unsigned int deadline_us;
        public @Unsigned int pcc_mpar;
        public @Unsigned int pcc_mrtt;
        public @Unsigned int pcc_nominal;
        public boolean pending_pcc_write_cmd;
        public boolean platform_owns_pcc;
        public @Unsigned int pcc_write_cnt;
        public misc.rw_semaphore pcc_lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head pcc_write_wait_q;
        public @OriginalName(value="ktime_t") long last_cmd_cmpl_time;
        public @OriginalName(value="ktime_t") long last_mpar_reset;
        public int mpar_count;
        public int refcount;
    }

    @Type(noCCodeGeneration=true, cType="struct cppc_cpudata")
    @NotUsableInJava
    public static class cppc_cpudata
    extends Struct {
        public ListDefinitions.list_head node;
        public cppc_perf_caps perf_caps;
        public cppc_perf_ctrls perf_ctrls;
        public cppc_perf_fb_ctrs perf_fb_ctrs;
        public @Unsigned int shared_type;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> shared_cpu_map;
    }

    @Type(noCCodeGeneration=true, cType="struct cppc_perf_fb_ctrs")
    @NotUsableInJava
    public static class cppc_perf_fb_ctrs
    extends Struct {
        public @Unsigned long reference;
        public @Unsigned long delivered;
        public @Unsigned long reference_perf;
        public @Unsigned long wraparound_time;
    }

    @Type(noCCodeGeneration=true, cType="enum cppc_regs")
    public static enum cppc_regs implements Enum<cppc_regs>,
    TypedEnum<cppc_regs, Integer>
    {
        HIGHEST_PERF,
        NOMINAL_PERF,
        LOW_NON_LINEAR_PERF,
        LOWEST_PERF,
        GUARANTEED_PERF,
        DESIRED_PERF,
        MIN_PERF,
        MAX_PERF,
        PERF_REDUC_TOLERANCE,
        TIME_WINDOW,
        CTR_WRAP_TIME,
        REFERENCE_CTR,
        DELIVERED_CTR,
        PERF_LIMITED,
        ENABLE,
        AUTO_SEL_ENABLE,
        AUTO_ACT_WINDOW,
        ENERGY_PERF,
        REFERENCE_PERF,
        LOWEST_FREQ,
        NOMINAL_FREQ;

    }

    @Type(noCCodeGeneration=true, cType="struct cppc_perf_ctrls")
    @NotUsableInJava
    public static class cppc_perf_ctrls
    extends Struct {
        public @Unsigned int max_perf;
        public @Unsigned int min_perf;
        public @Unsigned int desired_perf;
        public @Unsigned int energy_perf;
    }

    @Type(noCCodeGeneration=true, cType="struct cppc_perf_caps")
    @NotUsableInJava
    public static class cppc_perf_caps
    extends Struct {
        public @Unsigned int guaranteed_perf;
        public @Unsigned int highest_perf;
        public @Unsigned int nominal_perf;
        public @Unsigned int lowest_perf;
        public @Unsigned int lowest_nonlinear_perf;
        public @Unsigned int lowest_freq;
        public @Unsigned int nominal_freq;
        public @Unsigned int energy_perf;
        public boolean auto_sel;
    }
}

