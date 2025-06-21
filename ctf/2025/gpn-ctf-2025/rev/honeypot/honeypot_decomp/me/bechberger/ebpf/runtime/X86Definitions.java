/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.HybridDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class X86Definitions {
    public static final @Unsigned int x86_lbr_exclusive_lbr = 0;
    public static final @Unsigned int x86_lbr_exclusive_bts = 1;
    public static final @Unsigned int x86_lbr_exclusive_pt = 2;
    public static final @Unsigned int x86_lbr_exclusive_max = 3;

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_acpi_numa_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> x86_acpi_os_ioremap(@Unsigned @OriginalName(value="acpi_physical_address") long phys, @Unsigned @OriginalName(value="acpi_size") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_amd_ssb_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long x86_default_get_root_pointer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_default_set_root_pointer(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> x86_get_event_constraints(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_get_mtrr_mem_range(Ptr<runtime.range> range2, int nr_range, @Unsigned long extra_remove_base, @Unsigned long extra_remove_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_late_time_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pci_root_bus_node(int bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pci_root_bus_resources(int bus, Ptr<ListDefinitions.list_head> resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_amd_ibs_dying_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_amd_ibs_starting_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int x86_pmu_config_addr(int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_disable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int x86_pmu_event_addr(int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int x86_pmu_fixed_ctr_addr(int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_max_num_counters(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_num_counters(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_num_counters_fixed(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_spec_ctrl_setup_ap() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_virt_spec_ctrl(@Unsigned long guest_virt_spec_ctrl, boolean setguest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_cluster_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_core_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_cpuid_vendor() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_die_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_early_init_platform_quirks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int x86_family(@Unsigned int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long x86_fsbase_read_task(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_fsbase_write_task(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long fsbase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long x86_fsgsbase_read_task(Ptr<TaskDefinitions.task_struct> task2, @Unsigned short selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long x86_gsbase_read_cpu_inactive() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long x86_gsbase_read_task(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_gsbase_write_cpu_inactive(@Unsigned long gsbase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_gsbase_write_task(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long gsbase) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean x86_has_pat_wp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int x86_model(@Unsigned int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int x86_msi_msg_get_destid(Ptr<MsiDefinitions.msi_msg> msg, boolean extid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean x86_pnpbios_disabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_smt_flags() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int x86_stepping(@Unsigned int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="x86_cpu_has_min_microcode_rev((const struct x86_cpu_desc*)$arg1)")
    public static boolean x86_cpu_has_min_microcode_rev(Ptr<x86_cpu_desc> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_fwspec_is_hpet(Ptr<IrqDefinitions.irq_fwspec> fwspec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_fwspec_is_ioapic(Ptr<IrqDefinitions.irq_fwspec> fwspec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_init_rdrand(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct x86_cpu_id*)x86_match_cpu((const struct x86_cpu_id*)$arg1))")
    public static Ptr<x86_cpu_id> x86_match_cpu(Ptr<x86_cpu_id> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_perf_get_lbr(Ptr<x86_pmu_lbr> lbr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_vector_activate(Ptr<IrqDefinitions.irq_domain> dom, Ptr<IrqDefinitions.irq_data> irqd, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_vector_alloc_irqs(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_vector_deactivate(Ptr<IrqDefinitions.irq_domain> dom, Ptr<IrqDefinitions.irq_data> irqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_vector_free_irqs(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_vector_msi_compose_msg(Ptr<IrqDefinitions.irq_data> data, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_vector_select(Ptr<IrqDefinitions.irq_domain> d, Ptr<IrqDefinitions.irq_fwspec> fwspec, IrqDefinitions.irq_domain_bus_token bus_token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static EfiDefinitions.efi_secureboot_mode __x86_ima_efi_boot_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _x86_pmu_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int x86_acpi_enter_sleep_state(char state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_acpi_suspend_lowlevel() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_add_exclusive(@Unsigned int what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_call_depth_emit_accounting(Ptr<Ptr<Character>> pprog, Ptr<?> func, Ptr<?> ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_configure_nx() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_create_pci_msi_domain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_del_exclusive(@Unsigned int what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long x86_event_sysfs_show(String page2, @Unsigned long config, @Unsigned long event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pmu> x86_get_pmu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean x86_init_dev_msi_info(Ptr<runtime.device> dev, Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_domain> real_parent, Ptr<MsiDefinitions.msi_domain_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_init_noop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_init_uint_noop(@Unsigned int unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_msi_prepare(Ptr<IrqDefinitions.irq_domain> domain, Ptr<runtime.device> dev, int nvec, Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_nofsgsbase_setup(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_noinvpcid_setup(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_nopcid_setup(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_numa_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_op_int_noop(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_perf_event_set_period(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long x86_perf_event_update(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_perf_rdpmc_index(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_add(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_aux_output_match(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_cancel_txn(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_check_period(Ptr<PerfDefinitions.perf_event> event2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_commit_txn(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_dead_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_del(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_disable(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_dying_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_enable(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_enable_all(int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_enable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_event_idx(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_event_init(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_event_mapped(Ptr<PerfDefinitions.perf_event> event2, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_event_unmapped(Ptr<PerfDefinitions.perf_event> event2, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_extra_regs(@Unsigned long config, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean x86_pmu_filter(Ptr<runtime.pmu> pmu2, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_handle_irq(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_hw_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_max_precise() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_online_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_prepare_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_sched_task(Ptr<PerfDefinitions.perf_event_pmu_context> pmu_ctx, boolean sched_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_show_pmu_cap(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_start(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_start_txn(Ptr<runtime.pmu> pmu2, @Unsigned int txn_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_pmu_starting_cpu(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_static_call_update() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_stop(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_pmu_swap_task_ctx(Ptr<PerfDefinitions.perf_event_pmu_context> prev_epc, Ptr<PerfDefinitions.perf_event_pmu_context> next_epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long x86_read_arch_cap_msr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_release_hardware() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_reserve_hardware() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_schedule_events(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int n, Ptr<Integer> assign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int x86_setup_perfctr(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean x86_thermal_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void x86_wallclock_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct x86_perf_task_context_arch_lbr_xsave")
    @NotUsableInJava
    public static class x86_perf_task_context_arch_lbr_xsave
    extends Struct {
        public x86_perf_task_context_opt opt;
        @InlineUnion(value=89483)
        public @InlineUnion(value=89483) misc.xregs_state xsave;
        @InlineUnion(value=89483)
        public  @InlineUnion(value=89483) AnonDefinitions.anon_member_of_anon_member_of_x86_perf_task_context_arch_lbr_xsave anon1$1;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_perf_task_context_arch_lbr")
    @NotUsableInJava
    public static class x86_perf_task_context_arch_lbr
    extends Struct {
        public x86_perf_task_context_opt opt;
        public misc.lbr_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_perf_task_context")
    @NotUsableInJava
    public static class x86_perf_task_context
    extends Struct {
        public @Unsigned long lbr_sel;
        public int tos;
        public int valid_lbrs;
        public x86_perf_task_context_opt opt;
        public misc.lbr_entry @Size(value=32) [] lbr;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_perf_task_context_opt")
    @NotUsableInJava
    public static class x86_perf_task_context_opt
    extends Struct {
        public int lbr_callstack_users;
        public int lbr_stack_state;
        public int log_id;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_pmu_lbr")
    @NotUsableInJava
    public static class x86_pmu_lbr
    extends Struct {
        public @Unsigned int nr;
        public @Unsigned int from;
        public @Unsigned int to;
        public @Unsigned int info;
        public boolean has_callstack;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_perf_regs")
    @NotUsableInJava
    public static class x86_perf_regs
    extends Struct {
        public PtDefinitions.pt_regs regs;
        public Ptr<@Unsigned Long> xmm_regs;
    }

    @Type(noCCodeGeneration=true, cType="enum x86_regset_64")
    public static enum x86_regset_64 implements Enum<x86_regset_64>,
    TypedEnum<x86_regset_64, Integer>
    {
        REGSET64_GENERAL,
        REGSET64_FP,
        REGSET64_IOPERM,
        REGSET64_XSTATE,
        REGSET64_SSP;

    }

    @Type(noCCodeGeneration=true, cType="enum x86_regset_32")
    public static enum x86_regset_32 implements Enum<x86_regset_32>,
    TypedEnum<x86_regset_32, Integer>
    {
        REGSET32_GENERAL,
        REGSET32_FP,
        REGSET32_XFP,
        REGSET32_XSTATE,
        REGSET32_TLS,
        REGSET32_IOPERM;

    }

    @Type(noCCodeGeneration=true, cType="struct x86_cpu_desc")
    @NotUsableInJava
    public static class x86_cpu_desc
    extends Struct {
        public char x86_family;
        public char x86_vendor;
        public char x86_model;
        public char x86_stepping;
        public @Unsigned int x86_microcode_rev;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_mapping_info")
    @NotUsableInJava
    public static class x86_mapping_info
    extends Struct {
        public Ptr<?> alloc_pgt_page;
        public Ptr<?> free_pgt_page;
        public Ptr<?> context;
        public @Unsigned long page_flag;
        public @Unsigned long offset;
        public boolean direct_gbpages;
        public @Unsigned long kernpg_flag;
    }

    @Type(noCCodeGeneration=true, cType="enum x86_hypervisor_type")
    public static enum x86_hypervisor_type implements Enum<x86_hypervisor_type>,
    TypedEnum<x86_hypervisor_type, Integer>
    {
        X86_HYPER_NATIVE,
        X86_HYPER_VMWARE,
        X86_HYPER_MS_HYPERV,
        X86_HYPER_XEN_PV,
        X86_HYPER_XEN_HVM,
        X86_HYPER_KVM,
        X86_HYPER_JAILHOUSE,
        X86_HYPER_ACRN;

    }

    @Type(noCCodeGeneration=true, cType="struct x86_topology_system")
    @NotUsableInJava
    public static class x86_topology_system
    extends Struct {
        public @Unsigned int @Size(value=7) [] dom_shifts;
        public @Unsigned int @Size(value=7) [] dom_size;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_xfeat_component")
    @NotUsableInJava
    public static class x86_xfeat_component
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int size;
        public @Unsigned int offset;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_cpu_id")
    @NotUsableInJava
    public static class x86_cpu_id
    extends Struct {
        public @Unsigned short vendor;
        public @Unsigned short family;
        public @Unsigned short model;
        public @Unsigned short steppings;
        public @Unsigned short feature;
        public @Unsigned short flags;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_apic_ops")
    @NotUsableInJava
    public static class x86_apic_ops
    extends Struct {
        public Ptr<?> io_apic_read;
        public Ptr<?> restore;
    }

    @Type(noCCodeGeneration=true, cType="enum x86_hardware_subarch")
    public static enum x86_hardware_subarch implements Enum<x86_hardware_subarch>,
    TypedEnum<x86_hardware_subarch, Integer>
    {
        X86_SUBARCH_PC,
        X86_SUBARCH_LGUEST,
        X86_SUBARCH_XEN,
        X86_SUBARCH_INTEL_MID,
        X86_SUBARCH_CE4100,
        X86_NR_SUBARCHS;

    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_ops")
    @NotUsableInJava
    public static class x86_init_ops
    extends Struct {
        public x86_init_resources resources;
        public x86_init_mpparse mpparse;
        public x86_init_irqs irqs;
        public x86_init_oem oem;
        public x86_init_paging paging;
        public x86_init_timers timers;
        public x86_init_iommu iommu;
        public x86_init_pci pci;
        public x86_hyper_init hyper;
        public x86_init_acpi acpi;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_acpi")
    @NotUsableInJava
    public static class x86_init_acpi
    extends Struct {
        public Ptr<?> set_root_pointer;
        public Ptr<?> get_root_pointer;
        public Ptr<?> reduced_hw_early_init;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_hyper_init")
    @NotUsableInJava
    public static class x86_hyper_init
    extends Struct {
        public Ptr<?> init_platform;
        public Ptr<?> guest_late_init;
        public Ptr<?> x2apic_available;
        public Ptr<?> msi_ext_dest_id;
        public Ptr<?> init_mem_mapping;
        public Ptr<?> init_after_bootmem;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_pci")
    @NotUsableInJava
    public static class x86_init_pci
    extends Struct {
        public Ptr<?> arch_init;
        public Ptr<?> init;
        public Ptr<?> init_irq;
        public Ptr<?> fixup_irqs;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_iommu")
    @NotUsableInJava
    public static class x86_init_iommu
    extends Struct {
        public Ptr<?> iommu_init;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_timers")
    @NotUsableInJava
    public static class x86_init_timers
    extends Struct {
        public Ptr<?> setup_percpu_clockev;
        public Ptr<?> timer_init;
        public Ptr<?> wallclock_init;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_paging")
    @NotUsableInJava
    public static class x86_init_paging
    extends Struct {
        public Ptr<?> pagetable_init;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_oem")
    @NotUsableInJava
    public static class x86_init_oem
    extends Struct {
        public Ptr<?> arch_setup;
        public Ptr<?> banner;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_irqs")
    @NotUsableInJava
    public static class x86_init_irqs
    extends Struct {
        public Ptr<?> pre_vector_init;
        public Ptr<?> intr_init;
        public Ptr<?> intr_mode_select;
        public Ptr<?> intr_mode_init;
        public Ptr<?> create_pci_msi_domain;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_resources")
    @NotUsableInJava
    public static class x86_init_resources
    extends Struct {
        public Ptr<?> probe_roms;
        public Ptr<?> reserve_resources;
        public Ptr<?> memory_setup;
        public Ptr<?> dmi_setup;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_init_mpparse")
    @NotUsableInJava
    public static class x86_init_mpparse
    extends Struct {
        public Ptr<?> setup_ioapic_ids;
        public Ptr<?> find_mptable;
        public Ptr<?> early_parse_smp_cfg;
        public Ptr<?> parse_smp_cfg;
    }

    @Type(noCCodeGeneration=true, cType="union x86_pmu_config")
    @NotUsableInJava
    public static class x86_pmu_config
    extends Union {
        public misc.bits_of_x86_pmu_config bits;
        public @Unsigned long value;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_pmu")
    @NotUsableInJava
    public static class x86_pmu
    extends Struct {
        public String name;
        public int version;
        public Ptr<?> handle_irq;
        public Ptr<?> disable_all;
        public Ptr<?> enable_all;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> assign;
        public Ptr<?> add;
        public Ptr<?> del;
        public Ptr<?> read;
        public Ptr<?> set_period;
        public Ptr<?> update;
        public Ptr<?> hw_config;
        public Ptr<?> schedule_events;
        public @Unsigned int eventsel;
        public @Unsigned int perfctr;
        public @Unsigned int fixedctr;
        public Ptr<?> addr_offset;
        public Ptr<?> rdpmc_index;
        public Ptr<?> event_map;
        public int max_events;
        public @Unsigned long config_mask;
        @InlineUnion(value=3547)
        public @InlineUnion(value=3547) @Unsigned long cntr_mask64;
        @InlineUnion(value=3547)
        public @InlineUnion(value=3547) @Unsigned long @Size(value=1) [] cntr_mask;
        @InlineUnion(value=3548)
        public @InlineUnion(value=3548) @Unsigned long fixed_cntr_mask64;
        @InlineUnion(value=3548)
        public @InlineUnion(value=3548) @Unsigned long @Size(value=1) [] fixed_cntr_mask;
        public int cntval_bits;
        public @Unsigned long cntval_mask;
        @InlineUnion(value=3553)
        public @InlineUnion(value=3553) @Unsigned long events_maskl;
        @InlineUnion(value=3553)
        public @InlineUnion(value=3553) @Unsigned long @Size(value=1) [] events_mask;
        public int events_mask_len;
        public int apic;
        public @Unsigned long max_period;
        public Ptr<?> get_event_constraints;
        public Ptr<?> put_event_constraints;
        public Ptr<?> start_scheduling;
        public Ptr<?> commit_scheduling;
        public Ptr<?> stop_scheduling;
        public Ptr<EventDefinitions.event_constraint> event_constraints;
        public Ptr<x86_pmu_quirk> quirks;
        public Ptr<?> limit_period;
        public @Unsigned int late_ack;
        public @Unsigned int mid_ack;
        public @Unsigned int enabled_ack;
        public int attr_rdpmc_broken;
        public int attr_rdpmc;
        public Ptr<Ptr<runtime.attribute>> format_attrs;
        public Ptr<?> events_sysfs_show;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> attr_update;
        public @Unsigned long attr_freeze_on_smi;
        public Ptr<?> cpu_prepare;
        public Ptr<?> cpu_starting;
        public Ptr<?> cpu_dying;
        public Ptr<?> cpu_dead;
        public Ptr<?> check_microcode;
        public Ptr<?> sched_task;
        public @Unsigned long intel_ctrl;
        public PerfDefinitions.perf_capabilities intel_cap;
        public @Unsigned int bts;
        public @Unsigned int bts_active;
        public @Unsigned int pebs;
        public @Unsigned int pebs_active;
        public @Unsigned int pebs_broken;
        public @Unsigned int pebs_prec_dist;
        public @Unsigned int pebs_no_tlb;
        public @Unsigned int pebs_no_isolation;
        public @Unsigned int pebs_block;
        public @Unsigned int pebs_ept;
        public int pebs_record_size;
        public int pebs_buffer_size;
        public @Unsigned long pebs_events_mask;
        public Ptr<?> drain_pebs;
        public Ptr<EventDefinitions.event_constraint> pebs_constraints;
        public Ptr<?> pebs_aliases;
        public Ptr<?> pebs_latency_data;
        public @Unsigned long large_pebs_flags;
        public @Unsigned long rtm_abort_event;
        public @Unsigned long pebs_capable;
        public @Unsigned int lbr_tos;
        public @Unsigned int lbr_from;
        public @Unsigned int lbr_to;
        public @Unsigned int lbr_info;
        public @Unsigned int lbr_nr;
        @InlineUnion(value=3554)
        public @InlineUnion(value=3554) @Unsigned long lbr_sel_mask;
        @InlineUnion(value=3554)
        public @InlineUnion(value=3554) @Unsigned long lbr_ctl_mask;
        @InlineUnion(value=3555)
        public @InlineUnion(value=3555) Ptr<Integer> lbr_sel_map;
        @InlineUnion(value=3555)
        public @InlineUnion(value=3555) Ptr<Integer> lbr_ctl_map;
        public boolean lbr_double_abort;
        public boolean lbr_pt_coexist;
        public @Unsigned int lbr_has_info;
        public @Unsigned int lbr_has_tsx;
        public @Unsigned int lbr_from_flags;
        public @Unsigned int lbr_to_cycles;
        public @Unsigned int lbr_depth_mask;
        public @Unsigned int lbr_deep_c_reset;
        public @Unsigned int lbr_lip;
        public @Unsigned int lbr_cpl;
        public @Unsigned int lbr_filter;
        public @Unsigned int lbr_call_stack;
        public @Unsigned int lbr_mispred;
        public @Unsigned int lbr_timed_lbr;
        public @Unsigned int lbr_br_type;
        public @Unsigned int lbr_counters;
        public Ptr<?> lbr_reset;
        public Ptr<?> lbr_read;
        public Ptr<?> lbr_save;
        public Ptr<?> lbr_restore;
        public AtomicDefinitions.atomic_t @Size(value=3) [] lbr_exclusive;
        public int num_topdown_events;
        public Ptr<?> swap_task_ctx;
        public @Unsigned int amd_nb_constraints;
        public @Unsigned long perf_ctr_pair_en;
        public Ptr<misc.extra_reg> extra_regs;
        public @Unsigned int flags;
        public Ptr<?> guest_get_msrs;
        public Ptr<?> check_period;
        public Ptr<?> aux_output_match;
        public Ptr<?> filter;
        public int num_hybrid_pmus;
        public Ptr<x86_hybrid_pmu> hybrid_pmu;
        public Ptr<?> get_hybrid_cpu_type;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_hybrid_pmu")
    @NotUsableInJava
    public static class x86_hybrid_pmu
    extends Struct {
        public runtime.pmu pmu;
        public String name;
        public HybridDefinitions.hybrid_pmu_type pmu_type;
        public @OriginalName(value="cpumask_t") runtime.cpumask supported_cpus;
        public PerfDefinitions.perf_capabilities intel_cap;
        public @Unsigned long intel_ctrl;
        public @Unsigned long pebs_events_mask;
        public @Unsigned long config_mask;
        @InlineUnion(value=3547)
        public @InlineUnion(value=3547) @Unsigned long cntr_mask64;
        @InlineUnion(value=3547)
        public @InlineUnion(value=3547) @Unsigned long @Size(value=1) [] cntr_mask;
        @InlineUnion(value=3548)
        public @InlineUnion(value=3548) @Unsigned long fixed_cntr_mask64;
        @InlineUnion(value=3548)
        public @InlineUnion(value=3548) @Unsigned long @Size(value=1) [] fixed_cntr_mask;
        public EventDefinitions.event_constraint unconstrained;
        public @Unsigned long @Size(value=42) [] hw_cache_event_ids;
        public @Unsigned long @Size(value=42) [] hw_cache_extra_regs;
        public Ptr<EventDefinitions.event_constraint> event_constraints;
        public Ptr<EventDefinitions.event_constraint> pebs_constraints;
        public Ptr<misc.extra_reg> extra_regs;
        public @Unsigned int late_ack;
        public @Unsigned int mid_ack;
        public @Unsigned int enabled_ack;
        public @Unsigned long @Size(value=256) [] pebs_data_source;
    }

    @Type(noCCodeGeneration=true, cType="enum x86_lbr_exclusive")
    public static enum x86_lbr_exclusive implements Enum<x86_lbr_exclusive>,
    TypedEnum<x86_lbr_exclusive, Integer>
    {
        x86_lbr_exclusive_lbr,
        x86_lbr_exclusive_bts,
        x86_lbr_exclusive_pt,
        x86_lbr_exclusive_max;

    }

    @Type(noCCodeGeneration=true, cType="struct x86_pmu_quirk")
    @NotUsableInJava
    public static class x86_pmu_quirk
    extends Struct {
        public Ptr<x86_pmu_quirk> next;
        public Ptr<?> func;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_pmu_capability")
    @NotUsableInJava
    public static class x86_pmu_capability
    extends Struct {
        public int version;
        public int num_counters_gp;
        public int num_counters_fixed;
        public int bit_width_gp;
        public int bit_width_fixed;
        public @Unsigned int events_mask;
        public int events_mask_len;
        public @Unsigned int pebs_ept;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_msi_addr_hi")
    @NotUsableInJava
    public static class x86_msi_addr_hi
    extends Struct {
        public @Unsigned int reserved;
        public @Unsigned int destid_8_31;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_msi_addr_lo")
    @NotUsableInJava
    public static class x86_msi_addr_lo
    extends Struct {
        @InlineUnion(value=3214)
        public  @InlineUnion(value=3214) AnonDefinitions.anon_member_of_anon_member_of_arch_msi_msg_addr_lo_t_and_anon_member_of_x86_msi_addr_lo anon0$0;
        @InlineUnion(value=3214)
        public  @InlineUnion(value=3214) AnonDefinitions.anon_member_of_anon_member_of_arch_msi_msg_addr_lo_t_and_anon_member_of_x86_msi_addr_lo anon0$1;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_msi_data")
    @NotUsableInJava
    public static class x86_msi_data
    extends Struct {
        @InlineUnion(value=3209)
        public  @InlineUnion(value=3209) AnonDefinitions.anon_member_of_anon_member_of_arch_msi_msg_data_t_and_anon_member_of_x86_msi_data anon0$0;
        @InlineUnion(value=3209)
        public @InlineUnion(value=3209) @Unsigned int dmar_subhandle;
    }

    @Type(noCCodeGeneration=true, cType="enum x86_pf_error_code")
    public static enum x86_pf_error_code implements Enum<x86_pf_error_code>,
    TypedEnum<x86_pf_error_code, Integer>
    {
        X86_PF_PROT,
        X86_PF_WRITE,
        X86_PF_USER,
        X86_PF_RSVD,
        X86_PF_INSTR,
        X86_PF_PK,
        X86_PF_SHSTK,
        X86_PF_SGX,
        X86_PF_RMP;

    }

    @Type(noCCodeGeneration=true, cType="struct x86_io_bitmap")
    @NotUsableInJava
    public static class x86_io_bitmap
    extends Struct {
        public @Unsigned long prev_sequence;
        public @Unsigned int prev_max;
        public @Unsigned long @Size(value=1025) [] bitmap;
        public @Unsigned long @Size(value=1025) [] mapall;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_hw_tss")
    @NotUsableInJava
    public static class x86_hw_tss
    extends Struct {
        public @Unsigned int reserved1;
        public @Unsigned long sp0;
        public @Unsigned long sp1;
        public @Unsigned long sp2;
        public @Unsigned long reserved2;
        public @Unsigned long @Size(value=7) [] ist;
        public @Unsigned int reserved3;
        public @Unsigned int reserved4;
        public @Unsigned short reserved5;
        public @Unsigned short io_bitmap_base;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_platform_ops")
    @NotUsableInJava
    public static class x86_platform_ops
    extends Struct {
        public Ptr<?> calibrate_cpu;
        public Ptr<?> calibrate_tsc;
        public Ptr<?> get_wallclock;
        public Ptr<?> set_wallclock;
        public Ptr<?> iommu_shutdown;
        public Ptr<?> is_untracked_pat_range;
        public Ptr<?> nmi_init;
        public Ptr<?> get_nmi_reason;
        public Ptr<?> save_sched_clock_state;
        public Ptr<?> restore_sched_clock_state;
        public Ptr<?> apic_post_init;
        public x86_legacy_features legacy;
        public Ptr<?> set_legacy_features;
        public Ptr<?> realmode_reserve;
        public Ptr<?> realmode_init;
        public x86_hyper_runtime hyper;
        public x86_guest guest;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_hyper_runtime")
    @NotUsableInJava
    public static class x86_hyper_runtime
    extends Struct {
        public Ptr<?> pin_vcpu;
        public Ptr<?> sev_es_hcall_prepare;
        public Ptr<?> sev_es_hcall_finish;
        public Ptr<?> is_private_mmio;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_legacy_features")
    @NotUsableInJava
    public static class x86_legacy_features
    extends Struct {
        public x86_legacy_i8042_state i8042;
        public int rtc;
        public int warm_reset;
        public int no_vga;
        public int reserve_bios_regions;
        public x86_legacy_devices devices;
    }

    @Type(noCCodeGeneration=true, cType="enum x86_legacy_i8042_state")
    public static enum x86_legacy_i8042_state implements Enum<x86_legacy_i8042_state>,
    TypedEnum<x86_legacy_i8042_state, Integer>
    {
        X86_LEGACY_I8042_PLATFORM_ABSENT,
        X86_LEGACY_I8042_FIRMWARE_ABSENT,
        X86_LEGACY_I8042_EXPECTED_PRESENT;

    }

    @Type(noCCodeGeneration=true, cType="struct x86_legacy_devices")
    @NotUsableInJava
    public static class x86_legacy_devices
    extends Struct {
        public int pnpbios;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_cpuinit_ops")
    @NotUsableInJava
    public static class x86_cpuinit_ops
    extends Struct {
        public Ptr<?> setup_percpu_clockev;
        public Ptr<?> early_percpu_clock_init;
        public Ptr<?> fixup_cpu_id;
        public boolean parallel_bringup;
    }

    @Type(noCCodeGeneration=true, cType="struct x86_guest")
    @NotUsableInJava
    public static class x86_guest
    extends Struct {
        public Ptr<?> enc_status_change_prepare;
        public Ptr<?> enc_status_change_finish;
        public Ptr<?> enc_tlb_flush_required;
        public Ptr<?> enc_cache_flush_required;
        public Ptr<?> enc_kexec_begin;
        public Ptr<?> enc_kexec_finish;
    }

    @Type(noCCodeGeneration=true, cType="enum x86_topology_domains")
    public static enum x86_topology_domains implements Enum<x86_topology_domains>,
    TypedEnum<x86_topology_domains, Integer>
    {
        TOPO_SMT_DOMAIN,
        TOPO_CORE_DOMAIN,
        TOPO_MODULE_DOMAIN,
        TOPO_TILE_DOMAIN,
        TOPO_DIE_DOMAIN,
        TOPO_DIEGRP_DOMAIN,
        TOPO_PKG_DOMAIN,
        TOPO_MAX_DOMAIN;

    }
}

