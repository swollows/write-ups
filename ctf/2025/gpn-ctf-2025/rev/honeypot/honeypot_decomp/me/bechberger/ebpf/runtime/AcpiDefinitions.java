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
import me.bechberger.ebpf.runtime.AmlDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.CppcDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.CpuidleDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DispatchDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.FreqDefinitions;
import me.bechberger.ebpf.runtime.FwDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.GpiodDefinitions;
import me.bechberger.ebpf.runtime.HwmonDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LpssDefinitions;
import me.bechberger.ebpf.runtime.MemoryDefinitions;
import me.bechberger.ebpf.runtime.OfDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.PowerDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.PwmDefinitions;
import me.bechberger.ebpf.runtime.ResourceDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SoftwareDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.SysDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.TrackDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.WakeupDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class AcpiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_acquire_global_lock(Ptr<@Unsigned Integer> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_bus_register_driver(Ptr<acpi_driver> driver, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__acpi_dev_get_resources($arg1, $arg2, (int (*)(struct acpi_resource*, void*))$arg3, $arg4, $arg5)")
    public static int __acpi_dev_get_resources(Ptr<acpi_device> adev, Ptr<ListDefinitions.list_head> list, Ptr<?> preproc, Ptr<?> preproc_data, String method) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__acpi_device_modalias((const struct acpi_device*)$arg1, $arg2, $arg3)")
    public static int __acpi_device_modalias(Ptr<acpi_device> adev, String buf, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__acpi_device_uevent_modalias((const struct acpi_device*)$arg1, $arg2)")
    public static int __acpi_device_uevent_modalias(Ptr<acpi_device> adev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_get_override_irq(@Unsigned int gsi, Ptr<@OriginalName(value="bool") Boolean> trigger, Ptr<@OriginalName(value="bool") Boolean> polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__acpi_handle_debug($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void __acpi_handle_debug(Ptr<runtime._ddebug> descriptor, @OriginalName(value="acpi_handle") Ptr<?> handle, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __acpi_map_table(@Unsigned long phys, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__acpi_match_device((const struct acpi_device*)$arg1, (const struct acpi_device_id*)$arg2, (const struct of_device_id*)$arg3, (const struct acpi_device_id**)$arg4, (const struct of_device_id**)$arg5)")
    public static boolean __acpi_match_device(Ptr<acpi_device> device2, Ptr<acpi_device_id> acpi_ids, Ptr<OfDefinitions.of_device_id> of_ids, Ptr<Ptr<acpi_device_id>> acpi_id, Ptr<Ptr<OfDefinitions.of_device_id>> of_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_mdiobus_register(Ptr<misc.mii_bus> mdio, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__acpi_node_get_property_reference((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int __acpi_node_get_property_reference(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname, @Unsigned long index2, @Unsigned long num_args, Ptr<FwnodeDefinitions.fwnode_reference_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_power_off(Ptr<acpi_power_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_power_on(Ptr<acpi_power_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __acpi_processor_get_throttling(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_processor_set_throttling(Ptr<acpi_processor> pr, int state2, boolean force, boolean direct) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_release_global_lock(Ptr<@Unsigned Integer> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __acpi_unmap_table(Ptr<?> map2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_acquire_global_lock(@Unsigned short timeout, Ptr<@Unsigned Integer> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_active_trip_temp(Ptr<acpi_device> adev, int id, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_device> acpi_add_power_resource(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_amd_wbrf_add_remove(Ptr<runtime.device> dev, @OriginalName(value="uint8_t") char action, Ptr<misc.wbrf_ranges_in_out> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_amd_wbrf_supported_consumer(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_amd_wbrf_supported_producer(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short acpi_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int attrno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_backlight(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_add(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long acpi_battery_alarm_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_battery_alarm_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long acpi_battery_alarm_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_battery_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_get_info(Ptr<acpi_battery> battery) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_get_property(Ptr<PowerDefinitions.power_supply> psy, PowerDefinitions.power_supply_property psp, Ptr<PowerDefinitions.power_supply_propval> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_get_state(Ptr<acpi_battery> battery) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_init_alarm(Ptr<acpi_battery> battery) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_battery_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_battery_quirks(Ptr<acpi_battery> battery) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_battery_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_set_alarm(Ptr<acpi_battery> battery) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_battery_update(Ptr<acpi_battery> battery, boolean resume) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_boot_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_boot_table_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_attach_private_data(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_bus_decode_usb_osc((const u8*)$arg1, $arg2)")
    public static void acpi_bus_decode_usb_osc(String msg, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_detach_private_data(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_bus_for_each_dev((int (*)(struct device*, void*))$arg1, $arg2)")
    public static int acpi_bus_for_each_dev(Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_get_private_data(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<Ptr<?>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_get_status(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_bus_get_status_handle(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@Unsigned Long> sta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int acpi_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int type2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_osc_negotiate_platform_control() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_osc_negotiate_usb_control() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_private_data_handler(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_bus_table_handler(@Unsigned int event2, Ptr<?> table, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_unregister_driver(Ptr<acpi_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_button_add(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_button_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_button_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_button_event(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_button_notify_run(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_button_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_button_remove_fs(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_button_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_button_state_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_button_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_check_address_range(@OriginalName(value="acpi_adr_space_type") char space_id, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned @OriginalName(value="acpi_size") long length, char warn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_check_dsm($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, $arg3, $arg4)")
    public static boolean acpi_check_dsm(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@OriginalName(value="guid_t") misc.uuid_t> guid, @Unsigned long rev, @Unsigned long funcs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct acpi_device*)acpi_companion_match((const struct device*)$arg1))")
    public static Ptr<acpi_device> acpi_companion_match(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_critical_trip_temp(Ptr<acpi_device> adev, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_data_add_buffer_props(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_device_data> data, Ptr<acpi_object> properties) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_data_add_props($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, $arg3)")
    public static Ptr<acpi_device_properties> acpi_data_add_props(Ptr<acpi_device_data> data, Ptr<@OriginalName(value="guid_t") misc.uuid_t> guid, Ptr<acpi_object> properties) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_data_get_property((const struct acpi_device_data*)$arg1, (const u8*)$arg2, $arg3, (const union acpi_object**)$arg4)")
    public static int acpi_data_get_property(Ptr<acpi_device_data> data, String name, @Unsigned @OriginalName(value="acpi_object_type") int type2, Ptr<Ptr<acpi_object>> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long acpi_data_node_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_data_node_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_data_prop_read((const struct acpi_device_data*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int acpi_data_prop_read(Ptr<acpi_device_data> data, String propname, DevDefinitions.dev_prop_type proptype, Ptr<?> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_classify_one_object(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_create_execution_thread(String method_name_arg, Ptr<String> arguments, Ptr<@Unsigned @OriginalName(value="acpi_object_type") Integer> types) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_create_execution_threads(String num_threads_arg, String num_loops_arg, String method_name_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_delete_objects(@Unsigned int count, Ptr<acpi_object> objects) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_display_statistics(String type_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_enumerate_object(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_execute(String name, Ptr<String> args, Ptr<@Unsigned @OriginalName(value="acpi_object_type") Integer> types, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_execute_method(Ptr<acpi_db_method_info> info2, Ptr<acpi_buffer> return_obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_execute_setup(Ptr<acpi_db_method_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_execution_walk(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_method_thread(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_single_execution_thread(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_decode_pld_buffer(Ptr<Character> in_buffer, @Unsigned @OriginalName(value="acpi_size") long length, Ptr<Ptr<acpi_pld_info>> return_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_decode_space(Ptr<ResourceDefinitions.resource_win> win, Ptr<acpi_resource_address> addr2, Ptr<acpi_address64_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_destroy_nondev_subnodes(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_filter_resource_type(Ptr<acpi_resource> ares, @Unsigned long types) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_for_each_child($arg1, (int (*)(struct acpi_device*, void*))$arg2, $arg3)")
    public static int acpi_dev_for_each_child(Ptr<acpi_device> adev, Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_for_each_child_reverse($arg1, (int (*)(struct acpi_device*, void*))$arg2, $arg3)")
    public static int acpi_dev_for_each_child_reverse(Ptr<acpi_device> adev, Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_for_one_check(Ptr<runtime.device> dev, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_found((const u8*)$arg1)")
    public static boolean acpi_dev_found(String hid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_free_resource_list(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_get_dma_resources(Ptr<acpi_device> adev, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_get_first_match_dev((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<acpi_device> acpi_dev_get_first_match_dev(String hid, String uid, long hrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_dev_get_irq_type(int triggering, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_get_irqresource(Ptr<runtime.resource> res, @Unsigned int gsi, char triggering, char polarity, char shareable, char wake_capable, boolean check_override) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_get_memory_resources(Ptr<acpi_device> adev, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_get_next_match_dev($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<acpi_device> acpi_dev_get_next_match_dev(Ptr<acpi_device> adev, String hid, String uid, long hrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_get_property((const struct acpi_device*)$arg1, (const u8*)$arg2, $arg3, (const union acpi_object**)$arg4)")
    public static int acpi_dev_get_property(Ptr<acpi_device> adev, String name, @Unsigned @OriginalName(value="acpi_object_type") int type2, Ptr<Ptr<acpi_object>> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_get_resources($arg1, $arg2, (int (*)(struct acpi_resource*, void*))$arg3, $arg4)")
    public static int acpi_dev_get_resources(Ptr<acpi_device> adev, Ptr<ListDefinitions.list_head> list, Ptr<?> preproc, Ptr<?> preproc_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_install_notify_handler(Ptr<acpi_device> adev, @Unsigned int handler_type, @OriginalName(value="acpi_notify_handler") Ptr<?> handler, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_ioresource_flags(Ptr<runtime.resource> res, @Unsigned long len, char io_decode, char translation_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_dev_irq_flags(char triggering, char polarity, char shareable, char wake_capable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_match_cb($arg1, (const void*)$arg2)")
    public static int acpi_dev_match_cb(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_memresource_flags(Ptr<runtime.resource> res, @Unsigned long len, char write_protect) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_present((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static boolean acpi_dev_present(String hid, String uid, long hrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_dev_process_resource(Ptr<acpi_resource> ares, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_remove_notify_handler(Ptr<acpi_device> adev, @Unsigned int handler_type, @OriginalName(value="acpi_notify_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_dev_resource_address_space(Ptr<acpi_resource> ares, Ptr<ResourceDefinitions.resource_win> win) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_dev_resource_ext_address_space(Ptr<acpi_resource> ares, Ptr<ResourceDefinitions.resource_win> win) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_dev_resource_interrupt(Ptr<acpi_resource> ares, int index2, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_dev_resource_io(Ptr<acpi_resource> ares, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_dev_resource_memory(Ptr<acpi_resource> ares, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_uid_to_integer(Ptr<acpi_device> adev, Ptr<@Unsigned Long> integer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_device_dep(@OriginalName(value="acpi_handle") Ptr<?> target, @OriginalName(value="acpi_handle") Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)acpi_device_get_match_data((const struct device*)$arg1))")
    public static Ptr<?> acpi_device_get_match_data(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_device_is_first_physical_node($arg1, (const struct device*)$arg2)")
    public static boolean acpi_device_is_first_physical_node(Ptr<acpi_device> adev, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_modalias(Ptr<runtime.device> dev, String buf, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_power_add_dependent(Ptr<acpi_device> adev, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_power_remove_dependent(Ptr<acpi_device> adev, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_remove_files(Ptr<acpi_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_setup_files(Ptr<acpi_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_sleep_wake(Ptr<acpi_device> dev, int enable, int sleep_state, int dev_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_device_uevent((const struct device*)$arg1, $arg2)")
    public static int acpi_device_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_device_uevent_modalias((const struct device*)$arg1, $arg2)")
    public static int acpi_device_uevent_modalias(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_disable_wakeup_device_power(Ptr<acpi_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dma_controller_free(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dma_controller_register($arg1, (struct dma_chan* (*)(struct acpi_dma_spec*, struct acpi_dma*))$arg2, $arg3)")
    public static int acpi_dma_controller_register(Ptr<runtime.device> dev, Ptr<?> acpi_dma_xlate, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dma_parse_fixed_dma(Ptr<acpi_resource> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dma_parse_resource_group((const struct acpi_csrt_group*)$arg1, $arg2, $arg3)")
    public static int acpi_dma_parse_resource_group(Ptr<acpi_csrt_group> grp, Ptr<acpi_device> adev, Ptr<acpi_dma> adma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_chan> acpi_dma_request_slave_chan_by_index(Ptr<runtime.device> dev, @Unsigned long index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dma_request_slave_chan_by_name($arg1, (const u8*)$arg2)")
    public static Ptr<DmaDefinitions.dma_chan> acpi_dma_request_slave_chan_by_name(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_chan> acpi_dma_simple_xlate(Ptr<acpi_dma_spec> dma_spec, Ptr<acpi_dma> adma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dock_add(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_driver_match_device($arg1, (const struct device_driver*)$arg2)")
    public static boolean acpi_driver_match_device(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_build_internal_buffer_obj(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, @Unsigned int buffer_length, Ptr<Ptr<acpi_operand_object>> obj_desc_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_build_internal_object(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, Ptr<Ptr<acpi_operand_object>> obj_desc_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_create_node(Ptr<acpi_walk_state> walk_state, Ptr<acpi_namespace_node> node2, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_walk_state> acpi_ds_create_walk_state(@Unsigned @OriginalName(value="acpi_owner_id") short owner_id, Ptr<acpi_parse_object> origin, Ptr<acpi_operand_object> method_desc, Ptr<acpi_thread_state> thread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_delete_walk_state(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_exec_begin_control_op(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_exec_end_control_op(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_walk_state> acpi_ds_get_current_walk_state(Ptr<acpi_thread_state> thread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_init_aml_walk(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, Ptr<acpi_namespace_node> method_node, Ptr<Character> aml_start, @Unsigned int aml_length, Ptr<acpi_evaluate_info> info2, char pass_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_init_callbacks(Ptr<acpi_walk_state> walk_state, @Unsigned int pass_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_init_object_from_op(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, @Unsigned short opcode, Ptr<Ptr<acpi_operand_object>> ret_obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_init_one_object(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_initialize_objects(@Unsigned int table_index, Ptr<acpi_namespace_node> start_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_load1_begin_op(Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_parse_object>> out_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_load1_end_op(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_obj_stack_pop(@Unsigned int pop_count, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_obj_stack_pop_and_delete(@Unsigned int pop_count, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_obj_stack_push(Ptr<?> object, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_walk_state> acpi_ds_pop_walk_state(Ptr<acpi_thread_state> thread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_push_walk_state(Ptr<acpi_walk_state> walk_state, Ptr<acpi_thread_state> thread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_result_pop(Ptr<Ptr<acpi_operand_object>> object, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_result_push(Ptr<acpi_operand_object> object, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_early_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_enable_wakeup_device_power(Ptr<acpi_device> dev, int sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_enumerate_nondev_subnodes(@OriginalName(value="acpi_handle") Ptr<?> scope, Ptr<acpi_object> desc, Ptr<acpi_device_data> data, Ptr<FwnodeDefinitions.fwnode_handle> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_acquire_global_lock(@Unsigned short timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_global_lock_handler(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_init_global_lock_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_install_gpe_handler(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, @Unsigned int type2, char is_raw_handler, @OriginalName(value="acpi_gpe_handler") Ptr<?> address, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_release_global_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_remove_global_lock_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_evaluate_dsm($arg1, (const struct {\n  u8 b[16];\n}*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<acpi_object> acpi_evaluate_dsm(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@OriginalName(value="guid_t") misc.uuid_t> guid, @Unsigned long rev, @Unsigned long func, Ptr<acpi_object> argv4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_evaluate_ej0(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_evaluate_integer(@OriginalName(value="acpi_handle") Ptr<?> handle, @OriginalName(value="acpi_string") String pathname, Ptr<acpi_object_list> arguments, Ptr<@Unsigned Long> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_evaluate_lck(@OriginalName(value="acpi_handle") Ptr<?> handle, int lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_evaluate_ost(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int source_event, @Unsigned int status_code, Ptr<acpi_buffer> status_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_evaluate_reference(@OriginalName(value="acpi_handle") Ptr<?> handle, @OriginalName(value="acpi_string") String pathname, Ptr<acpi_object_list> arguments, Ptr<acpi_handle_list> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_evaluate_reg(@OriginalName(value="acpi_handle") Ptr<?> handle, char space_id, @Unsigned int function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_evaluation_failure_warn($arg1, (const u8*)$arg2, $arg3)")
    public static void acpi_evaluation_failure_warn(@OriginalName(value="acpi_handle") Ptr<?> handle, String name, @Unsigned @OriginalName(value="acpi_status") int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_acquire_mutex(Ptr<acpi_operand_object> time_desc, Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_acquire_mutex_object(@Unsigned short timeout, Ptr<acpi_operand_object> obj_desc, @Unsigned long thread_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_add_table(@Unsigned int table_index, Ptr<Ptr<acpi_operand_object>> ddb_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_check_object_type(@Unsigned @OriginalName(value="acpi_object_type") int type_needed, @Unsigned @OriginalName(value="acpi_object_type") int this_type, Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ex_do_match(@Unsigned int match_op, Ptr<acpi_operand_object> package_obj, Ptr<acpi_operand_object> match_obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_load_op(Ptr<acpi_operand_object> obj_desc, Ptr<acpi_operand_object> target, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_load_table_op(Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_operand_object>> return_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_2A_0T_0R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_2A_0T_1R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_2A_1T_1R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_2A_2T_1R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_6A_0T_1R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_release_all_mutexes(Ptr<acpi_thread_state> thread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_release_mutex(Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_release_mutex_object(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_resolve_node_to_value(Ptr<Ptr<acpi_namespace_node>> object_ptr, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_resolve_operands(@Unsigned short opcode, Ptr<Ptr<acpi_operand_object>> stack_ptr, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_store_buffer_to_buffer(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> target_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_store_string_to_string(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> target_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_unlink_mutex(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_unload_table(Ptr<acpi_operand_object> ddb_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_execute_simple_method(@OriginalName(value="acpi_handle") Ptr<?> handle, String method, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_expose_nondev_subnodes(Ptr<runtime.kobject> kobj, Ptr<acpi_device_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_extract_apple_properties(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_extract_package(Ptr<acpi_object> _package, Ptr<acpi_buffer> format, Ptr<acpi_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_extract_power_resources(Ptr<acpi_object> _package, @Unsigned int start, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_extract_properties(@OriginalName(value="acpi_handle") Ptr<?> scope, Ptr<acpi_object> desc, Ptr<acpi_device_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_free_device_properties(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_free_properties(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_device_dma_supported((const struct fwnode_handle*)$arg1)")
    public static boolean acpi_fwnode_device_dma_supported(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_device_get_dma_attr((const struct fwnode_handle*)$arg1)")
    public static DevDefinitions.dev_dma_attr acpi_fwnode_device_get_dma_attr(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)acpi_fwnode_device_get_match_data((const struct fwnode_handle*)$arg1, (const struct device*)$arg2))")
    public static Ptr<?> acpi_fwnode_device_get_match_data(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_device_is_available((const struct fwnode_handle*)$arg1)")
    public static boolean acpi_fwnode_device_is_available(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_fwnode_get_name((const struct fwnode_handle*)$arg1))")
    public static String acpi_fwnode_get_name(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_fwnode_get_name_prefix((const struct fwnode_handle*)$arg1))")
    public static String acpi_fwnode_get_name_prefix(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_get_named_child_node((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> acpi_fwnode_get_named_child_node(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String childname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FwnodeDefinitions.fwnode_handle> acpi_fwnode_get_parent(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_get_reference_args((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static int acpi_fwnode_get_reference_args(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String prop, String nargs_prop, @Unsigned int args_count, @Unsigned int index2, Ptr<FwnodeDefinitions.fwnode_reference_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_graph_parse_endpoint((const struct fwnode_handle*)$arg1, $arg2)")
    public static int acpi_fwnode_graph_parse_endpoint(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<FwnodeDefinitions.fwnode_endpoint> endpoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_irq_get((const struct fwnode_handle*)$arg1, $arg2)")
    public static int acpi_fwnode_irq_get(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_property_present((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static boolean acpi_fwnode_property_present(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_property_read_int_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int acpi_fwnode_property_read_int_array(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname, @Unsigned int elem_size, Ptr<?> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fwnode_property_read_string_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8**)$arg3, $arg4)")
    public static int acpi_fwnode_property_read_string_array(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname, Ptr<String> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_generic_reduced_hw_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> acpi_get_first_physical_node(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_get_handle($arg1, (const u8*)$arg2, $arg3)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_handle(@OriginalName(value="acpi_handle") Ptr<?> parent, String pathname, Ptr<@OriginalName(value="acpi_handle") Ptr<?>> ret_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_local_address(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@Unsigned Integer> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_local_u64_address(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@Unsigned Long> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_lps0_constraint(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_name(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int name_type, Ptr<acpi_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_get_next_subnode((const struct fwnode_handle*)$arg1, $arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> acpi_get_next_subnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<FwnodeDefinitions.fwnode_handle> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_object_info(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<Ptr<acpi_device_info>> return_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_override_irq(@Unsigned int gsi, Ptr<Integer> is_level, Ptr<Integer> active_low) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_physical_device_location(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<Ptr<acpi_pld_info>> pld) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_get_ref_args($arg1, $arg2, (const union acpi_object**)$arg3, (const union acpi_object*)$arg4, $arg5)")
    public static int acpi_get_ref_args(Ptr<FwnodeDefinitions.fwnode_reference_args> args, Ptr<FwnodeDefinitions.fwnode_handle> ref_fwnode, Ptr<Ptr<acpi_object>> element, Ptr<acpi_object> end, @Unsigned long num_args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_get_subsystem_id($arg1))")
    public static String acpi_get_subsystem_id(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_graph_get_child_prop_value((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> acpi_graph_get_child_prop_value(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String prop_name, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_graph_get_next_endpoint((const struct fwnode_handle*)$arg1, $arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> acpi_graph_get_next_endpoint(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<FwnodeDefinitions.fwnode_handle> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_graph_get_remote_endpoint((const struct fwnode_handle*)$arg1)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> acpi_graph_get_remote_endpoint(Ptr<FwnodeDefinitions.fwnode_handle> __fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_gsi_to_irq(@Unsigned int gsi, Ptr<@Unsigned Integer> irqp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_handle_list_equal(Ptr<acpi_handle_list> list1, Ptr<acpi_handle_list> list2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_handle_list_free(Ptr<acpi_handle_list> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_handle_list_replace(Ptr<acpi_handle_list> dst, Ptr<acpi_handle_list> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_handle_path(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_handle_printk((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void acpi_handle_printk(String level, @OriginalName(value="acpi_handle") Ptr<?> handle, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_has_method(@OriginalName(value="acpi_handle") Ptr<?> handle, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_hide_nondev_subnodes(Ptr<acpi_device_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_hot_trip_temp(Ptr<acpi_device> adev, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_build_pci_list(@OriginalName(value="acpi_handle") Ptr<?> root_pci_device, @OriginalName(value="acpi_handle") Ptr<?> pci_region, Ptr<Ptr<acpi_pci_device>> return_list_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_clear_acpi_status() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_derive_pci_id(Ptr<acpi_pci_id> pci_id, @OriginalName(value="acpi_handle") Ptr<?> root_pci_device, @OriginalName(value="acpi_handle") Ptr<?> pci_region) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_hw_get_access_bit_width(@Unsigned long address, Ptr<acpi_generic_address> reg, char max_bit_width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_bit_register_info> acpi_hw_get_bit_register_info(@Unsigned int register_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_process_pci_list(Ptr<acpi_pci_id> pci_id, Ptr<acpi_pci_device> list_head2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_read(Ptr<@Unsigned Long> value, Ptr<acpi_generic_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_register_read(@Unsigned int register_id, Ptr<@Unsigned Integer> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_register_write(@Unsigned int register_id, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_validate_register(Ptr<acpi_generic_address> reg, char max_bit_width, Ptr<@Unsigned Long> address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_write(@Unsigned long value, Ptr<acpi_generic_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_write_pm1_control(@Unsigned int pm1a_control, @Unsigned int pm1b_control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_init_lpit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_init_properties(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_fixed_event_handler(@Unsigned int event2, @OriginalName(value="acpi_event_handler") Ptr<?> handler, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_global_event_handler(@OriginalName(value="acpi_gbl_event_handler") Ptr<?> handler, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_gpe_handler(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, @Unsigned int type2, @OriginalName(value="acpi_gpe_handler") Ptr<?> address, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_gpe_raw_handler(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, @Unsigned int type2, @OriginalName(value="acpi_gpe_handler") Ptr<?> address, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_interface(@OriginalName(value="acpi_string") String interface_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_interface_handler(@OriginalName(value="acpi_interface_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_method(Ptr<Character> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_notify_handler(@OriginalName(value="acpi_handle") Ptr<?> device2, @Unsigned int handler_type, @OriginalName(value="acpi_notify_handler") Ptr<?> handler, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_physical_table(@Unsigned @OriginalName(value="acpi_physical_address") long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_sci_handler(@OriginalName(value="acpi_sci_handler") Ptr<?> address, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_table(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ioapic_registered(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int gsi_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_is_processor_usable(@Unsigned int lapic_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_isa_irq_to_gsi(@Unsigned int isa_irq, Ptr<@Unsigned Integer> gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lid_initialize_state(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lid_input_open(Ptr<InputDefinitions.input_dev> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lid_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lid_notify_state(Ptr<acpi_device> device2, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lid_open() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_load_table(Ptr<acpi_table_header> table, Ptr<@Unsigned Integer> table_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_load_tables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_map_cpu(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned @OriginalName(value="phys_cpuid_t") int physid, @Unsigned int acpi_id, Ptr<Integer> pcpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct acpi_device_id*)acpi_match_acpi_device((const struct acpi_device_id*)$arg1, (const struct acpi_device*)$arg2))")
    public static Ptr<acpi_device_id> acpi_match_acpi_device(Ptr<acpi_device_id> ids, Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct acpi_device_id*)acpi_match_device((const struct acpi_device_id*)$arg1, (const struct device*)$arg2))")
    public static Ptr<acpi_device_id> acpi_match_device(Ptr<acpi_device_id> ids, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_match_device_ids($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_match_device_ids(Ptr<acpi_device> device2, Ptr<acpi_device_id> ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_match_platform_list((const struct acpi_platform_list*)$arg1)")
    public static int acpi_match_platform_list(Ptr<acpi_platform_list> plat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_mps_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_node_get_parent((const struct fwnode_handle*)$arg1)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> acpi_node_get_parent(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_node_prop_get((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3)")
    public static int acpi_node_prop_get(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname, Ptr<Ptr<?>> valptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_nondev_subnode_data_ok($arg1, (const union acpi_object*)$arg2, $arg3, $arg4)")
    public static boolean acpi_nondev_subnode_data_ok(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_object> link2, Ptr<ListDefinitions.list_head> list, Ptr<FwnodeDefinitions.fwnode_handle> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_nondev_subnode_extract($arg1, $arg2, (const union acpi_object*)$arg3, $arg4, $arg5)")
    public static boolean acpi_nondev_subnode_extract(Ptr<acpi_object> desc, @OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_object> link2, Ptr<ListDefinitions.list_head> list, Ptr<FwnodeDefinitions.fwnode_handle> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_nondev_subnode_tag(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_notify_device(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_attach_data(Ptr<acpi_namespace_node> node2, @OriginalName(value="acpi_object_handler") Ptr<?> handler, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_attach_object(Ptr<acpi_namespace_node> node2, Ptr<acpi_operand_object> object, @Unsigned @OriginalName(value="acpi_object_type") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_check_object_type(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr, @Unsigned int expected_btypes, @Unsigned int package_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_check_package(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_check_package_elements(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> elements, char type1, @Unsigned int count1, char type2, @Unsigned int count2, @Unsigned int start_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_check_package_list($arg1, (const union acpi_predefined_info*)$arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_check_package_list(Ptr<acpi_evaluate_info> info2, Ptr<acpi_predefined_info> _package, Ptr<Ptr<acpi_operand_object>> elements, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_check_return_value(Ptr<acpi_namespace_node> node2, Ptr<acpi_evaluate_info> info2, @Unsigned int user_param_count, @Unsigned @OriginalName(value="acpi_status") int return_status, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_ns_copy_device_id(Ptr<acpi_pnp_device_id> dest, Ptr<acpi_pnp_device_id> source, String string_area) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_custom_package(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> elements, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_detach_data(Ptr<acpi_namespace_node> node2, @OriginalName(value="acpi_object_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_detach_object(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_evaluate(Ptr<acpi_evaluate_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_get_attached_data(Ptr<acpi_namespace_node> node2, @OriginalName(value="acpi_object_handler") Ptr<?> handler, Ptr<Ptr<?>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_operand_object> acpi_ns_get_attached_object(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_operand_object> acpi_ns_get_secondary_object(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_search_and_enter(@Unsigned int target_name, Ptr<acpi_walk_state> walk_state, Ptr<acpi_namespace_node> node2,  @OriginalName(value="acpi_interpreter_mode") runtime.ACPI_IMODE interpreter_mode, @Unsigned @OriginalName(value="acpi_object_type") int type2, @Unsigned int flags, Ptr<Ptr<acpi_namespace_node>> return_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_search_one_scope(@Unsigned int target_name, Ptr<acpi_namespace_node> parent_node, @Unsigned @OriginalName(value="acpi_object_type") int type2, Ptr<Ptr<acpi_namespace_node>> return_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_search_parent_tree(@Unsigned int target_name, Ptr<acpi_namespace_node> node2, @Unsigned @OriginalName(value="acpi_object_type") int type2, Ptr<Ptr<acpi_namespace_node>> return_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_numa_processor_affinity_init(Ptr<acpi_srat_cpu_affinity> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_numa_x2apic_affinity_init(Ptr<acpi_srat_x2apic_cpu_affinity> pa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_of_match_device((const struct acpi_device*)$arg1, (const struct of_device_id*)$arg2, (const struct of_device_id**)$arg3)")
    public static boolean acpi_of_match_device(Ptr<acpi_device> adev, Ptr<OfDefinitions.of_device_id> of_match_table, Ptr<Ptr<OfDefinitions.of_device_id>> of_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_entries_array(String id, @Unsigned long table_size, Ptr<FwDefinitions.fw_table_header> table_header2, @Unsigned long max_length, Ptr<acpi_subtable_proc> proc, int proc_num, @Unsigned int max_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_fadt(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_hpet(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_int_src_ovr($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_int_src_ovr(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_ioapic($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_ioapic(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_lapic($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_lapic(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_lapic_addr_ovr($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_lapic_addr_ovr(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_lapic_nmi($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_lapic_nmi(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_madt(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_nmi_src($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_nmi_src(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_sapic($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_sapic(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_sbf(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_string_ref((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> acpi_parse_string_ref(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String refstring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_x2apic($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_x2apic(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_x2apic_nmi($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_x2apic_nmi(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_passive_trip_temp(Ptr<acpi_device> adev, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pcc_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_add_bus(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_pci_bridge_d3(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pci_power_t") int acpi_pci_choose_state(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_config_space_access(Ptr<PciDefinitions.pci_dev> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_device> acpi_pci_find_companion(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="acpi_handle") Ptr<?> acpi_pci_get_bridge_handle(Ptr<PciDefinitions.pci_bus> pbus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pci_power_t") int acpi_pci_get_power_state(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_irq_check_entry(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<PciDefinitions.pci_dev> dev, int pin, Ptr<acpi_pci_routing_table> prt, Ptr<Ptr<acpi_prt_entry>> entry_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_irq_disable(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_irq_enable(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_irq_find_prt_entry(Ptr<PciDefinitions.pci_dev> dev, int pin, Ptr<Ptr<acpi_prt_entry>> entry_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_prt_entry> acpi_pci_irq_lookup(Ptr<PciDefinitions.pci_dev> dev, int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_pci_need_resume(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_pci_power_manageable(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_refresh_power_state(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_remove_bus(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_addr_t") long acpi_pci_root_get_mcfg_addr(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_set_power_state(Ptr<PciDefinitions.pci_dev> dev, @OriginalName(value="pci_power_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_slot_enumerate(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_slot_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_slot_remove(Ptr<PciDefinitions.pci_bus> bus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_wakeup(Ptr<PciDefinitions.pci_dev> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pic_sci_set_trigger(@Unsigned int irq, @Unsigned short trigger) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_power_add_remove_device(Ptr<acpi_device> adev, boolean add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_power_expose_list($arg1, $arg2, (const struct attribute_group*)$arg3)")
    public static void acpi_power_expose_list(Ptr<acpi_device> adev, Ptr<ListDefinitions.list_head> resources, Ptr<AttributeDefinitions.attribute_group> attr_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_get_inferred_state(Ptr<acpi_device> device2, Ptr<Integer> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_power_hide_list($arg1, $arg2, (const struct attribute_group*)$arg3)")
    public static void acpi_power_hide_list(Ptr<acpi_device> adev, Ptr<ListDefinitions.list_head> resources, Ptr<AttributeDefinitions.attribute_group> attr_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_off_list(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_off_unlocked(Ptr<acpi_power_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_on_list(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_on_resources(Ptr<acpi_device> device2, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_on_unlocked(Ptr<acpi_power_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_power_resource_remove_dependent(Ptr<acpi_power_resource> resource2, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_power_resources_list_free(Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_power_sysfs_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_transition(Ptr<acpi_device> device2, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_wakeup_list_init(Ptr<ListDefinitions.list_head> list, Ptr<Integer> system_level_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_print_osc_error(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_osc_context> context2, String error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_platform_limit(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_throttling(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_throttling_control(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_throttling_fadt(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_throttling_info(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_throttling_ptc(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_throttling_states(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_tsd(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_reevaluate_tstate(Ptr<acpi_processor> pr, boolean is_dead) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_set_throttling(Ptr<acpi_processor> pr, int state2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_set_throttling_fadt(Ptr<acpi_processor> pr, int state2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_set_throttling_ptc(Ptr<acpi_processor> pr, int state2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long acpi_processor_throttling_fn(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_throttling_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_throttling_notifier(@Unsigned long event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_tstate_has_changed(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_update_tsd_coord() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ps_cleanup_scope(Ptr<acpi_parse_state> parser_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ps_delete_parse_tree(Ptr<acpi_parse_object> subtree_root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ps_get_argument_count(@Unsigned int op_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct acpi_opcode_info*)acpi_ps_get_opcode_info($arg1))")
    public static Ptr<acpi_opcode_info> acpi_ps_get_opcode_info(@Unsigned short opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ps_get_opcode_name($arg1))")
    public static String acpi_ps_get_opcode_name(@Unsigned short opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_parse_object> acpi_ps_get_parent_scope(Ptr<acpi_parse_state> parser_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ps_has_completed_scope(Ptr<acpi_parse_state> parser_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_init_scope(Ptr<acpi_parse_state> parser_state, Ptr<acpi_parse_object> root_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ps_pop_scope(Ptr<acpi_parse_state> parser_state, Ptr<Ptr<acpi_parse_object>> op, Ptr<@Unsigned Integer> arg_list, Ptr<@Unsigned Integer> arg_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_push_scope(Ptr<acpi_parse_state> parser_state, Ptr<acpi_parse_object> op, @Unsigned int remaining_args, @Unsigned int arg_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_purge_cached_objects() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_reduced_hardware() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_register_gsi(Ptr<runtime.device> dev, @Unsigned int gsi, int trigger, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_register_gsi_ioapic(Ptr<runtime.device> dev, @Unsigned int gsi, int trigger, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_register_gsi_pic(Ptr<runtime.device> dev, @Unsigned int gsi, int trigger, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_register_ioapic(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned long phys_addr, @Unsigned int gsi_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_register_lps0_dev(Ptr<acpi_s2idle_dev_ops> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_release_global_lock(@Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_release_power_resource(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_fixed_event_handler(@Unsigned int event2, @OriginalName(value="acpi_event_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_gpe_handler(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, @OriginalName(value="acpi_gpe_handler") Ptr<?> address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_interface(@OriginalName(value="acpi_string") String interface_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_notify_handler(@OriginalName(value="acpi_handle") Ptr<?> device2, @Unsigned int handler_type, @OriginalName(value="acpi_notify_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_sci_handler(@OriginalName(value="acpi_sci_handler") Ptr<?> address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_res_consumer_cb(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int depth, Ptr<?> context2, Ptr<Ptr<?>> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_device> acpi_resource_consumer(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_resume_power_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_rs_decode_bitmask(@Unsigned short mask, Ptr<Character> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_rs_dump_descriptor(Ptr<?> resource2, Ptr<acpi_rsdump_info> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_rs_dump_irq_list(Ptr<Character> route_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_rs_dump_resource_list(Ptr<acpi_resource> resource_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short acpi_rs_encode_bitmask(Ptr<Character> list, char count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_get_aei_method_data(Ptr<acpi_namespace_node> node2, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_get_aml_length(Ptr<acpi_resource> resource2, @Unsigned @OriginalName(value="acpi_size") long resource_list_size, Ptr<@Unsigned @OriginalName(value="acpi_size") Long> size_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_get_crs_method_data(Ptr<acpi_namespace_node> node2, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_get_list_length(Ptr<Character> aml_buffer, @Unsigned int aml_buffer_length, Ptr<@Unsigned @OriginalName(value="acpi_size") Long> size_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_rs_get_method_data($arg1, (const u8*)$arg2, $arg3)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_get_method_data(@OriginalName(value="acpi_handle") Ptr<?> handle, String path2, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_get_pci_routing_table_length(Ptr<acpi_operand_object> package_object, Ptr<@Unsigned @OriginalName(value="acpi_size") Long> buffer_size_needed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_get_prs_method_data(Ptr<acpi_namespace_node> node2, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_get_prt_method_data(Ptr<acpi_namespace_node> node2, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_rs_length") short acpi_rs_get_resource_source(@Unsigned @OriginalName(value="acpi_rs_length") short resource_length, @Unsigned @OriginalName(value="acpi_rs_length") short minimum_length, Ptr<acpi_resource_source> resource_source, Ptr<AmlDefinitions.aml_resource> aml, String string_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_rs_move_data(Ptr<?> destination, Ptr<?> source, @Unsigned short item_count, char move_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_rs_set_resource_header(char descriptor_type, @Unsigned @OriginalName(value="acpi_rsdesc_size") int total_length, Ptr<AmlDefinitions.aml_resource> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_rs_set_resource_length(@Unsigned @OriginalName(value="acpi_rsdesc_size") int total_length, Ptr<AmlDefinitions.aml_resource> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_rsdesc_size") int acpi_rs_set_resource_source(Ptr<AmlDefinitions.aml_resource> aml, @Unsigned @OriginalName(value="acpi_rs_length") short minimum_length, Ptr<acpi_resource_source> resource_source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_set_srs_method_data(Ptr<acpi_namespace_node> node2, Ptr<acpi_buffer> in_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_run_hpx(Ptr<PciDefinitions.pci_dev> dev, @OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_run_osc(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_osc_context> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_s2idle_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_s2idle_prepare_late() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_s2idle_restore_early() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_s2idle_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_sb_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_sci_ioapic_setup(char bus_irq, @Unsigned short polarity, @Unsigned short trigger, @Unsigned int gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_send_edr_status(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_dev> edev, @Unsigned short status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_set_modalias($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static void acpi_set_modalias(Ptr<acpi_device> adev, String default_id, String modalias, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_show_attr($arg1, (const struct device_attribute*)$arg2)")
    public static boolean acpi_show_attr(Ptr<acpi_device> dev, Ptr<DeviceDefinitions.device_attribute> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_sleep_run_lps0_dsm(@Unsigned int func, @Unsigned int func_mask, @OriginalName(value="guid_t") misc.uuid_t dsm_guid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_subsystem_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_load_namespace() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_terminate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_tie_nondev_subnodes(Ptr<acpi_device_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_trip_temp(Ptr<acpi_device> adev, String obj_name, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_turn_off_unused_power_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_unload_parent_table(@OriginalName(value="acpi_handle") Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_unload_table(@Unsigned int table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_unmap_cpu(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_unregister_gsi(@Unsigned int gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_unregister_gsi_ioapic(@Unsigned int gsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_unregister_ioapic(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int gsi_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_unregister_lps0_dev(Ptr<acpi_s2idle_dev_ops> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_untie_nondev_subnodes(Ptr<acpi_device_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_update_interfaces(char action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_allocate_object_desc_dbg((const u8*)$arg1, $arg2, $arg3)")
    public static Ptr<?> acpi_ut_allocate_object_desc_dbg(String module_name, @Unsigned int line_number, @Unsigned int component_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_ascii_char_to_hex(int hex_char) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_ascii_to_hex_byte(String two_ascii_chars, Ptr<Character> return_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_operand_object> acpi_ut_create_buffer_object(@Unsigned @OriginalName(value="acpi_size") long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_create_caches() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_operand_object> acpi_ut_create_integer_object(@Unsigned long initial_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_create_internal_object_dbg((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<acpi_operand_object> acpi_ut_create_internal_object_dbg(String module_name, @Unsigned int line_number, @Unsigned int component_id, @Unsigned @OriginalName(value="acpi_object_type") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_operand_object> acpi_ut_create_package_object(@Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_operand_object> acpi_ut_create_string_object(@Unsigned @OriginalName(value="acpi_size") long string_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_create_update_state_and_push(Ptr<acpi_operand_object> object, @Unsigned short action, Ptr<Ptr<acpi_generic_state>> state_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_delete_caches() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_delete_object_desc(Ptr<acpi_operand_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_display_init_pathname($arg1, $arg2, (const u8*)$arg3)")
    public static void acpi_ut_display_init_pathname(char type2, Ptr<acpi_namespace_node> obj_handle, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ut_dword_byte_swap(@Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_argument_type_name($arg1))")
    public static String acpi_ut_get_argument_type_name(@Unsigned int arg_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_descriptor_name($arg1))")
    public static String acpi_ut_get_descriptor_name(Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_get_element_length(char object_type, Ptr<acpi_operand_object> source_object, Ptr<acpi_generic_state> state2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_event_name($arg1))")
    public static String acpi_ut_get_event_name(@Unsigned int event_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_mutex_name($arg1))")
    public static String acpi_ut_get_mutex_name(@Unsigned int mutex_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_node_name($arg1))")
    public static String acpi_ut_get_node_name(Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_notify_name($arg1, $arg2))")
    public static String acpi_ut_get_notify_name(@Unsigned int notify_value, @Unsigned @OriginalName(value="acpi_object_type") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_get_object_size(Ptr<acpi_operand_object> internal_object, Ptr<@Unsigned @OriginalName(value="acpi_size") Long> obj_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_object_type_name($arg1))")
    public static String acpi_ut_get_object_type_name(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_reference_name($arg1))")
    public static String acpi_ut_get_reference_name(Ptr<acpi_operand_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_region_name($arg1))")
    public static String acpi_ut_get_region_name(char space_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_get_simple_object_size(Ptr<acpi_operand_object> internal_object, Ptr<@Unsigned @OriginalName(value="acpi_size") Long> obj_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_ut_get_type_name($arg1))")
    public static String acpi_ut_get_type_name(@Unsigned @OriginalName(value="acpi_object_type") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_hex_to_ascii_char(@Unsigned long integer, @Unsigned int position) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_init_globals() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_initialize_buffer(Ptr<acpi_buffer> buffer, @Unsigned @OriginalName(value="acpi_size") long required_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_is_pci_root_bridge(String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_method_error((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static void acpi_ut_method_error(String module_name, @Unsigned int line_number, String message, Ptr<acpi_namespace_node> prefix_node, String path2, @Unsigned @OriginalName(value="acpi_status") int method_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_predefined_bios_error((const u8*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6_)")
    public static void acpi_ut_predefined_bios_error(String module_name, @Unsigned int line_number, String pathname, @Unsigned short node_flags, String format, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_predefined_info((const u8*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6_)")
    public static void acpi_ut_predefined_info(String module_name, @Unsigned int line_number, String pathname, @Unsigned short node_flags, String format, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_predefined_warning((const u8*)$arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6_)")
    public static void acpi_ut_predefined_warning(String module_name, @Unsigned int line_number, String pathname, @Unsigned short node_flags, String format, Object ... param5) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_prefixed_namespace_error((const u8*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static void acpi_ut_prefixed_namespace_error(String module_name, @Unsigned int line_number, Ptr<acpi_generic_state> prefix_scope, String internal_path, @Unsigned @OriginalName(value="acpi_status") int lookup_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_print_string(String string, @Unsigned short max_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_repair_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_set_integer_width(char revision) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_subsystem_shutdown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_valid_internal_object(Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_valid_object_type(@Unsigned @OriginalName(value="acpi_object_type") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_validate_buffer(Ptr<acpi_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_walk_package_tree(Ptr<acpi_operand_object> source_object, Ptr<?> target_object, @OriginalName(value="acpi_pkg_callback") Ptr<?> walk_callback, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __acpi_ec_flush_work() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_acquire_mutex(@OriginalName(value="acpi_handle") Ptr<?> handle, @OriginalName(value="acpi_string") String pathname, @Unsigned short timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_any_gpe_status_set(@Unsigned int gpe_skip_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bert_data_init(Ptr<?> th, Ptr<acpi_data_attr> data_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bind_memblk(Ptr<MemoryDefinitions.memory_block> mem, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_bios_error((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void acpi_bios_error(String module_name, @Unsigned int line_number, String format, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_bios_exception((const u8*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static void acpi_bios_exception(String module_name, @Unsigned int line_number, @Unsigned @OriginalName(value="acpi_status") int status, String format, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_bios_warning((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void acpi_bios_warning(String module_name, @Unsigned int line_number, String format, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ccel_data_init(Ptr<?> th, Ptr<acpi_data_attr> data_attr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_check_wakeup_handlers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_clear_event(@Unsigned int event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_clear_gpe(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_container_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_container_offline(Ptr<misc.container_dev> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_container_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long acpi_data_show(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long offset, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_bus_walk(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_check_integrity() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_check_predefined_names() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_command_dispatch(String input_buffer, Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_decode_and_display_object(String target, String output_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_argument_object(Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_arguments() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_calling_tree() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_db_display_command_info((const u8*)$arg1, $arg2)")
    public static void acpi_db_display_command_info(String command, char display_all) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_display_fields(@Unsigned int address_space_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_handlers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_locals() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_method_info(Ptr<acpi_parse_object> start_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_display_non_root_handlers(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_object_type(String object_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_display_objects(String obj_type_arg, String display_count_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_result_object(Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_results() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_dump_namespace(String start_arg, String depth_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_dump_namespace_by_owner(String owner_arg, String depth_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_dump_namespace_paths() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_execute_thread(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_find_name_in_namespace(String name_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_find_references(String object_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_get_bus_info() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_db_get_next_token(String string, Ptr<String> next, Ptr<@Unsigned @OriginalName(value="acpi_object_type") Integer> return_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_integrity_walk(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_set_scope(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_user_commands() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_walk_and_match_name(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_walk_for_fields(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_walk_for_object_counts(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_walk_for_predefined_names(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_walk_for_references(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_walk_for_specific_objects(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_debug_print($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, (const u8*)$arg6, $arg7_)")
    public static void acpi_debug_print(@Unsigned int requested_debug_level, @Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, String format, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_debug_print_raw($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, (const u8*)$arg6, $arg7_)")
    public static void acpi_debug_print_raw(@Unsigned int requested_debug_level, @Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, String format, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_disable_all_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_disable_event(@Unsigned int event2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_disable_gpe(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_disable_wakeup_devices(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_dispatch_gpe(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_build_internal_package_obj(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, @Unsigned int element_count, Ptr<Ptr<acpi_operand_object>> obj_desc_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_create_bank_field(Ptr<acpi_parse_object> op, Ptr<acpi_namespace_node> region_node, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_create_buffer_field(Ptr<acpi_parse_object> op, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_create_field(Ptr<acpi_parse_object> op, Ptr<acpi_namespace_node> region_node, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_create_index_field(Ptr<acpi_parse_object> op, Ptr<acpi_namespace_node> region_node, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_get_field_names(Ptr<acpi_create_field_info> info2, Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_init_field_objects(Ptr<acpi_parse_object> op, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_init_package_element(char object_type, Ptr<acpi_operand_object> source_object, Ptr<acpi_generic_state> state2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_resolve_package_element(Ptr<Ptr<acpi_operand_object>> element_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_early_processor_set_pdc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_add(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_add_query_handler(Ptr<acpi_ec> ec, char query_bit, @OriginalName(value="acpi_handle") Ptr<?> handle, @OriginalName(value="acpi_ec_query_func") Ptr<?> func, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_ec> acpi_ec_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_block_transactions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_close_event(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_complete_request(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_ec_dispatch_gpe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_dsdt_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_ecdt_probe() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_enable_event(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_event_handler(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_event_processor(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_flush_work() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_free(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ec_gpe_handler(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn acpi_ec_irq_handler(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_mark_gpe_for_wake() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_mask_events(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_register_opregions(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ec_register_query_methods(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_remove_query_handler(Ptr<acpi_ec> ec, char query_bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_remove_query_handlers(Ptr<acpi_ec> ec, boolean remove_all, char query_bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_set_gpe_wake_mask(char action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ec_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bits, Ptr<@Unsigned Long> value64, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_start(Ptr<acpi_ec> ec, boolean resuming) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_ec_started(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_stop(Ptr<acpi_ec> ec, boolean suspending) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_ec_stopped(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_submit_query(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_submit_request(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_suspend_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_transaction(Ptr<acpi_ec> ec, Ptr<transaction> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ec_transaction_unlocked(Ptr<acpi_ec> ec, Ptr<transaction> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_unblock_transactions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ec_unmask_events(Ptr<acpi_ec> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enable_all_runtime_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enable_all_wakeup_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enable_event(@Unsigned int event2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enable_gpe(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_enable_wakeup_devices(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enter_sleep_state(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enter_sleep_state_prep(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enter_sleep_state_s4bios() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_error((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void acpi_error(String module_name, @Unsigned int line_number, String format, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_delete_gpe_handlers(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_info, Ptr<acpi_gpe_block_info> gpe_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_delete_gpe_xrupt(Ptr<acpi_gpe_xrupt_info> gpe_xrupt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_get_gpe_device(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_info, Ptr<acpi_gpe_block_info> gpe_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_get_gpe_xrupt_block(@Unsigned int interrupt_number, Ptr<Ptr<acpi_gpe_xrupt_info>> gpe_xrupt_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_gpe_initialize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_gpe_xrupt_handler(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_install_sci_handler() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_match_gpe_method(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_remove_all_sci_handlers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_sci_dispatch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_sci_xrupt_handler(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ev_update_gpes(@Unsigned @OriginalName(value="acpi_owner_id") short table_owner_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_walk_gpe_list(@OriginalName(value="acpi_gpe_callback") Ptr<?> gpe_walk_callback, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_acquire_global_lock(@Unsigned int field_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_do_logical_numeric_op(@Unsigned short opcode, @Unsigned long integer0, @Unsigned long integer1, Ptr<Character> logical_result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_do_logical_op(@Unsigned short opcode, Ptr<acpi_operand_object> operand0, Ptr<acpi_operand_object> operand1, Ptr<Character> logical_result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_ex_do_math_op(@Unsigned short opcode, @Unsigned long integer0, @Unsigned long integer1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_dump_namespace_node(Ptr<acpi_namespace_node> node2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_dump_object(Ptr<acpi_operand_object> obj_desc, Ptr<acpi_exdump_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_dump_object_descriptor(Ptr<acpi_operand_object> obj_desc, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_dump_operand(Ptr<acpi_operand_object> obj_desc, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ex_dump_operands($arg1, (const u8*)$arg2, $arg3)")
    public static void acpi_ex_dump_operands(Ptr<Ptr<acpi_operand_object>> operands, String opcode_name, @Unsigned int num_operands) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_dump_package_obj(Ptr<acpi_operand_object> obj_desc, @Unsigned int level, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_dump_reference_obj(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_eisa_id_to_string(String out_string, @Unsigned long compressed_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_enter_interpreter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_exit_interpreter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_get_object_reference(Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> return_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_integer_to_string(String out_string, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_0A_0T_1R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_1A_0T_0R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_1A_0T_1R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_1A_1T_1R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_3A_0T_0R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_opcode_3A_1T_1R(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_pci_cls_to_string(String out_string, Ptr<Character> class_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_release_global_lock(@Unsigned int field_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_resolve_object(Ptr<Ptr<acpi_operand_object>> source_desc_ptr, @Unsigned @OriginalName(value="acpi_object_type") int target_type2, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_store_object_to_object(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> dest_desc, Ptr<Ptr<acpi_operand_object>> new_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ex_truncate_for32bit_table(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_exception((const u8*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static void acpi_exception(String module_name, @Unsigned int line_number, @Unsigned @OriginalName(value="acpi_status") int status, String format, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_fan_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_fan_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_fan_get_fst(Ptr<acpi_device> device2, Ptr<acpi_fan_fst> fst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_fan_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_fan_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_fan_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fan_speed_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int acpi_fan_speed_cmp(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_fan_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_finish_gpe(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_format_exception($arg1))")
    public static String acpi_format_exception(@Unsigned @OriginalName(value="acpi_status") int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_cpuid(@OriginalName(value="acpi_handle") Ptr<?> handle, int type2, @Unsigned int acpi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_event_status(@Unsigned int event2, Ptr<@Unsigned @OriginalName(value="acpi_event_status") Integer> event_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_gpe_device(@Unsigned int index2, Ptr<@OriginalName(value="acpi_handle") Ptr<?>> gpe_device) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_gpe_status(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, Ptr<@Unsigned @OriginalName(value="acpi_event_status") Integer> event_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_ioapic_id(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int gsi_base, Ptr<@Unsigned Long> phys_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_madt_revision() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_next_object(@Unsigned @OriginalName(value="acpi_object_type") int type2, @OriginalName(value="acpi_handle") Ptr<?> parent, @OriginalName(value="acpi_handle") Ptr<?> child, Ptr<@OriginalName(value="acpi_handle") Ptr<?>> ret_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_node(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_parent(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@OriginalName(value="acpi_handle") Ptr<?>> ret_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_cpuid_t") int acpi_get_phys_id(@OriginalName(value="acpi_handle") Ptr<?> handle, int type2, @Unsigned int acpi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_type(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@Unsigned @OriginalName(value="acpi_object_type") Integer> ret_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_global_event_handler(@Unsigned int event_type, @OriginalName(value="acpi_handle") Ptr<?> device2, @Unsigned int event_number, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_gpe_apply_masked_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_gpe_set_masked_gpes(String val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_graph_ignore_port(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_has_watchdog() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_hest_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_read_port(@Unsigned @OriginalName(value="acpi_io_address") long address, Ptr<@Unsigned Integer> value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_validate_io_block(@Unsigned long address, @Unsigned int bit_width, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_validate_io_request(@Unsigned @OriginalName(value="acpi_io_address") long address, @Unsigned int bit_width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_write_port(@Unsigned @OriginalName(value="acpi_io_address") long address, @Unsigned int value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_info((const u8*)$arg1, $arg2_)")
    public static void acpi_info(String format, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_gpe_block(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, Ptr<acpi_generic_address> gpe_block_address, @Unsigned int register_count, @Unsigned int interrupt_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_int340x_thermal_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_irq_stats_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_is_pnp_device(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_is_valid_space_id(char space_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_leave_sleep_state(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_leave_sleep_state_prep(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_activate(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lpss_bind(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_lpss_create_device($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_lpss_create_device(Ptr<acpi_device> adev, Ptr<acpi_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lpss_create_device_links(Ptr<acpi_device> adev, Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lpss_dismiss(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_do_suspend_late(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lpss_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_platform_notify(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_poweroff_late(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_poweroff_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_restore_early(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_restore_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_resume_early(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lpss_save_ctx(Ptr<runtime.device> dev, Ptr<LpssDefinitions.lpss_private_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lpss_set_ltr(Ptr<runtime.device> dev, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_suspend(Ptr<runtime.device> dev, boolean wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_suspend_late(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpss_suspend_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lpss_unbind(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_map_cpuid(@Unsigned @OriginalName(value="phys_cpuid_t") int phys_id, @Unsigned int acpi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="phys_cpuid_t") int acpi_map_madt_entry(@Unsigned int acpi_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_map_pxm_to_node(int pxm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_mark_gpe_for_wake(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_mask_gpe(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, char is_masked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_memory_device_add($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_memory_device_add(Ptr<acpi_device> device2, Ptr<acpi_device_id> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_memory_device_free(Ptr<acpi_memory_device> mem_device) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_memory_device_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_memory_enable_device(Ptr<acpi_memory_device> mem_device) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_memory_get_resource(Ptr<acpi_resource> resource2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_memory_hotplug_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.crs_csi2> acpi_mipi_add_crs_csi2(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<ListDefinitions.list_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_mipi_check_crs_csi2(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_mipi_crs_csi2_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_mipi_data_tag(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_mipi_init_crs_csi2_swnodes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_mipi_scan_crs_csi2() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_nhlt_endpoint_find_fmtcfg((const struct acpi_nhlt_endpoint*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<acpi_nhlt_format_config> acpi_nhlt_endpoint_find_fmtcfg(Ptr<acpi_nhlt_endpoint> ep, @Unsigned short ch, @Unsigned int rate, @Unsigned short vbps, @Unsigned short bps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_nhlt_endpoint_match((const struct acpi_nhlt_endpoint*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static boolean acpi_nhlt_endpoint_match(Ptr<acpi_nhlt_endpoint> ep, int link_type, int dev_type2, int dir, int bus_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_nhlt_endpoint_mic_count((const struct acpi_nhlt_endpoint*)$arg1)")
    public static int acpi_nhlt_endpoint_mic_count(Ptr<acpi_nhlt_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_nhlt_endpoint> acpi_nhlt_find_endpoint(int link_type, int dev_type2, int dir, int bus_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_nhlt_format_config> acpi_nhlt_find_fmtcfg(int link_type, int dev_type2, int dir, int bus_id, @Unsigned short ch, @Unsigned int rate, @Unsigned short vbps, @Unsigned short bps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_nhlt_get_gbl_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_nhlt_put_gbl_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_nhlt_tb_find_endpoint((const struct acpi_table_nhlt*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<acpi_nhlt_endpoint> acpi_nhlt_tb_find_endpoint(Ptr<acpi_table_nhlt> tb, int link_type, int dev_type2, int dir, int bus_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_nhlt_tb_find_fmtcfg((const struct acpi_table_nhlt*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<acpi_nhlt_format_config> acpi_nhlt_tb_find_fmtcfg(Ptr<acpi_table_nhlt> tb, int link_type, int dev_type2, int dir, int bus_id, @Unsigned short ch, @Unsigned int rate, @Unsigned short vbps, @Unsigned short bps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_node_backed_by_real_pxm(int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_check_acpi_compliance($arg1, $arg2, (const union acpi_predefined_info*)$arg3)")
    public static void acpi_ns_check_acpi_compliance(String pathname, Ptr<acpi_namespace_node> node2, Ptr<acpi_predefined_info> predefined) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_check_argument_count($arg1, $arg2, $arg3, (const union acpi_predefined_info*)$arg4)")
    public static void acpi_ns_check_argument_count(String pathname, Ptr<acpi_namespace_node> node2, @Unsigned int user_param_count, Ptr<acpi_predefined_info> predefined) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_check_argument_types(Ptr<acpi_evaluate_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_dump_entry(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int debug_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_dump_object_paths(@Unsigned @OriginalName(value="acpi_object_type") int type2, char display_type, @Unsigned int max_depth, @Unsigned @OriginalName(value="acpi_owner_id") short owner_id, @OriginalName(value="acpi_handle") Ptr<?> start_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_dump_objects(@Unsigned @OriginalName(value="acpi_object_type") int type2, char display_type, @Unsigned int max_depth, @Unsigned @OriginalName(value="acpi_owner_id") short owner_id, @OriginalName(value="acpi_handle") Ptr<?> start_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_dump_one_object(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_dump_one_object_path(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_execute_table(@Unsigned int table_index, Ptr<acpi_namespace_node> start_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_get_max_depth(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_namespace_node> acpi_ns_get_next_node(Ptr<acpi_namespace_node> parent_node, Ptr<acpi_namespace_node> child_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_namespace_node> acpi_ns_get_next_node_typed(@Unsigned @OriginalName(value="acpi_object_type") int type2, Ptr<acpi_namespace_node> parent_node, Ptr<acpi_namespace_node> child_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_load_table(@Unsigned int table_index, Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_lookup(Ptr<acpi_generic_state> scope_info, String pathname, @Unsigned @OriginalName(value="acpi_object_type") int type2,  @OriginalName(value="acpi_interpreter_mode") runtime.ACPI_IMODE interpreter_mode, @Unsigned int flags, Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_namespace_node>> return_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_one_complete_parse(@Unsigned int pass_number, @Unsigned int table_index, Ptr<acpi_namespace_node> start_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_parse_table(@Unsigned int table_index, Ptr<acpi_namespace_node> start_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_print_pathname($arg1, (const u8*)$arg2)")
    public static void acpi_ns_print_pathname(@Unsigned int num_segments, String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_root_initialize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_walk_namespace(@Unsigned @OriginalName(value="acpi_object_type") int type2, @OriginalName(value="acpi_handle") Ptr<?> start_node, @Unsigned int max_depth, @Unsigned int flags, @OriginalName(value="acpi_walk_callback") Ptr<?> descending_callback, @OriginalName(value="acpi_walk_callback") Ptr<?> ascending_callback, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_numa_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_nvs_for_each_region((int (*)(long long unsigned int, long long unsigned int, void*))$arg1, $arg2)")
    public static int acpi_nvs_for_each_region(Ptr<?> func, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_nvs_register(@Unsigned long start, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_bgrt(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_cfmws($arg1, $arg2, (const long unsigned int)$arg3)")
    public static int acpi_parse_cfmws(Ptr<acpi_subtable_headers> header, Ptr<?> arg2, @Unsigned long table_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_gi_affinity($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_gi_affinity(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_gicc_affinity($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_gicc_affinity(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_memory_affinity($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_memory_affinity(Ptr<acpi_subtable_headers> header, @Unsigned long table_end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_processor_affinity($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_processor_affinity(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_rintc_affinity($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_rintc_affinity(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_slit(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_srat(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_x2apic_affinity($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_x2apic_affinity(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_pnp_attach($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_pnp_attach(Ptr<acpi_device> adev, Ptr<acpi_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pnp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_pnp_match((const u8*)$arg1, (const struct acpi_device_id**)$arg2)")
    public static boolean acpi_pnp_match(String idstr, Ptr<Ptr<acpi_device_id>> matchid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_object_list> acpi_processor_alloc_pdc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_ffh_cstate_enter(Ptr<acpi_processor_cx> cx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_ffh_cstate_probe(@Unsigned int cpu2, Ptr<acpi_processor_cx> cx, Ptr<acpi_power_register> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long acpi_processor_ffh_cstate_probe_cpu(Ptr<?> _cx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_power_init_bm_check(Ptr<acpi_processor_flags> flags, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_set_pdc(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_thermal_exit(Ptr<acpi_processor> pr, Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_thermal_init(Ptr<acpi_processor> pr, Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_parse_object> acpi_ps_alloc_op(@Unsigned short opcode, Ptr<Character> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_build_named_op(Ptr<acpi_walk_state> walk_state, Ptr<Character> aml_op_start, Ptr<acpi_parse_object> unnamed_op, Ptr<Ptr<acpi_parse_object>> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_complete_final_op(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, @Unsigned @OriginalName(value="acpi_status") int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_complete_op(Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_parse_object>> op, @Unsigned @OriginalName(value="acpi_status") int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_create_op(Ptr<acpi_walk_state> walk_state, Ptr<Character> aml_op_start, Ptr<Ptr<acpi_parse_object>> new_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_parse_object> acpi_ps_create_scope_op(Ptr<Character> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ps_free_op(Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ps_get_name(Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_get_next_arg(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_state> parser_state, @Unsigned int arg_type, Ptr<Ptr<acpi_parse_object>> return_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_parse_object> acpi_ps_get_next_field(Ptr<acpi_parse_state> parser_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_get_next_namepath(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_state> parser_state, Ptr<acpi_parse_object> arg2, char possible_method_call) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_ps_get_next_namestring(Ptr<acpi_parse_state> parser_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> acpi_ps_get_next_package_end(Ptr<acpi_parse_state> parser_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ps_get_next_package_length(Ptr<acpi_parse_state> parser_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ps_get_next_simple_arg(Ptr<acpi_parse_state> parser_state, @Unsigned int arg_type, Ptr<acpi_parse_object> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ps_init_op(Ptr<acpi_parse_object> op, @Unsigned short opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ps_is_leading_char(@Unsigned int c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ps_set_name(Ptr<acpi_parse_object> op, @Unsigned int name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_register_wakeup_handler($arg1, (_Bool (*)(void*))$arg2, $arg3)")
    public static int acpi_register_wakeup_handler(int wake_irq2, Ptr<?> wakeup, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_release_mutex(@OriginalName(value="acpi_handle") Ptr<?> handle, @OriginalName(value="acpi_string") String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_gpe_block(@OriginalName(value="acpi_handle") Ptr<?> gpe_device) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_convert_aml_to_resource(Ptr<acpi_resource> resource2, Ptr<AmlDefinitions.aml_resource> aml, Ptr<acpi_rsconvert_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_convert_resource_to_aml(Ptr<acpi_resource> resource2, Ptr<AmlDefinitions.aml_resource> aml, Ptr<acpi_rsconvert_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_set_firmware_waking_vector(@Unsigned @OriginalName(value="acpi_physical_address") long physical_address, @Unsigned @OriginalName(value="acpi_physical_address") long physical_address64) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_set_gpe(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, char action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_set_gpe_wake_mask(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number, char action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_setup_gpe_for_wake(@OriginalName(value="acpi_handle") Ptr<?> wake_device, @OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_sleep_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_sysfs_add_hotplug_profile($arg1, (const u8*)$arg2)")
    public static void acpi_sysfs_add_hotplug_profile(Ptr<acpi_hotplug_profile> hotplug, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_sysfs_table_handler(@Unsigned int event2, Ptr<?> table, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_system_wakeup_device_open_fs(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_system_wakeup_device_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_system_write_wakeup_device($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long acpi_system_write_wakeup_device(Ptr<runtime.file> file2, String buffer, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_table_attr_init(Ptr<runtime.kobject> tables_obj, Ptr<acpi_table_attr> table_attr, Ptr<acpi_table_header> table_header2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_table_print_srat_entry(Ptr<acpi_subtable_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long acpi_table_show(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long offset, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_tables_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_acquire_table(Ptr<acpi_table_desc> table_desc, Ptr<Ptr<acpi_table_header>> table_ptr, Ptr<@Unsigned Integer> table_length, Ptr<Character> table_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_acquire_temp_table(Ptr<acpi_table_desc> table_desc, @Unsigned @OriginalName(value="acpi_physical_address") long address, char flags, Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_allocate_owner_id(@Unsigned int table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_check_duplication(Ptr<acpi_table_desc> table_desc, Ptr<@Unsigned Integer> table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_delete_namespace_by_owner(@Unsigned int table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_get_next_table_descriptor(Ptr<@Unsigned Integer> table_index, Ptr<Ptr<acpi_table_desc>> table_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_get_owner_id(@Unsigned int table_index, Ptr<@Unsigned @OriginalName(value="acpi_owner_id") Short> owner_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_init_table_descriptor(Ptr<acpi_table_desc> table_desc, @Unsigned @OriginalName(value="acpi_physical_address") long address, char flags, Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_install_and_load_table(@Unsigned @OriginalName(value="acpi_physical_address") long address, char flags, Ptr<acpi_table_header> table, char override, Ptr<@Unsigned Integer> table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_invalidate_table(Ptr<acpi_table_desc> table_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_tb_is_table_loaded(@Unsigned int table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_load_table(@Unsigned int table_index, Ptr<acpi_namespace_node> parent_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_notify_table(@Unsigned int event2, Ptr<?> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_release_owner_id(@Unsigned int table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_release_table(Ptr<acpi_table_header> table, @Unsigned int table_length, char table_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_release_temp_table(Ptr<acpi_table_desc> table_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_resize_root_table_list() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_set_table_loaded_flag(@Unsigned int table_index, char is_loaded) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_terminate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_unload_table(@Unsigned int table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_validate_table(Ptr<acpi_table_desc> table_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_validate_temp_table(Ptr<acpi_table_desc> table_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_verify_temp_table(Ptr<acpi_table_desc> table_desc, String signature, Ptr<@Unsigned Integer> table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_thermal_cpufreq_exit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_thermal_cpufreq_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_trace_point( @OriginalName(value="acpi_trace_event_type") runtime.ACPI_TRACE_AML type2, char begin, Ptr<Character> aml, String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_unbind_memblk(Ptr<MemoryDefinitions.memory_block> mem, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_unregister_wakeup_handler((_Bool (*)(void*))$arg1, $arg2)")
    public static void acpi_unregister_wakeup_handler(Ptr<?> wakeup, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_update_all_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_acquire_mutex(@Unsigned @OriginalName(value="acpi_mutex_handle") int mutex_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_acquire_read_lock(Ptr<acpi_rw_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_acquire_write_lock(Ptr<acpi_rw_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_check_and_repair_ascii(Ptr<Character> name, String repaired_name, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_checksum(Ptr<Character> buffer, @Unsigned int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_convert_decimal_string(String string, Ptr<@Unsigned Long> return_value_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_convert_hex_string(String string, Ptr<@Unsigned Long> return_value_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_convert_octal_string(String string, Ptr<@Unsigned Long> return_value_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_create_rw_lock(Ptr<acpi_rw_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_delete_rw_lock(Ptr<acpi_rw_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_detect_hex_prefix(Ptr<String> string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_detect_octal_prefix(Ptr<String> string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_divide(@Unsigned long in_dividend, @Unsigned long in_divisor, Ptr<@Unsigned Long> out_quotient, Ptr<@Unsigned Long> out_remainder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_exit($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void acpi_ut_exit(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_ut_explicit_strtoul64(String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_generate_checksum(Ptr<?> table, @Unsigned int length, char original_checksum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ut_get_descriptor_length(Ptr<?> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_get_mutex_object(@OriginalName(value="acpi_handle") Ptr<?> handle, @OriginalName(value="acpi_string") String pathname, Ptr<Ptr<acpi_operand_object>> ret_obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_get_resource_end_tag(Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<Character>> end_tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_get_resource_header_length(Ptr<?> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short acpi_ut_get_resource_length(Ptr<?> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_get_resource_type(Ptr<?> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_ut_implicit_strtoul64(String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_init_stack_ptr_trace() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_insert_digit(Ptr<@Unsigned Long> accumulated_value, @Unsigned int base, int ascii_digit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_mutex_initialize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_mutex_terminate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_ptr_exit($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void acpi_ut_ptr_exit(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, Ptr<Character> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_release_mutex(@Unsigned @OriginalName(value="acpi_mutex_handle") int mutex_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_release_read_lock(Ptr<acpi_rw_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_release_write_lock(Ptr<acpi_rw_lock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_remove_hex_prefix(Ptr<String> string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_remove_leading_zeros(Ptr<String> string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_remove_whitespace(Ptr<String> string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_short_divide(@Unsigned long in_dividend, @Unsigned int divisor, Ptr<@Unsigned Long> out_quotient, Ptr<@Unsigned Integer> out_remainder) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_short_multiply(@Unsigned long multiplicand, @Unsigned int multiplier, Ptr<@Unsigned Long> out_product) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_short_shift_left(@Unsigned long operand, @Unsigned int count, Ptr<@Unsigned Long> out_result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_short_shift_right(@Unsigned long operand, @Unsigned int count, Ptr<@Unsigned Long> out_result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_status_exit($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void acpi_ut_status_exit(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, @Unsigned @OriginalName(value="acpi_status") int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_str_exit($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5)")
    public static void acpi_ut_str_exit(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_strtoul64(String string, Ptr<@Unsigned Long> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_trace($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static void acpi_ut_trace(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_trace_ptr($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, (const void*)$arg5)")
    public static void acpi_ut_trace_ptr(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, Ptr<?> pointer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_trace_str($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5)")
    public static void acpi_ut_trace_str(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_trace_u32($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void acpi_ut_trace_u32(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, @Unsigned int integer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_track_stack_ptr() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_valid_name_char(char character, @Unsigned int position) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_valid_nameseg(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct acpi_exception_info*)acpi_ut_validate_exception($arg1))")
    public static Ptr<acpi_exception_info> acpi_ut_validate_exception(@Unsigned @OriginalName(value="acpi_status") int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_validate_resource(Ptr<acpi_walk_state> walk_state, Ptr<?> aml, Ptr<Character> return_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_value_exit($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static void acpi_ut_value_exit(@Unsigned int line_number, String function_name, String module_name, @Unsigned int component_id, @Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_verify_cdat_checksum(Ptr<acpi_table_cdat> cdat_table, @Unsigned int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_verify_checksum(Ptr<acpi_table_header> table, @Unsigned int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_walk_aml_resources(Ptr<acpi_walk_state> walk_state, Ptr<Character> aml, @Unsigned @OriginalName(value="acpi_size") long aml_length, @OriginalName(value="acpi_walk_aml_callback") Ptr<?> user_function, Ptr<Ptr<?>> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_wakeup_device_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_warning((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static void acpi_warning(String module_name, @Unsigned int line_number, String format, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct acpi_table_wdat*)acpi_watchdog_get_wdat())")
    public static Ptr<acpi_table_wdat> acpi_watchdog_get_wdat() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_watchdog_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_device_wakeup_enable(Ptr<acpi_device> adev, @Unsigned int target_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __acpi_probe_device_table(Ptr<acpi_probe_entry> ap_head, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ac_battery_notify(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ac_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ac_get_state(Ptr<acpi_ac> ac) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ac_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ac_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ac_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ac_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ac_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_add_id($arg1, (const u8*)$arg2)")
    public static void acpi_add_id(Ptr<acpi_device_pnp> pnp, String dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_add_pm_notifier($arg1, $arg2, (void (*)(struct acpi_device_wakeup_context*))$arg3)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_add_pm_notifier(Ptr<acpi_device> adev, Ptr<runtime.device> dev, Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_add_single_object(Ptr<Ptr<acpi_device>> child, @OriginalName(value="acpi_handle") Ptr<?> handle, int type2, boolean dep_init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_apd_create_device($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_apd_create_device(Ptr<acpi_device> adev, Ptr<acpi_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_apd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_apd_setup(Ptr<misc.apd_private_data> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_ata_match(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_attach_data(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @OriginalName(value="acpi_object_handler") Ptr<?> handler, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_backlight_cap_match(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_bay_match(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_buffer_to_resource(Ptr<Character> aml_buffer, @Unsigned short aml_buffer_length, Ptr<Ptr<acpi_resource>> resource_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_attach(Ptr<acpi_device> device2, Ptr<?> first_pass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_bus_can_wakeup(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_bus_check_add(@OriginalName(value="acpi_handle") Ptr<?> handle, boolean first_pass, Ptr<Ptr<acpi_device>> adev_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_bus_check_add_1(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl_not_used, Ptr<?> not_used, Ptr<Ptr<?>> ret_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_bus_check_add_2(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl_not_used, Ptr<?> not_used, Ptr<Ptr<?>> ret_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_extract_wakeup_device_power_package(Ptr<acpi_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_bus_generate_netlink_event((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int acpi_bus_generate_netlink_event(String device_class, String bus_id, char type2, int data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_bus_get_ejd(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@OriginalName(value="acpi_handle") Ptr<?>> ejd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_get_power_flags(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_init_power(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_bus_offline(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> data, Ptr<Ptr<?>> ret_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_bus_online(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> data, Ptr<Ptr<?>> ret_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_post_eject(Ptr<acpi_device> adev, Ptr<?> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_bus_power_manageable(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_register_early_device(int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_scan(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_scan_fixed() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_set_power(@OriginalName(value="acpi_handle") Ptr<?> handle, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_bus_trim(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bus_update_power(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<Integer> state_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_check_region($arg1, $arg2, (const u8*)$arg3)")
    public static int acpi_check_region(@Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long n, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_check_resource_conflict((const struct resource*)$arg1)")
    public static int acpi_check_resource_conflict(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_check_serial_bus_slave(Ptr<acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_cpc_valid() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_cppc_processor_exit(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_cppc_processor_probe(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_add_to_history(String command_line) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_convert_to_buffer(String string, Ptr<acpi_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_convert_to_object(@Unsigned @OriginalName(value="acpi_object_type") int type2, String string, Ptr<acpi_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_convert_to_package(String string, Ptr<acpi_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_history() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_dump_external_object(Ptr<acpi_object> obj_desc, @Unsigned int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_dump_pld_buffer(Ptr<acpi_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> acpi_db_encode_pld_buffer(Ptr<acpi_pld_info> pld_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_db_get_from_history(String command_num_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_db_get_history_by_index(@Unsigned int cmd_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_hex_char_to_value(int hex_char, Ptr<Character> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_namespace_node> acpi_db_local_ns_lookup(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_object_type") int acpi_db_match_argument(String user_argument, Ptr<acpi_db_argument_info> arguments) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_prep_namestring(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_set_output_destination(@Unsigned int output_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_uint32_to_hex_string(@Unsigned int value, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_debugger_create_thread(@OriginalName(value="acpi_osd_exec_callback") Ptr<?> function, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_debugger_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_debugger_notify_command_complete() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long acpi_debugger_read_cmd(String buffer, @Unsigned long buffer_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_debugger_wait_command_ready() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_debugger_write_log((const u8*)$arg1)")
    public static @OriginalName(value="ssize_t") long acpi_debugger_write_log(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_detach_data(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @OriginalName(value="acpi_object_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_clear_dependencies(Ptr<acpi_device> supplier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_device> acpi_dev_get_next_consumer_dev(Ptr<acpi_device> supplier, Ptr<acpi_device> start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_dev_needs_resume(Ptr<runtime.device> dev, Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_pm_attach(Ptr<runtime.device> dev, boolean power_on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_pm_detach(Ptr<runtime.device> dev, boolean power_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_pm_get_state(Ptr<runtime.device> dev, Ptr<acpi_device> adev, @Unsigned int target_state, Ptr<Integer> d_min_p, Ptr<Integer> d_max_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_dev_power_state_for_wake(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_power_up_children_with_adr(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_ready_for_enumeration((const struct acpi_device*)$arg1)")
    public static boolean acpi_dev_ready_for_enumeration(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_dev_state_d0(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_suspend(Ptr<runtime.device> dev, boolean wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_add(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_add_finalize(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_del_work_fn(Ptr<misc.work_struct> work_not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_fix_up_power(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_fix_up_power_children(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_fix_up_power_extended(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_get_busid(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_get_power(Ptr<acpi_device> device2, Ptr<Integer> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_device_hid($arg1))")
    public static String acpi_device_hid(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_hotplug(Ptr<acpi_device> adev, @Unsigned int src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_device_is_battery(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_device_is_enabled((const struct acpi_device*)$arg1)")
    public static boolean acpi_device_is_enabled(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_device_is_present((const struct acpi_device*)$arg1)")
    public static boolean acpi_device_is_present(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_device_override_status(Ptr<acpi_device> adev, Ptr<@Unsigned Long> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_set_power(Ptr<acpi_device> device2, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_device_update_power(Ptr<acpi_device> device2, Ptr<Integer> state_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_disable_return_repair(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dma_configure_id($arg1, $arg2, (const unsigned int*)$arg3)")
    public static int acpi_dma_configure_id(Ptr<runtime.device> dev, DevDefinitions.dev_dma_attr attr2, Ptr<@Unsigned Integer> input_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dma_get_range($arg1, (const struct bus_dma_region**)$arg2)")
    public static int acpi_dma_get_range(Ptr<runtime.device> dev, Ptr<Ptr<BusDefinitions.bus_dma_region>> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dma_supported((const struct acpi_device*)$arg1)")
    public static boolean acpi_dma_supported(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_dock_match(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_auto_serialize_method(Ptr<acpi_namespace_node> node2, Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_begin_method_execution(Ptr<acpi_namespace_node> method_node, Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_call_control_method(Ptr<acpi_thread_state> thread, Ptr<acpi_walk_state> this_walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_detect_named_opcodes(Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_parse_object>> out_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_dump_method_stack(@Unsigned @OriginalName(value="acpi_status") int status, Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_exec_begin_op(Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_parse_object>> out_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_exec_end_op(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_execute_arguments(Ptr<acpi_namespace_node> node2, Ptr<acpi_namespace_node> scope_node, @Unsigned int aml_length, Ptr<Character> aml_start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_get_bank_field_arguments(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_get_buffer_arguments(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_get_buffer_field_arguments(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_get_package_arguments(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_get_predicate_value(Ptr<acpi_walk_state> walk_state, Ptr<acpi_operand_object> result_obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_get_region_arguments(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_method_error(@Unsigned @OriginalName(value="acpi_status") int status, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ds_print_node_pathname($arg1, (const u8*)$arg2)")
    public static void acpi_ds_print_node_pathname(Ptr<acpi_namespace_node> node2, String message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_restart_control_method(Ptr<acpi_walk_state> walk_state, Ptr<acpi_operand_object> return_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_scope_stack_clear(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_scope_stack_pop(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_scope_stack_push(Ptr<acpi_namespace_node> node2, @Unsigned @OriginalName(value="acpi_object_type") int type2, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_terminate_control_method(Ptr<acpi_operand_object> method_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_enforce_resources_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_cmos_region_setup(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_create_gpe_block(Ptr<acpi_namespace_node> gpe_device, @Unsigned long address, char space_id, @Unsigned int register_count, @Unsigned short gpe_block_base_number, @Unsigned int interrupt_number, Ptr<Ptr<acpi_gpe_block_info>> return_gpe_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_create_gpe_info_blocks(Ptr<acpi_gpe_block_info> gpe_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_data_table_region_setup(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_default_region_setup(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_delete_gpe_block(Ptr<acpi_gpe_block_info> gpe_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_initialize_gpe_block(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_info, Ptr<acpi_gpe_block_info> gpe_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_initialize_region(Ptr<acpi_operand_object> region_obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_io_space_region_setup(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ev_is_notify_object(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ev_is_pci_root_bridge(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ev_notify_dispatch(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_pci_bar_region_setup(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_pci_config_region_setup(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_queue_notify_request(Ptr<acpi_namespace_node> node2, @Unsigned int notify_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_system_memory_region_setup(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ev_terminate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_evaluate_object(@OriginalName(value="acpi_handle") Ptr<?> handle, @OriginalName(value="acpi_string") String pathname, Ptr<acpi_object_list> external_params, Ptr<acpi_buffer> return_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_evaluate_object_typed(@OriginalName(value="acpi_handle") Ptr<?> handle, @OriginalName(value="acpi_string") String pathname, Ptr<acpi_object_list> external_params, Ptr<acpi_buffer> return_buffer, @Unsigned @OriginalName(value="acpi_object_type") int return_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_event_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_ex_allocate_name_string(@Unsigned int prefix_count, @Unsigned int num_name_segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_cmos_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bit_width, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_concat_template(Ptr<acpi_operand_object> operand0, Ptr<acpi_operand_object> operand1, Ptr<Ptr<acpi_operand_object>> actual_return_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_create_alias(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_create_event(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_create_method(Ptr<Character> aml_start, @Unsigned int aml_length, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_create_mutex(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_create_power_resource(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_create_processor(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_create_region(Ptr<Character> aml_start, @Unsigned int aml_length, char space_id, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_data_table_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bit_width, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_do_concatenate(Ptr<acpi_operand_object> operand0, Ptr<acpi_operand_object> operand1, Ptr<Ptr<acpi_operand_object>> actual_return_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_get_name_string(@Unsigned @OriginalName(value="acpi_object_type") int data_type, Ptr<Character> in_aml_address, Ptr<String> out_name_string, Ptr<@Unsigned Integer> out_name_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_get_protocol_buffer_length(@Unsigned int protocol_id, Ptr<@Unsigned Integer> return_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ex_interpreter_trace_enabled(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_name_segment(Ptr<Ptr<Character>> in_aml_address, String name_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_pci_bar_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bit_width, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_pci_config_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bit_width, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_read_data_from_field(Ptr<acpi_walk_state> walk_state, Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> ret_buffer_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_start_trace_method(Ptr<acpi_namespace_node> method_node, Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_start_trace_opcode(Ptr<acpi_parse_object> op, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_stop_trace_method(Ptr<acpi_namespace_node> method_node, Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_stop_trace_opcode(Ptr<acpi_parse_object> op, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_store(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> dest_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_store_direct_to_node(Ptr<acpi_operand_object> source_desc, Ptr<acpi_namespace_node> node2, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_store_object_to_index(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> index_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_store_object_to_node(Ptr<acpi_operand_object> source_desc, Ptr<acpi_namespace_node> node2, Ptr<acpi_walk_state> walk_state, char implicit_conversion) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_io_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bit_width, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_memory_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bit_width, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_trace_point( @OriginalName(value="acpi_trace_event_type") runtime.ACPI_TRACE_AML type2, char begin, Ptr<Character> aml, String pathname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_write_data_to_field(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> result_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_fan_hwmon_is_visible((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="umode_t") short acpi_fan_hwmon_is_visible(Ptr<?> drvdata, HwmonDefinitions.hwmon_sensor_types type2, @Unsigned int attr2, int channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_fan_hwmon_read(Ptr<runtime.device> dev, HwmonDefinitions.hwmon_sensor_types type2, @Unsigned int attr2, int channel2, Ptr<Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_device> acpi_fetch_acpi_dev(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ffh_address_space_arch_handler(Ptr<@Unsigned @OriginalName(value="acpi_integer") Long> value, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ffh_address_space_arch_setup(Ptr<?> handler_ctxt, Ptr<Ptr<?>> region_ctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ffh_address_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long addr2, @Unsigned int bits, Ptr<@Unsigned @OriginalName(value="acpi_integer") Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ffh_address_space_setup(@OriginalName(value="acpi_handle") Ptr<?> region_handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_free_pnp_ids(Ptr<acpi_device_pnp> pnp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_generic_device_attach($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_generic_device_attach(Ptr<acpi_device> adev, Ptr<acpi_device_id> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_device> acpi_get_acpi_dev(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_data(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @OriginalName(value="acpi_object_handler") Ptr<?> handler, Ptr<Ptr<?>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_get_data_full($arg1, $arg2, $arg3, (void (*)(void*))$arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_data_full(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @OriginalName(value="acpi_object_handler") Ptr<?> handler, Ptr<Ptr<?>> data, Ptr<?> callback2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_get_devices((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_devices(String HID, @OriginalName(value="acpi_walk_callback") Ptr<?> user_function, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static DevDefinitions.dev_dma_attr acpi_get_dma_attr(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_genport_coordinates(@Unsigned int uid, Ptr<misc.access_coordinate> coord) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_psd(Ptr<misc.cpc_desc> cpc_ptr, @OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_psd_map(@Unsigned int cpu2, Ptr<CppcDefinitions.cppc_cpudata> cpu_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_resource_memory(Ptr<acpi_resource> ares, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_sleep_type_data(char sleep_state, Ptr<Character> sleep_type_a, Ptr<Character> sleep_type_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ghes_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_gsb_i2c_read_bytes(Ptr<I2cDefinitions.i2c_client> client, char cmd, Ptr<Character> data, char data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_gsb_i2c_write_bytes(Ptr<I2cDefinitions.i2c_client> client, char cmd, Ptr<Character> data, char data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hotplug_schedule(Ptr<acpi_device> adev, @Unsigned int src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_hotplug_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_hw_execute_sleep_method(String method_pathname, @Unsigned int integer_argument) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_extended_sleep(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_extended_wake(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_extended_wake_prep(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_idle_do_entry(Ptr<acpi_processor_cx> cx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_idle_enter(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_idle_enter_bm(Ptr<CpuidleDefinitions.cpuidle_driver> drv, Ptr<acpi_processor> pr, Ptr<acpi_processor_cx> cx, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_idle_enter_s2idle(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_idle_lpi_enter(Ptr<CpuidleDefinitions.cpuidle_device> dev, Ptr<CpuidleDefinitions.cpuidle_driver> drv, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_idle_play_dead(Ptr<CpuidleDefinitions.cpuidle_device> dev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_info_matches_ids($arg1, (const u8**)$arg2)")
    public static boolean acpi_info_matches_ids(Ptr<acpi_device_info> info2, Ptr<String> ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_init_device_object($arg1, $arg2, $arg3, (void (*)(struct device*))$arg4)")
    public static void acpi_init_device_object(Ptr<acpi_device> device2, @OriginalName(value="acpi_handle") Ptr<?> handle, int type2, Ptr<?> release) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_init_ffh() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_init_fpdt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_initialize_hp_context(Ptr<acpi_device> adev, Ptr<acpi_hotplug_context> hp, @OriginalName(value="acpi_hp_notify") Ptr<?> notify, @OriginalName(value="acpi_hp_uevent") Ptr<?> uevent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ioapic_add(@OriginalName(value="acpi_handle") Ptr<?> root_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ioapic_remove(Ptr<acpi_pci_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_iommu_fwspec_init(Ptr<runtime.device> dev, @Unsigned int id, Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn acpi_irq(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_irq_balance_set(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_irq_get_penalty(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_irq_isa(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_irq_nobalance_set(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_irq_pci(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_irq_penalty_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_irq_penalty_update(String str, int used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long acpi_is_video_device(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_isa_irq_available(int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lock_hp_context() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_lpat_free_conversion_table(Ptr<acpi_lpat_conversion_table> lpat_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_lpat_conversion_table> acpi_lpat_get_conversion_table(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpat_raw_to_temp(Ptr<acpi_lpat_conversion_table> lpat_table, int raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_lpat_temp_to_raw(Ptr<acpi_lpat_conversion_table> lpat_table, int temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_match_madt($arg1, (const long unsigned int)$arg2)")
    public static int acpi_match_madt(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_mp_cpu_die(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_mp_play_dead() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_mp_stop_this_cpu() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_no_auto_serialize_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_no_static_ssdt_setup(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_notifier_call_chain(Ptr<acpi_device> dev, @Unsigned int type2, @Unsigned int data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ns_build_normalized_path(Ptr<acpi_namespace_node> node2, String full_path, @Unsigned int path_size, char no_trailing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_build_prefixed_pathname($arg1, (const u8*)$arg2)")
    public static String acpi_ns_build_prefixed_pathname(Ptr<acpi_generic_state> prefix_scope, String internal_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_complex_repairs(Ptr<acpi_evaluate_info> info2, Ptr<acpi_namespace_node> node2, @Unsigned @OriginalName(value="acpi_status") int validate_status, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_convert_to_buffer(Ptr<acpi_operand_object> original_object, Ptr<Ptr<acpi_operand_object>> return_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_convert_to_integer(Ptr<acpi_operand_object> original_object, Ptr<Ptr<acpi_operand_object>> return_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_convert_to_reference(Ptr<acpi_namespace_node> scope, Ptr<acpi_operand_object> original_object, Ptr<Ptr<acpi_operand_object>> return_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_convert_to_resource(Ptr<acpi_namespace_node> scope, Ptr<acpi_operand_object> original_object, Ptr<Ptr<acpi_operand_object>> return_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_convert_to_string(Ptr<acpi_operand_object> original_object, Ptr<Ptr<acpi_operand_object>> return_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_convert_to_unicode(Ptr<acpi_namespace_node> scope, Ptr<acpi_operand_object> original_object, Ptr<Ptr<acpi_operand_object>> return_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_get_device_callback(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_ns_get_external_pathname(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String acpi_ns_get_normalized_pathname(Ptr<acpi_namespace_node> node2, char no_trailing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_size") long acpi_ns_get_pathname_length(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_handle_to_name(@OriginalName(value="acpi_handle") Ptr<?> target_handle, Ptr<acpi_buffer> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_handle_to_pathname(@OriginalName(value="acpi_handle") Ptr<?> target_handle, Ptr<acpi_buffer> buffer, char no_trailing) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_normalize_pathname(String original_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_ALR(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_CID(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_CST(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_FDE(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_HID(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_PRT(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_PSS(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_TSS(Ptr<acpi_evaluate_info> info2, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_os_acquire_lock(Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lockp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_create_cache(String name, @Unsigned short size, @Unsigned short depth, Ptr<Ptr<KmemDefinitions.kmem_cache>> cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_create_semaphore(@Unsigned int max_units, @Unsigned int initial_units, Ptr<@OriginalName(value="acpi_handle") Ptr<?>> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_delete_cache(Ptr<KmemDefinitions.kmem_cache> cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_delete_lock(Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_delete_semaphore(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_enter_sleep(char sleep_state, @Unsigned int reg_a_value, @Unsigned int reg_b_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_execute( @OriginalName(value="acpi_execute_type") runtime.OSL type2, @OriginalName(value="acpi_osd_exec_callback") Ptr<?> function, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_execute_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> acpi_os_get_iomem(@Unsigned @OriginalName(value="acpi_physical_address") long phys, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_get_line(String buffer, @Unsigned int buffer_length, Ptr<@Unsigned Integer> bytes_read) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_physical_address") long acpi_os_get_root_pointer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_os_get_timer() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_initialize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_initialize1() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_install_interrupt_handler(@Unsigned int gsi, @OriginalName(value="acpi_osd_handler") Ptr<?> handler, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> acpi_os_map_generic_address(Ptr<acpi_generic_address> gas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> acpi_os_map_iomem(@Unsigned @OriginalName(value="acpi_physical_address") long phys, @Unsigned @OriginalName(value="acpi_size") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> acpi_os_map_memory(@Unsigned @OriginalName(value="acpi_physical_address") long phys, @Unsigned @OriginalName(value="acpi_size") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_map_remove(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_os_name_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_notify_command_complete() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_os_predefined_override((const struct acpi_predefined_names*)$arg1, $arg2)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_predefined_override(Ptr<acpi_predefined_names> init_val, Ptr<@OriginalName(value="acpi_string") String> new_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_prepare_extended_sleep(char sleep_state, @Unsigned int val_a, @Unsigned int val_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_prepare_sleep(char sleep_state, @Unsigned int pm1a_control, @Unsigned int pm1b_control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_os_printf((const u8*)$arg1, $arg2_)")
    public static void acpi_os_printf(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_purge_cache(Ptr<KmemDefinitions.kmem_cache> cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_os_read_iomem(Ptr<?> virt_addr, Ptr<@Unsigned Long> value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_read_memory(@Unsigned @OriginalName(value="acpi_physical_address") long phys_addr, Ptr<@Unsigned Long> value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_read_pci_configuration(Ptr<acpi_pci_id> pci_id, @Unsigned int reg, Ptr<@Unsigned Long> value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_read_port(@Unsigned @OriginalName(value="acpi_io_address") long port2, Ptr<@Unsigned Integer> value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_release_lock(Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lockp, @Unsigned long not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_release_object(Ptr<KmemDefinitions.kmem_cache> cache, Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_remove_interrupt_handler(@Unsigned int gsi, @OriginalName(value="acpi_osd_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_os_set_prepare_extended_sleep((int (*)(u8, unsigned int, unsigned int))$arg1)")
    public static void acpi_os_set_prepare_extended_sleep(Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_os_set_prepare_sleep((int (*)(u8, unsigned int, unsigned int))$arg1)")
    public static void acpi_os_set_prepare_sleep(Ptr<?> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_signal(@Unsigned int function, Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_signal_semaphore(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int units) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_sleep(@Unsigned long ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_stall(@Unsigned int us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_terminate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_unmap_generic_address(Ptr<acpi_generic_address> gas) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_unmap_iomem(Ptr<?> virt, @Unsigned @OriginalName(value="acpi_size") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_unmap_memory(Ptr<?> virt, @Unsigned @OriginalName(value="acpi_size") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_os_vprintf((const u8*)$arg1, $arg2)")
    public static void acpi_os_vprintf(String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_wait_command_ready() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_os_wait_events_complete() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_wait_semaphore(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int units, @Unsigned short timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_write_memory(@Unsigned @OriginalName(value="acpi_physical_address") long phys_addr, @Unsigned long value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_write_pci_configuration(Ptr<acpi_pci_id> pci_id, @Unsigned int reg, @Unsigned long value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_write_port(@Unsigned @OriginalName(value="acpi_io_address") long port2, @Unsigned int value, @Unsigned int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_mp_wake($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_mp_wake(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_pci_link_add($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_pci_link_add(Ptr<acpi_device> device2, Ptr<acpi_device_id> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_link_allocate(Ptr<acpi_pci_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_link_allocate_irq(@OriginalName(value="acpi_handle") Ptr<?> handle, int index2, Ptr<Integer> triggering, Ptr<Integer> polarity, Ptr<String> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_pci_link_check_current(Ptr<acpi_resource> resource2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_pci_link_check_possible(Ptr<acpi_resource> resource2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_link_free_irq(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_link_get_current(Ptr<acpi_pci_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_link_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_link_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_link_set(Ptr<acpi_pci_link> link2, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_penalize_isa_irq(int irq, int active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_penalize_sci_irq(int irq, int trigger, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_check_blacklist(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_check_graylist(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_pm_device_can_wakeup(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pm_device_sleep_state(Ptr<runtime.device> dev, Ptr<Integer> d_min_p, int d_max_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pm_good_setup(String __str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_notify_handler(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int val, Ptr<?> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_notify_work_func(Ptr<acpi_device_wakeup_context> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_pm_read(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_pm_read_slow(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_pm_read_verified() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_resume(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pm_set_device_wakeup(Ptr<runtime.device> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_suspend(Ptr<runtime.clocksource> cs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_wakeup_event(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_pmtmr_register_suspend_resume_callback((void (*)(void*, _Bool))$arg1, $arg2)")
    public static void acpi_pmtmr_register_suspend_resume_callback(Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pmtmr_unregister_suspend_resume_callback() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)acpi_power_state_string($arg1))")
    public static String acpi_power_state_string(int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_up_if_adr_present(Ptr<acpi_device> adev, Ptr<?> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_proc_quirk_mwait_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_proc_quirk_set_no_mwait((const struct dmi_system_id*)$arg1)")
    public static int acpi_proc_quirk_set_no_mwait(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_evaluate_lpi(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_lpi_states_array> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_ffh_lpi_enter(Ptr<acpi_lpi_state> lpi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_ffh_lpi_probe(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_cstate_info(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_lpi_info(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_hotplug(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_init_invariance_cppc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_power_exit(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_power_init(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_power_state_has_changed(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_power_verify(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_power_verify_c3(Ptr<acpi_processor> pr, Ptr<acpi_processor_cx> cx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_setup_cpuidle_dev(Ptr<acpi_processor> pr, Ptr<CpuidleDefinitions.cpuidle_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_setup_cpuidle_states(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_setup_cstates(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_setup_lpi_states(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ps_append_arg(Ptr<acpi_parse_object> op, Ptr<acpi_parse_object> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_parse_object> acpi_ps_get_arg(Ptr<acpi_parse_object> op, @Unsigned int argn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_parse_object> acpi_ps_get_depth_next(Ptr<acpi_parse_object> origin, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_pwm_get((const struct fwnode_handle*)$arg1)")
    public static Ptr<PwmDefinitions.pwm_device> acpi_pwm_get(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_queue_hotplug_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_quirk_skip_acpi_ac_and_battery() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_quirk_skip_gpio_event_handlers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_quirk_skip_i2c_client_enumeration(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_quirk_skip_serdev_enumeration(Ptr<runtime.device> controller_parent, Ptr<@OriginalName(value="bool") Boolean> skip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_read(Ptr<@Unsigned Long> return_value, Ptr<acpi_generic_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_read_bit_register(@Unsigned int register_id, Ptr<@Unsigned Integer> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_reconfig_notifier_register(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_reconfig_notifier_unregister(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_register_debugger($arg1, (const struct acpi_debugger_ops*)$arg2)")
    public static int acpi_register_debugger(Ptr<runtime.module> owner, Ptr<acpi_debugger_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_register_spi_device(Ptr<SpiDefinitions.spi_controller> ctlr, Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_pm_notifier(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_request_region(Ptr<acpi_generic_address> gas, @Unsigned int length, String desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_reserve_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_reset() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_resources_are_enforced() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_rev_override_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_create_aml_resources(Ptr<acpi_buffer> resource_list, Ptr<acpi_buffer> output_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_create_pci_routing_table(Ptr<acpi_operand_object> package_object, Ptr<acpi_buffer> output_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_create_resource_list(Ptr<acpi_operand_object> aml_buffer, Ptr<acpi_buffer> output_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_rs_get_address_common(Ptr<acpi_resource> resource2, Ptr<AmlDefinitions.aml_resource> aml) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_rs_set_address_common(Ptr<AmlDefinitions.aml_resource> aml, Ptr<acpi_resource> resource2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_safe_halt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_scan_add_dep(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_handle_list> dep_devices) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_scan_add_handler(Ptr<acpi_scan_handler> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_scan_add_handler_with_hotplug($arg1, (const u8*)$arg2)")
    public static int acpi_scan_add_handler_with_hotplug(Ptr<acpi_scan_handler> handler, String hotplug_profile_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_scan_check_and_detach(Ptr<acpi_device> adev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_scan_check_crs_csi2_cb(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int a, Ptr<?> b, Ptr<Ptr<?>> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_scan_clear_dep(Ptr<acpi_dep_data> dep, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_scan_clear_dep_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_scan_drop_device(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_scan_hot_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_scan_hotplug_enabled(Ptr<acpi_hotplug_profile> hotplug, boolean val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_scan_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_scan_is_offline(Ptr<acpi_device> adev, boolean uevent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_scan_lock_acquire() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_scan_lock_release() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_scan_rescan_bus(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_scan_table_notify() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_serdev_add_device(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int level, Ptr<?> data, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_serdev_parse_resource(Ptr<acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_set_handle(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_set_pnp_ids(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_device_pnp> pnp, int device_type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_spi_add_device(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int level, Ptr<?> data, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_spi_add_resource(Ptr<acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_spi_count(Ptr<acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_spi_count_resources(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SpiDefinitions.spi_device> acpi_spi_device_alloc(Ptr<SpiDefinitions.spi_controller> ctlr, Ptr<acpi_device> adev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SpiDefinitions.spi_controller> acpi_spi_find_controller_by_adev(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_spi_notify(Ptr<misc.notifier_block> nb, @Unsigned long value, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_spi_parse_apple_properties(Ptr<acpi_device> dev, Ptr<acpi_spi_lookup> lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_storage_d3(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_subsys_complete(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_poweroff_late(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_poweroff_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_prepare(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_restore_early(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_resume_early(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_suspend_late(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_subsys_suspend_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_table_events_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_check_dsdt_header() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_convert_fadt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_table_header> acpi_tb_copy_dsdt(@Unsigned int table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_create_local_fadt(Ptr<acpi_table_header> table, @Unsigned int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_find_table(String signature, String oem_id, String oem_table_id, Ptr<@Unsigned Integer> table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_get_table(Ptr<acpi_table_desc> table_desc, Ptr<Ptr<acpi_table_header>> out_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_initialize_facs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_parse_fadt() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_parse_root_table(@Unsigned @OriginalName(value="acpi_physical_address") long rsdp_address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_put_table(Ptr<acpi_table_desc> table_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_tie_acpi_dev(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_unlock_hp_context() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_unregister_debugger((const struct acpi_debugger_ops*)$arg1)")
    public static void acpi_unregister_debugger(Ptr<acpi_debugger_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_allocate_owner_id(Ptr<@Unsigned @OriginalName(value="acpi_owner_id") Short> owner_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_eobject_to_iobject(Ptr<acpi_object> external_object, Ptr<Ptr<acpi_operand_object>> internal_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_esimple_to_isimple(Ptr<acpi_object> external_object, Ptr<Ptr<acpi_operand_object>> ret_internal_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_ielement_to_eelement(char object_type, Ptr<acpi_operand_object> source_object, Ptr<acpi_generic_state> state2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_ielement_to_ielement(char object_type, Ptr<acpi_operand_object> source_object, Ptr<acpi_generic_state> state2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_iobject_to_eobject(Ptr<acpi_operand_object> internal_object, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_iobject_to_iobject(Ptr<acpi_operand_object> source_desc, Ptr<Ptr<acpi_operand_object>> dest_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_ipackage_to_ipackage(Ptr<acpi_operand_object> source_obj, Ptr<acpi_operand_object> dest_obj, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_isimple_to_esimple(Ptr<acpi_operand_object> internal_object, Ptr<acpi_object> external_object, Ptr<Character> data_space, Ptr<@Unsigned @OriginalName(value="acpi_size") Long> buffer_space_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_copy_simple_object(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> dest_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_generic_state> acpi_ut_create_control_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_generic_state> acpi_ut_create_generic_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_generic_state> acpi_ut_create_pkg_state(Ptr<?> internal_object, Ptr<?> external_object, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_thread_state> acpi_ut_create_thread_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_generic_state> acpi_ut_create_update_state(Ptr<acpi_operand_object> object, @Unsigned short action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_debug_dump_buffer(Ptr<Character> buffer, @Unsigned int count, @Unsigned int display, @Unsigned int component_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_delete_generic_state(Ptr<acpi_generic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_dump_buffer(Ptr<Character> buffer, @Unsigned int count, @Unsigned int display, @Unsigned int base_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_execute_CID(Ptr<acpi_namespace_node> device_node2, Ptr<Ptr<acpi_pnp_device_id_list>> return_cid_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_execute_CLS(Ptr<acpi_namespace_node> device_node2, Ptr<Ptr<acpi_pnp_device_id>> return_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_execute_HID(Ptr<acpi_namespace_node> device_node2, Ptr<Ptr<acpi_pnp_device_id>> return_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_execute_UID(Ptr<acpi_namespace_node> device_node2, Ptr<Ptr<acpi_pnp_device_id>> return_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_get_expected_return_types(String buffer, @Unsigned int expected_btypes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const union acpi_predefined_info*)acpi_ut_get_next_predefined_method((const union acpi_predefined_info*)$arg1))")
    public static Ptr<acpi_predefined_info> acpi_ut_get_next_predefined_method(Ptr<acpi_predefined_info> this_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const union acpi_predefined_info*)acpi_ut_match_predefined_method($arg1))")
    public static Ptr<acpi_predefined_info> acpi_ut_match_predefined_method(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_generic_state> acpi_ut_pop_generic_state(Ptr<Ptr<acpi_generic_state>> list_head2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_push_generic_state(Ptr<Ptr<acpi_generic_state>> list_head2, Ptr<acpi_generic_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_release_owner_id(Ptr<@Unsigned @OriginalName(value="acpi_owner_id") Short> owner_id_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_viot_early_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_viot_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_wakeup_cpu(@Unsigned int apicid, @Unsigned long start_ip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_walk_namespace(@Unsigned @OriginalName(value="acpi_object_type") int type2, @OriginalName(value="acpi_handle") Ptr<?> start_object, @Unsigned int max_depth, @OriginalName(value="acpi_walk_callback") Ptr<?> descending_callback, @OriginalName(value="acpi_walk_callback") Ptr<?> ascending_callback, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_write(@Unsigned long value, Ptr<acpi_generic_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_write_bit_register(@Unsigned int register_id, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__acpi_find_gpio($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<GpioDefinitions.gpio_desc> __acpi_find_gpio(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String con_id, @Unsigned int idx, boolean can_fallback, Ptr<acpi_gpio_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __acpi_osi_setup_darwin(boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __acpi_osi_setup_linux(boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __acpi_pci_root_release_info(Ptr<acpi_pci_root_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_allocate_root_table(@Unsigned int initial_table_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_create_thread(@OriginalName(value="acpi_osd_exec_callback") Ptr<?> function, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_aml_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_aml_kern_readable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_aml_kern_writable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_lock_read(Ptr<misc.circ_buf> circ, @Unsigned long flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_lock_write(Ptr<misc.circ_buf> circ, @Unsigned long flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_notify_command_complete() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int acpi_aml_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long acpi_aml_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long acpi_aml_read_cmd(String msg, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_thread(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_aml_user_readable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_aml_user_writable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_aml_wait_command_ready(boolean single_step, String buffer, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_aml_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long acpi_aml_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_aml_write_kern((const u8*)$arg1, $arg2)")
    public static int acpi_aml_write_kern(String buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_aml_write_log((const u8*)$arg1)")
    public static @OriginalName(value="ssize_t") long acpi_aml_write_log(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_any_fixed_event_status_set() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_bind_one(Ptr<runtime.device> dev, Ptr<acpi_device> acpi_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_blacklisted() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_call_prm_handler(@OriginalName(value="guid_t") misc.uuid_t handler_guid, Ptr<?> param_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_cmos_rtc_attach_handler($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_cmos_rtc_attach_handler(Ptr<acpi_device> adev, Ptr<acpi_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_cmos_rtc_detach_handler(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_cmos_rtc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_cmos_rtc_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bits, Ptr<@Unsigned Long> value64, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_cpufreq_cpu_exit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_cpufreq_cpu_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_cpufreq_early_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_cpufreq_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_cpufreq_fast_switch(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int target_freq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_cpufreq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_cpufreq_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_cpufreq_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_cpufreq_resume(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_cpufreq_target(Ptr<CpufreqDefinitions.cpufreq_policy> policy, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_create_platform_device($arg1, (const struct property_entry*)$arg2)")
    public static Ptr<PlatformDefinitions.platform_device> acpi_create_platform_device(Ptr<acpi_device> adev, Ptr<misc.property_entry> properties) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_namespace_node> acpi_db_convert_to_node(String in_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_decode_arguments(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_decode_internal_object(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_decode_locals(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_decode_node(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_device_resources(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_interfaces(String action_arg, String interface_name_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_internal_object(Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_locks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_resources(String object_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_table_info(String table_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_display_template(String buffer_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_do_one_sleep_state(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_dump_method_info(@Unsigned @OriginalName(value="acpi_status") int status, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_evaluate_all(String name_seg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_evaluate_object(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_evaluate_predefined_names() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_generate_gpe(String gpe_arg, String block_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_generate_interrupt(String gsiv_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_generate_sci() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_resource_callback(Ptr<acpi_resource> resource2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_send_notify(String name, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_set_method_breakpoint(String location2, Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_set_method_call_breakpoint(Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_set_method_data(String type_arg, String index_arg, String value_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_signal_break_point(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_single_step(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, @Unsigned int opcode_class) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_sleep(String object_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_trace(String enable_arg, String method_arg, String once_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_db_unload_acpi_table(String object_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_walk_for_execute(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_db_walk_for_execute_all(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_debug_trace((const u8*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_debug_trace(String name, @Unsigned int debug_level, @Unsigned int debug_layer, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_debugfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_add_driver_gpios($arg1, (const struct acpi_gpio_mapping*)$arg2)")
    public static int acpi_dev_add_driver_gpios(Ptr<acpi_device> adev, Ptr<acpi_gpio_mapping> gpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_dev_filter_resource_type_cb(Ptr<acpi_resource> ares, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_dev_gpio_irq_wake_get_by($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int acpi_dev_gpio_irq_wake_get_by(Ptr<acpi_device> adev, String con_id, int index2, Ptr<@OriginalName(value="bool") Boolean> wake_capable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_release_driver_gpios(Ptr<?> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dev_remove_driver_gpios(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_notify(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_device_notify_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_dm_compare_aml_resources(Ptr<Character> aml1_buffer, @Unsigned @OriginalName(value="acpi_rsdesc_size") int aml1_buffer_length, Ptr<Character> aml2_buffer, @Unsigned @OriginalName(value="acpi_rsdesc_size") int aml2_buffer_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_clear_implicit_return(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_clear_operands(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_create_operand(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> arg2, @Unsigned int arg_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_create_operands(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> first_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_delete_result_if_not_used(Ptr<acpi_parse_object> op, Ptr<acpi_operand_object> result_obj, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ds_do_implicit_return(Ptr<acpi_operand_object> return_desc, Ptr<acpi_walk_state> walk_state, char add_reference) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_eval_bank_field_operands(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_eval_buffer_field_operands(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_eval_data_object_operands(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_eval_region_operands(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_eval_table_region_operands(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_evaluate_name_path(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_init_buffer_field(@Unsigned short aml_opcode, Ptr<acpi_operand_object> obj_desc, Ptr<acpi_operand_object> buffer_desc, Ptr<acpi_operand_object> offset_desc, Ptr<acpi_operand_object> length_desc, Ptr<acpi_operand_object> result_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_initialize_region(@OriginalName(value="acpi_handle") Ptr<?> obj_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ds_is_result_used(Ptr<acpi_parse_object> op, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_load2_begin_op(Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_parse_object>> out_op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_load2_end_op(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_method_data_delete_all(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_method_data_get_node(char type2, @Unsigned int index2, Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_namespace_node>> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_method_data_get_value(char type2, @Unsigned int index2, Ptr<acpi_walk_state> walk_state, Ptr<Ptr<acpi_operand_object>> dest_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ds_method_data_init(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_method_data_init_args(Ptr<Ptr<acpi_operand_object>> params, @Unsigned int max_param_count, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_method_data_set_value(char type2, @Unsigned int index2, Ptr<acpi_operand_object> object, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_resolve_operands(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ds_store_object_to_local(char type2, @Unsigned int index2, Ptr<acpi_operand_object> obj_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_duplicate_processor_id(int proc_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_early_processor_control_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_enable_subsystem(@Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_add_gpe_reference(Ptr<acpi_gpe_event_info> gpe_event_info, char clear_on_enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_address_space_dispatch(Ptr<acpi_operand_object> region_obj, Ptr<acpi_operand_object> field_obj, @Unsigned int function, @Unsigned int region_offset, @Unsigned int bit_width, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ev_asynch_enable_gpe(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ev_asynch_execute_gpe_method(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_attach_region(Ptr<acpi_operand_object> handler_obj, Ptr<acpi_operand_object> region_obj, char acpi_ns_is_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ev_detach_region(Ptr<acpi_operand_object> region_obj, char acpi_ns_is_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_detect_gpe(Ptr<acpi_namespace_node> gpe_device, Ptr<acpi_gpe_event_info> gpe_event_info, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_enable_gpe(Ptr<acpi_gpe_event_info> gpe_event_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_execute_reg_method(Ptr<acpi_operand_object> region_obj, @Unsigned int function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ev_execute_reg_methods(Ptr<acpi_namespace_node> node2, @Unsigned int max_depth, @OriginalName(value="acpi_adr_space_type") char space_id, @Unsigned int function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_operand_object> acpi_ev_find_region_handler(@OriginalName(value="acpi_adr_space_type") char space_id, Ptr<acpi_operand_object> handler_obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_finish_gpe(Ptr<acpi_gpe_event_info> gpe_event_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_fixed_event_detect() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_gpe_event_info> acpi_ev_get_gpe_event_info(@OriginalName(value="acpi_handle") Ptr<?> gpe_device, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_gpe_detect(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ev_gpe_dispatch(Ptr<acpi_namespace_node> gpe_device, Ptr<acpi_gpe_event_info> gpe_event_info, @Unsigned int gpe_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ev_has_default_handler(Ptr<acpi_namespace_node> node2, @OriginalName(value="acpi_adr_space_type") char space_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_initialize_events() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_initialize_op_regions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_install_handler(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_install_region_handlers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_install_space_handler(Ptr<acpi_namespace_node> node2, @OriginalName(value="acpi_adr_space_type") char space_id, @OriginalName(value="acpi_adr_space_handler") Ptr<?> handler, @OriginalName(value="acpi_adr_space_setup") Ptr<?> setup, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_install_xrupt_handlers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_gpe_event_info> acpi_ev_low_get_gpe_info(@Unsigned int gpe_number, Ptr<acpi_gpe_block_info> gpe_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_mask_gpe(Ptr<acpi_gpe_event_info> gpe_event_info, char is_masked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_reg_run(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_remove_gpe_reference(Ptr<acpi_gpe_event_info> gpe_event_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ev_update_gpe_enable_mask(Ptr<acpi_gpe_event_info> gpe_event_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_access_region(Ptr<acpi_operand_object> obj_desc, @Unsigned int field_datum_byte_offset, Ptr<@Unsigned Long> value, @Unsigned int function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ex_convert_to_ascii(@Unsigned long integer, @Unsigned short base, Ptr<Character> string, char data_width, char leading_zeros) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_convert_to_buffer(Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> result_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_convert_to_integer(Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> result_desc, @Unsigned int implicit_conversion) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_convert_to_string(Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> result_desc, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_convert_to_target_type(@Unsigned @OriginalName(value="acpi_object_type") int destination_type, Ptr<acpi_operand_object> source_desc, Ptr<Ptr<acpi_operand_object>> result_desc, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ex_do_debug_object(Ptr<acpi_operand_object> source_desc, @Unsigned int level, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_extract_from_field(Ptr<acpi_operand_object> obj_desc, Ptr<?> buffer, @Unsigned int buffer_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_field_datum_io(Ptr<acpi_operand_object> obj_desc, @Unsigned int field_datum_byte_offset, Ptr<@Unsigned Long> value, @Unsigned int read_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_insert_into_field(Ptr<acpi_operand_object> obj_desc, Ptr<?> buffer, @Unsigned int buffer_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_prep_common_field_object(Ptr<acpi_operand_object> obj_desc, char field_flags, char field_attribute, @Unsigned int field_bit_position, @Unsigned int field_bit_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_prep_field_value(Ptr<acpi_create_field_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_read_gpio(Ptr<acpi_operand_object> obj_desc, Ptr<?> buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_read_serial_bus(Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> return_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_resolve_multiple(Ptr<acpi_walk_state> walk_state, Ptr<acpi_operand_object> operand, Ptr<@Unsigned @OriginalName(value="acpi_object_type") Integer> return_type, Ptr<Ptr<acpi_operand_object>> return_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_resolve_object_to_value(Ptr<Ptr<acpi_operand_object>> stack_ptr, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_resolve_to_value(Ptr<Ptr<acpi_operand_object>> stack_ptr, Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_setup_region(Ptr<acpi_operand_object> obj_desc, @Unsigned int field_datum_byte_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_do_sleep(@Unsigned long how_long_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_do_stall(@Unsigned int how_long_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_reset_event(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_signal_event(Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_wait_event(Ptr<acpi_operand_object> time_desc, Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_wait_mutex(Ptr<?> mutex2, @Unsigned short timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_system_wait_semaphore(Ptr<?> semaphore2, @Unsigned short timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_write_gpio(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> return_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_write_serial_bus(Ptr<acpi_operand_object> source_desc, Ptr<acpi_operand_object> obj_desc, Ptr<Ptr<acpi_operand_object>> return_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ex_write_with_update_rule(Ptr<acpi_operand_object> obj_desc, @Unsigned long mask, @Unsigned long field_value, @Unsigned int field_datum_byte_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_execute_reg_methods(@OriginalName(value="acpi_handle") Ptr<?> device2, @Unsigned int max_depth, @OriginalName(value="acpi_adr_space_type") char space_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_fan_create_attributes(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_fan_delete_attributes(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_device> acpi_find_child_by_adr(Ptr<acpi_device> adev, @Unsigned @OriginalName(value="acpi_bus_address") long adr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_device> acpi_find_child_device(Ptr<acpi_device> parent, @Unsigned long address, boolean check_children) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_find_gpio($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<GpioDefinitions.gpio_desc> acpi_find_gpio(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String con_id, @Unsigned int idx, Ptr<GpiodDefinitions.gpiod_flags> dflags, Ptr<@Unsigned Long> lookupflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_find_gpio_count(Ptr<acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_find_root_pointer(Ptr<@Unsigned @OriginalName(value="acpi_physical_address") Long> table_address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_force_32bit_fadt_addr(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_force_table_verification_setup(String s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn acpi_ged_irq_handler(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ged_request_interrupt(Ptr<acpi_resource> ares, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_current_resources(@OriginalName(value="acpi_handle") Ptr<?> device_handle, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_event_resources(@OriginalName(value="acpi_handle") Ptr<?> device_handle, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_get_gpiod_by_index($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<GpioDefinitions.gpio_desc> acpi_get_gpiod_by_index(Ptr<acpi_device> adev, String propname, int index2, Ptr<acpi_gpio_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_get_hp_hw_control_from_firmware(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_irq_routing_table(@OriginalName(value="acpi_handle") Ptr<?> device_handle, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PciDefinitions.pci_dev> acpi_get_pci_dev(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_possible_resources(@OriginalName(value="acpi_handle") Ptr<?> device_handle, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="acpi_handle") Ptr<?> acpi_get_processor_handle(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_table(String signature, @Unsigned int instance, Ptr<Ptr<acpi_table_header>> out_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_table_by_index(@Unsigned int table_index, Ptr<Ptr<acpi_table_header>> out_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_table_header(String signature, @Unsigned int instance, Ptr<acpi_table_header> out_table_header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_get_vendor_resource(@OriginalName(value="acpi_handle") Ptr<?> device_handle, String name, Ptr<acpi_vendor_uuid> uuid, Ptr<acpi_buffer> ret_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long acpi_get_wakeup_address() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_gpio_adr_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int bits, Ptr<@Unsigned Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_gpio_chip_dh(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_gpio_count((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static int acpi_gpio_count(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_gpio_get_io_resource(Ptr<acpi_resource> ares, Ptr<Ptr<acpi_resource_gpio>> agpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_gpio_get_irq_resource(Ptr<acpi_resource> ares, Ptr<Ptr<acpi_resource_gpio>> agpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_gpio_handle_deferred_request_irqs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_gpio_in_ignore_list((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static boolean acpi_gpio_in_ignore_list(String ignore_list, String controller_in, @Unsigned int pin_in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn acpi_gpio_irq_handler(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn acpi_gpio_irq_handler_evt(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_gpio_irq_is_wake($arg1, (const struct acpi_resource_gpio*)$arg2)")
    public static boolean acpi_gpio_irq_is_wake(Ptr<runtime.device> parent, Ptr<acpi_resource_gpio> agpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_gpio_property_lookup($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int acpi_gpio_property_lookup(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname, int index2, Ptr<acpi_gpio_lookup> lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_gpio_setup_params() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_gpio_to_gpiod_flags((const struct acpi_resource_gpio*)$arg1, $arg2)")
    public static GpiodDefinitions.gpiod_flags acpi_gpio_to_gpiod_flags(Ptr<acpi_resource_gpio> agpio, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_gpio_update_gpiod_flags(Ptr<GpiodDefinitions.gpiod_flags> flags, Ptr<acpi_gpio_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_gpiochip_add(Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_gpiochip_alloc_event(Ptr<acpi_resource> ares, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_gpiochip_find($arg1, (const void*)$arg2)")
    public static int acpi_gpiochip_find(Ptr<GpioDefinitions.gpio_chip> gc, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_gpiochip_free_interrupts(Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_gpiochip_remove(Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_gpiochip_request_interrupts(Ptr<GpioDefinitions.gpio_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_gpiochip_request_irqs(Ptr<acpi_gpio_chip> acpi_gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_gpiochip_scan_gpios(Ptr<acpi_gpio_chip> achip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_hed_add(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_hed_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_hed_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_hed_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_hed_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_hibernation_begin( @OriginalName(value="pm_message_t") PmDefinitions.pm_message stage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_hibernation_begin_old( @OriginalName(value="pm_message_t") PmDefinitions.pm_message stage) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_hibernation_enter() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_hibernation_leave() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_hw_check_all_gpes(@OriginalName(value="acpi_handle") Ptr<?> gpe_skip_device, @Unsigned int gpe_skip_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_clear_gpe(Ptr<acpi_gpe_event_info> gpe_event_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_clear_gpe_block(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_info, Ptr<acpi_gpe_block_info> gpe_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_disable_all_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_disable_gpe_block(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_info, Ptr<acpi_gpe_block_info> gpe_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_enable_all_runtime_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_enable_all_wakeup_gpes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_enable_runtime_gpe_block(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_info, Ptr<acpi_gpe_block_info> gpe_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_enable_wakeup_gpe_block(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_info, Ptr<acpi_gpe_block_info> gpe_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_get_gpe_block_status(Ptr<acpi_gpe_xrupt_info> gpe_xrupt_info, Ptr<acpi_gpe_block_info> gpe_block, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_hw_get_gpe_register_bit(Ptr<acpi_gpe_event_info> gpe_event_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_get_gpe_status(Ptr<acpi_gpe_event_info> gpe_event_info, Ptr<@Unsigned @OriginalName(value="acpi_event_status") Integer> event_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_hw_get_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_gpe_read(Ptr<@Unsigned Long> value, Ptr<acpi_gpe_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_gpe_write(@Unsigned long value, Ptr<acpi_gpe_address> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_legacy_sleep(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_legacy_wake(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_legacy_wake_prep(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_low_set_gpe(Ptr<acpi_gpe_event_info> gpe_event_info, @Unsigned int action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_hw_set_mode(@Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long acpi_index_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_init_pcc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_initialize_debugger() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_initialize_objects(@Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_initialize_subsystem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_initialize_tables(Ptr<acpi_table_desc> initial_table_array, @Unsigned int initial_table_count, char allow_resize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_address_space_handler(@OriginalName(value="acpi_handle") Ptr<?> device2, @OriginalName(value="acpi_adr_space_type") char space_id, @OriginalName(value="acpi_adr_space_handler") Ptr<?> handler, @OriginalName(value="acpi_adr_space_setup") Ptr<?> setup, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_address_space_handler_internal(@OriginalName(value="acpi_handle") Ptr<?> device2, @OriginalName(value="acpi_adr_space_type") char space_id, @OriginalName(value="acpi_adr_space_handler") Ptr<?> handler, @OriginalName(value="acpi_adr_space_setup") Ptr<?> setup, Ptr<?> context2, char run_reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_address_space_handler_no_reg(@OriginalName(value="acpi_handle") Ptr<?> device2, @OriginalName(value="acpi_adr_space_type") char space_id, @OriginalName(value="acpi_adr_space_handler") Ptr<?> handler, @OriginalName(value="acpi_adr_space_setup") Ptr<?> setup, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_install_cmos_rtc_space_handler(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_install_table_handler(@OriginalName(value="acpi_table_handler") Ptr<?> handler, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_is_root_bridge(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_locate_initial_tables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_build_internal_name(Ptr<acpi_namestring_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_namespace_node> acpi_ns_create_node(@Unsigned int name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_delete_children(Ptr<acpi_namespace_node> parent_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_delete_namespace_by_owner(@Unsigned @OriginalName(value="acpi_owner_id") short owner_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_delete_namespace_subtree(Ptr<acpi_namespace_node> parent_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_delete_node(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_externalize_name($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_externalize_name(@Unsigned int internal_name_length, String internal_name, Ptr<@Unsigned Integer> converted_name_length, Ptr<String> converted_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_find_ini_methods(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_get_internal_name_length(Ptr<acpi_namestring_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_get_node($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_get_node(Ptr<acpi_namespace_node> prefix_node, String pathname, @Unsigned int flags, Ptr<Ptr<acpi_namespace_node>> return_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_get_node_unlocked($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_get_node_unlocked(Ptr<acpi_namespace_node> prefix_node, String pathname, @Unsigned int flags, Ptr<Ptr<acpi_namespace_node>> return_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_object_type") int acpi_ns_get_type(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_init_one_device(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int nesting_level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_init_one_object(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_init_one_package(@OriginalName(value="acpi_handle") Ptr<?> obj_handle, @Unsigned int level, Ptr<?> context2, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_initialize_devices(@Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_initialize_objects() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_install_node(Ptr<acpi_walk_state> walk_state, Ptr<acpi_namespace_node> parent_node, Ptr<acpi_namespace_node> node2, @Unsigned @OriginalName(value="acpi_object_type") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_internalize_name((const u8*)$arg1, $arg2)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_internalize_name(String external_name2, Ptr<String> converted_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ns_local(@Unsigned @OriginalName(value="acpi_object_type") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ns_opens_scope(@Unsigned @OriginalName(value="acpi_object_type") int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ns_print_node_pathname($arg1, (const u8*)$arg2)")
    public static void acpi_ns_print_node_pathname(Ptr<acpi_namespace_node> node2, String message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_remove_node(Ptr<acpi_namespace_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_remove_null_elements(Ptr<acpi_evaluate_info> info2, char package_type, Ptr<acpi_operand_object> obj_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_repair_null_element(Ptr<acpi_evaluate_info> info2, @Unsigned int expected_btypes, @Unsigned int package_index, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_simple_repair(Ptr<acpi_evaluate_info> info2, @Unsigned int expected_btypes, @Unsigned int package_index, Ptr<Ptr<acpi_operand_object>> return_object_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ns_terminate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_namespace_node> acpi_ns_validate_handle(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ns_wrap_with_package(Ptr<acpi_evaluate_info> info2, Ptr<acpi_operand_object> original_object, Ptr<Ptr<acpi_operand_object>> obj_desc_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_nvs_nosave() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_nvs_nosave_s3() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_old_suspend_ordering() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_physical_table_override(Ptr<acpi_table_header> existing_table, Ptr<@Unsigned @OriginalName(value="acpi_physical_address") Long> address, Ptr<@Unsigned Integer> table_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_os_table_override(Ptr<acpi_table_header> existing_table, Ptr<Ptr<acpi_table_header>> new_table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_osi_handler(@OriginalName(value="acpi_string") String _interface, @Unsigned int supported) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_osi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_osi_is_win8() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_osi_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pad_add(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pad_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pad_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_apic_instance(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_parse_prmt($arg1, (const long unsigned int)$arg2)")
    public static int acpi_parse_prmt(Ptr<acpi_subtable_headers> header, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_parse_spcr(boolean enable_earlycon, boolean enable_console) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_pcc_address_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long addr2, @Unsigned int bits, Ptr<@Unsigned @OriginalName(value="acpi_integer") Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_pcc_address_space_setup(@OriginalName(value="acpi_handle") Ptr<?> region_handle, @Unsigned int function, Ptr<?> handler_context, Ptr<Ptr<?>> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_check_ejectable(Ptr<PciDefinitions.pci_bus> pbus, @OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_detect_ejectable(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_pci_root> acpi_pci_find_root(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_pci_osc_control_set(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<@Unsigned Integer> mask, @Unsigned int support, Ptr<@Unsigned Integer> cxl_mask, @Unsigned int cxl_support) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_probe_root_resources(Ptr<acpi_pci_root_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_pci_root_add($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_pci_root_add(Ptr<acpi_device> device2, Ptr<acpi_device_id> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PciDefinitions.pci_bus> acpi_pci_root_create(Ptr<acpi_pci_root> root, Ptr<acpi_pci_root_ops> ops, Ptr<acpi_pci_root_info> info2, Ptr<?> sysdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_root_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_root_release_info(Ptr<PciDefinitions.pci_host_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_root_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pci_root_scan_dependent(Ptr<acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pci_root_validate_resources(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> resources, @Unsigned long type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_pci_run_osc($arg1, (const unsigned int*)$arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_pci_run_osc(Ptr<acpi_pci_root> root, Ptr<@Unsigned Integer> capbuf, Ptr<@Unsigned Integer> pci_control, Ptr<@Unsigned Integer> cxl_control) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_physnode_link_name(String buf, @Unsigned int node_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_platform_device_remove_notify(Ptr<misc.notifier_block> nb, @Unsigned long value, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_platform_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_platform_resource_count(Ptr<acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_platformrt_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long addr2, @Unsigned int bits, Ptr<@Unsigned @OriginalName(value="acpi_integer") Long> value, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_end() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_finish() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pm_freeze() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pm_pre_suspend() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_pm_prepare() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_pm_thaw() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_populate_gpio_lookup(Ptr<acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_power_off_prepare(Ptr<SysDefinitions.sys_off_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_processor_add($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_processor_add(Ptr<acpi_device> device2, Ptr<acpi_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_processor_claim_cst_control() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_processor_container_attach($arg1, (const struct acpi_device_id*)$arg2)")
    public static int acpi_processor_container_attach(Ptr<acpi_device> dev, Ptr<acpi_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_errata_piix4(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_evaluate_cst(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int cpu2, Ptr<acpi_processor_power> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_bios_limit(int cpu2, Ptr<@Unsigned Integer> limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_info(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_performance_control(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_performance_info(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_performance_states(Ptr<acpi_processor> pr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_get_psd(@OriginalName(value="acpi_handle") Ptr<?> handle, Ptr<acpi_psd_package> pdomain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_processor_ids_walk(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_ignore_ppc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_notifier(Ptr<misc.notifier_block> nb, @Unsigned long event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_notify_smm(Ptr<runtime.module> calling_module) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_processor_osc(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int lvl, Ptr<?> context2, Ptr<Ptr<?>> rv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_post_eject(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_ppc_exit(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_ppc_has_changed(Ptr<acpi_processor> pr, int event_flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_ppc_init(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_preregister_performance(Ptr<acpi_processor_performance> performance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_pstate_control() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_register_performance(Ptr<acpi_processor_performance> performance, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_set_per_cpu(Ptr<acpi_processor> pr, Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_processor_stop(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_processor_unregister_performance(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_complete_this_op(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_execute_method(Ptr<acpi_evaluate_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_execute_table(Ptr<acpi_evaluate_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_get_arguments(Ptr<acpi_walk_state> walk_state, Ptr<Character> aml_op_start, Ptr<acpi_parse_object> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ps_get_opcode_size(@Unsigned int opcode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_next_parse_state(Ptr<acpi_walk_state> walk_state, Ptr<acpi_parse_object> op, @Unsigned @OriginalName(value="acpi_status") int callback_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_parse_aml(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ps_parse_loop(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short acpi_ps_peek_opcode(Ptr<acpi_parse_state> parser_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_put_table(Ptr<acpi_table_header> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_reallocate_root_table() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_reboot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_register_gsi_xen(Ptr<runtime.device> dev, @Unsigned int gsi, int trigger, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_register_gsi_xen_hvm(Ptr<runtime.device> dev, @Unsigned int gsi, int trigger, int polarity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_address_space_handler(@OriginalName(value="acpi_handle") Ptr<?> device2, @OriginalName(value="acpi_adr_space_type") char space_id, @OriginalName(value="acpi_adr_space_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_remove_cmos_rtc_space_handler(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_remove_table_handler(@OriginalName(value="acpi_table_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_request_own_gpiod($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<GpioDefinitions.gpio_desc> acpi_request_own_gpiod(Ptr<GpioDefinitions.gpio_chip> chip, Ptr<acpi_resource_gpio> agpio, @Unsigned int index2, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_reserve_initial_tables() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_resource_to_address64(Ptr<acpi_resource> resource2, Ptr<acpi_resource_address64> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_restore_bm_rld() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_convert_aml_to_resources(Ptr<Character> aml, @Unsigned int length, @Unsigned int offset, char resource_index, Ptr<Ptr<?>> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_convert_resources_to_aml(Ptr<acpi_resource> resource2, @Unsigned @OriginalName(value="acpi_size") long aml_size_needed, Ptr<Character> output_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_match_vendor_resource(Ptr<acpi_resource> resource2, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_rs_validate_parameters(@OriginalName(value="acpi_handle") Ptr<?> device_handle, Ptr<acpi_buffer> buffer, Ptr<Ptr<acpi_namespace_node>> return_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_s2idle_begin() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_s2idle_end() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_s2idle_prepare() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_s2idle_restore() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_s2idle_wake() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_s2idle_wakeup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_save_bm_rld() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_set_current_resources(@OriginalName(value="acpi_handle") Ptr<?> device_handle, Ptr<acpi_buffer> in_buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_set_debugger_thread_id(@Unsigned long thread_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_sleep_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_sleep_no_blacklist() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_sleep_prepare(@Unsigned int acpi_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_sleep_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_sleep_state_supported(char sleep_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_soft_cpu_dead(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_soft_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_suspend_begin(@OriginalName(value="suspend_state_t") int pm_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_suspend_begin_old(@OriginalName(value="suspend_state_t") int pm_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_suspend_enter(@OriginalName(value="suspend_state_t") int pm_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_suspend_state_valid(@OriginalName(value="suspend_state_t") int pm_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_table_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_table_init_complete() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_table_initrd_override(Ptr<acpi_table_header> existing_table, Ptr<@Unsigned @OriginalName(value="acpi_physical_address") Long> address, Ptr<@Unsigned Integer> length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_table_parse(String id, @OriginalName(value="acpi_tbl_table_handler") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_table_parse_cedt(acpi_cedt_type id, @OriginalName(value="acpi_tbl_entry_handler_arg") Ptr<?> handler_arg, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_table_parse_entries(String id, @Unsigned long table_size, int entry_id, @OriginalName(value="acpi_tbl_entry_handler") Ptr<?> handler, @Unsigned int max_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_table_parse_entries_array(String id, @Unsigned long table_size, Ptr<acpi_subtable_proc> proc, int proc_num, @Unsigned int max_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_table_parse_madt(acpi_madt_type id, @OriginalName(value="acpi_tbl_entry_handler") Ptr<?> handler, @Unsigned int max_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_table_print_madt_entry(Ptr<acpi_subtable_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_table_upgrade() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_target_system_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_cleanup_table_header(Ptr<acpi_table_header> out_header, Ptr<acpi_table_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_tb_get_rsdp_length(Ptr<acpi_table_rsdp> rsdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_install_standard_table(@Unsigned @OriginalName(value="acpi_physical_address") long address, char flags, Ptr<acpi_table_header> table, char reload, char override, Ptr<@Unsigned Integer> table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_install_table_with_override(Ptr<acpi_table_desc> new_table_desc, char override, Ptr<@Unsigned Integer> table_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_override_table(Ptr<acpi_table_desc> old_table_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_print_table_header(@Unsigned @OriginalName(value="acpi_physical_address") long address, Ptr<acpi_table_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> acpi_tb_scan_memory_for_rsdp(Ptr<Character> start_address, @Unsigned int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_tb_uninstall_table(Ptr<acpi_table_desc> table_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_tb_validate_rsdp(Ptr<acpi_table_rsdp> rsdp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_terminate_debugger() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_thermal_add(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_thermal_adjust_trip(Ptr<ThermalDefinitions.thermal_trip> trip, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_thermal_check_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_thermal_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_thermal_get_temperature(Ptr<acpi_thermal> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_thermal_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean acpi_thermal_init_trip(Ptr<acpi_thermal> tz, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_thermal_notify(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_thermal_remove(Ptr<acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_thermal_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_thermal_should_bind_cdev($arg1, (const struct thermal_trip*)$arg2, $arg3, $arg4)")
    public static boolean acpi_thermal_should_bind_cdev(Ptr<ThermalDefinitions.thermal_zone_device> thermal, Ptr<ThermalDefinitions.thermal_trip> trip, Ptr<ThermalDefinitions.thermal_cooling_device> cdev2, Ptr<misc.cooling_spec> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_thermal_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_thermal_zone_device_critical(Ptr<ThermalDefinitions.thermal_zone_device> thermal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_thermal_zone_device_hot(Ptr<ThermalDefinitions.thermal_zone_device> thermal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_unbind_one(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_add_address_range(@OriginalName(value="acpi_adr_space_type") char space_id, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int length, Ptr<acpi_namespace_node> region_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_add_reference(Ptr<acpi_operand_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int acpi_ut_check_address_range(@OriginalName(value="acpi_adr_space_type") char space_id, @Unsigned @OriginalName(value="acpi_physical_address") long address, @Unsigned int length, char warn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_delete_address_lists() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_delete_internal_obj(Ptr<acpi_operand_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_delete_internal_object_list(Ptr<Ptr<acpi_operand_object>> obj_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_evaluate_numeric_object((const u8*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_evaluate_numeric_object(String object_name, Ptr<acpi_namespace_node> device_node2, Ptr<@Unsigned Long> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_evaluate_object($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_evaluate_object(Ptr<acpi_namespace_node> prefix_node, String path2, @Unsigned int expected_return_btypes, Ptr<Ptr<acpi_operand_object>> return_desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_execute_STA(Ptr<acpi_namespace_node> device_node2, Ptr<@Unsigned Integer> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="acpi_ut_execute_power_methods($arg1, (const u8**)$arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_execute_power_methods(Ptr<acpi_namespace_node> device_node2, Ptr<String> method_names, char method_count, Ptr<Character> out_values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<acpi_interface_info> acpi_ut_get_interface(@OriginalName(value="acpi_string") String interface_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_initialize_interfaces() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_install_interface(@OriginalName(value="acpi_string") String interface_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_interface_terminate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_osi_implementation(Ptr<acpi_walk_state> walk_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_remove_address_range(@OriginalName(value="acpi_adr_space_type") char space_id, Ptr<acpi_namespace_node> region_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_remove_interface(@OriginalName(value="acpi_string") String interface_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_remove_reference(Ptr<acpi_operand_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_safe_strcat(String dest, @Unsigned @OriginalName(value="acpi_size") long dest_size, String source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_safe_strcpy(String dest, @Unsigned @OriginalName(value="acpi_size") long dest_size, String source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char acpi_ut_safe_strncat(String dest, @Unsigned @OriginalName(value="acpi_size") long dest_size, String source, @Unsigned @OriginalName(value="acpi_size") long max_transfer_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_safe_strncpy(String dest, String source, @Unsigned @OriginalName(value="acpi_size") long dest_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int acpi_ut_stricmp(String string1, String string2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_strlwr(String src_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_strupr(String src_string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_update_interfaces(char action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_ut_update_object_reference(Ptr<acpi_operand_object> object, @Unsigned short action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void acpi_ut_update_ref_count(Ptr<acpi_operand_object> object, @Unsigned int action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_walk_resource_buffer(Ptr<acpi_buffer> buffer, @OriginalName(value="acpi_walk_resource_callback") Ptr<?> user_function, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int acpi_walk_resources(@OriginalName(value="acpi_handle") Ptr<?> device_handle, String name, @OriginalName(value="acpi_walk_resource_callback") Ptr<?> user_function, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct transaction")
    @NotUsableInJava
    public static class transaction
    extends Struct {
        public Ptr<Character> wdata;
        public Ptr<Character> rdata;
        public @Unsigned short irq_count;
        public char command;
        public char wi;
        public char ri;
        public char wlen;
        public char rlen;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_spi_lookup")
    @NotUsableInJava
    public static class acpi_spi_lookup
    extends Struct {
        public Ptr<SpiDefinitions.spi_controller> ctlr;
        public @Unsigned int max_speed_hz;
        public @Unsigned int mode;
        public int irq;
        public char bits_per_word;
        public char chip_select;
        public int n;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_serdev_lookup")
    @NotUsableInJava
    public static class acpi_serdev_lookup
    extends Struct {
        public @OriginalName(value="acpi_handle") Ptr<?> device_handle;
        public @OriginalName(value="acpi_handle") Ptr<?> controller_handle;
        public int n;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_viot_virtio_iommu_mmio")
    @NotUsableInJava
    public static class acpi_viot_virtio_iommu_mmio
    extends Struct {
        public acpi_viot_header header;
        public char @Size(value=4) [] reserved;
        public @Unsigned long base_address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_viot_virtio_iommu_pci")
    @NotUsableInJava
    public static class acpi_viot_virtio_iommu_pci
    extends Struct {
        public acpi_viot_header header;
        public @Unsigned short segment;
        public @Unsigned short bdf;
        public char @Size(value=8) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_viot_mmio")
    @NotUsableInJava
    public static class acpi_viot_mmio
    extends Struct {
        public acpi_viot_header header;
        public @Unsigned int endpoint;
        public @Unsigned long base_address;
        public @Unsigned short output_node;
        public char @Size(value=6) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_viot_pci_range")
    @NotUsableInJava
    public static class acpi_viot_pci_range
    extends Struct {
        public acpi_viot_header header;
        public @Unsigned int endpoint_start;
        public @Unsigned short segment_start;
        public @Unsigned short segment_end;
        public @Unsigned short bdf_start;
        public @Unsigned short bdf_end;
        public @Unsigned short output_node;
        public char @Size(value=6) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_viot_node_type")
    public static enum acpi_viot_node_type implements Enum<acpi_viot_node_type>,
    TypedEnum<acpi_viot_node_type, Integer>
    {
        ACPI_VIOT_NODE_PCI_RANGE,
        ACPI_VIOT_NODE_MMIO,
        ACPI_VIOT_NODE_VIRTIO_IOMMU_PCI,
        ACPI_VIOT_NODE_VIRTIO_IOMMU_MMIO,
        ACPI_VIOT_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_viot_header")
    @NotUsableInJava
    public static class acpi_viot_header
    extends Struct {
        public char type;
        public char reserved;
        public @Unsigned short length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_viot")
    @NotUsableInJava
    public static class acpi_table_viot
    extends Struct {
        public acpi_table_header header;
        public @Unsigned short node_count;
        public @Unsigned short node_offset;
        public char @Size(value=8) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_hest_notify_types")
    public static enum acpi_hest_notify_types implements Enum<acpi_hest_notify_types>,
    TypedEnum<acpi_hest_notify_types, Integer>
    {
        ACPI_HEST_NOTIFY_POLLED,
        ACPI_HEST_NOTIFY_EXTERNAL,
        ACPI_HEST_NOTIFY_LOCAL,
        ACPI_HEST_NOTIFY_SCI,
        ACPI_HEST_NOTIFY_NMI,
        ACPI_HEST_NOTIFY_CMCI,
        ACPI_HEST_NOTIFY_MCE,
        ACPI_HEST_NOTIFY_GPIO,
        ACPI_HEST_NOTIFY_SEA,
        ACPI_HEST_NOTIFY_SEI,
        ACPI_HEST_NOTIFY_GSIV,
        ACPI_HEST_NOTIFY_SOFTWARE_DELEGATED,
        ACPI_HEST_NOTIFY_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_bert_region")
    @NotUsableInJava
    public static class acpi_bert_region
    extends Struct {
        public @Unsigned int block_status;
        public @Unsigned int raw_data_offset;
        public @Unsigned int raw_data_length;
        public @Unsigned int data_length;
        public @Unsigned int error_severity;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pcct_shared_memory")
    @NotUsableInJava
    public static class acpi_pcct_shared_memory
    extends Struct {
        public @Unsigned int signature;
        public @Unsigned short command;
        public @Unsigned short status;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_ioapic")
    @NotUsableInJava
    public static class acpi_pci_ioapic
    extends Struct {
        public @OriginalName(value="acpi_handle") Ptr<?> root_handle;
        public @OriginalName(value="acpi_handle") Ptr<?> handle;
        public @Unsigned int gsi_base;
        public runtime.resource res;
        public Ptr<PciDefinitions.pci_dev> pdev;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hmat_cache")
    @NotUsableInJava
    public static class acpi_hmat_cache
    extends Struct {
        public acpi_hmat_structure header;
        public @Unsigned int memory_PD;
        public @Unsigned int reserved1;
        public @Unsigned long cache_size;
        public @Unsigned int cache_attributes;
        public @Unsigned short address_mode;
        public @Unsigned short number_of_SMBIOShandles;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hmat_locality")
    @NotUsableInJava
    public static class acpi_hmat_locality
    extends Struct {
        public acpi_hmat_structure header;
        public char flags;
        public char data_type;
        public char min_transfer_size;
        public char reserved1;
        public @Unsigned int number_of_initiator_Pds;
        public @Unsigned int number_of_target_Pds;
        public @Unsigned int reserved2;
        public @Unsigned long entry_base_unit;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hmat_proximity_domain")
    @NotUsableInJava
    public static class acpi_hmat_proximity_domain
    extends Struct {
        public acpi_hmat_structure header;
        public @Unsigned short flags;
        public @Unsigned short reserved1;
        public @Unsigned int processor_PD;
        public @Unsigned int memory_PD;
        public @Unsigned int reserved2;
        public @Unsigned long reserved3;
        public @Unsigned long reserved4;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_hmat_type")
    public static enum acpi_hmat_type implements Enum<acpi_hmat_type>,
    TypedEnum<acpi_hmat_type, Integer>
    {
        ACPI_HMAT_TYPE_PROXIMITY,
        ACPI_HMAT_TYPE_LOCALITY,
        ACPI_HMAT_TYPE_CACHE,
        ACPI_HMAT_TYPE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_lpi_states_array")
    @NotUsableInJava
    public static class acpi_lpi_states_array
    extends Struct {
        public @Unsigned int size;
        public @Unsigned int composite_states_size;
        public Ptr<acpi_lpi_state> entries;
        public Ptr<acpi_lpi_state> @Size(value=8) [] composite_states;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ac")
    @NotUsableInJava
    public static class acpi_ac
    extends Struct {
        public Ptr<PowerDefinitions.power_supply> charger;
        public PowerDefinitions.power_supply_desc charger_desc;
        public Ptr<acpi_device> device;
        public @Unsigned long state;
        public misc.notifier_block battery_nb;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_fadt_pm_info")
    @NotUsableInJava
    public static class acpi_fadt_pm_info
    extends Struct {
        public Ptr<acpi_generic_address> target;
        public @Unsigned short source;
        public char register_num;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_fadt_info")
    @NotUsableInJava
    public static class acpi_fadt_info
    extends Struct {
        public String name;
        public @Unsigned short address64;
        public @Unsigned short address32;
        public @Unsigned short length;
        public char default_length;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_get_devices_info")
    @NotUsableInJava
    public static class acpi_get_devices_info
    extends Struct {
        public @OriginalName(value="acpi_walk_callback") Ptr<?> user_function;
        public Ptr<?> context;
        public String hid;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_repair_info")
    @NotUsableInJava
    public static class acpi_repair_info
    extends Struct {
        public char @Size(value=4) [] name;
        public @OriginalName(value="acpi_repair_function") Ptr<?> repair_function;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_data_table_mapping")
    @NotUsableInJava
    public static class acpi_data_table_mapping
    extends Struct {
        public Ptr<?> pointer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_mem_space_context")
    @NotUsableInJava
    public static class acpi_mem_space_context
    extends Struct {
        public @Unsigned int length;
        public @Unsigned @OriginalName(value="acpi_physical_address") long address;
        public Ptr<acpi_mem_mapping> cur_mm;
        public Ptr<acpi_mem_mapping> first_mm;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_mem_mapping")
    @NotUsableInJava
    public static class acpi_mem_mapping
    extends Struct {
        public @Unsigned @OriginalName(value="acpi_physical_address") long physical_address;
        public Ptr<Character> logical_address;
        public @Unsigned @OriginalName(value="acpi_size") long length;
        public Ptr<acpi_mem_mapping> next_mm;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_genl_event")
    @NotUsableInJava
    public static class acpi_genl_event
    extends Struct {
        public char @Size(value=20) @OriginalName(value="acpi_device_class") [] device_class;
        public char @Size(value=15) [] bus_id;
        public @Unsigned int type;
        public @Unsigned int data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_bus_event")
    @NotUsableInJava
    public static class acpi_bus_event
    extends Struct {
        public ListDefinitions.list_head node;
        public char @Size(value=20) @OriginalName(value="acpi_device_class") [] device_class;
        public char @Size(value=8) @OriginalName(value="acpi_bus_id") [] bus_id;
        public @Unsigned int type;
        public @Unsigned int data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_link")
    @NotUsableInJava
    public static class acpi_pci_link
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<acpi_device> device;
        public acpi_pci_link_irq irq;
        public int refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_link_irq")
    @NotUsableInJava
    public static class acpi_pci_link_irq
    extends Struct {
        public @Unsigned int active;
        public char triggering;
        public char polarity;
        public char resource_type;
        public char possible_count;
        public @Unsigned int @Size(value=16) [] possible;
        public char initialized;
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_scan_clear_dep_work")
    @NotUsableInJava
    public static class acpi_scan_clear_dep_work
    extends Struct {
        public misc.work_struct work;
        public Ptr<acpi_device> adev;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_probe_entry")
    @NotUsableInJava
    public static class acpi_probe_entry
    extends Struct {
        public char @Size(value=5) [] id;
        public char type;
        public @OriginalName(value="acpi_probe_entry_validate_subtbl") Ptr<?> subtable_valid;
        @InlineUnion(value=93818)
        public @InlineUnion(value=93818) @OriginalName(value="acpi_tbl_table_handler") Ptr<?> probe_table;
        @InlineUnion(value=93818)
        public @InlineUnion(value=93818) @OriginalName(value="acpi_tbl_entry_handler") Ptr<?> probe_subtbl;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dep_data")
    @NotUsableInJava
    public static class acpi_dep_data
    extends Struct {
        public ListDefinitions.list_head node;
        public @OriginalName(value="acpi_handle") Ptr<?> supplier;
        public @OriginalName(value="acpi_handle") Ptr<?> consumer;
        public boolean honor_dep;
        public boolean met;
        public boolean free_when_met;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_stao")
    @NotUsableInJava
    public static class acpi_table_stao
    extends Struct {
        public acpi_table_header header;
        public char ignore_uart;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hp_work")
    @NotUsableInJava
    public static class acpi_hp_work
    extends Struct {
        public misc.work_struct work;
        public Ptr<acpi_device> adev;
        public @Unsigned int src;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ioremap")
    @NotUsableInJava
    public static class acpi_ioremap
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> virt;
        public @Unsigned @OriginalName(value="acpi_physical_address") long phys;
        public @Unsigned @OriginalName(value="acpi_size") long size;
        public TrackDefinitions.track_of_acpi_ioremap track;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_os_dpc")
    @NotUsableInJava
    public static class acpi_os_dpc
    extends Struct {
        public @OriginalName(value="acpi_osd_exec_callback") Ptr<?> function;
        public Ptr<?> context;
        public misc.work_struct work;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_debugger")
    @NotUsableInJava
    public static class acpi_debugger
    extends Struct {
        public Ptr<acpi_debugger_ops> ops;
        public Ptr<runtime.module> owner;
        public runtime.mutex lock;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_multiproc_wakeup_mailbox")
    @NotUsableInJava
    public static class acpi_madt_multiproc_wakeup_mailbox
    extends Struct {
        public @Unsigned short command;
        public @Unsigned short reserved;
        public @Unsigned int apic_id;
        public @Unsigned long wakeup_vector;
        public char @Size(value=2032) [] reserved_os;
        public char @Size(value=2048) [] reserved_firmware;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_ia_error_bank")
    @NotUsableInJava
    public static class acpi_hest_ia_error_bank
    extends Struct {
        public char bank_number;
        public char clear_status_on_init;
        public char status_format;
        public char reserved;
        public @Unsigned int control_register;
        public @Unsigned long control_data;
        public @Unsigned int status_register;
        public @Unsigned int address_register;
        public @Unsigned int misc_register;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_mcfg_allocation")
    @NotUsableInJava
    public static class acpi_mcfg_allocation
    extends Struct {
        public @Unsigned long address;
        public @Unsigned short pci_segment;
        public char start_bus_number;
        public char end_bus_number;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_mcfg")
    @NotUsableInJava
    public static class acpi_table_mcfg
    extends Struct {
        public acpi_table_header header;
        public char @Size(value=8) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_generic_data_v300")
    @NotUsableInJava
    public static class acpi_hest_generic_data_v300
    extends Struct {
        public char @Size(value=16) [] section_type;
        public @Unsigned int error_severity;
        public @Unsigned short revision;
        public char validation_bits;
        public char flags;
        public @Unsigned int error_data_length;
        public char @Size(value=16) [] fru_id;
        public char @Size(value=20) [] fru_text;
        public @Unsigned long time_stamp;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_generic_data")
    @NotUsableInJava
    public static class acpi_hest_generic_data
    extends Struct {
        public char @Size(value=16) [] section_type;
        public @Unsigned int error_severity;
        public @Unsigned short revision;
        public char validation_bits;
        public char flags;
        public @Unsigned int error_data_length;
        public char @Size(value=16) [] fru_id;
        public char @Size(value=20) [] fru_text;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_preferred_pm_profiles")
    public static enum acpi_preferred_pm_profiles implements Enum<acpi_preferred_pm_profiles>,
    TypedEnum<acpi_preferred_pm_profiles, Integer>
    {
        PM_UNSPECIFIED,
        PM_DESKTOP,
        PM_MOBILE,
        PM_WORKSTATION,
        PM_ENTERPRISE_SERVER,
        PM_SOHO_SERVER,
        PM_APPLIANCE_PC,
        PM_PERFORMANCE_SERVER,
        PM_TABLET,
        NR_PM_PROFILES;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_generic_status")
    @NotUsableInJava
    public static class acpi_hest_generic_status
    extends Struct {
        public @Unsigned int block_status;
        public @Unsigned int raw_data_offset;
        public @Unsigned int raw_data_length;
        public @Unsigned int data_length;
        public @Unsigned int error_severity;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_generic_v2")
    @NotUsableInJava
    public static class acpi_hest_generic_v2
    extends Struct {
        public acpi_hest_header header;
        public @Unsigned short related_source_id;
        public char reserved;
        public char enabled;
        public @Unsigned int records_to_preallocate;
        public @Unsigned int max_sections_per_record;
        public @Unsigned int max_raw_data_length;
        public acpi_generic_address error_status_address;
        public acpi_hest_notify notify;
        public @Unsigned int error_block_length;
        public acpi_generic_address read_ack_register;
        public @Unsigned long read_ack_preserve;
        public @Unsigned long read_ack_write;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_andd")
    @NotUsableInJava
    public static class acpi_dmar_andd
    extends Struct {
        public acpi_dmar_header header;
        public char @Size(value=3) [] reserved;
        public char device_number;
        @InlineUnion(value=64607)
        public @InlineUnion(value=64607) char __pad;
        @InlineUnion(value=64607)
        public  @InlineUnion(value=64607) AnonDefinitions.anon_member_of_anon_member_of_acpi_dmar_andd anon3$1;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_rhsa")
    @NotUsableInJava
    public static class acpi_dmar_rhsa
    extends Struct {
        public acpi_dmar_header header;
        public @Unsigned int reserved;
        public @Unsigned long base_address;
        public @Unsigned int proximity_domain;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_dmar_type")
    public static enum acpi_dmar_type implements Enum<acpi_dmar_type>,
    TypedEnum<acpi_dmar_type, Integer>
    {
        ACPI_DMAR_TYPE_HARDWARE_UNIT,
        ACPI_DMAR_TYPE_RESERVED_MEMORY,
        ACPI_DMAR_TYPE_ROOT_ATS,
        ACPI_DMAR_TYPE_HARDWARE_AFFINITY,
        ACPI_DMAR_TYPE_NAMESPACE,
        ACPI_DMAR_TYPE_SATC,
        ACPI_DMAR_TYPE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_ia_deferred_check")
    @NotUsableInJava
    public static class acpi_hest_ia_deferred_check
    extends Struct {
        public acpi_hest_header header;
        public @Unsigned short reserved1;
        public char flags;
        public char enabled;
        public @Unsigned int records_to_preallocate;
        public @Unsigned int max_sections_per_record;
        public acpi_hest_notify notify;
        public char num_hardware_banks;
        public char @Size(value=3) [] reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_generic")
    @NotUsableInJava
    public static class acpi_hest_generic
    extends Struct {
        public acpi_hest_header header;
        public @Unsigned short related_source_id;
        public char reserved;
        public char enabled;
        public @Unsigned int records_to_preallocate;
        public @Unsigned int max_sections_per_record;
        public @Unsigned int max_raw_data_length;
        public acpi_generic_address error_status_address;
        public acpi_hest_notify notify;
        public @Unsigned int error_block_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_ia_corrected")
    @NotUsableInJava
    public static class acpi_hest_ia_corrected
    extends Struct {
        public acpi_hest_header header;
        public @Unsigned short reserved1;
        public char flags;
        public char enabled;
        public @Unsigned int records_to_preallocate;
        public @Unsigned int max_sections_per_record;
        public acpi_hest_notify notify;
        public char num_hardware_banks;
        public char @Size(value=3) [] reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_ia_machine_check")
    @NotUsableInJava
    public static class acpi_hest_ia_machine_check
    extends Struct {
        public acpi_hest_header header;
        public @Unsigned short reserved1;
        public char flags;
        public char enabled;
        public @Unsigned int records_to_preallocate;
        public @Unsigned int max_sections_per_record;
        public @Unsigned long global_capability_data;
        public @Unsigned long global_control_data;
        public char num_hardware_banks;
        public char @Size(value=7) [] reserved3;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_notify")
    @NotUsableInJava
    public static class acpi_hest_notify
    extends Struct {
        public char type;
        public char length;
        public @Unsigned short config_write_enable;
        public @Unsigned int poll_interval;
        public @Unsigned int vector;
        public @Unsigned int polling_threshold_value;
        public @Unsigned int polling_threshold_window;
        public @Unsigned int error_threshold_value;
        public @Unsigned int error_threshold_window;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_hest_types")
    public static enum acpi_hest_types implements Enum<acpi_hest_types>,
    TypedEnum<acpi_hest_types, Integer>
    {
        ACPI_HEST_TYPE_IA32_CHECK,
        ACPI_HEST_TYPE_IA32_CORRECTED_CHECK,
        ACPI_HEST_TYPE_IA32_NMI,
        ACPI_HEST_TYPE_NOT_USED3,
        ACPI_HEST_TYPE_NOT_USED4,
        ACPI_HEST_TYPE_NOT_USED5,
        ACPI_HEST_TYPE_AER_ROOT_PORT,
        ACPI_HEST_TYPE_AER_ENDPOINT,
        ACPI_HEST_TYPE_AER_BRIDGE,
        ACPI_HEST_TYPE_GENERIC_ERROR,
        ACPI_HEST_TYPE_GENERIC_ERROR_V2,
        ACPI_HEST_TYPE_IA32_DEFERRED_CHECK,
        ACPI_HEST_TYPE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_hest")
    @NotUsableInJava
    public static class acpi_table_hest
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int error_source_count;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_memory_device")
    @NotUsableInJava
    public static class acpi_memory_device
    extends Struct {
        public Ptr<acpi_device> device;
        public ListDefinitions.list_head res_list;
        public int mgid;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_memory_info")
    @NotUsableInJava
    public static class acpi_memory_info
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned long start_addr;
        public @Unsigned long length;
        public @Unsigned short caching;
        public @Unsigned short write_protect;
        public @Unsigned int enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_srat_rintc_affinity")
    @NotUsableInJava
    public static class acpi_srat_rintc_affinity
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short reserved;
        public @Unsigned int proximity_domain;
        public @Unsigned int acpi_processor_uid;
        public @Unsigned int flags;
        public @Unsigned int clock_domain;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_srat_generic_affinity")
    @NotUsableInJava
    public static class acpi_srat_generic_affinity
    extends Struct {
        public acpi_subtable_header header;
        public char reserved;
        public char device_handle_type;
        public @Unsigned int proximity_domain;
        public char @Size(value=16) [] device_handle;
        public @Unsigned int flags;
        public @Unsigned int reserved1;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_srat_gicc_affinity")
    @NotUsableInJava
    public static class acpi_srat_gicc_affinity
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned int proximity_domain;
        public @Unsigned int acpi_processor_uid;
        public @Unsigned int flags;
        public @Unsigned int clock_domain;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_srat_mem_affinity")
    @NotUsableInJava
    public static class acpi_srat_mem_affinity
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned int proximity_domain;
        public @Unsigned short reserved;
        public @Unsigned long base_address;
        public @Unsigned long length;
        public @Unsigned int reserved1;
        public @Unsigned int flags;
        public @Unsigned long reserved2;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_srat_type")
    public static enum acpi_srat_type implements Enum<acpi_srat_type>,
    TypedEnum<acpi_srat_type, Integer>
    {
        ACPI_SRAT_TYPE_CPU_AFFINITY,
        ACPI_SRAT_TYPE_MEMORY_AFFINITY,
        ACPI_SRAT_TYPE_X2APIC_CPU_AFFINITY,
        ACPI_SRAT_TYPE_GICC_AFFINITY,
        ACPI_SRAT_TYPE_GIC_ITS_AFFINITY,
        ACPI_SRAT_TYPE_GENERIC_AFFINITY,
        ACPI_SRAT_TYPE_GENERIC_PORT_AFFINITY,
        ACPI_SRAT_TYPE_RINTC_AFFINITY,
        ACPI_SRAT_TYPE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_srat")
    @NotUsableInJava
    public static class acpi_table_srat
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int table_revision;
        public @Unsigned long reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_slit")
    @NotUsableInJava
    public static class acpi_table_slit
    extends Struct {
        public acpi_table_header header;
        public @Unsigned long locality_count;
        public char @Size(value=0) [] entry;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_cedt_cfmws")
    @NotUsableInJava
    public static class acpi_cedt_cfmws
    extends Struct {
        public acpi_cedt_header header;
        public @Unsigned int reserved1;
        public @Unsigned long base_hpa;
        public @Unsigned long window_size;
        public char interleave_ways;
        public char interleave_arithmetic;
        public @Unsigned short reserved2;
        public @Unsigned int granularity;
        public @Unsigned short restrictions;
        public @Unsigned short qtg_id;
        public @Unsigned int @Size(value=0) [] interleave_targets;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_formats_config")
    @NotUsableInJava
    public static class acpi_nhlt_formats_config
    extends Struct {
        public char formats_count;
        public acpi_nhlt_format_config @Size(value=0) [] formats;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_format_config")
    @NotUsableInJava
    public static class acpi_nhlt_format_config
    extends Struct {
        public acpi_nhlt_wave_formatext format;
        public acpi_nhlt_config config;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_wave_formatext")
    @NotUsableInJava
    public static class acpi_nhlt_wave_formatext
    extends Struct {
        public @Unsigned short format_tag;
        public @Unsigned short channel_count;
        public @Unsigned int samples_per_sec;
        public @Unsigned int avg_bytes_per_sec;
        public @Unsigned short block_align;
        public @Unsigned short bits_per_sample;
        public @Unsigned short extra_format_size;
        public @Unsigned short valid_bits_per_sample;
        public @Unsigned int channel_mask;
        public char @Size(value=16) [] subformat;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_nhlt_device_config")
    @NotUsableInJava
    public static class acpi_nhlt_device_config
    extends Union {
        public char virtual_slot;
        public acpi_nhlt_gendevice_config gen;
        public acpi_nhlt_micdevice_config mic;
        public acpi_nhlt_vendor_micdevice_config vendor_mic;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_vendor_micdevice_config")
    @NotUsableInJava
    public static class acpi_nhlt_vendor_micdevice_config
    extends Struct {
        public char virtual_slot;
        public char config_type;
        public char array_type;
        public char mics_count;
        public acpi_nhlt_vendor_mic_config @Size(value=0) [] mics;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_vendor_mic_config")
    @NotUsableInJava
    public static class acpi_nhlt_vendor_mic_config
    extends Struct {
        public char type;
        public char panel;
        public @Unsigned short speaker_position_distance;
        public @Unsigned short horizontal_offset;
        public @Unsigned short vertical_offset;
        public char frequency_low_band;
        public char frequency_high_band;
        public @Unsigned short direction_angle;
        public @Unsigned short elevation_angle;
        public @Unsigned short work_vertical_angle_begin;
        public @Unsigned short work_vertical_angle_end;
        public @Unsigned short work_horizontal_angle_begin;
        public @Unsigned short work_horizontal_angle_end;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_micdevice_config")
    @NotUsableInJava
    public static class acpi_nhlt_micdevice_config
    extends Struct {
        public char virtual_slot;
        public char config_type;
        public char array_type;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_gendevice_config")
    @NotUsableInJava
    public static class acpi_nhlt_gendevice_config
    extends Struct {
        public char virtual_slot;
        public char config_type;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_config")
    @NotUsableInJava
    public static class acpi_nhlt_config
    extends Struct {
        public @Unsigned int capabilities_size;
        public char @Size(value=0) [] capabilities;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_nhlt_endpoint")
    @NotUsableInJava
    public static class acpi_nhlt_endpoint
    extends Struct {
        public @Unsigned int length;
        public char link_type;
        public char instance_id;
        public @Unsigned short vendor_id;
        public @Unsigned short device_id;
        public @Unsigned short revision_id;
        public @Unsigned int subsystem_id;
        public char device_type;
        public char direction;
        public char virtual_bus_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_nhlt")
    @NotUsableInJava
    public static class acpi_table_nhlt
    extends Struct {
        public acpi_table_header header;
        public char endpoints_count;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_region_walk_info")
    @NotUsableInJava
    public static class acpi_region_walk_info
    extends Struct {
        public @Unsigned int debug_level;
        public @Unsigned int count;
        public @Unsigned @OriginalName(value="acpi_owner_id") short owner_id;
        public char display_type;
        public @Unsigned int address_space_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_info")
    @NotUsableInJava
    public static class acpi_object_info
    extends Struct {
        public @Unsigned int @Size(value=28) [] types;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_integrity_info")
    @NotUsableInJava
    public static class acpi_integrity_info
    extends Struct {
        public @Unsigned int nodes;
        public @Unsigned int objects;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_ex_debugger_commands")
    public static enum acpi_ex_debugger_commands implements Enum<acpi_ex_debugger_commands>,
    TypedEnum<acpi_ex_debugger_commands, Integer>
    {
        CMD_NOT_FOUND,
        CMD_NULL,
        CMD_ALL,
        CMD_ALLOCATIONS,
        CMD_ARGS,
        CMD_ARGUMENTS,
        CMD_BREAKPOINT,
        CMD_BUSINFO,
        CMD_CALL,
        CMD_DEBUG,
        CMD_DISASSEMBLE,
        CMD_DISASM,
        CMD_DUMP,
        CMD_EVALUATE,
        CMD_EXECUTE,
        CMD_EXIT,
        CMD_FIELDS,
        CMD_FIND,
        CMD_GO,
        CMD_HANDLERS,
        CMD_HELP,
        CMD_HELP2,
        CMD_HISTORY,
        CMD_HISTORY_EXE,
        CMD_HISTORY_LAST,
        CMD_INFORMATION,
        CMD_INTEGRITY,
        CMD_INTO,
        CMD_LEVEL,
        CMD_LIST,
        CMD_LOCALS,
        CMD_LOCKS,
        CMD_METHODS,
        CMD_NAMESPACE,
        CMD_NOTIFY,
        CMD_OBJECTS,
        CMD_OSI,
        CMD_OWNER,
        CMD_PATHS,
        CMD_PREDEFINED,
        CMD_PREFIX,
        CMD_QUIT,
        CMD_REFERENCES,
        CMD_RESOURCES,
        CMD_RESULTS,
        CMD_SET,
        CMD_STATS,
        CMD_STOP,
        CMD_TABLES,
        CMD_TEMPLATE,
        CMD_TRACE,
        CMD_TREE,
        CMD_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_db_command_help")
    @NotUsableInJava
    public static class acpi_db_command_help
    extends Struct {
        public char line_count;
        public String invocation;
        public String description;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_db_command_info")
    @NotUsableInJava
    public static class acpi_db_command_info
    extends Struct {
        public String name;
        public char min_args;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_handler_info")
    @NotUsableInJava
    public static class acpi_handler_info
    extends Struct {
        public Ptr<?> handler;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_comment_node")
    @NotUsableInJava
    public static class acpi_comment_node
    extends Struct {
        public String comment;
        public Ptr<acpi_comment_node> next;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_exception_info")
    @NotUsableInJava
    public static class acpi_exception_info
    extends Struct {
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_rw_lock")
    @NotUsableInJava
    public static class acpi_rw_lock
    extends Struct {
        public Ptr<?> writer_mutex;
        public Ptr<?> reader_mutex;
        public @Unsigned int num_readers;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_walk_info")
    @NotUsableInJava
    public static class acpi_walk_info
    extends Struct {
        public @Unsigned int debug_level;
        public @Unsigned int count;
        public @Unsigned @OriginalName(value="acpi_owner_id") short owner_id;
        public char display_type;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_predefined_names")
    @NotUsableInJava
    public static class acpi_predefined_names
    extends Struct {
        public String name;
        public char type;
        public String val;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_port_info")
    @NotUsableInJava
    public static class acpi_port_info
    extends Struct {
        public String name;
        public @Unsigned short start;
        public @Unsigned short end;
        public char osi_dependency;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_signal_fatal_info")
    @NotUsableInJava
    public static class acpi_signal_fatal_info
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int code;
        public @Unsigned int argument;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_exdump_info")
    @NotUsableInJava
    public static class acpi_exdump_info
    extends Struct {
        public char opcode;
        public char offset;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_device_info")
    @NotUsableInJava
    public static class acpi_gpe_device_info
    extends Struct {
        public @Unsigned int index;
        public @Unsigned int next_block_base_index;
        public @Unsigned @OriginalName(value="acpi_status") int status;
        public Ptr<acpi_namespace_node> gpe_device;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_walk_info")
    @NotUsableInJava
    public static class acpi_gpe_walk_info
    extends Struct {
        public Ptr<acpi_namespace_node> gpe_device;
        public Ptr<acpi_gpe_block_info> gpe_block;
        public @Unsigned short count;
        public @Unsigned @OriginalName(value="acpi_owner_id") short owner_id;
        public char execute_by_owner_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_wdat_entry")
    @NotUsableInJava
    public static class acpi_wdat_entry
    extends Struct {
        public char action;
        public char instruction;
        public @Unsigned short reserved;
        public acpi_generic_address register_region;
        public @Unsigned int value;
        public @Unsigned int mask;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_wdat")
    @NotUsableInJava
    public static class acpi_table_wdat
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int header_length;
        public @Unsigned short pci_segment;
        public char pci_bus;
        public char pci_device;
        public char pci_function;
        public char @Size(value=3) [] reserved;
        public @Unsigned int timer_period;
        public @Unsigned int max_count;
        public @Unsigned int min_count;
        public char flags;
        public char @Size(value=3) [] reserved2;
        public @Unsigned int entries;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_data_obj")
    @NotUsableInJava
    public static class acpi_data_obj
    extends Struct {
        public String name;
        public Ptr<?> fn;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_data_attr")
    @NotUsableInJava
    public static class acpi_data_attr
    extends Struct {
        public misc.bin_attribute attr;
        public @Unsigned long addr;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_attr")
    @NotUsableInJava
    public static class acpi_table_attr
    extends Struct {
        public misc.bin_attribute attr;
        public char @Size(value=4) [] name;
        public int instance;
        public char @Size(value=8) [] filename;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dlevel")
    @NotUsableInJava
    public static class acpi_dlevel
    extends Struct {
        public String name;
        public @Unsigned long value;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dlayer")
    @NotUsableInJava
    public static class acpi_dlayer
    extends Struct {
        public String name;
        public @Unsigned long value;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_ccel")
    @NotUsableInJava
    public static class acpi_table_ccel
    extends Struct {
        public acpi_table_header header;
        public char CCtype;
        public char Ccsub_type;
        public @Unsigned short reserved;
        public @Unsigned long log_area_minimum_length;
        public @Unsigned long log_area_start_address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_bert")
    @NotUsableInJava
    public static class acpi_table_bert
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int region_length;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ec_query")
    @NotUsableInJava
    public static class acpi_ec_query
    extends Struct {
        public transaction transaction;
        public misc.work_struct work;
        public Ptr<acpi_ec_query_handler> handler;
        public Ptr<acpi_ec> ec;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ec_query_handler")
    @NotUsableInJava
    public static class acpi_ec_query_handler
    extends Struct {
        public ListDefinitions.list_head node;
        public @OriginalName(value="acpi_ec_query_func") Ptr<?> func;
        public @OriginalName(value="acpi_handle") Ptr<?> handle;
        public Ptr<?> data;
        public char query_bit;
        public runtime.kref kref;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ec")
    @NotUsableInJava
    public static class acpi_ec
    extends Struct {
        public @OriginalName(value="acpi_handle") Ptr<?> handle;
        public int gpe;
        public int irq;
        public @Unsigned long command_addr;
        public @Unsigned long data_addr;
        public boolean global_lock;
        public @Unsigned long flags;
        public @Unsigned long reference_count;
        public runtime.mutex mutex;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public ListDefinitions.list_head list;
        public Ptr<transaction> curr;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.work_struct work;
        public @Unsigned long timestamp;
        public acpi_ec_event_state event_state;
        public @Unsigned int events_to_process;
        public @Unsigned int events_in_progress;
        public @Unsigned int queries_in_progress;
        public boolean busy_polling;
        public @Unsigned int polling_guard;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_ec_event_state")
    public static enum acpi_ec_event_state implements Enum<acpi_ec_event_state>,
    TypedEnum<acpi_ec_event_state, Integer>
    {
        EC_EVENT_READY,
        EC_EVENT_IN_PROGRESS,
        EC_EVENT_COMPLETE;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_ecdt")
    @NotUsableInJava
    public static class acpi_table_ecdt
    extends Struct {
        public acpi_table_header header;
        public acpi_generic_address control;
        public acpi_generic_address data;
        public @Unsigned int uid;
        public char gpe;
        public char @Size(value=0) [] id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_wakeup_handler")
    @NotUsableInJava
    public static class acpi_wakeup_handler
    extends Struct {
        public ListDefinitions.list_head list_node;
        public Ptr<?> wakeup;
        public Ptr<?> context;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pcct_ext_pcc_master")
    @NotUsableInJava
    public static class acpi_pcct_ext_pcc_master
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned int platform_interrupt;
        public char flags;
        public char reserved1;
        public @Unsigned long base_address;
        public @Unsigned int length;
        public acpi_generic_address doorbell_register;
        public @Unsigned long preserve_mask;
        public @Unsigned long write_mask;
        public @Unsigned int latency;
        public @Unsigned int max_access_rate;
        public @Unsigned int min_turnaround_time;
        public acpi_generic_address platform_ack_register;
        public @Unsigned long ack_preserve_mask;
        public @Unsigned long ack_set_mask;
        public @Unsigned long reserved2;
        public acpi_generic_address cmd_complete_register;
        public @Unsigned long cmd_complete_mask;
        public acpi_generic_address cmd_update_register;
        public @Unsigned long cmd_update_preserve_mask;
        public @Unsigned long cmd_update_set_mask;
        public acpi_generic_address error_status_register;
        public @Unsigned long error_status_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pcct_hw_reduced_type2")
    @NotUsableInJava
    public static class acpi_pcct_hw_reduced_type2
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned int platform_interrupt;
        public char flags;
        public char reserved;
        public @Unsigned long base_address;
        public @Unsigned long length;
        public acpi_generic_address doorbell_register;
        public @Unsigned long preserve_mask;
        public @Unsigned long write_mask;
        public @Unsigned int latency;
        public @Unsigned int max_access_rate;
        public @Unsigned short min_turnaround_time;
        public acpi_generic_address platform_ack_register;
        public @Unsigned long ack_preserve_mask;
        public @Unsigned long ack_write_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pcct_hw_reduced")
    @NotUsableInJava
    public static class acpi_pcct_hw_reduced
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned int platform_interrupt;
        public char flags;
        public char reserved;
        public @Unsigned long base_address;
        public @Unsigned long length;
        public acpi_generic_address doorbell_register;
        public @Unsigned long preserve_mask;
        public @Unsigned long write_mask;
        public @Unsigned int latency;
        public @Unsigned int max_access_rate;
        public @Unsigned short min_turnaround_time;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pcct_subspace")
    @NotUsableInJava
    public static class acpi_pcct_subspace
    extends Struct {
        public acpi_subtable_header header;
        public char @Size(value=6) [] reserved;
        public @Unsigned long base_address;
        public @Unsigned long length;
        public acpi_generic_address doorbell_register;
        public @Unsigned long preserve_mask;
        public @Unsigned long write_mask;
        public @Unsigned int latency;
        public @Unsigned int max_access_rate;
        public @Unsigned short min_turnaround_time;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_pcct_type")
    public static enum acpi_pcct_type implements Enum<acpi_pcct_type>,
    TypedEnum<acpi_pcct_type, Integer>
    {
        ACPI_PCCT_TYPE_GENERIC_SUBSPACE,
        ACPI_PCCT_TYPE_HW_REDUCED_SUBSPACE,
        ACPI_PCCT_TYPE_HW_REDUCED_SUBSPACE_TYPE2,
        ACPI_PCCT_TYPE_EXT_PCC_MASTER_SUBSPACE,
        ACPI_PCCT_TYPE_EXT_PCC_SLAVE_SUBSPACE,
        ACPI_PCCT_TYPE_HW_REG_COMM_SUBSPACE,
        ACPI_PCCT_TYPE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_pcct")
    @NotUsableInJava
    public static class acpi_table_pcct
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int flags;
        public @Unsigned long reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_satc")
    @NotUsableInJava
    public static class acpi_dmar_satc
    extends Struct {
        public acpi_dmar_header header;
        public char flags;
        public char reserved;
        public @Unsigned short segment;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_atsr")
    @NotUsableInJava
    public static class acpi_dmar_atsr
    extends Struct {
        public acpi_dmar_header header;
        public char flags;
        public char reserved;
        public @Unsigned short segment;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_reserved_memory")
    @NotUsableInJava
    public static class acpi_dmar_reserved_memory
    extends Struct {
        public acpi_dmar_header header;
        public @Unsigned short reserved;
        public @Unsigned short segment;
        public @Unsigned long base_address;
        public @Unsigned long end_address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dma_parser_data")
    @NotUsableInJava
    public static class acpi_dma_parser_data
    extends Struct {
        public acpi_dma_spec dma_spec;
        public @Unsigned long index;
        public @Unsigned long n;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dma_filter_info")
    @NotUsableInJava
    public static class acpi_dma_filter_info
    extends Struct {
        public DmaDefinitions.dma_cap_mask_t dma_cap;
        public @OriginalName(value="dma_filter_fn") Ptr<?> filter_fn;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dma")
    @NotUsableInJava
    public static class acpi_dma
    extends Struct {
        public ListDefinitions.list_head dma_controllers;
        public Ptr<runtime.device> dev;
        public Ptr<?> acpi_dma_xlate;
        public Ptr<?> data;
        public @Unsigned short base_request_line;
        public @Unsigned short end_request_line;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dma_spec")
    @NotUsableInJava
    public static class acpi_dma_spec
    extends Struct {
        public int chan_id;
        public int slave_id;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_csrt_shared_info")
    @NotUsableInJava
    public static class acpi_csrt_shared_info
    extends Struct {
        public @Unsigned short major_version;
        public @Unsigned short minor_version;
        public @Unsigned int mmio_base_low;
        public @Unsigned int mmio_base_high;
        public @Unsigned int gsi_interrupt;
        public char interrupt_polarity;
        public char interrupt_mode;
        public char num_channels;
        public char dma_address_width;
        public @Unsigned short base_request_line;
        public @Unsigned short num_handshake_signals;
        public @Unsigned int max_block_size;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_csrt_group")
    @NotUsableInJava
    public static class acpi_csrt_group
    extends Struct {
        public @Unsigned int length;
        public @Unsigned int vendor_id;
        public @Unsigned int subvendor_id;
        public @Unsigned short device_id;
        public @Unsigned short subdevice_id;
        public @Unsigned short revision;
        public @Unsigned short reserved;
        public @Unsigned int shared_info_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_csrt")
    @NotUsableInJava
    public static class acpi_table_csrt
    extends Struct {
        public acpi_table_header header;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_s2idle_dev_ops")
    @NotUsableInJava
    public static class acpi_s2idle_dev_ops
    extends Struct {
        public ListDefinitions.list_head list_node;
        public Ptr<?> prepare;
        public Ptr<?> check;
        public Ptr<?> restore;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hest_header")
    @NotUsableInJava
    public static class acpi_hest_header
    extends Struct {
        public @Unsigned short type;
        public @Unsigned short source_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_offsets")
    @NotUsableInJava
    public static class acpi_offsets
    extends Struct {
        public @Unsigned long offset;
        public char mode;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_battery")
    @NotUsableInJava
    public static class acpi_battery
    extends Struct {
        public runtime.mutex lock;
        public runtime.mutex sysfs_lock;
        public Ptr<PowerDefinitions.power_supply> bat;
        public PowerDefinitions.power_supply_desc bat_desc;
        public Ptr<acpi_device> device;
        public misc.notifier_block pm_nb;
        public ListDefinitions.list_head list;
        public @Unsigned long update_time;
        public int revision;
        public int rate_now;
        public int capacity_now;
        public int voltage_now;
        public int design_capacity;
        public int full_charge_capacity;
        public int technology;
        public int design_voltage;
        public int design_capacity_warning;
        public int design_capacity_low;
        public int cycle_count;
        public int measurement_accuracy;
        public int max_sampling_time;
        public int min_sampling_time;
        public int max_averaging_interval;
        public int min_averaging_interval;
        public int capacity_granularity_1;
        public int capacity_granularity_2;
        public int alarm;
        public char @Size(value=64) [] model_number;
        public char @Size(value=64) [] serial_number;
        public char @Size(value=64) [] type;
        public char @Size(value=64) [] oem_info;
        public int state;
        public int power_unit;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_battery_hook")
    @NotUsableInJava
    public static class acpi_battery_hook
    extends Struct {
        public String name;
        public Ptr<?> add_battery;
        public Ptr<?> remove_battery;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_throttling_arg")
    @NotUsableInJava
    public static class acpi_processor_throttling_arg
    extends Struct {
        public Ptr<acpi_processor> pr;
        public int target_state;
        public boolean force;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_slot")
    @NotUsableInJava
    public static class acpi_pci_slot
    extends Struct {
        public Ptr<PciDefinitions.pci_slot> pci_slot;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_button")
    @NotUsableInJava
    public static class acpi_button
    extends Struct {
        public @Unsigned int type;
        public Ptr<InputDefinitions.input_dev> input;
        public char @Size(value=32) [] phys;
        public @Unsigned long pushed;
        public int last_state;
        public @OriginalName(value="ktime_t") long last_time;
        public boolean suspended;
        public boolean lid_state_initialized;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_db_argument_info")
    @NotUsableInJava
    public static class acpi_db_argument_info
    extends Struct {
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_db_method_info")
    @NotUsableInJava
    public static class acpi_db_method_info
    extends Struct {
        public @OriginalName(value="acpi_handle") Ptr<?> method;
        public @OriginalName(value="acpi_handle") Ptr<?> main_thread_gate;
        public @OriginalName(value="acpi_handle") Ptr<?> thread_complete_gate;
        public @OriginalName(value="acpi_handle") Ptr<?> info_gate;
        public Ptr<@Unsigned Long> threads;
        public @Unsigned int num_threads;
        public @Unsigned int num_created;
        public @Unsigned int num_completed;
        public String name;
        public @Unsigned int flags;
        public @Unsigned int num_loops;
        public char @Size(value=512) [] pathname;
        public Ptr<String> args;
        public Ptr<@Unsigned @OriginalName(value="acpi_object_type") Integer> types;
        public char init_args;
        public @Unsigned @OriginalName(value="acpi_object_type") int @Size(value=7) [] arg_types;
        public String @Size(value=7) [] arguments;
        public char @Size(value=11) [] num_threads_str;
        public char @Size(value=11) [] id_of_thread_str;
        public char @Size(value=11) [] index_of_thread_str;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pkg_info")
    @NotUsableInJava
    public static class acpi_pkg_info
    extends Struct {
        public Ptr<Character> free_space;
        public @Unsigned @OriginalName(value="acpi_size") long length;
        public @Unsigned int object_space;
        public @Unsigned int num_packages;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_device")
    @NotUsableInJava
    public static class acpi_pci_device
    extends Struct {
        public @OriginalName(value="acpi_handle") Ptr<?> device;
        public Ptr<acpi_pci_device> next;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_sci_handler_info")
    @NotUsableInJava
    public static class acpi_sci_handler_info
    extends Struct {
        public Ptr<acpi_sci_handler_info> next;
        public @OriginalName(value="acpi_sci_handler") Ptr<?> address;
        public Ptr<?> context;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_lpit_native")
    @NotUsableInJava
    public static class acpi_lpit_native
    extends Struct {
        public acpi_lpit_header header;
        public acpi_generic_address entry_trigger;
        public @Unsigned int residency;
        public @Unsigned int latency;
        public acpi_generic_address residency_counter;
        public @Unsigned long counter_frequency;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_lpit_header")
    @NotUsableInJava
    public static class acpi_lpit_header
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int length;
        public @Unsigned short unique_id;
        public @Unsigned short reserved;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_lpit")
    @NotUsableInJava
    public static class acpi_table_lpit
    extends Struct {
        public acpi_table_header header;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_properties")
    @NotUsableInJava
    public static class acpi_device_properties
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<@OriginalName(value="guid_t") misc.uuid_t> guid;
        public Ptr<acpi_object> properties;
        public Ptr<Ptr<?>> bufs;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_power_resource_entry")
    @NotUsableInJava
    public static class acpi_power_resource_entry
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<acpi_power_resource> resource;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_power_resource")
    @NotUsableInJava
    public static class acpi_power_resource
    extends Struct {
        public acpi_device device;
        public ListDefinitions.list_head list_node;
        public @Unsigned int system_level;
        public @Unsigned int order;
        public @Unsigned int ref_count;
        public char state;
        public runtime.mutex resource_lock;
        public ListDefinitions.list_head dependents;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_power_dependent_device")
    @NotUsableInJava
    public static class acpi_power_dependent_device
    extends Struct {
        public Ptr<runtime.device> dev;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_bus_device_type")
    public static enum acpi_bus_device_type implements Enum<acpi_bus_device_type>,
    TypedEnum<acpi_bus_device_type, Integer>
    {
        ACPI_BUS_TYPE_DEVICE,
        ACPI_BUS_TYPE_POWER,
        ACPI_BUS_TYPE_PROCESSOR,
        ACPI_BUS_TYPE_THERMAL,
        ACPI_BUS_TYPE_POWER_BUTTON,
        ACPI_BUS_TYPE_SLEEP_BUTTON,
        ACPI_BUS_TYPE_ECDT_EC,
        ACPI_BUS_DEVICE_TYPE_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_prt_entry")
    @NotUsableInJava
    public static class acpi_prt_entry
    extends Struct {
        public acpi_pci_id id;
        public char pin;
        public @OriginalName(value="acpi_handle") Ptr<?> link;
        public @Unsigned int index;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_routing_table")
    @NotUsableInJava
    public static class acpi_pci_routing_table
    extends Struct {
        public @Unsigned int length;
        public @Unsigned int pin;
        public @Unsigned long address;
        public @Unsigned int source_index;
        @InlineUnion(value=31569)
        public @InlineUnion(value=31569) char @Size(value=4) [] pad;
        @InlineUnion(value=31569)
        public  @InlineUnion(value=31569) AnonDefinitions.anon_member_of_anon_member_of_acpi_pci_routing_table anon4$1;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_id")
    @NotUsableInJava
    public static class acpi_pci_id
    extends Struct {
        public @Unsigned short segment;
        public @Unsigned short bus;
        public @Unsigned short device;
        public @Unsigned short function;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dev_walk_context")
    @NotUsableInJava
    public static class acpi_dev_walk_context
    extends Struct {
        public Ptr<?> fn;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_data_node_attr")
    @NotUsableInJava
    public static class acpi_data_node_attr
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_data_node")
    @NotUsableInJava
    public static class acpi_data_node
    extends Struct {
        public ListDefinitions.list_head sibling;
        public String name;
        public @OriginalName(value="acpi_handle") Ptr<?> handle;
        public FwnodeDefinitions.fwnode_handle fwnode;
        public Ptr<FwnodeDefinitions.fwnode_handle> parent;
        public acpi_device_data data;
        public runtime.kobject kobj;
        public runtime.completion kobj_done;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dev_match_info")
    @NotUsableInJava
    public static class acpi_dev_match_info
    extends Struct {
        public acpi_device_id @Size(value=2) [] hid;
        public String uid;
        public long hrv;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_bus_id")
    @NotUsableInJava
    public static class acpi_device_bus_id
    extends Struct {
        public String bus_id;
        public runtime.ida instance_ida;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pld_info")
    @NotUsableInJava
    public static class acpi_pld_info
    extends Struct {
        public char revision;
        public char ignore_color;
        public char red;
        public char green;
        public char blue;
        public @Unsigned short width;
        public @Unsigned short height;
        public char user_visible;
        public char dock;
        public char lid;
        public char panel;
        public char vertical_position;
        public char horizontal_position;
        public char shape;
        public char group_orientation;
        public char group_token;
        public char group_position;
        public char bay;
        public char ejectable;
        public char ospm_eject_required;
        public char cabinet_number;
        public char card_cage_number;
        public char reference;
        public char rotation;
        public char order;
        public char reserved;
        public @Unsigned short vertical_offset;
        public @Unsigned short horizontal_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_subtable_entry")
    @NotUsableInJava
    public static class acpi_subtable_entry
    extends Struct {
        public Ptr<acpi_subtable_headers> hdr;
        public acpi_subtable_type type;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_subtable_type")
    public static enum acpi_subtable_type implements Enum<acpi_subtable_type>,
    TypedEnum<acpi_subtable_type, Integer>
    {
        ACPI_SUBTABLE_COMMON,
        ACPI_SUBTABLE_HMAT,
        ACPI_SUBTABLE_PRMT,
        ACPI_SUBTABLE_CEDT,
        CDAT_SUBTABLE;

    }

    @Type(noCCodeGeneration=true, cType="enum acpi_cdat_type")
    public static enum acpi_cdat_type implements Enum<acpi_cdat_type>,
    TypedEnum<acpi_cdat_type, Integer>
    {
        ACPI_CDAT_TYPE_DSMAS,
        ACPI_CDAT_TYPE_DSLBIS,
        ACPI_CDAT_TYPE_DSMSCIS,
        ACPI_CDAT_TYPE_DSIS,
        ACPI_CDAT_TYPE_DSEMTS,
        ACPI_CDAT_TYPE_SSLBIS,
        ACPI_CDAT_TYPE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_srat_x2apic_cpu_affinity")
    @NotUsableInJava
    public static class acpi_srat_x2apic_cpu_affinity
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short reserved;
        public @Unsigned int proximity_domain;
        public @Unsigned int apic_id;
        public @Unsigned int flags;
        public @Unsigned int clock_domain;
        public @Unsigned int reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_srat_cpu_affinity")
    @NotUsableInJava
    public static class acpi_srat_cpu_affinity
    extends Struct {
        public acpi_subtable_header header;
        public char proximity_domain_lo;
        public char apic_id;
        public @Unsigned int flags;
        public char local_sapic_eid;
        public char @Size(value=3) [] proximity_domain_hi;
        public @Unsigned int clock_domain;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_irq_model_id")
    public static enum acpi_irq_model_id implements Enum<acpi_irq_model_id>,
    TypedEnum<acpi_irq_model_id, Integer>
    {
        ACPI_IRQ_MODEL_PIC,
        ACPI_IRQ_MODEL_IOAPIC,
        ACPI_IRQ_MODEL_IOSAPIC,
        ACPI_IRQ_MODEL_PLATFORM,
        ACPI_IRQ_MODEL_GIC,
        ACPI_IRQ_MODEL_LPIC,
        ACPI_IRQ_MODEL_RINTC,
        ACPI_IRQ_MODEL_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_madt")
    @NotUsableInJava
    public static class acpi_table_madt
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int address;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_hpet")
    @NotUsableInJava
    public static class acpi_table_hpet
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int id;
        public acpi_generic_address address;
        public char sequence;
        public @Unsigned short minimum_tick;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_boot")
    @NotUsableInJava
    public static class acpi_table_boot
    extends Struct {
        public acpi_table_header header;
        public char cmos_index;
        public char @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_bgrt")
    @NotUsableInJava
    public static class acpi_table_bgrt
    extends Struct {
        public acpi_table_header header;
        public @Unsigned short version;
        public char status;
        public char image_type;
        public @Unsigned long image_address;
        public @Unsigned int image_offset_x;
        public @Unsigned int image_offset_y;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_cpufreq_data")
    @NotUsableInJava
    public static class acpi_cpufreq_data
    extends Struct {
        public @Unsigned int resume;
        public @Unsigned int cpu_feature;
        public @Unsigned int acpi_perf_cpu;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> freqdomain_cpus;
        public Ptr<?> cpu_freq_write;
        public Ptr<?> cpu_freq_read;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_hardware_unit")
    @NotUsableInJava
    public static class acpi_dmar_hardware_unit
    extends Struct {
        public acpi_dmar_header header;
        public char flags;
        public char size;
        public @Unsigned short segment;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_pci_path")
    @NotUsableInJava
    public static class acpi_dmar_pci_path
    extends Struct {
        public char device;
        public char function;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_dmar_scope_type")
    public static enum acpi_dmar_scope_type implements Enum<acpi_dmar_scope_type>,
    TypedEnum<acpi_dmar_scope_type, Integer>
    {
        ACPI_DMAR_SCOPE_TYPE_NOT_USED,
        ACPI_DMAR_SCOPE_TYPE_ENDPOINT,
        ACPI_DMAR_SCOPE_TYPE_BRIDGE,
        ACPI_DMAR_SCOPE_TYPE_IOAPIC,
        ACPI_DMAR_SCOPE_TYPE_HPET,
        ACPI_DMAR_SCOPE_TYPE_NAMESPACE,
        ACPI_DMAR_SCOPE_TYPE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_device_scope")
    @NotUsableInJava
    public static class acpi_dmar_device_scope
    extends Struct {
        public char entry_type;
        public char length;
        public @Unsigned short reserved;
        public char enumeration_id;
        public char bus;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_dmar")
    @NotUsableInJava
    public static class acpi_table_dmar
    extends Struct {
        public acpi_table_header header;
        public char width;
        public char flags;
        public char @Size(value=10) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_dmar_header")
    @NotUsableInJava
    public static class acpi_dmar_header
    extends Struct {
        public @Unsigned short type;
        public @Unsigned short length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hardware_id")
    @NotUsableInJava
    public static class acpi_hardware_id
    extends Struct {
        public ListDefinitions.list_head list;
        public String id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_tcpa")
    @NotUsableInJava
    public static class acpi_tcpa
    extends Struct {
        public acpi_table_header hdr;
        public @Unsigned short platform_class;
        @InlineUnion(value=18293)
        public @InlineUnion(value=18293) misc.client_hdr client;
        @InlineUnion(value=18293)
        public @InlineUnion(value=18293) misc.server_hdr server;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_tpm2_phy")
    @NotUsableInJava
    public static class acpi_tpm2_phy
    extends Struct {
        public char @Size(value=12) [] start_method_specific;
        public @Unsigned int log_area_minimum_length;
        public @Unsigned long log_area_start_address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_tpm2")
    @NotUsableInJava
    public static class acpi_table_tpm2
    extends Struct {
        public acpi_table_header header;
        public @Unsigned short platform_class;
        public @Unsigned short reserved;
        public @Unsigned long control_address;
        public @Unsigned int start_method;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_platform_list")
    @NotUsableInJava
    public static class acpi_platform_list
    extends Struct {
        public char @Size(value=7) [] oem_id;
        public char @Size(value=9) [] oem_table_id;
        public @Unsigned int oem_revision;
        public String table;
        public acpi_predicate pred;
        public String reason;
        public @Unsigned int data;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_predicate")
    public static enum acpi_predicate implements Enum<acpi_predicate>,
    TypedEnum<acpi_predicate, Integer>
    {
        all_versions,
        less_than_or_equal,
        equal,
        greater_than_or_equal;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_lpat_conversion_table")
    @NotUsableInJava
    public static class acpi_lpat_conversion_table
    extends Struct {
        public Ptr<acpi_lpat> lpat;
        public int lpat_count;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_lpat")
    @NotUsableInJava
    public static class acpi_lpat
    extends Struct {
        public int temp;
        public int raw;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_erst_instructions")
    public static enum acpi_erst_instructions implements Enum<acpi_erst_instructions>,
    TypedEnum<acpi_erst_instructions, Integer>
    {
        ACPI_ERST_READ_REGISTER,
        ACPI_ERST_READ_REGISTER_VALUE,
        ACPI_ERST_WRITE_REGISTER,
        ACPI_ERST_WRITE_REGISTER_VALUE,
        ACPI_ERST_NOOP,
        ACPI_ERST_LOAD_VAR1,
        ACPI_ERST_LOAD_VAR2,
        ACPI_ERST_STORE_VAR1,
        ACPI_ERST_ADD,
        ACPI_ERST_SUBTRACT,
        ACPI_ERST_ADD_VALUE,
        ACPI_ERST_SUBTRACT_VALUE,
        ACPI_ERST_STALL,
        ACPI_ERST_STALL_WHILE_TRUE,
        ACPI_ERST_SKIP_NEXT_IF_TRUE,
        ACPI_ERST_GOTO,
        ACPI_ERST_SET_SRC_ADDRESS_BASE,
        ACPI_ERST_SET_DST_ADDRESS_BASE,
        ACPI_ERST_MOVE_DATA,
        ACPI_ERST_INSTRUCTION_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="enum acpi_erst_actions")
    public static enum acpi_erst_actions implements Enum<acpi_erst_actions>,
    TypedEnum<acpi_erst_actions, Integer>
    {
        ACPI_ERST_BEGIN_WRITE,
        ACPI_ERST_BEGIN_READ,
        ACPI_ERST_BEGIN_CLEAR,
        ACPI_ERST_END,
        ACPI_ERST_SET_RECORD_OFFSET,
        ACPI_ERST_EXECUTE_OPERATION,
        ACPI_ERST_CHECK_BUSY_STATUS,
        ACPI_ERST_GET_COMMAND_STATUS,
        ACPI_ERST_GET_RECORD_ID,
        ACPI_ERST_SET_RECORD_ID,
        ACPI_ERST_GET_RECORD_COUNT,
        ACPI_ERST_BEGIN_DUMMY_WRIITE,
        ACPI_ERST_NOT_USED,
        ACPI_ERST_GET_ERROR_RANGE,
        ACPI_ERST_GET_ERROR_LENGTH,
        ACPI_ERST_GET_ERROR_ATTRIBUTES,
        ACPI_ERST_EXECUTE_TIMINGS,
        ACPI_ERST_ACTION_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_erst")
    @NotUsableInJava
    public static class acpi_table_erst
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int header_length;
        public @Unsigned int reserved;
        public @Unsigned int entries;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_whea_header")
    @NotUsableInJava
    public static class acpi_whea_header
    extends Struct {
        public char action;
        public char instruction;
        public char flags;
        public char reserved;
        public acpi_generic_address register_region;
        public @Unsigned long value;
        public @Unsigned long mask;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_aml_io")
    @NotUsableInJava
    public static class acpi_aml_io
    extends Struct {
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public @Unsigned long flags;
        public @Unsigned long users;
        public runtime.mutex lock;
        public Ptr<TaskDefinitions.task_struct> thread;
        public char @Size(value=4096) [] out_buf;
        public misc.circ_buf out_crc;
        public char @Size(value=4096) [] in_buf;
        public misc.circ_buf in_crc;
        public @OriginalName(value="acpi_osd_exec_callback") Ptr<?> function;
        public Ptr<?> context;
        public @Unsigned long usages;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_debugger_ops")
    @NotUsableInJava
    public static class acpi_debugger_ops
    extends Struct {
        public Ptr<?> create_thread;
        public Ptr<?> write_log;
        public Ptr<?> read_cmd;
        public Ptr<?> wait_command_ready;
        public Ptr<?> notify_command_complete;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_spcr")
    @NotUsableInJava
    public static class acpi_table_spcr
    extends Struct {
        public acpi_table_header header;
        public char interface_type;
        public char @Size(value=3) [] reserved;
        public acpi_generic_address serial_port;
        public char interrupt_type;
        public char pc_interrupt;
        public @Unsigned int interrupt;
        public char baud_rate;
        public char parity;
        public char stop_bits;
        public char flow_control;
        public char terminal_type;
        public char language;
        public @Unsigned short pci_device_id;
        public @Unsigned short pci_vendor_id;
        public char pci_bus;
        public char pci_device;
        public char pci_function;
        public @Unsigned int pci_flags;
        public char pci_segment;
        public @Unsigned int uart_clk_freq;
        public @Unsigned int precise_baudrate;
        public @Unsigned short name_space_string_length;
        public @Unsigned short name_space_string_offset;
        public char @Size(value=0) [] name_space_string;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_thermal")
    @NotUsableInJava
    public static class acpi_thermal
    extends Struct {
        public Ptr<acpi_device> device;
        public char @Size(value=8) @OriginalName(value="acpi_bus_id") [] name;
        public @Unsigned long temp_dk;
        public @Unsigned long last_temp_dk;
        public @Unsigned long polling_frequency;
        public char zombie;
        public acpi_thermal_trips trips;
        public Ptr<ThermalDefinitions.thermal_zone_device> thermal_zone;
        public int kelvin_offset;
        public misc.work_struct thermal_check_work;
        public runtime.mutex thermal_check_lock;
        public @OriginalName(value="refcount_t") misc.refcount_struct thermal_check_count;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_thermal_trips")
    @NotUsableInJava
    public static class acpi_thermal_trips
    extends Struct {
        public acpi_thermal_passive passive;
        public acpi_thermal_active @Size(value=10) [] active;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_thermal_active")
    @NotUsableInJava
    public static class acpi_thermal_active
    extends Struct {
        public acpi_thermal_trip trip;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_thermal_passive")
    @NotUsableInJava
    public static class acpi_thermal_passive
    extends Struct {
        public acpi_thermal_trip trip;
        public @Unsigned long tc1;
        public @Unsigned long tc2;
        public @Unsigned long delay;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_thermal_trip")
    @NotUsableInJava
    public static class acpi_thermal_trip
    extends Struct {
        public @Unsigned long temp_dk;
        public acpi_handle_list devices;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_driver")
    @NotUsableInJava
    public static class acpi_driver
    extends Struct {
        public char @Size(value=80) [] name;
        public char @Size(value=80) [] _class;
        public Ptr<acpi_device_id> ids;
        public @Unsigned int flags;
        public acpi_device_ops ops;
        public DeviceDefinitions.device_driver drv;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_ops")
    @NotUsableInJava
    public static class acpi_device_ops
    extends Struct {
        public @OriginalName(value="acpi_op_add") Ptr<?> add;
        public @OriginalName(value="acpi_op_remove") Ptr<?> remove;
        public @OriginalName(value="acpi_op_notify") Ptr<?> notify;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_handle_list")
    @NotUsableInJava
    public static class acpi_handle_list
    extends Struct {
        public @Unsigned int count;
        public Ptr<@OriginalName(value="acpi_handle") Ptr<?>> handles;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_fan")
    @NotUsableInJava
    public static class acpi_fan
    extends Struct {
        public boolean acpi4;
        public acpi_fan_fif fif;
        public Ptr<acpi_fan_fps> fps;
        public int fps_count;
        public Ptr<ThermalDefinitions.thermal_cooling_device> cdev;
        public DeviceDefinitions.device_attribute fst_speed;
        public DeviceDefinitions.device_attribute fine_grain_control;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_fan_fst")
    @NotUsableInJava
    public static class acpi_fan_fst
    extends Struct {
        public @Unsigned long revision;
        public @Unsigned long control;
        public @Unsigned long speed;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_fan_fif")
    @NotUsableInJava
    public static class acpi_fan_fif
    extends Struct {
        public char revision;
        public char fine_grain_ctrl;
        public char step_size;
        public char low_speed_notification;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_fan_fps")
    @NotUsableInJava
    public static class acpi_fan_fps
    extends Struct {
        public @Unsigned long control;
        public @Unsigned long trip_point;
        public @Unsigned long speed;
        public @Unsigned long noise_level;
        public @Unsigned long power;
        public char @Size(value=20) [] name;
        public DeviceDefinitions.device_attribute dev_attr;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_db_execute_walk")
    @NotUsableInJava
    public static class acpi_db_execute_walk
    extends Struct {
        public @Unsigned int count;
        public @Unsigned int max_count;
        public char @Size(value=5) [] name_seg;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_info")
    @NotUsableInJava
    public static class acpi_device_info
    extends Struct {
        public @Unsigned int info_size;
        public @Unsigned int name;
        public @Unsigned @OriginalName(value="acpi_object_type") int type;
        public char param_count;
        public @Unsigned short valid;
        public char flags;
        public char @Size(value=4) [] highest_dstates;
        public char @Size(value=5) [] lowest_dstates;
        public @Unsigned long address;
        public acpi_pnp_device_id hardware_id;
        public acpi_pnp_device_id unique_id;
        public acpi_pnp_device_id class_code;
        public acpi_pnp_device_id_list compatible_id_list;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pnp_device_id_list")
    @NotUsableInJava
    public static class acpi_pnp_device_id_list
    extends Struct {
        public @Unsigned int count;
        public @Unsigned int list_size;
        public acpi_pnp_device_id @Size(value=0) [] ids;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pnp_device_id")
    @NotUsableInJava
    public static class acpi_pnp_device_id
    extends Struct {
        public @Unsigned int length;
        public String string;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ged_handler_info")
    @NotUsableInJava
    public static class acpi_ged_handler_info
    extends Struct {
        public Ptr<acpi_ged_handler_info> next;
        public @Unsigned int int_id;
        public Ptr<acpi_namespace_node> evt_method;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_mutex_info")
    @NotUsableInJava
    public static class acpi_mutex_info
    extends Struct {
        public Ptr<?> mutex;
        public @Unsigned int use_count;
        public @Unsigned long thread_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_interface_info")
    @NotUsableInJava
    public static class acpi_interface_info
    extends Struct {
        public String name;
        public Ptr<acpi_interface_info> next;
        public char flags;
        public char value;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_address_range")
    @NotUsableInJava
    public static class acpi_address_range
    extends Struct {
        public Ptr<acpi_address_range> next;
        public Ptr<acpi_namespace_node> region_node;
        public @Unsigned @OriginalName(value="acpi_physical_address") long start_address;
        public @Unsigned @OriginalName(value="acpi_physical_address") long end_address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_rsdp")
    @NotUsableInJava
    public static class acpi_table_rsdp
    extends Struct {
        public char @Size(value=8) [] signature;
        public char checksum;
        public char @Size(value=6) [] oem_id;
        public char revision;
        public @Unsigned int rsdt_physical_address;
        public @Unsigned int length;
        public @Unsigned long xsdt_physical_address;
        public char extended_checksum;
        public char @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_list")
    @NotUsableInJava
    public static class acpi_table_list
    extends Struct {
        public Ptr<acpi_table_desc> tables;
        public @Unsigned int current_table_count;
        public @Unsigned int max_table_count;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_vendor_walk_info")
    @NotUsableInJava
    public static class acpi_vendor_walk_info
    extends Struct {
        public Ptr<acpi_vendor_uuid> uuid;
        public Ptr<acpi_buffer> buffer;
        public @Unsigned @OriginalName(value="acpi_status") int status;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_vendor_uuid")
    @NotUsableInJava
    public static class acpi_vendor_uuid
    extends Struct {
        public char subtype;
        public char @Size(value=16) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_rsconvert_info")
    @NotUsableInJava
    public static class acpi_rsconvert_info
    extends Struct {
        public char opcode;
        public char resource_offset;
        public char aml_offset;
        public char value;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_rsdump_info")
    @NotUsableInJava
    public static class acpi_rsdump_info
    extends Struct {
        public char opcode;
        public char offset;
        public String name;
        public Ptr<String> pointer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_namestring_info")
    @NotUsableInJava
    public static class acpi_namestring_info
    extends Struct {
        public String external_name;
        public String next_external_char;
        public String internal_name;
        public @Unsigned int length;
        public @Unsigned int num_segments;
        public @Unsigned int num_carats;
        public char fully_qualified;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_return_package_types")
    public static enum acpi_return_package_types implements Enum<acpi_return_package_types>,
    TypedEnum<acpi_return_package_types, Integer>
    {
        ACPI_PTYPE1_FIXED,
        ACPI_PTYPE1_VAR,
        ACPI_PTYPE1_OPTION,
        ACPI_PTYPE2,
        ACPI_PTYPE2_COUNT,
        ACPI_PTYPE2_PKG_COUNT,
        ACPI_PTYPE2_FIXED,
        ACPI_PTYPE2_MIN,
        ACPI_PTYPE2_REV_FIXED,
        ACPI_PTYPE2_FIX_VAR,
        ACPI_PTYPE2_VAR_VAR,
        ACPI_PTYPE2_UUID_PAIR,
        ACPI_PTYPE_CUSTOM;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_simple_repair_info")
    @NotUsableInJava
    public static class acpi_simple_repair_info
    extends Struct {
        public char @Size(value=4) [] name;
        public @Unsigned int unexpected_btypes;
        public @Unsigned int package_index;
        public @OriginalName(value="acpi_object_converter") Ptr<?> object_converter;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_walk_info")
    @NotUsableInJava
    public static class acpi_device_walk_info
    extends Struct {
        public Ptr<acpi_table_desc> table_desc;
        public Ptr<acpi_evaluate_info> evaluate_info;
        public @Unsigned int device_count;
        public @Unsigned int num_STA;
        public @Unsigned int num_INI;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_init_walk_info")
    @NotUsableInJava
    public static class acpi_init_walk_info
    extends Struct {
        public @Unsigned int table_index;
        public @Unsigned int object_count;
        public @Unsigned int method_count;
        public @Unsigned int serial_method_count;
        public @Unsigned int non_serial_method_count;
        public @Unsigned int serialized_method_count;
        public @Unsigned int device_count;
        public @Unsigned int op_region_count;
        public @Unsigned int field_count;
        public @Unsigned int buffer_count;
        public @Unsigned int package_count;
        public @Unsigned int op_region_init;
        public @Unsigned int field_init;
        public @Unsigned int buffer_init;
        public @Unsigned int package_init;
        public @Unsigned @OriginalName(value="acpi_owner_id") short owner_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_bit_register_info")
    @NotUsableInJava
    public static class acpi_bit_register_info
    extends Struct {
        public char parent_register;
        public char bit_position;
        public @Unsigned short access_bit_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_block_status_context")
    @NotUsableInJava
    public static class acpi_gpe_block_status_context
    extends Struct {
        public Ptr<acpi_gpe_register_info> gpe_skip_register_info;
        public char gpe_skip_mask;
        public char retval;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_create_field_info")
    @NotUsableInJava
    public static class acpi_create_field_info
    extends Struct {
        public Ptr<acpi_namespace_node> region_node;
        public Ptr<acpi_namespace_node> field_node;
        public Ptr<acpi_namespace_node> register_node;
        public Ptr<acpi_namespace_node> data_register_node;
        public Ptr<acpi_namespace_node> connection_node;
        public Ptr<Character> resource_buffer;
        public @Unsigned int bank_value;
        public @Unsigned int field_bit_position;
        public @Unsigned int field_bit_length;
        public @Unsigned short resource_length;
        public @Unsigned short pin_number_index;
        public char field_flags;
        public char attribute;
        public char field_type;
        public char access_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_reg_walk_info")
    @NotUsableInJava
    public static class acpi_reg_walk_info
    extends Struct {
        public @Unsigned int function;
        public @Unsigned int reg_run_count;
        public @OriginalName(value="acpi_adr_space_type") char space_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ffh_info")
    @NotUsableInJava
    public static class acpi_ffh_info
    extends Struct {
        public @Unsigned long offset;
        public @Unsigned long length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_evaluate_info")
    @NotUsableInJava
    public static class acpi_evaluate_info
    extends Struct {
        public Ptr<acpi_namespace_node> prefix_node;
        public String relative_pathname;
        public Ptr<Ptr<acpi_operand_object>> parameters;
        public Ptr<acpi_namespace_node> node;
        public Ptr<acpi_operand_object> obj_desc;
        public String full_pathname;
        public Ptr<acpi_predefined_info> predefined;
        public Ptr<acpi_operand_object> return_object;
        public Ptr<acpi_operand_object> parent_package;
        public @Unsigned int return_flags;
        public @Unsigned int return_btype;
        public @Unsigned short param_count;
        public @Unsigned short node_flags;
        public char pass_number;
        public char return_object_type;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_predefined_info")
    @NotUsableInJava
    public static class acpi_predefined_info
    extends Union {
        public acpi_name_info info;
        public acpi_package_info ret_info;
        public acpi_package_info2 ret_info2;
        public acpi_package_info3 ret_info3;
        public acpi_package_info4 ret_info4;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_package_info4")
    @NotUsableInJava
    public static class acpi_package_info4
    extends Struct {
        public char type;
        public char object_type1;
        public char count1;
        public char sub_object_types;
        public char pkg_count;
        public @Unsigned short reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_package_info3")
    @NotUsableInJava
    public static class acpi_package_info3
    extends Struct {
        public char type;
        public char count;
        public char @Size(value=2) [] object_type;
        public char tail_object_type;
        public @Unsigned short reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_package_info2")
    @NotUsableInJava
    public static class acpi_package_info2
    extends Struct {
        public char type;
        public char count;
        public char @Size(value=4) [] object_type;
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_package_info")
    @NotUsableInJava
    public static class acpi_package_info
    extends Struct {
        public char type;
        public char object_type1;
        public char count1;
        public char object_type2;
        public char count2;
        public @Unsigned short reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_name_info")
    @NotUsableInJava
    public static class acpi_name_info
    extends Struct {
        public char @Size(value=4) [] name;
        public @Unsigned short argument_list;
        public char expected_btypes;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_fixed_event_info")
    @NotUsableInJava
    public static class acpi_fixed_event_info
    extends Struct {
        public char status_register_id;
        public char enable_register_id;
        public @Unsigned short status_bit_mask;
        public @Unsigned short enable_bit_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_fixed_event_handler")
    @NotUsableInJava
    public static class acpi_fixed_event_handler
    extends Struct {
        public @OriginalName(value="acpi_event_handler") Ptr<?> handler;
        public Ptr<?> context;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_descriptor")
    @NotUsableInJava
    public static class acpi_descriptor
    extends Union {
        public acpi_common_descriptor common;
        public acpi_operand_object object;
        public acpi_namespace_node node;
        public acpi_parse_object op;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_common_descriptor")
    @NotUsableInJava
    public static class acpi_common_descriptor
    extends Struct {
        public Ptr<?> common_pointer;
        public char descriptor_type;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_cache_list")
    @NotUsableInJava
    public static class acpi_object_cache_list
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<acpi_operand_object> next;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_data")
    @NotUsableInJava
    public static class acpi_object_data
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public @OriginalName(value="acpi_object_handler") Ptr<?> handler;
        public Ptr<?> pointer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_extra")
    @NotUsableInJava
    public static class acpi_object_extra
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<acpi_namespace_node> method_REG;
        public Ptr<acpi_namespace_node> scope_node;
        public Ptr<?> region_context;
        public Ptr<Character> aml_start;
        public @Unsigned int aml_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_reference")
    @NotUsableInJava
    public static class acpi_object_reference
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char _class;
        public char target_type;
        public char resolved;
        public Ptr<?> object;
        public Ptr<acpi_namespace_node> node;
        public Ptr<Ptr<acpi_operand_object>> where;
        public Ptr<Character> index_pointer;
        public Ptr<Character> aml;
        public @Unsigned int value;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_addr_handler")
    @NotUsableInJava
    public static class acpi_object_addr_handler
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char space_id;
        public char handler_flags;
        public @OriginalName(value="acpi_adr_space_handler") Ptr<?> handler;
        public Ptr<acpi_namespace_node> node;
        public Ptr<?> context;
        public Ptr<?> context_mutex;
        public @OriginalName(value="acpi_adr_space_setup") Ptr<?> setup;
        public Ptr<acpi_operand_object> region_list;
        public Ptr<acpi_operand_object> next;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_notify_handler")
    @NotUsableInJava
    public static class acpi_object_notify_handler
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<acpi_namespace_node> node;
        public @Unsigned int handler_type;
        public @OriginalName(value="acpi_notify_handler") Ptr<?> handler;
        public Ptr<?> context;
        public Ptr<acpi_operand_object> @Size(value=2) [] next;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_buffer_field")
    @NotUsableInJava
    public static class acpi_object_buffer_field
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char field_flags;
        public char attribute;
        public char access_byte_width;
        public Ptr<acpi_namespace_node> node;
        public @Unsigned int bit_length;
        public @Unsigned int base_byte_offset;
        public @Unsigned int value;
        public char start_field_bit_offset;
        public char access_length;
        public char is_create_field;
        public Ptr<acpi_operand_object> buffer_obj;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_index_field")
    @NotUsableInJava
    public static class acpi_object_index_field
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char field_flags;
        public char attribute;
        public char access_byte_width;
        public Ptr<acpi_namespace_node> node;
        public @Unsigned int bit_length;
        public @Unsigned int base_byte_offset;
        public @Unsigned int value;
        public char start_field_bit_offset;
        public char access_length;
        public Ptr<acpi_operand_object> index_obj;
        public Ptr<acpi_operand_object> data_obj;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_bank_field")
    @NotUsableInJava
    public static class acpi_object_bank_field
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char field_flags;
        public char attribute;
        public char access_byte_width;
        public Ptr<acpi_namespace_node> node;
        public @Unsigned int bit_length;
        public @Unsigned int base_byte_offset;
        public @Unsigned int value;
        public char start_field_bit_offset;
        public char access_length;
        public Ptr<acpi_operand_object> region_obj;
        public Ptr<acpi_operand_object> bank_obj;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_region_field")
    @NotUsableInJava
    public static class acpi_object_region_field
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char field_flags;
        public char attribute;
        public char access_byte_width;
        public Ptr<acpi_namespace_node> node;
        public @Unsigned int bit_length;
        public @Unsigned int base_byte_offset;
        public @Unsigned int value;
        public char start_field_bit_offset;
        public char access_length;
        public @Unsigned short resource_length;
        public Ptr<acpi_operand_object> region_obj;
        public Ptr<Character> resource_buffer;
        public @Unsigned short pin_number_index;
        public Ptr<Character> internal_pcc_buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_field_common")
    @NotUsableInJava
    public static class acpi_object_field_common
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char field_flags;
        public char attribute;
        public char access_byte_width;
        public Ptr<acpi_namespace_node> node;
        public @Unsigned int bit_length;
        public @Unsigned int base_byte_offset;
        public @Unsigned int value;
        public char start_field_bit_offset;
        public char access_length;
        public Ptr<acpi_operand_object> region_obj;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_thermal_zone")
    @NotUsableInJava
    public static class acpi_object_thermal_zone
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<acpi_operand_object> @Size(value=2) [] notify_list;
        public Ptr<acpi_operand_object> handler;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_processor")
    @NotUsableInJava
    public static class acpi_object_processor
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char proc_id;
        public char length;
        public Ptr<acpi_operand_object> @Size(value=2) [] notify_list;
        public Ptr<acpi_operand_object> handler;
        public @Unsigned @OriginalName(value="acpi_io_address") long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_power_resource")
    @NotUsableInJava
    public static class acpi_object_power_resource
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<acpi_operand_object> @Size(value=2) [] notify_list;
        public Ptr<acpi_operand_object> handler;
        public @Unsigned int system_level;
        public @Unsigned int resource_order;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_device")
    @NotUsableInJava
    public static class acpi_object_device
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<acpi_operand_object> @Size(value=2) [] notify_list;
        public Ptr<acpi_operand_object> handler;
        public Ptr<acpi_gpe_block_info> gpe_block;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_notify_common")
    @NotUsableInJava
    public static class acpi_object_notify_common
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<acpi_operand_object> @Size(value=2) [] notify_list;
        public Ptr<acpi_operand_object> handler;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_method")
    @NotUsableInJava
    public static class acpi_object_method
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char info_flags;
        public char param_count;
        public char sync_level;
        public Ptr<acpi_operand_object> mutex;
        public Ptr<acpi_operand_object> node;
        public Ptr<Character> aml_start;
        public DispatchDefinitions.dispatch_of_acpi_object_method dispatch;
        public @Unsigned int aml_length;
        public @Unsigned @OriginalName(value="acpi_owner_id") short owner_id;
        public char thread_count;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_region")
    @NotUsableInJava
    public static class acpi_object_region
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char space_id;
        public Ptr<acpi_namespace_node> node;
        public Ptr<acpi_operand_object> handler;
        public Ptr<acpi_operand_object> next;
        public @Unsigned @OriginalName(value="acpi_physical_address") long address;
        public @Unsigned int length;
        public Ptr<?> pointer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_mutex")
    @NotUsableInJava
    public static class acpi_object_mutex
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char sync_level;
        public @Unsigned short acquisition_depth;
        public Ptr<?> os_mutex;
        public @Unsigned long thread_id;
        public Ptr<acpi_thread_state> owner_thread;
        public Ptr<acpi_operand_object> prev;
        public Ptr<acpi_operand_object> next;
        public Ptr<acpi_namespace_node> node;
        public char original_sync_level;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_event")
    @NotUsableInJava
    public static class acpi_object_event
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<?> os_semaphore;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_package")
    @NotUsableInJava
    public static class acpi_object_package
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<acpi_namespace_node> node;
        public Ptr<Ptr<acpi_operand_object>> elements;
        public Ptr<Character> aml_start;
        public @Unsigned int aml_length;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_buffer")
    @NotUsableInJava
    public static class acpi_object_buffer
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public Ptr<Character> pointer;
        public @Unsigned int length;
        public @Unsigned int aml_length;
        public Ptr<Character> aml_start;
        public Ptr<acpi_namespace_node> node;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_string")
    @NotUsableInJava
    public static class acpi_object_string
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public String pointer;
        public @Unsigned int length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_integer")
    @NotUsableInJava
    public static class acpi_object_integer
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
        public char @Size(value=3) [] fill;
        public @Unsigned long value;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_common")
    @NotUsableInJava
    public static class acpi_object_common
    extends Struct {
        public Ptr<acpi_operand_object> next_object;
        public char descriptor_type;
        public char type;
        public @Unsigned short reference_count;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_parse_state")
    @NotUsableInJava
    public static class acpi_parse_state
    extends Struct {
        public Ptr<Character> aml_start;
        public Ptr<Character> aml;
        public Ptr<Character> aml_end;
        public Ptr<Character> pkg_start;
        public Ptr<Character> pkg_end;
        public Ptr<acpi_parse_object> start_op;
        public Ptr<acpi_namespace_node> start_node;
        public Ptr<acpi_generic_state> scope;
        public Ptr<acpi_parse_object> start_scope;
        public @Unsigned int aml_size;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_parse_obj_asl")
    @NotUsableInJava
    public static class acpi_parse_obj_asl
    extends Struct {
        public Ptr<acpi_parse_object> parent;
        public char descriptor_type;
        public char flags;
        public @Unsigned short aml_opcode;
        public Ptr<Character> aml;
        public Ptr<acpi_parse_object> next;
        public Ptr<acpi_namespace_node> node;
        public acpi_parse_value value;
        public char arg_list_length;
        public @Unsigned short disasm_flags;
        public char disasm_opcode;
        public String operator_symbol;
        public char @Size(value=16) [] aml_op_name;
        public Ptr<acpi_parse_object> child;
        public Ptr<acpi_parse_object> parent_method;
        public String filename;
        public char file_changed;
        public String parent_filename;
        public String external_name;
        public String namepath;
        public char @Size(value=4) [] name_seg;
        public @Unsigned int extra_value;
        public @Unsigned int column;
        public @Unsigned int line_number;
        public @Unsigned int logical_line_number;
        public @Unsigned int logical_byte_offset;
        public @Unsigned int end_line;
        public @Unsigned int end_logical_line;
        public @Unsigned int acpi_btype;
        public @Unsigned int aml_length;
        public @Unsigned int aml_subtree_length;
        public @Unsigned int final_aml_length;
        public @Unsigned int final_aml_offset;
        public @Unsigned int compile_flags;
        public @Unsigned short parse_opcode;
        public char aml_opcode_length;
        public char aml_pkg_len_bytes;
        public char extra;
        public char @Size(value=20) [] parse_op_name;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_parse_obj_named")
    @NotUsableInJava
    public static class acpi_parse_obj_named
    extends Struct {
        public Ptr<acpi_parse_object> parent;
        public char descriptor_type;
        public char flags;
        public @Unsigned short aml_opcode;
        public Ptr<Character> aml;
        public Ptr<acpi_parse_object> next;
        public Ptr<acpi_namespace_node> node;
        public acpi_parse_value value;
        public char arg_list_length;
        public @Unsigned short disasm_flags;
        public char disasm_opcode;
        public String operator_symbol;
        public char @Size(value=16) [] aml_op_name;
        public String path;
        public Ptr<Character> data;
        public @Unsigned int length;
        public @Unsigned int name;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_parse_obj_common")
    @NotUsableInJava
    public static class acpi_parse_obj_common
    extends Struct {
        public Ptr<acpi_parse_object> parent;
        public char descriptor_type;
        public char flags;
        public @Unsigned short aml_opcode;
        public Ptr<Character> aml;
        public Ptr<acpi_parse_object> next;
        public Ptr<acpi_namespace_node> node;
        public acpi_parse_value value;
        public char arg_list_length;
        public @Unsigned short disasm_flags;
        public char disasm_opcode;
        public String operator_symbol;
        public char @Size(value=16) [] aml_op_name;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_parse_value")
    @NotUsableInJava
    public static class acpi_parse_value
    extends Union {
        public @Unsigned long integer;
        public @Unsigned int size;
        public String string;
        public Ptr<Character> buffer;
        public String name;
        public Ptr<acpi_parse_object> arg;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_opcode_info")
    @NotUsableInJava
    public static class acpi_opcode_info
    extends Struct {
        public String name;
        public @Unsigned int parse_args;
        public @Unsigned int runtime_args;
        public @Unsigned short flags;
        public char object_type;
        public char _class;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_generic_state")
    @NotUsableInJava
    public static class acpi_generic_state
    extends Union {
        public acpi_common_state common;
        public acpi_control_state control;
        public acpi_update_state update;
        public acpi_scope_state scope;
        public acpi_pscope_state parse_scope;
        public acpi_pkg_state pkg;
        public acpi_thread_state thread;
        public acpi_result_values results;
        public acpi_notify_info notify;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_notify_info")
    @NotUsableInJava
    public static class acpi_notify_info
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
        public char handler_list_id;
        public Ptr<acpi_namespace_node> node;
        public Ptr<acpi_operand_object> handler_list_head;
        public Ptr<acpi_global_notify_handler> global;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_global_notify_handler")
    @NotUsableInJava
    public static class acpi_global_notify_handler
    extends Struct {
        public @OriginalName(value="acpi_notify_handler") Ptr<?> handler;
        public Ptr<?> context;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_result_values")
    @NotUsableInJava
    public static class acpi_result_values
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
        public Ptr<acpi_operand_object> @Size(value=8) [] obj_desc;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_thread_state")
    @NotUsableInJava
    public static class acpi_thread_state
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
        public char current_sync_level;
        public Ptr<acpi_walk_state> walk_state_list;
        public Ptr<acpi_operand_object> acquired_mutex_list;
        public @Unsigned long thread_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pscope_state")
    @NotUsableInJava
    public static class acpi_pscope_state
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
        public @Unsigned int arg_count;
        public Ptr<acpi_parse_object> op;
        public Ptr<Character> arg_end;
        public Ptr<Character> pkg_end;
        public @Unsigned int arg_list;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_scope_state")
    @NotUsableInJava
    public static class acpi_scope_state
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
        public Ptr<acpi_namespace_node> node;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_parse_object")
    @NotUsableInJava
    public static class acpi_parse_object
    extends Union {
        public acpi_parse_obj_common common;
        public acpi_parse_obj_named named;
        public acpi_parse_obj_asl asl;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_control_state")
    @NotUsableInJava
    public static class acpi_control_state
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
        public @Unsigned short opcode;
        public Ptr<acpi_parse_object> predicate_op;
        public Ptr<Character> aml_predicate_start;
        public Ptr<Character> package_end;
        public @Unsigned long loop_timeout;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pkg_state")
    @NotUsableInJava
    public static class acpi_pkg_state
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
        public @Unsigned int index;
        public Ptr<acpi_operand_object> source_object;
        public Ptr<acpi_operand_object> dest_object;
        public Ptr<acpi_walk_state> walk_state;
        public Ptr<?> this_target_obj;
        public @Unsigned int num_packages;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_update_state")
    @NotUsableInJava
    public static class acpi_update_state
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
        public Ptr<acpi_operand_object> object;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_common_state")
    @NotUsableInJava
    public static class acpi_common_state
    extends Struct {
        public Ptr<?> next;
        public char descriptor_type;
        public char flags;
        public @Unsigned short value;
        public @Unsigned short state;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_xrupt_info")
    @NotUsableInJava
    public static class acpi_gpe_xrupt_info
    extends Struct {
        public Ptr<acpi_gpe_xrupt_info> previous;
        public Ptr<acpi_gpe_xrupt_info> next;
        public Ptr<acpi_gpe_block_info> gpe_block_list_head;
        public @Unsigned int interrupt_number;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_block_info")
    @NotUsableInJava
    public static class acpi_gpe_block_info
    extends Struct {
        public Ptr<acpi_namespace_node> node;
        public Ptr<acpi_gpe_block_info> previous;
        public Ptr<acpi_gpe_block_info> next;
        public Ptr<acpi_gpe_xrupt_info> xrupt_block;
        public Ptr<acpi_gpe_register_info> register_info;
        public Ptr<acpi_gpe_event_info> event_info;
        public @Unsigned long address;
        public @Unsigned int register_count;
        public @Unsigned short gpe_count;
        public @Unsigned short block_base_number;
        public char space_id;
        public char initialized;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_address")
    @NotUsableInJava
    public static class acpi_gpe_address
    extends Struct {
        public char space_id;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_register_info")
    @NotUsableInJava
    public static class acpi_gpe_register_info
    extends Struct {
        public acpi_gpe_address status_address;
        public acpi_gpe_address enable_address;
        public @Unsigned short base_gpe_number;
        public char enable_for_wake;
        public char enable_for_run;
        public char mask_for_run;
        public char enable_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_event_info")
    @NotUsableInJava
    public static class acpi_gpe_event_info
    extends Struct {
        public acpi_gpe_dispatch_info dispatch;
        public Ptr<acpi_gpe_register_info> register_info;
        public char flags;
        public char gpe_number;
        public char runtime_count;
        public char disable_for_dispatch;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_gpe_dispatch_info")
    @NotUsableInJava
    public static class acpi_gpe_dispatch_info
    extends Union {
        public Ptr<acpi_namespace_node> method_node;
        public Ptr<acpi_gpe_handler_info> handler;
        public Ptr<acpi_gpe_notify_info> notify_list;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_notify_info")
    @NotUsableInJava
    public static class acpi_gpe_notify_info
    extends Struct {
        public Ptr<acpi_namespace_node> device_node;
        public Ptr<acpi_gpe_notify_info> next;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpe_handler_info")
    @NotUsableInJava
    public static class acpi_gpe_handler_info
    extends Struct {
        public @OriginalName(value="acpi_gpe_handler") Ptr<?> address;
        public Ptr<?> context;
        public Ptr<acpi_namespace_node> method_node;
        public char original_flags;
        public char originally_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_walk_state")
    @NotUsableInJava
    public static class acpi_walk_state
    extends Struct {
        public Ptr<acpi_walk_state> next;
        public char descriptor_type;
        public char walk_type;
        public @Unsigned short opcode;
        public char next_op_info;
        public char num_operands;
        public char operand_index;
        public @Unsigned @OriginalName(value="acpi_owner_id") short owner_id;
        public char last_predicate;
        public char current_result;
        public char return_used;
        public char scope_depth;
        public char pass_number;
        public char namespace_override;
        public char result_size;
        public char result_count;
        public Ptr<Character> aml;
        public @Unsigned int arg_types;
        public @Unsigned int method_breakpoint;
        public @Unsigned int user_breakpoint;
        public @Unsigned int parse_flags;
        public acpi_parse_state parser_state;
        public @Unsigned int prev_arg_types;
        public @Unsigned int arg_count;
        public @Unsigned short method_nesting_depth;
        public char method_is_nested;
        public acpi_namespace_node @Size(value=7) [] arguments;
        public acpi_namespace_node @Size(value=8) [] local_variables;
        public Ptr<acpi_operand_object> @Size(value=9) [] operands;
        public Ptr<Ptr<acpi_operand_object>> params;
        public Ptr<Character> aml_last_while;
        public Ptr<Ptr<acpi_operand_object>> caller_return_desc;
        public Ptr<acpi_generic_state> control_state;
        public Ptr<acpi_namespace_node> deferred_node;
        public Ptr<acpi_operand_object> implicit_return_obj;
        public Ptr<acpi_namespace_node> method_call_node;
        public Ptr<acpi_parse_object> method_call_op;
        public Ptr<acpi_operand_object> method_desc;
        public Ptr<acpi_namespace_node> method_node;
        public String method_pathname;
        public Ptr<acpi_parse_object> op;
        public Ptr<acpi_opcode_info> op_info;
        public Ptr<acpi_parse_object> origin;
        public Ptr<acpi_operand_object> result_obj;
        public Ptr<acpi_generic_state> results;
        public Ptr<acpi_operand_object> return_desc;
        public Ptr<acpi_generic_state> scope_info;
        public Ptr<acpi_parse_object> prev_op;
        public Ptr<acpi_parse_object> next_op;
        public Ptr<acpi_thread_state> thread;
        public @OriginalName(value="acpi_parse_downwards") Ptr<?> descending_callback;
        public @OriginalName(value="acpi_parse_upwards") Ptr<?> ascending_callback;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_operand_object")
    @NotUsableInJava
    public static class acpi_operand_object
    extends Union {
        public acpi_object_common common;
        public acpi_object_integer integer;
        public acpi_object_string string;
        public acpi_object_buffer buffer;
        public acpi_object_package _package;
        public acpi_object_event event;
        public acpi_object_method method;
        public acpi_object_mutex mutex;
        public acpi_object_region region;
        public acpi_object_notify_common common_notify;
        public acpi_object_device device;
        public acpi_object_power_resource power_resource;
        public acpi_object_processor processor;
        public acpi_object_thermal_zone thermal_zone;
        public acpi_object_field_common common_field;
        public acpi_object_region_field field;
        public acpi_object_buffer_field buffer_field;
        public acpi_object_bank_field bank_field;
        public acpi_object_index_field index_field;
        public acpi_object_notify_handler notify;
        public acpi_object_addr_handler address_space;
        public acpi_object_reference reference;
        public acpi_object_extra extra;
        public acpi_object_data data;
        public acpi_object_cache_list cache;
        public acpi_namespace_node node;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_namespace_node")
    @NotUsableInJava
    public static class acpi_namespace_node
    extends Struct {
        public Ptr<acpi_operand_object> object;
        public char descriptor_type;
        public char type;
        public @Unsigned short flags;
        public acpi_name_union name;
        public Ptr<acpi_namespace_node> parent;
        public Ptr<acpi_namespace_node> child;
        public Ptr<acpi_namespace_node> peer;
        public @Unsigned @OriginalName(value="acpi_owner_id") short owner_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pcc_info")
    @NotUsableInJava
    public static class acpi_pcc_info
    extends Struct {
        public char subspace_id;
        public @Unsigned short length;
        public Ptr<Character> internal_buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_prmt_handler_info")
    @NotUsableInJava
    public static class acpi_prmt_handler_info
    extends Struct {
        public @Unsigned short revision;
        public @Unsigned short length;
        public char @Size(value=16) [] handler_guid;
        public @Unsigned long handler_address;
        public @Unsigned long static_data_buffer_address;
        public @Unsigned long acpi_param_buffer_address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_prmt_module_info")
    @NotUsableInJava
    public static class acpi_prmt_module_info
    extends Struct {
        public @Unsigned short revision;
        public @Unsigned short length;
        public char @Size(value=16) [] module_guid;
        public @Unsigned short major_rev;
        public @Unsigned short minor_rev;
        public @Unsigned short handler_info_count;
        public @Unsigned int handler_info_offset;
        public @Unsigned long mmio_list_pointer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ged_event")
    @NotUsableInJava
    public static class acpi_ged_event
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<runtime.device> dev;
        public @Unsigned int gsi;
        public @Unsigned int irq;
        public @OriginalName(value="acpi_handle") Ptr<?> handle;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_ged_device")
    @NotUsableInJava
    public static class acpi_ged_device
    extends Struct {
        public Ptr<runtime.device> dev;
        public ListDefinitions.list_head event_list;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_reconfig_event")
    public static enum acpi_reconfig_event implements Enum<acpi_reconfig_event>,
    TypedEnum<acpi_reconfig_event, Integer>
    {
        ACPI_RECONFIG_DEVICE_ADD,
        ACPI_RECONFIG_DEVICE_REMOVE;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_root_ops")
    @NotUsableInJava
    public static class acpi_pci_root_ops
    extends Struct {
        public Ptr<PciDefinitions.pci_ops> pci_ops;
        public Ptr<?> init_info;
        public Ptr<?> release_info;
        public Ptr<?> prepare_resources;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_root_info")
    @NotUsableInJava
    public static class acpi_pci_root_info
    extends Struct {
        public Ptr<acpi_pci_root> root;
        public Ptr<acpi_device> bridge;
        public Ptr<acpi_pci_root_ops> ops;
        public ListDefinitions.list_head resources;
        public char @Size(value=16) [] name;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_bridge_type")
    public static enum acpi_bridge_type implements Enum<acpi_bridge_type>,
    TypedEnum<acpi_bridge_type, Integer>
    {
        ACPI_BRIDGE_TYPE_PCIE,
        ACPI_BRIDGE_TYPE_CXL;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_errata")
    @NotUsableInJava
    public static class acpi_processor_errata
    extends Struct {
        public char smp;
        public misc.piix4_of_acpi_processor_errata piix4;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_flags")
    @NotUsableInJava
    public static class acpi_processor_flags
    extends Struct {
        public char power;
        public char performance;
        public char throttling;
        public char limit;
        public char bm_control;
        public char bm_check;
        public char has_cst;
        public char has_lpi;
        public char power_setup_done;
        public char bm_rld_set;
        public char previously_online;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_limit")
    @NotUsableInJava
    public static class acpi_processor_limit
    extends Struct {
        public acpi_processor_lx state;
        public acpi_processor_lx thermal;
        public acpi_processor_lx user;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_lx")
    @NotUsableInJava
    public static class acpi_processor_lx
    extends Struct {
        public int px;
        public int tx;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor")
    @NotUsableInJava
    public static class acpi_processor
    extends Struct {
        public @OriginalName(value="acpi_handle") Ptr<?> handle;
        public @Unsigned int acpi_id;
        public @Unsigned @OriginalName(value="phys_cpuid_t") int phys_id;
        public @Unsigned int id;
        public @Unsigned int pblk;
        public int performance_platform_limit;
        public int throttling_platform_limit;
        public acpi_processor_flags flags;
        public acpi_processor_power power;
        public Ptr<acpi_processor_performance> performance;
        public acpi_processor_throttling throttling;
        public acpi_processor_limit limit;
        public Ptr<ThermalDefinitions.thermal_cooling_device> cdev;
        public Ptr<runtime.device> dev;
        public FreqDefinitions.freq_qos_request perflib_req;
        public FreqDefinitions.freq_qos_request thermal_req;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_throttling")
    @NotUsableInJava
    public static class acpi_processor_throttling
    extends Struct {
        public @Unsigned int state;
        public @Unsigned int platform_limit;
        public acpi_pct_register control_register;
        public acpi_pct_register status_register;
        public @Unsigned int state_count;
        public Ptr<acpi_processor_tx_tss> states_tss;
        public acpi_tsd_package domain_info;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> shared_cpu_map;
        public Ptr<?> acpi_processor_get_throttling;
        public Ptr<?> acpi_processor_set_throttling;
        public @Unsigned int address;
        public char duty_offset;
        public char duty_width;
        public char tsd_valid_flag;
        public @Unsigned int shared_type;
        public acpi_processor_tx @Size(value=16) [] states;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_tx")
    @NotUsableInJava
    public static class acpi_processor_tx
    extends Struct {
        public @Unsigned short power;
        public @Unsigned short performance;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_tx_tss")
    @NotUsableInJava
    public static class acpi_processor_tx_tss
    extends Struct {
        public @Unsigned long freqpercentage;
        public @Unsigned long power;
        public @Unsigned long transition_latency;
        public @Unsigned long control;
        public @Unsigned long status;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_tsd_package")
    @NotUsableInJava
    public static class acpi_tsd_package
    extends Struct {
        public @Unsigned long num_entries;
        public @Unsigned long revision;
        public @Unsigned long domain;
        public @Unsigned long coord_type;
        public @Unsigned long num_processors;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_performance")
    @NotUsableInJava
    public static class acpi_processor_performance
    extends Struct {
        public @Unsigned int state;
        public @Unsigned int platform_limit;
        public acpi_pct_register control_register;
        public acpi_pct_register status_register;
        public @Unsigned int state_count;
        public Ptr<acpi_processor_px> states;
        public acpi_psd_package domain_info;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> shared_cpu_map;
        public @Unsigned int shared_type;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_px")
    @NotUsableInJava
    public static class acpi_processor_px
    extends Struct {
        public @Unsigned long core_frequency;
        public @Unsigned long power;
        public @Unsigned long transition_latency;
        public @Unsigned long bus_master_latency;
        public @Unsigned long control;
        public @Unsigned long status;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pct_register")
    @NotUsableInJava
    public static class acpi_pct_register
    extends Struct {
        public char descriptor;
        public @Unsigned short length;
        public char space_id;
        public char bit_width;
        public char bit_offset;
        public char reserved;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_psd_package")
    @NotUsableInJava
    public static class acpi_psd_package
    extends Struct {
        public @Unsigned long num_entries;
        public @Unsigned long revision;
        public @Unsigned long domain;
        public @Unsigned long coord_type;
        public @Unsigned long num_processors;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_power")
    @NotUsableInJava
    public static class acpi_processor_power
    extends Struct {
        public int count;
        @InlineUnion(value=16633)
        public @InlineUnion(value=16633) acpi_processor_cx @Size(value=8) [] states;
        @InlineUnion(value=16633)
        public @InlineUnion(value=16633) acpi_lpi_state @Size(value=8) [] lpi_states;
        public int timer_broadcast_on_state;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_lpi_state")
    @NotUsableInJava
    public static class acpi_lpi_state
    extends Struct {
        public @Unsigned int min_residency;
        public @Unsigned int wake_latency;
        public @Unsigned int flags;
        public @Unsigned int arch_flags;
        public @Unsigned int res_cnt_freq;
        public @Unsigned int enable_parent_state;
        public @Unsigned long address;
        public char index;
        public char entry_method;
        public char @Size(value=32) [] desc;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_processor_cx")
    @NotUsableInJava
    public static class acpi_processor_cx
    extends Struct {
        public char valid;
        public char type;
        public @Unsigned int address;
        public char entry_method;
        public char index;
        public @Unsigned int latency;
        public char bm_sts_skip;
        public char @Size(value=32) [] desc;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_power_register")
    @NotUsableInJava
    public static class acpi_power_register
    extends Struct {
        public char descriptor;
        public @Unsigned short length;
        public char space_id;
        public char bit_width;
        public char bit_offset;
        public char access_size;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_osc_context")
    @NotUsableInJava
    public static class acpi_osc_context
    extends Struct {
        public String uuid_str;
        public int rev;
        public acpi_buffer cap;
        public acpi_buffer ret;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_bus_type")
    @NotUsableInJava
    public static class acpi_bus_type
    extends Struct {
        public ListDefinitions.list_head list;
        public String name;
        public Ptr<?> match;
        public Ptr<?> find_companion;
        public Ptr<?> setup;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_physical_node")
    @NotUsableInJava
    public static class acpi_device_physical_node
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<runtime.device> dev;
        public @Unsigned int node_id;
        public boolean put_online;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_facs")
    @NotUsableInJava
    public static class acpi_table_facs
    extends Struct {
        public char @Size(value=4) [] signature;
        public @Unsigned int length;
        public @Unsigned int hardware_signature;
        public @Unsigned int firmware_waking_vector;
        public @Unsigned int global_lock;
        public @Unsigned int flags;
        public @Unsigned long xfirmware_waking_vector;
        public char version;
        public char @Size(value=3) [] reserved;
        public @Unsigned int ospm_flags;
        public char @Size(value=24) [] reserved1;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_osi_config")
    @NotUsableInJava
    public static class acpi_osi_config
    extends Struct {
        public char default_disabling;
        public @Unsigned int linux_enable;
        public @Unsigned int linux_dmi;
        public @Unsigned int linux_cmdline;
        public @Unsigned int darwin_enable;
        public @Unsigned int darwin_dmi;
        public @Unsigned int darwin_cmdline;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_osi_entry")
    @NotUsableInJava
    public static class acpi_osi_entry
    extends Struct {
        public char @Size(value=64) [] string;
        public boolean enable;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_subtable_proc")
    @NotUsableInJava
    public static class acpi_subtable_proc
    extends Struct {
        public int id;
        public @OriginalName(value="acpi_tbl_entry_handler") Ptr<?> handler;
        public @OriginalName(value="acpi_tbl_entry_handler_arg") Ptr<?> handler_arg;
        public Ptr<?> arg;
        public int count;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_subtable_headers")
    @NotUsableInJava
    public static class acpi_subtable_headers
    extends Union {
        public acpi_subtable_header common;
        public acpi_hmat_structure hmat;
        public acpi_prmt_module_header prmt;
        public acpi_cedt_header cedt;
        public acpi_cdat_header cdat;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_prmt_module_header")
    @NotUsableInJava
    public static class acpi_prmt_module_header
    extends Struct {
        public @Unsigned short revision;
        public @Unsigned short length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_rintc")
    @NotUsableInJava
    public static class acpi_madt_rintc
    extends Struct {
        public acpi_subtable_header header;
        public char version;
        public char reserved;
        public @Unsigned int flags;
        public @Unsigned long hart_id;
        public @Unsigned int uid;
        public @Unsigned int ext_intc_id;
        public @Unsigned long imsic_addr;
        public @Unsigned int imsic_size;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_core_pic")
    @NotUsableInJava
    public static class acpi_madt_core_pic
    extends Struct {
        public acpi_subtable_header header;
        public char version;
        public @Unsigned int processor_id;
        public @Unsigned int core_id;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_madt_multiproc_wakeup_version")
    public static enum acpi_madt_multiproc_wakeup_version implements Enum<acpi_madt_multiproc_wakeup_version>,
    TypedEnum<acpi_madt_multiproc_wakeup_version, Integer>
    {
        ACPI_MADT_MP_WAKEUP_VERSION_NONE,
        ACPI_MADT_MP_WAKEUP_VERSION_V1,
        ACPI_MADT_MP_WAKEUP_VERSION_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_multiproc_wakeup")
    @NotUsableInJava
    public static class acpi_madt_multiproc_wakeup
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short version;
        public @Unsigned int reserved;
        public @Unsigned long mailbox_address;
        public @Unsigned long reset_vector;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_generic_distributor")
    @NotUsableInJava
    public static class acpi_madt_generic_distributor
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short reserved;
        public @Unsigned int gic_id;
        public @Unsigned long base_address;
        public @Unsigned int global_irq_base;
        public char version;
        public char @Size(value=3) [] reserved2;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_generic_interrupt")
    @NotUsableInJava
    public static class acpi_madt_generic_interrupt
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short reserved;
        public @Unsigned int cpu_interface_number;
        public @Unsigned int uid;
        public @Unsigned int flags;
        public @Unsigned int parking_version;
        public @Unsigned int performance_interrupt;
        public @Unsigned long parked_address;
        public @Unsigned long base_address;
        public @Unsigned long gicv_base_address;
        public @Unsigned long gich_base_address;
        public @Unsigned int vgic_interrupt;
        public @Unsigned long gicr_base_address;
        public @Unsigned long arm_mpidr;
        public char efficiency_class;
        public char @Size(value=1) [] reserved2;
        public @Unsigned short spe_interrupt;
        public @Unsigned short trbe_interrupt;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_local_x2apic_nmi")
    @NotUsableInJava
    public static class acpi_madt_local_x2apic_nmi
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short inti_flags;
        public @Unsigned int uid;
        public char lint;
        public char @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_local_x2apic")
    @NotUsableInJava
    public static class acpi_madt_local_x2apic
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short reserved;
        public @Unsigned int local_apic_id;
        public @Unsigned int lapic_flags;
        public @Unsigned int uid;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_interrupt_source")
    @NotUsableInJava
    public static class acpi_madt_interrupt_source
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short inti_flags;
        public char type;
        public char id;
        public char eid;
        public char io_sapic_vector;
        public @Unsigned int global_irq;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_local_sapic")
    @NotUsableInJava
    public static class acpi_madt_local_sapic
    extends Struct {
        public acpi_subtable_header header;
        public char processor_id;
        public char id;
        public char eid;
        public char @Size(value=3) [] reserved;
        public @Unsigned int lapic_flags;
        public @Unsigned int uid;
        public char @Size(value=0) [] uid_string;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_io_sapic")
    @NotUsableInJava
    public static class acpi_madt_io_sapic
    extends Struct {
        public acpi_subtable_header header;
        public char id;
        public char reserved;
        public @Unsigned int global_irq_base;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_local_apic_override")
    @NotUsableInJava
    public static class acpi_madt_local_apic_override
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short reserved;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_local_apic_nmi")
    @NotUsableInJava
    public static class acpi_madt_local_apic_nmi
    extends Struct {
        public acpi_subtable_header header;
        public char processor_id;
        public @Unsigned short inti_flags;
        public char lint;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_nmi_source")
    @NotUsableInJava
    public static class acpi_madt_nmi_source
    extends Struct {
        public acpi_subtable_header header;
        public @Unsigned short inti_flags;
        public @Unsigned int global_irq;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_interrupt_override")
    @NotUsableInJava
    public static class acpi_madt_interrupt_override
    extends Struct {
        public acpi_subtable_header header;
        public char bus;
        public char source_irq;
        public @Unsigned int global_irq;
        public @Unsigned short inti_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_io_apic")
    @NotUsableInJava
    public static class acpi_madt_io_apic
    extends Struct {
        public acpi_subtable_header header;
        public char id;
        public char reserved;
        public @Unsigned int address;
        public @Unsigned int global_irq_base;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_madt_local_apic")
    @NotUsableInJava
    public static class acpi_madt_local_apic
    extends Struct {
        public acpi_subtable_header header;
        public char processor_id;
        public char id;
        public @Unsigned int lapic_flags;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_madt_type")
    public static enum acpi_madt_type implements Enum<acpi_madt_type>,
    TypedEnum<acpi_madt_type, Integer>
    {
        ACPI_MADT_TYPE_LOCAL_APIC,
        ACPI_MADT_TYPE_IO_APIC,
        ACPI_MADT_TYPE_INTERRUPT_OVERRIDE,
        ACPI_MADT_TYPE_NMI_SOURCE,
        ACPI_MADT_TYPE_LOCAL_APIC_NMI,
        ACPI_MADT_TYPE_LOCAL_APIC_OVERRIDE,
        ACPI_MADT_TYPE_IO_SAPIC,
        ACPI_MADT_TYPE_LOCAL_SAPIC,
        ACPI_MADT_TYPE_INTERRUPT_SOURCE,
        ACPI_MADT_TYPE_LOCAL_X2APIC,
        ACPI_MADT_TYPE_LOCAL_X2APIC_NMI,
        ACPI_MADT_TYPE_GENERIC_INTERRUPT,
        ACPI_MADT_TYPE_GENERIC_DISTRIBUTOR,
        ACPI_MADT_TYPE_GENERIC_MSI_FRAME,
        ACPI_MADT_TYPE_GENERIC_REDISTRIBUTOR,
        ACPI_MADT_TYPE_GENERIC_TRANSLATOR,
        ACPI_MADT_TYPE_MULTIPROC_WAKEUP,
        ACPI_MADT_TYPE_CORE_PIC,
        ACPI_MADT_TYPE_LIO_PIC,
        ACPI_MADT_TYPE_HT_PIC,
        ACPI_MADT_TYPE_EIO_PIC,
        ACPI_MADT_TYPE_MSI_PIC,
        ACPI_MADT_TYPE_BIO_PIC,
        ACPI_MADT_TYPE_LPC_PIC,
        ACPI_MADT_TYPE_RINTC,
        ACPI_MADT_TYPE_IMSIC,
        ACPI_MADT_TYPE_APLIC,
        ACPI_MADT_TYPE_PLIC,
        ACPI_MADT_TYPE_RESERVED,
        ACPI_MADT_TYPE_OEM_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hmat_structure")
    @NotUsableInJava
    public static class acpi_hmat_structure
    extends Struct {
        public @Unsigned short type;
        public @Unsigned short reserved;
        public @Unsigned int length;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_cedt_type")
    public static enum acpi_cedt_type implements Enum<acpi_cedt_type>,
    TypedEnum<acpi_cedt_type, Integer>
    {
        ACPI_CEDT_TYPE_CHBS,
        ACPI_CEDT_TYPE_CFMWS,
        ACPI_CEDT_TYPE_CXIMS,
        ACPI_CEDT_TYPE_RDPAS,
        ACPI_CEDT_TYPE_RESERVED;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_cedt_header")
    @NotUsableInJava
    public static class acpi_cedt_header
    extends Struct {
        public char type;
        public char reserved;
        public @Unsigned short length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_cdat_header")
    @NotUsableInJava
    public static class acpi_cdat_header
    extends Struct {
        public char type;
        public char reserved;
        public @Unsigned short length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_cdat")
    @NotUsableInJava
    public static class acpi_table_cdat
    extends Struct {
        public @Unsigned int length;
        public char revision;
        public char checksum;
        public char @Size(value=6) [] reserved;
        public @Unsigned int sequence;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_subtable_header")
    @NotUsableInJava
    public static class acpi_subtable_header
    extends Struct {
        public char type;
        public char length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_desc")
    @NotUsableInJava
    public static class acpi_table_desc
    extends Struct {
        public @Unsigned @OriginalName(value="acpi_physical_address") long address;
        public Ptr<acpi_table_header> pointer;
        public @Unsigned int length;
        public acpi_name_union signature;
        public @Unsigned @OriginalName(value="acpi_owner_id") short owner_id;
        public char flags;
        public @Unsigned short validation_count;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_name_union")
    @NotUsableInJava
    public static class acpi_name_union
    extends Union {
        public @Unsigned int integer;
        public char @Size(value=4) [] ascii;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_attr_enum")
    public static enum acpi_attr_enum implements Enum<acpi_attr_enum>,
    TypedEnum<acpi_attr_enum, Integer>
    {
        ACPI_ATTR_LABEL_SHOW,
        ACPI_ATTR_INDEX_SHOW;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pci_root")
    @NotUsableInJava
    public static class acpi_pci_root
    extends Struct {
        public Ptr<acpi_device> device;
        public Ptr<PciDefinitions.pci_bus> bus;
        public @Unsigned short segment;
        public int bridge_type;
        public runtime.resource secondary;
        public @Unsigned int osc_support_set;
        public @Unsigned int osc_control_set;
        public @Unsigned int osc_ext_support_set;
        public @Unsigned int osc_ext_control_set;
        public @Unsigned @OriginalName(value="phys_addr_t") long mcfg_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpio_lookup")
    @NotUsableInJava
    public static class acpi_gpio_lookup
    extends Struct {
        public acpi_gpio_info info;
        public int index;
        public @Unsigned short pin_index;
        public boolean active_low;
        public Ptr<GpioDefinitions.gpio_desc> desc;
        public int n;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpio_info")
    @NotUsableInJava
    public static class acpi_gpio_info
    extends Struct {
        public Ptr<acpi_device> adev;
        public GpiodDefinitions.gpiod_flags flags;
        public boolean gpioint;
        public int pin_config;
        public int polarity;
        public int triggering;
        public boolean wake_capable;
        public @Unsigned int debounce;
        public @Unsigned int quirks;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpio_chip")
    @NotUsableInJava
    public static class acpi_gpio_chip
    extends Struct {
        public acpi_connection_info conn_info;
        public ListDefinitions.list_head conns;
        public runtime.mutex conn_lock;
        public Ptr<GpioDefinitions.gpio_chip> chip;
        public ListDefinitions.list_head events;
        public ListDefinitions.list_head deferred_req_irqs_list_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpio_connection")
    @NotUsableInJava
    public static class acpi_gpio_connection
    extends Struct {
        public ListDefinitions.list_head node;
        public @Unsigned int pin;
        public Ptr<GpioDefinitions.gpio_desc> desc;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpio_event")
    @NotUsableInJava
    public static class acpi_gpio_event
    extends Struct {
        public ListDefinitions.list_head node;
        public @OriginalName(value="acpi_handle") Ptr<?> handle;
        public @OriginalName(value="irq_handler_t") Ptr<?> handler;
        public @Unsigned int pin;
        public @Unsigned int irq;
        public @Unsigned long irqflags;
        public boolean irq_is_wake;
        public boolean irq_requested;
        public Ptr<GpioDefinitions.gpio_desc> desc;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpiolib_dmi_quirk")
    @NotUsableInJava
    public static class acpi_gpiolib_dmi_quirk
    extends Struct {
        public boolean no_edge_events_on_boot;
        public String ignore_wake;
        public String ignore_interrupt;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpio_params")
    @NotUsableInJava
    public static class acpi_gpio_params
    extends Struct {
        public @Unsigned int crs_entry_index;
        public @Unsigned int line_index;
        public boolean active_low;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource")
    @NotUsableInJava
    public static class acpi_resource
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int length;
        public acpi_resource_data data;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_resource_data")
    @NotUsableInJava
    public static class acpi_resource_data
    extends Union {
        public acpi_resource_irq irq;
        public acpi_resource_dma dma;
        public acpi_resource_start_dependent start_dpf;
        public acpi_resource_io io;
        public acpi_resource_fixed_io fixed_io;
        public acpi_resource_fixed_dma fixed_dma;
        public acpi_resource_vendor vendor;
        public acpi_resource_vendor_typed vendor_typed;
        public acpi_resource_end_tag end_tag;
        public acpi_resource_memory24 memory24;
        public acpi_resource_memory32 memory32;
        public acpi_resource_fixed_memory32 fixed_memory32;
        public acpi_resource_address16 address16;
        public acpi_resource_address32 address32;
        public acpi_resource_address64 address64;
        public acpi_resource_extended_address64 ext_address64;
        public acpi_resource_extended_irq extended_irq;
        public acpi_resource_generic_register generic_reg;
        public acpi_resource_gpio gpio;
        public acpi_resource_i2c_serialbus i2c_serial_bus;
        public acpi_resource_spi_serialbus spi_serial_bus;
        public acpi_resource_uart_serialbus uart_serial_bus;
        public acpi_resource_csi2_serialbus csi2_serial_bus;
        public acpi_resource_common_serialbus common_serial_bus;
        public acpi_resource_pin_function pin_function;
        public acpi_resource_pin_config pin_config;
        public acpi_resource_pin_group pin_group;
        public acpi_resource_pin_group_function pin_group_function;
        public acpi_resource_pin_group_config pin_group_config;
        public acpi_resource_clock_input clock_input;
        public acpi_resource_address address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_pin_group_config")
    @NotUsableInJava
    public static class acpi_resource_pin_group_config
    extends Struct {
        public char revision_id;
        public char producer_consumer;
        public char shareable;
        public char pin_config_type;
        public @Unsigned int pin_config_value;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public acpi_resource_label resource_source_label;
        public Ptr<Character> vendor_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_pin_group_function")
    @NotUsableInJava
    public static class acpi_resource_pin_group_function
    extends Struct {
        public char revision_id;
        public char producer_consumer;
        public char shareable;
        public @Unsigned short function_number;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public acpi_resource_label resource_source_label;
        public Ptr<Character> vendor_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_pin_group")
    @NotUsableInJava
    public static class acpi_resource_pin_group
    extends Struct {
        public char revision_id;
        public char producer_consumer;
        public @Unsigned short pin_table_length;
        public @Unsigned short vendor_length;
        public Ptr<@Unsigned Short> pin_table;
        public acpi_resource_label resource_label;
        public Ptr<Character> vendor_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_clock_input")
    @NotUsableInJava
    public static class acpi_resource_clock_input
    extends Struct {
        public char revision_id;
        public char mode;
        public char scale;
        public @Unsigned short frequency_divisor;
        public @Unsigned int frequency_numerator;
        public acpi_resource_source resource_source;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_pin_config")
    @NotUsableInJava
    public static class acpi_resource_pin_config
    extends Struct {
        public char revision_id;
        public char producer_consumer;
        public char shareable;
        public char pin_config_type;
        public @Unsigned int pin_config_value;
        public @Unsigned short pin_table_length;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public Ptr<@Unsigned Short> pin_table;
        public Ptr<Character> vendor_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_pin_function")
    @NotUsableInJava
    public static class acpi_resource_pin_function
    extends Struct {
        public char revision_id;
        public char pin_config;
        public char shareable;
        public @Unsigned short function_number;
        public @Unsigned short pin_table_length;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public Ptr<@Unsigned Short> pin_table;
        public Ptr<Character> vendor_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_csi2_serialbus")
    @NotUsableInJava
    public static class acpi_resource_csi2_serialbus
    extends Struct {
        public char revision_id;
        public char type;
        public char producer_consumer;
        public char slave_mode;
        public char connection_sharing;
        public char type_revision_id;
        public @Unsigned short type_data_length;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public Ptr<Character> vendor_data;
        public char local_port_instance;
        public char phy_type;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_uart_serialbus")
    @NotUsableInJava
    public static class acpi_resource_uart_serialbus
    extends Struct {
        public char revision_id;
        public char type;
        public char producer_consumer;
        public char slave_mode;
        public char connection_sharing;
        public char type_revision_id;
        public @Unsigned short type_data_length;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public Ptr<Character> vendor_data;
        public char endian;
        public char data_bits;
        public char stop_bits;
        public char flow_control;
        public char parity;
        public char lines_enabled;
        public @Unsigned short rx_fifo_size;
        public @Unsigned short tx_fifo_size;
        public @Unsigned int default_baud_rate;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_spi_serialbus")
    @NotUsableInJava
    public static class acpi_resource_spi_serialbus
    extends Struct {
        public char revision_id;
        public char type;
        public char producer_consumer;
        public char slave_mode;
        public char connection_sharing;
        public char type_revision_id;
        public @Unsigned short type_data_length;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public Ptr<Character> vendor_data;
        public char wire_mode;
        public char device_polarity;
        public char data_bit_length;
        public char clock_phase;
        public char clock_polarity;
        public @Unsigned short device_selection;
        public @Unsigned int connection_speed;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_i2c_serialbus")
    @NotUsableInJava
    public static class acpi_resource_i2c_serialbus
    extends Struct {
        public char revision_id;
        public char type;
        public char producer_consumer;
        public char slave_mode;
        public char connection_sharing;
        public char type_revision_id;
        public @Unsigned short type_data_length;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public Ptr<Character> vendor_data;
        public char access_mode;
        public @Unsigned short slave_address;
        public @Unsigned int connection_speed;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_common_serialbus")
    @NotUsableInJava
    public static class acpi_resource_common_serialbus
    extends Struct {
        public char revision_id;
        public char type;
        public char producer_consumer;
        public char slave_mode;
        public char connection_sharing;
        public char type_revision_id;
        public @Unsigned short type_data_length;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public Ptr<Character> vendor_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_gpio")
    @NotUsableInJava
    public static class acpi_resource_gpio
    extends Struct {
        public char revision_id;
        public char connection_type;
        public char producer_consumer;
        public char pin_config;
        public char shareable;
        public char wake_capable;
        public char io_restriction;
        public char triggering;
        public char polarity;
        public @Unsigned short drive_strength;
        public @Unsigned short debounce_timeout;
        public @Unsigned short pin_table_length;
        public @Unsigned short vendor_length;
        public acpi_resource_source resource_source;
        public Ptr<@Unsigned Short> pin_table;
        public Ptr<Character> vendor_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_generic_register")
    @NotUsableInJava
    public static class acpi_resource_generic_register
    extends Struct {
        public char space_id;
        public char bit_width;
        public char bit_offset;
        public char access_size;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_extended_irq")
    @NotUsableInJava
    public static class acpi_resource_extended_irq
    extends Struct {
        public char producer_consumer;
        public char triggering;
        public char polarity;
        public char shareable;
        public char wake_capable;
        public char interrupt_count;
        public acpi_resource_source resource_source;
        @InlineUnion(value=15600)
        public @InlineUnion(value=15600) @Unsigned int interrupt;
        @InlineUnion(value=15600)
        public  @InlineUnion(value=15600) AnonDefinitions.anon_member_of_anon_member_of_acpi_resource_extended_irq_and_anon_member_of_aml_resource_extended_irq anon7$1;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_extended_address64")
    @NotUsableInJava
    public static class acpi_resource_extended_address64
    extends Struct {
        public char resource_type;
        public char producer_consumer;
        public char decode;
        public char min_address_fixed;
        public char max_address_fixed;
        public acpi_resource_attribute info;
        public char revision_ID;
        public acpi_address64_attribute address;
        public @Unsigned long type_specific;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_address64")
    @NotUsableInJava
    public static class acpi_resource_address64
    extends Struct {
        public char resource_type;
        public char producer_consumer;
        public char decode;
        public char min_address_fixed;
        public char max_address_fixed;
        public acpi_resource_attribute info;
        public acpi_address64_attribute address;
        public acpi_resource_source resource_source;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_address32")
    @NotUsableInJava
    public static class acpi_resource_address32
    extends Struct {
        public char resource_type;
        public char producer_consumer;
        public char decode;
        public char min_address_fixed;
        public char max_address_fixed;
        public acpi_resource_attribute info;
        public acpi_address32_attribute address;
        public acpi_resource_source resource_source;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_address16")
    @NotUsableInJava
    public static class acpi_resource_address16
    extends Struct {
        public char resource_type;
        public char producer_consumer;
        public char decode;
        public char min_address_fixed;
        public char max_address_fixed;
        public acpi_resource_attribute info;
        public acpi_address16_attribute address;
        public acpi_resource_source resource_source;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_address")
    @NotUsableInJava
    public static class acpi_resource_address
    extends Struct {
        public char resource_type;
        public char producer_consumer;
        public char decode;
        public char min_address_fixed;
        public char max_address_fixed;
        public acpi_resource_attribute info;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_address64_attribute")
    @NotUsableInJava
    public static class acpi_address64_attribute
    extends Struct {
        public @Unsigned long granularity;
        public @Unsigned long minimum;
        public @Unsigned long maximum;
        public @Unsigned long translation_offset;
        public @Unsigned long address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_address32_attribute")
    @NotUsableInJava
    public static class acpi_address32_attribute
    extends Struct {
        public @Unsigned int granularity;
        public @Unsigned int minimum;
        public @Unsigned int maximum;
        public @Unsigned int translation_offset;
        public @Unsigned int address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_address16_attribute")
    @NotUsableInJava
    public static class acpi_address16_attribute
    extends Struct {
        public @Unsigned short granularity;
        public @Unsigned short minimum;
        public @Unsigned short maximum;
        public @Unsigned short translation_offset;
        public @Unsigned short address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_source")
    @NotUsableInJava
    public static class acpi_resource_source
    extends Struct {
        public char index;
        public @Unsigned short string_length;
        public String string_ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_label")
    @NotUsableInJava
    public static class acpi_resource_label
    extends Struct {
        public @Unsigned short string_length;
        public String string_ptr;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_resource_attribute")
    @NotUsableInJava
    public static class acpi_resource_attribute
    extends Union {
        public acpi_memory_attribute mem;
        public acpi_io_attribute io;
        public char type_specific;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_io_attribute")
    @NotUsableInJava
    public static class acpi_io_attribute
    extends Struct {
        public char range_type;
        public char translation;
        public char translation_type;
        public char reserved1;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_memory_attribute")
    @NotUsableInJava
    public static class acpi_memory_attribute
    extends Struct {
        public char write_protect;
        public char caching;
        public char range_type;
        public char translation;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_fixed_memory32")
    @NotUsableInJava
    public static class acpi_resource_fixed_memory32
    extends Struct {
        public char write_protect;
        public @Unsigned int address;
        public @Unsigned int address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_memory32")
    @NotUsableInJava
    public static class acpi_resource_memory32
    extends Struct {
        public char write_protect;
        public @Unsigned int minimum;
        public @Unsigned int maximum;
        public @Unsigned int alignment;
        public @Unsigned int address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_memory24")
    @NotUsableInJava
    public static class acpi_resource_memory24
    extends Struct {
        public char write_protect;
        public @Unsigned short minimum;
        public @Unsigned short maximum;
        public @Unsigned short alignment;
        public @Unsigned short address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_end_tag")
    @NotUsableInJava
    public static class acpi_resource_end_tag
    extends Struct {
        public char checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_vendor_typed")
    @NotUsableInJava
    public static class acpi_resource_vendor_typed
    extends Struct {
        public @Unsigned short byte_length;
        public char uuid_subtype;
        public char @Size(value=16) [] uuid;
        public char @Size(value=0) [] byte_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_vendor")
    @NotUsableInJava
    public static class acpi_resource_vendor
    extends Struct {
        public @Unsigned short byte_length;
        public char @Size(value=0) [] byte_data;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_fixed_dma")
    @NotUsableInJava
    public static class acpi_resource_fixed_dma
    extends Struct {
        public @Unsigned short request_lines;
        public @Unsigned short channels;
        public char width;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_fixed_io")
    @NotUsableInJava
    public static class acpi_resource_fixed_io
    extends Struct {
        public @Unsigned short address;
        public char address_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_io")
    @NotUsableInJava
    public static class acpi_resource_io
    extends Struct {
        public char io_decode;
        public char alignment;
        public char address_length;
        public @Unsigned short minimum;
        public @Unsigned short maximum;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_start_dependent")
    @NotUsableInJava
    public static class acpi_resource_start_dependent
    extends Struct {
        public char descriptor_length;
        public char compatibility_priority;
        public char performance_robustness;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_dma")
    @NotUsableInJava
    public static class acpi_resource_dma
    extends Struct {
        public char type;
        public char bus_master;
        public char transfer;
        public char channel_count;
        @InlineUnion(value=15574)
        public @InlineUnion(value=15574) char channel;
        @InlineUnion(value=15574)
        public  @InlineUnion(value=15574) AnonDefinitions.anon_member_of_anon_member_of_acpi_resource_dma anon4$1;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_resource_irq")
    @NotUsableInJava
    public static class acpi_resource_irq
    extends Struct {
        public char descriptor_length;
        public char triggering;
        public char polarity;
        public char shareable;
        public char wake_capable;
        public char interrupt_count;
        @InlineUnion(value=15571)
        public @InlineUnion(value=15571) char interrupt;
        @InlineUnion(value=15571)
        public  @InlineUnion(value=15571) AnonDefinitions.anon_member_of_anon_member_of_acpi_resource_irq anon6$1;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_connection_info")
    @NotUsableInJava
    public static class acpi_connection_info
    extends Struct {
        public Ptr<Character> connection;
        public @Unsigned short length;
        public char access_length;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_buffer")
    @NotUsableInJava
    public static class acpi_buffer
    extends Struct {
        public @Unsigned @OriginalName(value="acpi_size") long length;
        public Ptr<?> pointer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_object_list")
    @NotUsableInJava
    public static class acpi_object_list
    extends Struct {
        public @Unsigned int count;
        public Ptr<acpi_object> pointer;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_gpio_mapping")
    @NotUsableInJava
    public static class acpi_gpio_mapping
    extends Struct {
        public String name;
        public Ptr<acpi_gpio_params> data;
        public @Unsigned int size;
        public @Unsigned int quirks;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_software_nodes")
    @NotUsableInJava
    public static class acpi_device_software_nodes
    extends Struct {
        public misc.property_entry @Size(value=6) [] dev_props;
        public Ptr<SoftwareDefinitions.software_node> nodes;
        public Ptr<Ptr<SoftwareDefinitions.software_node>> nodeptrs;
        public Ptr<acpi_device_software_node_port> ports;
        public @Unsigned int num_ports;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_software_node_port")
    @NotUsableInJava
    public static class acpi_device_software_node_port
    extends Struct {
        public char @Size(value=9) [] port_name;
        public @Unsigned int @Size(value=8) [] data_lanes;
        public @Unsigned int @Size(value=9) [] lane_polarities;
        public @Unsigned long @Size(value=8) [] link_frequencies;
        public @Unsigned int port_nr;
        public boolean crs_csi2_local;
        public misc.property_entry @Size(value=2) [] port_props;
        public misc.property_entry @Size(value=8) [] ep_props;
        public SoftwareDefinitions.software_node_ref_args @Size(value=1) [] remote_ep;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_data")
    @NotUsableInJava
    public static class acpi_device_data
    extends Struct {
        public Ptr<acpi_object> pointer;
        public ListDefinitions.list_head properties;
        public Ptr<acpi_object> of_compatible;
        public ListDefinitions.list_head subnodes;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_wakeup")
    @NotUsableInJava
    public static class acpi_device_wakeup
    extends Struct {
        public @OriginalName(value="acpi_handle") Ptr<?> gpe_device;
        public @Unsigned long gpe_number;
        public @Unsigned long sleep_state;
        public ListDefinitions.list_head resources;
        public acpi_device_wakeup_flags flags;
        public acpi_device_wakeup_context context;
        public Ptr<WakeupDefinitions.wakeup_source> ws;
        public int prepare_count;
        public int enable_count;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_wakeup_context")
    @NotUsableInJava
    public static class acpi_device_wakeup_context
    extends Struct {
        public Ptr<?> func;
        public Ptr<runtime.device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_wakeup_flags")
    @NotUsableInJava
    public static class acpi_device_wakeup_flags
    extends Struct {
        public char valid;
        public char notifier_present;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_perf")
    @NotUsableInJava
    public static class acpi_device_perf
    extends Struct {
        public int state;
        public acpi_device_perf_flags flags;
        public int state_count;
        public Ptr<acpi_device_perf_state> states;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_perf_state")
    @NotUsableInJava
    public static class acpi_device_perf_state
    extends Struct {
        public misc.flags_of_acpi_device_perf_state flags;
        public char power;
        public char performance;
        public int latency;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_perf_flags")
    @NotUsableInJava
    public static class acpi_device_perf_flags
    extends Struct {
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_power")
    @NotUsableInJava
    public static class acpi_device_power
    extends Struct {
        public int state;
        public acpi_device_power_flags flags;
        public acpi_device_power_state @Size(value=5) [] states;
        public char state_for_enumeration;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_power_state")
    @NotUsableInJava
    public static class acpi_device_power_state
    extends Struct {
        public ListDefinitions.list_head resources;
        public misc.flags_of_acpi_device_power_state flags;
        public int power;
        public int latency;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_power_flags")
    @NotUsableInJava
    public static class acpi_device_power_flags
    extends Struct {
        public @Unsigned int explicit_get;
        public @Unsigned int power_resources;
        public @Unsigned int inrush_current;
        public @Unsigned int power_removed;
        public @Unsigned int ignore_parent;
        public @Unsigned int dsw_present;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_pnp")
    @NotUsableInJava
    public static class acpi_device_pnp
    extends Struct {
        public char @Size(value=8) @OriginalName(value="acpi_bus_id") [] bus_id;
        public int instance_no;
        public acpi_pnp_type type;
        public @Unsigned @OriginalName(value="acpi_bus_address") long bus_address;
        public String unique_id;
        public ListDefinitions.list_head ids;
        public char @Size(value=40) @OriginalName(value="acpi_device_name") [] device_name;
        public char @Size(value=20) @OriginalName(value="acpi_device_class") [] device_class;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_pnp_type")
    @NotUsableInJava
    public static class acpi_pnp_type
    extends Struct {
        public @Unsigned int hardware_id;
        public @Unsigned int bus_address;
        public @Unsigned int platform_id;
        public @Unsigned int backlight;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_dir")
    @NotUsableInJava
    public static class acpi_device_dir
    extends Struct {
        public Ptr<ProcDefinitions.proc_dir_entry> entry;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_flags")
    @NotUsableInJava
    public static class acpi_device_flags
    extends Struct {
        public @Unsigned int dynamic_status;
        public @Unsigned int removable;
        public @Unsigned int ejectable;
        public @Unsigned int power_manageable;
        public @Unsigned int match_driver;
        public @Unsigned int initialized;
        public @Unsigned int visited;
        public @Unsigned int hotplug_notify;
        public @Unsigned int is_dock_station;
        public @Unsigned int of_compatible_ok;
        public @Unsigned int coherent_dma;
        public @Unsigned int cca_seen;
        public @Unsigned int enumeration_by_parent;
        public @Unsigned int honor_deps;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_status")
    @NotUsableInJava
    public static class acpi_device_status
    extends Struct {
        public @Unsigned int present;
        public @Unsigned int enabled;
        public @Unsigned int show_in_ui;
        public @Unsigned int functional;
        public @Unsigned int battery_present;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hotplug_context")
    @NotUsableInJava
    public static class acpi_hotplug_context
    extends Struct {
        public Ptr<acpi_device> self;
        public @OriginalName(value="acpi_hp_notify") Ptr<?> notify;
        public @OriginalName(value="acpi_hp_uevent") Ptr<?> uevent;
        public @OriginalName(value="acpi_hp_fixup") Ptr<?> fixup;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_scan_handler")
    @NotUsableInJava
    public static class acpi_scan_handler
    extends Struct {
        public ListDefinitions.list_head list_node;
        public Ptr<acpi_device_id> ids;
        public Ptr<?> match;
        public Ptr<?> attach;
        public Ptr<?> detach;
        public Ptr<?> post_eject;
        public Ptr<?> bind;
        public Ptr<?> unbind;
        public acpi_hotplug_profile hotplug;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device")
    @NotUsableInJava
    public static class acpi_device
    extends Struct {
        public @Unsigned int pld_crc;
        public int device_type;
        public @OriginalName(value="acpi_handle") Ptr<?> handle;
        public FwnodeDefinitions.fwnode_handle fwnode;
        public ListDefinitions.list_head wakeup_list;
        public ListDefinitions.list_head del_list;
        public acpi_device_status status;
        public acpi_device_flags flags;
        public acpi_device_pnp pnp;
        public acpi_device_power power;
        public acpi_device_wakeup wakeup;
        public acpi_device_perf performance;
        public acpi_device_dir dir;
        public acpi_device_data data;
        public Ptr<acpi_scan_handler> handler;
        public Ptr<acpi_hotplug_context> hp;
        public Ptr<acpi_device_software_nodes> swnodes;
        public Ptr<acpi_gpio_mapping> driver_gpios;
        public Ptr<?> driver_data;
        public runtime.device dev;
        public @Unsigned int physical_node_count;
        public @Unsigned int dep_unmet;
        public ListDefinitions.list_head physical_node_list;
        public runtime.mutex physical_node_lock;
        public Ptr<?> remove;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_hotplug_profile")
    @NotUsableInJava
    public static class acpi_hotplug_profile
    extends Struct {
        public runtime.kobject kobj;
        public Ptr<?> scan_dependent;
        public Ptr<?> notify_online;
        public boolean enabled;
        public boolean demand_offline;
    }

    @Type(noCCodeGeneration=true, cType="union acpi_object")
    @NotUsableInJava
    public static class acpi_object
    extends Union {
        public @Unsigned @OriginalName(value="acpi_object_type") int type;
        public misc.integer_of_acpi_object integer;
        public misc.string_of_acpi_object string;
        public BufferDefinitions.buffer_of_acpi_object buffer;
        public misc.package_of_acpi_object _package;
        public misc.reference_of_acpi_object reference;
        public misc.processor_of_acpi_object processor;
        public PowerDefinitions.power_resource_of_acpi_object power_resource;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_fadt")
    @NotUsableInJava
    public static class acpi_table_fadt
    extends Struct {
        public acpi_table_header header;
        public @Unsigned int facs;
        public @Unsigned int dsdt;
        public char model;
        public char preferred_profile;
        public @Unsigned short sci_interrupt;
        public @Unsigned int smi_command;
        public char acpi_enable;
        public char acpi_disable;
        public char s4_bios_request;
        public char pstate_control;
        public @Unsigned int pm1a_event_block;
        public @Unsigned int pm1b_event_block;
        public @Unsigned int pm1a_control_block;
        public @Unsigned int pm1b_control_block;
        public @Unsigned int pm2_control_block;
        public @Unsigned int pm_timer_block;
        public @Unsigned int gpe0_block;
        public @Unsigned int gpe1_block;
        public char pm1_event_length;
        public char pm1_control_length;
        public char pm2_control_length;
        public char pm_timer_length;
        public char gpe0_block_length;
        public char gpe1_block_length;
        public char gpe1_base;
        public char cst_control;
        public @Unsigned short c2_latency;
        public @Unsigned short c3_latency;
        public @Unsigned short flush_size;
        public @Unsigned short flush_stride;
        public char duty_offset;
        public char duty_width;
        public char day_alarm;
        public char month_alarm;
        public char century;
        public @Unsigned short boot_flags;
        public char reserved;
        public @Unsigned int flags;
        public acpi_generic_address reset_register;
        public char reset_value;
        public @Unsigned short arm_boot_flags;
        public char minor_revision;
        public @Unsigned long Xfacs;
        public @Unsigned long Xdsdt;
        public acpi_generic_address xpm1a_event_block;
        public acpi_generic_address xpm1b_event_block;
        public acpi_generic_address xpm1a_control_block;
        public acpi_generic_address xpm1b_control_block;
        public acpi_generic_address xpm2_control_block;
        public acpi_generic_address xpm_timer_block;
        public acpi_generic_address xgpe0_block;
        public acpi_generic_address xgpe1_block;
        public acpi_generic_address sleep_control;
        public acpi_generic_address sleep_status;
        public @Unsigned long hypervisor_id;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_generic_address")
    @NotUsableInJava
    public static class acpi_generic_address
    extends Struct {
        public char space_id;
        public char bit_width;
        public char bit_offset;
        public char access_width;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct acpi_table_header")
    @NotUsableInJava
    public static class acpi_table_header
    extends Struct {
        public char @Size(value=4) [] signature;
        public @Unsigned int length;
        public char revision;
        public char checksum;
        public char @Size(value=6) [] oem_id;
        public char @Size(value=8) [] oem_table_id;
        public @Unsigned int oem_revision;
        public char @Size(value=4) [] asl_compiler_id;
        public @Unsigned int asl_compiler_revision;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int input_mapping_base; unsigned int input_mapping_count; unsigned int device_type; }")
    @NotUsableInJava
    public static class acpi_of_hv_device_id
    extends Struct {
        public @Unsigned int input_mapping_base;
        public @Unsigned int input_mapping_count;
        public @Unsigned int device_type;
    }

    @Type(noCCodeGeneration=true, cType="enum acpi_device_swnode_ep_props")
    public static enum acpi_device_swnode_ep_props implements Enum<acpi_device_swnode_ep_props>,
    TypedEnum<acpi_device_swnode_ep_props, Integer>
    {
        ACPI_DEVICE_SWNODE_EP_REMOTE_EP,
        ACPI_DEVICE_SWNODE_EP_BUS_TYPE,
        ACPI_DEVICE_SWNODE_EP_REG,
        ACPI_DEVICE_SWNODE_EP_CLOCK_LANES,
        ACPI_DEVICE_SWNODE_EP_DATA_LANES,
        ACPI_DEVICE_SWNODE_EP_LANE_POLARITIES,
        ACPI_DEVICE_SWNODE_EP_LINK_FREQUENCIES,
        ACPI_DEVICE_SWNODE_EP_NUM_OF,
        ACPI_DEVICE_SWNODE_EP_NUM_ENTRIES;

    }

    @Type(noCCodeGeneration=true, cType="enum acpi_device_swnode_port_props")
    public static enum acpi_device_swnode_port_props implements Enum<acpi_device_swnode_port_props>,
    TypedEnum<acpi_device_swnode_port_props, Integer>
    {
        ACPI_DEVICE_SWNODE_PORT_REG,
        ACPI_DEVICE_SWNODE_PORT_NUM_OF,
        ACPI_DEVICE_SWNODE_PORT_NUM_ENTRIES;

    }

    @Type(noCCodeGeneration=true, cType="enum acpi_device_swnode_dev_props")
    public static enum acpi_device_swnode_dev_props implements Enum<acpi_device_swnode_dev_props>,
    TypedEnum<acpi_device_swnode_dev_props, Integer>
    {
        ACPI_DEVICE_SWNODE_DEV_ROTATION,
        ACPI_DEVICE_SWNODE_DEV_CLOCK_FREQUENCY,
        ACPI_DEVICE_SWNODE_DEV_LED_MAX_MICROAMP,
        ACPI_DEVICE_SWNODE_DEV_FLASH_MAX_MICROAMP,
        ACPI_DEVICE_SWNODE_DEV_FLASH_MAX_TIMEOUT_US,
        ACPI_DEVICE_SWNODE_DEV_NUM_OF,
        ACPI_DEVICE_SWNODE_DEV_NUM_ENTRIES;

    }

    @Type(noCCodeGeneration=true, cType="struct acpi_device_id")
    @NotUsableInJava
    public static class acpi_device_id
    extends Struct {
        public char @Size(value=16) [] id;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
        public @Unsigned int cls;
        public @Unsigned int cls_msk;
    }
}

