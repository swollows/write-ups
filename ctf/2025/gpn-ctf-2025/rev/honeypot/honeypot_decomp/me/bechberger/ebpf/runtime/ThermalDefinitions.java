/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ThermalDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __thermal_genl_cmd_cdev_get(Ptr<thermal_cooling_device> cdev2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __thermal_genl_cmd_tz_get_id(Ptr<thermal_zone_device> tz, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_acpi_active_trip_temp(Ptr<AcpiDefinitions.acpi_device> adev, int id, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_acpi_critical_trip_temp(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_acpi_hot_trip_temp(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_acpi_passive_trip_temp(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<Integer> ret_temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_bind(int mcgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_cmd_cdev_get(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_cmd_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_cmd_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_cmd_tz_get_gov(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_cmd_tz_get_id(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_cmd_tz_get_temp(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_cmd_tz_get_trip(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_cpu_capability_event(int count, Ptr<thermal_genl_cpu_caps> caps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_cdev_add(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_cdev_delete(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_cdev_state_update(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_cpu_capability_change(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_gov_change(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_tz(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_tz_create(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_tz_trip_change(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_event_tz_trip_up(Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_register_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_sampling_temp(int id, int temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_send_event(thermal_genl_event event2, Ptr<param> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_genl_unbind(int mcgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_genl_unregister_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_netlink_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_netlink_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_cdev_add((const struct thermal_cooling_device*)$arg1)")
    public static int thermal_notify_cdev_add(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_cdev_delete((const struct thermal_cooling_device*)$arg1)")
    public static int thermal_notify_cdev_delete(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_cdev_state_update((const struct thermal_cooling_device*)$arg1, $arg2)")
    public static int thermal_notify_cdev_state_update(Ptr<thermal_cooling_device> cdev2, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_tz_create((const struct thermal_zone_device*)$arg1)")
    public static int thermal_notify_tz_create(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_tz_delete((const struct thermal_zone_device*)$arg1)")
    public static int thermal_notify_tz_delete(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_tz_disable((const struct thermal_zone_device*)$arg1)")
    public static int thermal_notify_tz_disable(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_tz_enable((const struct thermal_zone_device*)$arg1)")
    public static int thermal_notify_tz_enable(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_tz_gov_change((const struct thermal_zone_device*)$arg1, (const u8*)$arg2)")
    public static int thermal_notify_tz_gov_change(Ptr<thermal_zone_device> tz, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_tz_trip_change((const struct thermal_zone_device*)$arg1, (const struct thermal_trip*)$arg2)")
    public static int thermal_notify_tz_trip_change(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_tz_trip_down((const struct thermal_zone_device*)$arg1, (const struct thermal_trip*)$arg2)")
    public static int thermal_notify_tz_trip_down(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_notify_tz_trip_up((const struct thermal_zone_device*)$arg1, (const struct thermal_trip*)$arg2)")
    public static int thermal_notify_tz_trip_up(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__thermal_cooling_device_register($arg1, (const u8*)$arg2, $arg3, (const struct thermal_cooling_device_ops*)$arg4)")
    public static Ptr<thermal_cooling_device> __thermal_cooling_device_register(Ptr<DeviceDefinitions.device_node> np, String type2, Ptr<?> devdata, Ptr<thermal_cooling_device_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __thermal_zone_device_update(Ptr<thermal_zone_device> tz, thermal_notify_event event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_bind_cdev_to_trip($arg1, (const struct thermal_trip*)$arg2, $arg3, $arg4)")
    public static int thermal_bind_cdev_to_trip(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip, Ptr<thermal_cooling_device> cdev2, Ptr<misc.cooling_spec> cool_spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_build_list_of_policies(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_cooling_device_register((const u8*)$arg1, $arg2, (const struct thermal_cooling_device_ops*)$arg3)")
    public static Ptr<thermal_cooling_device> thermal_cooling_device_register(String type2, Ptr<?> devdata, Ptr<thermal_cooling_device_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_cooling_device_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_cooling_device_unregister(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_cooling_device_update(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_governor_update_tz(Ptr<thermal_zone_device> tz, thermal_notify_event reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_of_cooling_device_register($arg1, (const u8*)$arg2, $arg3, (const struct thermal_cooling_device_ops*)$arg4)")
    public static Ptr<thermal_cooling_device> thermal_of_cooling_device_register(Ptr<DeviceDefinitions.device_node> np, String type2, Ptr<?> devdata, Ptr<thermal_cooling_device_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_pm_notify(Ptr<misc.notifier_block> nb, @Unsigned long mode, Ptr<?> _unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_register_governor(Ptr<thermal_governor> governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_set_governor(Ptr<thermal_zone_device> tz, Ptr<thermal_governor> new_gov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_trip_notify_cmp($arg1, (const struct list_head*)$arg2, (const struct list_head*)$arg3)")
    public static int thermal_trip_notify_cmp(Ptr<?> not_used, Ptr<ListDefinitions.list_head> a, Ptr<ListDefinitions.list_head> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_tripless_zone_device_register((const u8*)$arg1, $arg2, (const struct thermal_zone_device_ops*)$arg3, (const struct thermal_zone_params*)$arg4)")
    public static Ptr<thermal_zone_device> thermal_tripless_zone_device_register(String type2, Ptr<?> devdata, Ptr<thermal_zone_device_ops> ops, Ptr<thermal_zone_params> tzp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_unregister_governor(Ptr<thermal_governor> governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_cdev_bind(Ptr<thermal_zone_device> tz, Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_cdev_unbind(Ptr<thermal_zone_device> tz, Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_device_check(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_device_critical(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_device_critical_reboot(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_device_disable(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_device_enable(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_device_halt(Ptr<thermal_zone_device> tz, boolean shutdown2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_device_id(Ptr<thermal_zone_device> tzd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_device_init(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> thermal_zone_device_priv(Ptr<thermal_zone_device> tzd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_zone_device_register_with_trips((const u8*)$arg1, (const struct thermal_trip*)$arg2, $arg3, $arg4, (const struct thermal_zone_device_ops*)$arg5, (const struct thermal_zone_params*)$arg6, $arg7, $arg8)")
    public static Ptr<thermal_zone_device> thermal_zone_device_register_with_trips(String type2, Ptr<thermal_trip> trips, int num_trips, Ptr<?> devdata, Ptr<thermal_zone_device_ops> ops, Ptr<thermal_zone_params> tzp, @Unsigned int passive_delay, @Unsigned int polling_delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_device_resume(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_device_set_mode(Ptr<thermal_zone_device> tz, thermal_device_mode mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_device_set_policy(Ptr<thermal_zone_device> tz, String policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)thermal_zone_device_type($arg1))")
    public static String thermal_zone_device_type(Ptr<thermal_zone_device> tzd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_device_unregister(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_device_update(Ptr<thermal_zone_device> tz, thermal_notify_event event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<thermal_zone_device> thermal_zone_get_by_id(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_get_crit_temp(Ptr<thermal_zone_device> tz, Ptr<Integer> temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_zone_get_zone_by_name((const u8*)$arg1)")
    public static Ptr<thermal_zone_device> thermal_zone_get_zone_by_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_zone_trip_down($arg1, (const struct thermal_trip*)$arg2)")
    public static void thermal_zone_trip_down(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __thermal_cdev_update(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __thermal_zone_get_temp(Ptr<thermal_zone_device> tz, Ptr<Integer> temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_cdev_update(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_cooling_device_destroy_sysfs(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_cooling_device_setup_sysfs(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_cooling_device_stats_reinit(Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_cooling_device_stats_update(Ptr<thermal_cooling_device> cdev2, @Unsigned long new_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_trip_is_bound_to_cdev($arg1, (const struct thermal_trip*)$arg2, $arg3)")
    public static boolean thermal_trip_is_bound_to_cdev(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip, Ptr<thermal_cooling_device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_create_device_groups(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_destroy_device_groups(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_get_offset(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_get_slope(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_zone_get_temp(Ptr<thermal_zone_device> tz, Ptr<Integer> temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_act((const struct dmi_system_id*)$arg1)")
    public static int thermal_act(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_add_hwmon_sysfs(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_clear_package_intr_status(int level, @Unsigned long bit_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_get_temp(Ptr<thermal_zone_device> thermal, Ptr<Integer> temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_get_trend($arg1, (const struct thermal_trip*)$arg2, $arg3)")
    public static int thermal_get_trend(Ptr<thermal_zone_device> thermal, Ptr<thermal_trip> trip, Ptr<thermal_trend> trend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_hwmon_lookup_by_type((const struct thermal_zone_device*)$arg1)")
    public static Ptr<thermal_hwmon_device> thermal_hwmon_lookup_by_type(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_nocrt((const struct dmi_system_id*)$arg1)")
    public static int thermal_nocrt(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_psv((const struct dmi_system_id*)$arg1)")
    public static int thermal_psv(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_remove_hwmon_sysfs(Ptr<thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_throttle_add_dev(Ptr<runtime.device> dev, @Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_throttle_init_device() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_throttle_offline(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int thermal_throttle_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)thermal_trip_type_name($arg1))")
    public static String thermal_trip_type_name(thermal_trip_type trip_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_tzp((const struct dmi_system_id*)$arg1)")
    public static int thermal_tzp(Ptr<DmiDefinitions.dmi_system_id> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_zone_for_each_trip($arg1, (int (*)(struct thermal_trip*, void*))$arg2, $arg3)")
    public static int thermal_zone_for_each_trip(Ptr<thermal_zone_device> tz, Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_set_trip_hyst(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip, int hyst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_set_trip_temp(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip, int temp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void thermal_zone_set_trips(Ptr<thermal_zone_device> tz, int low, int high) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_zone_trip_id((const struct thermal_zone_device*)$arg1, (const struct thermal_trip*)$arg2)")
    public static int thermal_zone_trip_id(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="thermal_zone_trip_update($arg1, (const struct thermal_trip*)$arg2, $arg3)")
    public static void thermal_zone_trip_update(Ptr<thermal_zone_device> tz, Ptr<thermal_trip> trip, int trip_threshold) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct param")
    @NotUsableInJava
    public static class param
    extends Struct {
        public Ptr<Ptr<runtime.nlattr>> attrs;
        public Ptr<SkDefinitions.sk_buff> msg;
        public String name;
        public int tz_id;
        public int cdev_id;
        public int trip_id;
        public int trip_temp;
        public int trip_type;
        public int trip_hyst;
        public int temp;
        public int cdev_state;
        public int cdev_max_state;
        public Ptr<thermal_genl_cpu_caps> cpu_capabilities;
        public int cpu_capabilities_count;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_genl_notify")
    @NotUsableInJava
    public static class thermal_genl_notify
    extends Struct {
        public int mcgrp;
    }

    @Type(noCCodeGeneration=true, cType="enum thermal_genl_multicast_groups")
    public static enum thermal_genl_multicast_groups implements Enum<thermal_genl_multicast_groups>,
    TypedEnum<thermal_genl_multicast_groups, Integer>
    {
        THERMAL_GENL_SAMPLING_GROUP,
        THERMAL_GENL_EVENT_GROUP,
        THERMAL_GENL_MAX_GROUP;

    }

    @Type(noCCodeGeneration=true, cType="struct thermal_genl_cpu_caps")
    @NotUsableInJava
    public static class thermal_genl_cpu_caps
    extends Struct {
        public int cpu;
        public int performance;
        public int efficiency;
    }

    @Type(noCCodeGeneration=true, cType="enum thermal_genl_cmd")
    public static enum thermal_genl_cmd implements Enum<thermal_genl_cmd>,
    TypedEnum<thermal_genl_cmd, Integer>
    {
        THERMAL_GENL_CMD_UNSPEC,
        THERMAL_GENL_CMD_TZ_GET_ID,
        THERMAL_GENL_CMD_TZ_GET_TRIP,
        THERMAL_GENL_CMD_TZ_GET_TEMP,
        THERMAL_GENL_CMD_TZ_GET_GOV,
        THERMAL_GENL_CMD_TZ_GET_MODE,
        THERMAL_GENL_CMD_CDEV_GET,
        __THERMAL_GENL_CMD_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum thermal_genl_event")
    public static enum thermal_genl_event implements Enum<thermal_genl_event>,
    TypedEnum<thermal_genl_event, Integer>
    {
        THERMAL_GENL_EVENT_UNSPEC,
        THERMAL_GENL_EVENT_TZ_CREATE,
        THERMAL_GENL_EVENT_TZ_DELETE,
        THERMAL_GENL_EVENT_TZ_DISABLE,
        THERMAL_GENL_EVENT_TZ_ENABLE,
        THERMAL_GENL_EVENT_TZ_TRIP_UP,
        THERMAL_GENL_EVENT_TZ_TRIP_DOWN,
        THERMAL_GENL_EVENT_TZ_TRIP_CHANGE,
        THERMAL_GENL_EVENT_TZ_TRIP_ADD,
        THERMAL_GENL_EVENT_TZ_TRIP_DELETE,
        THERMAL_GENL_EVENT_CDEV_ADD,
        THERMAL_GENL_EVENT_CDEV_DELETE,
        THERMAL_GENL_EVENT_CDEV_STATE_UPDATE,
        THERMAL_GENL_EVENT_TZ_GOV_CHANGE,
        THERMAL_GENL_EVENT_CPU_CAPABILITY_CHANGE,
        __THERMAL_GENL_EVENT_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum thermal_genl_sampling")
    public static enum thermal_genl_sampling implements Enum<thermal_genl_sampling>,
    TypedEnum<thermal_genl_sampling, Integer>
    {
        THERMAL_GENL_SAMPLING_TEMP,
        __THERMAL_GENL_SAMPLING_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum thermal_genl_attr")
    public static enum thermal_genl_attr implements Enum<thermal_genl_attr>,
    TypedEnum<thermal_genl_attr, Integer>
    {
        THERMAL_GENL_ATTR_UNSPEC,
        THERMAL_GENL_ATTR_TZ,
        THERMAL_GENL_ATTR_TZ_ID,
        THERMAL_GENL_ATTR_TZ_TEMP,
        THERMAL_GENL_ATTR_TZ_TRIP,
        THERMAL_GENL_ATTR_TZ_TRIP_ID,
        THERMAL_GENL_ATTR_TZ_TRIP_TYPE,
        THERMAL_GENL_ATTR_TZ_TRIP_TEMP,
        THERMAL_GENL_ATTR_TZ_TRIP_HYST,
        THERMAL_GENL_ATTR_TZ_MODE,
        THERMAL_GENL_ATTR_TZ_NAME,
        THERMAL_GENL_ATTR_TZ_CDEV_WEIGHT,
        THERMAL_GENL_ATTR_TZ_GOV,
        THERMAL_GENL_ATTR_TZ_GOV_NAME,
        THERMAL_GENL_ATTR_CDEV,
        THERMAL_GENL_ATTR_CDEV_ID,
        THERMAL_GENL_ATTR_CDEV_CUR_STATE,
        THERMAL_GENL_ATTR_CDEV_MAX_STATE,
        THERMAL_GENL_ATTR_CDEV_NAME,
        THERMAL_GENL_ATTR_GOV_NAME,
        THERMAL_GENL_ATTR_CPU_CAPABILITY,
        THERMAL_GENL_ATTR_CPU_CAPABILITY_ID,
        THERMAL_GENL_ATTR_CPU_CAPABILITY_PERFORMANCE,
        THERMAL_GENL_ATTR_CPU_CAPABILITY_EFFICIENCY,
        __THERMAL_GENL_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct thermal_state")
    @NotUsableInJava
    public static class thermal_state
    extends Struct {
        public _thermal_state core_throttle;
        public _thermal_state core_power_limit;
        public _thermal_state package_throttle;
        public _thermal_state package_power_limit;
        public _thermal_state core_thresh0;
        public _thermal_state core_thresh1;
        public _thermal_state pkg_thresh0;
        public _thermal_state pkg_thresh1;
    }

    @Type(noCCodeGeneration=true, cType="struct _thermal_state")
    @NotUsableInJava
    public static class _thermal_state
    extends Struct {
        public @Unsigned long next_check;
        public @Unsigned long last_interrupt_time;
        public DelayedDefinitions.delayed_work therm_work;
        public @Unsigned long count;
        public @Unsigned long last_count;
        public @Unsigned long max_time_ms;
        public @Unsigned long total_time_ms;
        public boolean rate_control_active;
        public boolean new_event;
        public char level;
        public char sample_index;
        public char sample_count;
        public char average;
        public char baseline_temp;
        public char @Size(value=3) [] temp_samples;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_instance")
    @NotUsableInJava
    public static class thermal_instance
    extends Struct {
        public int id;
        public char @Size(value=20) [] name;
        public Ptr<thermal_cooling_device> cdev;
        public Ptr<thermal_trip> trip;
        public boolean initialized;
        public @Unsigned long upper;
        public @Unsigned long lower;
        public @Unsigned long target;
        public char @Size(value=20) [] attr_name;
        public DeviceDefinitions.device_attribute attr;
        public char @Size(value=20) [] weight_attr_name;
        public DeviceDefinitions.device_attribute weight_attr;
        public ListDefinitions.list_head tz_node;
        public ListDefinitions.list_head cdev_node;
        public @Unsigned int weight;
        public boolean upper_no_limit;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_hwmon_temp")
    @NotUsableInJava
    public static class thermal_hwmon_temp
    extends Struct {
        public ListDefinitions.list_head hwmon_node;
        public Ptr<thermal_zone_device> tz;
        public thermal_hwmon_attr temp_input;
        public thermal_hwmon_attr temp_crit;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_hwmon_attr")
    @NotUsableInJava
    public static class thermal_hwmon_attr
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public char @Size(value=16) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_hwmon_device")
    @NotUsableInJava
    public static class thermal_hwmon_device
    extends Struct {
        public char @Size(value=20) [] type;
        public Ptr<runtime.device> device;
        public int count;
        public ListDefinitions.list_head tz_list;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_governor")
    @NotUsableInJava
    public static class thermal_governor
    extends Struct {
        public String name;
        public Ptr<?> bind_to_tz;
        public Ptr<?> unbind_from_tz;
        public Ptr<?> trip_crossed;
        public Ptr<?> manage;
        public Ptr<?> update_tz;
        public ListDefinitions.list_head governor_list;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_trip_desc")
    @NotUsableInJava
    public static class thermal_trip_desc
    extends Struct {
        public thermal_trip trip;
        public thermal_trip_attrs trip_attrs;
        public ListDefinitions.list_head notify_list_node;
        public int notify_temp;
        public int threshold;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_trip_attrs")
    @NotUsableInJava
    public static class thermal_trip_attrs
    extends Struct {
        public thermal_attr type;
        public thermal_attr temp;
        public thermal_attr hyst;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_attr")
    @NotUsableInJava
    public static class thermal_attr
    extends Struct {
        public DeviceDefinitions.device_attribute attr;
        public char @Size(value=20) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_zone_device")
    @NotUsableInJava
    public static class thermal_zone_device
    extends Struct {
        public int id;
        public char @Size(value=20) [] type;
        public runtime.device device;
        public runtime.completion removal;
        public runtime.completion resume;
        public AttributeDefinitions.attribute_group trips_attribute_group;
        public thermal_device_mode mode;
        public Ptr<?> devdata;
        public int num_trips;
        public @Unsigned long passive_delay_jiffies;
        public @Unsigned long polling_delay_jiffies;
        public @Unsigned long recheck_delay_jiffies;
        public int temperature;
        public int last_temperature;
        public int emul_temperature;
        public int passive;
        public int prev_low_trip;
        public int prev_high_trip;
        public AtomicDefinitions.atomic_t need_update;
        public thermal_zone_device_ops ops;
        public Ptr<thermal_zone_params> tzp;
        public Ptr<thermal_governor> governor;
        public Ptr<?> governor_data;
        public ListDefinitions.list_head thermal_instances;
        public runtime.ida ida;
        public runtime.mutex lock;
        public ListDefinitions.list_head node;
        public DelayedDefinitions.delayed_work poll_queue;
        public thermal_notify_event notify_event;
        public char state;
        public thermal_trip_desc @Size(value=0) [] trips;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_zone_params")
    @NotUsableInJava
    public static class thermal_zone_params
    extends Struct {
        public String governor_name;
        public boolean no_hwmon;
        public @Unsigned int sustainable_power;
        public int k_po;
        public int k_pu;
        public int k_i;
        public int k_d;
        public int integral_cutoff;
        public int slope;
        public int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_zone_device_ops")
    @NotUsableInJava
    public static class thermal_zone_device_ops
    extends Struct {
        public Ptr<?> should_bind;
        public Ptr<?> get_temp;
        public Ptr<?> set_trips;
        public Ptr<?> change_mode;
        public Ptr<?> set_trip_temp;
        public Ptr<?> get_crit_temp;
        public Ptr<?> set_emul_temp;
        public Ptr<?> get_trend;
        public Ptr<?> hot;
        public Ptr<?> critical;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_trip")
    @NotUsableInJava
    public static class thermal_trip
    extends Struct {
        public int temperature;
        public int hysteresis;
        public thermal_trip_type type;
        public char flags;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="enum thermal_notify_event")
    public static enum thermal_notify_event implements Enum<thermal_notify_event>,
    TypedEnum<thermal_notify_event, Integer>
    {
        THERMAL_EVENT_UNSPECIFIED,
        THERMAL_EVENT_TEMP_SAMPLE,
        THERMAL_TRIP_VIOLATED,
        THERMAL_TRIP_CHANGED,
        THERMAL_DEVICE_DOWN,
        THERMAL_DEVICE_UP,
        THERMAL_DEVICE_POWER_CAPABILITY_CHANGED,
        THERMAL_TABLE_CHANGED,
        THERMAL_EVENT_KEEP_ALIVE,
        THERMAL_TZ_BIND_CDEV,
        THERMAL_TZ_UNBIND_CDEV,
        THERMAL_INSTANCE_WEIGHT_CHANGED,
        THERMAL_TZ_RESUME;

    }

    @Type(noCCodeGeneration=true, cType="enum thermal_trend")
    public static enum thermal_trend implements Enum<thermal_trend>,
    TypedEnum<thermal_trend, Integer>
    {
        THERMAL_TREND_STABLE,
        THERMAL_TREND_RAISING,
        THERMAL_TREND_DROPPING;

    }

    @Type(noCCodeGeneration=true, cType="enum thermal_trip_type")
    public static enum thermal_trip_type implements Enum<thermal_trip_type>,
    TypedEnum<thermal_trip_type, Integer>
    {
        THERMAL_TRIP_ACTIVE,
        THERMAL_TRIP_PASSIVE,
        THERMAL_TRIP_HOT,
        THERMAL_TRIP_CRITICAL;

    }

    @Type(noCCodeGeneration=true, cType="enum thermal_device_mode")
    public static enum thermal_device_mode implements Enum<thermal_device_mode>,
    TypedEnum<thermal_device_mode, Integer>
    {
        THERMAL_DEVICE_DISABLED,
        THERMAL_DEVICE_ENABLED;

    }

    @Type(noCCodeGeneration=true, cType="struct thermal_cooling_device_ops")
    @NotUsableInJava
    public static class thermal_cooling_device_ops
    extends Struct {
        public Ptr<?> get_max_state;
        public Ptr<?> get_cur_state;
        public Ptr<?> set_cur_state;
        public Ptr<?> get_requested_power;
        public Ptr<?> state2power;
        public Ptr<?> power2state;
    }

    @Type(noCCodeGeneration=true, cType="struct thermal_cooling_device")
    @NotUsableInJava
    public static class thermal_cooling_device
    extends Struct {
        public int id;
        public String type;
        public @Unsigned long max_state;
        public runtime.device device;
        public Ptr<DeviceDefinitions.device_node> np;
        public Ptr<?> devdata;
        public Ptr<?> stats;
        public Ptr<thermal_cooling_device_ops> ops;
        public boolean updated;
        public runtime.mutex lock;
        public ListDefinitions.list_head thermal_instances;
        public ListDefinitions.list_head node;
    }
}

