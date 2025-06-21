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
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.QiDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DmarDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_ats_supported(Ptr<PciDefinitions.pci_dev> dev, Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_check_one_atsr(Ptr<AcpiDefinitions.acpi_dmar_header> hdr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_domain_attach_device(Ptr<dmar_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dmar_atsr_unit> dmar_find_atsr(Ptr<AcpiDefinitions.acpi_dmar_atsr> atsr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_iommu_hotplug(Ptr<dmar_drhd_unit> dmaru, boolean insert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_iommu_notify_scope_dev(Ptr<dmar_pci_notify_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_parse_one_atsr(Ptr<AcpiDefinitions.acpi_dmar_header> hdr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_parse_one_rmrr(Ptr<AcpiDefinitions.acpi_dmar_header> header, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_parse_one_satc(Ptr<AcpiDefinitions.acpi_dmar_header> hdr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_release_one_atsr(Ptr<AcpiDefinitions.acpi_dmar_header> hdr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dmar_enable_qi(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_acpi_insert_dev_scope(char device_number, Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dmar_alloc_dev_scope(Ptr<?> start, Ptr<?> end, Ptr<Integer> cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dmar_pci_notify_info> dmar_alloc_pci_notify_info(Ptr<PciDefinitions.pci_dev> dev, @Unsigned long event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_dev_scope_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_device_add(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_device_hotplug(@OriginalName(value="acpi_handle") Ptr<?> handle, boolean insert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_device_remove(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_disable_qi(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_enable_qi(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn dmar_fault(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dmar_drhd_unit> dmar_find_matched_drhd_unit(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_free_dev_scope(Ptr<Ptr<dmar_dev_scope>> devices, Ptr<Integer> cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_free_drhd(Ptr<dmar_drhd_unit> dmaru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_free_unused_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int dmar_get_dsm_handle(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> retval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_hp_add_drhd(Ptr<AcpiDefinitions.acpi_dmar_header> header, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_hp_release_drhd(Ptr<AcpiDefinitions.acpi_dmar_header> header, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_hp_remove_drhd(Ptr<AcpiDefinitions.acpi_dmar_header> header, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_insert_dev_scope(Ptr<dmar_pci_notify_info> info2, Ptr<?> start, Ptr<?> end, @Unsigned short segment, Ptr<dmar_dev_scope> devices, int devices_cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_ir_support() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_msi_mask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_msi_read(int irq, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_msi_unmask(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_msi_write(int irq, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_parse_one_andd(Ptr<AcpiDefinitions.acpi_dmar_header> header, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_parse_one_drhd(Ptr<AcpiDefinitions.acpi_dmar_header> header, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_parse_one_rhsa(Ptr<AcpiDefinitions.acpi_dmar_header> header, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_pci_bus_add_dev(Ptr<dmar_pci_notify_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_pci_bus_notifier(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dmar_platform_optin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_reenable_qi(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_register_bus_notifier() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_remove_dev_scope(Ptr<dmar_pci_notify_info> info2, @Unsigned short segment, Ptr<dmar_dev_scope> devices, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_set_interrupt(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_table_detect() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_table_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_validate_one_drhd(Ptr<AcpiDefinitions.acpi_dmar_header> entry, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_walk_dmar_table(Ptr<AcpiDefinitions.acpi_table_dmar> dmar, Ptr<dmar_res_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_walk_dsm_resource(@OriginalName(value="acpi_handle") Ptr<?> handle, int func, @OriginalName(value="dmar_res_handler_t") Ptr<?> handler, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_walk_remapping_entries(Ptr<AcpiDefinitions.acpi_dmar_header> start, @Unsigned long len, Ptr<dmar_res_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_alloc_hwirq(int id, int node2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_free_hwirq(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_ir_add(Ptr<dmar_drhd_unit> dmaru, Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_ir_hotplug(Ptr<dmar_drhd_unit> dmaru, boolean insert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_msi_compose_msg(Ptr<IrqDefinitions.irq_data> data, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dmar_msi_init(Ptr<IrqDefinitions.irq_domain> domain, Ptr<MsiDefinitions.msi_domain_info> info2, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hwirq, Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dmar_msi_write_msg(Ptr<IrqDefinitions.irq_data> data, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_res_callback")
    @NotUsableInJava
    public static class dmar_res_callback
    extends Struct {
        public @OriginalName(value="dmar_res_handler_t") Ptr<?> @Size(value=6) [] cb;
        public Ptr<?> @Size(value=6) [] arg;
        public boolean ignore_unhandled;
        public boolean print_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_satc_unit")
    @NotUsableInJava
    public static class dmar_satc_unit
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<AcpiDefinitions.acpi_dmar_header> hdr;
        public Ptr<dmar_dev_scope> devices;
        public Ptr<IntelDefinitions.intel_iommu> iommu;
        public int devices_cnt;
        public char atc_required;
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_atsr_unit")
    @NotUsableInJava
    public static class dmar_atsr_unit
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<AcpiDefinitions.acpi_dmar_header> hdr;
        public Ptr<dmar_dev_scope> devices;
        public int devices_cnt;
        public char include_all;
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_rmrr_unit")
    @NotUsableInJava
    public static class dmar_rmrr_unit
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<AcpiDefinitions.acpi_dmar_header> hdr;
        public @Unsigned long base_address;
        public @Unsigned long end_address;
        public Ptr<dmar_dev_scope> devices;
        public int devices_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_pci_notify_info")
    @NotUsableInJava
    public static class dmar_pci_notify_info
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> dev;
        public @Unsigned long event;
        public int bus;
        public @Unsigned short seg;
        public @Unsigned short level;
        public dmar_pci_path @Size(value=0) [] path;
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_pci_path")
    @NotUsableInJava
    public static class dmar_pci_path
    extends Struct {
        public char bus;
        public char device;
        public char function;
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_domain")
    @NotUsableInJava
    public static class dmar_domain
    extends Struct {
        public int nid;
        public runtime.xarray iommu_array;
        public char iommu_coherency;
        public char force_snooping;
        public char set_pte_snp;
        public char use_first_level;
        public char dirty_tracking;
        public char nested_parent;
        public char has_mappings;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head devices;
        public ListDefinitions.list_head dev_pasids;
        public  @OriginalName(value="spinlock_t") runtime.spinlock cache_lock;
        public ListDefinitions.list_head cache_tags;
        public Ptr<QiDefinitions.qi_batch> qi_batch;
        public int iommu_superpage;
        @InlineUnion(value=18465)
        public  @InlineUnion(value=18465) AnonDefinitions.anon_member_of_anon_member_of_dmar_domain anon16$0;
        @InlineUnion(value=18465)
        public  @InlineUnion(value=18465) AnonDefinitions.anon_member_of_anon_member_of_dmar_domain anon16$1;
        @InlineUnion(value=18465)
        public  @InlineUnion(value=18465) AnonDefinitions.anon_member_of_anon_member_of_dmar_domain anon16$2;
        public IommuDefinitions.iommu_domain domain;
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_drhd_unit")
    @NotUsableInJava
    public static class dmar_drhd_unit
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<AcpiDefinitions.acpi_dmar_header> hdr;
        public @Unsigned long reg_base_addr;
        public @Unsigned long reg_size;
        public Ptr<dmar_dev_scope> devices;
        public int devices_cnt;
        public @Unsigned short segment;
        public char ignored;
        public char include_all;
        public char gfx_dedicated;
        public Ptr<IntelDefinitions.intel_iommu> iommu;
    }

    @Type(noCCodeGeneration=true, cType="struct dmar_dev_scope")
    @NotUsableInJava
    public static class dmar_dev_scope
    extends Struct {
        public Ptr<runtime.device> dev;
        public char bus;
        public char devfn;
    }
}

