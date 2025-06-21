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
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ExtconDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PowerDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ChargerDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int charger_extcon_notifier(Ptr<misc.notifier_block> self, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void charger_extcon_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long charger_externally_control_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="charger_externally_control_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long charger_externally_control_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int charger_get_property(Ptr<PowerDefinitions.power_supply> psy, PowerDefinitions.power_supply_property psp, Ptr<PowerDefinitions.power_supply_propval> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void charger_manager_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int charger_manager_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int charger_manager_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int charger_manager_register_extcon(Ptr<charger_manager> cm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void charger_manager_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long charger_name_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long charger_state_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct charger_desc")
    @NotUsableInJava
    public static class charger_desc
    extends Struct {
        public String psy_name;
        public misc.polling_modes polling_mode;
        public @Unsigned int polling_interval_ms;
        public @Unsigned int fullbatt_vchkdrop_uV;
        public @Unsigned int fullbatt_uV;
        public @Unsigned int fullbatt_soc;
        public @Unsigned int fullbatt_full_capacity;
        public DataDefinitions.data_source battery_present;
        public Ptr<String> psy_charger_stat;
        public int num_charger_regulators;
        public Ptr<charger_regulator> charger_regulators;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> sysfs_groups;
        public String psy_fuel_gauge;
        public String thermal_zone;
        public int temp_min;
        public int temp_max;
        public int temp_diff;
        public boolean measure_battery_temp;
        public @Unsigned int charging_max_duration_ms;
        public @Unsigned int discharging_max_duration_ms;
    }

    @Type(noCCodeGeneration=true, cType="struct charger_manager")
    @NotUsableInJava
    public static class charger_manager
    extends Struct {
        public ListDefinitions.list_head entry;
        public Ptr<runtime.device> dev;
        public Ptr<charger_desc> desc;
        public Ptr<ThermalDefinitions.thermal_zone_device> tzd_batt;
        public boolean charger_enabled;
        public int emergency_stop;
        public char @Size(value=31) [] psy_name_buf;
        public PowerDefinitions.power_supply_desc charger_psy_desc;
        public Ptr<PowerDefinitions.power_supply> charger_psy;
        public @Unsigned long charging_start_time;
        public @Unsigned long charging_end_time;
        public int battery_status;
    }

    @Type(noCCodeGeneration=true, cType="struct charger_regulator")
    @NotUsableInJava
    public static class charger_regulator
    extends Struct {
        public String regulator_name;
        public Ptr<runtime.regulator> consumer;
        public int externally_control;
        public Ptr<charger_cable> cables;
        public int num_cables;
        public AttributeDefinitions.attribute_group attr_grp;
        public DeviceDefinitions.device_attribute attr_name;
        public DeviceDefinitions.device_attribute attr_state;
        public DeviceDefinitions.device_attribute attr_externally_control;
        public Ptr<runtime.attribute> @Size(value=4) [] attrs;
        public Ptr<charger_manager> cm;
    }

    @Type(noCCodeGeneration=true, cType="struct charger_cable")
    @NotUsableInJava
    public static class charger_cable
    extends Struct {
        public String extcon_name;
        public String name;
        public Ptr<ExtconDefinitions.extcon_dev> extcon_dev;
        public @Unsigned long extcon_type;
        public misc.work_struct wq;
        public misc.notifier_block nb;
        public boolean attached;
        public Ptr<charger_regulator> charger;
        public int min_uA;
        public int max_uA;
        public Ptr<charger_manager> cm;
    }
}

