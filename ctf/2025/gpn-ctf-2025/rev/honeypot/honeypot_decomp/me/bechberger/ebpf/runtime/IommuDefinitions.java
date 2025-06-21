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
import me.bechberger.ebpf.runtime.AmdDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.ContextDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GroupDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IoDefinitions;
import me.bechberger.ebpf.runtime.IopfDefinitions;
import me.bechberger.ebpf.runtime.IovaDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IommuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_attach_device(Ptr<iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_attach_group(Ptr<iommu_domain> domain, Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_calculate_agaw(Ptr<IntelDefinitions.intel_iommu> iommu, int max_gaw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_device_set_domain(Ptr<iommu_group> group, Ptr<runtime.device> dev, Ptr<iommu_domain> new_domain, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__iommu_domain_alloc((const struct iommu_ops*)$arg1, $arg2, $arg3)")
    public static Ptr<iommu_domain> __iommu_domain_alloc(Ptr<iommu_ops> ops, Ptr<runtime.device> dev, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_domain_alloc_dev(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __iommu_flush_context(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short did, @Unsigned short source_id, char function_mask, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __iommu_flush_iotlb(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short did, @Unsigned long addr2, @Unsigned int size_order, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __iommu_group_free_device(Ptr<iommu_group> group, Ptr<GroupDefinitions.group_device> grp_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __iommu_group_remove_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_group_set_domain_internal(Ptr<iommu_group> group, Ptr<iommu_domain> new_domain, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_map(Ptr<iommu_domain> domain, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size, int prot, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_probe_device(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> group_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_queue_command_sync(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<iommu_cmd> cmd, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __iommu_release_dma_ownership(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __iommu_take_dma_ownership(Ptr<iommu_group> group, Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __iommu_unmap(Ptr<iommu_domain> domain, @Unsigned long iova2, @Unsigned long size, Ptr<iommu_iotlb_gather> iotlb_gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="ioasid_t") int iommu_alloc_global_pasid(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> iommu_alloc_pages_node(int nid, @Unsigned @OriginalName(value="gfp_t") int gfp, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_resv_region> iommu_alloc_resv_region(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned long length, int prot, iommu_resv_type type2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_alloc_root_entry(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_attach_device(Ptr<iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_attach_device_pasid(Ptr<iommu_domain> domain, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid, Ptr<iommu_attach_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_attach_group(Ptr<iommu_domain> domain, Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_attach_group_handle(Ptr<iommu_domain> domain, Ptr<iommu_group> group, Ptr<iommu_attach_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_attach_handle> iommu_attach_handle_get(Ptr<iommu_group> group, @Unsigned @OriginalName(value="ioasid_t") int pasid, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_bus_notifier(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_calculate_agaw(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_calculate_max_sagaw(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_completion_wait(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ContextDefinitions.context_entry> iommu_context_addr(Ptr<IntelDefinitions.intel_iommu> iommu, char bus, char devfn, int alloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_create_device_direct_mappings(Ptr<iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iommu_default_passthrough() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_deferred_attach(Ptr<runtime.device> dev, Ptr<iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_deinit_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_detach_device(Ptr<iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_detach_device_pasid(Ptr<iommu_domain> domain, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_detach_group(Ptr<iommu_domain> domain, Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_detach_group_handle(Ptr<iommu_domain> domain, Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dev_disable_feature(Ptr<runtime.device> dev, iommu_dev_features feat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dev_enable_feature(Ptr<runtime.device> dev, iommu_dev_features feat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_device_claim_dma_owner(Ptr<runtime.device> dev, Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_device_register($arg1, (const struct iommu_ops*)$arg2, $arg3)")
    public static int iommu_device_register(Ptr<iommu_device> iommu, Ptr<iommu_ops> ops, Ptr<runtime.device> hwdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_device_release_dma_owner(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_device_unregister(Ptr<iommu_device> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_device_unuse_default_domain(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_device_use_default_domain(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_disable_protect_mem_regions(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_disable_translation(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_domain_alloc((const struct bus_type*)$arg1)")
    public static Ptr<iommu_domain> iommu_domain_alloc(Ptr<BusDefinitions.bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_domain_free(Ptr<iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_enable_nesting(Ptr<iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_enable_pci_caps(Ptr<DeviceDefinitions.device_domain_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_enable_translation(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_flush_dte(Ptr<AmdDefinitions.amd_iommu> iommu, @Unsigned short devid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_flush_irt_and_complete(Ptr<AmdDefinitions.amd_iommu> iommu, @Unsigned short devid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_flush_write_buffer(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_free_global_pasid(@Unsigned @OriginalName(value="ioasid_t") int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_free_pages(Ptr<?> virt, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_fwspec_add_ids($arg1, (const unsigned int*)$arg2, $arg3)")
    public static int iommu_fwspec_add_ids(Ptr<runtime.device> dev, Ptr<@Unsigned Integer> ids, int num_ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_fwspec_free(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_fwspec_init(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> iommu_fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_get_default_domain_type(Ptr<iommu_group> group, int target_type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_domain> iommu_get_dma_domain(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_domain> iommu_get_domain_for_dev(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_get_group_resv_regions(Ptr<iommu_group> group, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_get_resv_regions(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_group_add_device(Ptr<iommu_group> group, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_group> iommu_group_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<GroupDefinitions.group_device> iommu_group_alloc_device(Ptr<iommu_group> group, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iommu_group_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> __attr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_group_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long iommu_group_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> __attr, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_group_claim_dma_owner(Ptr<iommu_group> group, Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_domain> iommu_group_default_domain(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iommu_group_dma_owner_claimed(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_group_for_each_dev($arg1, $arg2, (int (*)(struct device*, void*))$arg3)")
    public static int iommu_group_for_each_dev(Ptr<iommu_group> group, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_group> iommu_group_get(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> iommu_group_get_iommudata(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean iommu_group_has_isolated_msi(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_group_id(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_group_put(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_group> iommu_group_ref_get(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_group_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_group_release_dma_owner(Ptr<iommu_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_group_remove_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_group_replace_domain(Ptr<iommu_group> group, Ptr<iommu_domain> new_domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_group_set_iommudata($arg1, $arg2, (void (*)(void*))$arg3)")
    public static void iommu_group_set_iommudata(Ptr<iommu_group> group, Ptr<?> iommu_data, Ptr<?> release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_group_set_name($arg1, (const u8*)$arg2)")
    public static int iommu_group_set_name(Ptr<iommu_group> group, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iommu_group_show_name(Ptr<iommu_group> group, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iommu_group_show_resv_regions(Ptr<iommu_group> group, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iommu_group_show_type(Ptr<iommu_group> group, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_group_store_type($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long iommu_group_store_type(Ptr<iommu_group> group, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_init_domains(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_insert_resv_region(Ptr<iommu_resv_region> _new, Ptr<ListDefinitions.list_head> regions) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long iommu_iova_to_phys(Ptr<iommu_domain> domain, @Unsigned @OriginalName(value="dma_addr_t") long iova2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_map(Ptr<iommu_domain> domain, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size, int prot, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long iommu_map_sg(Ptr<iommu_domain> domain, @Unsigned long iova2, Ptr<runtime.scatterlist> sg2, @Unsigned int nents, int prot, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct iommu_ops*)iommu_ops_from_fwnode((const struct fwnode_handle*)$arg1))")
    public static Ptr<iommu_ops> iommu_ops_from_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_domain> iommu_paging_domain_alloc(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_pgsize(Ptr<iommu_domain> domain, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long size, Ptr<@Unsigned Long> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_poll_events(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_poll_ga_log(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_present((const struct bus_type*)$arg1)")
    public static boolean iommu_present(Ptr<BusDefinitions.bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_print_event(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<?> __evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_probe_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_put_pages_list(Ptr<ListDefinitions.list_head> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_put_resv_regions(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_replace_group_handle(Ptr<iommu_group> group, Ptr<iommu_domain> new_domain, Ptr<iommu_attach_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_set_def_domain_type(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_set_default_passthrough(boolean cmd_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_set_default_translated(boolean cmd_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_set_dma_strict() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_set_fault_handler(Ptr<iommu_domain> domain, @OriginalName(value="iommu_fault_handler_t") Ptr<?> handler, Ptr<?> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_set_pgtable_quirks(Ptr<iommu_domain> domain, @Unsigned long quirk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_set_root_entry(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_setup_default_domain(Ptr<iommu_group> group, int target_type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_subsys_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_unmap(Ptr<iommu_domain> domain, @Unsigned long iova2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_unmap_fast(Ptr<iommu_domain> domain, @Unsigned long iova2, @Unsigned long size, Ptr<iommu_iotlb_gather> iotlb_gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long _iommu_cpumask_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long _iommu_event_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long iommu_v2_iova_to_phys(Ptr<IoDefinitions.io_pgtable_ops> ops, @Unsigned long iova2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_v2_map_pages(Ptr<IoDefinitions.io_pgtable_ops> ops, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long pgsize, @Unsigned long pgcount, int prot, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned Long> mapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_v2_unmap_pages(Ptr<IoDefinitions.io_pgtable_ops> ops, @Unsigned long iova2, @Unsigned long pgsize, @Unsigned long pgcount, Ptr<iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__iommu_copy_struct_from_user($arg1, (const struct iommu_user_data*)$arg2, $arg3, $arg4, $arg5)")
    public static int __iommu_copy_struct_from_user(Ptr<?> dst_data, Ptr<iommu_user_data> src_data, @Unsigned int data_type, @Unsigned long data_len, @Unsigned long min_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__iommu_setup_intcapxt($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int __iommu_setup_intcapxt(Ptr<AmdDefinitions.amd_iommu> iommu, String devname, int hwirq, @OriginalName(value="irq_handler_t") Ptr<?> thread_fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> iommu_alloc_4k_pages(Ptr<AmdDefinitions.amd_iommu> iommu, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> iommu_alloc_pages(@Unsigned @OriginalName(value="gfp_t") int gfp, int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_apply_resume_quirks(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short iommu_clocks_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_device_link(Ptr<iommu_device> iommu, Ptr<runtime.device> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_device_sysfs_add($arg1, $arg2, (const struct attribute_group**)$arg3, (const u8*)$arg4, $arg5_)")
    public static int iommu_device_sysfs_add(Ptr<iommu_device> iommu, Ptr<runtime.device> parent, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_device_sysfs_remove(Ptr<iommu_device> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_device_unlink(Ptr<iommu_device> iommu, Ptr<runtime.device> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_disable(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_enable_command_buffer(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_enable_event_buffer(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_enable_irtcachedis(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_feature_disable(Ptr<AmdDefinitions.amd_iommu> iommu, char bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_feature_enable(Ptr<AmdDefinitions.amd_iommu> iommu, char bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_go_to_state(iommu_init_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_init_pci(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_make_shared(Ptr<?> va, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short iommu_mem_blocked_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short iommu_mrds_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_pc_get_set_reg(Ptr<AmdDefinitions.amd_iommu> iommu, char bank, char cntr, char fxn, Ptr<@Unsigned Long> value, boolean is_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_pmu_add(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_pmu_assign_event(Ptr<iommu_pmu> iommu_pmu2, Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_pmu_del(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_pmu_disable(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_pmu_enable(Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_pmu_event_init(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_pmu_event_update(Ptr<PerfDefinitions.perf_event> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn iommu_pmu_irq_handler(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_pmu_register(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_pmu_start(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_pmu_stop(Ptr<PerfDefinitions.perf_event> event2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_pmu_unregister(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int iommu_read_l2(Ptr<AmdDefinitions.amd_iommu> iommu, char address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_report_device_fault(Ptr<runtime.device> dev, Ptr<IopfDefinitions.iopf_fault> evt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short iommu_requests_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_set_device_table(Ptr<AmdDefinitions.amd_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_sva_domain_free(Ptr<iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_sva_set_dev_pasid(Ptr<iommu_domain> domain, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Ptr<runtime.page>> __iommu_dma_alloc_noncontiguous(Ptr<runtime.device> dev, @Unsigned long size, Ptr<SgDefinitions.sg_table> sgt, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long __iommu_dma_map(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys, @Unsigned long size, int prot, @Unsigned long dma_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __iommu_dma_unmap(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_area_alloc(Ptr<@Unsigned Long> map2, @Unsigned long size, @Unsigned long start, @Unsigned int nr, @Unsigned long shift, @Unsigned long boundary_size, @Unsigned long align_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_call_iopf_notifier(Ptr<AmdDefinitions.amd_iommu> iommu, Ptr<@Unsigned Long> raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_disable_irq_remapping(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> iommu_dma_alloc(Ptr<runtime.device> dev, @Unsigned long size, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> handle, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long iommu_dma_alloc_iova(Ptr<iommu_domain> domain, @Unsigned long size, @Unsigned long dma_limit, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> iommu_dma_alloc_noncontiguous(Ptr<runtime.device> dev, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned @OriginalName(value="gfp_t") int gfp, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_compose_msi_msg(Ptr<MsiDefinitions.msi_desc> desc, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_forcedac_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_free(Ptr<runtime.device> dev, @Unsigned long size, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long handle, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_free_iova(Ptr<iommu_dma_cookie> cookie, @Unsigned @OriginalName(value="dma_addr_t") long iova2, @Unsigned long size, Ptr<iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_free_noncontiguous(Ptr<runtime.device> dev, @Unsigned long size, Ptr<SgDefinitions.sg_table> sgt, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_dma_get_merge_boundary(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_get_resv_regions(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_get_sgtable(Ptr<runtime.device> dev, Ptr<SgDefinitions.sg_table> sgt, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_init_domain(Ptr<iommu_domain> domain, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_init_fq(Ptr<iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long iommu_dma_map_page(Ptr<runtime.device> dev, Ptr<runtime.page> page2, @Unsigned long offset, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long iommu_dma_map_resource(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="phys_addr_t") long phys, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_map_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_dma_max_mapping_size(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_mmap(Ptr<runtime.device> dev, Ptr<VmDefinitions.vm_area_struct> vma, Ptr<?> cpu_addr, @Unsigned @OriginalName(value="dma_addr_t") long dma_addr, @Unsigned long size, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_mmap_noncontiguous(Ptr<runtime.device> dev, Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long size, Ptr<SgDefinitions.sg_table> sgt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_dma_opt_mapping_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_dma_prepare_msi(Ptr<MsiDefinitions.msi_desc> desc, @Unsigned @OriginalName(value="phys_addr_t") long msi_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="iommu_dma_ranges_sort($arg1, (const struct list_head*)$arg2, (const struct list_head*)$arg3)")
    public static int iommu_dma_ranges_sort(Ptr<?> priv, Ptr<ListDefinitions.list_head> a, Ptr<ListDefinitions.list_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_sync_sg_for_cpu(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nelems, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_sync_sg_for_device(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sgl, int nelems, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_sync_single_for_cpu(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_sync_single_for_device(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_unmap_page(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long dma_handle, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_unmap_resource(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="dma_addr_t") long handle, @Unsigned long size, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_dma_unmap_sg(Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2, int nents, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> iommu_dma_vmap_noncontiguous(Ptr<runtime.device> dev, @Unsigned long size, Ptr<SgDefinitions.sg_table> sgt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_enable_irq_remapping(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_get_dma_cookie(Ptr<iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_get_msi_cookie(Ptr<iommu_domain> domain, @Unsigned @OriginalName(value="dma_addr_t") long base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_init_noop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_load_old_irte(Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_put_dma_cookie(Ptr<iommu_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_set_irq_remapping(Ptr<IntelDefinitions.intel_iommu> iommu, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_setup(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_setup_dma_ops(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_shutdown_noop() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<iommu_sva> iommu_sva_bind_device(Ptr<runtime.device> dev, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int iommu_sva_get_pasid(Ptr<iommu_sva> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_sva_handle_iopf(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static iommu_page_response_code iommu_sva_handle_mm(Ptr<iommu_fault> fault, Ptr<MmDefinitions.mm_struct> mm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_sva_iopf_handler(Ptr<IopfDefinitions.iopf_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void iommu_sva_unbind_device(Ptr<iommu_sva> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long iommu_v1_iova_to_phys(Ptr<IoDefinitions.io_pgtable_ops> ops, @Unsigned long iova2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_v1_map_pages(Ptr<IoDefinitions.io_pgtable_ops> ops, @Unsigned long iova2, @Unsigned @OriginalName(value="phys_addr_t") long paddr, @Unsigned long pgsize, @Unsigned long pgcount, int prot, @Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<@Unsigned Long> mapped) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int iommu_v1_read_and_clear_dirty(Ptr<IoDefinitions.io_pgtable_ops> ops, @Unsigned long iova2, @Unsigned long size, @Unsigned long flags, Ptr<iommu_dirty_bitmap> dirty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long iommu_v1_unmap_pages(Ptr<IoDefinitions.io_pgtable_ops> ops, @Unsigned long iova2, @Unsigned long pgsize, @Unsigned long pgcount, Ptr<iommu_iotlb_gather> gather) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_hwpt_vtd_s1_invalidate")
    @NotUsableInJava
    public static class iommu_hwpt_vtd_s1_invalidate
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned long npages;
        public @Unsigned int flags;
        public @Unsigned int __reserved;
    }

    @Type(noCCodeGeneration=true, cType="enum iommu_hwpt_vtd_s1_invalidate_flags")
    public static enum iommu_hwpt_vtd_s1_invalidate_flags implements Enum<iommu_hwpt_vtd_s1_invalidate_flags>,
    TypedEnum<iommu_hwpt_vtd_s1_invalidate_flags, Integer>
    {
        IOMMU_VTD_INV_FLAGS_LEAF;

    }

    @Type(noCCodeGeneration=true, cType="enum iommu_hwpt_invalidate_data_type")
    public static enum iommu_hwpt_invalidate_data_type implements Enum<iommu_hwpt_invalidate_data_type>,
    TypedEnum<iommu_hwpt_invalidate_data_type, Integer>
    {
        IOMMU_HWPT_INVALIDATE_DATA_VTD_S1;

    }

    @Type(noCCodeGeneration=true, cType="enum iommu_hwpt_data_type")
    public static enum iommu_hwpt_data_type implements Enum<iommu_hwpt_data_type>,
    TypedEnum<iommu_hwpt_data_type, Integer>
    {
        IOMMU_HWPT_DATA_NONE,
        IOMMU_HWPT_DATA_VTD_S1;

    }

    @Type(noCCodeGeneration=true, cType="enum iommu_init_state")
    public static enum iommu_init_state implements Enum<iommu_init_state>,
    TypedEnum<iommu_init_state, Integer>
    {
        IOMMU_START_STATE,
        IOMMU_IVRS_DETECTED,
        IOMMU_ACPI_FINISHED,
        IOMMU_ENABLED,
        IOMMU_PCI_INIT,
        IOMMU_INTERRUPTS_EN,
        IOMMU_INITIALIZED,
        IOMMU_NOT_FOUND,
        IOMMU_INIT_ERROR,
        IOMMU_CMDLINE_DISABLED;

    }

    @Type(noCCodeGeneration=true, cType="struct iommu_group_attribute")
    @NotUsableInJava
    public static class iommu_group_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_group")
    @NotUsableInJava
    public static class iommu_group
    extends Struct {
        public runtime.kobject kobj;
        public Ptr<runtime.kobject> devices_kobj;
        public ListDefinitions.list_head devices;
        public runtime.xarray pasid_array;
        public runtime.mutex mutex;
        public Ptr<?> iommu_data;
        public Ptr<?> iommu_data_release;
        public String name;
        public int id;
        public Ptr<iommu_domain> default_domain;
        public Ptr<iommu_domain> blocking_domain;
        public Ptr<iommu_domain> domain;
        public ListDefinitions.list_head entry;
        public @Unsigned int owner_cnt;
        public Ptr<?> owner;
    }

    @Type(noCCodeGeneration=true, cType="enum iommu_hw_info_type")
    public static enum iommu_hw_info_type implements Enum<iommu_hw_info_type>,
    TypedEnum<iommu_hw_info_type, Integer>
    {
        IOMMU_HW_INFO_TYPE_NONE,
        IOMMU_HW_INFO_TYPE_INTEL_VTD;

    }

    @Type(noCCodeGeneration=true, cType="struct iommu_hw_info_vtd")
    @NotUsableInJava
    public static class iommu_hw_info_vtd
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int __reserved;
        public @Unsigned long cap_reg;
        public @Unsigned long ecap_reg;
    }

    @Type(noCCodeGeneration=true, cType="enum iommu_hw_info_vtd_flags")
    public static enum iommu_hw_info_vtd_flags implements Enum<iommu_hw_info_vtd_flags>,
    TypedEnum<iommu_hw_info_vtd_flags, Integer>
    {
        IOMMU_HW_INFO_VTD_ERRATA_772415_SPR17;

    }

    @Type(noCCodeGeneration=true, cType="struct iommu_cmd")
    @NotUsableInJava
    public static class iommu_cmd
    extends Struct {
        public @Unsigned int @Size(value=4) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_sva")
    @NotUsableInJava
    public static class iommu_sva
    extends Struct {
        public iommu_attach_handle handle;
        public Ptr<runtime.device> dev;
        public @OriginalName(value="refcount_t") misc.refcount_struct users;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_dma_options")
    @NotUsableInJava
    public static class iommu_dma_options
    extends Struct {
        public iommu_dma_queue_type qt;
        public @Unsigned long fq_size;
        public @Unsigned int fq_timeout;
    }

    @Type(noCCodeGeneration=true, cType="enum iommu_dma_queue_type")
    public static enum iommu_dma_queue_type implements Enum<iommu_dma_queue_type>,
    TypedEnum<iommu_dma_queue_type, Integer>
    {
        IOMMU_DMA_OPTS_PER_CPU_QUEUE,
        IOMMU_DMA_OPTS_SINGLE_QUEUE;

    }

    @Type(noCCodeGeneration=true, cType="enum iommu_dma_cookie_type")
    public static enum iommu_dma_cookie_type implements Enum<iommu_dma_cookie_type>,
    TypedEnum<iommu_dma_cookie_type, Integer>
    {
        IOMMU_DMA_IOVA_COOKIE,
        IOMMU_DMA_MSI_COOKIE;

    }

    @Type(noCCodeGeneration=true, cType="struct iommu_dma_msi_page")
    @NotUsableInJava
    public static class iommu_dma_msi_page
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned @OriginalName(value="dma_addr_t") long iova;
        public @Unsigned @OriginalName(value="phys_addr_t") long phys;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_resv_region")
    @NotUsableInJava
    public static class iommu_resv_region
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned @OriginalName(value="phys_addr_t") long start;
        public @Unsigned long length;
        public int prot;
        public iommu_resv_type type;
        public Ptr<?> free;
    }

    @Type(noCCodeGeneration=true, cType="enum iommu_resv_type")
    public static enum iommu_resv_type implements Enum<iommu_resv_type>,
    TypedEnum<iommu_resv_type, Integer>
    {
        IOMMU_RESV_DIRECT,
        IOMMU_RESV_DIRECT_RELAXABLE,
        IOMMU_RESV_RESERVED,
        IOMMU_RESV_MSI,
        IOMMU_RESV_SW_MSI;

    }

    @Type(noCCodeGeneration=true, cType="struct iommu_dma_cookie")
    @NotUsableInJava
    public static class iommu_dma_cookie
    extends Struct {
        public iommu_dma_cookie_type type;
        @InlineUnion(value=18547)
        public  @InlineUnion(value=18547) AnonDefinitions.anon_member_of_anon_member_of_iommu_dma_cookie anon1$0;
        @InlineUnion(value=18547)
        public @InlineUnion(value=18547) @Unsigned @OriginalName(value="dma_addr_t") long msi_iova;
        public ListDefinitions.list_head msi_page_list;
        public Ptr<iommu_domain> fq_domain;
        public iommu_dma_options options;
        public runtime.mutex mutex;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_pmu")
    @NotUsableInJava
    public static class iommu_pmu
    extends Struct {
        public Ptr<IntelDefinitions.intel_iommu> iommu;
        public @Unsigned int num_cntr;
        public @Unsigned int num_eg;
        public @Unsigned int cntr_width;
        public @Unsigned int cntr_stride;
        public @Unsigned int filter;
        public Ptr<?> base;
        public Ptr<?> cfg_reg;
        public Ptr<?> cntr_reg;
        public Ptr<?> overflow;
        public Ptr<@Unsigned Long> evcap;
        public Ptr<Ptr<@Unsigned Integer>> cntr_evcap;
        public runtime.pmu pmu;
        public @Unsigned long @Size(value=1) [] used_mask;
        public Ptr<PerfDefinitions.perf_event> @Size(value=64) [] event_list;
        public char @Size(value=16) [] irq_name;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_domain_info")
    @NotUsableInJava
    public static class iommu_domain_info
    extends Struct {
        public Ptr<IntelDefinitions.intel_iommu> iommu;
        public @Unsigned int refcnt;
        public @Unsigned short did;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_flush")
    @NotUsableInJava
    public static class iommu_flush
    extends Struct {
        public Ptr<?> flush_context;
        public Ptr<?> flush_iotlb;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_hwpt_vtd_s1")
    @NotUsableInJava
    public static class iommu_hwpt_vtd_s1
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned long pgtbl_addr;
        public @Unsigned int addr_width;
        public @Unsigned int __reserved;
    }

    @Type(noCCodeGeneration=true, cType="enum iommu_hwpt_vtd_s1_flags")
    public static enum iommu_hwpt_vtd_s1_flags implements Enum<iommu_hwpt_vtd_s1_flags>,
    TypedEnum<iommu_hwpt_vtd_s1_flags, Integer>
    {
        IOMMU_VTD_S1_SRE,
        IOMMU_VTD_S1_EAFE,
        IOMMU_VTD_S1_WPE;

    }

    @Type(noCCodeGeneration=true, cType="struct iommu_dev_data")
    @NotUsableInJava
    public static class iommu_dev_data
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head list;
        public misc.llist_node dev_data_list;
        public Ptr<misc.protection_domain> domain;
        public misc.gcr3_tbl_info gcr3_info;
        public Ptr<runtime.device> dev;
        public @Unsigned short devid;
        public @Unsigned int max_pasids;
        public @Unsigned int flags;
        public int ats_qdep;
        public char ats_enabled;
        public char pri_enabled;
        public char pasid_enabled;
        public char pri_tlp;
        public char ppr;
        public boolean use_vapic;
        public boolean defer_attach;
        public misc.ratelimit_state rs;
    }

    @Type(noCCodeGeneration=true, cType="enum iommu_page_response_code")
    public static enum iommu_page_response_code implements Enum<iommu_page_response_code>,
    TypedEnum<iommu_page_response_code, Integer>
    {
        IOMMU_PAGE_RESP_SUCCESS,
        IOMMU_PAGE_RESP_INVALID,
        IOMMU_PAGE_RESP_FAILURE;

    }

    @Type(noCCodeGeneration=true, cType="enum iommu_fault_type")
    public static enum iommu_fault_type implements Enum<iommu_fault_type>,
    TypedEnum<iommu_fault_type, Integer>
    {
        IOMMU_FAULT_PAGE_REQ;

    }

    @Type(noCCodeGeneration=true, cType="struct iommu_flush_ops")
    @NotUsableInJava
    public static class iommu_flush_ops
    extends Struct {
        public Ptr<?> tlb_flush_all;
        public Ptr<?> tlb_flush_walk;
        public Ptr<?> tlb_add_page;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_fwspec")
    @NotUsableInJava
    public static class iommu_fwspec
    extends Struct {
        public Ptr<FwnodeDefinitions.fwnode_handle> iommu_fwnode;
        public @Unsigned int flags;
        public @Unsigned int num_ids;
        public @Unsigned int @Size(value=0) [] ids;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_device")
    @NotUsableInJava
    public static class iommu_device
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<iommu_ops> ops;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public Ptr<runtime.device> dev;
        public Ptr<iommu_group> singleton_group;
        public @Unsigned int max_pasids;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_user_data_array")
    @NotUsableInJava
    public static class iommu_user_data_array
    extends Struct {
        public @Unsigned int type;
        public Ptr<?> uptr;
        public @Unsigned long entry_len;
        public @Unsigned int entry_num;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_user_data")
    @NotUsableInJava
    public static class iommu_user_data
    extends Struct {
        public @Unsigned int type;
        public Ptr<?> uptr;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_dirty_bitmap")
    @NotUsableInJava
    public static class iommu_dirty_bitmap
    extends Struct {
        public Ptr<IovaDefinitions.iova_bitmap> bitmap;
        public Ptr<iommu_iotlb_gather> gather;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_iotlb_gather")
    @NotUsableInJava
    public static class iommu_iotlb_gather
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long pgsize;
        public ListDefinitions.list_head freelist;
        public boolean queued;
    }

    @Type(noCCodeGeneration=true, cType="enum iommu_dev_features")
    public static enum iommu_dev_features implements Enum<iommu_dev_features>,
    TypedEnum<iommu_dev_features, Integer>
    {
        IOMMU_DEV_FEAT_SVA,
        IOMMU_DEV_FEAT_IOPF;

    }

    @Type(noCCodeGeneration=true, cType="enum iommu_cap")
    public static enum iommu_cap implements Enum<iommu_cap>,
    TypedEnum<iommu_cap, Integer>
    {
        IOMMU_CAP_CACHE_COHERENCY,
        IOMMU_CAP_NOEXEC,
        IOMMU_CAP_PRE_BOOT_PROTECTION,
        IOMMU_CAP_ENFORCE_CACHE_COHERENCY,
        IOMMU_CAP_DEFERRED_FLUSH,
        IOMMU_CAP_DIRTY_TRACKING;

    }

    @Type(noCCodeGeneration=true, cType="struct iommu_ops")
    @NotUsableInJava
    public static class iommu_ops
    extends Struct {
        public Ptr<?> capable;
        public Ptr<?> hw_info;
        public Ptr<?> domain_alloc;
        public Ptr<?> domain_alloc_user;
        public Ptr<?> domain_alloc_paging;
        public Ptr<?> domain_alloc_sva;
        public Ptr<?> probe_device;
        public Ptr<?> release_device;
        public Ptr<?> probe_finalize;
        public Ptr<?> device_group;
        public Ptr<?> get_resv_regions;
        public Ptr<?> of_xlate;
        public Ptr<?> is_attach_deferred;
        public Ptr<?> dev_enable_feat;
        public Ptr<?> dev_disable_feat;
        public Ptr<?> page_response;
        public Ptr<?> def_domain_type;
        public Ptr<?> remove_dev_pasid;
        public Ptr<iommu_domain_ops> default_domain_ops;
        public @Unsigned long pgsize_bitmap;
        public Ptr<runtime.module> owner;
        public Ptr<iommu_domain> identity_domain;
        public Ptr<iommu_domain> blocked_domain;
        public Ptr<iommu_domain> release_domain;
        public Ptr<iommu_domain> default_domain;
        public char user_pasid_table;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_dirty_ops")
    @NotUsableInJava
    public static class iommu_dirty_ops
    extends Struct {
        public Ptr<?> set_dirty_tracking;
        public Ptr<?> read_and_clear_dirty;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_domain_ops")
    @NotUsableInJava
    public static class iommu_domain_ops
    extends Struct {
        public Ptr<?> attach_dev;
        public Ptr<?> set_dev_pasid;
        public Ptr<?> map_pages;
        public Ptr<?> unmap_pages;
        public Ptr<?> flush_iotlb_all;
        public Ptr<?> iotlb_sync_map;
        public Ptr<?> iotlb_sync;
        public Ptr<?> cache_invalidate_user;
        public Ptr<?> iova_to_phys;
        public Ptr<?> enforce_cache_coherency;
        public Ptr<?> enable_nesting;
        public Ptr<?> set_pgtable_quirks;
        public Ptr<?> free;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_domain_geometry")
    @NotUsableInJava
    public static class iommu_domain_geometry
    extends Struct {
        public @Unsigned @OriginalName(value="dma_addr_t") long aperture_start;
        public @Unsigned @OriginalName(value="dma_addr_t") long aperture_end;
        public boolean force_aperture;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_domain")
    @NotUsableInJava
    public static class iommu_domain
    extends Struct {
        public @Unsigned int type;
        public Ptr<iommu_domain_ops> ops;
        public Ptr<iommu_dirty_ops> dirty_ops;
        public Ptr<iommu_ops> owner;
        public @Unsigned long pgsize_bitmap;
        public iommu_domain_geometry geometry;
        public Ptr<iommu_dma_cookie> iova_cookie;
        public Ptr<?> iopf_handler;
        public Ptr<?> fault_data;
        @InlineUnion(value=4187)
        public  @InlineUnion(value=4187) AnonDefinitions.anon_member_of_anon_member_of_iommu_domain anon9$0;
        @InlineUnion(value=4187)
        public  @InlineUnion(value=4187) AnonDefinitions.anon_member_of_anon_member_of_iommu_domain anon9$1;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_fault_param")
    @NotUsableInJava
    public static class iommu_fault_param
    extends Struct {
        public runtime.mutex lock;
        public @OriginalName(value="refcount_t") misc.refcount_struct users;
        public misc.callback_head rcu;
        public Ptr<runtime.device> dev;
        public Ptr<IopfDefinitions.iopf_queue> queue;
        public ListDefinitions.list_head queue_list;
        public ListDefinitions.list_head partial;
        public ListDefinitions.list_head faults;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_attach_handle")
    @NotUsableInJava
    public static class iommu_attach_handle
    extends Struct {
        public Ptr<iommu_domain> domain;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_page_response")
    @NotUsableInJava
    public static class iommu_page_response
    extends Struct {
        public @Unsigned int pasid;
        public @Unsigned int grpid;
        public @Unsigned int code;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_fault")
    @NotUsableInJava
    public static class iommu_fault
    extends Struct {
        public @Unsigned int type;
        public iommu_fault_page_request prm;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_fault_page_request")
    @NotUsableInJava
    public static class iommu_fault_page_request
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int pasid;
        public @Unsigned int grpid;
        public @Unsigned int perm;
        public @Unsigned long addr;
        public @Unsigned long @Size(value=2) [] private_data;
    }

    @Type(noCCodeGeneration=true, cType="struct iommu_mm_data")
    @NotUsableInJava
    public static class iommu_mm_data
    extends Struct {
        public @Unsigned int pasid;
        public ListDefinitions.list_head sva_domains;
    }
}

