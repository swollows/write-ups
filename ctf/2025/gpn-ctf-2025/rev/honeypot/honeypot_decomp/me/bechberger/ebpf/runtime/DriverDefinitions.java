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
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KlistDefinitions;
import me.bechberger.ebpf.runtime.ModuleDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DriverDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __driver_attach(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __driver_attach_async_helper(Ptr<?> _dev, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__driver_probe_device((const struct device_driver*)$arg1, $arg2)")
    public static int __driver_probe_device(Ptr<DeviceDefinitions.device_driver> drv, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_allows_async_probing((const struct device_driver*)$arg1)")
    public static boolean driver_allows_async_probing(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_attach((const struct device_driver*)$arg1)")
    public static int driver_attach(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_bound(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_deferred_probe_add(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int driver_deferred_probe_check_state(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_deferred_probe_del(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_deferred_probe_trigger() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_detach((const struct device_driver*)$arg1)")
    public static void driver_detach(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_disconnect(Ptr<UsbDefinitions.usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_probe($arg1, (const struct usb_device_id*)$arg2)")
    public static int driver_probe(Ptr<UsbDefinitions.usb_interface> intf, Ptr<UsbDefinitions.usb_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_probe_device((const struct device_driver*)$arg1, $arg2)")
    public static int driver_probe_device(Ptr<DeviceDefinitions.device_driver> drv, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean driver_probe_done() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int driver_resume(Ptr<UsbDefinitions.usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int driver_suspend(Ptr<UsbDefinitions.usb_interface> intf,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int driver_sysfs_add(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long driver_override_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_override_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long driver_override_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_set_config_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_add_groups((const struct device_driver*)$arg1, (const struct attribute_group**)$arg2)")
    public static int driver_add_groups(Ptr<DeviceDefinitions.device_driver> drv, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_create_file((const struct device_driver*)$arg1, (const struct driver_attribute*)$arg2)")
    public static int driver_create_file(Ptr<DeviceDefinitions.device_driver> drv, Ptr<driver_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_find((const u8*)$arg1, (const struct bus_type*)$arg2)")
    public static Ptr<DeviceDefinitions.device_driver> driver_find(String name, Ptr<BusDefinitions.bus_type> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_find_device((const struct device_driver*)$arg1, $arg2, (const void*)$arg3, $arg4)")
    public static Ptr<runtime.device> driver_find_device(Ptr<DeviceDefinitions.device_driver> drv, Ptr<runtime.device> start, Ptr<?> data, @OriginalName(value="device_match_t") Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_for_each_device($arg1, $arg2, $arg3, (int (*)(struct device*, void*))$arg4)")
    public static int driver_for_each_device(Ptr<DeviceDefinitions.device_driver> drv, Ptr<runtime.device> start, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int driver_register(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_remove_file((const struct device_driver*)$arg1, (const struct driver_attribute*)$arg2)")
    public static void driver_remove_file(Ptr<DeviceDefinitions.device_driver> drv, Ptr<driver_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_remove_groups((const struct device_driver*)$arg1, (const struct attribute_group**)$arg2)")
    public static void driver_remove_groups(Ptr<DeviceDefinitions.device_driver> drv, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="driver_set_override($arg1, (const u8**)$arg2, (const u8*)$arg3, $arg4)")
    public static int driver_set_override(Ptr<runtime.device> dev, Ptr<String> override, String s2, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void driver_unregister(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct driver_attribute")
    @NotUsableInJava
    public static class driver_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct driver_private")
    @NotUsableInJava
    public static class driver_private
    extends Struct {
        public runtime.kobject kobj;
        public runtime.klist klist_devices;
        public KlistDefinitions.klist_node knode_bus;
        public Ptr<ModuleDefinitions.module_kobject> mkobj;
        public Ptr<DeviceDefinitions.device_driver> driver;
    }
}

