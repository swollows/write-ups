/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmarDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.LandlockDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class DomainDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __domain_flush_pages(Ptr<misc.protection_domain> domain, @Unsigned long address, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __domain_mapping(Ptr<DmarDefinitions.dmar_domain> domain, @Unsigned long iov_pfn, @Unsigned long phys_pfn, @Unsigned long nr_pages, int prot, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_add_cpu_ctrl(int cpu2, Ptr<RdtDefinitions.rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_add_cpu_mon(int cpu2, Ptr<RdtDefinitions.rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int domain_attach_iommu(Ptr<DmarDefinitions.dmar_domain> domain, Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_context_clear_one(Ptr<DeviceDefinitions.device_domain_info> info2, char bus, char devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int domain_context_clear_one_cb(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int domain_context_mapping_cb(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> opaque) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int domain_context_mapping_one(Ptr<DmarDefinitions.dmar_domain> domain, Ptr<IntelDefinitions.intel_iommu> iommu, char bus, char devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_detach_iommu(Ptr<DmarDefinitions.dmar_domain> domain, Ptr<IntelDefinitions.intel_iommu> iommu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_exit(Ptr<DmarDefinitions.dmar_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short domain_id_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_id_free(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_remove_cpu_ctrl(int cpu2, Ptr<RdtDefinitions.rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_remove_cpu_mon(int cpu2, Ptr<RdtDefinitions.rdt_resource> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int domain_setup_first_level(Ptr<IntelDefinitions.intel_iommu> iommu, Ptr<DmarDefinitions.dmar_domain> domain, Ptr<runtime.device> dev, @Unsigned int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_unmap(Ptr<DmarDefinitions.dmar_domain> domain, @Unsigned long start_pfn, @Unsigned long last_pfn, Ptr<ListDefinitions.list_head> freelist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_update_iommu_cap(Ptr<DmarDefinitions.dmar_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int domain_update_iommu_superpage(Ptr<DmarDefinitions.dmar_domain> domain, Ptr<IntelDefinitions.intel_iommu> skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="domain_is_scoped((const const struct landlock_ruleset*)$arg1, (const const struct landlock_ruleset*)$arg2, $arg3)")
    public static boolean domain_is_scoped(Ptr<LandlockDefinitions.landlock_ruleset> client, Ptr<LandlockDefinitions.landlock_ruleset> server, @Unsigned @OriginalName(value="access_mask_t") short scope) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_dirty_avail(Ptr<misc.dirty_throttle_control> dtc, boolean include_writeback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_dirty_limits(Ptr<misc.dirty_throttle_control> dtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long domain_poll_intv(Ptr<misc.dirty_throttle_control> dtc, boolean strictlimit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void domain_update_dirty_limit(Ptr<misc.dirty_throttle_control> dtc, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }
}

