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
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IccDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class OppDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _opp_add(Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_pm_opp> new_opp, Ptr<opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _opp_add_v1(Ptr<opp_table> opp_table2, Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_pm_opp_data> data, boolean dynamic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevDefinitions.dev_pm_opp> _opp_allocate(Ptr<opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_opp_attach_genpd($arg1, $arg2, (const u8**)$arg3, $arg4)")
    public static int _opp_attach_genpd(Ptr<opp_table> opp_table2, Ptr<runtime.device> dev, Ptr<String> names, Ptr<Ptr<Ptr<runtime.device>>> virt_devs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _opp_clear_config(Ptr<opp_config_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _opp_compare_key(Ptr<opp_table> opp_table2, Ptr<DevDefinitions.dev_pm_opp> opp1, Ptr<DevDefinitions.dev_pm_opp> opp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _opp_config_clk_single(Ptr<runtime.device> dev, Ptr<opp_table> opp_table2, Ptr<DevDefinitions.dev_pm_opp> opp, Ptr<?> data, boolean scaling_down) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _opp_config_regulator_single(Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_pm_opp> old_opp, Ptr<DevDefinitions.dev_pm_opp> new_opp, Ptr<Ptr<runtime.regulator>> regulators, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _opp_free(Ptr<DevDefinitions.dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _opp_kref_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _opp_remove_all(Ptr<opp_table> opp_table2, boolean dynamic) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean _opp_remove_all_static(Ptr<opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _opp_set_availability(Ptr<runtime.device> dev, @Unsigned long freq, boolean availability_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_opp_table_find_key($arg1, $arg2, $arg3, $arg4, (long unsigned int (*)(struct dev_pm_opp*, int))$arg5, (_Bool (*)(struct dev_pm_opp**, struct dev_pm_opp*, long unsigned int, long unsigned int))$arg6, (_Bool (*)(struct opp_table*))$arg7)")
    public static Ptr<DevDefinitions.dev_pm_opp> _opp_table_find_key(Ptr<opp_table> opp_table2, Ptr<@Unsigned Long> key2, int index2, boolean available, Ptr<?> read2, Ptr<?> compare, Ptr<?> _assert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _opp_table_kref_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void opp_debug_create_one(Ptr<DevDefinitions.dev_pm_opp> opp, Ptr<opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int opp_debug_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void opp_debug_register(Ptr<opp_device> opp_dev, Ptr<opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void opp_debug_remove_one(Ptr<DevDefinitions.dev_pm_opp> opp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void opp_debug_unregister(Ptr<opp_device> opp_dev, Ptr<opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void opp_list_debug_create_link(Ptr<opp_device> opp_dev, Ptr<opp_table> opp_table2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="opp_set_dev_name((const struct device*)$arg1, $arg2)")
    public static void opp_set_dev_name(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct opp_config_data")
    @NotUsableInJava
    public static class opp_config_data
    extends Struct {
        public Ptr<opp_table> opp_table;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum opp_table_access")
    public static enum opp_table_access implements Enum<opp_table_access>,
    TypedEnum<opp_table_access, Integer>
    {
        OPP_TABLE_ACCESS_UNKNOWN,
        OPP_TABLE_ACCESS_EXCLUSIVE,
        OPP_TABLE_ACCESS_SHARED;

    }

    @Type(noCCodeGeneration=true, cType="struct opp_device")
    @NotUsableInJava
    public static class opp_device
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<runtime.device> dev;
        public Ptr<runtime.dentry> dentry;
    }

    @Type(noCCodeGeneration=true, cType="struct opp_table")
    @NotUsableInJava
    public static class opp_table
    extends Struct {
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head lazy;
        public misc.blocking_notifier_head head;
        public ListDefinitions.list_head dev_list;
        public ListDefinitions.list_head opp_list;
        public runtime.kref kref;
        public runtime.mutex lock;
        public Ptr<DeviceDefinitions.device_node> np;
        public @Unsigned long clock_latency_ns_max;
        public @Unsigned int voltage_tolerance_v1;
        public @Unsigned int parsed_static_opps;
        public opp_table_access shared_opp;
        public @Unsigned long current_rate_single_clk;
        public Ptr<DevDefinitions.dev_pm_opp> current_opp;
        public Ptr<DevDefinitions.dev_pm_opp> suspend_opp;
        public Ptr<Ptr<opp_table>> required_opp_tables;
        public Ptr<Ptr<runtime.device>> required_devs;
        public @Unsigned int required_opp_count;
        public Ptr<@Unsigned Integer> supported_hw;
        public @Unsigned int supported_hw_count;
        public String prop_name;
        public @OriginalName(value="config_clks_t") Ptr<?> config_clks;
        public Ptr<Ptr<runtime.clk>> clks;
        public Ptr<runtime.clk> clk;
        public int clk_count;
        public @OriginalName(value="config_regulators_t") Ptr<?> config_regulators;
        public Ptr<Ptr<runtime.regulator>> regulators;
        public int regulator_count;
        public Ptr<Ptr<IccDefinitions.icc_path>> paths;
        public @Unsigned int path_count;
        public boolean enabled;
        public boolean is_genpd;
        public Ptr<runtime.dentry> dentry;
        public char @Size(value=255) [] dentry_name;
    }
}

