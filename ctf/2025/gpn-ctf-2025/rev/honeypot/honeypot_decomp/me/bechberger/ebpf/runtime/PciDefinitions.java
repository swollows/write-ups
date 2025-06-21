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
import me.bechberger.ebpf.runtime.AerDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.ConfigDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GenDefinitions;
import me.bechberger.ebpf.runtime.HvDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PcieDefinitions;
import me.bechberger.ebpf.runtime.PhysdevDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.ReleaseDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SerialDefinitions;
import me.bechberger.ebpf.runtime.SetupDefinitions;
import me.bechberger.ebpf.runtime.UartDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PciDefinitions {
    public static final @Unsigned int pci_channel_io_normal = 1;
    public static final @Unsigned int pci_channel_io_frozen = 2;
    public static final @Unsigned int pci_channel_io_perm_failure = 3;

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_epf_register_driver(Ptr<pci_epf_driver> driver, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _pci_assign_resource(Ptr<pci_dev> dev, int resno, @Unsigned @OriginalName(value="resource_size_t") long size, @Unsigned @OriginalName(value="resource_size_t") long min_align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int pci_acpi_add_bus_pm_notifier(Ptr<AcpiDefinitions.acpi_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_add_edr_notifier(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int pci_acpi_add_pm_notifier(Ptr<AcpiDefinitions.acpi_device> dev, Ptr<pci_dev> pci_dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_cleanup(Ptr<runtime.device> dev, Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_clear_companion_lookup_hook() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_acpi_preserve_config(Ptr<pci_host_bridge> host_bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_acpi_program_hp_params(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_remove_edr_notifier(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_acpi_set_companion_lookup_hook((struct acpi_device* (*)(struct pci_dev*))$arg1)")
    public static int pci_acpi_set_companion_lookup_hook(Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_setup(Ptr<runtime.device> dev, Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_wake_bus(Ptr<AcpiDefinitions.acpi_device_wakeup_context> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_wake_dev(Ptr<AcpiDefinitions.acpi_device_wakeup_context> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_allocate_vc_save_buffers(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_amd_enable_64bit_bar(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_assign_resource(Ptr<pci_dev> dev, int resno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_read_config_byte(Ptr<pci_bus> bus, @Unsigned int devfn, int pos, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_read_config_dword(Ptr<pci_bus> bus, @Unsigned int devfn, int pos, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_read_config_word(Ptr<pci_bus> bus, @Unsigned int devfn, int pos, Ptr<@Unsigned Short> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_ops> pci_bus_set_ops(Ptr<pci_bus> bus, Ptr<pci_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_write_config_byte(Ptr<pci_bus> bus, @Unsigned int devfn, int pos, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_write_config_dword(Ptr<pci_bus> bus, @Unsigned int devfn, int pos, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_write_config_word(Ptr<pci_bus> bus, @Unsigned int devfn, int pos, @Unsigned short value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_cfg_access_lock(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_cfg_access_trylock(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_cfg_access_unlock(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_claim_resource(Ptr<pci_dev> dev, int resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_clear_and_set_config_dword((const struct pci_dev*)$arg1, $arg2, $arg3, $arg4)")
    public static void pci_clear_and_set_config_dword(Ptr<pci_dev> dev, int pos, @Unsigned int clear, @Unsigned int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_acpi_reset(Ptr<pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_dev_present((const struct pci_device_id*)$arg1)")
    public static int pci_dev_present(Ptr<pci_device_id> ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_set_disconnected(Ptr<pci_dev> dev, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IommuDefinitions.iommu_group> pci_device_group(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_bridge_window(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_sriov(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_do_find_bus(Ptr<pci_bus> bus, char busnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_early_fixup_cyrix_5530(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_resources(Ptr<pci_dev> dev, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_sriov(Ptr<pci_dev> dev, int nr_virtfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epf_add_vepf(Ptr<pci_epf> epf_pf, Ptr<pci_epf> epf_vf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_alloc_space($arg1, $arg2, $arg3, (const struct pci_epc_features*)$arg4, $arg5)")
    public static Ptr<?> pci_epf_alloc_space(Ptr<pci_epf> epf, @Unsigned long size, pci_barno bar, Ptr<pci_epc_features> epc_features, pci_epc_interface_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epf_bind(Ptr<pci_epf> epf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_create((const u8*)$arg1)")
    public static Ptr<pci_epf> pci_epf_create(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_destroy(Ptr<pci_epf> epf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_device_match($arg1, (const struct device_driver*)$arg2)")
    public static int pci_epf_device_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epf_device_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_device_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_free_space(Ptr<pci_epf> epf, Ptr<?> addr2, pci_barno bar, pci_epc_interface_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epf_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_remove_cfs(Ptr<pci_epf_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_remove_vepf(Ptr<pci_epf> epf_pf, Ptr<pci_epf> epf_vf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_unbind(Ptr<pci_epf> epf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_unregister_driver(Ptr<pci_epf_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_find_bus(int domain, int busnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_find_next_bus((const struct pci_bus*)$arg1)")
    public static Ptr<pci_bus> pci_find_next_bus(Ptr<pci_bus> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_amd_ehci_pme(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_amd_fch_xhci_pme(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_i450gx(Ptr<pci_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_i450nx(Ptr<pci_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_latency(Ptr<pci_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_msi_k8t_onboard_sound(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_nforce2(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_piix4_acpi(Ptr<pci_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_transparent_bridge(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_umc_ide(Ptr<pci_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_via_northbridge_bug(Ptr<pci_dev> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_video(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_for_each_dma_alias($arg1, (int (*)(struct pci_dev*, short unsigned int, void*))$arg2, $arg3)")
    public static int pci_for_each_dma_alias(Ptr<pci_dev> pdev, Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_generic_config_read(Ptr<pci_bus> bus, @Unsigned int devfn, int where, int size, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_generic_config_read32(Ptr<pci_bus> bus, @Unsigned int devfn, int where, int size, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_generic_config_write(Ptr<pci_bus> bus, @Unsigned int devfn, int where, int size, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_generic_config_write32(Ptr<pci_bus> bus, @Unsigned int devfn, int where, int size, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_get_base_class(@Unsigned int _class2, Ptr<pci_dev> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_get_class(@Unsigned int _class2, Ptr<pci_dev> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_get_device(@Unsigned int vendor, @Unsigned int device2, Ptr<pci_dev> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_get_domain_bus_and_slot(int domain, @Unsigned int bus, @Unsigned int devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_get_slot(Ptr<pci_bus> bus, @Unsigned int devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_get_subsys(@Unsigned int vendor, @Unsigned int device2, @Unsigned int ss_vendor, @Unsigned int ss_device, Ptr<pci_dev> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> pci_host_bridge_acpi_msi_domain(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_invalid_bar(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_iov_add_virtfn(Ptr<pci_dev> dev, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_iov_bus_range(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_iov_get_pf_drvdata(Ptr<pci_dev> dev, Ptr<pci_driver> pf_driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_iov_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_iov_release(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_iov_remove(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_iov_remove_virtfn(Ptr<pci_dev> dev, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long pci_iov_resource_size(Ptr<pci_dev> dev, int resno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_iov_sysfs_link(Ptr<pci_dev> dev, Ptr<pci_dev> virtfn, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_iov_update_resource(Ptr<pci_dev> dev, int resno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_iov_vf_id(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_iov_virtfn_bus(Ptr<pci_dev> dev, int vf_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_iov_virtfn_devfn(Ptr<pci_dev> dev, int vf_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_msi_register_fwnode_provider((struct fwnode_handle* (*)(struct device*))$arg1)")
    public static void pci_msi_register_fwnode_provider(Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_npem_create(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_npem_init($arg1, (const struct npem_ops*)$arg2, $arg3, $arg4)")
    public static int pci_npem_init(Ptr<pci_dev> dev, Ptr<misc.npem_ops> ops, int pos, @Unsigned int caps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_npem_remove(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_num_vf(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_post_fixup_toshiba_ohci1394(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pre_fixup_toshiba_ohci1394(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pwrctl_unregister(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_read_config_byte((const struct pci_dev*)$arg1, $arg2, $arg3)")
    public static int pci_read_config_byte(Ptr<pci_dev> dev, int where, Ptr<Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_read_config_dword((const struct pci_dev*)$arg1, $arg2, $arg3)")
    public static int pci_read_config_dword(Ptr<pci_dev> dev, int where, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_read_config_word((const struct pci_dev*)$arg1, $arg2, $arg3)")
    public static int pci_read_config_word(Ptr<pci_dev> dev, int where, Ptr<@Unsigned Short> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reassign_resource(Ptr<pci_dev> dev, int resno, @Unsigned @OriginalName(value="resource_size_t") long addsize, @Unsigned @OriginalName(value="resource_size_t") long min_align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_release_resource(Ptr<pci_dev> dev, int resno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_remove_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_remove_bus_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_remove_root_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_resize_resource(Ptr<pci_dev> dev, int resno, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_iov_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_vc_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_save_vc_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_serr_error(char reason, Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_set_acpi_fwnode(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_siemens_interrupt_controller(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_sriov_configure_simple(Ptr<pci_dev> dev, int nr_virtfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_sriov_get_totalvfs(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long pci_sriov_resource_alignment(Ptr<pci_dev> dev, int resno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_sriov_set_totalvfs(Ptr<pci_dev> dev, @Unsigned short numvfs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_std_update_resource(Ptr<pci_dev> dev, int resno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_stop_and_remove_bus_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_stop_and_remove_bus_device_locked(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_stop_bus_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_stop_root_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_update_resource(Ptr<pci_dev> dev, int resno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_user_read_config_byte(Ptr<pci_dev> dev, int pos, Ptr<Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_user_read_config_dword(Ptr<pci_dev> dev, int pos, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_user_read_config_word(Ptr<pci_dev> dev, int pos, Ptr<@Unsigned Short> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_user_write_config_byte(Ptr<pci_dev> dev, int pos, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_user_write_config_dword(Ptr<pci_dev> dev, int pos, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_user_write_config_word(Ptr<pci_dev> dev, int pos, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_vc_do_save_buffer(Ptr<pci_dev> dev, int pos, Ptr<pci_cap_saved_state> save_state, boolean save) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_vc_enable(Ptr<pci_dev> dev, int pos, int res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_vf_drivers_autoprobe(Ptr<pci_dev> dev, boolean auto_probe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_vfs_assigned(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_wait_cfg(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_write_config_byte((const struct pci_dev*)$arg1, $arg2, $arg3)")
    public static int pci_write_config_byte(Ptr<pci_dev> dev, int where, char val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_write_config_dword((const struct pci_dev*)$arg1, $arg2, $arg3)")
    public static int pci_write_config_dword(Ptr<pci_dev> dev, int where, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_write_config_word((const struct pci_dev*)$arg1, $arg2, $arg3)")
    public static int pci_write_config_word(Ptr<pci_dev> dev, int where, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_bridge_assign_resources((const struct pci_dev*)$arg1, $arg2, $arg3)")
    public static void __pci_bridge_assign_resources(Ptr<pci_dev> bridge, Ptr<ListDefinitions.list_head> add_head, Ptr<ListDefinitions.list_head> fail_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_bus_assign_resources((const struct pci_bus*)$arg1, $arg2, $arg3)")
    public static void __pci_bus_assign_resources(Ptr<pci_bus> bus, Ptr<ListDefinitions.list_head> realloc_head, Ptr<ListDefinitions.list_head> fail_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_bus_size_bridges(Ptr<pci_bus> bus, Ptr<ListDefinitions.list_head> realloc_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_mmcfg_init(int early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_register_driver($arg1, $arg2, (const u8*)$arg3)")
    public static int __pci_register_driver(Ptr<pci_driver> drv, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_setup_bridge(Ptr<pci_bus> bus, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_add_dynid(Ptr<pci_driver> drv, @Unsigned int vendor, @Unsigned int device2, @Unsigned int subvendor, @Unsigned int subdevice, @Unsigned int _class2, @Unsigned int class_mask, @Unsigned long driver_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_alloc_irq_vectors(Ptr<pci_dev> dev, @Unsigned int min_vecs, @Unsigned int max_vecs, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_alloc_irq_vectors_affinity(Ptr<pci_dev> dev, @Unsigned int min_vecs, @Unsigned int max_vecs, @Unsigned int flags, Ptr<IrqDefinitions.irq_affinity> affd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_alloc_p2pmem(Ptr<pci_dev> pdev, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_apply_final_quirks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_assign_unassigned_bridge_resources(Ptr<pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_assign_unassigned_bus_resources(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_assign_unassigned_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_assign_unassigned_root_bus_resources(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_brcm_trumanage_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_brcm_trumanage_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bridge_distribute_available_resources(Ptr<pci_dev> bridge, Ptr<ListDefinitions.list_head> add_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_allocate_dev_resources(Ptr<pci_bus> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_allocate_resources(Ptr<pci_bus> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_bus_assign_resources((const struct pci_bus*)$arg1)")
    public static void pci_bus_assign_resources(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_claim_resources(Ptr<pci_bus> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_distribute_available_resources(Ptr<pci_bus> bus, Ptr<ListDefinitions.list_head> add_list, runtime.resource io2, runtime.resource mmio, runtime.resource mmio_pref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_dump_resources(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_get_depth(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int pci_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_num_vf(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_release_bridge_resources(Ptr<pci_bus> bus, @Unsigned long type2, ReleaseDefinitions.release_type rel_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_size_bridges(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_call_probe($arg1, $arg2, (const struct pci_device_id*)$arg3)")
    public static int pci_call_probe(Ptr<pci_driver> drv, Ptr<pci_dev> dev, Ptr<pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pci_cardbus_resource_alignment(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_claim_bridge_resource(Ptr<pci_dev> bridge, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_create_device_link(Ptr<pci_dev> pdev, @Unsigned int consumer, @Unsigned int supplier, @Unsigned int _class2, @Unsigned int class_shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_default_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_default_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_dev_driver((const struct pci_dev*)$arg1)")
    public static Ptr<pci_driver> pci_dev_driver(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_dev_get(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dev_put(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_specific_acs_enabled(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_specific_disable_acs_redir(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_specific_enable_acs(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_specific_reset(Ptr<pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_device_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_device_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_device_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_msi(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_msix(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dma_cleanup(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dma_configure(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_eg20t_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_msi(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_msix_range(Ptr<pci_dev> dev, Ptr<misc.msix_entry> entries, int minvec, int maxvec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_ep_cfs_add_epc_group((const u8*)$arg1)")
    public static Ptr<ConfigDefinitions.config_group> pci_ep_cfs_add_epc_group(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_ep_cfs_add_epf_group((const u8*)$arg1)")
    public static Ptr<ConfigDefinitions.config_group> pci_ep_cfs_add_epf_group(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ep_cfs_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_ep_cfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ep_cfs_remove_epc_group(Ptr<ConfigDefinitions.config_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ep_cfs_remove_epf_group(Ptr<ConfigDefinitions.config_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_epf_link(Ptr<ConfigDefinitions.config_item> epc_item, Ptr<ConfigDefinitions.config_item> epf_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_epf_unlink(Ptr<ConfigDefinitions.config_item> epc_item, Ptr<ConfigDefinitions.config_item> epf_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epc_start_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epc_start_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epc_start_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_baseclass_code_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_baseclass_code_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_baseclass_code_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_cache_line_size_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_cache_line_size_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_cache_line_size_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_cfs_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_deviceid_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_deviceid_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_deviceid_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_drop(Ptr<ConfigDefinitions.config_group> group, Ptr<ConfigDefinitions.config_item> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_interrupt_pin_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_interrupt_pin_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_interrupt_pin_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_make($arg1, (const u8*)$arg2)")
    public static Ptr<ConfigDefinitions.config_group> pci_epf_make(Ptr<ConfigDefinitions.config_group> group, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_msi_interrupts_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_msi_interrupts_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_msi_interrupts_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_msix_interrupts_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_msix_interrupts_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_msix_interrupts_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_progif_code_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_progif_code_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_progif_code_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_release(Ptr<ConfigDefinitions.config_item> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_revid_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_revid_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_revid_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_subclass_code_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_subclass_code_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_subclass_code_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_subsys_id_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_subsys_id_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_subsys_id_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_subsys_vendor_id_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_subsys_vendor_id_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_subsys_vendor_id_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_epf_vendorid_show(Ptr<ConfigDefinitions.config_item> item, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epf_vendorid_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pci_epf_vendorid_store(Ptr<ConfigDefinitions.config_item> item, String page2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epf_vepf_link(Ptr<ConfigDefinitions.config_item> epf_pf_item, Ptr<ConfigDefinitions.config_item> epf_vf_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epf_vepf_unlink(Ptr<ConfigDefinitions.config_item> epf_pf_item, Ptr<ConfigDefinitions.config_item> epf_vf_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_ext_cfg_avail() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_host_bridge> pci_find_host_bridge(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_fintek_f815xxa_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_fintek_f815xxa_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_fintek_f815xxa_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_fintek_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_fintek_rs485_config(Ptr<UartDefinitions.uart_port> port2, Ptr<runtime.ktermios> termios3, Ptr<SerialDefinitions.serial_rs485> rs485) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_fintek_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_fintek_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_d3cold_delay_1sec(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_device(pci_fixup_pass pass, Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_no_d0_pme(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_no_msi_no_pme(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_pericom_acs_store_forward(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_free_irq_vectors(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_free_p2pmem(Ptr<pci_dev> pdev, Ptr<?> addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> pci_get_host_bridge_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_has_legacy_pm_support(Ptr<pci_dev> pci_dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_has_p2pmem(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_hp_diva_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_hp_diva_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_hp_diva_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_idt_bus_quirk(Ptr<pci_bus> bus, int devfn, Ptr<@Unsigned Integer> l, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_inteli960ni_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_iounmap(Ptr<pci_dev> dev, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cpumask*)pci_irq_get_affinity($arg1, $arg2))")
    public static Ptr<runtime.cpumask> pci_irq_get_affinity(Ptr<pci_dev> dev, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_irq_vector(Ptr<pci_dev> dev, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ite887x_exit(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_ite887x_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_legacy_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_legacy_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_legacy_suspend(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_mask_replay_timer_timeout(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct pci_device_id*)pci_match_device($arg1, $arg2))")
    public static Ptr<pci_device_id> pci_match_device(Ptr<pci_driver> drv, Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct pci_device_id*)pci_match_id((const struct pci_device_id*)$arg1, $arg2))")
    public static Ptr<pci_device_id> pci_match_id(Ptr<pci_device_id> ids, Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pci_mmcfg_amd_fam10h())")
    public static String pci_mmcfg_amd_fam10h() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pci_mmcfg_e7520())")
    public static String pci_mmcfg_e7520() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_mmcfg_early_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_mmcfg_for_each_region((int (*)(long long unsigned int, long long unsigned int, void*))$arg1, $arg2)")
    public static int pci_mmcfg_for_each_region(Ptr<?> func, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pci_mmcfg_intel_945())")
    public static String pci_mmcfg_intel_945() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_mmcfg_late_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmcfg_late_insert_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pci_mmcfg_nvidia_mcp55())")
    public static String pci_mmcfg_nvidia_mcp55() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_mmcfg_reserved(Ptr<runtime.device> dev, Ptr<pci_mmcfg_region> cfg, int early) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_mmcfg_region> pci_mmconfig_add(int segment, int start, int end, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_mmcfg_region> pci_mmconfig_alloc(int segment, int start, int end, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmconfig_delete(@Unsigned short seg, char start, char end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmconfig_insert(Ptr<runtime.device> dev, @Unsigned short seg, char start, char end, @Unsigned @OriginalName(value="phys_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_mmcfg_region> pci_mmconfig_lookup(int segment, int bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_moxa_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_moxa_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_moxa_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_msi_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_msix_alloc_irq_at($arg1, $arg2, (const struct irq_affinity_desc*)$arg3)")
    public static MsiDefinitions.msi_map pci_msix_alloc_irq_at(Ptr<pci_dev> dev, @Unsigned int index2, Ptr<IrqDefinitions.irq_affinity_desc> affdesc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_msix_can_alloc_dyn(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msix_free_irq(Ptr<pci_dev> dev, MsiDefinitions.msi_map map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_msix_vec_count(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_netmos_9900_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_netmos_9900_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_netmos_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ni8420_exit(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_ni8420_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ni8430_exit(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_ni8430_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_ni8430_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_ni8430_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_omegapci_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_omegapci_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pci_oxsemi_tornado_get_divisor(Ptr<UartDefinitions.uart_port> port2, @Unsigned int baud, Ptr<@Unsigned Integer> frac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_oxsemi_tornado_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_oxsemi_tornado_set_divisor(Ptr<UartDefinitions.uart_port> port2, @Unsigned int baud, @Unsigned int quot, @Unsigned int quot_frac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_oxsemi_tornado_set_mctrl(Ptr<UartDefinitions.uart_port> port2, @Unsigned int mctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_oxsemi_tornado_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_oxsemi_tornado_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> up, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_p2pdma_add_resource(Ptr<pci_dev> pdev, int bar, @Unsigned long size, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_p2pdma_distance_many(Ptr<pci_dev> provider, Ptr<Ptr<runtime.device>> clients, int num_clients, boolean verbose) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_p2pdma_enable_show(String page2, Ptr<pci_dev> p2p_dev, boolean use_p2pdma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_p2pdma_enable_store((const u8*)$arg1, $arg2, $arg3)")
    public static int pci_p2pdma_enable_store(String page2, Ptr<Ptr<pci_dev>> p2p_dev, Ptr<@OriginalName(value="bool") Boolean> use_p2pdma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static pci_p2pdma_map_type pci_p2pdma_map_segment(Ptr<pci_p2pdma_map_state> state2, Ptr<runtime.device> dev, Ptr<runtime.scatterlist> sg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_p2pdma_release(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_p2pdma_unmap_mappings(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.scatterlist> pci_p2pmem_alloc_sgl(Ptr<pci_dev> pdev, Ptr<@Unsigned Integer> nents, @Unsigned int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_p2pmem_find_many(Ptr<Ptr<runtime.device>> clients, int num_clients) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_p2pmem_free_sgl(Ptr<pci_dev> pdev, Ptr<runtime.scatterlist> sgl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_p2pmem_publish(Ptr<pci_dev> pdev, boolean publish) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pci_bus_addr_t") long pci_p2pmem_virt_to_bus(Ptr<pci_dev> pdev, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_parse_mcfg(Ptr<AcpiDefinitions.acpi_table_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_plx9050_exit(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_plx9050_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pm_complete(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_freeze_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_poweroff_late(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_poweroff_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_prepare(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_restore_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_resume_early(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_runtime_get_sync(Ptr<pci_dev> pdev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_runtime_idle(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_runtime_put(Ptr<pci_dev> pdev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_suspend_late(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_suspend_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_thaw(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_thaw_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_primary_epc_epf_link(Ptr<ConfigDefinitions.config_item> epf_item, Ptr<ConfigDefinitions.config_item> epc_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_primary_epc_epf_unlink(Ptr<ConfigDefinitions.config_item> epc_item, Ptr<ConfigDefinitions.config_item> epf_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_proc_attach_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_proc_detach_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_proc_detach_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_put_host_bridge_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quatech_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_quatech_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_quatech_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_al_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_amd_sb_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_brcm_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_cavium_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_disable_intel_spt_pch_acs_redir(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_enable_intel_pch_acs(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_enable_intel_spt_pch_acs(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_intel_pch_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_intel_spt_pch_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_quirk_intel_spt_pch_acs_match(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_mf_endpoint_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_quirk_nvidia_tegra_disable_rp_msi(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_nxp_rp_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_qcom_rp_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_rciep_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_wangxun_nic_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_xgene_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_quirk_zhaoxin_pcie_ports_acs(Ptr<pci_dev> dev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_rcec_exit(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_rcec_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_read(Ptr<pci_bus> bus, @Unsigned int devfn, int where, int size, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_real_dma_dev(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_realloc_get_opt(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reassign_bridge_resources(Ptr<pci_dev> bridge, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_msi_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_root_bus_distribute_available_resources(Ptr<pci_bus> bus, Ptr<ListDefinitions.list_head> add_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_secondary_epc_epf_link(Ptr<ConfigDefinitions.config_item> epf_item, Ptr<ConfigDefinitions.config_item> epc_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_secondary_epc_epf_unlink(Ptr<ConfigDefinitions.config_item> epc_item, Ptr<ConfigDefinitions.config_item> epf_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_seq_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_seq_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_seq_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_set_host_bridge_release($arg1, (void (*)(struct pci_host_bridge*))$arg2, $arg3)")
    public static void pci_set_host_bridge_release(Ptr<pci_host_bridge> bridge, Ptr<?> release_fn, Ptr<?> release_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_setup_bridge(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_setup_bridge_io(Ptr<pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_setup_bridge_mmio(Ptr<pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_setup_bridge_mmio_pref(Ptr<pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_setup_cardbus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_siig_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_siig_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_siig_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_subsys_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_sunix_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_sunix_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_timedia_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_timedia_probe(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_timedia_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_timedia_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_uevent((const struct device*)$arg1, $arg2)")
    public static int pci_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_uevent_ers(Ptr<pci_dev> pdev, pci_ers_result err_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_unregister_driver(Ptr<pci_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_wch_ch353_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_wch_ch353_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_wch_ch355_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_wch_ch355_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_wch_ch38x_exit(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_wch_ch38x_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_wch_ch38x_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int pci_wch_ch38x_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_write(Ptr<pci_bus> bus, @Unsigned int devfn, int where, int size, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_xircom_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_enable_ptm(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_read_base(Ptr<pci_dev> dev, pci_bar_type type2, Ptr<runtime.resource> res, @Unsigned int pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_crs_quirks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_acpi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_acpi_root_init_info(Ptr<AcpiDefinitions.acpi_pci_root_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_acpi_root_prepare_resources(Ptr<AcpiDefinitions.acpi_pci_root_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acpi_root_release_info(Ptr<AcpiDefinitions.acpi_pci_root_info> ci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_acpi_scan_root(Ptr<AcpiDefinitions.acpi_pci_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_add_new_bus(Ptr<pci_bus> parent, Ptr<pci_dev> dev, int busnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_aer_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_aer_clear_fatal_status(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_aer_clear_nonfatal_status(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_aer_clear_status(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_aer_exit(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_aer_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_aer_raw_clear_status(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_alloc_bus(Ptr<pci_bus> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_alloc_child_bus(Ptr<pci_bus> parent, Ptr<pci_dev> bridge, int busnr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_alloc_dev(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_host_bridge> pci_alloc_host_bridge(@Unsigned long priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_assign_irq(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ats_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_ats_page_aligned(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_ats_queue_depth(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_ats_supported(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_bus_generic_read_dev_vendor_id(Ptr<pci_bus> bus, int devfn, Ptr<@Unsigned Integer> l, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_insert_busn_res(Ptr<pci_bus> b, int bus, int bus_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_bus_read_dev_vendor_id(Ptr<pci_bus> bus, int devfn, Ptr<@Unsigned Integer> l, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_release_busn_res(Ptr<pci_bus> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_update_busn_res_end(Ptr<pci_bus> b, int bus_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_cfg_space_size(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_cfg_space_size_ext(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_check_and_mask_intx(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_check_and_set_intx_mask(Ptr<pci_dev> dev, boolean mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_check_and_unmask_intx(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_check_type1() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_check_type2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char pci_common_swizzle(Ptr<pci_dev> dev, Ptr<Character> pinp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_conf1_read(@Unsigned int seg, @Unsigned int bus, @Unsigned int devfn, int reg, int len, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_conf1_write(@Unsigned int seg, @Unsigned int bus, @Unsigned int devfn, int reg, int len, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_conf2_read(@Unsigned int seg, @Unsigned int bus, @Unsigned int devfn, int reg, int len, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_conf2_write(@Unsigned int seg, @Unsigned int bus, @Unsigned int devfn, int reg, int len, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_configure_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_configure_extended_tags(Ptr<pci_dev> dev, Ptr<?> ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_configure_mps(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_create_root_bus(Ptr<runtime.device> parent, int bus, Ptr<pci_ops> ops, Ptr<?> sysdata, Ptr<ListDefinitions.list_head> resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_create_slot($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<pci_slot> pci_create_slot(Ptr<pci_bus> parent, int slot_nr, String name, Ptr<misc.hotplug_slot> hotplug) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_destroy_slot(Ptr<pci_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dev_assign_slot(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_device_add(Ptr<pci_dev> dev, Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_device_domain_set_desc(Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2, Ptr<MsiDefinitions.msi_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_direct_init(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_direct_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_ats(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_pasid(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_pri(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_ptm(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_rom(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pci_early_find_cap(int bus, int slot2, int func, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_eisa_init_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_ats(Ptr<pci_dev> dev, int ps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_pasid(Ptr<pci_dev> pdev, int features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_pri(Ptr<pci_dev> pdev, @Unsigned int reqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_ptm(Ptr<pci_dev> dev, Ptr<Character> granularity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_rom(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_epc_mem_alloc_addr(Ptr<pci_epc> epc, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> phys_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_mem_exit(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_mem_free_addr(Ptr<pci_epc> epc, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, Ptr<?> virt_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_mem_init(Ptr<pci_epc> epc, @Unsigned @OriginalName(value="phys_addr_t") long base, @Unsigned long size, @Unsigned long page_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_multi_mem_init(Ptr<pci_epc> epc, Ptr<pci_epc_mem_window> windows, @Unsigned int num_windows) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_free_host_bridge(Ptr<pci_host_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_free_irq(Ptr<pci_dev> dev, @Unsigned int nr, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_get_interrupt_pin(Ptr<pci_dev> dev, Ptr<Ptr<pci_dev>> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_host_probe(Ptr<pci_host_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_hp_add_bridge(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_hp_create_module_link(Ptr<pci_slot> pci_slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_hp_remove_module_link(Ptr<pci_slot> pci_slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ioapic_remove(Ptr<AcpiDefinitions.acpi_pci_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_iomap(Ptr<pci_dev> dev, int bar, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_iomap_range(Ptr<pci_dev> dev, int bar, @Unsigned long offset, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_iomap_wc(Ptr<pci_dev> dev, int bar, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_iomap_wc_range(Ptr<pci_dev> dev, int bar, @Unsigned long offset, @Unsigned long maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_irq_mask_msi(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_irq_mask_msix(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_irq_unmask_msi(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_irq_unmask_msix(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_lock_rescan_remove() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_map_rom(Ptr<pci_dev> pdev, Ptr<@Unsigned Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_max_pasids(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmap_fits(Ptr<pci_dev> pdev, int resno, Ptr<VmDefinitions.vm_area_struct> vma, pci_mmap_api mmap_api) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmap_resource_range(Ptr<pci_dev> pdev, int bar, Ptr<VmDefinitions.vm_area_struct> vma, pci_mmap_state mmap_state, int write_combine) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_mmcfg_arch_free() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmcfg_arch_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmcfg_arch_map(Ptr<pci_mmcfg_region> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_mmcfg_arch_unmap(Ptr<pci_mmcfg_region> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmcfg_read(@Unsigned int seg, @Unsigned int bus, @Unsigned int devfn, int reg, int len, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmcfg_read_numachip(@Unsigned int seg, @Unsigned int bus, @Unsigned int devfn, int reg, int len, Ptr<@Unsigned Integer> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmcfg_write(@Unsigned int seg, @Unsigned int bus, @Unsigned int devfn, int reg, int len, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmcfg_write_numachip(@Unsigned int seg, @Unsigned int bus, @Unsigned int devfn, int reg, int len, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> pci_msi_create_irq_domain(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<MsiDefinitions.msi_domain_info> info2, Ptr<IrqDefinitions.irq_domain> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pci_msi_domain_get_msi_rid(Ptr<IrqDefinitions.irq_domain> domain, Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_domain_set_desc(Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2, Ptr<MsiDefinitions.msi_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_msi_domain_supports(Ptr<pci_dev> pdev, @Unsigned int feature_mask, misc.support_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_domain_write_msg(Ptr<IrqDefinitions.irq_data> irq_data2, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> pci_msi_get_device_domain(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_msi_setup_msi_irqs(Ptr<pci_dev> dev, int nvec, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_teardown_msi_irqs(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msix_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msix_prepare_desc(Ptr<IrqDefinitions.irq_domain> domain, Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2, Ptr<MsiDefinitions.msi_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_no_aer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_notify(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_numachip_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pasid_features(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pasid_init(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_prepare_ats(Ptr<pci_dev> dev, int ps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_prg_resp_pasid_required(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pri_init(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_pri_supported(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_print_aer(Ptr<pci_dev> dev, int aer_severity, Ptr<AerDefinitions.aer_capability_regs> aer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ptm_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_read_bases(Ptr<pci_dev> dev, @Unsigned int howmany, int rom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_read_bridge_bases(Ptr<pci_bus> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_read_bridge_io(Ptr<pci_dev> dev, Ptr<runtime.resource> res, boolean log) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_read_bridge_mmio(Ptr<pci_dev> dev, Ptr<runtime.resource> res, boolean log) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_read_bridge_mmio_pref(Ptr<pci_dev> dev, Ptr<runtime.resource> res, boolean log) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_read_bridge_windows(Ptr<pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_read_irq(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_register_host_bridge(Ptr<pci_host_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_release_dev(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_release_host_bridge_dev(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_request_irq($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, $arg7_)")
    public static int pci_request_irq(Ptr<pci_dev> dev, @Unsigned int nr, @OriginalName(value="irq_handler_t") Ptr<?> handler, @OriginalName(value="irq_handler_t") Ptr<?> thread_fn, Ptr<?> dev_id, String fmt, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pci_rescan_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pci_rescan_bus_bridge_resize(Ptr<pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reset_pri(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_aer_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_ats_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_pasid_state(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_pri_state(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_ptm_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_resume_ptm(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_sanity_check((const struct pci_raw_ops*)$arg1)")
    public static int pci_sanity_check(Ptr<pci_raw_ops> o) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_save_aer_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_save_ptm_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_scan_bridge(Ptr<pci_bus> bus, Ptr<pci_dev> dev, int max, int pass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_scan_bridge_extend(Ptr<pci_bus> bus, Ptr<pci_dev> dev, int max, @Unsigned int available_buses, int pass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_scan_bus(int bus, Ptr<pci_ops> ops, Ptr<?> sysdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pci_scan_child_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pci_scan_child_bus_extend(Ptr<pci_bus> bus, @Unsigned int available_buses) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_scan_root_bus(Ptr<runtime.device> parent, int bus, Ptr<pci_ops> ops, Ptr<?> sysdata, Ptr<ListDefinitions.list_head> resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_scan_root_bus_bridge(Ptr<pci_host_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_scan_single_device(Ptr<pci_bus> bus, int devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_scan_slot(Ptr<pci_bus> bus, int devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_set_bus_msi_domain(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_set_bus_speed(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_setup_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_setup_msi_device_domain(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_setup_msix_device_domain(Ptr<pci_dev> pdev, @Unsigned int hwsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_slot_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_slot_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long pci_slot_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_slot_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_slot_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_sort_bf_cmp((const struct device*)$arg1, (const struct device*)$arg2)")
    public static int pci_sort_bf_cmp(Ptr<runtime.device> d_a, Ptr<runtime.device> d_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_sort_breadthfirst() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pci_speed_string($arg1))")
    public static String pci_speed_string(pci_bus_speed speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_suspend_ptm(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_swizzle_interrupt_pin((const struct pci_dev*)$arg1, $arg2)")
    public static char pci_swizzle_interrupt_pin(Ptr<pci_dev> dev, char pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_test_config_bits($arg1, (const struct pci_bits*)$arg2)")
    public static int pci_test_config_bits(Ptr<pci_dev> pdev, Ptr<pci_bits> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_unlock_rescan_remove() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_unmap_rom(Ptr<pci_dev> pdev, Ptr<?> rom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_dev> pci_upstream_ptm(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_config_acs($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void __pci_config_acs(Ptr<pci_dev> dev, Ptr<pci_acs> caps, String p, @Unsigned short mask, @Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_dev_set_current_state(Ptr<pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_disable_link_state(Ptr<pci_dev> pdev, int state2, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_enable_link_state(Ptr<pci_dev> pdev, int state2, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_enable_msi_range(Ptr<pci_dev> dev, int minvec, int maxvec, Ptr<IrqDefinitions.irq_affinity> affd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_enable_msix_range(Ptr<pci_dev> dev, Ptr<misc.msix_entry> entries, int minvec, int maxvec, Ptr<IrqDefinitions.irq_affinity> affd, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_enable_wake(Ptr<pci_dev> dev, @OriginalName(value="pci_power_t") int state2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_epc_create($arg1, (const struct pci_epc_ops*)$arg2, $arg3)")
    public static Ptr<pci_epc> __pci_epc_create(Ptr<runtime.device> dev, Ptr<pci_epc_ops> ops, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char __pci_find_next_cap_ttl(Ptr<pci_bus> bus, @Unsigned int devfn, char pos, int cap, Ptr<Integer> ttl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char __pci_find_next_ht_cap(Ptr<pci_dev> dev, char pos, int ht_cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_hp_initialize($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, (const u8*)$arg6)")
    public static int __pci_hp_initialize(Ptr<misc.hotplug_slot> slot2, Ptr<pci_bus> bus, int devnr, String name, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_hp_register($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, (const u8*)$arg6)")
    public static int __pci_hp_register(Ptr<misc.hotplug_slot> slot2, Ptr<pci_bus> bus, int devnr, String name, Ptr<runtime.module> owner, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_pme_active(Ptr<pci_dev> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_read_msi_msg(Ptr<MsiDefinitions.msi_desc> entry, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long __pci_read_vpd(Ptr<pci_dev> dev, @OriginalName(value="loff_t") long pos, @Unsigned long count, Ptr<?> buf, boolean check_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_request_region($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int __pci_request_region(Ptr<pci_dev> pdev, int bar, String res_name, int exclusive) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_request_selected_regions($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int __pci_request_selected_regions(Ptr<pci_dev> pdev, int bars, String res_name, int excl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_reset_function_locked(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_reset_slot(Ptr<pci_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_restore_msi_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_restore_msix_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_set_master(Ptr<pci_dev> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pci_set_power_state(Ptr<pci_dev> dev, @OriginalName(value="pci_power_t") int state2, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_walk_bus($arg1, (int (*)(struct pci_dev*, void*))$arg2, $arg3, $arg4)")
    public static void __pci_walk_bus(Ptr<pci_bus> top, Ptr<?> cb, Ptr<?> userdata, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pci_write_msi_msg(Ptr<MsiDefinitions.msi_desc> entry, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__pci_write_vpd($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long __pci_write_vpd(Ptr<pci_dev> dev, @OriginalName(value="loff_t") long pos, @Unsigned long count, Ptr<?> buf, boolean check_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _pci_add_cap_save_buffer(Ptr<pci_dev> dev, @Unsigned short cap, boolean extended, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_acs_enabled(Ptr<pci_dev> pdev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_acs_flags_enabled(Ptr<pci_dev> pdev, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_acs_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_acs_path_enabled(Ptr<pci_dev> start, Ptr<pci_dev> end, @Unsigned short acs_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_add_cap_save_buffer(Ptr<pci_dev> dev, char cap, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_add_dma_alias(Ptr<pci_dev> dev, char devfn_from, @Unsigned int nr_devfns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_add_ext_cap_save_buffer(Ptr<pci_dev> dev, @Unsigned short cap, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_add_resource(Ptr<ListDefinitions.list_head> resources, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_add_resource_offset(Ptr<ListDefinitions.list_head> resources, Ptr<runtime.resource> res, @Unsigned @OriginalName(value="resource_size_t") long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pci_address_to_pio(@Unsigned @OriginalName(value="phys_addr_t") long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_af_flr(Ptr<pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_allocate_cap_save_buffers(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_arch_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_ats_disabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_back_from_sleep(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pci_biosrom_size(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pci_bridge_attrs_are_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_bridge_d3_possible(Ptr<pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bridge_d3_update(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bridge_reconfigure_ltr(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bridge_secondary_bus_reset(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bridge_wait_for_secondary_bus(Ptr<pci_dev> dev, String reset_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_add_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_bus_add_devices((const struct pci_bus*)$arg1)")
    public static void pci_bus_add_devices(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_add_resource(Ptr<pci_bus> bus, Ptr<runtime.resource> res, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_alloc_from_region(Ptr<pci_bus> bus, Ptr<runtime.resource> res, @Unsigned @OriginalName(value="resource_size_t") long size, @Unsigned @OriginalName(value="resource_size_t") long align, @Unsigned @OriginalName(value="resource_size_t") long min, @Unsigned long type_mask, @OriginalName(value="resource_alignf") Ptr<?> alignf, Ptr<?> alignf_data, Ptr<pci_bus_region> region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_alloc_resource(Ptr<pci_bus> bus, Ptr<runtime.resource> res, @Unsigned @OriginalName(value="resource_size_t") long size, @Unsigned @OriginalName(value="resource_size_t") long align, @Unsigned @OriginalName(value="resource_size_t") long min, @Unsigned long type_mask, @OriginalName(value="resource_alignf") Ptr<?> alignf, Ptr<?> alignf_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_bus_clip_resource(Ptr<pci_dev> dev, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_error_reset(Ptr<pci_dev> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char pci_bus_find_capability(Ptr<pci_bus> bus, @Unsigned int devfn, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_bus> pci_bus_get(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_lock(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char pci_bus_max_busnr(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_put(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_remove_resource(Ptr<pci_bus> bus, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_remove_resources(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_bus_resettable(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_bus_resource_n((const struct pci_bus*)$arg1, $arg2)")
    public static Ptr<runtime.resource> pci_bus_resource_n(Ptr<pci_bus> bus, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_restore_locked(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_save_and_disable_locked(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_set_current_state(Ptr<pci_bus> bus, @OriginalName(value="pci_power_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_bus_trylock(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_bus_unlock(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_check_pme_status(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pci_power_t") int pci_choose_state(Ptr<pci_dev> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_clear_master(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_clear_mwi(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_config_pm_runtime_get(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_config_pm_runtime_put(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_configure_ari(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_configure_aspm_l1ss(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_configure_ltr(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_create_attr(Ptr<pci_dev> pdev, int num, int write_combine) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_create_resource_files(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_create_sysfs_dev_files(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_d3cold_disable(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_d3cold_enable(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dev_adjust_pme(Ptr<pci_dev> pci_dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pci_dev_attrs_are_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_check_d3cold(Ptr<pci_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dev_complete_resume(Ptr<pci_dev> pci_dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pci_dev_config_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_dev_has_default_msi_parent_domain(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pci_dev_hp_attrs_are_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dev_lock(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_dev_need_resume(Ptr<pci_dev> pci_dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pci_dev_reset_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pci_dev_reset_method_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dev_restore(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short pci_dev_rom_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_dev_run_wake(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dev_save_and_disable(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_dev_str_match($arg1, (const u8*)$arg2, (const u8**)$arg3)")
    public static int pci_dev_str_match(Ptr<pci_dev> dev, String p, Ptr<String> endptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_dev_str_match_path($arg1, (const u8*)$arg2, (const u8**)$arg3)")
    public static int pci_dev_str_match_path(Ptr<pci_dev> dev, String path2, Ptr<String> endptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_trylock(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dev_unlock(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_dev_wait(Ptr<pci_dev> dev, String reset_type, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_device_is_present(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_devs_are_dma_aliases(Ptr<pci_dev> dev1, Ptr<pci_dev> dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_enabled_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_disable_link_state(Ptr<pci_dev> pdev, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_disable_link_state_locked(Ptr<pci_dev> pdev, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_disable_parity(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_doe($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static int pci_doe(Ptr<pci_doe_mb> doe_mb, @Unsigned short vendor, char type2, Ptr<?> request2, @Unsigned long request_sz, Ptr<?> response, @Unsigned long response_sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_doe_abort(Ptr<pci_doe_mb> doe_mb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_doe_cache_protocols(Ptr<pci_doe_mb> doe_mb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_doe_cancel_tasks(Ptr<pci_doe_mb> doe_mb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_doe_mb> pci_doe_create_mb(Ptr<pci_dev> pdev, @Unsigned short cap_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_doe_destroy(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_doe_destroy_mb(Ptr<pci_doe_mb> doe_mb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_doe_disconnected(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_doe_init(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_doe_recv_resp(Ptr<pci_doe_mb> doe_mb, Ptr<pci_doe_task> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_doe_send_req(Ptr<pci_doe_mb> doe_mb, Ptr<pci_doe_task> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_doe_supports_prot(Ptr<pci_doe_mb> doe_mb, @Unsigned short vid, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_doe_task_complete(Ptr<pci_doe_task> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_doe_wait(Ptr<pci_doe_mb> doe_mb, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_dpc_init(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_dpc_recovered(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ea_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_ea_read(Ptr<pci_dev> dev, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_enable_acs(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_atomic_ops_to_root(Ptr<pci_dev> dev, @Unsigned int cap_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_enable_bridge(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_device_flags(Ptr<pci_dev> dev, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_device_mem(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_link_state(Ptr<pci_dev> pdev, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_link_state_locked(Ptr<pci_dev> pdev, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_enable_wake(Ptr<pci_dev> pci_dev2, @OriginalName(value="pci_power_t") int state2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_add_epf(Ptr<pci_epc> epc, Ptr<pci_epf> epf, pci_epc_interface_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_bus_master_enable_notify(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_clear_bar(Ptr<pci_epc> epc, char func_no, char vfunc_no, Ptr<pci_epf_bar> epf_bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_deinit_notify(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_destroy(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epc_get((const u8*)$arg1)")
    public static Ptr<pci_epc> pci_epc_get(String epc_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct pci_epc_features*)pci_epc_get_features($arg1, $arg2, $arg3))")
    public static Ptr<pci_epc_features> pci_epc_get_features(Ptr<pci_epc> epc, char func_no, char vfunc_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epc_get_first_free_bar((const struct pci_epc_features*)$arg1)")
    public static pci_barno pci_epc_get_first_free_bar(Ptr<pci_epc_features> epc_features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_get_msi(Ptr<pci_epc> epc, char func_no, char vfunc_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_get_msix(Ptr<pci_epc> epc, char func_no, char vfunc_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_epc_get_next_free_bar((const struct pci_epc_features*)$arg1, $arg2)")
    public static pci_barno pci_epc_get_next_free_bar(Ptr<pci_epc_features> epc_features, pci_barno bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_init_notify(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_linkdown(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_linkup(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_map_addr(Ptr<pci_epc> epc, char func_no, char vfunc_no, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, @Unsigned long pci_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_map_msi_irq(Ptr<pci_epc> epc, char func_no, char vfunc_no, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr, char interrupt_num, @Unsigned int entry_size, Ptr<@Unsigned Integer> msi_data, Ptr<@Unsigned Integer> msi_addr_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_notify_pending_init(Ptr<pci_epc> epc, Ptr<pci_epf> epf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_put(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_raise_irq(Ptr<pci_epc> epc, char func_no, char vfunc_no, @Unsigned int type2, @Unsigned short interrupt_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_remove_epf(Ptr<pci_epc> epc, Ptr<pci_epf> epf, pci_epc_interface_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_set_bar(Ptr<pci_epc> epc, char func_no, char vfunc_no, Ptr<pci_epf_bar> epf_bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_set_msi(Ptr<pci_epc> epc, char func_no, char vfunc_no, char interrupts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_set_msix(Ptr<pci_epc> epc, char func_no, char vfunc_no, @Unsigned short interrupts, pci_barno bir, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_start(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_stop(Ptr<pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_epc_unmap_addr(Ptr<pci_epc> epc, char func_no, char vfunc_no, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_epc_write_header(Ptr<pci_epc> epc, char func_no, char vfunc_no, Ptr<pci_epf_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char pci_find_capability(Ptr<pci_dev> dev, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_doe_mb> pci_find_doe_mailbox(Ptr<pci_dev> pdev, @Unsigned short vendor, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short pci_find_dvsec_capability(Ptr<pci_dev> dev, @Unsigned short vendor, @Unsigned short dvsec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short pci_find_ext_capability(Ptr<pci_dev> dev, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char pci_find_ht_capability(Ptr<pci_dev> dev, int ht_cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char pci_find_next_capability(Ptr<pci_dev> dev, char pos, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short pci_find_next_ext_capability(Ptr<pci_dev> dev, @Unsigned short start, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char pci_find_next_ht_capability(Ptr<pci_dev> dev, char pos, int ht_cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_find_parent_resource((const struct pci_dev*)$arg1, $arg2)")
    public static Ptr<runtime.resource> pci_find_parent_resource(Ptr<pci_dev> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> pci_find_resource(Ptr<pci_dev> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_cap_saved_state> pci_find_saved_cap(Ptr<pci_dev> dev, char cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_cap_saved_state> pci_find_saved_ext_cap(Ptr<pci_dev> dev, @Unsigned short cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short pci_find_vsec_capability(Ptr<pci_dev> dev, @Unsigned short vendor, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_finish_runtime_suspend(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_fixup_cardbus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_free_cap_save_buffers(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_free_msi_irqs(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_free_resource_list(Ptr<ListDefinitions.list_head> resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pci_get_dsn(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_hotplug_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_hp_add(Ptr<misc.hotplug_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_hp_del(Ptr<misc.hotplug_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_hp_deregister(Ptr<misc.hotplug_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_hp_destroy(Ptr<misc.hotplug_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_ignore_hotplug(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_init_reset_methods(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_intx(Ptr<pci_dev> pdev, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_iommu_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_iommu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_ioremap_bar(Ptr<pci_dev> pdev, int bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_ioremap_wc_bar(Ptr<pci_dev> pdev, int bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long pci_llseek_resource(Ptr<runtime.file> filep, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, @OriginalName(value="loff_t") long offset, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_load_and_free_saved_state(Ptr<pci_dev> dev, Ptr<Ptr<pci_saved_state>> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_load_saved_state(Ptr<pci_dev> dev, Ptr<pci_saved_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_map_biosrom(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmap_resource_uc(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_mmap_resource_wc(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_mask_irq(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_msi_prepare(Ptr<IrqDefinitions.irq_domain> domain, Ptr<runtime.device> dev, int nvec, Ptr<@OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_set_enable(Ptr<pci_dev> dev, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_shutdown(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_unmask_irq(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msi_update_mask(Ptr<MsiDefinitions.msi_desc> desc, @Unsigned int clear, @Unsigned int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_msi_vec_count(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_msix_shutdown(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_no_msi() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pasid_table_setup(Ptr<pci_dev> pdev, @Unsigned short alias, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pasid_table_teardown(Ptr<pci_dev> pdev, @Unsigned short alias, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long pci_pio_to_address(@Unsigned long pio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_platform_power_transition(Ptr<pci_dev> dev, @OriginalName(value="pci_power_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pm_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pm_reset(Ptr<pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pme_active(Ptr<pci_dev> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_pme_capable(Ptr<pci_dev> dev, @OriginalName(value="pci_power_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pme_list_scan(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pme_restore(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_pme_wakeup(Ptr<pci_dev> dev, Ptr<?> pme_poll_reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_pme_wakeup_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_power_up(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_pr3_present(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_prepare_to_sleep(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_probe_reset_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_probe_reset_slot(Ptr<pci_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_read_config(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_read_resource_io(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_read_rom(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_read_vpd(Ptr<pci_dev> dev, @OriginalName(value="loff_t") long pos, @Unsigned long count, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_read_vpd_any(Ptr<pci_dev> dev, @OriginalName(value="loff_t") long pos, @Unsigned long count, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_realloc_setup_params() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_reassigndev_resource_alignment(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_rebar_find_pos(Ptr<pci_dev> pdev, int bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_rebar_get_current_size(Ptr<pci_dev> pdev, int bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pci_rebar_get_possible_sizes(Ptr<pci_dev> pdev, int bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_rebar_set_size(Ptr<pci_dev> pdev, int bar, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reenable_device(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_refresh_power_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_register_io_range(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, @Unsigned @OriginalName(value="phys_addr_t") long addr2, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_register_set_vga_state(@OriginalName(value="arch_set_vga_state_t") Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_release_region(Ptr<pci_dev> pdev, int bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_release_regions(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_release_selected_regions(Ptr<pci_dev> pdev, int bars) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_remap_iospace((const struct resource*)$arg1, $arg2)")
    public static int pci_remap_iospace(Ptr<runtime.resource> res, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_remove_resource_files(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_remove_sysfs_dev_files(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_request_acs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_request_region($arg1, $arg2, (const u8*)$arg3)")
    public static int pci_request_region(Ptr<pci_dev> pdev, int bar, String res_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_request_regions($arg1, (const u8*)$arg2)")
    public static int pci_request_regions(Ptr<pci_dev> pdev, String res_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_request_regions_exclusive($arg1, (const u8*)$arg2)")
    public static int pci_request_regions_exclusive(Ptr<pci_dev> pdev, String res_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_request_selected_regions($arg1, $arg2, (const u8*)$arg3)")
    public static int pci_request_selected_regions(Ptr<pci_dev> pdev, int bars, String res_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_request_selected_regions_exclusive($arg1, $arg2, (const u8*)$arg3)")
    public static int pci_request_selected_regions_exclusive(Ptr<pci_dev> pdev, int bars, String res_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reset_bus(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reset_bus_function(Ptr<pci_dev> dev, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reset_function(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reset_function_locked(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_reset_hotplug_slot(Ptr<misc.hotplug_slot> hotplug, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_reset_secondary_bus(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_reset_supported(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_resource_alignment_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pci_resource_name($arg1, $arg2))")
    public static String pci_resource_name(Ptr<pci_dev> dev, @Unsigned int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_resource_to_user((const struct pci_dev*)$arg1, $arg2, (const struct resource*)$arg3, $arg4, $arg5)")
    public static void pci_resource_to_user(Ptr<pci_dev> dev, int bar, Ptr<runtime.resource> rsrc, Ptr<@Unsigned @OriginalName(value="resource_size_t") Long> start, Ptr<@Unsigned @OriginalName(value="resource_size_t") Long> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_aspm_l1ss_state(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_config_space_range(Ptr<pci_dev> pdev, int start, int end, int retry, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_dpc_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_ltr_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_rebar_state(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_restore_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_resume_bus(Ptr<pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_resume_one(Ptr<pci_dev> pci_dev2, Ptr<?> ign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_save_aspm_l1ss_state(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_save_dpc_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_save_ltr_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_save_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_select_bars(Ptr<pci_dev> dev, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_set_cacheline_size(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_set_low_power_state(Ptr<pci_dev> dev, @OriginalName(value="pci_power_t") int state2, boolean locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_set_master(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_set_mwi(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_set_pcie_reset_state(Ptr<pci_dev> dev, PcieDefinitions.pcie_reset_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_set_power_state(Ptr<pci_dev> dev, @OriginalName(value="pci_power_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_set_power_state_locked(Ptr<pci_dev> dev, @OriginalName(value="pci_power_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_set_vga_state(Ptr<pci_dev> dev, boolean decode, @Unsigned int command_bits, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_slot_reset(Ptr<pci_slot> slot2, boolean probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_slot_unlock(Ptr<pci_slot> slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="resource_size_t") long pci_specified_resource_alignment(Ptr<pci_dev> dev, Ptr<@OriginalName(value="bool") Boolean> resize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_status_get_and_clear_errors(Ptr<pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pci_saved_state> pci_store_saved_state(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pci_power_t") int pci_target_state(Ptr<pci_dev> dev, boolean wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_try_reset_function(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_try_set_mwi(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_unmap_biosrom(Ptr<?> image) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_unmap_iospace(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_update_current_state(Ptr<pci_dev> dev, @OriginalName(value="pci_power_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pci_vpd_alloc(Ptr<pci_dev> dev, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pci_vpd_available(Ptr<pci_dev> dev, boolean check_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_vpd_check_csum((const void*)$arg1, $arg2)")
    public static int pci_vpd_check_csum(Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_vpd_find_id_string((const u8*)$arg1, $arg2, $arg3)")
    public static int pci_vpd_find_id_string(Ptr<Character> buf, @Unsigned int len, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_vpd_find_ro_info_keyword((const void*)$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int pci_vpd_find_ro_info_keyword(Ptr<?> buf, @Unsigned int len, String kw, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_vpd_init(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_vpd_read(Ptr<pci_dev> dev, @OriginalName(value="loff_t") long pos, @Unsigned long count, Ptr<?> arg2, boolean check_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_vpd_wait(Ptr<pci_dev> dev, boolean set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_vpd_write($arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long pci_vpd_write(Ptr<pci_dev> dev, @OriginalName(value="loff_t") long pos, @Unsigned long count, Ptr<?> arg2, boolean check_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_wait_for_pending(Ptr<pci_dev> dev, int pos, @Unsigned short mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_wait_for_pending_transaction(Ptr<pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_wake_from_d3(Ptr<pci_dev> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_walk_bus($arg1, (int (*)(struct pci_dev*, void*))$arg2, $arg3)")
    public static void pci_walk_bus(Ptr<pci_bus> top, Ptr<?> cb, Ptr<?> userdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_walk_bus_locked($arg1, (int (*)(struct pci_dev*, void*))$arg2, $arg3)")
    public static void pci_walk_bus_locked(Ptr<pci_bus> top, Ptr<?> cb, Ptr<?> userdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_write_config(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pci_write_msi_msg(@Unsigned int irq, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_write_resource_io(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long pci_write_rom(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_write_vpd($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static @OriginalName(value="ssize_t") long pci_write_vpd(Ptr<pci_dev> dev, @OriginalName(value="loff_t") long pos, @Unsigned long count, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pci_write_vpd_any($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static @OriginalName(value="ssize_t") long pci_write_vpd_any(Ptr<pci_dev> dev, @OriginalName(value="loff_t") long pos, @Unsigned long count, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_xen_hvm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_xen_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pci_xen_initial_domain() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pci_domain_busn_res")
    @NotUsableInJava
    public static class pci_domain_busn_res
    extends Struct {
        public ListDefinitions.list_head list;
        public runtime.resource res;
        public int domain_nr;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_hostbridge_probe")
    @NotUsableInJava
    public static class pci_hostbridge_probe
    extends Struct {
        public @Unsigned int bus;
        public @Unsigned int slot;
        public @Unsigned int vendor;
        public @Unsigned int device;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_setup_rom")
    @NotUsableInJava
    public static class pci_setup_rom
    extends Struct {
        public SetupDefinitions.setup_data data;
        public @Unsigned @OriginalName(value="uint16_t") short vendor;
        public @Unsigned @OriginalName(value="uint16_t") short devid;
        public @Unsigned @OriginalName(value="uint64_t") long pcilen;
        public @Unsigned long segment;
        public @Unsigned long bus;
        public @Unsigned long device;
        public @Unsigned long function;
        public @OriginalName(value="uint8_t") char @Size(value=0) [] romdata;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_bf_sort_state")
    public static enum pci_bf_sort_state implements Enum<pci_bf_sort_state>,
    TypedEnum<pci_bf_sort_state, Integer>
    {
        pci_bf_sort_default,
        pci_force_nobf,
        pci_force_bf,
        pci_dmi_bf;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_mmcfg_hostbridge_probe")
    @NotUsableInJava
    public static class pci_mmcfg_hostbridge_probe
    extends Struct {
        public @Unsigned int bus;
        public @Unsigned int devfn;
        public @Unsigned int vendor;
        public @Unsigned int device;
        public Ptr<?> probe;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_bits")
    @NotUsableInJava
    public static class pci_bits
    extends Struct {
        public @Unsigned int reg;
        public @Unsigned int width;
        public @Unsigned long mask;
        public @Unsigned long val;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_board_num_t")
    public static enum pci_board_num_t implements Enum<pci_board_num_t>,
    TypedEnum<pci_board_num_t, Integer>
    {
        pbn_default,
        pbn_b0_1_115200,
        pbn_b0_2_115200,
        pbn_b0_4_115200,
        pbn_b0_5_115200,
        pbn_b0_8_115200,
        pbn_b0_1_921600,
        pbn_b0_2_921600,
        pbn_b0_4_921600,
        pbn_b0_2_1130000,
        pbn_b0_4_1152000,
        pbn_b0_4_1250000,
        pbn_b0_2_1843200,
        pbn_b0_4_1843200,
        pbn_b0_1_15625000,
        pbn_b0_bt_1_115200,
        pbn_b0_bt_2_115200,
        pbn_b0_bt_4_115200,
        pbn_b0_bt_8_115200,
        pbn_b0_bt_1_460800,
        pbn_b0_bt_2_460800,
        pbn_b0_bt_4_460800,
        pbn_b0_bt_1_921600,
        pbn_b0_bt_2_921600,
        pbn_b0_bt_4_921600,
        pbn_b0_bt_8_921600,
        pbn_b1_1_115200,
        pbn_b1_2_115200,
        pbn_b1_4_115200,
        pbn_b1_8_115200,
        pbn_b1_16_115200,
        pbn_b1_1_921600,
        pbn_b1_2_921600,
        pbn_b1_4_921600,
        pbn_b1_8_921600,
        pbn_b1_2_1250000,
        pbn_b1_bt_1_115200,
        pbn_b1_bt_2_115200,
        pbn_b1_bt_4_115200,
        pbn_b1_bt_2_921600,
        pbn_b1_1_1382400,
        pbn_b1_2_1382400,
        pbn_b1_4_1382400,
        pbn_b1_8_1382400,
        pbn_b2_1_115200,
        pbn_b2_2_115200,
        pbn_b2_4_115200,
        pbn_b2_8_115200,
        pbn_b2_1_460800,
        pbn_b2_4_460800,
        pbn_b2_8_460800,
        pbn_b2_16_460800,
        pbn_b2_1_921600,
        pbn_b2_4_921600,
        pbn_b2_8_921600,
        pbn_b2_8_1152000,
        pbn_b2_bt_1_115200,
        pbn_b2_bt_2_115200,
        pbn_b2_bt_4_115200,
        pbn_b2_bt_2_921600,
        pbn_b2_bt_4_921600,
        pbn_b3_2_115200,
        pbn_b3_4_115200,
        pbn_b3_8_115200,
        pbn_b4_bt_2_921600,
        pbn_b4_bt_4_921600,
        pbn_b4_bt_8_921600,
        pbn_panacom,
        pbn_panacom2,
        pbn_panacom4,
        pbn_plx_romulus,
        pbn_oxsemi,
        pbn_oxsemi_1_15625000,
        pbn_oxsemi_2_15625000,
        pbn_oxsemi_4_15625000,
        pbn_oxsemi_8_15625000,
        pbn_intel_i960,
        pbn_sgi_ioc3,
        pbn_computone_4,
        pbn_computone_6,
        pbn_computone_8,
        pbn_sbsxrsio,
        pbn_pasemi_1682M,
        pbn_ni8430_2,
        pbn_ni8430_4,
        pbn_ni8430_8,
        pbn_ni8430_16,
        pbn_ADDIDATA_PCIe_1_3906250,
        pbn_ADDIDATA_PCIe_2_3906250,
        pbn_ADDIDATA_PCIe_4_3906250,
        pbn_ADDIDATA_PCIe_8_3906250,
        pbn_ce4100_1_115200,
        pbn_omegapci,
        pbn_NETMOS9900_2s_115200,
        pbn_brcm_trumanage,
        pbn_fintek_4,
        pbn_fintek_8,
        pbn_fintek_12,
        pbn_fintek_F81504A,
        pbn_fintek_F81508A,
        pbn_fintek_F81512A,
        pbn_wch382_2,
        pbn_wch384_4,
        pbn_wch384_8,
        pbn_sunix_pci_1s,
        pbn_sunix_pci_2s,
        pbn_sunix_pci_4s,
        pbn_sunix_pci_8s,
        pbn_sunix_pci_16s,
        pbn_titan_1_4000000,
        pbn_titan_2_4000000,
        pbn_titan_4_4000000,
        pbn_titan_8_4000000,
        pbn_moxa_2,
        pbn_moxa_4,
        pbn_moxa_8;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_serial_quirk")
    @NotUsableInJava
    public static class pci_serial_quirk
    extends Struct {
        public @Unsigned int vendor;
        public @Unsigned int device;
        public @Unsigned int subvendor;
        public @Unsigned int subdevice;
        public Ptr<?> probe;
        public Ptr<?> init;
        public Ptr<?> setup;
        public Ptr<?> exit;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_device_reset")
    @NotUsableInJava
    public static class pci_device_reset
    extends Struct {
        public PhysdevDefinitions.physdev_pci_device dev;
        public @Unsigned @OriginalName(value="uint32_t") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epc_group")
    @NotUsableInJava
    public static class pci_epc_group
    extends Struct {
        public ConfigDefinitions.config_group group;
        public Ptr<pci_epc> epc;
        public boolean start;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epf_group")
    @NotUsableInJava
    public static class pci_epf_group
    extends Struct {
        public ConfigDefinitions.config_group group;
        public ConfigDefinitions.config_group primary_epc_group;
        public ConfigDefinitions.config_group secondary_epc_group;
        public DelayedDefinitions.delayed_work cfs_work;
        public Ptr<pci_epf> epf;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_p2pdma_whitelist_entry")
    @NotUsableInJava
    public static class pci_p2pdma_whitelist_entry
    extends Struct {
        public @Unsigned short vendor;
        public @Unsigned short device;
        public misc.flags_of_pci_p2pdma_whitelist_entry flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_p2pdma_pagemap")
    @NotUsableInJava
    public static class pci_p2pdma_pagemap
    extends Struct {
        public Ptr<pci_dev> provider;
        public @Unsigned long bus_offset;
        public DevDefinitions.dev_pagemap pgmap;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_p2pdma")
    @NotUsableInJava
    public static class pci_p2pdma
    extends Struct {
        public Ptr<GenDefinitions.gen_pool> pool;
        public boolean p2pmem_published;
        public runtime.xarray map_types;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_dev_acs_ops")
    @NotUsableInJava
    public static class pci_dev_acs_ops
    extends Struct {
        public @Unsigned short vendor;
        public @Unsigned short device;
        public Ptr<?> enable_acs;
        public Ptr<?> disable_acs_redir;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_dev_acs_enabled")
    @NotUsableInJava
    public static class pci_dev_acs_enabled
    extends Struct {
        public @Unsigned short vendor;
        public @Unsigned short device;
        public Ptr<?> acs_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_dev_reset_methods")
    @NotUsableInJava
    public static class pci_dev_reset_methods
    extends Struct {
        public @Unsigned short vendor;
        public @Unsigned short device;
        public Ptr<?> reset;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_fixup")
    @NotUsableInJava
    public static class pci_fixup
    extends Struct {
        public @Unsigned short vendor;
        public @Unsigned short device;
        public @Unsigned int _class;
        public @Unsigned int class_shift;
        public int hook_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_filp_private")
    @NotUsableInJava
    public static class pci_filp_private
    extends Struct {
        public pci_mmap_state mmap_state;
        public int write_combine;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_dev_resource")
    @NotUsableInJava
    public static class pci_dev_resource
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.resource> res;
        public Ptr<pci_dev> dev;
        public @Unsigned @OriginalName(value="resource_size_t") long start;
        public @Unsigned @OriginalName(value="resource_size_t") long end;
        public @Unsigned @OriginalName(value="resource_size_t") long add_size;
        public @Unsigned @OriginalName(value="resource_size_t") long min_align;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_dynid")
    @NotUsableInJava
    public static class pci_dynid
    extends Struct {
        public ListDefinitions.list_head node;
        public pci_device_id id;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_root_info")
    @NotUsableInJava
    public static class pci_root_info
    extends Struct {
        public ListDefinitions.list_head list;
        public char @Size(value=12) [] name;
        public ListDefinitions.list_head resources;
        public runtime.resource busn;
        public int node;
        public int link;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_root_res")
    @NotUsableInJava
    public static class pci_root_res
    extends Struct {
        public ListDefinitions.list_head list;
        public runtime.resource res;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_check_idx_range")
    @NotUsableInJava
    public static class pci_check_idx_range
    extends Struct {
        public int start;
        public int end;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_irq_reroute_variant")
    public static enum pci_irq_reroute_variant implements Enum<pci_irq_reroute_variant>,
    TypedEnum<pci_irq_reroute_variant, Integer>
    {
        INTEL_IRQ_REROUTE_VARIANT,
        MAX_IRQ_REROUTE_VARIANTS;

    }

    @Type(noCCodeGeneration=true, cType="enum pci_bar_type")
    public static enum pci_bar_type implements Enum<pci_bar_type>,
    TypedEnum<pci_bar_type, Integer>
    {
        pci_bar_unknown,
        pci_bar_io,
        pci_bar_mem32,
        pci_bar_mem64;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_extra_dev")
    @NotUsableInJava
    public static class pci_extra_dev
    extends Struct {
        public Ptr<pci_dev> @Size(value=4) [] dev;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_raw_ops")
    @NotUsableInJava
    public static class pci_raw_ops
    extends Struct {
        public Ptr<?> read;
        public Ptr<?> write;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_p2pdma_map_state")
    @NotUsableInJava
    public static class pci_p2pdma_map_state
    extends Struct {
        public Ptr<DevDefinitions.dev_pagemap> pgmap;
        public int map;
        public @Unsigned long bus_off;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_p2pdma_map_type")
    public static enum pci_p2pdma_map_type implements Enum<pci_p2pdma_map_type>,
    TypedEnum<pci_p2pdma_map_type, Integer>
    {
        PCI_P2PDMA_MAP_UNKNOWN,
        PCI_P2PDMA_MAP_NOT_SUPPORTED,
        PCI_P2PDMA_MAP_BUS_ADDR,
        PCI_P2PDMA_MAP_THRU_HOST_BRIDGE;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_osc_bit_struct")
    @NotUsableInJava
    public static class pci_osc_bit_struct
    extends Struct {
        public @Unsigned int bit;
        public String desc;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epf_msix_tbl")
    @NotUsableInJava
    public static class pci_epf_msix_tbl
    extends Struct {
        public @Unsigned long msg_addr;
        public @Unsigned int msg_data;
        public @Unsigned int vector_ctrl;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epc_bar_desc")
    @NotUsableInJava
    public static class pci_epc_bar_desc
    extends Struct {
        public pci_epc_bar_type type;
        public @Unsigned long fixed_size;
        public boolean only_64bit;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_epc_bar_type")
    public static enum pci_epc_bar_type implements Enum<pci_epc_bar_type>,
    TypedEnum<pci_epc_bar_type, Integer>
    {
        BAR_PROGRAMMABLE,
        BAR_FIXED,
        BAR_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_epc_mem")
    @NotUsableInJava
    public static class pci_epc_mem
    extends Struct {
        public pci_epc_mem_window window;
        public Ptr<@Unsigned Long> bitmap;
        public int pages;
        public runtime.mutex lock;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epc_mem_window")
    @NotUsableInJava
    public static class pci_epc_mem_window
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long phys_base;
        public @Unsigned long size;
        public @Unsigned long page_size;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epc_features")
    @NotUsableInJava
    public static class pci_epc_features
    extends Struct {
        public @Unsigned int linkup_notifier;
        public @Unsigned int msi_capable;
        public @Unsigned int msix_capable;
        public pci_epc_bar_desc @Size(value=6) [] bar;
        public @Unsigned long align;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epc_ops")
    @NotUsableInJava
    public static class pci_epc_ops
    extends Struct {
        public Ptr<?> write_header;
        public Ptr<?> set_bar;
        public Ptr<?> clear_bar;
        public Ptr<?> map_addr;
        public Ptr<?> unmap_addr;
        public Ptr<?> set_msi;
        public Ptr<?> get_msi;
        public Ptr<?> set_msix;
        public Ptr<?> get_msix;
        public Ptr<?> raise_irq;
        public Ptr<?> map_msi_irq;
        public Ptr<?> start;
        public Ptr<?> stop;
        public Ptr<?> get_features;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_epc_interface_type")
    public static enum pci_epc_interface_type implements Enum<pci_epc_interface_type>,
    TypedEnum<pci_epc_interface_type, Integer>
    {
        UNKNOWN_INTERFACE,
        PRIMARY_INTERFACE,
        SECONDARY_INTERFACE;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_epc")
    @NotUsableInJava
    public static class pci_epc
    extends Struct {
        public runtime.device dev;
        public ListDefinitions.list_head pci_epf;
        public runtime.mutex list_lock;
        public Ptr<pci_epc_ops> ops;
        public Ptr<Ptr<pci_epc_mem>> windows;
        public Ptr<pci_epc_mem> mem;
        public @Unsigned int num_windows;
        public char max_functions;
        public Ptr<Character> max_vfs;
        public Ptr<ConfigDefinitions.config_group> group;
        public runtime.mutex lock;
        public @Unsigned long function_num_map;
        public int domain_nr;
        public boolean init_complete;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epf_bar")
    @NotUsableInJava
    public static class pci_epf_bar
    extends Struct {
        public @Unsigned @OriginalName(value="dma_addr_t") long phys_addr;
        public Ptr<?> addr;
        public @Unsigned long size;
        public pci_barno barno;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epf_driver")
    @NotUsableInJava
    public static class pci_epf_driver
    extends Struct {
        public Ptr<?> probe;
        public Ptr<?> remove;
        public DeviceDefinitions.device_driver driver;
        public Ptr<pci_epf_ops> ops;
        public Ptr<runtime.module> owner;
        public ListDefinitions.list_head epf_group;
        public Ptr<pci_epf_device_id> id_table;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epc_event_ops")
    @NotUsableInJava
    public static class pci_epc_event_ops
    extends Struct {
        public Ptr<?> epc_init;
        public Ptr<?> epc_deinit;
        public Ptr<?> link_up;
        public Ptr<?> link_down;
        public Ptr<?> bus_master_enable;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epf")
    @NotUsableInJava
    public static class pci_epf
    extends Struct {
        public runtime.device dev;
        public String name;
        public Ptr<pci_epf_header> header;
        public pci_epf_bar @Size(value=6) [] bar;
        public char msi_interrupts;
        public @Unsigned short msix_interrupts;
        public char func_no;
        public char vfunc_no;
        public Ptr<pci_epc> epc;
        public Ptr<pci_epf> epf_pf;
        public Ptr<pci_epf_driver> driver;
        public Ptr<pci_epf_device_id> id;
        public ListDefinitions.list_head list;
        public runtime.mutex lock;
        public Ptr<pci_epc> sec_epc;
        public ListDefinitions.list_head sec_epc_list;
        public pci_epf_bar @Size(value=6) [] sec_epc_bar;
        public char sec_epc_func_no;
        public Ptr<ConfigDefinitions.config_group> group;
        public @Unsigned int is_bound;
        public @Unsigned int is_vf;
        public @Unsigned long vfunction_num_map;
        public ListDefinitions.list_head pci_vepf;
        public Ptr<pci_epc_event_ops> event_ops;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epf_ops")
    @NotUsableInJava
    public static class pci_epf_ops
    extends Struct {
        public Ptr<?> bind;
        public Ptr<?> unbind;
        public Ptr<?> add_cfs;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_epf_header")
    @NotUsableInJava
    public static class pci_epf_header
    extends Struct {
        public @Unsigned short vendorid;
        public @Unsigned short deviceid;
        public char revid;
        public char progif_code;
        public char subclass_code;
        public char baseclass_code;
        public char cache_line_size;
        public @Unsigned short subsys_vendor_id;
        public @Unsigned short subsys_id;
        public pci_interrupt_pin interrupt_pin;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_barno")
    public static enum pci_barno implements Enum<pci_barno>,
    TypedEnum<pci_barno, Integer>
    {
        NO_BAR,
        BAR_0,
        BAR_1,
        BAR_2,
        BAR_3,
        BAR_4,
        BAR_5;

    }

    @Type(noCCodeGeneration=true, cType="enum pci_interrupt_pin")
    public static enum pci_interrupt_pin implements Enum<pci_interrupt_pin>,
    TypedEnum<pci_interrupt_pin, Integer>
    {
        PCI_INTERRUPT_UNKNOWN,
        PCI_INTERRUPT_INTA,
        PCI_INTERRUPT_INTB,
        PCI_INTERRUPT_INTC,
        PCI_INTERRUPT_INTD;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_epf_device_id")
    @NotUsableInJava
    public static class pci_epf_device_id
    extends Struct {
        public char @Size(value=20) [] name;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_doe_task")
    @NotUsableInJava
    public static class pci_doe_task
    extends Struct {
        public pci_doe_protocol prot;
        public Ptr<@Unsigned @OriginalName(value="__le32") Integer> request_pl;
        public @Unsigned long request_pl_sz;
        public Ptr<@Unsigned @OriginalName(value="__le32") Integer> response_pl;
        public @Unsigned long response_pl_sz;
        public int rv;
        public Ptr<?> complete;
        public Ptr<?> _private;
        public misc.work_struct work;
        public Ptr<pci_doe_mb> doe_mb;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_doe_protocol")
    @NotUsableInJava
    public static class pci_doe_protocol
    extends Struct {
        public @Unsigned short vid;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_doe_mb")
    @NotUsableInJava
    public static class pci_doe_mb
    extends Struct {
        public Ptr<pci_dev> pdev;
        public @Unsigned short cap_offset;
        public runtime.xarray prots;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wq;
        public Ptr<WorkqueueDefinitions.workqueue_struct> work_queue;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_slot_attribute")
    @NotUsableInJava
    public static class pci_slot_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_mmap_api")
    public static enum pci_mmap_api implements Enum<pci_mmap_api>,
    TypedEnum<pci_mmap_api, Integer>
    {
        PCI_MMAP_SYSFS,
        PCI_MMAP_PROCFS;

    }

    @Type(noCCodeGeneration=true, cType="enum pci_mmap_state")
    public static enum pci_mmap_state implements Enum<pci_mmap_state>,
    TypedEnum<pci_mmap_state, Integer>
    {
        pci_mmap_io,
        pci_mmap_mem;

    }

    @Type(noCCodeGeneration=true, cType="enum pci_ers_result")
    public static enum pci_ers_result implements Enum<pci_ers_result>,
    TypedEnum<pci_ers_result, Integer>
    {
        PCI_ERS_RESULT_NONE,
        PCI_ERS_RESULT_CAN_RECOVER,
        PCI_ERS_RESULT_NEED_RESET,
        PCI_ERS_RESULT_DISCONNECT,
        PCI_ERS_RESULT_RECOVERED,
        PCI_ERS_RESULT_NO_AER_DRIVER;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_saved_state")
    @NotUsableInJava
    public static class pci_saved_state
    extends Struct {
        public @Unsigned int @Size(value=16) [] config_space;
        public pci_cap_saved_data @Size(value=0) [] cap;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_acs")
    @NotUsableInJava
    public static class pci_acs
    extends Struct {
        public @Unsigned short cap;
        public @Unsigned short ctrl;
        public @Unsigned short fw_ctrl;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_pme_device")
    @NotUsableInJava
    public static class pci_pme_device
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<pci_dev> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_reset_fn_method")
    @NotUsableInJava
    public static class pci_reset_fn_method
    extends Struct {
        public Ptr<?> reset_fn;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_cap_saved_state")
    @NotUsableInJava
    public static class pci_cap_saved_state
    extends Struct {
        public misc.hlist_node next;
        public pci_cap_saved_data cap;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_cap_saved_data")
    @NotUsableInJava
    public static class pci_cap_saved_data
    extends Struct {
        public @Unsigned short cap_nr;
        public boolean cap_extended;
        public @Unsigned int size;
        public @Unsigned int @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_host_bridge")
    @NotUsableInJava
    public static class pci_host_bridge
    extends Struct {
        public runtime.device dev;
        public Ptr<pci_bus> bus;
        public Ptr<pci_ops> ops;
        public Ptr<pci_ops> child_ops;
        public Ptr<?> sysdata;
        public int busnr;
        public int domain_nr;
        public ListDefinitions.list_head windows;
        public ListDefinitions.list_head dma_ranges;
        public Ptr<?> swizzle_irq;
        public Ptr<?> map_irq;
        public Ptr<?> release_fn;
        public Ptr<?> release_data;
        public @Unsigned int ignore_reset_delay;
        public @Unsigned int no_ext_tags;
        public @Unsigned int no_inc_mrrs;
        public @Unsigned int native_aer;
        public @Unsigned int native_pcie_hotplug;
        public @Unsigned int native_shpc_hotplug;
        public @Unsigned int native_pme;
        public @Unsigned int native_ltr;
        public @Unsigned int native_dpc;
        public @Unsigned int native_cxl_error;
        public @Unsigned int preserve_config;
        public @Unsigned int size_windows;
        public @Unsigned int msi_domain;
        public Ptr<?> align_resource;
        public @Unsigned long @Size(value=0) [] _private;
    }

    @Type(noCCodeGeneration=true, cType="enum pci_bus_speed")
    public static enum pci_bus_speed implements Enum<pci_bus_speed>,
    TypedEnum<pci_bus_speed, Integer>
    {
        PCI_SPEED_33MHz,
        PCI_SPEED_66MHz,
        PCI_SPEED_66MHz_PCIX,
        PCI_SPEED_100MHz_PCIX,
        PCI_SPEED_133MHz_PCIX,
        PCI_SPEED_66MHz_PCIX_ECC,
        PCI_SPEED_100MHz_PCIX_ECC,
        PCI_SPEED_133MHz_PCIX_ECC,
        PCI_SPEED_66MHz_PCIX_266,
        PCI_SPEED_100MHz_PCIX_266,
        PCI_SPEED_133MHz_PCIX_266,
        AGP_UNKNOWN,
        AGP_1X,
        AGP_2X,
        AGP_4X,
        AGP_8X,
        PCI_SPEED_66MHz_PCIX_533,
        PCI_SPEED_100MHz_PCIX_533,
        PCI_SPEED_133MHz_PCIX_533,
        PCIE_SPEED_2_5GT,
        PCIE_SPEED_5_0GT,
        PCIE_SPEED_8_0GT,
        PCIE_SPEED_16_0GT,
        PCIE_SPEED_32_0GT,
        PCIE_SPEED_64_0GT,
        PCI_SPEED_UNKNOWN;

    }

    @Type(noCCodeGeneration=true, cType="enum pci_bus_flags")
    public static enum pci_bus_flags implements Enum<pci_bus_flags>,
    TypedEnum<pci_bus_flags, Integer>
    {
        PCI_BUS_FLAGS_NO_MSI,
        PCI_BUS_FLAGS_NO_MMRBC,
        PCI_BUS_FLAGS_NO_AERSID,
        PCI_BUS_FLAGS_NO_EXTCFG;

    }

    @Type(noCCodeGeneration=true, cType="enum pci_dev_flags")
    public static enum pci_dev_flags implements Enum<pci_dev_flags>,
    TypedEnum<pci_dev_flags, Integer>
    {
        PCI_DEV_FLAGS_MSI_INTX_DISABLE_BUG,
        PCI_DEV_FLAGS_NO_D3,
        PCI_DEV_FLAGS_ASSIGNED,
        PCI_DEV_FLAGS_ACS_ENABLED_QUIRK,
        PCI_DEV_FLAG_PCIE_BRIDGE_ALIAS,
        PCI_DEV_FLAGS_NO_BUS_RESET,
        PCI_DEV_FLAGS_NO_PM_RESET,
        PCI_DEV_FLAGS_VPD_REF_F0,
        PCI_DEV_FLAGS_BRIDGE_XLATE_ROOT,
        PCI_DEV_FLAGS_NO_FLR_RESET,
        PCI_DEV_FLAGS_NO_RELAXED_ORDERING,
        PCI_DEV_FLAGS_HAS_MSI_MASKING;

    }

    @Type(noCCodeGeneration=true, cType="enum pci_channel_io")
    public static enum pci_channel_io implements Enum<pci_channel_io>,
    TypedEnum<pci_channel_io, Integer>
    {
        pci_channel_io_normal,
        pci_channel_io_frozen,
        pci_channel_io_perm_failure;

    }

    @Type(noCCodeGeneration=true, cType="enum pci_fixup_pass")
    public static enum pci_fixup_pass implements Enum<pci_fixup_pass>,
    TypedEnum<pci_fixup_pass, Integer>
    {
        pci_fixup_early,
        pci_fixup_header,
        pci_fixup_final,
        pci_fixup_enable,
        pci_fixup_resume,
        pci_fixup_suspend,
        pci_fixup_resume_early,
        pci_fixup_suspend_late;

    }

    @Type(noCCodeGeneration=true, cType="struct pci_bus_region")
    @NotUsableInJava
    public static class pci_bus_region
    extends Struct {
        public @Unsigned @OriginalName(value="pci_bus_addr_t") long start;
        public @Unsigned @OriginalName(value="pci_bus_addr_t") long end;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_bus_resource")
    @NotUsableInJava
    public static class pci_bus_resource
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.resource> res;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_sriov")
    @NotUsableInJava
    public static class pci_sriov
    extends Struct {
        public int pos;
        public int nres;
        public @Unsigned int cap;
        public @Unsigned short ctrl;
        public @Unsigned short total_VFs;
        public @Unsigned short initial_VFs;
        public @Unsigned short num_VFs;
        public @Unsigned short offset;
        public @Unsigned short stride;
        public @Unsigned short vf_device;
        public @Unsigned int pgsz;
        public char link;
        public char max_VF_buses;
        public @Unsigned short driver_max_VFs;
        public Ptr<pci_dev> dev;
        public Ptr<pci_dev> self;
        public @Unsigned int _class;
        public char hdr_type;
        public @Unsigned short subsystem_vendor;
        public @Unsigned short subsystem_device;
        public @Unsigned @OriginalName(value="resource_size_t") long @Size(value=6) [] barsz;
        public boolean drivers_autoprobe;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_mmcfg_region")
    @NotUsableInJava
    public static class pci_mmcfg_region
    extends Struct {
        public ListDefinitions.list_head list;
        public runtime.resource res;
        public @Unsigned long address;
        public String virt;
        public @Unsigned short segment;
        public char start_bus;
        public char end_bus;
        public char @Size(value=30) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct { union { short unsigned int rid; union hv_pci_bdf bdf; }; short unsigned int segment; union hv_pci_bus_range shadow_bus_range; short unsigned int phantom_function_bits; short unsigned int source_shadow; short unsigned int rsvdz0; short unsigned int device_type; }")
    @NotUsableInJava
    public static class pci_of_hv_device_id
    extends Struct {
        @InlineUnion(value=4082)
        public @InlineUnion(value=4082) @Unsigned @OriginalName(value="hv_pci_rid") short rid;
        @InlineUnion(value=4082)
        public  @InlineUnion(value=4082) HvDefinitions.hv_pci_bdf bdf;
        public @Unsigned @OriginalName(value="hv_pci_segment") short segment;
        public HvDefinitions.hv_pci_bus_range shadow_bus_range;
        public @Unsigned short phantom_function_bits;
        public @Unsigned short source_shadow;
        public @Unsigned short rsvdz0;
        public @Unsigned short device_type;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_sysdata")
    @NotUsableInJava
    public static class pci_sysdata
    extends Struct {
        public int domain;
        public int node;
        public Ptr<AcpiDefinitions.acpi_device> companion;
        public Ptr<?> iommu;
        public Ptr<?> fwnode;
        public Ptr<pci_dev> vmd_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_error_handlers")
    @NotUsableInJava
    public static class pci_error_handlers
    extends Struct {
        public Ptr<?> error_detected;
        public Ptr<?> mmio_enabled;
        public Ptr<?> slot_reset;
        public Ptr<?> reset_prepare;
        public Ptr<?> reset_done;
        public Ptr<?> resume;
        public Ptr<?> cor_error_detected;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_dynids")
    @NotUsableInJava
    public static class pci_dynids
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_ops")
    @NotUsableInJava
    public static class pci_ops
    extends Struct {
        public Ptr<?> add_bus;
        public Ptr<?> remove_bus;
        public Ptr<?> map_bus;
        public Ptr<?> read;
        public Ptr<?> write;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_driver")
    @NotUsableInJava
    public static class pci_driver
    extends Struct {
        public String name;
        public Ptr<pci_device_id> id_table;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> shutdown;
        public Ptr<?> sriov_configure;
        public Ptr<?> sriov_set_msix_vec_count;
        public Ptr<?> sriov_get_vf_total_msix;
        public Ptr<pci_error_handlers> err_handler;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> groups;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> dev_groups;
        public DeviceDefinitions.device_driver driver;
        public pci_dynids dynids;
        public boolean driver_managed_dma;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_dev")
    @NotUsableInJava
    public static class pci_dev
    extends Struct {
        public ListDefinitions.list_head bus_list;
        public Ptr<pci_bus> bus;
        public Ptr<pci_bus> subordinate;
        public Ptr<?> sysdata;
        public Ptr<ProcDefinitions.proc_dir_entry> procent;
        public Ptr<pci_slot> slot;
        public @Unsigned int devfn;
        public @Unsigned short vendor;
        public @Unsigned short device;
        public @Unsigned short subsystem_vendor;
        public @Unsigned short subsystem_device;
        public @Unsigned int _class;
        public char revision;
        public char hdr_type;
        public @Unsigned short aer_cap;
        public Ptr<AerDefinitions.aer_stats> aer_stats;
        public Ptr<misc.rcec_ea> rcec_ea;
        public Ptr<pci_dev> rcec;
        public @Unsigned int devcap;
        public char pcie_cap;
        public char msi_cap;
        public char msix_cap;
        public char pcie_mpss;
        public char rom_base_reg;
        public char pin;
        public @Unsigned short pcie_flags_reg;
        public Ptr<@Unsigned Long> dma_alias_mask;
        public Ptr<pci_driver> driver;
        public @Unsigned long dma_mask;
        public DeviceDefinitions.device_dma_parameters dma_parms;
        public @OriginalName(value="pci_power_t") int current_state;
        public char pm_cap;
        public @Unsigned int pme_support;
        public @Unsigned int pme_poll;
        public @Unsigned int pinned;
        public @Unsigned int config_rrs_sv;
        public @Unsigned int imm_ready;
        public @Unsigned int d1_support;
        public @Unsigned int d2_support;
        public @Unsigned int no_d1d2;
        public @Unsigned int no_d3cold;
        public @Unsigned int bridge_d3;
        public @Unsigned int d3cold_allowed;
        public @Unsigned int mmio_always_on;
        public @Unsigned int wakeup_prepared;
        public @Unsigned int skip_bus_pm;
        public @Unsigned int ignore_hotplug;
        public @Unsigned int hotplug_user_indicators;
        public @Unsigned int clear_retrain_link;
        public @Unsigned int d3hot_delay;
        public @Unsigned int d3cold_delay;
        public @Unsigned short l1ss;
        public Ptr<PcieDefinitions.pcie_link_state> link_state;
        public @Unsigned int ltr_path;
        public @Unsigned int pasid_no_tlp;
        public @Unsigned int eetlp_prefix_path;
        public @Unsigned @OriginalName(value="pci_channel_state_t") int error_state;
        public runtime.device dev;
        public int cfg_size;
        public @Unsigned int irq;
        public runtime.resource @Size(value=17) [] resource;
        public runtime.resource driver_exclusive_resource;
        public boolean match_driver;
        public @Unsigned int transparent;
        public @Unsigned int io_window;
        public @Unsigned int pref_window;
        public @Unsigned int pref_64_window;
        public @Unsigned int multifunction;
        public @Unsigned int is_busmaster;
        public @Unsigned int no_msi;
        public @Unsigned int no_64bit_msi;
        public @Unsigned int block_cfg_access;
        public @Unsigned int broken_parity_status;
        public @Unsigned int irq_reroute_variant;
        public @Unsigned int msi_enabled;
        public @Unsigned int msix_enabled;
        public @Unsigned int ari_enabled;
        public @Unsigned int ats_enabled;
        public @Unsigned int pasid_enabled;
        public @Unsigned int pri_enabled;
        public @Unsigned int is_managed;
        public @Unsigned int is_msi_managed;
        public @Unsigned int needs_freset;
        public @Unsigned int state_saved;
        public @Unsigned int is_physfn;
        public @Unsigned int is_virtfn;
        public @Unsigned int is_hotplug_bridge;
        public @Unsigned int shpc_managed;
        public @Unsigned int is_thunderbolt;
        public @Unsigned int untrusted;
        public @Unsigned int external_facing;
        public @Unsigned int broken_intx_masking;
        public @Unsigned int io_window_1k;
        public @Unsigned int irq_managed;
        public @Unsigned int non_compliant_bars;
        public @Unsigned int is_probed;
        public @Unsigned int link_active_reporting;
        public @Unsigned int no_vf_scan;
        public @Unsigned int no_command_memory;
        public @Unsigned int rom_bar_overlap;
        public @Unsigned int rom_attr_enabled;
        public @Unsigned int aspm_os_control;
        public @Unsigned @OriginalName(value="pci_dev_flags_t") short dev_flags;
        public AtomicDefinitions.atomic_t enable_cnt;
        public  @OriginalName(value="spinlock_t") runtime.spinlock pcie_cap_lock;
        public @Unsigned int @Size(value=16) [] saved_config_space;
        public misc.hlist_head saved_cap_space;
        public Ptr<misc.bin_attribute> @Size(value=17) [] res_attr;
        public Ptr<misc.bin_attribute> @Size(value=17) [] res_attr_wc;
        public @Unsigned int broken_cmd_compl;
        public @Unsigned short ptm_cap;
        public @Unsigned int ptm_root;
        public @Unsigned int ptm_enabled;
        public char ptm_granularity;
        public Ptr<?> msix_base;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock msi_lock;
        public pci_vpd vpd;
        public @Unsigned short dpc_cap;
        public @Unsigned int dpc_rp_extensions;
        public char dpc_rp_log_size;
        @InlineUnion(value=3700)
        public @InlineUnion(value=3700) Ptr<pci_sriov> sriov;
        @InlineUnion(value=3700)
        public @InlineUnion(value=3700) Ptr<pci_dev> physfn;
        public @Unsigned short ats_cap;
        public char ats_stu;
        public @Unsigned short pri_cap;
        public @Unsigned int pri_reqs_alloc;
        public @Unsigned int pasid_required;
        public @Unsigned short pasid_cap;
        public @Unsigned short pasid_features;
        public Ptr<pci_p2pdma> p2pdma;
        public runtime.xarray doe_mbs;
        public Ptr<runtime.npem> npem;
        public @Unsigned short acs_cap;
        public @Unsigned @OriginalName(value="phys_addr_t") long rom;
        public @Unsigned long romlen;
        public String driver_override;
        public @Unsigned long priv_flags;
        public char @Size(value=8) [] reset_methods;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_vpd")
    @NotUsableInJava
    public static class pci_vpd
    extends Struct {
        public runtime.mutex lock;
        public @Unsigned int len;
        public char cap;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_bus")
    @NotUsableInJava
    public static class pci_bus
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<pci_bus> parent;
        public ListDefinitions.list_head children;
        public ListDefinitions.list_head devices;
        public Ptr<pci_dev> self;
        public ListDefinitions.list_head slots;
        public Ptr<runtime.resource> @Size(value=4) [] resource;
        public ListDefinitions.list_head resources;
        public runtime.resource busn_res;
        public Ptr<pci_ops> ops;
        public Ptr<?> sysdata;
        public Ptr<ProcDefinitions.proc_dir_entry> procdir;
        public char number;
        public char primary;
        public char max_bus_speed;
        public char cur_bus_speed;
        public char @Size(value=48) [] name;
        public @Unsigned short bridge_ctl;
        public @Unsigned @OriginalName(value="pci_bus_flags_t") short bus_flags;
        public Ptr<runtime.device> bridge;
        public runtime.device dev;
        public Ptr<misc.bin_attribute> legacy_io;
        public Ptr<misc.bin_attribute> legacy_mem;
        public @Unsigned int is_added;
        public @Unsigned int unsafe_warn;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_slot")
    @NotUsableInJava
    public static class pci_slot
    extends Struct {
        public Ptr<pci_bus> bus;
        public ListDefinitions.list_head list;
        public Ptr<misc.hotplug_slot> hotplug;
        public char number;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_device_id")
    @NotUsableInJava
    public static class pci_device_id
    extends Struct {
        public @Unsigned int vendor;
        public @Unsigned int device;
        public @Unsigned int subvendor;
        public @Unsigned int subdevice;
        public @Unsigned int _class;
        public @Unsigned int class_mask;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
        public @Unsigned int override_only;
    }

    @Type(noCCodeGeneration=true, cType="struct pci_msi_desc")
    @NotUsableInJava
    public static class pci_msi_desc
    extends Struct {
        @InlineUnion(value=3222)
        public @InlineUnion(value=3222) @Unsigned int msi_mask;
        @InlineUnion(value=3222)
        public @InlineUnion(value=3222) @Unsigned int msix_ctrl;
        public MsiDefinitions.msi_attrib_of_pci_msi_desc msi_attrib;
        @InlineUnion(value=3224)
        public @InlineUnion(value=3224) char mask_pos;
        @InlineUnion(value=3224)
        public @InlineUnion(value=3224) Ptr<?> mask_base;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 bus; u8 slot; u8 function; u8 channel; unsigned int reserved; }")
    @NotUsableInJava
    public static class pci_of_interface_path_of_edd_device_params
    extends Struct {
        public char bus;
        public char slot;
        public char function;
        public char channel;
        public @Unsigned int reserved;
    }
}

