/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PowercapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int powercap_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="powercap_register_control_type($arg1, (const u8*)$arg2, (const struct powercap_control_type_ops*)$arg3)")
    public static Ptr<powercap_control_type> powercap_register_control_type(Ptr<powercap_control_type> control_type, String name, Ptr<powercap_control_type_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="powercap_register_zone($arg1, $arg2, (const u8*)$arg3, $arg4, (const struct powercap_zone_ops*)$arg5, $arg6, (const struct powercap_zone_constraint_ops*)$arg7)")
    public static Ptr<powercap_zone> powercap_register_zone(Ptr<powercap_zone> power_zone, Ptr<powercap_control_type> control_type, String name, Ptr<powercap_zone> parent, Ptr<powercap_zone_ops> ops, int nr_constraints, Ptr<powercap_zone_constraint_ops> const_ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void powercap_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int powercap_unregister_control_type(Ptr<powercap_control_type> control_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int powercap_unregister_zone(Ptr<powercap_control_type> control_type, Ptr<powercap_zone> power_zone) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct powercap_constraint_attr")
    @NotUsableInJava
    public static class powercap_constraint_attr
    extends Struct {
        public DeviceDefinitions.device_attribute power_limit_attr;
        public DeviceDefinitions.device_attribute time_window_attr;
        public DeviceDefinitions.device_attribute max_power_attr;
        public DeviceDefinitions.device_attribute min_power_attr;
        public DeviceDefinitions.device_attribute max_time_window_attr;
        public DeviceDefinitions.device_attribute min_time_window_attr;
        public DeviceDefinitions.device_attribute name_attr;
    }

    @Type(noCCodeGeneration=true, cType="struct powercap_zone_constraint_ops")
    @NotUsableInJava
    public static class powercap_zone_constraint_ops
    extends Struct {
        public Ptr<?> set_power_limit_uw;
        public Ptr<?> get_power_limit_uw;
        public Ptr<?> set_time_window_us;
        public Ptr<?> get_time_window_us;
        public Ptr<?> get_max_power_uw;
        public Ptr<?> get_min_power_uw;
        public Ptr<?> get_max_time_window_us;
        public Ptr<?> get_min_time_window_us;
        public Ptr<?> get_name;
    }

    @Type(noCCodeGeneration=true, cType="struct powercap_zone_constraint")
    @NotUsableInJava
    public static class powercap_zone_constraint
    extends Struct {
        public int id;
        public Ptr<powercap_zone> power_zone;
        public Ptr<powercap_zone_constraint_ops> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct powercap_zone")
    @NotUsableInJava
    public static class powercap_zone
    extends Struct {
        public int id;
        public String name;
        public Ptr<?> control_type_inst;
        public Ptr<powercap_zone_ops> ops;
        public runtime.device dev;
        public int const_id_cnt;
        public runtime.idr idr;
        public Ptr<runtime.idr> parent_idr;
        public Ptr<?> private_data;
        public Ptr<Ptr<runtime.attribute>> zone_dev_attrs;
        public int zone_attr_count;
        public AttributeDefinitions.attribute_group dev_zone_attr_group;
        public Ptr<AttributeDefinitions.attribute_group> @Size(value=2) [] dev_attr_groups;
        public boolean allocated;
        public Ptr<powercap_zone_constraint> constraints;
    }

    @Type(noCCodeGeneration=true, cType="struct powercap_zone_ops")
    @NotUsableInJava
    public static class powercap_zone_ops
    extends Struct {
        public Ptr<?> get_max_energy_range_uj;
        public Ptr<?> get_energy_uj;
        public Ptr<?> reset_energy_uj;
        public Ptr<?> get_max_power_range_uw;
        public Ptr<?> get_power_uw;
        public Ptr<?> set_enable;
        public Ptr<?> get_enable;
        public Ptr<?> release;
    }

    @Type(noCCodeGeneration=true, cType="struct powercap_control_type")
    @NotUsableInJava
    public static class powercap_control_type
    extends Struct {
        public runtime.device dev;
        public runtime.idr idr;
        public int nr_zones;
        public Ptr<powercap_control_type_ops> ops;
        public runtime.mutex lock;
        public boolean allocated;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct powercap_control_type_ops")
    @NotUsableInJava
    public static class powercap_control_type_ops
    extends Struct {
        public Ptr<?> set_enable;
        public Ptr<?> get_enable;
        public Ptr<?> release;
    }
}

