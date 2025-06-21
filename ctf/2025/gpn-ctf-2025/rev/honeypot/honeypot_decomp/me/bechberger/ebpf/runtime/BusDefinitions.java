/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class BusDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_iommu_probe((const struct bus_type*)$arg1)")
    public static int bus_iommu_probe(Ptr<bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bus_add_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bus_add_driver(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bus_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long bus_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_create_file((const struct bus_type*)$arg1, $arg2)")
    public static int bus_create_file(Ptr<bus_type> bus, Ptr<bus_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_find_device((const struct bus_type*)$arg1, $arg2, (const void*)$arg3, $arg4)")
    public static Ptr<runtime.device> bus_find_device(Ptr<bus_type> bus, Ptr<runtime.device> start, Ptr<?> data, @OriginalName(value="device_match_t") Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_for_each_dev((const struct bus_type*)$arg1, $arg2, $arg3, (int (*)(struct device*, void*))$arg4)")
    public static int bus_for_each_dev(Ptr<bus_type> bus, Ptr<runtime.device> start, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_for_each_drv((const struct bus_type*)$arg1, $arg2, $arg3, (int (*)(struct device_driver*, void*))$arg4)")
    public static int bus_for_each_drv(Ptr<bus_type> bus, Ptr<DeviceDefinitions.device_driver> start, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_get_dev_root((const struct bus_type*)$arg1)")
    public static Ptr<runtime.device> bus_get_dev_root(Ptr<bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_get_kset((const struct bus_type*)$arg1)")
    public static Ptr<runtime.kset> bus_get_kset(Ptr<bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long bus_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_is_registered((const struct bus_type*)$arg1)")
    public static boolean bus_is_registered(Ptr<bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bus_notify(Ptr<runtime.device> dev, bus_notifier_event value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bus_probe_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_register((const struct bus_type*)$arg1)")
    public static int bus_register(Ptr<bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_register_notifier((const struct bus_type*)$arg1, $arg2)")
    public static int bus_register_notifier(Ptr<bus_type> bus, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bus_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bus_remove_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bus_remove_driver(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_remove_file((const struct bus_type*)$arg1, $arg2)")
    public static void bus_remove_file(Ptr<bus_type> bus, Ptr<bus_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_rescan_devices((const struct bus_type*)$arg1)")
    public static int bus_rescan_devices(Ptr<bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bus_rescan_devices_helper(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_rescan_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long bus_rescan_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_sort_breadthfirst((const struct bus_type*)$arg1, (int (*)(const struct device*, const struct device*))$arg2)")
    public static void bus_sort_breadthfirst(Ptr<bus_type> bus, Ptr<?> compare) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_to_subsys((const struct bus_type*)$arg1)")
    public static Ptr<misc.subsys_private> bus_to_subsys(Ptr<bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_uevent_filter((const struct kobject*)$arg1)")
    public static int bus_uevent_filter(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_uevent_store((const struct bus_type*)$arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bus_uevent_store(Ptr<bus_type> bus, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_unregister((const struct bus_type*)$arg1)")
    public static void bus_unregister(Ptr<bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bus_unregister_notifier((const struct bus_type*)$arg1, $arg2)")
    public static int bus_unregister_notifier(Ptr<bus_type> bus, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum bus_notifier_event")
    public static enum bus_notifier_event implements Enum<bus_notifier_event>,
    TypedEnum<bus_notifier_event, Integer>
    {
        BUS_NOTIFY_ADD_DEVICE,
        BUS_NOTIFY_DEL_DEVICE,
        BUS_NOTIFY_REMOVED_DEVICE,
        BUS_NOTIFY_BIND_DRIVER,
        BUS_NOTIFY_BOUND_DRIVER,
        BUS_NOTIFY_UNBIND_DRIVER,
        BUS_NOTIFY_UNBOUND_DRIVER,
        BUS_NOTIFY_DRIVER_NOT_BOUND;

    }

    @Type(noCCodeGeneration=true, cType="struct bus_attribute")
    @NotUsableInJava
    public static class bus_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct bus_dma_region")
    @NotUsableInJava
    public static class bus_dma_region
    extends Struct {
        public @Unsigned @OriginalName(value="phys_addr_t") long cpu_start;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma_start;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct bus_type")
    @NotUsableInJava
    public static class bus_type
    extends Struct {
        public String name;
        public String dev_name;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> bus_groups;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> dev_groups;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> drv_groups;
        public Ptr<?> match;
        public Ptr<?> uevent;
        public Ptr<?> probe;
        public Ptr<?> sync_state;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public Ptr<?> online;
        public Ptr<?> offline;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> num_vf;
        public Ptr<?> dma_configure;
        public Ptr<?> dma_cleanup;
        public Ptr<DevDefinitions.dev_pm_ops> pm;
        public boolean need_parent_lock;
    }
}

