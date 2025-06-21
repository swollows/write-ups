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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.HwmonDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class PowerDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __power_supply_am_i_supplied(Ptr<runtime.device> dev, Ptr<?> _data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __power_supply_changed_work(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __power_supply_get_supplier_property(Ptr<runtime.device> dev, Ptr<?> _data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __power_supply_is_supplied_by(Ptr<power_supply> supplier, Ptr<power_supply> supply) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __power_supply_is_system_supplied(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__power_supply_register($arg1, (const struct power_supply_desc*)$arg2, (const struct power_supply_config*)$arg3, $arg4)")
    public static Ptr<power_supply> __power_supply_register(Ptr<runtime.device> parent, Ptr<power_supply_desc> desc, Ptr<power_supply_config> cfg, boolean ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_allocator_bind(Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_allocator_manage(Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_allocator_unbind(Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_allocator_update_tz(Ptr<ThermalDefinitions.thermal_zone_device> tz, ThermalDefinitions.thermal_notify_event reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long power_state_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_am_i_supplied(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_batinfo_ocv2cap(Ptr<power_supply_battery_info> info2, int ocv, int temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean power_supply_battery_bti_in_range(Ptr<power_supply_battery_info> info2, int resistance) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_battery_info_get_prop(Ptr<power_supply_battery_info> info2, power_supply_property psp, Ptr<power_supply_propval> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean power_supply_battery_info_has_prop(Ptr<power_supply_battery_info> info2, power_supply_property psp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_changed(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_changed_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_class_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_class_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_deferred_register_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_external_power_changed(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<power_supply_battery_ocv_table> power_supply_find_ocv2cap_table(Ptr<power_supply_battery_info> info2, int temp, Ptr<Integer> table_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_for_each_device($arg1, (int (*)(struct device*, void*))$arg2)")
    public static int power_supply_for_each_device(Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_get_battery_info(Ptr<power_supply> psy, Ptr<Ptr<power_supply_battery_info>> info_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_get_by_name((const u8*)$arg1)")
    public static Ptr<power_supply> power_supply_get_by_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> power_supply_get_drvdata(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct power_supply_maintenance_charge_table*)power_supply_get_maintenance_charging_setting($arg1, $arg2))")
    public static Ptr<power_supply_maintenance_charge_table> power_supply_get_maintenance_charging_setting(Ptr<power_supply_battery_info> info2, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_get_property(Ptr<power_supply> psy, power_supply_property psp, Ptr<power_supply_propval> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_get_property_from_supplier(Ptr<power_supply> psy, power_supply_property psp, Ptr<power_supply_propval> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_is_system_supplied() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_match_device_by_name($arg1, (const void*)$arg2)")
    public static int power_supply_match_device_by_name(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_ocv2cap_simple(Ptr<power_supply_battery_ocv_table> table, int table_len, int ocv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_powers(Ptr<power_supply> psy, Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_property_is_writeable(Ptr<power_supply> psy, power_supply_property psp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_put(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_put_battery_info(Ptr<power_supply> psy, Ptr<power_supply_battery_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_read_temp(Ptr<ThermalDefinitions.thermal_zone_device> tzd, Ptr<Integer> temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_reg_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_register($arg1, (const struct power_supply_desc*)$arg2, (const struct power_supply_config*)$arg3)")
    public static Ptr<power_supply> power_supply_register(Ptr<runtime.device> parent, Ptr<power_supply_desc> desc, Ptr<power_supply_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_register_no_ws($arg1, (const struct power_supply_desc*)$arg2, (const struct power_supply_config*)$arg3)")
    public static Ptr<power_supply> power_supply_register_no_ws(Ptr<runtime.device> parent, Ptr<power_supply_desc> desc, Ptr<power_supply_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_set_battery_charged(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_set_property($arg1, $arg2, (const union power_supply_propval*)$arg3)")
    public static int power_supply_set_property(Ptr<power_supply> psy, power_supply_property psp, Ptr<power_supply_propval> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_temp2resist_simple(Ptr<power_supply_resistance_temp_table> table, int table_len, int temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_unreg_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_unregister(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_vbat2ri(Ptr<power_supply_battery_info> info2, int vbat_uv, boolean charging) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_add_hwmon_sysfs(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_hwmon_is_visible((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="umode_t") short power_supply_hwmon_is_visible(Ptr<?> data, HwmonDefinitions.hwmon_sensor_types type2, @Unsigned int attr2, int channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_hwmon_read(Ptr<runtime.device> dev, HwmonDefinitions.hwmon_sensor_types type2, @Unsigned int attr2, int channel2, Ptr<Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_hwmon_read_string($arg1, $arg2, $arg3, $arg4, (const u8**)$arg5)")
    public static int power_supply_hwmon_read_string(Ptr<runtime.device> dev, HwmonDefinitions.hwmon_sensor_types type2, @Unsigned int attr2, int channel2, Ptr<String> str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_hwmon_to_property(HwmonDefinitions.hwmon_sensor_types type2, @Unsigned int attr2, int channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_hwmon_write(Ptr<runtime.device> dev, HwmonDefinitions.hwmon_sensor_types type2, @Unsigned int attr2, int channel2, long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_remove_hwmon_sysfs(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_create_triggers(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int power_supply_led_trigger_activate(Ptr<LedDefinitions.led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_register_led_trigger($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int power_supply_register_led_trigger(Ptr<power_supply> psy, String name_template, Ptr<Ptr<LedDefinitions.led_trigger>> tp, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_remove_bat_triggers(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_remove_triggers(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_update_bat_leds(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_update_leds(Ptr<power_supply> psy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long power_read_file(Ptr<PciDefinitions.pci_slot> pci_slot2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short power_supply_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int attrno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_charge_behaviour_parse($arg1, (const u8*)$arg2)")
    public static int power_supply_charge_behaviour_parse(@Unsigned int available_behaviours, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long power_supply_charge_behaviour_show(Ptr<runtime.device> dev, @Unsigned int available_behaviours, power_supply_charge_behaviour current_behaviour, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void power_supply_init_attrs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_show_enum_with_available($arg1, (const u8**)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @OriginalName(value="ssize_t") long power_supply_show_enum_with_available(Ptr<runtime.device> dev, Ptr<String> labels, int label_count, @Unsigned int available_values, int value, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long power_supply_show_property(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_store_property($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long power_supply_store_property(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_supply_uevent((const struct device*)$arg1, $arg2)")
    public static int power_supply_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long power_uw_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> dev_attr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="power_write_file($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long power_write_file(Ptr<PciDefinitions.pci_slot> pci_slot2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_led_trigger")
    @NotUsableInJava
    public static class power_supply_led_trigger
    extends Struct {
        public LedDefinitions.led_trigger trig;
        public Ptr<power_supply> psy;
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_hwmon")
    @NotUsableInJava
    public static class power_supply_hwmon
    extends Struct {
        public Ptr<power_supply> psy;
        public Ptr<@Unsigned Long> props;
    }

    @Type(noCCodeGeneration=true, cType="struct power_allocator_params")
    @NotUsableInJava
    public static class power_allocator_params
    extends Struct {
        public boolean allocated_tzp;
        public boolean update_cdevs;
        public long err_integral;
        public int prev_err;
        public @Unsigned int sustainable_power;
        public Ptr<ThermalDefinitions.thermal_trip> trip_switch_on;
        public Ptr<ThermalDefinitions.thermal_trip> trip_max;
        public int total_weight;
        public @Unsigned int num_actors;
        public @Unsigned int buffer_size;
        public Ptr<power_actor> power;
    }

    @Type(noCCodeGeneration=true, cType="struct power_actor")
    @NotUsableInJava
    public static class power_actor
    extends Struct {
        public @Unsigned int req_power;
        public @Unsigned int max_power;
        public @Unsigned int granted_power;
        public @Unsigned int extra_actor_power;
        public @Unsigned int weighted_req_power;
    }

    @Type(noCCodeGeneration=true, cType="enum power_supply_notifier_events")
    public static enum power_supply_notifier_events implements Enum<power_supply_notifier_events>,
    TypedEnum<power_supply_notifier_events, Integer>
    {
        PSY_EVENT_PROP_CHANGED;

    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_config")
    @NotUsableInJava
    public static class power_supply_config
    extends Struct {
        public Ptr<DeviceDefinitions.device_node> of_node;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public Ptr<?> drv_data;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> attr_grp;
        public Ptr<String> supplied_to;
        public @Unsigned long num_supplicants;
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_attr")
    @NotUsableInJava
    public static class power_supply_attr
    extends Struct {
        public String prop_name;
        public char @Size(value=31) [] attr_name;
        public DeviceDefinitions.device_attribute dev_attr;
        public Ptr<String> text_values;
        public int text_values_len;
    }

    @Type(noCCodeGeneration=true, cType="enum power_supply_charge_behaviour")
    public static enum power_supply_charge_behaviour implements Enum<power_supply_charge_behaviour>,
    TypedEnum<power_supply_charge_behaviour, Integer>
    {
        POWER_SUPPLY_CHARGE_BEHAVIOUR_AUTO,
        POWER_SUPPLY_CHARGE_BEHAVIOUR_INHIBIT_CHARGE,
        POWER_SUPPLY_CHARGE_BEHAVIOUR_FORCE_DISCHARGE;

    }

    @Type(noCCodeGeneration=true, cType="enum power_supply_usb_type")
    public static enum power_supply_usb_type implements Enum<power_supply_usb_type>,
    TypedEnum<power_supply_usb_type, Integer>
    {
        POWER_SUPPLY_USB_TYPE_UNKNOWN,
        POWER_SUPPLY_USB_TYPE_SDP,
        POWER_SUPPLY_USB_TYPE_DCP,
        POWER_SUPPLY_USB_TYPE_CDP,
        POWER_SUPPLY_USB_TYPE_ACA,
        POWER_SUPPLY_USB_TYPE_C,
        POWER_SUPPLY_USB_TYPE_PD,
        POWER_SUPPLY_USB_TYPE_PD_DRP,
        POWER_SUPPLY_USB_TYPE_PD_PPS,
        POWER_SUPPLY_USB_TYPE_APPLE_BRICK_ID;

    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_maintenance_charge_table")
    @NotUsableInJava
    public static class power_supply_maintenance_charge_table
    extends Struct {
        public int charge_current_max_ua;
        public int charge_voltage_max_uv;
        public int charge_safety_timer_minutes;
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_vbat_ri_table")
    @NotUsableInJava
    public static class power_supply_vbat_ri_table
    extends Struct {
        public int vbat_uv;
        public int ri_uohm;
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_resistance_temp_table")
    @NotUsableInJava
    public static class power_supply_resistance_temp_table
    extends Struct {
        public int temp;
        public int resistance;
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_battery_ocv_table")
    @NotUsableInJava
    public static class power_supply_battery_ocv_table
    extends Struct {
        public int ocv;
        public int capacity;
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_battery_info")
    @NotUsableInJava
    public static class power_supply_battery_info
    extends Struct {
        public @Unsigned int technology;
        public int energy_full_design_uwh;
        public int charge_full_design_uah;
        public int voltage_min_design_uv;
        public int voltage_max_design_uv;
        public int tricklecharge_current_ua;
        public int precharge_current_ua;
        public int precharge_voltage_max_uv;
        public int charge_term_current_ua;
        public int charge_restart_voltage_uv;
        public int overvoltage_limit_uv;
        public int constant_charge_current_max_ua;
        public int constant_charge_voltage_max_uv;
        public Ptr<power_supply_maintenance_charge_table> maintenance_charge;
        public int maintenance_charge_size;
        public int alert_low_temp_charge_current_ua;
        public int alert_low_temp_charge_voltage_uv;
        public int alert_high_temp_charge_current_ua;
        public int alert_high_temp_charge_voltage_uv;
        public int factory_internal_resistance_uohm;
        public int factory_internal_resistance_charging_uohm;
        public int @Size(value=20) [] ocv_temp;
        public int temp_ambient_alert_min;
        public int temp_ambient_alert_max;
        public int temp_alert_min;
        public int temp_alert_max;
        public int temp_min;
        public int temp_max;
        public Ptr<power_supply_battery_ocv_table> @Size(value=20) [] ocv_table;
        public int @Size(value=20) [] ocv_table_size;
        public Ptr<power_supply_resistance_temp_table> resist_table;
        public int resist_table_size;
        public Ptr<power_supply_vbat_ri_table> vbat2ri_discharging;
        public int vbat2ri_discharging_size;
        public Ptr<power_supply_vbat_ri_table> vbat2ri_charging;
        public int vbat2ri_charging_size;
        public int bti_resistance_ohm;
        public int bti_resistance_tolerance;
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply")
    @NotUsableInJava
    public static class power_supply
    extends Struct {
        public Ptr<power_supply_desc> desc;
        public Ptr<String> supplied_to;
        public @Unsigned long num_supplicants;
        public Ptr<String> supplied_from;
        public @Unsigned long num_supplies;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public Ptr<?> drv_data;
        public runtime.device dev;
        public misc.work_struct changed_work;
        public DelayedDefinitions.delayed_work deferred_register_work;
        public  @OriginalName(value="spinlock_t") runtime.spinlock changed_lock;
        public boolean changed;
        public boolean initialized;
        public boolean removing;
        public AtomicDefinitions.atomic_t use_cnt;
        public Ptr<power_supply_battery_info> battery_info;
        public Ptr<ThermalDefinitions.thermal_zone_device> tzd;
        public Ptr<ThermalDefinitions.thermal_cooling_device> tcd;
        public Ptr<LedDefinitions.led_trigger> trig;
        public Ptr<LedDefinitions.led_trigger> charging_trig;
        public Ptr<LedDefinitions.led_trigger> full_trig;
        public Ptr<LedDefinitions.led_trigger> charging_blink_full_solid_trig;
        public Ptr<LedDefinitions.led_trigger> charging_orange_full_green_trig;
    }

    @Type(noCCodeGeneration=true, cType="struct power_supply_desc")
    @NotUsableInJava
    public static class power_supply_desc
    extends Struct {
        public String name;
        public power_supply_type type;
        public char charge_behaviours;
        public @Unsigned int usb_types;
        public Ptr<power_supply_property> properties;
        public @Unsigned long num_properties;
        public Ptr<?> get_property;
        public Ptr<?> set_property;
        public Ptr<?> property_is_writeable;
        public Ptr<?> external_power_changed;
        public Ptr<?> set_charged;
        public boolean no_thermal;
        public int use_for_apm;
    }

    @Type(noCCodeGeneration=true, cType="union power_supply_propval")
    @NotUsableInJava
    public static class power_supply_propval
    extends Union {
        public int intval;
        public String strval;
    }

    @Type(noCCodeGeneration=true, cType="enum power_supply_type")
    public static enum power_supply_type implements Enum<power_supply_type>,
    TypedEnum<power_supply_type, Integer>
    {
        POWER_SUPPLY_TYPE_UNKNOWN,
        POWER_SUPPLY_TYPE_BATTERY,
        POWER_SUPPLY_TYPE_UPS,
        POWER_SUPPLY_TYPE_MAINS,
        POWER_SUPPLY_TYPE_USB,
        POWER_SUPPLY_TYPE_USB_DCP,
        POWER_SUPPLY_TYPE_USB_CDP,
        POWER_SUPPLY_TYPE_USB_ACA,
        POWER_SUPPLY_TYPE_USB_TYPE_C,
        POWER_SUPPLY_TYPE_USB_PD,
        POWER_SUPPLY_TYPE_USB_PD_DRP,
        POWER_SUPPLY_TYPE_APPLE_BRICK_ID,
        POWER_SUPPLY_TYPE_WIRELESS;

    }

    @Type(noCCodeGeneration=true, cType="enum power_supply_property")
    public static enum power_supply_property implements Enum<power_supply_property>,
    TypedEnum<power_supply_property, Integer>
    {
        POWER_SUPPLY_PROP_STATUS,
        POWER_SUPPLY_PROP_CHARGE_TYPE,
        POWER_SUPPLY_PROP_HEALTH,
        POWER_SUPPLY_PROP_PRESENT,
        POWER_SUPPLY_PROP_ONLINE,
        POWER_SUPPLY_PROP_AUTHENTIC,
        POWER_SUPPLY_PROP_TECHNOLOGY,
        POWER_SUPPLY_PROP_CYCLE_COUNT,
        POWER_SUPPLY_PROP_VOLTAGE_MAX,
        POWER_SUPPLY_PROP_VOLTAGE_MIN,
        POWER_SUPPLY_PROP_VOLTAGE_MAX_DESIGN,
        POWER_SUPPLY_PROP_VOLTAGE_MIN_DESIGN,
        POWER_SUPPLY_PROP_VOLTAGE_NOW,
        POWER_SUPPLY_PROP_VOLTAGE_AVG,
        POWER_SUPPLY_PROP_VOLTAGE_OCV,
        POWER_SUPPLY_PROP_VOLTAGE_BOOT,
        POWER_SUPPLY_PROP_CURRENT_MAX,
        POWER_SUPPLY_PROP_CURRENT_NOW,
        POWER_SUPPLY_PROP_CURRENT_AVG,
        POWER_SUPPLY_PROP_CURRENT_BOOT,
        POWER_SUPPLY_PROP_POWER_NOW,
        POWER_SUPPLY_PROP_POWER_AVG,
        POWER_SUPPLY_PROP_CHARGE_FULL_DESIGN,
        POWER_SUPPLY_PROP_CHARGE_EMPTY_DESIGN,
        POWER_SUPPLY_PROP_CHARGE_FULL,
        POWER_SUPPLY_PROP_CHARGE_EMPTY,
        POWER_SUPPLY_PROP_CHARGE_NOW,
        POWER_SUPPLY_PROP_CHARGE_AVG,
        POWER_SUPPLY_PROP_CHARGE_COUNTER,
        POWER_SUPPLY_PROP_CONSTANT_CHARGE_CURRENT,
        POWER_SUPPLY_PROP_CONSTANT_CHARGE_CURRENT_MAX,
        POWER_SUPPLY_PROP_CONSTANT_CHARGE_VOLTAGE,
        POWER_SUPPLY_PROP_CONSTANT_CHARGE_VOLTAGE_MAX,
        POWER_SUPPLY_PROP_CHARGE_CONTROL_LIMIT,
        POWER_SUPPLY_PROP_CHARGE_CONTROL_LIMIT_MAX,
        POWER_SUPPLY_PROP_CHARGE_CONTROL_START_THRESHOLD,
        POWER_SUPPLY_PROP_CHARGE_CONTROL_END_THRESHOLD,
        POWER_SUPPLY_PROP_CHARGE_BEHAVIOUR,
        POWER_SUPPLY_PROP_INPUT_CURRENT_LIMIT,
        POWER_SUPPLY_PROP_INPUT_VOLTAGE_LIMIT,
        POWER_SUPPLY_PROP_INPUT_POWER_LIMIT,
        POWER_SUPPLY_PROP_ENERGY_FULL_DESIGN,
        POWER_SUPPLY_PROP_ENERGY_EMPTY_DESIGN,
        POWER_SUPPLY_PROP_ENERGY_FULL,
        POWER_SUPPLY_PROP_ENERGY_EMPTY,
        POWER_SUPPLY_PROP_ENERGY_NOW,
        POWER_SUPPLY_PROP_ENERGY_AVG,
        POWER_SUPPLY_PROP_CAPACITY,
        POWER_SUPPLY_PROP_CAPACITY_ALERT_MIN,
        POWER_SUPPLY_PROP_CAPACITY_ALERT_MAX,
        POWER_SUPPLY_PROP_CAPACITY_ERROR_MARGIN,
        POWER_SUPPLY_PROP_CAPACITY_LEVEL,
        POWER_SUPPLY_PROP_TEMP,
        POWER_SUPPLY_PROP_TEMP_MAX,
        POWER_SUPPLY_PROP_TEMP_MIN,
        POWER_SUPPLY_PROP_TEMP_ALERT_MIN,
        POWER_SUPPLY_PROP_TEMP_ALERT_MAX,
        POWER_SUPPLY_PROP_TEMP_AMBIENT,
        POWER_SUPPLY_PROP_TEMP_AMBIENT_ALERT_MIN,
        POWER_SUPPLY_PROP_TEMP_AMBIENT_ALERT_MAX,
        POWER_SUPPLY_PROP_TIME_TO_EMPTY_NOW,
        POWER_SUPPLY_PROP_TIME_TO_EMPTY_AVG,
        POWER_SUPPLY_PROP_TIME_TO_FULL_NOW,
        POWER_SUPPLY_PROP_TIME_TO_FULL_AVG,
        POWER_SUPPLY_PROP_TYPE,
        POWER_SUPPLY_PROP_USB_TYPE,
        POWER_SUPPLY_PROP_SCOPE,
        POWER_SUPPLY_PROP_PRECHARGE_CURRENT,
        POWER_SUPPLY_PROP_CHARGE_TERM_CURRENT,
        POWER_SUPPLY_PROP_CALIBRATE,
        POWER_SUPPLY_PROP_MANUFACTURE_YEAR,
        POWER_SUPPLY_PROP_MANUFACTURE_MONTH,
        POWER_SUPPLY_PROP_MANUFACTURE_DAY,
        POWER_SUPPLY_PROP_MODEL_NAME,
        POWER_SUPPLY_PROP_MANUFACTURER,
        POWER_SUPPLY_PROP_SERIAL_NUMBER;

    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int type; unsigned int system_level; unsigned int resource_order; }")
    @NotUsableInJava
    public static class power_resource_of_acpi_object
    extends Struct {
        public @Unsigned @OriginalName(value="acpi_object_type") int type;
        public @Unsigned int system_level;
        public @Unsigned int resource_order;
    }
}

