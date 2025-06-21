/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DevlinkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class DevlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_dpipe_headers_register(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_dpipe_headers> dpipe_headers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_dpipe_headers_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_dpipe_table_register($arg1, (const u8*)$arg2, (const struct devlink_dpipe_table_ops*)$arg3, $arg4, $arg5)")
    public static int devl_dpipe_table_register(Ptr<runtime.devlink> devlink2, String table_name, Ptr<DevlinkDefinitions.devlink_dpipe_table_ops> table_ops, Ptr<?> priv, boolean counter_control_extern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_dpipe_table_resource_set($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int devl_dpipe_table_resource_set(Ptr<runtime.devlink> devlink2, String table_name, @Unsigned long resource_id, @Unsigned long resource_units) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_dpipe_table_unregister($arg1, (const u8*)$arg2)")
    public static void devl_dpipe_table_unregister(Ptr<runtime.devlink> devlink2, String table_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_health_reporter_create($arg1, (const struct devlink_health_reporter_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<DevlinkDefinitions.devlink_health_reporter> devl_health_reporter_create(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_health_reporter_ops> ops, @Unsigned long graceful_period, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_health_reporter_destroy(Ptr<DevlinkDefinitions.devlink_health_reporter> reporter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_linecard_create($arg1, $arg2, (const struct devlink_linecard_ops*)$arg3, $arg4)")
    public static Ptr<DevlinkDefinitions.devlink_linecard> devl_linecard_create(Ptr<runtime.devlink> devlink2, @Unsigned int linecard_index, Ptr<DevlinkDefinitions.devlink_linecard_ops> ops, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_linecard_destroy(Ptr<DevlinkDefinitions.devlink_linecard> linecard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devl_nested_devlink_set(Ptr<runtime.devlink> devlink2, Ptr<runtime.devlink> nested_devlink) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_port_health_reporter_create($arg1, (const struct devlink_health_reporter_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<DevlinkDefinitions.devlink_health_reporter> devl_port_health_reporter_create(Ptr<DevlinkDefinitions.devlink_port> port2, Ptr<DevlinkDefinitions.devlink_health_reporter_ops> ops, @Unsigned long graceful_period, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devl_param_driverinit_value_get(Ptr<runtime.devlink> devlink2, @Unsigned int param_id, Ptr<DevlinkDefinitions.devlink_param_value> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_param_driverinit_value_set(Ptr<runtime.devlink> devlink2, @Unsigned int param_id, DevlinkDefinitions.devlink_param_value init_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_param_value_changed(Ptr<runtime.devlink> devlink2, @Unsigned int param_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_params_register($arg1, (const struct devlink_param*)$arg2, $arg3)")
    public static int devl_params_register(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_param> params, @Unsigned long params_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_params_unregister($arg1, (const struct devlink_param*)$arg2, $arg3)")
    public static void devl_params_unregister(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_param> params, @Unsigned long params_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devl_rate_leaf_create(Ptr<DevlinkDefinitions.devlink_port> devlink_port2, Ptr<?> priv, Ptr<DevlinkDefinitions.devlink_rate> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_rate_leaf_destroy(Ptr<DevlinkDefinitions.devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevlinkDefinitions.devlink_rate> devl_rate_node_create(Ptr<runtime.devlink> devlink2, Ptr<?> priv, String node_name, Ptr<DevlinkDefinitions.devlink_rate> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_rate_nodes_destroy(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devl_sb_register(Ptr<runtime.devlink> devlink2, @Unsigned int sb_index, @Unsigned int size, @Unsigned short ingress_pools_count, @Unsigned short egress_pools_count, @Unsigned short ingress_tc_count, @Unsigned short egress_tc_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_sb_unregister(Ptr<runtime.devlink> devlink2, @Unsigned int sb_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devl_port_fn_devlink_set(Ptr<DevlinkDefinitions.devlink_port> devlink_port2, Ptr<runtime.devlink> fn_devlink) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_port_register_with_ops($arg1, $arg2, $arg3, (const struct devlink_port_ops*)$arg4)")
    public static int devl_port_register_with_ops(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_port> devlink_port2, @Unsigned int port_index, Ptr<DevlinkDefinitions.devlink_port_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_port_unregister(Ptr<DevlinkDefinitions.devlink_port> devlink_port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_resource_occ_get_register(Ptr<runtime.devlink> devlink2, @Unsigned long resource_id, Ptr<?> occ_get, Ptr<?> occ_get_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_resource_occ_get_unregister(Ptr<runtime.devlink> devlink2, @Unsigned long resource_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_resource_register($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, (const struct devlink_resource_size_params*)$arg6)")
    public static int devl_resource_register(Ptr<runtime.devlink> devlink2, String resource_name, @Unsigned long resource_size, @Unsigned long resource_id, @Unsigned long parent_resource_id, Ptr<DevlinkDefinitions.devlink_resource_size_params> size_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devl_resource_size_get(Ptr<runtime.devlink> devlink2, @Unsigned long resource_id, Ptr<@Unsigned Long> p_resource_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_resources_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_trap_groups_register($arg1, (const struct devlink_trap_group*)$arg2, $arg3)")
    public static int devl_trap_groups_register(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_trap_group> groups, @Unsigned long groups_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_trap_groups_unregister($arg1, (const struct devlink_trap_group*)$arg2, $arg3)")
    public static void devl_trap_groups_unregister(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_trap_group> groups, @Unsigned long groups_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_trap_policers_register($arg1, (const struct devlink_trap_policer*)$arg2, $arg3)")
    public static int devl_trap_policers_register(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_trap_policer> policers, @Unsigned long policers_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_trap_policers_unregister($arg1, (const struct devlink_trap_policer*)$arg2, $arg3)")
    public static void devl_trap_policers_unregister(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_trap_policer> policers, @Unsigned long policers_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_traps_register($arg1, (const struct devlink_trap*)$arg2, $arg3, $arg4)")
    public static int devl_traps_register(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_trap> traps, @Unsigned long traps_count, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_traps_unregister($arg1, (const struct devlink_trap*)$arg2, $arg3)")
    public static void devl_traps_unregister(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_trap> traps, @Unsigned long traps_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_assert_locked(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_lock(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devl_region_create($arg1, (const struct devlink_region_ops*)$arg2, $arg3, $arg4)")
    public static Ptr<DevlinkDefinitions.devlink_region> devl_region_create(Ptr<runtime.devlink> devlink2, Ptr<DevlinkDefinitions.devlink_region_ops> ops, @Unsigned int region_max_snapshots, @Unsigned long region_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_region_destroy(Ptr<DevlinkDefinitions.devlink_region> region2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devl_register(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devl_trylock(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_unlock(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devl_unregister(Ptr<runtime.devlink> devlink2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

