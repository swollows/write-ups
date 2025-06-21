/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PinDefinitions;
import me.bechberger.ebpf.runtime.PinconfDefinitions;
import me.bechberger.ebpf.runtime.PinmuxDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PinctrlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_bind_pins(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_utils_add_config(Ptr<pinctrl_dev> pctldev, Ptr<Ptr<@Unsigned Long>> configs, Ptr<@Unsigned Integer> num_configs, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_utils_add_map_configs($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6, $arg7, $arg8)")
    public static int pinctrl_utils_add_map_configs(Ptr<pinctrl_dev> pctldev, Ptr<Ptr<pinctrl_map>> map2, Ptr<@Unsigned Integer> reserved_maps, Ptr<@Unsigned Integer> num_maps, String group, Ptr<@Unsigned Long> configs, @Unsigned int num_configs, pinctrl_map_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_utils_add_map_mux($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, (const u8*)$arg6)")
    public static int pinctrl_utils_add_map_mux(Ptr<pinctrl_dev> pctldev, Ptr<Ptr<pinctrl_map>> map2, Ptr<@Unsigned Integer> reserved_maps, Ptr<@Unsigned Integer> num_maps, String group, String function) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_utils_free_map(Ptr<pinctrl_dev> pctldev, Ptr<pinctrl_map> map2, @Unsigned int num_maps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_utils_reserve_map(Ptr<pinctrl_dev> pctldev, Ptr<Ptr<pinctrl_map>> map2, Ptr<@Unsigned Integer> reserved_maps, Ptr<@Unsigned Integer> num_maps, @Unsigned int reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_add_gpio_range(Ptr<pinctrl_dev> pctldev, Ptr<pinctrl_gpio_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_add_gpio_ranges(Ptr<pinctrl_dev> pctldev, Ptr<pinctrl_gpio_range> ranges, @Unsigned int nranges) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_claim_hogs(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_commit_state(Ptr<runtime.pinctrl> p, Ptr<pinctrl_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pinctrl_dev_get_devname($arg1))")
    public static String pinctrl_dev_get_devname(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pinctrl_dev_get_drvdata(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)pinctrl_dev_get_name($arg1))")
    public static String pinctrl_dev_get_name(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_devices_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_devices_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_enable(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_find_and_add_gpio_range((const u8*)$arg1, $arg2)")
    public static Ptr<pinctrl_dev> pinctrl_find_and_add_gpio_range(String devname, Ptr<pinctrl_gpio_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pinctrl_gpio_range> pinctrl_find_gpio_range_from_pin(Ptr<pinctrl_dev> pctldev, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pinctrl_gpio_range> pinctrl_find_gpio_range_from_pin_nolock(Ptr<pinctrl_dev> pctldev, @Unsigned int pin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_force_default(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_force_sleep(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_free(Ptr<runtime.pinctrl> p, boolean inlist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_free_pindescs($arg1, (const struct pinctrl_pin_desc*)$arg2, $arg3)")
    public static void pinctrl_free_pindescs(Ptr<pinctrl_dev> pctldev, Ptr<pinctrl_pin_desc> pins, @Unsigned int num_pins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pinctrl> pinctrl_get(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_get_device_gpio_range(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, Ptr<Ptr<pinctrl_dev>> outdev, Ptr<Ptr<pinctrl_gpio_range>> outrange) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_get_group_pins($arg1, (const u8*)$arg2, (const unsigned int**)$arg3, $arg4)")
    public static int pinctrl_get_group_pins(Ptr<pinctrl_dev> pctldev, String pin_group, Ptr<Ptr<@Unsigned Integer>> pins, Ptr<@Unsigned Integer> num_pins) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_get_group_selector($arg1, (const u8*)$arg2)")
    public static int pinctrl_get_group_selector(Ptr<pinctrl_dev> pctldev, String pin_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean pinctrl_gpio_can_use_line(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_gpio_direction(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, boolean input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_gpio_direction_input(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_gpio_direction_output(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_gpio_free(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_gpio_request(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_gpio_set_config(Ptr<GpioDefinitions.gpio_chip> gc, @Unsigned int offset, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_gpioranges_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_gpioranges_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_groups_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_groups_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pinctrl_dev> pinctrl_init_controller(Ptr<pinctrl_desc> pctldesc, Ptr<runtime.device> dev, Ptr<?> driver_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_init_device_debugfs(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_init_done(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_lookup_state($arg1, (const u8*)$arg2)")
    public static Ptr<pinctrl_state> pinctrl_lookup_state(Ptr<runtime.pinctrl> p, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_maps_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_maps_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_pins_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_pins_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_pm_select_default_state(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_pm_select_idle_state(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_pm_select_sleep_state(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_provide_dummies() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_put(Ptr<runtime.pinctrl> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pinctrl_dev> pinctrl_register(Ptr<pinctrl_desc> pctldesc, Ptr<runtime.device> dev, Ptr<?> driver_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_register_and_init(Ptr<pinctrl_desc> pctldesc, Ptr<runtime.device> dev, Ptr<?> driver_data, Ptr<Ptr<pinctrl_dev>> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_register_mappings((const struct pinctrl_map*)$arg1, $arg2)")
    public static int pinctrl_register_mappings(Ptr<pinctrl_map> maps, @Unsigned int num_maps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_register_pins($arg1, (const struct pinctrl_pin_desc*)$arg2, $arg3)")
    public static int pinctrl_register_pins(Ptr<pinctrl_dev> pctldev, Ptr<pinctrl_pin_desc> pins, @Unsigned int num_descs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_remove_gpio_range(Ptr<pinctrl_dev> pctldev, Ptr<pinctrl_gpio_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_select_default_state(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_select_state(Ptr<runtime.pinctrl> p, Ptr<pinctrl_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pinctrl_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> what) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pinctrl_unregister(Ptr<pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pinctrl_unregister_mappings((const struct pinctrl_map*)$arg1)")
    public static void pinctrl_unregister_mappings(Ptr<pinctrl_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_maps")
    @NotUsableInJava
    public static class pinctrl_maps
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<pinctrl_map> maps;
        public @Unsigned int num_maps;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_setting")
    @NotUsableInJava
    public static class pinctrl_setting
    extends Struct {
        public ListDefinitions.list_head node;
        public pinctrl_map_type type;
        public Ptr<pinctrl_dev> pctldev;
        public String dev_name;
        public DataDefinitions.data_of_pinctrl_setting data;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_setting_configs")
    @NotUsableInJava
    public static class pinctrl_setting_configs
    extends Struct {
        public @Unsigned int group_or_pin;
        public Ptr<@Unsigned Long> configs;
        public @Unsigned int num_configs;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_setting_mux")
    @NotUsableInJava
    public static class pinctrl_setting_mux
    extends Struct {
        public @Unsigned int group;
        public @Unsigned int func;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_state")
    @NotUsableInJava
    public static class pinctrl_state
    extends Struct {
        public ListDefinitions.list_head node;
        public String name;
        public ListDefinitions.list_head settings;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_desc")
    @NotUsableInJava
    public static class pinctrl_desc
    extends Struct {
        public String name;
        public Ptr<pinctrl_pin_desc> pins;
        public @Unsigned int npins;
        public Ptr<pinctrl_ops> pctlops;
        public Ptr<PinmuxDefinitions.pinmux_ops> pmxops;
        public Ptr<PinconfDefinitions.pinconf_ops> confops;
        public Ptr<runtime.module> owner;
        public @Unsigned int num_custom_params;
        public Ptr<PinconfDefinitions.pinconf_generic_params> custom_params;
        public Ptr<PinDefinitions.pin_config_item> custom_conf_items;
        public boolean link_consumers;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_dev")
    @NotUsableInJava
    public static class pinctrl_dev
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<pinctrl_desc> desc;
        public runtime.xarray pin_desc_tree;
        public ListDefinitions.list_head gpio_ranges;
        public Ptr<runtime.device> dev;
        public Ptr<runtime.module> owner;
        public Ptr<?> driver_data;
        public Ptr<runtime.pinctrl> p;
        public Ptr<pinctrl_state> hog_default;
        public Ptr<pinctrl_state> hog_sleep;
        public runtime.mutex mutex;
        public Ptr<runtime.dentry> device_root;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_ops")
    @NotUsableInJava
    public static class pinctrl_ops
    extends Struct {
        public Ptr<?> get_groups_count;
        public Ptr<?> get_group_name;
        public Ptr<?> get_group_pins;
        public Ptr<?> pin_dbg_show;
        public Ptr<?> dt_node_to_map;
        public Ptr<?> dt_free_map;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_gpio_range")
    @NotUsableInJava
    public static class pinctrl_gpio_range
    extends Struct {
        public ListDefinitions.list_head node;
        public String name;
        public @Unsigned int id;
        public @Unsigned int base;
        public @Unsigned int pin_base;
        public @Unsigned int npins;
        public Ptr<@Unsigned Integer> pins;
        public Ptr<GpioDefinitions.gpio_chip> gc;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_pin_desc")
    @NotUsableInJava
    public static class pinctrl_pin_desc
    extends Struct {
        public @Unsigned int number;
        public String name;
        public Ptr<?> drv_data;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_map")
    @NotUsableInJava
    public static class pinctrl_map
    extends Struct {
        public String dev_name;
        public String name;
        public pinctrl_map_type type;
        public String ctrl_dev_name;
        public DataDefinitions.data_of_pinctrl_map data;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_map_configs")
    @NotUsableInJava
    public static class pinctrl_map_configs
    extends Struct {
        public String group_or_pin;
        public Ptr<@Unsigned Long> configs;
        public @Unsigned int num_configs;
    }

    @Type(noCCodeGeneration=true, cType="struct pinctrl_map_mux")
    @NotUsableInJava
    public static class pinctrl_map_mux
    extends Struct {
        public String group;
        public String function;
    }

    @Type(noCCodeGeneration=true, cType="enum pinctrl_map_type")
    public static enum pinctrl_map_type implements Enum<pinctrl_map_type>,
    TypedEnum<pinctrl_map_type, Integer>
    {
        PIN_MAP_TYPE_INVALID,
        PIN_MAP_TYPE_DUMMY_STATE,
        PIN_MAP_TYPE_MUX_GROUP,
        PIN_MAP_TYPE_CONFIGS_PIN,
        PIN_MAP_TYPE_CONFIGS_GROUP;

    }
}

