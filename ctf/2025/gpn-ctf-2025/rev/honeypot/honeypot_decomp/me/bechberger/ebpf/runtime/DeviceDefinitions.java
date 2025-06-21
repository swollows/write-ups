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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AtaDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DmarDefinitions;
import me.bechberger.ebpf.runtime.DpmDefinitions;
import me.bechberger.ebpf.runtime.DriverDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IommuDefinitions;
import me.bechberger.ebpf.runtime.KlistDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.OfDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.Pm860xDefinitions;
import me.bechberger.ebpf.runtime.ProbeDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.ScsiDefinitions;
import me.bechberger.ebpf.runtime.SoftwareDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.WakeDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class DeviceDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __device_attach(Ptr<runtime.device> dev, boolean allow_async) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __device_attach_async_helper(Ptr<?> _dev, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __device_attach_driver(Ptr<device_driver> drv, Ptr<?> _data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_add_disk($arg1, $arg2, (const struct attribute_group**)$arg3)")
    public static int device_add_disk(Ptr<runtime.device> parent, Ptr<runtime.gendisk> disk, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_area_is_invalid(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_attach(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_bind_driver(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_block_probing() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_block_translation(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_create_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_dax_write_cache_enabled(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_def_domain_type(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_driver_attach((const struct device_driver*)$arg1, $arg2)")
    public static int device_driver_attach(Ptr<device_driver> drv, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_driver_detach(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_flush_dte(Ptr<IommuDefinitions.iommu_dev_data> dev_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_flush_dte_alias(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned short alias, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_init_wakeup(Ptr<runtime.device> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_initial_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_intersect_crypto_capabilities(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean device_iommu_capable(Ptr<runtime.device> dev, IommuDefinitions.iommu_cap cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean device_is_bound(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_is_rq_stackable(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_is_zoned_model(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IntelDefinitions.intel_iommu> device_lookup_iommu(Ptr<runtime.device> dev, Ptr<Character> bus, Ptr<Character> devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_not_dax_capable(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_not_dax_synchronous_capable(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_not_discard_capable(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_not_matches_zone_sectors(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_not_secure_erase_capable(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_not_write_zeroes_capable(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_not_zoned(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> device_rbtree_find(Ptr<IntelDefinitions.intel_iommu> iommu, @Unsigned short rid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_release_driver(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_release_driver_internal($arg1, (const struct device_driver*)$arg2, $arg3)")
    public static void device_release_driver_internal(Ptr<runtime.device> dev, Ptr<device_driver> drv, Ptr<runtime.device> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_set_deferred_probe_reason((const struct device*)$arg1, $arg2)")
    public static void device_set_deferred_probe_reason(Ptr<runtime.device> dev, Ptr<misc.va_format> vaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_unbind_cleanup(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_unblock_probing() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_get_ethdev_address(Ptr<runtime.device> dev, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_get_mac_address(Ptr<runtime.device> dev, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_irq_init(Ptr<Pm860xDefinitions.pm860x_chip> chip, Ptr<Pm860xDefinitions.pm860x_platform_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_match_id($arg1, (const void*)$arg2)")
    public static int device_match_id(Ptr<runtime.device> dev, Ptr<?> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_power_init(Ptr<Pm860xDefinitions.pm860x_chip> chip, Ptr<Pm860xDefinitions.pm860x_platform_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_regulator_init(Ptr<Pm860xDefinitions.pm860x_chip> chip, Ptr<Pm860xDefinitions.pm860x_platform_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long device_rev_show(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_set_wakeup_capable(Ptr<runtime.device> dev, boolean capable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_set_wakeup_enable(Ptr<runtime.device> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long device_show(Ptr<runtime.device> _d, Ptr<device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_wakeup_arm_wake_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_wakeup_attach_irq(Ptr<runtime.device> dev, Ptr<WakeDefinitions.wake_irq> wakeirq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_wakeup_detach_irq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_wakeup_disable(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_wakeup_disarm_wake_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_wakeup_enable(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __device_link_del(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __device_links_no_driver(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __device_links_queue_sync_state(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_add(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_add_attrs(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_add_groups($arg1, (const struct attribute_group**)$arg2)")
    public static int device_add_groups(Ptr<runtime.device> dev, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_change_owner(Ptr<runtime.device> dev, misc.kuid_t kuid, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_check_offline(Ptr<runtime.device> dev, Ptr<?> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_create((const struct class*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6_)")
    public static Ptr<runtime.device> device_create(Ptr<runtime._class> _class2, Ptr<runtime.device> parent, @Unsigned @OriginalName(value="dev_t") int devt, Ptr<?> drvdata, String fmt, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_create_bin_file($arg1, (const struct bin_attribute*)$arg2)")
    public static int device_create_bin_file(Ptr<runtime.device> dev, Ptr<misc.bin_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_create_file($arg1, (const struct device_attribute*)$arg2)")
    public static int device_create_file(Ptr<runtime.device> dev, Ptr<device_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_create_groups_vargs((const struct class*)$arg1, $arg2, $arg3, $arg4, (const struct attribute_group**)$arg5, (const u8*)$arg6, $arg7)")
    public static Ptr<runtime.device> device_create_groups_vargs(Ptr<runtime._class> _class2, Ptr<runtime.device> parent, @Unsigned @OriginalName(value="dev_t") int devt, Ptr<?> drvdata, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_create_with_groups((const struct class*)$arg1, $arg2, $arg3, $arg4, (const struct attribute_group**)$arg5, (const u8*)$arg6, $arg7_)")
    public static Ptr<runtime.device> device_create_with_groups(Ptr<runtime._class> _class2, Ptr<runtime.device> parent, @Unsigned @OriginalName(value="dev_t") int devt, Ptr<?> drvdata, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups, String fmt, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_del(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_destroy((const struct class*)$arg1, $arg2)")
    public static void device_destroy(Ptr<runtime._class> _class2, @Unsigned @OriginalName(value="dev_t") int devt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_dma_supported((const struct device*)$arg1)")
    public static boolean device_dma_supported(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> device_find_any_child(Ptr<runtime.device> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_find_child($arg1, $arg2, (int (*)(struct device*, void*))$arg3)")
    public static Ptr<runtime.device> device_find_child(Ptr<runtime.device> parent, Ptr<?> data, Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_find_child_by_name($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.device> device_find_child_by_name(Ptr<runtime.device> parent, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_for_each_child($arg1, $arg2, (int (*)(struct device*, void*))$arg3)")
    public static int device_for_each_child(Ptr<runtime.device> parent, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_for_each_child_reverse($arg1, $arg2, (int (*)(struct device*, void*))$arg3)")
    public static int device_for_each_child_reverse(Ptr<runtime.device> parent, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_for_each_child_reverse_from($arg1, $arg2, (const void*)$arg3, (int (*)(struct device*, const void*))$arg4)")
    public static int device_for_each_child_reverse_from(Ptr<runtime.device> parent, Ptr<runtime.device> from, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_get_child_node_count((const struct device*)$arg1)")
    public static @Unsigned int device_get_child_node_count(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)device_get_devnode((const struct device*)$arg1, $arg2, $arg3, $arg4, (const u8**)$arg5))")
    public static String device_get_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid, Ptr<String> tmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_get_dma_attr((const struct device*)$arg1)")
    public static DevDefinitions.dev_dma_attr device_get_dma_attr(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)device_get_match_data((const struct device*)$arg1))")
    public static Ptr<?> device_get_match_data(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_get_named_child_node((const struct device*)$arg1, (const u8*)$arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> device_get_named_child_node(Ptr<runtime.device> dev, String childname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_get_next_child_node((const struct device*)$arg1, $arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> device_get_next_child_node(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_get_ownership((const struct kobject*)$arg1, $arg2, $arg3)")
    public static void device_get_ownership(Ptr<runtime.kobject> kobj, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_get_phy_mode(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_get_zone_resource_limits(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_initialize(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_is_dependent(Ptr<runtime.device> dev, Ptr<?> target) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<device_link> device_link_add(Ptr<runtime.device> consumer, Ptr<runtime.device> supplier, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_link_del(Ptr<device_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_link_drop_managed(Ptr<device_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_link_init_status(Ptr<device_link> link2, Ptr<runtime.device> consumer, Ptr<runtime.device> supplier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_link_put_kref(Ptr<device_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_link_release_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_link_remove(Ptr<?> consumer, Ptr<runtime.device> supplier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_link_wait_removal() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean device_links_busy(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_links_check_suppliers(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_driver_bound(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_driver_cleanup(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_flush_sync_list(Ptr<ListDefinitions.list_head> list, Ptr<runtime.device> dont_lock_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_force_bind(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_no_driver(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_links_read_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_links_read_lock_held() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_read_unlock(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_supplier_sync_state_pause() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_supplier_sync_state_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_links_unbind_consumers(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_match_acpi_dev($arg1, (const void*)$arg2)")
    public static int device_match_acpi_dev(Ptr<runtime.device> dev, Ptr<?> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_match_acpi_handle($arg1, (const void*)$arg2)")
    public static int device_match_acpi_handle(Ptr<runtime.device> dev, Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_match_any($arg1, (const void*)$arg2)")
    public static int device_match_any(Ptr<runtime.device> dev, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_match_devt($arg1, (const void*)$arg2)")
    public static int device_match_devt(Ptr<runtime.device> dev, Ptr<?> pdevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_match_fwnode($arg1, (const void*)$arg2)")
    public static int device_match_fwnode(Ptr<runtime.device> dev, Ptr<?> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_match_name($arg1, (const void*)$arg2)")
    public static int device_match_name(Ptr<runtime.device> dev, Ptr<?> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_match_of_node($arg1, (const void*)$arg2)")
    public static int device_match_of_node(Ptr<runtime.device> dev, Ptr<?> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_move(Ptr<runtime.device> dev, Ptr<runtime.device> new_parent, DpmDefinitions.dpm_order dpm_order2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)device_namespace((const struct kobject*)$arg1))")
    public static Ptr<?> device_namespace(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.regmap> device_node_to_regmap(Ptr<device_node> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_not_zone_append_capable(Ptr<DmDefinitions.dm_target> ti, Ptr<DmDefinitions.dm_dev> dev, @Unsigned @OriginalName(value="sector_t") long start, @Unsigned @OriginalName(value="sector_t") long len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_offline(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_online(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_move_to_tail(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_property_match_string((const struct device*)$arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int device_property_match_string(Ptr<runtime.device> dev, String propname, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_property_present((const struct device*)$arg1, (const u8*)$arg2)")
    public static boolean device_property_present(Ptr<runtime.device> dev, String propname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_property_read_string((const struct device*)$arg1, (const u8*)$arg2, (const u8**)$arg3)")
    public static int device_property_read_string(Ptr<runtime.device> dev, String propname, Ptr<String> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_property_read_string_array((const struct device*)$arg1, (const u8*)$arg2, (const u8**)$arg3, $arg4)")
    public static int device_property_read_string_array(Ptr<runtime.device> dev, String propname, Ptr<String> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_property_read_u16_array((const struct device*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int device_property_read_u16_array(Ptr<runtime.device> dev, String propname, Ptr<@Unsigned Short> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_property_read_u32_array((const struct device*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int device_property_read_u32_array(Ptr<runtime.device> dev, String propname, Ptr<@Unsigned Integer> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_property_read_u64_array((const struct device*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int device_property_read_u64_array(Ptr<runtime.device> dev, String propname, Ptr<@Unsigned Long> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_property_read_u8_array((const struct device*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int device_property_read_u8_array(Ptr<runtime.device> dev, String propname, Ptr<Character> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_quiesce_fn(Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_register(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_remove_attrs(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_remove_bin_file($arg1, (const struct bin_attribute*)$arg2)")
    public static void device_remove_bin_file(Ptr<runtime.device> dev, Ptr<misc.bin_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_remove_class_symlinks(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_remove_file($arg1, (const struct device_attribute*)$arg2)")
    public static void device_remove_file(Ptr<runtime.device> dev, Ptr<device_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_remove_file_self($arg1, (const struct device_attribute*)$arg2)")
    public static boolean device_remove_file_self(Ptr<runtime.device> dev, Ptr<device_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_remove_groups($arg1, (const struct attribute_group**)$arg2)")
    public static void device_remove_groups(Ptr<runtime.device> dev, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_rename($arg1, (const u8*)$arg2)")
    public static int device_rename(Ptr<runtime.device> dev, String new_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_reorder_to_tail(Ptr<runtime.device> dev, Ptr<?> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_resume_fn(Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_set_node(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_set_of_node_from_dev($arg1, (const struct device*)$arg2)")
    public static void device_set_of_node_from_dev(Ptr<runtime.device> dev, Ptr<runtime.device> dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long device_show_bool(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long device_show_int(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long device_show_string(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long device_show_ulong(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_shutdown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_store_bool($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long device_store_bool(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_store_int($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long device_store_int(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_store_ulong($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long device_store_ulong(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_unblock(Ptr<ScsiDefinitions.scsi_device> sdev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_uncache_fw_images_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_unregister(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __device_reset(Ptr<runtime.device> dev, boolean optional) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_add_software_node($arg1, (const struct software_node*)$arg2)")
    public static int device_add_software_node(Ptr<runtime.device> dev, Ptr<SoftwareDefinitions.software_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="device_create_managed_software_node($arg1, (const struct property_entry*)$arg2, (const struct software_node*)$arg3)")
    public static int device_create_managed_software_node(Ptr<runtime.device> dev, Ptr<misc.property_entry> properties, Ptr<SoftwareDefinitions.software_node> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean device_has_acpi_name(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long device_is_integrity_capable_show(Ptr<runtime.device> dev, Ptr<device_attribute> attr2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_pasid_table_setup(Ptr<runtime.device> dev, char bus, char devfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PhyDefinitions.phy_device> device_phy_find_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_add(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_check_callbacks(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_move_after(Ptr<runtime.device> deva, Ptr<runtime.device> devb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_move_before(Ptr<runtime.device> deva, Ptr<runtime.device> devb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_move_last(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_sleep_init(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_pm_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_pm_wait_for_dev(Ptr<runtime.device> subordinate, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_prepare(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_remove_software_node(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_reprobe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_resume(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_resume_early(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void device_resume_noirq(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_suspend(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_suspend_late(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int device_suspend_noirq(Ptr<runtime.device> dev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2, boolean async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct property")
    @NotUsableInJava
    public static class property
    extends Struct {
        public String name;
        public int length;
        public Ptr<?> value;
        public Ptr<property> next;
    }

    @Type(noCCodeGeneration=true, cType="union device_attr_group_devres")
    @NotUsableInJava
    public static class device_attr_group_devres
    extends Union {
        public Ptr<AttributeDefinitions.attribute_group> group;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> groups;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int vendor_id; short unsigned int device_id; u8 class_code[3]; u8 function; u8 device; short unsigned int segment; u8 bus; u8 secondary_bus; short unsigned int slot; u8 reserved; }")
    @NotUsableInJava
    public static class device_id_of_cper_sec_pcie
    extends Struct {
        public @Unsigned short vendor_id;
        public @Unsigned short device_id;
        public char @Size(value=3) [] class_code;
        public char function;
        public char device;
        public @Unsigned short segment;
        public char bus;
        public char secondary_bus;
        public @Unsigned short slot;
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct device_attach_data")
    @NotUsableInJava
    public static class device_attach_data
    extends Struct {
        public Ptr<runtime.device> dev;
        public boolean check_async;
        public boolean want_async;
        public boolean have_async;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int vendor_id; short unsigned int device_id; short unsigned int subsystem_vendor_id; short unsigned int subsystem_id; u8 class_code[2]; short unsigned int slot; u8 reserved_1[4]; }")
    @NotUsableInJava
    public static class device_id_of_cper_sec_prot_err
    extends Struct {
        public @Unsigned short vendor_id;
        public @Unsigned short device_id;
        public @Unsigned short subsystem_vendor_id;
        public @Unsigned short subsystem_id;
        public char @Size(value=2) [] class_code;
        public @Unsigned short slot;
        public char @Size(value=4) [] reserved_1;
    }

    @Type(noCCodeGeneration=true, cType="struct device_private")
    @NotUsableInJava
    public static class device_private
    extends Struct {
        public runtime.klist klist_children;
        public KlistDefinitions.klist_node knode_parent;
        public KlistDefinitions.klist_node knode_driver;
        public KlistDefinitions.klist_node knode_bus;
        public KlistDefinitions.klist_node knode_class;
        public ListDefinitions.list_head deferred_probe;
        public Ptr<device_driver> async_driver;
        public String deferred_probe_reason;
        public Ptr<runtime.device> device;
        public char dead;
    }

    @Type(noCCodeGeneration=true, cType="struct device_domain_info")
    @NotUsableInJava
    public static class device_domain_info
    extends Struct {
        public ListDefinitions.list_head link;
        public @Unsigned int segment;
        public char bus;
        public char devfn;
        public @Unsigned short pfsid;
        public char pasid_supported;
        public char pasid_enabled;
        public char pri_supported;
        public char pri_enabled;
        public char ats_supported;
        public char ats_enabled;
        public char dtlb_extra_inval;
        public char ats_qdep;
        public Ptr<runtime.device> dev;
        public Ptr<IntelDefinitions.intel_iommu> iommu;
        public Ptr<DmarDefinitions.dmar_domain> domain;
        public Ptr<misc.pasid_table> pasid_table;
        public RbDefinitions.rb_node node;
    }

    @Type(noCCodeGeneration=true, cType="struct device_link")
    @NotUsableInJava
    public static class device_link
    extends Struct {
        public Ptr<runtime.device> supplier;
        public ListDefinitions.list_head s_node;
        public Ptr<runtime.device> consumer;
        public ListDefinitions.list_head c_node;
        public runtime.device link_dev;
        public device_link_state status;
        public @Unsigned int flags;
        public @OriginalName(value="refcount_t") misc.refcount_struct rpm_active;
        public runtime.kref kref;
        public misc.work_struct rm_work;
        public boolean supplier_preactivated;
    }

    @Type(noCCodeGeneration=true, cType="enum device_link_state")
    public static enum device_link_state implements Enum<device_link_state>,
    TypedEnum<device_link_state, Integer>
    {
        DL_STATE_NONE,
        DL_STATE_DORMANT,
        DL_STATE_AVAILABLE,
        DL_STATE_CONSUMER_PROBE,
        DL_STATE_ACTIVE,
        DL_STATE_SUPPLIER_UNBIND;

    }

    @Type(noCCodeGeneration=true, cType="struct device_attribute")
    @NotUsableInJava
    public static class device_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="union { struct { u8 device; u8 reserved1; short unsigned int reserved2; unsigned int reserved3; long long unsigned int reserved4; } ata; struct { u8 device; u8 lun; u8 reserved1; u8 reserved2; unsigned int reserved3; long long unsigned int reserved4; } atapi; struct { short unsigned int id; long long unsigned int lun; short unsigned int reserved1; unsigned int reserved2; } scsi; struct { long long unsigned int serial_number; long long unsigned int reserved; } usb; struct { long long unsigned int eui; long long unsigned int reserved; } i1394; struct { long long unsigned int wwid; long long unsigned int lun; } fibre; struct { long long unsigned int identity_tag; long long unsigned int reserved; } i2o; struct { unsigned int array_number; unsigned int reserved1; long long unsigned int reserved2; } raid; struct { u8 device; u8 reserved1; short unsigned int reserved2; unsigned int reserved3; long long unsigned int reserved4; } sata; struct { long long unsigned int reserved1; long long unsigned int reserved2; } unknown; }")
    @NotUsableInJava
    public static class device_path_of_edd_device_params
    extends Union {
        public AtaDefinitions.ata_of_device_path_of_edd_device_params_and_sata_of_device_path_of_edd_device_params ata;
        public misc.atapi_of_device_path_of_edd_device_params atapi;
        public ScsiDefinitions.scsi_of_device_path_of_edd_device_params scsi;
        public UsbDefinitions.usb_of_device_path_of_edd_device_params usb;
        public misc.i1394_of_device_path_of_edd_device_params i1394;
        public misc.fibre_of_device_path_of_edd_device_params fibre;
        public misc.i2o_of_device_path_of_edd_device_params i2o;
        public misc.raid_of_device_path_of_edd_device_params raid;
        public AtaDefinitions.ata_of_device_path_of_edd_device_params_and_sata_of_device_path_of_edd_device_params sata;
        public misc.unknown_of_device_path_of_edd_device_params unknown;
    }

    @Type(noCCodeGeneration=true, cType="struct device_node")
    @NotUsableInJava
    public static class device_node
    extends Struct {
        public String name;
        public @Unsigned @OriginalName(value="phandle") int phandle;
        public String full_name;
        public FwnodeDefinitions.fwnode_handle fwnode;
        public Ptr<property> properties;
        public Ptr<property> deadprops;
        public Ptr<device_node> parent;
        public Ptr<device_node> child;
        public Ptr<device_node> sibling;
        public @Unsigned long _flags;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct device_physical_location")
    @NotUsableInJava
    public static class device_physical_location
    extends Struct {
        public device_physical_location_panel panel;
        public device_physical_location_vertical_position vertical_position;
        public device_physical_location_horizontal_position horizontal_position;
        public boolean dock;
        public boolean lid;
    }

    @Type(noCCodeGeneration=true, cType="enum device_physical_location_horizontal_position")
    public static enum device_physical_location_horizontal_position implements Enum<device_physical_location_horizontal_position>,
    TypedEnum<device_physical_location_horizontal_position, Integer>
    {
        DEVICE_HORI_POS_LEFT,
        DEVICE_HORI_POS_CENTER,
        DEVICE_HORI_POS_RIGHT;

    }

    @Type(noCCodeGeneration=true, cType="enum device_physical_location_vertical_position")
    public static enum device_physical_location_vertical_position implements Enum<device_physical_location_vertical_position>,
    TypedEnum<device_physical_location_vertical_position, Integer>
    {
        DEVICE_VERT_POS_UPPER,
        DEVICE_VERT_POS_CENTER,
        DEVICE_VERT_POS_LOWER;

    }

    @Type(noCCodeGeneration=true, cType="enum device_physical_location_panel")
    public static enum device_physical_location_panel implements Enum<device_physical_location_panel>,
    TypedEnum<device_physical_location_panel, Integer>
    {
        DEVICE_PANEL_TOP,
        DEVICE_PANEL_BOTTOM,
        DEVICE_PANEL_LEFT,
        DEVICE_PANEL_RIGHT,
        DEVICE_PANEL_FRONT,
        DEVICE_PANEL_BACK,
        DEVICE_PANEL_UNKNOWN;

    }

    @Type(noCCodeGeneration=true, cType="enum device_removable")
    public static enum device_removable implements Enum<device_removable>,
    TypedEnum<device_removable, Integer>
    {
        DEVICE_REMOVABLE_NOT_SUPPORTED,
        DEVICE_REMOVABLE_UNKNOWN,
        DEVICE_FIXED,
        DEVICE_REMOVABLE;

    }

    @Type(noCCodeGeneration=true, cType="struct device_dma_parameters")
    @NotUsableInJava
    public static class device_dma_parameters
    extends Struct {
        public @Unsigned int max_segment_size;
        public @Unsigned int min_align_mask;
        public @Unsigned long segment_boundary_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct device_type")
    @NotUsableInJava
    public static class device_type
    extends Struct {
        public String name;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> groups;
        public Ptr<?> uevent;
        public Ptr<?> devnode;
        public Ptr<?> release;
        public Ptr<DevDefinitions.dev_pm_ops> pm;
    }

    @Type(noCCodeGeneration=true, cType="struct device_driver")
    @NotUsableInJava
    public static class device_driver
    extends Struct {
        public String name;
        public Ptr<BusDefinitions.bus_type> bus;
        public Ptr<runtime.module> owner;
        public String mod_name;
        public boolean suppress_bind_attrs;
        public ProbeDefinitions.probe_type probe_type;
        public Ptr<OfDefinitions.of_device_id> of_match_table;
        public Ptr<AcpiDefinitions.acpi_device_id> acpi_match_table;
        public Ptr<?> probe;
        public Ptr<?> sync_state;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> groups;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> dev_groups;
        public Ptr<DevDefinitions.dev_pm_ops> pm;
        public Ptr<?> coredump;
        public Ptr<DriverDefinitions.driver_private> p;
    }
}

