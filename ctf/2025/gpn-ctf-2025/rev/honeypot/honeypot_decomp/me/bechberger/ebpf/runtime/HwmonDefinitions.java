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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class HwmonDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__hwmon_device_register($arg1, (const u8*)$arg2, $arg3, (const struct hwmon_chip_info*)$arg4, (const struct attribute_group**)$arg5)")
    public static Ptr<runtime.device> __hwmon_device_register(Ptr<runtime.device> dev, String name, Ptr<?> drvdata, Ptr<hwmon_chip_info> chip, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__hwmon_sanitize_name($arg1, (const u8*)$arg2)")
    public static String __hwmon_sanitize_name(Ptr<runtime.device> dev, String old_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hwmon_attr_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long hwmon_attr_show_string(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwmon_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long hwmon_attr_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short hwmon_dev_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hwmon_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> hwmon_device_register(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwmon_device_register_for_thermal($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.device> hwmon_device_register_for_thermal(Ptr<runtime.device> dev, String name, Ptr<?> drvdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwmon_device_register_with_groups($arg1, (const u8*)$arg2, $arg3, (const struct attribute_group**)$arg4)")
    public static Ptr<runtime.device> hwmon_device_register_with_groups(Ptr<runtime.device> dev, String name, Ptr<?> drvdata, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwmon_device_register_with_info($arg1, (const u8*)$arg2, $arg3, (const struct hwmon_chip_info*)$arg4, (const struct attribute_group**)$arg5)")
    public static Ptr<runtime.device> hwmon_device_register_with_info(Ptr<runtime.device> dev, String name, Ptr<?> drvdata, Ptr<hwmon_chip_info> chip, Ptr<Ptr<AttributeDefinitions.attribute_group>> extra_groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hwmon_device_unregister(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hwmon_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwmon_genattrs((const void*)$arg1, $arg2, (const struct hwmon_ops*)$arg3, (const struct hwmon_channel_info*)$arg4)")
    public static int hwmon_genattrs(Ptr<?> drvdata, Ptr<Ptr<runtime.attribute>> attrs, Ptr<hwmon_ops> ops, Ptr<hwmon_channel_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwmon_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwmon_match_device(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwmon_notify_event(Ptr<runtime.device> dev, hwmon_sensor_types type2, @Unsigned int attr2, int channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwmon_num_channel_attrs((const struct hwmon_channel_info*)$arg1)")
    public static int hwmon_num_channel_attrs(Ptr<hwmon_channel_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hwmon_remove_pec(Ptr<?> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwmon_sanitize_name((const u8*)$arg1)")
    public static String hwmon_sanitize_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct hwmon_type_attr_list")
    @NotUsableInJava
    public static class hwmon_type_attr_list
    extends Struct {
        public Ptr<@Unsigned Integer> attrs;
        public @Unsigned long n_attrs;
    }

    @Type(noCCodeGeneration=true, cType="struct hwmon_device_attribute")
    @NotUsableInJava
    public static class hwmon_device_attribute
    extends Struct {
        public DeviceDefinitions.device_attribute dev_attr;
        public Ptr<hwmon_ops> ops;
        public hwmon_sensor_types type;
        public @Unsigned int attr;
        public int index;
        public char @Size(value=32) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct hwmon_device")
    @NotUsableInJava
    public static class hwmon_device
    extends Struct {
        public String name;
        public String label;
        public runtime.device dev;
        public Ptr<hwmon_chip_info> chip;
        public ListDefinitions.list_head tzdata;
        public AttributeDefinitions.attribute_group group;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> groups;
    }

    @Type(noCCodeGeneration=true, cType="struct hwmon_chip_info")
    @NotUsableInJava
    public static class hwmon_chip_info
    extends Struct {
        public Ptr<hwmon_ops> ops;
        public Ptr<Ptr<hwmon_channel_info>> info;
    }

    @Type(noCCodeGeneration=true, cType="struct hwmon_channel_info")
    @NotUsableInJava
    public static class hwmon_channel_info
    extends Struct {
        public hwmon_sensor_types type;
        public Ptr<@Unsigned Integer> config;
    }

    @Type(noCCodeGeneration=true, cType="struct hwmon_ops")
    @NotUsableInJava
    public static class hwmon_ops
    extends Struct {
        public Ptr<?> is_visible;
        public Ptr<?> read;
        public Ptr<?> read_string;
        public Ptr<?> write;
    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_intrusion_attributes")
    public static enum hwmon_intrusion_attributes implements Enum<hwmon_intrusion_attributes>,
    TypedEnum<hwmon_intrusion_attributes, Integer>
    {
        hwmon_intrusion_alarm,
        hwmon_intrusion_beep;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_pwm_attributes")
    public static enum hwmon_pwm_attributes implements Enum<hwmon_pwm_attributes>,
    TypedEnum<hwmon_pwm_attributes, Integer>
    {
        hwmon_pwm_input,
        hwmon_pwm_enable,
        hwmon_pwm_mode,
        hwmon_pwm_freq,
        hwmon_pwm_auto_channels_temp;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_fan_attributes")
    public static enum hwmon_fan_attributes implements Enum<hwmon_fan_attributes>,
    TypedEnum<hwmon_fan_attributes, Integer>
    {
        hwmon_fan_enable,
        hwmon_fan_input,
        hwmon_fan_label,
        hwmon_fan_min,
        hwmon_fan_max,
        hwmon_fan_div,
        hwmon_fan_pulses,
        hwmon_fan_target,
        hwmon_fan_alarm,
        hwmon_fan_min_alarm,
        hwmon_fan_max_alarm,
        hwmon_fan_fault,
        hwmon_fan_beep;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_humidity_attributes")
    public static enum hwmon_humidity_attributes implements Enum<hwmon_humidity_attributes>,
    TypedEnum<hwmon_humidity_attributes, Integer>
    {
        hwmon_humidity_enable,
        hwmon_humidity_input,
        hwmon_humidity_label,
        hwmon_humidity_min,
        hwmon_humidity_min_hyst,
        hwmon_humidity_max,
        hwmon_humidity_max_hyst,
        hwmon_humidity_alarm,
        hwmon_humidity_fault,
        hwmon_humidity_rated_min,
        hwmon_humidity_rated_max,
        hwmon_humidity_min_alarm,
        hwmon_humidity_max_alarm;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_energy_attributes")
    public static enum hwmon_energy_attributes implements Enum<hwmon_energy_attributes>,
    TypedEnum<hwmon_energy_attributes, Integer>
    {
        hwmon_energy_enable,
        hwmon_energy_input,
        hwmon_energy_label;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_power_attributes")
    public static enum hwmon_power_attributes implements Enum<hwmon_power_attributes>,
    TypedEnum<hwmon_power_attributes, Integer>
    {
        hwmon_power_enable,
        hwmon_power_average,
        hwmon_power_average_interval,
        hwmon_power_average_interval_max,
        hwmon_power_average_interval_min,
        hwmon_power_average_highest,
        hwmon_power_average_lowest,
        hwmon_power_average_max,
        hwmon_power_average_min,
        hwmon_power_input,
        hwmon_power_input_highest,
        hwmon_power_input_lowest,
        hwmon_power_reset_history,
        hwmon_power_accuracy,
        hwmon_power_cap,
        hwmon_power_cap_hyst,
        hwmon_power_cap_max,
        hwmon_power_cap_min,
        hwmon_power_min,
        hwmon_power_max,
        hwmon_power_crit,
        hwmon_power_lcrit,
        hwmon_power_label,
        hwmon_power_alarm,
        hwmon_power_cap_alarm,
        hwmon_power_min_alarm,
        hwmon_power_max_alarm,
        hwmon_power_lcrit_alarm,
        hwmon_power_crit_alarm,
        hwmon_power_rated_min,
        hwmon_power_rated_max;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_curr_attributes")
    public static enum hwmon_curr_attributes implements Enum<hwmon_curr_attributes>,
    TypedEnum<hwmon_curr_attributes, Integer>
    {
        hwmon_curr_enable,
        hwmon_curr_input,
        hwmon_curr_min,
        hwmon_curr_max,
        hwmon_curr_lcrit,
        hwmon_curr_crit,
        hwmon_curr_average,
        hwmon_curr_lowest,
        hwmon_curr_highest,
        hwmon_curr_reset_history,
        hwmon_curr_label,
        hwmon_curr_alarm,
        hwmon_curr_min_alarm,
        hwmon_curr_max_alarm,
        hwmon_curr_lcrit_alarm,
        hwmon_curr_crit_alarm,
        hwmon_curr_rated_min,
        hwmon_curr_rated_max,
        hwmon_curr_beep;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_in_attributes")
    public static enum hwmon_in_attributes implements Enum<hwmon_in_attributes>,
    TypedEnum<hwmon_in_attributes, Integer>
    {
        hwmon_in_enable,
        hwmon_in_input,
        hwmon_in_min,
        hwmon_in_max,
        hwmon_in_lcrit,
        hwmon_in_crit,
        hwmon_in_average,
        hwmon_in_lowest,
        hwmon_in_highest,
        hwmon_in_reset_history,
        hwmon_in_label,
        hwmon_in_alarm,
        hwmon_in_min_alarm,
        hwmon_in_max_alarm,
        hwmon_in_lcrit_alarm,
        hwmon_in_crit_alarm,
        hwmon_in_rated_min,
        hwmon_in_rated_max,
        hwmon_in_beep,
        hwmon_in_fault;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_temp_attributes")
    public static enum hwmon_temp_attributes implements Enum<hwmon_temp_attributes>,
    TypedEnum<hwmon_temp_attributes, Integer>
    {
        hwmon_temp_enable,
        hwmon_temp_input,
        hwmon_temp_type,
        hwmon_temp_lcrit,
        hwmon_temp_lcrit_hyst,
        hwmon_temp_min,
        hwmon_temp_min_hyst,
        hwmon_temp_max,
        hwmon_temp_max_hyst,
        hwmon_temp_crit,
        hwmon_temp_crit_hyst,
        hwmon_temp_emergency,
        hwmon_temp_emergency_hyst,
        hwmon_temp_alarm,
        hwmon_temp_lcrit_alarm,
        hwmon_temp_min_alarm,
        hwmon_temp_max_alarm,
        hwmon_temp_crit_alarm,
        hwmon_temp_emergency_alarm,
        hwmon_temp_fault,
        hwmon_temp_offset,
        hwmon_temp_label,
        hwmon_temp_lowest,
        hwmon_temp_highest,
        hwmon_temp_reset_history,
        hwmon_temp_rated_min,
        hwmon_temp_rated_max,
        hwmon_temp_beep;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_chip_attributes")
    public static enum hwmon_chip_attributes implements Enum<hwmon_chip_attributes>,
    TypedEnum<hwmon_chip_attributes, Integer>
    {
        hwmon_chip_temp_reset_history,
        hwmon_chip_in_reset_history,
        hwmon_chip_curr_reset_history,
        hwmon_chip_power_reset_history,
        hwmon_chip_register_tz,
        hwmon_chip_update_interval,
        hwmon_chip_alarms,
        hwmon_chip_samples,
        hwmon_chip_curr_samples,
        hwmon_chip_in_samples,
        hwmon_chip_power_samples,
        hwmon_chip_temp_samples,
        hwmon_chip_beep_enable,
        hwmon_chip_pec;

    }

    @Type(noCCodeGeneration=true, cType="enum hwmon_sensor_types")
    public static enum hwmon_sensor_types implements Enum<hwmon_sensor_types>,
    TypedEnum<hwmon_sensor_types, Integer>
    {
        hwmon_chip,
        hwmon_temp,
        hwmon_in,
        hwmon_curr,
        hwmon_power,
        hwmon_energy,
        hwmon_humidity,
        hwmon_fan,
        hwmon_pwm,
        hwmon_intrusion,
        hwmon_max;

    }
}

