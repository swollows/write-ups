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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AgpDefinitions;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.CapDefinitions;
import me.bechberger.ebpf.runtime.CcDefinitions;
import me.bechberger.ebpf.runtime.ContextDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.CpuidleDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmarDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.HwDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IopfDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MmuDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PinDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RegmapDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.UncoreDefinitions;
import me.bechberger.ebpf.runtime.UpdateDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class IntelDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __intel_pmu_snapshot_branch_stack(Ptr<PerfDefinitions.perf_branch_entry> entries, @Unsigned int cnt, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> __intel_shared_reg_get_constraints(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> event2, Ptr<HwDefinitions.hw_perf_event_extra> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_arch_events_quirk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_arch_invalidate_secondary_tlbs(Ptr<MmuDefinitions.mmu_notifier> mn2, Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_check_pebs_isolation() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_chtcrc_pmic_opregion_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_chtcrc_pmic_opregion_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_clovertown_quirk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_commit_scheduling(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, int cntr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_configure() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_cpuc_finish(Ptr<CpuDefinitions.cpu_hw_events> cpuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cpuc_prepare(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_disable_iommus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_drain_pasid_prq(Ptr<runtime.device> dev, @Unsigned int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_epb_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_epb_offline(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_epb_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_epb_restore() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_epb_save() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long intel_event_sysfs_show(String page2, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_fetch_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_flush_iotlb_all(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> intel_get_event_constraints(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> intel_get_excl_constraints(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> event2, int idx, Ptr<EventDefinitions.event_constraint> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_graphics_quirks(int num, int slot2, int func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PerfDefinitions.perf_guest_switch_msr> intel_guest_get_msrs(Ptr<Integer> nr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_ht_bug() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long intel_hybrid_get_attr_cpus(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_add(Ptr<DmarDefinitions.dmar_drhd_unit> dmaru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_attach_device(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_iommu_capable(Ptr<runtime.device> dev, IommuDefinitions.iommu_cap cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_dev_disable_feat(Ptr<runtime.device> dev, IommuDefinitions.iommu_dev_features feat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_dev_enable_feat(Ptr<runtime.device> dev, IommuDefinitions.iommu_dev_features feat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_group> intel_iommu_device_group(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_domain> intel_iommu_domain_alloc(@Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_iommu_domain_alloc_user($arg1, $arg2, $arg3, (const struct iommu_user_data*)$arg4)")
    public static Ptr<IommuDefinitions.iommu_domain> intel_iommu_domain_alloc_user(Ptr<runtime.device> dev, @Unsigned int flags, Ptr<IommuDefinitions.iommu_domain> parent, Ptr<IommuDefinitions.iommu_user_data> user_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_iommu_domain_free(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_iommu_enforce_cache_coherency(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_iommu_get_resv_regions(Ptr<runtime.device> device2, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> intel_iommu_hw_info(Ptr<runtime.device> dev, Ptr<@Unsigned Integer> length, Ptr<@Unsigned Integer> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_iommu_init_qi(Ptr<intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_iotlb_sync_map(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long intel_iommu_iova_to_phys(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned @OriginalName(value="dma_addr_t") long iova2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_iommu_is_attach_deferred(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_map_pages(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long pgsize, @Unsigned long pgcount, int prot, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned Long> mapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_device> intel_iommu_probe_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_read_and_clear_dirty(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned long size, @Unsigned long flags, Ptr<IommuDefinitions.iommu_dirty_bitmap> dirty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_iommu_release_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_iommu_remove_dev_pasid(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid, Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_set_dev_pasid(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_set_dirty_tracking(Ptr<IommuDefinitions.iommu_domain> domain, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_iommu_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_iommu_shutdown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_iommu_tlb_sync(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<IommuDefinitions.iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long intel_iommu_unmap(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned long size, Ptr<IommuDefinitions.iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long intel_iommu_unmap_pages(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned long pgsize, @Unsigned long pgcount, Ptr<IommuDefinitions.iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_mm_free_notifier(Ptr<MmuDefinitions.mmu_notifier> mn2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_mm_release(Ptr<MmuDefinitions.mmu_notifier> mn2, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_nehalem_quirk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pebs_aliases_core2(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pebs_aliases_ivb(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pebs_aliases_skl(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pebs_aliases_snb(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pebs_isolation_quirk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_pmic_install_opregion_handler($arg1, $arg2, $arg3, (const struct intel_pmic_opregion_data*)$arg4)")
    public static int intel_pmic_install_opregion_handler(Ptr<runtime.device> dev, @OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<runtime.regmap> regmap2, Ptr<intel_pmic_opregion_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int intel_pmic_power_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bits, Ptr<@Unsigned Long> value64, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int intel_pmic_regs_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bits, Ptr<@Unsigned Long> value64, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int intel_pmic_thermal_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bits, Ptr<@Unsigned Long> value64, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_add_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_assign_event(Ptr<PerfDefinitions.perf_event> event2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_aux_output_match(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_bts_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_check_counters_mask(Ptr<@Unsigned Long> cntr_mask, Ptr<@Unsigned Long> fixed_cntr_mask, Ptr<@Unsigned Long> intel_ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_check_event_constraints(Ptr<EventDefinitions.event_constraint> event_constraints, @Unsigned long cntr_mask, @Unsigned long fixed_cntr_mask, @Unsigned long intel_ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_check_extra_regs(Ptr<misc.extra_reg> extra_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_check_period(Ptr<PerfDefinitions.perf_event> event2, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_cpu_dead(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_cpu_dying(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_cpu_prepare(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_cpu_starting(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_del_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_disable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_enable_all(int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_enable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_enable_fixed(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long intel_pmu_event_map(int hw_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_filter(Ptr<runtime.pmu> pmu2, int cpu2, Ptr<@OriginalName(value="bool") Boolean> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_handle_irq(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_hw_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_nhm_enable_all(int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_read_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_reset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_save_and_restart(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_sched_task(Ptr<PerfDefinitions.perf_event_pmu_context> pmu_ctx, boolean sched_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_set_period(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_snapshot_arch_branch_stack(Ptr<PerfDefinitions.perf_branch_entry> entries, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_snapshot_branch_stack(Ptr<PerfDefinitions.perf_branch_entry> entries, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_swap_task_ctx(Ptr<PerfDefinitions.perf_event_pmu_context> prev_epc, Ptr<PerfDefinitions.perf_event_pmu_context> next_epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long intel_pmu_update(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_v6_addr_offset(int index2, boolean eventsel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pt_handle_vmx(int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pt_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int intel_pt_validate_cap(Ptr<@Unsigned Integer> caps, PtDefinitions.pt_capabilities capability) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int intel_pt_validate_hw_cap(PtDefinitions.pt_capabilities cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_put_event_constraints(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_remapping_check(int num, int slot2, int func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_sandybridge_quirk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_snb_check_microcode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_soc_pmic_exec_mipi_pmic_seq_element(@Unsigned short i2c_address, @Unsigned int reg_address, @Unsigned int value, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_start_scheduling(Ptr<CpuDefinitions.cpu_hw_events> cpuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_stop_scheduling(Ptr<CpuDefinitions.cpu_hw_events> cpuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_svm_check(Ptr<intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_domain> intel_svm_domain_alloc(Ptr<runtime.device> dev, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_svm_domain_free(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_svm_enable_prq(Ptr<intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_svm_finish_prq(Ptr<intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_svm_page_response(Ptr<runtime.device> dev, Ptr<IopfDefinitions.iopf_fault> evt, Ptr<IommuDefinitions.iommu_page_response> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_svm_set_dev_pasid(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_tfa_commit_scheduling(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, int cntr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_tfa_pmu_enable_all(int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_tlbflush(Ptr<AgpDefinitions.agp_memory> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long intel_update_topdown_event(Ptr<PerfDefinitions.perf_event> event2, int metric_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bxtwc_pmic_get_policy(Ptr<runtime.regmap> regmap2, int reg, int bit, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bxtwc_pmic_get_power(Ptr<runtime.regmap> regmap2, int reg, int bit, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bxtwc_pmic_get_raw_temp(Ptr<runtime.regmap> regmap2, int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bxtwc_pmic_opregion_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bxtwc_pmic_opregion_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bxtwc_pmic_update_aux(Ptr<runtime.regmap> regmap2, int reg, int raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bxtwc_pmic_update_policy(Ptr<runtime.regmap> regmap2, int reg, int bit, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bxtwc_pmic_update_power(Ptr<runtime.regmap> regmap2, int reg, int bit, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_config_get(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_config_get_pull(Ptr<intel_pinctrl> pctrl, @Unsigned int pin, PinDefinitions.pin_config_param param2, Ptr<@Unsigned Integer> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_config_set(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> configs, @Unsigned int nconfigs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_crc_pmic_get_policy(Ptr<runtime.regmap> regmap2, int reg, int bit, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_crc_pmic_get_power(Ptr<runtime.regmap> regmap2, int reg, int bit, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_crc_pmic_get_raw_temp(Ptr<runtime.regmap> regmap2, int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_crc_pmic_opregion_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_crc_pmic_opregion_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_crc_pmic_update_aux(Ptr<runtime.regmap> regmap2, int reg, int raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_crc_pmic_update_policy(Ptr<runtime.regmap> regmap2, int reg, int bit, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_crc_pmic_update_power(Ptr<runtime.regmap> regmap2, int reg, int bit, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_ds_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct intel_community*)intel_get_community((const struct intel_pinctrl*)$arg1, $arg2))")
    public static Ptr<intel_community> intel_get_community(Ptr<intel_pinctrl> pctrl, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_get_function_groups($arg1, $arg2, (const const u8***)$arg3, (const unsigned int*)$arg4)")
    public static int intel_get_function_groups(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int function, Ptr<Ptr<String>> groups, Ptr<@Unsigned Integer> ngroups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)intel_get_function_name($arg1, $arg2))")
    public static String intel_get_function_name(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_get_functions_count(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)intel_get_group_name($arg1, $arg2))")
    public static String intel_get_group_name(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_get_group_pins($arg1, $arg2, (const unsigned int**)$arg3, $arg4)")
    public static int intel_get_group_pins(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group, Ptr<Ptr<@Unsigned Integer>> pins, Ptr<@Unsigned Integer> npins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_get_groups_count(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> intel_get_padcfg(Ptr<intel_pinctrl> pctrl, @Unsigned int pin, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_add_pin_ranges(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_direction_input(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_direction_output(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_get(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_get_direction(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn intel_gpio_irq(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gpio_irq_ack(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gpio_irq_init(Ptr<intel_pinctrl> pctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_irq_init_hw(Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gpio_irq_mask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gpio_irq_mask_unmask(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, boolean mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_irq_type(Ptr<IrqDefinitions.irq_data> d, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gpio_irq_unmask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_irq_wake(Ptr<IrqDefinitions.irq_data> d, @Unsigned int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_request_enable(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gpio_set(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gpio_set_direction(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<PinctrlDefinitions.pinctrl_gpio_range> range2, @Unsigned int pin, boolean input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_idle(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_idle_acpi_cst_extract() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_idle_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_idle_ibrs(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_idle_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_idle_init_cstates_acpi(Ptr<CpuidleDefinitions.cpuidle_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_idle_init_cstates_icpu(Ptr<CpuidleDefinitions.cpuidle_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_idle_irq(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_idle_max_cstate_reached(int cstate2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_idle_s2idle(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_idle_state_needs_timer_stop(Ptr<CpuidleDefinitions.cpuidle_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_idle_xstate(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_pad_acpi_mode((const struct intel_pinctrl*)$arg1, $arg2)")
    public static boolean intel_pad_acpi_mode(Ptr<intel_pinctrl> pctrl, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_pad_locked((const struct intel_pinctrl*)$arg1, $arg2)")
    public static int intel_pad_locked(Ptr<intel_pinctrl> pctrl, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_pad_owned_by_host((const struct intel_pinctrl*)$arg1, $arg2)")
    public static boolean intel_pad_owned_by_host(Ptr<intel_pinctrl> pctrl, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> intel_pebs_constraints(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pin_dbg_show(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, Ptr<SeqDefinitions.seq_file> s2, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct intel_pinctrl_soc_data*)intel_pinctrl_get_soc_data($arg1))")
    public static Ptr<intel_pinctrl_soc_data> intel_pinctrl_get_soc_data(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_pinctrl_probe($arg1, (const struct intel_pinctrl_soc_data*)$arg2)")
    public static int intel_pinctrl_probe(Ptr<PlatformDefinitions.platform_device> pdev, Ptr<intel_pinctrl_soc_data> soc_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pinctrl_probe_by_hid(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pinctrl_probe_by_uid(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pinctrl_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_pinctrl_should_save(Ptr<intel_pinctrl> pctrl, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pinctrl_suspend_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pinmux_set_mux(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int function, @Unsigned int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_auto_reload_read(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_disable_bts() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_drain_bts_buffer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_drain_pebs_buffer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_drain_pebs_core(Ptr<PtDefinitions.pt_regs> iregs, Ptr<PerfDefinitions.perf_sample_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_drain_pebs_icl(Ptr<PtDefinitions.pt_regs> iregs, Ptr<PerfDefinitions.perf_sample_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_drain_pebs_nhm(Ptr<PtDefinitions.pt_regs> iregs, Ptr<PerfDefinitions.perf_sample_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_enable_bts(@Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_add(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_data_source_adl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_data_source_cmt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_data_source_grt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_data_source_lnl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_data_source_mtl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_data_source_nhm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_data_source_skl(boolean pmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_del(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_disable(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_enable(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_enable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_event_update_no_drain(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_pebs_fixup_ip(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_pebs_sched_task(Ptr<PerfDefinitions.perf_event_pmu_context> pmu_ctx, boolean sched_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_save_and_restart_reload(Ptr<PerfDefinitions.perf_event> event2, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_restore_hostown(Ptr<intel_pinctrl> pctrl, @Unsigned int c, Ptr<?> base, @Unsigned int gpp, @Unsigned int saved2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_restore_padcfg(Ptr<intel_pinctrl> pctrl, @Unsigned int pin, @Unsigned int reg, @Unsigned int saved2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_pci_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_scu_pci_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int intel_scu_pci_probe(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __intel_pmu_lbr_enable(boolean pmi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __intel_pmu_lbr_restore(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __intel_pmu_lbr_save(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __intel_pstate_cpu_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __intel_pstate_update_max_freq(Ptr<runtime.cpudata> cpudata2, Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_bts_disable_local() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_bts_enable_local() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_bts_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cht_wc_exec_mipi_pmic_seq_element(Ptr<runtime.regmap> regmap2, @Unsigned short i2c_client_address, @Unsigned int reg_address, @Unsigned int value, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cht_wc_pmic_get_power(Ptr<runtime.regmap> regmap2, int reg, int bit, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cht_wc_pmic_opregion_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cht_wc_pmic_opregion_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cht_wc_pmic_update_power(Ptr<runtime.regmap> regmap2, int reg, int bitmask, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_collect_cpu_info(Ptr<CpuDefinitions.cpu_signature> sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_cpufreq_adjust_perf(@Unsigned int cpunum, @Unsigned long min_perf, @Unsigned long target_perf, @Unsigned long capacity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_cpufreq_cpu_exit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cpufreq_cpu_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cpufreq_cpu_offline(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int intel_cpufreq_fast_switch(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int target_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_cpufreq_hwp_update(Ptr<runtime.cpudata> cpu2, @Unsigned int min, @Unsigned int max, @Unsigned int desired, boolean fast_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cpufreq_suspend(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cpufreq_target(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int target_freq, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_cpufreq_trace(Ptr<runtime.cpudata> cpu2, @Unsigned int trace_type2, int old_pstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cpufreq_update_pstate(Ptr<CpufreqDefinitions.cpufreq_policy> policy, int target_pstate, boolean fast_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cpufreq_verify_policy(Ptr<CpufreqDefinitions.cpufreq_policy_data> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_find_matching_signature(Ptr<?> mc, Ptr<CpuDefinitions.cpu_signature> sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_generic_uncore_assign_hw_event(Ptr<PerfDefinitions.perf_event> event2, Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long intel_generic_uncore_box_ctl(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_mmio_disable_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_mmio_disable_event(Ptr<intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_mmio_enable_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_mmio_enable_event(Ptr<intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_mmio_init_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_msr_disable_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_msr_disable_event(Ptr<intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_msr_enable_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_msr_enable_event(Ptr<intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_msr_init_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_pci_disable_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_pci_disable_event(Ptr<intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_pci_enable_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_pci_enable_event(Ptr<intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_generic_uncore_pci_init_box(Ptr<intel_uncore_box> box) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long intel_generic_uncore_pci_read_counter(Ptr<intel_uncore_box> box, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_hfi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_hfi_offline(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_hfi_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_hfi_process_event(@Unsigned long pkg_therm_status_msr_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_ldma_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_ldma_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_microcode_sanity_check(Ptr<?> mc, boolean print_err, int hdr_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_nested_attach_dev(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_nested_cache_invalidate_user(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<IommuDefinitions.iommu_user_data_array> array) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_nested_domain_alloc($arg1, (const struct iommu_user_data*)$arg2)")
    public static Ptr<IommuDefinitions.iommu_domain> intel_nested_domain_alloc(Ptr<IommuDefinitions.iommu_domain> parent, Ptr<IommuDefinitions.iommu_user_data> user_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_nested_domain_free(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_arch_lbr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_arch_lbr_read(Ptr<CpuDefinitions.cpu_hw_events> cpuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_arch_lbr_read_xsave(Ptr<CpuDefinitions.cpu_hw_events> cpuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_arch_lbr_reset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_arch_lbr_restore(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_arch_lbr_save(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_arch_lbr_xrstors(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_arch_lbr_xsaves(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_add(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_counters_reorder(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_del(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_enable_all(boolean pmi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_filter(Ptr<CpuDefinitions.cpu_hw_events> cpuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init_atom() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init_core() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init_hsw() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init_knl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init_nhm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init_skl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init_slm() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_init_snb() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_read() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_read_32(Ptr<CpuDefinitions.cpu_hw_events> cpuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_read_64(Ptr<CpuDefinitions.cpu_hw_events> cpuc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_reset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_reset_32() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_reset_64() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_restore(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_save(Ptr<?> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_save_brstack(Ptr<PerfDefinitions.perf_sample_data> data, Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_sched_task(Ptr<PerfDefinitions.perf_event_pmu_context> pmu_ctx, boolean sched_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_lbr_swap_task_ctx(Ptr<PerfDefinitions.perf_event_pmu_context> prev_epc, Ptr<PerfDefinitions.perf_event_pmu_context> next_epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_setup_hw_lbr_filter(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pmu_setup_lbr_filter(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_store_lbr(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<misc.lbr_entry> entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pmu_store_pebs_lbrs(Ptr<misc.lbr_entry> lbr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_adjust_pstate(Ptr<runtime.cpudata> cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_cpu_exit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_cpu_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_cpu_offline(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_cpu_online(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_disable_hwp_interrupt(Ptr<runtime.cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_driver_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_enable_hwp_interrupt(Ptr<runtime.cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_exit_perf_limits(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_freq_to_hwp_rel(Ptr<runtime.cpudata> cpu2, int freq, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_get_cpu_pstates(Ptr<runtime.cpudata> cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static short intel_pstate_get_epp(Ptr<runtime.cpudata> cpu_data, @Unsigned long hwp_req_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_get_hwp_cap(Ptr<runtime.cpudata> cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_hwp_enable(Ptr<runtime.cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_hybrid_hwp_adjust(Ptr<runtime.cpudata> cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_init_acpi_perf_limits(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_init_cpu(@Unsigned int cpunum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_notify_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_pstate_platform_pwr_mgmt_exists() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_register_driver(Ptr<CpufreqDefinitions.cpufreq_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_resume(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_pstate_sample(Ptr<runtime.cpudata> cpu2, @Unsigned long time) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_set_epb(int cpu2, short pref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_set_policy(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_set_pstate(Ptr<runtime.cpudata> cpu2, int pstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_suspend(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_sysfs_expose_params() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_update_limits(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_update_perf_limits(Ptr<runtime.cpudata> cpu2, @Unsigned int policy_min, @Unsigned int policy_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_update_policies() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_pstate_update_status((const u8*)$arg1, $arg2)")
    public static int intel_pstate_update_status(String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_update_util(Ptr<UpdateDefinitions.update_util_data> data, @Unsigned long time, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_update_util_hwp(Ptr<UpdateDefinitions.update_util_data> data, @Unsigned long time, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstate_verify_cpu_policy(Ptr<runtime.cpudata> cpu2, Ptr<CpufreqDefinitions.cpufreq_policy_data> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pstate_verify_policy(Ptr<CpufreqDefinitions.cpufreq_policy_data> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pstste_sched_itmt_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_rdt_mbm_apply_quirk() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_set_max_freq_ratio() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_uncore_clear_discovery_tables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_uncore_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<intel_uncore_discovery_unit> intel_uncore_find_discovery_unit(Ptr<RbDefinitions.rb_root> units, int die, @Unsigned int pmu_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_uncore_find_discovery_unit_id(Ptr<RbDefinitions.rb_root> units, int die, @Unsigned int pmu_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<intel_uncore_type>> intel_uncore_generic_init_uncores(UncoreDefinitions.uncore_access_type type_id, int num_extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_uncore_generic_uncore_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_uncore_generic_uncore_mmio_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_uncore_generic_uncore_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_uncore_has_discovery_tables(Ptr<Integer> ignore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_uncore_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__intel_scu_ipc_register($arg1, (const struct intel_scu_ipc_data*)$arg2, $arg3)")
    public static Ptr<intel_scu_ipc_dev> __intel_scu_ipc_register(Ptr<runtime.device> parent, Ptr<intel_scu_ipc_data> scu_data, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_cap_audit(CapDefinitions.cap_audit_type type2, Ptr<intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_cap_flts_sanity() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_cap_nest_sanity() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_cap_pasid_sanity() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_cap_slts_sanity() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_cap_smts_sanity() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_cc_platform_has(CcDefinitions.cc_attr attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_cleanup_irq_remapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_clear_lmce() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_context_flush_present(Ptr<DeviceDefinitions.device_domain_info> info2, Ptr<ContextDefinitions.context_entry> context2, @Unsigned short did, boolean flush_domains) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_detect_tlb(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_enable_irq_remapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<AgpDefinitions.agp_memory> intel_fake_agp_alloc_by_type(@Unsigned long pg_count, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_fake_agp_configure() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_fake_agp_create_gatt_table(Ptr<AgpDefinitions.agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_fake_agp_enable(Ptr<AgpDefinitions.agp_bridge_data> bridge, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_fake_agp_fetch_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_fake_agp_free_gatt_table(Ptr<AgpDefinitions.agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_fake_agp_insert_entries(Ptr<AgpDefinitions.agp_memory> mem, @OriginalName(value="off_t") long pg_start, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_fake_agp_remove_entries(Ptr<AgpDefinitions.agp_memory> mem, @OriginalName(value="off_t") long pg_start, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_filter_mce(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_free_irq_resources(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_gmch_enable_gtt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gmch_gtt_clear_range(@Unsigned int first_entry, @Unsigned int num_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gmch_gtt_flush() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gmch_gtt_get(Ptr<@Unsigned Long> gtt_total, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> mappable_base, Ptr<@Unsigned @OriginalName(value="resource_size_t") Long> mappable_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gmch_gtt_insert_page(@Unsigned @OriginalName(value="dma_addr_t") long addr2, @Unsigned int pg, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gmch_gtt_insert_sg_entries(Ptr<SgDefinitions.sg_table> st2, @Unsigned int pg_start, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gmch_probe(Ptr<PciDefinitions.pci_dev> bridge_pdev, Ptr<PciDefinitions.pci_dev> gpu_pdev, Ptr<AgpDefinitions.agp_bridge_data> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gmch_remove() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gtt_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_gtt_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long intel_gtt_stolen_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_gtt_teardown_scratch_page() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_i810_free_by_type(Ptr<AgpDefinitions.agp_memory> curr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_init_cmci() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_init_lmce() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_init_thermal(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_ir_compose_msi_msg(Ptr<IrqDefinitions.irq_data> irq_data2, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_ir_reconfigure_irte(Ptr<IrqDefinitions.irq_data> irqd, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_ir_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int intel_ir_set_affinity(Ptr<IrqDefinitions.irq_data> data, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_ir_set_vcpu_affinity(Ptr<IrqDefinitions.irq_data> data, Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_irq_remap_add_device(Ptr<DmarDefinitions.dmar_pci_notify_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_irq_remapping_activate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> irq_data2, boolean reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_irq_remapping_alloc(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_irq_remapping_deactivate(Ptr<IrqDefinitions.irq_domain> domain, Ptr<IrqDefinitions.irq_data> irq_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_irq_remapping_free(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_irq_remapping_select(Ptr<IrqDefinitions.irq_domain> d, Ptr<IrqDefinitions.irq_fwspec> fwspec, IrqDefinitions.irq_domain_bus_token bus_token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean intel_mce_usable_address(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pasid_alloc_table(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pasid_free_table(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.pasid_table> intel_pasid_get_table(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pasid_setup_dirty_tracking(Ptr<intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned int pasid, boolean enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pasid_setup_first_level(Ptr<intel_iommu> iommu, Ptr<runtime.device> dev, Ptr<misc.pgd_t> pgd, @Unsigned int pasid, @Unsigned short did, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pasid_setup_nested(Ptr<intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned int pasid, Ptr<DmarDefinitions.dmar_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pasid_setup_page_snoop_control(Ptr<intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pasid_setup_pass_through(Ptr<intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pasid_setup_second_level(Ptr<intel_iommu> iommu, Ptr<DmarDefinitions.dmar_domain> domain, Ptr<runtime.device> dev, @Unsigned int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_pasid_setup_sm_context(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pasid_tear_down_entry(Ptr<intel_iommu> iommu, Ptr<runtime.device> dev, @Unsigned int pasid, boolean fault_ignore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_pasid_teardown_sm_context(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_prepare_irq_remapping() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_router_probe(Ptr<IrqDefinitions.irq_router> r, Ptr<PciDefinitions.pci_dev> router, @Unsigned short device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_ipc_check_status(Ptr<intel_scu_ipc_dev> scu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_scu_ipc_dev_command_with_size($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int intel_scu_ipc_dev_command_with_size(Ptr<intel_scu_ipc_dev> scu, int cmd, int sub, Ptr<?> in, @Unsigned long inlen, @Unsigned long size, Ptr<?> out, @Unsigned long outlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<intel_scu_ipc_dev> intel_scu_ipc_dev_get() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_ipc_dev_ioread8(Ptr<intel_scu_ipc_dev> scu, @Unsigned short addr2, Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_ipc_dev_iowrite8(Ptr<intel_scu_ipc_dev> scu, @Unsigned short addr2, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_scu_ipc_dev_put(Ptr<intel_scu_ipc_dev> scu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_ipc_dev_readv(Ptr<intel_scu_ipc_dev> scu, Ptr<@Unsigned Short> addr2, Ptr<Character> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_ipc_dev_simple_command(Ptr<intel_scu_ipc_dev> scu, int cmd, int sub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_ipc_dev_update(Ptr<intel_scu_ipc_dev> scu, @Unsigned short addr2, char data, char mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_ipc_dev_writev(Ptr<intel_scu_ipc_dev> scu, Ptr<@Unsigned Short> addr2, Ptr<Character> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_scu_ipc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<intel_scu_ipc_dev> intel_scu_ipc_get(Ptr<intel_scu_ipc_dev> scu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_scu_ipc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_scu_ipc_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_scu_ipc_unregister(Ptr<intel_scu_ipc_dev> scu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_setup_irq_remapping(Ptr<intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_tcc_get_offset(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int intel_tcc_get_offset_mask() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_tcc_get_temp(int cpu2, Ptr<Integer> temp, boolean pkg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_tcc_get_tjmax(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_tcc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_tcc_set_offset(int cpu2, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_teardown_irq_remapping(Ptr<intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_thermal_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_thermal_supported(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_threshold_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="intel_tlb_lookup((const u8)$arg1)")
    public static void intel_tlb_lookup(char desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void intel_unlock_cpuid_leafs(Ptr<misc.cpuinfo_x86> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_xpower_exec_mipi_pmic_seq_element(Ptr<runtime.regmap> regmap2, @Unsigned short i2c_address, @Unsigned int reg_address, @Unsigned int value, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_xpower_lpat_raw_to_temp(Ptr<AcpiDefinitions.acpi_lpat_conversion_table> lpat_table, int raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_xpower_pmic_get_power(Ptr<runtime.regmap> regmap2, int reg, int bit, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_xpower_pmic_get_raw_temp(Ptr<runtime.regmap> regmap2, int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int intel_xpower_pmic_gpio_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bit_width, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_xpower_pmic_opregion_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_xpower_pmic_opregion_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int intel_xpower_pmic_update_power(Ptr<runtime.regmap> regmap2, int reg, int bit, boolean on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pinfunction")
    @NotUsableInJava
    public static class pinfunction
    extends Struct {
        public String name;
        public Ptr<String> groups;
        public @Unsigned long ngroups;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_discovery_type")
    @NotUsableInJava
    public static class intel_uncore_discovery_type
    extends Struct {
        public RbDefinitions.rb_node node;
        public UncoreDefinitions.uncore_access_type access_type;
        public RbDefinitions.rb_root units;
        public @Unsigned short type;
        public char num_counters;
        public char counter_width;
        public char ctl_offset;
        public char ctr_offset;
        public @Unsigned short num_units;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_init_fun")
    @NotUsableInJava
    public static class intel_uncore_init_fun
    extends Struct {
        public Ptr<?> cpu_init;
        public Ptr<?> pci_init;
        public Ptr<?> mmio_init;
        public boolean use_discovery;
        public Ptr<Integer> uncore_units_ignore;
    }

    @Type(noCCodeGeneration=true, cType="union intel_x86_pebs_dse")
    @NotUsableInJava
    public static class intel_x86_pebs_dse
    extends Union {
        public @Unsigned long val;
        public AnonDefinitions.anon_member_of_intel_x86_pebs_dse anon1;
        public AnonDefinitions.anon_member_of_intel_x86_pebs_dse anon2;
        public AnonDefinitions.anon_member_of_intel_x86_pebs_dse anon3;
        public AnonDefinitions.anon_member_of_intel_x86_pebs_dse anon4;
        public AnonDefinitions.anon_member_of_intel_x86_pebs_dse anon5;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_agp_driver_description")
    @NotUsableInJava
    public static class intel_agp_driver_description
    extends Struct {
        public @Unsigned int chip_id;
        public String name;
        public Ptr<AgpDefinitions.agp_bridge_driver> driver;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_pmic_opregion")
    @NotUsableInJava
    public static class intel_pmic_opregion
    extends Struct {
        public runtime.mutex lock;
        public Ptr<AcpiDefinitions.acpi_lpat_conversion_table> lpat_table;
        public Ptr<runtime.regmap> regmap;
        public Ptr<intel_pmic_opregion_data> data;
        public intel_pmic_regs_handler_ctx ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_pmic_regs_handler_ctx")
    @NotUsableInJava
    public static class intel_pmic_regs_handler_ctx
    extends Struct {
        public @Unsigned int val;
        public @Unsigned short addr;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_early_ops")
    @NotUsableInJava
    public static class intel_early_ops
    extends Struct {
        public Ptr<?> stolen_size;
        public Ptr<?> stolen_base;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_discovery_unit")
    @NotUsableInJava
    public static class intel_uncore_discovery_unit
    extends Struct {
        public RbDefinitions.rb_node node;
        public @Unsigned int pmu_idx;
        public @Unsigned int id;
        public @Unsigned int die;
        public @Unsigned long addr;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_scu_ipc_devres")
    @NotUsableInJava
    public static class intel_scu_ipc_devres
    extends Struct {
        public Ptr<intel_scu_ipc_dev> scu;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_scu_ipc_dev")
    @NotUsableInJava
    public static class intel_scu_ipc_dev
    extends Struct {
        public runtime.device dev;
        public runtime.resource mem;
        public Ptr<runtime.module> owner;
        public int irq;
        public Ptr<?> ipc_base;
        public runtime.completion cmd_complete;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_scu_ipc_data")
    @NotUsableInJava
    public static class intel_scu_ipc_data
    extends Struct {
        public runtime.resource mem;
        public int irq;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_soc_pmic")
    @NotUsableInJava
    public static class intel_soc_pmic
    extends Struct {
        public int irq;
        public Ptr<runtime.regmap> regmap;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_chip_data;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_chip_data_pwrbtn;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_chip_data_tmu;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_chip_data_bcu;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_chip_data_adc;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_chip_data_chgr;
        public Ptr<RegmapDefinitions.regmap_irq_chip_data> irq_chip_data_crit;
        public Ptr<runtime.device> dev;
        public Ptr<intel_scu_ipc_dev> scu;
        public intel_cht_wc_models cht_wc_model;
    }

    @Type(noCCodeGeneration=true, cType="enum intel_cht_wc_models")
    public static enum intel_cht_wc_models implements Enum<intel_cht_wc_models>,
    TypedEnum<intel_cht_wc_models, Integer>
    {
        INTEL_CHT_WC_UNKNOWN,
        INTEL_CHT_WC_GPD_WIN_POCKET,
        INTEL_CHT_WC_XIAOMI_MIPAD2,
        INTEL_CHT_WC_LENOVO_YOGABOOK1,
        INTEL_CHT_WC_LENOVO_YT3_X90;

    }

    @Type(noCCodeGeneration=true, cType="struct intel_ir_data")
    @NotUsableInJava
    public static class intel_ir_data
    extends Struct {
        public runtime.irq_2_iommu irq_2_iommu;
        public runtime.irte irte_entry;
        @InlineUnion(value=18509)
        public @InlineUnion(value=18509) MsiDefinitions.msi_msg msi_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_iommu")
    @NotUsableInJava
    public static class intel_iommu
    extends Struct {
        public Ptr<?> reg;
        public @Unsigned long reg_phys;
        public @Unsigned long reg_size;
        public @Unsigned long cap;
        public @Unsigned long ecap;
        public @Unsigned long vccap;
        public @Unsigned long @Size(value=4) [] ecmdcap;
        public @Unsigned int gcmd;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock register_lock;
        public int seq_id;
        public int agaw;
        public int msagaw;
        public @Unsigned int irq;
        public @Unsigned int pr_irq;
        public @Unsigned int perf_irq;
        public @Unsigned short segment;
        public char @Size(value=13) [] name;
        public Ptr<@Unsigned Long> domain_ids;
        public Ptr<@Unsigned Long> copied_tables;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<misc.root_entry> root_entry;
        public IommuDefinitions.iommu_flush flush;
        public Ptr<PageDefinitions.page_req_dsc> prq;
        public char @Size(value=16) [] prq_name;
        public @Unsigned long prq_seq_number;
        public runtime.completion prq_complete;
        public Ptr<IopfDefinitions.iopf_queue> iopf_queue;
        public char @Size(value=16) [] iopfq_name;
        public runtime.mutex iopf_lock;
        public Ptr<misc.q_inval> qi;
        public @Unsigned int @Size(value=4) [] iommu_state;
        public RbDefinitions.rb_root device_rbtree;
        public  @OriginalName(value="spinlock_t") runtime.spinlock device_rbtree_lock;
        public Ptr<misc.ir_table> ir_table;
        public Ptr<IrqDefinitions.irq_domain> ir_domain;
        public IommuDefinitions.iommu_device iommu;
        public int node;
        public @Unsigned int flags;
        public Ptr<DmarDefinitions.dmar_drhd_unit> drhd;
        public Ptr<?> perf_statistic;
        public Ptr<IommuDefinitions.iommu_pmu> pmu;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_gtt_driver_description")
    @NotUsableInJava
    public static class intel_gtt_driver_description
    extends Struct {
        public @Unsigned int gmch_chip_id;
        public String name;
        public Ptr<intel_gtt_driver> gtt_driver;
    }

    @Type(noCCodeGeneration=true, cType="struct _intel_private")
    @NotUsableInJava
    public static class _intel_private
    extends Struct {
        public Ptr<intel_gtt_driver> driver;
        public Ptr<PciDefinitions.pci_dev> pcidev;
        public Ptr<PciDefinitions.pci_dev> bridge_dev;
        public Ptr<Character> registers;
        public @Unsigned @OriginalName(value="phys_addr_t") long gtt_phys_addr;
        public @Unsigned int PGETBL_save;
        public Ptr<@Unsigned Integer> gtt;
        public boolean clear_fake_agp;
        public int num_dcache_entries;
        public Ptr<?> i9xx_flush_page;
        public String i81x_gtt_table;
        public runtime.resource ifp_resource;
        public int resource_valid;
        public Ptr<runtime.page> scratch_page;
        public @Unsigned @OriginalName(value="phys_addr_t") long scratch_page_dma;
        public int refcount;
        public @Unsigned int needs_dmar;
        public @Unsigned @OriginalName(value="phys_addr_t") long gma_bus_addr;
        public @Unsigned @OriginalName(value="resource_size_t") long stolen_size;
        public @Unsigned int gtt_total_entries;
        public @Unsigned int gtt_mappable_entries;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_gtt_driver")
    @NotUsableInJava
    public static class intel_gtt_driver
    extends Struct {
        public @Unsigned int gen;
        public @Unsigned int is_g33;
        public @Unsigned int is_pineview;
        public @Unsigned int is_ironlake;
        public @Unsigned int has_pgtbl_enable;
        public @Unsigned int dma_mask_size;
        public Ptr<?> setup;
        public Ptr<?> cleanup;
        public Ptr<?> write_entry;
        public Ptr<?> check_flags;
        public Ptr<?> chipset_flush;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_pmic_opregion_data")
    @NotUsableInJava
    public static class intel_pmic_opregion_data
    extends Struct {
        public Ptr<?> get_power;
        public Ptr<?> update_power;
        public Ptr<?> get_raw_temp;
        public Ptr<?> update_aux;
        public Ptr<?> get_policy;
        public Ptr<?> update_policy;
        public Ptr<?> exec_mipi_pmic_seq_element;
        public Ptr<?> lpat_raw_to_temp;
        public Ptr<misc.pmic_table> power_table;
        public int power_table_count;
        public Ptr<misc.pmic_table> thermal_table;
        public int thermal_table_count;
        public int pmic_i2c_address;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_pinctrl")
    @NotUsableInJava
    public static class intel_pinctrl
    extends Struct {
        public Ptr<runtime.device> dev;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public PinctrlDefinitions.pinctrl_desc pctldesc;
        public Ptr<PinctrlDefinitions.pinctrl_dev> pctldev;
        public GpioDefinitions.gpio_chip chip;
        public Ptr<intel_pinctrl_soc_data> soc;
        public Ptr<intel_community> communities;
        public @Unsigned long ncommunities;
        public intel_pinctrl_context context;
        public int irq;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_community_context")
    @NotUsableInJava
    public static class intel_community_context
    extends Struct {
        public @Unsigned int @Size(value=16) [] intr_lines;
        public @Unsigned int saved_intmask;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_pad_context")
    @NotUsableInJava
    public static class intel_pad_context
    extends Struct {
        public @Unsigned int padctrl0;
        public @Unsigned int padctrl1;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_pinctrl_context")
    @NotUsableInJava
    public static class intel_pinctrl_context
    extends Struct {
        public Ptr<intel_pad_context> pads;
        public Ptr<intel_community_context> communities;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_pinctrl_soc_data")
    @NotUsableInJava
    public static class intel_pinctrl_soc_data
    extends Struct {
        public String uid;
        public Ptr<PinctrlDefinitions.pinctrl_pin_desc> pins;
        public @Unsigned long npins;
        public Ptr<intel_pingroup> groups;
        public @Unsigned long ngroups;
        public Ptr<intel_function> functions;
        public @Unsigned long nfunctions;
        public Ptr<intel_community> communities;
        public @Unsigned long ncommunities;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_community")
    @NotUsableInJava
    public static class intel_community
    extends Struct {
        public @Unsigned int barno;
        public @Unsigned int padown_offset;
        public @Unsigned int padcfglock_offset;
        public @Unsigned int hostown_offset;
        public @Unsigned int is_offset;
        public @Unsigned int ie_offset;
        public @Unsigned int features;
        public @Unsigned int pin_base;
        public @Unsigned long npins;
        public @Unsigned int gpp_size;
        public @Unsigned int gpp_num_padown_regs;
        public Ptr<intel_padgroup> gpps;
        public @Unsigned long ngpps;
        public Ptr<@Unsigned Integer> pad_map;
        public @Unsigned short nirqs;
        public @Unsigned short acpi_space_id;
        public Ptr<?> regs;
        public Ptr<?> pad_regs;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_padgroup")
    @NotUsableInJava
    public static class intel_padgroup
    extends Struct {
        public @Unsigned int reg_num;
        public @Unsigned int base;
        public @Unsigned int size;
        public int gpio_base;
        public @Unsigned int padown_num;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_function")
    @NotUsableInJava
    public static class intel_function
    extends Struct {
        public pinfunction func;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_pingroup")
    @NotUsableInJava
    public static class intel_pingroup
    extends Struct {
        public runtime.pingroup grp;
        public @Unsigned short mode;
        public Ptr<@Unsigned Integer> modes;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_extra_reg")
    @NotUsableInJava
    public static class intel_uncore_extra_reg
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned long config;
        public @Unsigned long config1;
        public @Unsigned long config2;
        public AtomicDefinitions.atomic_t ref;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_box")
    @NotUsableInJava
    public static class intel_uncore_box
    extends Struct {
        public int dieid;
        public int n_active;
        public int n_events;
        public int cpu;
        public @Unsigned long flags;
        public AtomicDefinitions.atomic_t refcnt;
        public Ptr<PerfDefinitions.perf_event> @Size(value=10) [] events;
        public Ptr<PerfDefinitions.perf_event> @Size(value=10) [] event_list;
        public Ptr<EventDefinitions.event_constraint> @Size(value=10) [] event_constraint;
        public @Unsigned long @Size(value=1) [] active_mask;
        public @Unsigned long @Size(value=10) [] tags;
        public Ptr<PciDefinitions.pci_dev> pci_dev;
        public Ptr<intel_uncore_pmu> pmu;
        public @Unsigned long hrtimer_duration;
        public runtime.hrtimer hrtimer;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head active_list;
        public Ptr<?> io_addr;
        public intel_uncore_extra_reg @Size(value=0) [] shared_regs;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_topology")
    @NotUsableInJava
    public static class intel_uncore_topology
    extends Struct {
        public int pmu_idx;
        @InlineUnion(value=3789)
        public @InlineUnion(value=3789) Ptr<?> untyped;
        @InlineUnion(value=3789)
        public @InlineUnion(value=3789) Ptr<UncoreDefinitions.uncore_iio_topology> iio;
        @InlineUnion(value=3789)
        public @InlineUnion(value=3789) Ptr<UncoreDefinitions.uncore_upi_topology> upi;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_ops")
    @NotUsableInJava
    public static class intel_uncore_ops
    extends Struct {
        public Ptr<?> init_box;
        public Ptr<?> exit_box;
        public Ptr<?> disable_box;
        public Ptr<?> enable_box;
        public Ptr<?> disable_event;
        public Ptr<?> enable_event;
        public Ptr<?> read_counter;
        public Ptr<?> hw_config;
        public Ptr<?> get_constraint;
        public Ptr<?> put_constraint;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_pmu")
    @NotUsableInJava
    public static class intel_uncore_pmu
    extends Struct {
        public runtime.pmu pmu;
        public char @Size(value=32) [] name;
        public int pmu_idx;
        public int func_id;
        public boolean registered;
        public AtomicDefinitions.atomic_t activeboxes;
        public  @OriginalName(value="cpumask_t") runtime.cpumask cpu_mask;
        public Ptr<intel_uncore_type> type;
        public Ptr<Ptr<intel_uncore_box>> boxes;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_uncore_type")
    @NotUsableInJava
    public static class intel_uncore_type
    extends Struct {
        public String name;
        public int num_counters;
        public int num_boxes;
        public int perf_ctr_bits;
        public int fixed_ctr_bits;
        public int num_freerunning_types;
        public int type_id;
        public @Unsigned int perf_ctr;
        public @Unsigned int event_ctl;
        public @Unsigned int event_mask;
        public @Unsigned int event_mask_ext;
        public @Unsigned int fixed_ctr;
        public @Unsigned int fixed_ctl;
        public @Unsigned int box_ctl;
        @InlineUnion(value=3749)
        public @InlineUnion(value=3749) @Unsigned int msr_offset;
        @InlineUnion(value=3749)
        public @InlineUnion(value=3749) @Unsigned int mmio_offset;
        public @Unsigned int mmio_map_size;
        public @Unsigned int num_shared_regs;
        public @Unsigned int single_fixed;
        public @Unsigned int pair_ctr_ctl;
        @InlineUnion(value=3750)
        public @InlineUnion(value=3750) Ptr<@Unsigned Long> msr_offsets;
        @InlineUnion(value=3750)
        public @InlineUnion(value=3750) Ptr<@Unsigned Long> pci_offsets;
        @InlineUnion(value=3750)
        public @InlineUnion(value=3750) Ptr<@Unsigned Long> mmio_offsets;
        public EventDefinitions.event_constraint unconstrainted;
        public Ptr<EventDefinitions.event_constraint> constraints;
        public Ptr<intel_uncore_pmu> pmus;
        public Ptr<intel_uncore_ops> ops;
        public Ptr<UncoreDefinitions.uncore_event_desc> event_descs;
        public Ptr<misc.freerunning_counters> freerunning;
        public Ptr<AttributeDefinitions.attribute_group> @Size(value=4) [] attr_groups;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> attr_update;
        public Ptr<runtime.pmu> pmu;
        public Ptr<RbDefinitions.rb_root> boxes;
        public Ptr<Ptr<intel_uncore_topology>> topology;
        public Ptr<?> get_topology;
        public Ptr<?> set_mapping;
        public Ptr<?> cleanup_mapping;
        public Ptr<?> cleanup_extra_boxes;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_excl_cntrs")
    @NotUsableInJava
    public static class intel_excl_cntrs
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public intel_excl_states @Size(value=2) [] states;
        @InlineUnion(value=3520)
        public @InlineUnion(value=3520) @Unsigned short @Size(value=2) [] has_exclusive;
        @InlineUnion(value=3520)
        public @InlineUnion(value=3520) @Unsigned int exclusive_present;
        public int refcnt;
        public @Unsigned int core_id;
    }

    @Type(noCCodeGeneration=true, cType="struct intel_excl_states")
    @NotUsableInJava
    public static class intel_excl_states
    extends Struct {
        public intel_excl_state_type @Size(value=64) [] state;
        public boolean sched_started;
    }

    @Type(noCCodeGeneration=true, cType="enum intel_excl_state_type")
    public static enum intel_excl_state_type implements Enum<intel_excl_state_type>,
    TypedEnum<intel_excl_state_type, Integer>
    {
        INTEL_EXCL_UNUSED,
        INTEL_EXCL_SHARED,
        INTEL_EXCL_EXCLUSIVE;

    }

    @Type(noCCodeGeneration=true, cType="struct intel_shared_regs")
    @NotUsableInJava
    public static class intel_shared_regs
    extends Struct {
        public misc.er_account @Size(value=7) [] regs;
        public int refcnt;
        public @Unsigned int core_id;
    }
}

