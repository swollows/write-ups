/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CpuhpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cpuhp_invoke_callback_range(boolean bringup, @Unsigned int cpu2, Ptr<cpuhp_cpu_state> st2, cpuhp_state target, boolean nofail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cpuhp_kick_ap(Ptr<cpuhp_cpu_state> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cpuhp_remove_state(cpuhp_state state2, boolean invoke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cpuhp_remove_state_cpuslocked(cpuhp_state state2, boolean invoke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cpuhp_setup_state($arg1, (const u8*)$arg2, $arg3, (int (*)(unsigned int))$arg4, (int (*)(unsigned int))$arg5, $arg6)")
    public static int __cpuhp_setup_state(cpuhp_state state2, String name, boolean invoke, Ptr<?> startup, Ptr<?> teardown, boolean multi_instance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cpuhp_setup_state_cpuslocked($arg1, (const u8*)$arg2, $arg3, (int (*)(unsigned int))$arg4, (int (*)(unsigned int))$arg5, $arg6)")
    public static int __cpuhp_setup_state_cpuslocked(cpuhp_state state2, String name, boolean invoke, Ptr<?> startup, Ptr<?> teardown, boolean multi_instance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cpuhp_state_add_instance(cpuhp_state state2, Ptr<misc.hlist_node> node2, boolean invoke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cpuhp_state_add_instance_cpuslocked(cpuhp_state state2, Ptr<misc.hlist_node> node2, boolean invoke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cpuhp_state_remove_instance(cpuhp_state state2, Ptr<misc.hlist_node> node2, boolean invoke) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuhp_ap_report_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuhp_ap_sync_alive() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_bringup_ap(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpuhp_bringup_cpus_parallel(@Unsigned int ncpus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cpuhp_bringup_mask((const struct cpumask*)$arg1, $arg2, $arg3)")
    public static void cpuhp_bringup_mask(Ptr<runtime.cpumask> mask, @Unsigned int ncpus, cpuhp_state target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuhp_complete_idle_dead(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_invoke_callback(@Unsigned int cpu2, cpuhp_state state2, boolean bringup, Ptr<misc.hlist_node> node2, Ptr<Ptr<misc.hlist_node>> lastp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_issue_call(int cpu2, cpuhp_state state2, boolean bringup, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_kick_ap_alive(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_kick_ap_work(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuhp_online_idle(cpuhp_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuhp_report_idle_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuhp_rollback_install(int failedcpu, cpuhp_state state2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_should_run(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_smt_disable(cpuhp_smt_control ctrlval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_smt_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuhp_thread_fun(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cpuhp_threads_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cpuhp_wait_for_sync_state(@Unsigned int cpu2, cpuhp_sync_state state2, cpuhp_sync_state next_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_cpufreq_offline(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cpuhp_cpufreq_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum cpuhp_sync_state")
    public static enum cpuhp_sync_state implements Enum<cpuhp_sync_state>,
    TypedEnum<cpuhp_sync_state, Integer>
    {
        SYNC_STATE_DEAD,
        SYNC_STATE_KICKED,
        SYNC_STATE_SHOULD_DIE,
        SYNC_STATE_ALIVE,
        SYNC_STATE_SHOULD_ONLINE,
        SYNC_STATE_ONLINE;

    }

    @Type(noCCodeGeneration=true, cType="struct cpuhp_step")
    @NotUsableInJava
    public static class cpuhp_step
    extends Struct {
        public String name;
        public misc.startup_of_cpuhp_step_and_teardown_of_cpuhp_step startup;
        public misc.startup_of_cpuhp_step_and_teardown_of_cpuhp_step teardown;
        public misc.hlist_head list;
        public boolean cant_stop;
        public boolean multi_instance;
    }

    @Type(noCCodeGeneration=true, cType="struct cpuhp_cpu_state")
    @NotUsableInJava
    public static class cpuhp_cpu_state
    extends Struct {
        public cpuhp_state state;
        public cpuhp_state target;
        public cpuhp_state fail;
        public Ptr<TaskDefinitions.task_struct> thread;
        public boolean should_run;
        public boolean rollback;
        public boolean single;
        public boolean bringup;
        public Ptr<misc.hlist_node> node;
        public Ptr<misc.hlist_node> last;
        public cpuhp_state cb_state;
        public int result;
        public AtomicDefinitions.atomic_t ap_sync_state;
        public runtime.completion done_up;
        public runtime.completion done_down;
    }

    @Type(noCCodeGeneration=true, cType="enum cpuhp_smt_control")
    public static enum cpuhp_smt_control implements Enum<cpuhp_smt_control>,
    TypedEnum<cpuhp_smt_control, Integer>
    {
        CPU_SMT_ENABLED,
        CPU_SMT_DISABLED,
        CPU_SMT_FORCE_DISABLED,
        CPU_SMT_NOT_SUPPORTED,
        CPU_SMT_NOT_IMPLEMENTED;

    }

    @Type(noCCodeGeneration=true, cType="enum cpuhp_state")
    public static enum cpuhp_state implements Enum<cpuhp_state>,
    TypedEnum<cpuhp_state, Integer>
    {
        CPUHP_INVALID,
        CPUHP_OFFLINE,
        CPUHP_CREATE_THREADS,
        CPUHP_PERF_PREPARE,
        CPUHP_PERF_X86_PREPARE,
        CPUHP_PERF_X86_AMD_UNCORE_PREP,
        CPUHP_PERF_POWER,
        CPUHP_PERF_SUPERH,
        CPUHP_X86_HPET_DEAD,
        CPUHP_X86_MCE_DEAD,
        CPUHP_VIRT_NET_DEAD,
        CPUHP_IBMVNIC_DEAD,
        CPUHP_SLUB_DEAD,
        CPUHP_DEBUG_OBJ_DEAD,
        CPUHP_MM_WRITEBACK_DEAD,
        CPUHP_MM_VMSTAT_DEAD,
        CPUHP_SOFTIRQ_DEAD,
        CPUHP_NET_MVNETA_DEAD,
        CPUHP_CPUIDLE_DEAD,
        CPUHP_ARM64_FPSIMD_DEAD,
        CPUHP_ARM_OMAP_WAKE_DEAD,
        CPUHP_IRQ_POLL_DEAD,
        CPUHP_BLOCK_SOFTIRQ_DEAD,
        CPUHP_BIO_DEAD,
        CPUHP_ACPI_CPUDRV_DEAD,
        CPUHP_S390_PFAULT_DEAD,
        CPUHP_BLK_MQ_DEAD,
        CPUHP_FS_BUFF_DEAD,
        CPUHP_PRINTK_DEAD,
        CPUHP_MM_MEMCQ_DEAD,
        CPUHP_PERCPU_CNT_DEAD,
        CPUHP_RADIX_DEAD,
        CPUHP_PAGE_ALLOC,
        CPUHP_NET_DEV_DEAD,
        CPUHP_PCI_XGENE_DEAD,
        CPUHP_IOMMU_IOVA_DEAD,
        CPUHP_AP_ARM_CACHE_B15_RAC_DEAD,
        CPUHP_PADATA_DEAD,
        CPUHP_AP_DTPM_CPU_DEAD,
        CPUHP_RANDOM_PREPARE,
        CPUHP_WORKQUEUE_PREP,
        CPUHP_POWER_NUMA_PREPARE,
        CPUHP_HRTIMERS_PREPARE,
        CPUHP_X2APIC_PREPARE,
        CPUHP_SMPCFD_PREPARE,
        CPUHP_RELAY_PREPARE,
        CPUHP_MD_RAID5_PREPARE,
        CPUHP_RCUTREE_PREP,
        CPUHP_CPUIDLE_COUPLED_PREPARE,
        CPUHP_POWERPC_PMAC_PREPARE,
        CPUHP_POWERPC_MMU_CTX_PREPARE,
        CPUHP_XEN_PREPARE,
        CPUHP_XEN_EVTCHN_PREPARE,
        CPUHP_ARM_SHMOBILE_SCU_PREPARE,
        CPUHP_SH_SH3X_PREPARE,
        CPUHP_TOPOLOGY_PREPARE,
        CPUHP_NET_IUCV_PREPARE,
        CPUHP_ARM_BL_PREPARE,
        CPUHP_TRACE_RB_PREPARE,
        CPUHP_MM_ZS_PREPARE,
        CPUHP_MM_ZSWP_POOL_PREPARE,
        CPUHP_KVM_PPC_BOOK3S_PREPARE,
        CPUHP_ZCOMP_PREPARE,
        CPUHP_TIMERS_PREPARE,
        CPUHP_TMIGR_PREPARE,
        CPUHP_MIPS_SOC_PREPARE,
        CPUHP_BP_PREPARE_DYN,
        CPUHP_BP_PREPARE_DYN_END,
        CPUHP_BP_KICK_AP,
        CPUHP_BRINGUP_CPU,
        CPUHP_AP_IDLE_DEAD,
        CPUHP_AP_OFFLINE,
        CPUHP_AP_CACHECTRL_STARTING,
        CPUHP_AP_SCHED_STARTING,
        CPUHP_AP_RCUTREE_DYING,
        CPUHP_AP_CPU_PM_STARTING,
        CPUHP_AP_IRQ_GIC_STARTING,
        CPUHP_AP_IRQ_HIP04_STARTING,
        CPUHP_AP_IRQ_APPLE_AIC_STARTING,
        CPUHP_AP_IRQ_ARMADA_XP_STARTING,
        CPUHP_AP_IRQ_BCM2836_STARTING,
        CPUHP_AP_IRQ_MIPS_GIC_STARTING,
        CPUHP_AP_IRQ_EIOINTC_STARTING,
        CPUHP_AP_IRQ_AVECINTC_STARTING,
        CPUHP_AP_IRQ_SIFIVE_PLIC_STARTING,
        CPUHP_AP_IRQ_RISCV_IMSIC_STARTING,
        CPUHP_AP_IRQ_RISCV_SBI_IPI_STARTING,
        CPUHP_AP_ARM_MVEBU_COHERENCY,
        CPUHP_AP_PERF_X86_AMD_UNCORE_STARTING,
        CPUHP_AP_PERF_X86_STARTING,
        CPUHP_AP_PERF_X86_AMD_IBS_STARTING,
        CPUHP_AP_PERF_XTENSA_STARTING,
        CPUHP_AP_ARM_VFP_STARTING,
        CPUHP_AP_ARM64_DEBUG_MONITORS_STARTING,
        CPUHP_AP_PERF_ARM_HW_BREAKPOINT_STARTING,
        CPUHP_AP_PERF_ARM_ACPI_STARTING,
        CPUHP_AP_PERF_ARM_STARTING,
        CPUHP_AP_PERF_RISCV_STARTING,
        CPUHP_AP_ARM_L2X0_STARTING,
        CPUHP_AP_EXYNOS4_MCT_TIMER_STARTING,
        CPUHP_AP_ARM_ARCH_TIMER_STARTING,
        CPUHP_AP_ARM_ARCH_TIMER_EVTSTRM_STARTING,
        CPUHP_AP_ARM_GLOBAL_TIMER_STARTING,
        CPUHP_AP_JCORE_TIMER_STARTING,
        CPUHP_AP_ARM_TWD_STARTING,
        CPUHP_AP_QCOM_TIMER_STARTING,
        CPUHP_AP_TEGRA_TIMER_STARTING,
        CPUHP_AP_ARMADA_TIMER_STARTING,
        CPUHP_AP_MIPS_GIC_TIMER_STARTING,
        CPUHP_AP_ARC_TIMER_STARTING,
        CPUHP_AP_REALTEK_TIMER_STARTING,
        CPUHP_AP_RISCV_TIMER_STARTING,
        CPUHP_AP_CLINT_TIMER_STARTING,
        CPUHP_AP_CSKY_TIMER_STARTING,
        CPUHP_AP_TI_GP_TIMER_STARTING,
        CPUHP_AP_HYPERV_TIMER_STARTING,
        CPUHP_AP_DUMMY_TIMER_STARTING,
        CPUHP_AP_ARM_XEN_STARTING,
        CPUHP_AP_ARM_XEN_RUNSTATE_STARTING,
        CPUHP_AP_ARM_CORESIGHT_STARTING,
        CPUHP_AP_ARM_CORESIGHT_CTI_STARTING,
        CPUHP_AP_ARM64_ISNDEP_STARTING,
        CPUHP_AP_SMPCFD_DYING,
        CPUHP_AP_HRTIMERS_DYING,
        CPUHP_AP_TICK_DYING,
        CPUHP_AP_X86_TBOOT_DYING,
        CPUHP_AP_ARM_CACHE_B15_RAC_DYING,
        CPUHP_AP_ONLINE,
        CPUHP_TEARDOWN_CPU,
        CPUHP_AP_ONLINE_IDLE,
        CPUHP_AP_HYPERV_ONLINE,
        CPUHP_AP_KVM_ONLINE,
        CPUHP_AP_SCHED_WAIT_EMPTY,
        CPUHP_AP_SMPBOOT_THREADS,
        CPUHP_AP_IRQ_AFFINITY_ONLINE,
        CPUHP_AP_BLK_MQ_ONLINE,
        CPUHP_AP_ARM_MVEBU_SYNC_CLOCKS,
        CPUHP_AP_X86_INTEL_EPB_ONLINE,
        CPUHP_AP_PERF_ONLINE,
        CPUHP_AP_PERF_X86_ONLINE,
        CPUHP_AP_PERF_X86_UNCORE_ONLINE,
        CPUHP_AP_PERF_X86_AMD_UNCORE_ONLINE,
        CPUHP_AP_PERF_X86_AMD_POWER_ONLINE,
        CPUHP_AP_PERF_X86_RAPL_ONLINE,
        CPUHP_AP_PERF_S390_CF_ONLINE,
        CPUHP_AP_PERF_S390_SF_ONLINE,
        CPUHP_AP_PERF_ARM_CCI_ONLINE,
        CPUHP_AP_PERF_ARM_CCN_ONLINE,
        CPUHP_AP_PERF_ARM_HISI_CPA_ONLINE,
        CPUHP_AP_PERF_ARM_HISI_DDRC_ONLINE,
        CPUHP_AP_PERF_ARM_HISI_HHA_ONLINE,
        CPUHP_AP_PERF_ARM_HISI_L3_ONLINE,
        CPUHP_AP_PERF_ARM_HISI_PA_ONLINE,
        CPUHP_AP_PERF_ARM_HISI_SLLC_ONLINE,
        CPUHP_AP_PERF_ARM_HISI_PCIE_PMU_ONLINE,
        CPUHP_AP_PERF_ARM_HNS3_PMU_ONLINE,
        CPUHP_AP_PERF_ARM_L2X0_ONLINE,
        CPUHP_AP_PERF_ARM_QCOM_L2_ONLINE,
        CPUHP_AP_PERF_ARM_QCOM_L3_ONLINE,
        CPUHP_AP_PERF_ARM_APM_XGENE_ONLINE,
        CPUHP_AP_PERF_ARM_CAVIUM_TX2_UNCORE_ONLINE,
        CPUHP_AP_PERF_ARM_MARVELL_CN10K_DDR_ONLINE,
        CPUHP_AP_PERF_POWERPC_NEST_IMC_ONLINE,
        CPUHP_AP_PERF_POWERPC_CORE_IMC_ONLINE,
        CPUHP_AP_PERF_POWERPC_THREAD_IMC_ONLINE,
        CPUHP_AP_PERF_POWERPC_TRACE_IMC_ONLINE,
        CPUHP_AP_PERF_POWERPC_HV_24x7_ONLINE,
        CPUHP_AP_PERF_POWERPC_HV_GPCI_ONLINE,
        CPUHP_AP_PERF_CSKY_ONLINE,
        CPUHP_AP_TMIGR_ONLINE,
        CPUHP_AP_WATCHDOG_ONLINE,
        CPUHP_AP_WORKQUEUE_ONLINE,
        CPUHP_AP_RANDOM_ONLINE,
        CPUHP_AP_RCUTREE_ONLINE,
        CPUHP_AP_BASE_CACHEINFO_ONLINE,
        CPUHP_AP_ONLINE_DYN,
        CPUHP_AP_ONLINE_DYN_END,
        CPUHP_AP_X86_HPET_ONLINE,
        CPUHP_AP_X86_KVM_CLK_ONLINE,
        CPUHP_AP_ACTIVE,
        CPUHP_ONLINE;

    }
}

