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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.CcDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EventDefinitions;
import me.bechberger.ebpf.runtime.FreqDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IopfDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VcpuDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class AmdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short amd_branches_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short amd_brs_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_core_pmu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_deferred_error_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_enc_cache_flush_required() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_enc_status_change_finish(@Unsigned long vaddr, int npages, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_enc_status_change_prepare(@Unsigned long vaddr, int npages, boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_enc_tlb_flush_required(boolean enc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long amd_event_sysfs_show(String page2, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_filter_mce(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> amd_get_event_constraints(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> amd_get_event_constraints_f15h(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> amd_get_event_constraints_f17h(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EventDefinitions.event_constraint> amd_get_event_constraints_f19h(Ptr<CpuDefinitions.cpu_hw_events> cpuc, int idx, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_ibs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_activate_guest_mode(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_attach_device(Ptr<IommuDefinitions.iommu_domain> dom, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_iommu_capable(Ptr<runtime.device> dev, IommuDefinitions.iommu_cap cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_clear_gcr3(Ptr<IommuDefinitions.iommu_dev_data> dev_data, @Unsigned @OriginalName(value="ioasid_t") int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_complete_ppr(Ptr<runtime.device> dev, @Unsigned int pasid, int status, int tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_create_irq_domain(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_deactivate_guest_mode(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_def_domain_type(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_dev_disable_feature(Ptr<runtime.device> dev, IommuDefinitions.iommu_dev_features feat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_dev_enable_feature(Ptr<runtime.device> dev, IommuDefinitions.iommu_dev_features feat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_dev_flush_pasid_pages(Ptr<IommuDefinitions.iommu_dev_data> dev_data, @Unsigned @OriginalName(value="ioasid_t") int pasid, @Unsigned long address, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_group> amd_iommu_device_group(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_domain> amd_iommu_domain_alloc(@Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="amd_iommu_domain_alloc_user($arg1, $arg2, $arg3, (const struct iommu_user_data*)$arg4)")
    public static Ptr<IommuDefinitions.iommu_domain> amd_iommu_domain_alloc_user(Ptr<runtime.device> dev, @Unsigned int flags, Ptr<IommuDefinitions.iommu_domain> parent, Ptr<IommuDefinitions.iommu_user_data> user_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_domain_flush_pages(Ptr<misc.protection_domain> domain, @Unsigned long address, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_domain_free(Ptr<IommuDefinitions.iommu_domain> dom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_domain_update(Ptr<misc.protection_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_iommu_enforce_cache_coherency(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_flush_all_caches(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_flush_iotlb_all(Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_get_resv_regions(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_iommu_gt_ppr_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn amd_iommu_int_handler(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn amd_iommu_int_thread(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn amd_iommu_int_thread_evtlog(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn amd_iommu_int_thread_galog(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn amd_iommu_int_thread_pprlog(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_iotlb_sync(Ptr<IommuDefinitions.iommu_domain> domain, Ptr<IommuDefinitions.iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_iotlb_sync_map(Ptr<IommuDefinitions.iommu_domain> dom, @Unsigned long iova2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long amd_iommu_iova_to_phys(Ptr<IommuDefinitions.iommu_domain> dom, @Unsigned @OriginalName(value="dma_addr_t") long iova2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_iommu_is_attach_deferred(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_map_pages(Ptr<IommuDefinitions.iommu_domain> dom, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long pgsize, @Unsigned long pgcount, int iommu_prot, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned Long> mapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_device> amd_iommu_probe_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_read_and_clear_dirty(Ptr<IommuDefinitions.iommu_domain> domain, @Unsigned long iova2, @Unsigned long size, @Unsigned long flags, Ptr<IommuDefinitions.iommu_dirty_bitmap> dirty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="amd_iommu_register_ga_log_notifier((int (*)(unsigned int))$arg1)")
    public static int amd_iommu_register_ga_log_notifier(Ptr<?> notifier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_release_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_report_page_fault(Ptr<amd_iommu> iommu, @Unsigned short devid, @Unsigned short domain_id, @Unsigned long address, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_set_dirty_tracking(Ptr<IommuDefinitions.iommu_domain> domain, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_set_gcr3(Ptr<IommuDefinitions.iommu_dev_data> dev_data, @Unsigned @OriginalName(value="ioasid_t") int pasid, @Unsigned long gcr3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_set_rlookup_table(Ptr<amd_iommu> iommu, @Unsigned short devid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long amd_iommu_unmap_pages(Ptr<IommuDefinitions.iommu_domain> dom, @Unsigned long iova2, @Unsigned long pgsize, @Unsigned long pgcount, Ptr<IommuDefinitions.iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_update_and_flush_device_table(Ptr<misc.protection_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_update_ga(int cpu2, boolean is_run, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="amd_ir_set_affinity($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int amd_ir_set_affinity(Ptr<IrqDefinitions.irq_data> data, Ptr<runtime.cpumask> mask, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_ir_set_vcpu_affinity(Ptr<IrqDefinitions.irq_data> data, Ptr<?> vcpu_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_mce_is_memory_error(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_mce_usable_address(Ptr<runtime.mce> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_add_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_addr_offset(int index2, boolean eventsel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_brs_add(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_brs_del(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_check_overflow() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_cpu_dead(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_cpu_prepare(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_cpu_starting(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_del_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_disable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_disable_virt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_enable_all(int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_enable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_enable_virt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long amd_pmu_event_map(int hw_event) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_handle_irq(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_hw_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_limit_period(Ptr<PerfDefinitions.perf_event> event2, Ptr<Long> left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_pmu_test_overflow_status(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_pmu_test_overflow_topbit(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_v2_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_v2_enable_all(int added) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_v2_enable_event(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_v2_handle_irq(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_v2_snapshot_branch_stack(Ptr<PerfDefinitions.perf_branch_entry> entries, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pogo_errata_restore_misc_reg(Ptr<runtime.slot> p_slot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_put_event_constraints(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_put_event_constraints_f17h(Ptr<CpuDefinitions.cpu_hw_events> cpuc, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_rp_pme_resume(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_rp_pme_suspend(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_special_default_mtrr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_threshold_interrupt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_wbrf_register_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_wbrf_retrieve_freq_band(Ptr<runtime.device> dev, Ptr<misc.wbrf_ranges_in_out> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_wbrf_unregister_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __amd_smn_rw(@Unsigned short node2, @Unsigned int address, Ptr<@Unsigned Integer> value, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="amd_atl_register_decoder((long unsigned int (*)(struct atl_err*))$arg1)")
    public static void amd_atl_register_decoder(Ptr<?> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_atl_unregister_decoder() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_cache_northbridges() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long amd_convert_umc_mca_addr_to_sys_addr(Ptr<misc.atl_err> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_cppc_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_disable_seq_and_redirect_scrub(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_flush_garts() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_gart_present() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)amd_get_fname($arg1, $arg2))")
    public static String amd_get_fname(Ptr<PinctrlDefinitions.pinctrl_dev> pctrldev, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_get_functions_count(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)amd_get_group_name($arg1, $arg2))")
    public static String amd_get_group_name(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="amd_get_group_pins($arg1, $arg2, (const unsigned int**)$arg3, $arg4)")
    public static int amd_get_group_pins(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group, Ptr<Ptr<@Unsigned Integer>> pins, Ptr<@Unsigned Integer> num_pins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="amd_get_groups($arg1, $arg2, (const const u8***)$arg3, (const unsigned int*)$arg4)")
    public static int amd_get_groups(Ptr<PinctrlDefinitions.pinctrl_dev> pctrldev, @Unsigned int selector, Ptr<Ptr<String>> groups, Ptr<@Unsigned Integer> num_groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_get_groups_count(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> amd_get_mmconfig_range(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_get_subcaches(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_gpio_check_wake(Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_dbg_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<GpioDefinitions.gpio_chip> gc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_direction_input(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_direction_output(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_get_direction(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_get_value(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_irq_disable(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_irq_enable(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_irq_eoi(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn amd_gpio_irq_handler(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_irq_mask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_irq_set_type(Ptr<IrqDefinitions.irq_data> d, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_irq_set_wake(Ptr<IrqDefinitions.irq_data> d, @Unsigned int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_irq_unmask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_set_config(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int pin, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_gpio_set_value(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_gpio_should_save(Ptr<amd_gpio> gpio_dev, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_gpio_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_pc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_irq_ack(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_nb_has_feature(@Unsigned int feature) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short amd_nb_num() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pinconf_get(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pinconf_group_get(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group, Ptr<@Unsigned Long> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pinconf_group_set(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int group, Ptr<@Unsigned Long> configs, @Unsigned int num_configs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pinconf_set(Ptr<PinctrlDefinitions.pinctrl_dev> pctldev, @Unsigned int pin, Ptr<@Unsigned Long> configs, @Unsigned int num_configs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_prefcore_param(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstate_adjust_perf(@Unsigned int cpu2, @Unsigned long _min_perf, @Unsigned long target_perf, @Unsigned long capacity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_change_driver_mode(int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_change_mode_without_dvr_change(int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstate_cpu_exit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_cpu_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_cpu_resume(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_cpu_suspend(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstate_epp_cpu_exit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_epp_cpu_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_epp_cpu_offline(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_epp_cpu_online(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstate_epp_offline(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstate_epp_reenable(Ptr<amd_cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_epp_resume(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_epp_set_policy(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_epp_suspend(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_epp_update_limit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_epp_verify_policy(Ptr<CpufreqDefinitions.cpufreq_policy_data> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int amd_pstate_fast_switch(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int target_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static short amd_pstate_get_epp(Ptr<amd_cpudata> cpudata2, @Unsigned long cppc_req_cached) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)amd_pstate_get_mode_string($arg1))")
    public static String amd_pstate_get_mode_string(amd_pstate_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_init_boost_support(Ptr<amd_cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_init_freq(Ptr<amd_cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstate_init_prefcore(Ptr<amd_cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_param(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_register_driver(int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_pstate_sample(Ptr<amd_cpudata> cpudata2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_set_boost(Ptr<CpufreqDefinitions.cpufreq_policy> policy, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_set_driver(int mode_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_set_epp(Ptr<amd_cpudata> cpudata2, @Unsigned int epp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_target(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int target_freq, @Unsigned int relation) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_unregister_driver(int dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstate_update(Ptr<amd_cpudata> cpudata2, @Unsigned int min_perf, @Unsigned int des_perf, @Unsigned int max_perf, boolean fast_switch, int gov_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_update_freq(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int target_freq, boolean fast_switch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstate_update_limits(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_update_min_max_limit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="amd_pstate_update_status((const u8*)$arg1, $arg2)")
    public static int amd_pstate_update_status(String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pstate_verify(Ptr<CpufreqDefinitions.cpufreq_policy_data> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pstste_sched_prefcore_workfn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_set_mux(Ptr<PinctrlDefinitions.pinctrl_dev> pctrldev, @Unsigned int function, @Unsigned int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_set_subcaches(int cpu2, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_smn_read(@Unsigned short node2, @Unsigned int address, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_smn_write(@Unsigned short node2, @Unsigned int address, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_bus_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_check_microcode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_detect_prefcore(Ptr<@OriginalName(value="bool") Boolean> detected) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_e400_c1e_apic_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_get_boost_ratio_numerator(@Unsigned int cpu2, Ptr<@Unsigned Long> numerator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long amd_get_dr_addr_mask(@Unsigned int dr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_get_highest_perf(@Unsigned int cpu2, Ptr<@Unsigned Integer> highest_perf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_init_l3_cache(Ptr<misc._cpuid4_info_regs> this_leaf, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_apply_erratum_63(Ptr<amd_iommu> iommu, @Unsigned short devid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_detect() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_domain> amd_iommu_domain_alloc_sva(Ptr<runtime.device> dev, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_enable_faulting(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_enable_interrupts() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_get_num_iommus() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_init_pci() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_iommu_pasid_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char amd_iommu_pc_get_max_banks(@Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char amd_iommu_pc_get_max_counters(@Unsigned int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_pc_get_reg(Ptr<amd_iommu> iommu, char bank, char cntr, char fxn, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_pc_set_reg(Ptr<amd_iommu> iommu, char bank, char cntr, char fxn, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_iommu_pc_supported() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_prepare() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_reenable(int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_remove_dev_pasid(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid, Ptr<IommuDefinitions.iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_restart_event_logging(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_restart_ga_log(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="amd_iommu_restart_log($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void amd_iommu_restart_log(Ptr<amd_iommu> iommu, String evt_type, char cntrl_intr, char cntrl_log, @Unsigned int status_run_mask, @Unsigned int status_overflow_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long amd_iommu_show_cap(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long amd_iommu_show_features(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_snp_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_postcore_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_set_dr_addr_mask(@Unsigned long mask, @Unsigned int dr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_brs_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_brs_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_brs_drain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_brs_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_brs_enable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_brs_hw_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_brs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_brs_lopwr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_brs_reset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean amd_cc_platform_has(CcDefinitions.cc_attr attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_i2c_dw_xfer_quirk(Ptr<I2cDefinitions.i2c_adapter> adap, Ptr<I2cDefinitions.i2c_msg> msgs, int num_msgs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_alloc_ppr_log(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_apply_ivrs_quirks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_enable_ppr_log(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_free_ppr_log(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_iopf_add_device(Ptr<amd_iommu> iommu, Ptr<IommuDefinitions.iommu_dev_data> dev_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_iommu_iopf_init(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_iopf_remove_device(Ptr<amd_iommu> iommu, Ptr<IommuDefinitions.iommu_dev_data> dev_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_iopf_uninit(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_page_response(Ptr<runtime.device> dev, Ptr<IopfDefinitions.iopf_fault> evt, Ptr<IommuDefinitions.iommu_page_response> resp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_poll_ppr_log(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_iommu_restart_ppr_log(Ptr<amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_numa_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_brs_sched_task(Ptr<PerfDefinitions.perf_event_pmu_context> pmu_ctx, boolean sched_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_lbr_add(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_lbr_del(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_lbr_disable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_lbr_enable_all() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_lbr_filter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_lbr_hw_config(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_pmu_lbr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_lbr_read() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_lbr_reset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void amd_pmu_lbr_sched_task(Ptr<PerfDefinitions.perf_event_pmu_context> pmu_ctx, boolean sched_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int amd_router_probe(Ptr<IrqDefinitions.irq_router> r, Ptr<PciDefinitions.pci_dev> router, @Unsigned short device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct irq_2_irte")
    @NotUsableInJava
    public static class irq_2_irte
    extends Struct {
        public @Unsigned short devid;
        public @Unsigned short index;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_hostbridge")
    @NotUsableInJava
    public static class amd_hostbridge
    extends Struct {
        public @Unsigned int bus;
        public @Unsigned int slot;
        public @Unsigned int device;
    }

    @Type(noCCodeGeneration=true, cType="enum amd_pref_core")
    public static enum amd_pref_core implements Enum<amd_pref_core>,
    TypedEnum<amd_pref_core, Integer>
    {
        AMD_PREF_CORE_UNKNOWN,
        AMD_PREF_CORE_SUPPORTED,
        AMD_PREF_CORE_UNSUPPORTED;

    }

    @Type(noCCodeGeneration=true, cType="enum amd_pstate_mode")
    public static enum amd_pstate_mode implements Enum<amd_pstate_mode>,
    TypedEnum<amd_pstate_mode, Integer>
    {
        AMD_PSTATE_UNDEFINED,
        AMD_PSTATE_DISABLE,
        AMD_PSTATE_PASSIVE,
        AMD_PSTATE_ACTIVE,
        AMD_PSTATE_GUIDED,
        AMD_PSTATE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct amd_cpudata")
    @NotUsableInJava
    public static class amd_cpudata
    extends Struct {
        public int cpu;
        public FreqDefinitions.freq_qos_request @Size(value=2) [] req;
        public @Unsigned long cppc_req_cached;
        public @Unsigned int highest_perf;
        public @Unsigned int nominal_perf;
        public @Unsigned int lowest_nonlinear_perf;
        public @Unsigned int lowest_perf;
        public @Unsigned int prefcore_ranking;
        public @Unsigned int min_limit_perf;
        public @Unsigned int max_limit_perf;
        public @Unsigned int min_limit_freq;
        public @Unsigned int max_limit_freq;
        public @Unsigned int max_freq;
        public @Unsigned int min_freq;
        public @Unsigned int nominal_freq;
        public @Unsigned int lowest_nonlinear_freq;
        public amd_aperf_mperf cur;
        public amd_aperf_mperf prev;
        public @Unsigned long freq;
        public boolean boost_supported;
        public boolean hw_prefcore;
        public short epp_policy;
        public short epp_cached;
        public @Unsigned int policy;
        public @Unsigned long cppc_cap1_cached;
        public boolean suspended;
        public short epp_default;
        public boolean boost_state;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_aperf_mperf")
    @NotUsableInJava
    public static class amd_aperf_mperf
    extends Struct {
        public @Unsigned long aperf;
        public @Unsigned long mperf;
        public @Unsigned long tsc;
    }

    @Type(noCCodeGeneration=true, cType="enum amd_functions")
    public static enum amd_functions implements Enum<amd_functions>,
    TypedEnum<amd_functions, Integer>
    {
        IMX_F0_GPIO0,
        IMX_F1_GPIO0,
        IMX_F2_GPIO0,
        IMX_F3_GPIO0,
        IMX_F0_GPIO1,
        IMX_F1_GPIO1,
        IMX_F2_GPIO1,
        IMX_F3_GPIO1,
        IMX_F0_GPIO2,
        IMX_F1_GPIO2,
        IMX_F2_GPIO2,
        IMX_F3_GPIO2,
        IMX_F0_GPIO3,
        IMX_F1_GPIO3,
        IMX_F2_GPIO3,
        IMX_F3_GPIO3,
        IMX_F0_GPIO4,
        IMX_F1_GPIO4,
        IMX_F2_GPIO4,
        IMX_F3_GPIO4,
        IMX_F0_GPIO5,
        IMX_F1_GPIO5,
        IMX_F2_GPIO5,
        IMX_F3_GPIO5,
        IMX_F0_GPIO6,
        IMX_F1_GPIO6,
        IMX_F2_GPIO6,
        IMX_F3_GPIO6,
        IMX_F0_GPIO7,
        IMX_F1_GPIO7,
        IMX_F2_GPIO7,
        IMX_F3_GPIO7,
        IMX_F0_GPIO8,
        IMX_F1_GPIO8,
        IMX_F2_GPIO8,
        IMX_F3_GPIO8,
        IMX_F0_GPIO9,
        IMX_F1_GPIO9,
        IMX_F2_GPIO9,
        IMX_F3_GPIO9,
        IMX_F0_GPIO10,
        IMX_F1_GPIO10,
        IMX_F2_GPIO10,
        IMX_F3_GPIO10,
        IMX_F0_GPIO11,
        IMX_F1_GPIO11,
        IMX_F2_GPIO11,
        IMX_F3_GPIO11,
        IMX_F0_GPIO12,
        IMX_F1_GPIO12,
        IMX_F2_GPIO12,
        IMX_F3_GPIO12,
        IMX_F0_GPIO13,
        IMX_F1_GPIO13,
        IMX_F2_GPIO13,
        IMX_F3_GPIO13,
        IMX_F0_GPIO14,
        IMX_F1_GPIO14,
        IMX_F2_GPIO14,
        IMX_F3_GPIO14,
        IMX_F0_GPIO15,
        IMX_F1_GPIO15,
        IMX_F2_GPIO15,
        IMX_F3_GPIO15,
        IMX_F0_GPIO16,
        IMX_F1_GPIO16,
        IMX_F2_GPIO16,
        IMX_F3_GPIO16,
        IMX_F0_GPIO17,
        IMX_F1_GPIO17,
        IMX_F2_GPIO17,
        IMX_F3_GPIO17,
        IMX_F0_GPIO18,
        IMX_F1_GPIO18,
        IMX_F2_GPIO18,
        IMX_F3_GPIO18,
        IMX_F0_GPIO19,
        IMX_F1_GPIO19,
        IMX_F2_GPIO19,
        IMX_F3_GPIO19,
        IMX_F0_GPIO20,
        IMX_F1_GPIO20,
        IMX_F2_GPIO20,
        IMX_F3_GPIO20,
        IMX_F0_GPIO21,
        IMX_F1_GPIO21,
        IMX_F2_GPIO21,
        IMX_F3_GPIO21,
        IMX_F0_GPIO22,
        IMX_F1_GPIO22,
        IMX_F2_GPIO22,
        IMX_F3_GPIO22,
        IMX_F0_GPIO23,
        IMX_F1_GPIO23,
        IMX_F2_GPIO23,
        IMX_F3_GPIO23,
        IMX_F0_GPIO24,
        IMX_F1_GPIO24,
        IMX_F2_GPIO24,
        IMX_F3_GPIO24,
        IMX_F0_GPIO25,
        IMX_F1_GPIO25,
        IMX_F2_GPIO25,
        IMX_F3_GPIO25,
        IMX_F0_GPIO26,
        IMX_F1_GPIO26,
        IMX_F2_GPIO26,
        IMX_F3_GPIO26,
        IMX_F0_GPIO27,
        IMX_F1_GPIO27,
        IMX_F2_GPIO27,
        IMX_F3_GPIO27,
        IMX_F0_GPIO28,
        IMX_F1_GPIO28,
        IMX_F2_GPIO28,
        IMX_F3_GPIO28,
        IMX_F0_GPIO29,
        IMX_F1_GPIO29,
        IMX_F2_GPIO29,
        IMX_F3_GPIO29,
        IMX_F0_GPIO30,
        IMX_F1_GPIO30,
        IMX_F2_GPIO30,
        IMX_F3_GPIO30,
        IMX_F0_GPIO31,
        IMX_F1_GPIO31,
        IMX_F2_GPIO31,
        IMX_F3_GPIO31,
        IMX_F0_GPIO32,
        IMX_F1_GPIO32,
        IMX_F2_GPIO32,
        IMX_F3_GPIO32,
        IMX_F0_GPIO33,
        IMX_F1_GPIO33,
        IMX_F2_GPIO33,
        IMX_F3_GPIO33,
        IMX_F0_GPIO34,
        IMX_F1_GPIO34,
        IMX_F2_GPIO34,
        IMX_F3_GPIO34,
        IMX_F0_GPIO35,
        IMX_F1_GPIO35,
        IMX_F2_GPIO35,
        IMX_F3_GPIO35,
        IMX_F0_GPIO36,
        IMX_F1_GPIO36,
        IMX_F2_GPIO36,
        IMX_F3_GPIO36,
        IMX_F0_GPIO37,
        IMX_F1_GPIO37,
        IMX_F2_GPIO37,
        IMX_F3_GPIO37,
        IMX_F0_GPIO38,
        IMX_F1_GPIO38,
        IMX_F2_GPIO38,
        IMX_F3_GPIO38,
        IMX_F0_GPIO39,
        IMX_F1_GPIO39,
        IMX_F2_GPIO39,
        IMX_F3_GPIO39,
        IMX_F0_GPIO40,
        IMX_F1_GPIO40,
        IMX_F2_GPIO40,
        IMX_F3_GPIO40,
        IMX_F0_GPIO41,
        IMX_F1_GPIO41,
        IMX_F2_GPIO41,
        IMX_F3_GPIO41,
        IMX_F0_GPIO42,
        IMX_F1_GPIO42,
        IMX_F2_GPIO42,
        IMX_F3_GPIO42,
        IMX_F0_GPIO43,
        IMX_F1_GPIO43,
        IMX_F2_GPIO43,
        IMX_F3_GPIO43,
        IMX_F0_GPIO44,
        IMX_F1_GPIO44,
        IMX_F2_GPIO44,
        IMX_F3_GPIO44,
        IMX_F0_GPIO45,
        IMX_F1_GPIO45,
        IMX_F2_GPIO45,
        IMX_F3_GPIO45,
        IMX_F0_GPIO46,
        IMX_F1_GPIO46,
        IMX_F2_GPIO46,
        IMX_F3_GPIO46,
        IMX_F0_GPIO47,
        IMX_F1_GPIO47,
        IMX_F2_GPIO47,
        IMX_F3_GPIO47,
        IMX_F0_GPIO48,
        IMX_F1_GPIO48,
        IMX_F2_GPIO48,
        IMX_F3_GPIO48,
        IMX_F0_GPIO49,
        IMX_F1_GPIO49,
        IMX_F2_GPIO49,
        IMX_F3_GPIO49,
        IMX_F0_GPIO50,
        IMX_F1_GPIO50,
        IMX_F2_GPIO50,
        IMX_F3_GPIO50,
        IMX_F0_GPIO51,
        IMX_F1_GPIO51,
        IMX_F2_GPIO51,
        IMX_F3_GPIO51,
        IMX_F0_GPIO52,
        IMX_F1_GPIO52,
        IMX_F2_GPIO52,
        IMX_F3_GPIO52,
        IMX_F0_GPIO53,
        IMX_F1_GPIO53,
        IMX_F2_GPIO53,
        IMX_F3_GPIO53,
        IMX_F0_GPIO54,
        IMX_F1_GPIO54,
        IMX_F2_GPIO54,
        IMX_F3_GPIO54,
        IMX_F0_GPIO55,
        IMX_F1_GPIO55,
        IMX_F2_GPIO55,
        IMX_F3_GPIO55,
        IMX_F0_GPIO56,
        IMX_F1_GPIO56,
        IMX_F2_GPIO56,
        IMX_F3_GPIO56,
        IMX_F0_GPIO57,
        IMX_F1_GPIO57,
        IMX_F2_GPIO57,
        IMX_F3_GPIO57,
        IMX_F0_GPIO58,
        IMX_F1_GPIO58,
        IMX_F2_GPIO58,
        IMX_F3_GPIO58,
        IMX_F0_GPIO59,
        IMX_F1_GPIO59,
        IMX_F2_GPIO59,
        IMX_F3_GPIO59,
        IMX_F0_GPIO60,
        IMX_F1_GPIO60,
        IMX_F2_GPIO60,
        IMX_F3_GPIO60,
        IMX_F0_GPIO61,
        IMX_F1_GPIO61,
        IMX_F2_GPIO61,
        IMX_F3_GPIO61,
        IMX_F0_GPIO62,
        IMX_F1_GPIO62,
        IMX_F2_GPIO62,
        IMX_F3_GPIO62,
        IMX_F0_GPIO64,
        IMX_F1_GPIO64,
        IMX_F2_GPIO64,
        IMX_F3_GPIO64,
        IMX_F0_GPIO65,
        IMX_F1_GPIO65,
        IMX_F2_GPIO65,
        IMX_F3_GPIO65,
        IMX_F0_GPIO66,
        IMX_F1_GPIO66,
        IMX_F2_GPIO66,
        IMX_F3_GPIO66,
        IMX_F0_GPIO67,
        IMX_F1_GPIO67,
        IMX_F2_GPIO67,
        IMX_F3_GPIO67,
        IMX_F0_GPIO68,
        IMX_F1_GPIO68,
        IMX_F2_GPIO68,
        IMX_F3_GPIO68,
        IMX_F0_GPIO69,
        IMX_F1_GPIO69,
        IMX_F2_GPIO69,
        IMX_F3_GPIO69,
        IMX_F0_GPIO70,
        IMX_F1_GPIO70,
        IMX_F2_GPIO70,
        IMX_F3_GPIO70,
        IMX_F0_GPIO71,
        IMX_F1_GPIO71,
        IMX_F2_GPIO71,
        IMX_F3_GPIO71,
        IMX_F0_GPIO72,
        IMX_F1_GPIO72,
        IMX_F2_GPIO72,
        IMX_F3_GPIO72,
        IMX_F0_GPIO73,
        IMX_F1_GPIO73,
        IMX_F2_GPIO73,
        IMX_F3_GPIO73,
        IMX_F0_GPIO74,
        IMX_F1_GPIO74,
        IMX_F2_GPIO74,
        IMX_F3_GPIO74,
        IMX_F0_GPIO75,
        IMX_F1_GPIO75,
        IMX_F2_GPIO75,
        IMX_F3_GPIO75,
        IMX_F0_GPIO76,
        IMX_F1_GPIO76,
        IMX_F2_GPIO76,
        IMX_F3_GPIO76,
        IMX_F0_GPIO77,
        IMX_F1_GPIO77,
        IMX_F2_GPIO77,
        IMX_F3_GPIO77,
        IMX_F0_GPIO78,
        IMX_F1_GPIO78,
        IMX_F2_GPIO78,
        IMX_F3_GPIO78,
        IMX_F0_GPIO79,
        IMX_F1_GPIO79,
        IMX_F2_GPIO79,
        IMX_F3_GPIO79,
        IMX_F0_GPIO80,
        IMX_F1_GPIO80,
        IMX_F2_GPIO80,
        IMX_F3_GPIO80,
        IMX_F0_GPIO81,
        IMX_F1_GPIO81,
        IMX_F2_GPIO81,
        IMX_F3_GPIO81,
        IMX_F0_GPIO82,
        IMX_F1_GPIO82,
        IMX_F2_GPIO82,
        IMX_F3_GPIO82,
        IMX_F0_GPIO83,
        IMX_F1_GPIO83,
        IMX_F2_GPIO83,
        IMX_F3_GPIO83,
        IMX_F0_GPIO84,
        IMX_F1_GPIO84,
        IMX_F2_GPIO84,
        IMX_F3_GPIO84,
        IMX_F0_GPIO85,
        IMX_F1_GPIO85,
        IMX_F2_GPIO85,
        IMX_F3_GPIO85,
        IMX_F0_GPIO86,
        IMX_F1_GPIO86,
        IMX_F2_GPIO86,
        IMX_F3_GPIO86,
        IMX_F0_GPIO87,
        IMX_F1_GPIO87,
        IMX_F2_GPIO87,
        IMX_F3_GPIO87,
        IMX_F0_GPIO88,
        IMX_F1_GPIO88,
        IMX_F2_GPIO88,
        IMX_F3_GPIO88,
        IMX_F0_GPIO89,
        IMX_F1_GPIO89,
        IMX_F2_GPIO89,
        IMX_F3_GPIO89,
        IMX_F0_GPIO90,
        IMX_F1_GPIO90,
        IMX_F2_GPIO90,
        IMX_F3_GPIO90,
        IMX_F0_GPIO91,
        IMX_F1_GPIO91,
        IMX_F2_GPIO91,
        IMX_F3_GPIO91,
        IMX_F0_GPIO92,
        IMX_F1_GPIO92,
        IMX_F2_GPIO92,
        IMX_F3_GPIO92,
        IMX_F0_GPIO93,
        IMX_F1_GPIO93,
        IMX_F2_GPIO93,
        IMX_F3_GPIO93,
        IMX_F0_GPIO94,
        IMX_F1_GPIO94,
        IMX_F2_GPIO94,
        IMX_F3_GPIO94,
        IMX_F0_GPIO95,
        IMX_F1_GPIO95,
        IMX_F2_GPIO95,
        IMX_F3_GPIO95,
        IMX_F0_GPIO96,
        IMX_F1_GPIO96,
        IMX_F2_GPIO96,
        IMX_F3_GPIO96,
        IMX_F0_GPIO97,
        IMX_F1_GPIO97,
        IMX_F2_GPIO97,
        IMX_F3_GPIO97,
        IMX_F0_GPIO98,
        IMX_F1_GPIO98,
        IMX_F2_GPIO98,
        IMX_F3_GPIO98,
        IMX_F0_GPIO99,
        IMX_F1_GPIO99,
        IMX_F2_GPIO99,
        IMX_F3_GPIO99,
        IMX_F0_GPIO100,
        IMX_F1_GPIO100,
        IMX_F2_GPIO100,
        IMX_F3_GPIO100,
        IMX_F0_GPIO101,
        IMX_F1_GPIO101,
        IMX_F2_GPIO101,
        IMX_F3_GPIO101,
        IMX_F0_GPIO102,
        IMX_F1_GPIO102,
        IMX_F2_GPIO102,
        IMX_F3_GPIO102,
        IMX_F0_GPIO103,
        IMX_F1_GPIO103,
        IMX_F2_GPIO103,
        IMX_F3_GPIO103,
        IMX_F0_GPIO104,
        IMX_F1_GPIO104,
        IMX_F2_GPIO104,
        IMX_F3_GPIO104,
        IMX_F0_GPIO105,
        IMX_F1_GPIO105,
        IMX_F2_GPIO105,
        IMX_F3_GPIO105,
        IMX_F0_GPIO106,
        IMX_F1_GPIO106,
        IMX_F2_GPIO106,
        IMX_F3_GPIO106,
        IMX_F0_GPIO107,
        IMX_F1_GPIO107,
        IMX_F2_GPIO107,
        IMX_F3_GPIO107,
        IMX_F0_GPIO108,
        IMX_F1_GPIO108,
        IMX_F2_GPIO108,
        IMX_F3_GPIO108,
        IMX_F0_GPIO109,
        IMX_F1_GPIO109,
        IMX_F2_GPIO109,
        IMX_F3_GPIO109,
        IMX_F0_GPIO110,
        IMX_F1_GPIO110,
        IMX_F2_GPIO110,
        IMX_F3_GPIO110,
        IMX_F0_GPIO111,
        IMX_F1_GPIO111,
        IMX_F2_GPIO111,
        IMX_F3_GPIO111,
        IMX_F0_GPIO112,
        IMX_F1_GPIO112,
        IMX_F2_GPIO112,
        IMX_F3_GPIO112,
        IMX_F0_GPIO113,
        IMX_F1_GPIO113,
        IMX_F2_GPIO113,
        IMX_F3_GPIO113,
        IMX_F0_GPIO114,
        IMX_F1_GPIO114,
        IMX_F2_GPIO114,
        IMX_F3_GPIO114,
        IMX_F0_GPIO115,
        IMX_F1_GPIO115,
        IMX_F2_GPIO115,
        IMX_F3_GPIO115,
        IMX_F0_GPIO116,
        IMX_F1_GPIO116,
        IMX_F2_GPIO116,
        IMX_F3_GPIO116,
        IMX_F0_GPIO117,
        IMX_F1_GPIO117,
        IMX_F2_GPIO117,
        IMX_F3_GPIO117,
        IMX_F0_GPIO118,
        IMX_F1_GPIO118,
        IMX_F2_GPIO118,
        IMX_F3_GPIO118,
        IMX_F0_GPIO119,
        IMX_F1_GPIO119,
        IMX_F2_GPIO119,
        IMX_F3_GPIO119,
        IMX_F0_GPIO120,
        IMX_F1_GPIO120,
        IMX_F2_GPIO120,
        IMX_F3_GPIO120,
        IMX_F0_GPIO121,
        IMX_F1_GPIO121,
        IMX_F2_GPIO121,
        IMX_F3_GPIO121,
        IMX_F0_GPIO122,
        IMX_F1_GPIO122,
        IMX_F2_GPIO122,
        IMX_F3_GPIO122,
        IMX_F0_GPIO123,
        IMX_F1_GPIO123,
        IMX_F2_GPIO123,
        IMX_F3_GPIO123,
        IMX_F0_GPIO124,
        IMX_F1_GPIO124,
        IMX_F2_GPIO124,
        IMX_F3_GPIO124,
        IMX_F0_GPIO125,
        IMX_F1_GPIO125,
        IMX_F2_GPIO125,
        IMX_F3_GPIO125,
        IMX_F0_GPIO126,
        IMX_F1_GPIO126,
        IMX_F2_GPIO126,
        IMX_F3_GPIO126,
        IMX_F0_GPIO127,
        IMX_F1_GPIO127,
        IMX_F2_GPIO127,
        IMX_F3_GPIO127,
        IMX_F0_GPIO128,
        IMX_F1_GPIO128,
        IMX_F2_GPIO128,
        IMX_F3_GPIO128,
        IMX_F0_GPIO129,
        IMX_F1_GPIO129,
        IMX_F2_GPIO129,
        IMX_F3_GPIO129,
        IMX_F0_GPIO130,
        IMX_F1_GPIO130,
        IMX_F2_GPIO130,
        IMX_F3_GPIO130,
        IMX_F0_GPIO131,
        IMX_F1_GPIO131,
        IMX_F2_GPIO131,
        IMX_F3_GPIO131,
        IMX_F0_GPIO132,
        IMX_F1_GPIO132,
        IMX_F2_GPIO132,
        IMX_F3_GPIO132,
        IMX_F0_GPIO133,
        IMX_F1_GPIO133,
        IMX_F2_GPIO133,
        IMX_F3_GPIO133,
        IMX_F0_GPIO134,
        IMX_F1_GPIO134,
        IMX_F2_GPIO134,
        IMX_F3_GPIO134,
        IMX_F0_GPIO135,
        IMX_F1_GPIO135,
        IMX_F2_GPIO135,
        IMX_F3_GPIO135,
        IMX_F0_GPIO136,
        IMX_F1_GPIO136,
        IMX_F2_GPIO136,
        IMX_F3_GPIO136,
        IMX_F0_GPIO137,
        IMX_F1_GPIO137,
        IMX_F2_GPIO137,
        IMX_F3_GPIO137,
        IMX_F0_GPIO138,
        IMX_F1_GPIO138,
        IMX_F2_GPIO138,
        IMX_F3_GPIO138,
        IMX_F0_GPIO139,
        IMX_F1_GPIO139,
        IMX_F2_GPIO139,
        IMX_F3_GPIO139,
        IMX_F0_GPIO140,
        IMX_F1_GPIO140,
        IMX_F2_GPIO140,
        IMX_F3_GPIO140,
        IMX_F0_GPIO141,
        IMX_F1_GPIO141,
        IMX_F2_GPIO141,
        IMX_F3_GPIO141,
        IMX_F0_GPIO142,
        IMX_F1_GPIO142,
        IMX_F2_GPIO142,
        IMX_F3_GPIO142,
        IMX_F0_GPIO143,
        IMX_F1_GPIO143,
        IMX_F2_GPIO143,
        IMX_F3_GPIO143,
        IMX_F0_GPIO144,
        IMX_F1_GPIO144,
        IMX_F2_GPIO144,
        IMX_F3_GPIO144;

    }

    @Type(noCCodeGeneration=true, cType="struct amd_gpio")
    @NotUsableInJava
    public static class amd_gpio
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public Ptr<?> base;
        public Ptr<?> iomux_base;
        public Ptr<runtime.pingroup> groups;
        public @Unsigned int ngroups;
        public Ptr<PinctrlDefinitions.pinctrl_dev> pctrl;
        public GpioDefinitions.gpio_chip gc;
        public @Unsigned int hwbank_num;
        public Ptr<runtime.resource> res;
        public Ptr<PlatformDefinitions.platform_device> pdev;
        public Ptr<@Unsigned Integer> saved_regs;
        public int irq;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_function")
    @NotUsableInJava
    public static class amd_function
    extends Struct {
        public String name;
        public String @Size(value=4) [] groups;
        public @Unsigned int ngroups;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_northbridge_info")
    @NotUsableInJava
    public static class amd_northbridge_info
    extends Struct {
        public @Unsigned short num;
        public @Unsigned long flags;
        public Ptr<amd_northbridge> nb;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_nb_bus_dev_range")
    @NotUsableInJava
    public static class amd_nb_bus_dev_range
    extends Struct {
        public char bus;
        public char dev_base;
        public char dev_limit;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_iommu_event_desc")
    @NotUsableInJava
    public static class amd_iommu_event_desc
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public String event;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_wbrf_ranges_out")
    @NotUsableInJava
    public static class amd_wbrf_ranges_out
    extends Struct {
        public @Unsigned int num_of_ranges;
        public FreqDefinitions.freq_band_range @Size(value=11) [] band_list;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_chipset_info")
    @NotUsableInJava
    public static class amd_chipset_info
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> nb_dev;
        public Ptr<PciDefinitions.pci_dev> smbus_dev;
        public int nb_type;
        public amd_chipset_type sb_type;
        public int isoc_reqs;
        public int probe_count;
        public boolean need_pll_quirk;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_chipset_type")
    @NotUsableInJava
    public static class amd_chipset_type
    extends Struct {
        public amd_chipset_gen gen;
        public char rev;
    }

    @Type(noCCodeGeneration=true, cType="enum amd_chipset_gen")
    public static enum amd_chipset_gen implements Enum<amd_chipset_gen>,
    TypedEnum<amd_chipset_gen, Integer>
    {
        NOT_AMD_CHIPSET,
        AMD_CHIPSET_SB600,
        AMD_CHIPSET_SB700,
        AMD_CHIPSET_SB800,
        AMD_CHIPSET_HUDSON2,
        AMD_CHIPSET_BOLTON,
        AMD_CHIPSET_YANGTZE,
        AMD_CHIPSET_TAISHAN,
        AMD_CHIPSET_UNKNOWN;

    }

    @Type(noCCodeGeneration=true, cType="struct amd_ir_data")
    @NotUsableInJava
    public static class amd_ir_data
    extends Struct {
        public @Unsigned int cached_ga_tag;
        public Ptr<amd_iommu> iommu;
        public irq_2_irte irq_2_irte;
        public MsiDefinitions.msi_msg msi_entry;
        public Ptr<?> entry;
        public Ptr<IrqDefinitions.irq_cfg> cfg;
        public int ga_vector;
        public @Unsigned long ga_root_ptr;
        public @Unsigned int ga_tag;
    }

    @Type(noCCodeGeneration=true, cType="enum amd_iommu_intr_mode_type")
    public static enum amd_iommu_intr_mode_type implements Enum<amd_iommu_intr_mode_type>,
    TypedEnum<amd_iommu_intr_mode_type, Integer>
    {
        AMD_IOMMU_GUEST_IR_LEGACY,
        AMD_IOMMU_GUEST_IR_LEGACY_GA,
        AMD_IOMMU_GUEST_IR_VAPIC;

    }

    @Type(noCCodeGeneration=true, cType="struct amd_iommu_pi_data")
    @NotUsableInJava
    public static class amd_iommu_pi_data
    extends Struct {
        public @Unsigned int ga_tag;
        public @Unsigned int prev_ga_tag;
        public @Unsigned long base;
        public boolean is_guest_mode;
        public Ptr<VcpuDefinitions.vcpu_data> vcpu_data;
        public Ptr<?> ir_data;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_lps0_hid_device_data")
    @NotUsableInJava
    public static class amd_lps0_hid_device_data
    extends Struct {
        public boolean check_off_by_one;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_irte_ops")
    @NotUsableInJava
    public static class amd_irte_ops
    extends Struct {
        public Ptr<?> prepare;
        public Ptr<?> activate;
        public Ptr<?> deactivate;
        public Ptr<?> set_affinity;
        public Ptr<?> get;
        public Ptr<?> set_allocated;
        public Ptr<?> is_allocated;
        public Ptr<?> clear_allocated;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_iommu")
    @NotUsableInJava
    public static class amd_iommu
    extends Struct {
        public ListDefinitions.list_head list;
        public int index;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public Ptr<PciDefinitions.pci_dev> dev;
        public Ptr<PciDefinitions.pci_dev> root_pdev;
        public @Unsigned long mmio_phys;
        public @Unsigned long mmio_phys_end;
        public Ptr<Character> mmio_base;
        public @Unsigned int cap;
        public char acpi_flags;
        public @Unsigned long features;
        public @Unsigned long features2;
        public @Unsigned short devid;
        public @Unsigned short cap_ptr;
        public Ptr<amd_iommu_pci_seg> pci_seg;
        public @Unsigned long exclusion_start;
        public @Unsigned long exclusion_length;
        public Ptr<Character> cmd_buf;
        public @Unsigned int cmd_buf_head;
        public @Unsigned int cmd_buf_tail;
        public Ptr<Character> evt_buf;
        public char @Size(value=16) [] evt_irq_name;
        public Ptr<Character> ppr_log;
        public char @Size(value=16) [] ppr_irq_name;
        public Ptr<Character> ga_log;
        public char @Size(value=16) [] ga_irq_name;
        public Ptr<Character> ga_log_tail;
        public boolean int_enabled;
        public boolean need_sync;
        public boolean irtcachedis_enabled;
        public IommuDefinitions.iommu_device iommu;
        public @Unsigned int stored_addr_lo;
        public @Unsigned int stored_addr_hi;
        public @Unsigned int @Size(value=108) [] stored_l1;
        public @Unsigned int @Size(value=131) [] stored_l2;
        public char max_banks;
        public char max_counters;
        public Ptr<IrqDefinitions.irq_domain> ir_domain;
        public Ptr<amd_irte_ops> irte_ops;
        public @Unsigned int flags;
        public Ptr<@Unsigned Long> cmd_sem;
        public misc.atomic64_t cmd_sem_val;
        public Ptr<IopfDefinitions.iopf_queue> iopf_queue;
        public char @Size(value=32) [] iopfq_name;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_iommu_pci_seg")
    @NotUsableInJava
    public static class amd_iommu_pci_seg
    extends Struct {
        public ListDefinitions.list_head list;
        public misc.llist_head dev_data_list;
        public @Unsigned short id;
        public @Unsigned short last_bdf;
        public @Unsigned int dev_table_size;
        public @Unsigned int alias_table_size;
        public @Unsigned int rlookup_table_size;
        public Ptr<DevDefinitions.dev_table_entry> dev_table;
        public Ptr<Ptr<amd_iommu>> rlookup_table;
        public Ptr<Ptr<IrqDefinitions.irq_remap_table>> irq_lookup_table;
        public Ptr<DevDefinitions.dev_table_entry> old_dev_tbl_cpy;
        public Ptr<@Unsigned Short> alias_table;
        public ListDefinitions.list_head unity_map;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_io_pgtable")
    @NotUsableInJava
    public static class amd_io_pgtable
    extends Struct {
        public IoDefinitions.io_pgtable pgtbl;
        public int mode;
        public Ptr<@Unsigned Long> root;
        public Ptr<@Unsigned Long> pgd;
    }

    @Type(noCCodeGeneration=true, cType="struct { int nid; }")
    @NotUsableInJava
    public static class amd_of_anon_member_of_io_pgtable_cfg
    extends Struct {
        public int nid;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_northbridge")
    @NotUsableInJava
    public static class amd_northbridge
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> root;
        public Ptr<PciDefinitions.pci_dev> misc;
        public Ptr<PciDefinitions.pci_dev> link;
        public amd_l3_cache l3_cache;
        public Ptr<misc.threshold_bank> bank4;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_l3_cache")
    @NotUsableInJava
    public static class amd_l3_cache
    extends Struct {
        public @Unsigned int indices;
        public char @Size(value=4) [] subcaches;
    }

    @Type(noCCodeGeneration=true, cType="union amd_debug_extn_cfg")
    @NotUsableInJava
    public static class amd_debug_extn_cfg
    extends Union {
        public @Unsigned long val;
        public AnonDefinitions.anon_member_of_amd_debug_extn_cfg anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct amd_nb")
    @NotUsableInJava
    public static class amd_nb
    extends Struct {
        public int nb_id;
        public int refcnt;
        public Ptr<PerfDefinitions.perf_event> @Size(value=64) [] owners;
        public EventDefinitions.event_constraint @Size(value=64) [] event_constraints;
    }
}

