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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.SysDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PlatformDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_keyring_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_pci_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int platform_pci_probe(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> ent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_pci_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__platform_create_bundle($arg1, (int (*)(struct platform_device*))$arg2, $arg3, $arg4, (const void*)$arg5, $arg6, $arg7)")
    public static Ptr<platform_device> __platform_create_bundle(Ptr<platform_driver> driver, Ptr<?> probe2, Ptr<runtime.resource> res, @Unsigned int n_res, Ptr<?> data, @Unsigned long size, Ptr<runtime.module> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__platform_driver_probe($arg1, (int (*)(struct platform_device*))$arg2, $arg3)")
    public static int __platform_driver_probe(Ptr<platform_driver> drv, Ptr<?> probe2, Ptr<runtime.module> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __platform_driver_register(Ptr<platform_driver> drv, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__platform_get_irq_byname($arg1, (const u8*)$arg2)")
    public static int __platform_get_irq_byname(Ptr<platform_device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__platform_match($arg1, (const void*)$arg2)")
    public static int __platform_match(Ptr<runtime.device> dev, Ptr<?> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__platform_register_drivers((struct platform_driver**)$arg1, $arg2, $arg3)")
    public static int __platform_register_drivers(Ptr<Ptr<platform_driver>> drivers, @Unsigned int count, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_add_devices(Ptr<Ptr<platform_device>> devs, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short platform_dev_attrs_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_device_add(Ptr<platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_device_add_data($arg1, (const void*)$arg2, $arg3)")
    public static int platform_device_add_data(Ptr<platform_device> pdev, Ptr<?> data, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_device_add_resources($arg1, (const struct resource*)$arg2, $arg3)")
    public static int platform_device_add_resources(Ptr<platform_device> pdev, Ptr<runtime.resource> res, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_device_alloc((const u8*)$arg1, $arg2)")
    public static Ptr<platform_device> platform_device_alloc(String name, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_device_del(Ptr<platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_device_msi_free_irqs_all(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_device_msi_init_and_alloc_irqs(Ptr<runtime.device> dev, @Unsigned int nvec, @OriginalName(value="irq_write_msi_msg_t") Ptr<?> write_msi_msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_device_put(Ptr<platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_device_register(Ptr<platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_device_register_full((const struct platform_device_info*)$arg1)")
    public static Ptr<platform_device> platform_device_register_full(Ptr<platform_device_info> pdevinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_device_unregister(Ptr<platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_dma_cleanup(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_dma_configure(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_driver_unregister(Ptr<platform_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_find_device_by_driver($arg1, (const struct device_driver*)$arg2)")
    public static Ptr<runtime.device> platform_find_device_by_driver(Ptr<runtime.device> start, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_get_ethdev_address(Ptr<runtime.device> dev, Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_get_irq(Ptr<platform_device> dev, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_get_irq_byname($arg1, (const u8*)$arg2)")
    public static int platform_get_irq_byname(Ptr<platform_device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_get_irq_byname_optional($arg1, (const u8*)$arg2)")
    public static int platform_get_irq_byname_optional(Ptr<platform_device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_get_irq_optional(Ptr<platform_device> dev, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> platform_get_mem_or_io(Ptr<platform_device> dev, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> platform_get_resource(Ptr<platform_device> dev, @Unsigned int type2, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_get_resource_byname($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.resource> platform_get_resource_byname(Ptr<platform_device> dev, @Unsigned int type2, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_irq_count(Ptr<platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_match($arg1, (const struct device_driver*)$arg2)")
    public static int platform_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_msi_set_desc(Ptr< @OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info> arg2, Ptr<MsiDefinitions.msi_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_msi_write_msi_msg(Ptr<IrqDefinitions.irq_data> d, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_pm_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_pm_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_pm_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_pm_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_pm_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_pm_thaw(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_power_off_notify(Ptr<SysDefinitions.sys_off_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_probe(Ptr<runtime.device> _dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int platform_probe_fail(Ptr<platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_remove(Ptr<runtime.device> _dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void platform_shutdown(Ptr<runtime.device> _dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_uevent((const struct device*)$arg1, $arg2)")
    public static int platform_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="platform_unregister_drivers((struct platform_driver**)$arg1, $arg2)")
    public static void platform_unregister_drivers(Ptr<Ptr<platform_driver>> drivers, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct platform_object")
    @NotUsableInJava
    public static class platform_object
    extends Struct {
        public platform_device pdev;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct platform_device_info")
    @NotUsableInJava
    public static class platform_device_info
    extends Struct {
        public Ptr<runtime.device> parent;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public boolean of_node_reused;
        public String name;
        public int id;
        public Ptr<runtime.resource> res;
        public @Unsigned int num_res;
        public Ptr<?> data;
        public @Unsigned long size_data;
        public @Unsigned long dma_mask;
        public Ptr<misc.property_entry> properties;
    }

    @Type(noCCodeGeneration=true, cType="struct platform_hibernation_ops")
    @NotUsableInJava
    public static class platform_hibernation_ops
    extends Struct {
        public Ptr<?> begin;
        public Ptr<?> end;
        public Ptr<?> pre_snapshot;
        public Ptr<?> finish;
        public Ptr<?> prepare;
        public Ptr<?> enter;
        public Ptr<?> leave;
        public Ptr<?> pre_restore;
        public Ptr<?> restore_cleanup;
        public Ptr<?> recover;
    }

    @Type(noCCodeGeneration=true, cType="struct platform_s2idle_ops")
    @NotUsableInJava
    public static class platform_s2idle_ops
    extends Struct {
        public Ptr<?> begin;
        public Ptr<?> prepare;
        public Ptr<?> prepare_late;
        public Ptr<?> check;
        public Ptr<?> wake;
        public Ptr<?> restore_early;
        public Ptr<?> restore;
        public Ptr<?> end;
    }

    @Type(noCCodeGeneration=true, cType="struct platform_suspend_ops")
    @NotUsableInJava
    public static class platform_suspend_ops
    extends Struct {
        public Ptr<?> valid;
        public Ptr<?> begin;
        public Ptr<?> prepare;
        public Ptr<?> prepare_late;
        public Ptr<?> enter;
        public Ptr<?> wake;
        public Ptr<?> finish;
        public Ptr<?> suspend_again;
        public Ptr<?> end;
        public Ptr<?> recover;
    }

    @Type(noCCodeGeneration=true, cType="struct platform_driver")
    @NotUsableInJava
    public static class platform_driver
    extends Struct {
        public Ptr<?> probe;
        @InlineUnion(value=15458)
        public @InlineUnion(value=15458) Ptr<?> remove;
        @InlineUnion(value=15458)
        public @InlineUnion(value=15458) Ptr<?> remove_new;
        public Ptr<?> shutdown;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public DeviceDefinitions.device_driver driver;
        public Ptr<platform_device_id> id_table;
        public boolean prevent_deferred_probe;
        public boolean driver_managed_dma;
    }

    @Type(noCCodeGeneration=true, cType="struct platform_device_id")
    @NotUsableInJava
    public static class platform_device_id
    extends Struct {
        public char @Size(value=20) [] name;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct platform_device")
    @NotUsableInJava
    public static class platform_device
    extends Struct {
        public String name;
        public int id;
        public boolean id_auto;
        public runtime.device dev;
        public @Unsigned long platform_dma_mask;
        public DeviceDefinitions.device_dma_parameters dma_parms;
        public @Unsigned int num_resources;
        public Ptr<runtime.resource> resource;
        public Ptr<platform_device_id> id_entry;
        public String driver_override;
        public Ptr<misc.mfd_cell> mfd_cell;
        public misc.pdev_archdata archdata;
    }
}

