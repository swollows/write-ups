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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.LinearDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RegulatorDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_dummy_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_irq_helper($arg1, (const struct regulator_irq_desc*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<?> regulator_irq_helper(Ptr<runtime.device> dev, Ptr<regulator_irq_desc> d, int irq, int irq_flags, int common_errs, Ptr<Integer> per_rdev_errs, Ptr<Ptr<regulator_dev>> rdev, int rdev_amount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_irq_helper_cancel(Ptr<Ptr<?>> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_irq_map_event_simple(int irq, Ptr<regulator_irq_data> rid, Ptr<@Unsigned Long> dev_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn regulator_notifier_isr(int irq, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_notifier_isr_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_bulk_set_supply_names($arg1, (const u8**)$arg2, $arg3)")
    public static void regulator_bulk_set_supply_names(Ptr<regulator_bulk_data> consumers, Ptr<String> supply_names, @Unsigned int num_supplies) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_desc_list_voltage_linear((const struct regulator_desc*)$arg1, $arg2)")
    public static int regulator_desc_list_voltage_linear(Ptr<regulator_desc> desc, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_desc_list_voltage_linear_range((const struct regulator_desc*)$arg1, $arg2)")
    public static int regulator_desc_list_voltage_linear_range(Ptr<regulator_desc> desc, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_disable_regmap(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_enable_regmap(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_find_closest_bigger($arg1, (const unsigned int*)$arg2, $arg3, $arg4)")
    public static int regulator_find_closest_bigger(@Unsigned int target, Ptr<@Unsigned Integer> table, @Unsigned int num_sel, Ptr<@Unsigned Integer> sel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_bypass_regmap(Ptr<regulator_dev> rdev, Ptr<@OriginalName(value="bool") Boolean> enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_current_limit_regmap(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_voltage_sel_pickable_regmap(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_voltage_sel_regmap(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_is_enabled_regmap(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regulator_is_equal(Ptr<runtime.regulator> reg1, Ptr<runtime.regulator> reg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_list_voltage_linear(Ptr<regulator_dev> rdev, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_list_voltage_linear_range(Ptr<regulator_dev> rdev, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_list_voltage_pickable_linear_range(Ptr<regulator_dev> rdev, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_list_voltage_table(Ptr<regulator_dev> rdev, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_map_voltage_ascend(Ptr<regulator_dev> rdev, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_map_voltage_iterate(Ptr<regulator_dev> rdev, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_map_voltage_linear(Ptr<regulator_dev> rdev, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_map_voltage_linear_range(Ptr<regulator_dev> rdev, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_map_voltage_pickable_linear_range(Ptr<regulator_dev> rdev, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_active_discharge_regmap(Ptr<regulator_dev> rdev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_bypass_regmap(Ptr<regulator_dev> rdev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_current_limit_regmap(Ptr<regulator_dev> rdev, int min_uA, int max_uA) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_pull_down_regmap(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_ramp_delay_regmap(Ptr<regulator_dev> rdev, int ramp_delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_soft_start_regmap(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_voltage_sel_pickable_regmap(Ptr<regulator_dev> rdev, @Unsigned int sel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_voltage_sel_regmap(Ptr<regulator_dev> rdev, @Unsigned int sel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_action_disable(Ptr<?> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_fixed_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_irq_helper_drop(Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_register_always_on($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<PlatformDefinitions.platform_device> regulator_register_always_on(int id, String name, Ptr<regulator_consumer_supply> supplies, int num_supplies, int uv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_bulk_get(Ptr<runtime.device> dev, int num_consumers, Ptr<regulator_bulk_data> consumers, regulator_get_type get_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_call_set_voltage_sel(Ptr<regulator_dev> rdev, int uV, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _regulator_delay_helper(@Unsigned int delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_disable(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_do_disable(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_do_enable(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_do_set_voltage(Ptr<regulator_dev> rdev, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_enable(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_regulator_get($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.regulator> _regulator_get(Ptr<runtime.device> dev, String id, regulator_get_type get_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_regulator_get_common($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<runtime.regulator> _regulator_get_common(Ptr<regulator_dev> rdev, Ptr<runtime.device> dev, String id, regulator_get_type get_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_regulator_get_common_check($arg1, (const u8*)$arg2, $arg3)")
    public static int _regulator_get_common_check(Ptr<runtime.device> dev, String id, regulator_get_type get_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_get_error_flags(Ptr<regulator_dev> rdev, Ptr<@Unsigned Integer> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_handle_consumer_disable(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regulator_list_voltage(Ptr<regulator_dev> rdev, @Unsigned int selector, int lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_allow_bypass(Ptr<runtime.regulator> regulator2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short regulator_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_balance_voltage(Ptr<regulator_dev> rdev, @OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_bulk_disable(int num_consumers, Ptr<regulator_bulk_data> consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_bulk_enable(int num_consumers, Ptr<regulator_bulk_data> consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_bulk_enable_async(Ptr<?> data, @Unsigned @OriginalName(value="async_cookie_t") long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_bulk_force_disable(int num_consumers, Ptr<regulator_bulk_data> consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_bulk_free(int num_consumers, Ptr<regulator_bulk_data> consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_bulk_get(Ptr<runtime.device> dev, int num_consumers, Ptr<regulator_bulk_data> consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_bulk_register_supply_alias($arg1, (const u8**)$arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static int regulator_bulk_register_supply_alias(Ptr<runtime.device> dev, Ptr<String> id, Ptr<runtime.device> alias_dev, Ptr<String> alias_id, int num_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_bulk_unregister_supply_alias($arg1, (const u8**)$arg2, $arg3)")
    public static void regulator_bulk_unregister_supply_alias(Ptr<runtime.device> dev, Ptr<String> id, int num_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_check_consumers(Ptr<regulator_dev> rdev, Ptr<Integer> min_uV, Ptr<Integer> max_uV, @OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_check_voltage(Ptr<regulator_dev> rdev, Ptr<Integer> min_uV, Ptr<Integer> max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_count_voltages(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_coupler_register(Ptr<regulator_coupler> coupler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_dev_lookup($arg1, (const u8*)$arg2)")
    public static Ptr<regulator_dev> regulator_dev_lookup(Ptr<runtime.device> dev, String supply) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_disable(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_disable_deferred(Ptr<runtime.regulator> regulator2, int ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_disable_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_do_balance_voltage(Ptr<regulator_dev> rdev, @OriginalName(value="suspend_state_t") int state2, boolean skip_coupled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_ena_gpio_free(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_enable(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_force_disable(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_get($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.regulator> regulator_get(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_current_limit(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> regulator_get_drvdata(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_error_flags(Ptr<runtime.regulator> regulator2, Ptr<@Unsigned Integer> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_get_exclusive($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.regulator> regulator_get_exclusive(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_hardware_vsel_register(Ptr<runtime.regulator> regulator2, Ptr<@Unsigned Integer> vsel_reg, Ptr<@Unsigned Integer> vsel_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> regulator_get_init_drvdata(Ptr<regulator_init_data> reg_init_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regulator_get_linear_step(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regulator_get_mode(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_optimal_voltage(Ptr<regulator_dev> rdev, Ptr<Integer> current_uV, Ptr<Integer> min_uV, Ptr<Integer> max_uV, @OriginalName(value="suspend_state_t") int state2, int n_coupled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_get_optional($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.regulator> regulator_get_optional(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.regmap> regulator_get_regmap(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct regulator_state*)regulator_get_suspend_state_check($arg1, $arg2))")
    public static Ptr<regulator_state> regulator_get_suspend_state_check(Ptr<regulator_dev> rdev, @OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_voltage(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_get_voltage_rdev(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_hardware_enable(Ptr<runtime.regulator> regulator2, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_has_full_constraints() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_ignore_unused_setup(String __unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_init_complete() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_init_complete_work_function(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_is_enabled(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_is_supported_voltage(Ptr<runtime.regulator> regulator2, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_late_cleanup(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_list_hardware_vsel(Ptr<runtime.regulator> regulator2, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_list_voltage(Ptr<runtime.regulator> regulator2, @Unsigned int selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_lock_dependent(Ptr<regulator_dev> rdev, Ptr<misc.ww_acquire_ctx> ww_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_lock_recursive(Ptr<regulator_dev> rdev, Ptr<Ptr<regulator_dev>> new_contended_rdev, Ptr<Ptr<regulator_dev>> old_contended_rdev, Ptr<misc.ww_acquire_ctx> ww_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_map_voltage(Ptr<regulator_dev> rdev, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_match($arg1, (const void*)$arg2)")
    public static int regulator_match(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_mode_constrain(Ptr<regulator_dev> rdev, Ptr<@Unsigned Integer> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_mode_to_status(@Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_notifier_call_chain(Ptr<regulator_dev> rdev, @Unsigned long event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_put(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_register($arg1, (const struct regulator_desc*)$arg2, (const struct regulator_config*)$arg3)")
    public static Ptr<regulator_dev> regulator_register(Ptr<runtime.device> dev, Ptr<regulator_desc> regulator_desc2, Ptr<regulator_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_register_notifier(Ptr<runtime.regulator> regulator2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_register_resolve_supply(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_register_supply_alias($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4)")
    public static int regulator_register_supply_alias(Ptr<runtime.device> dev, String id, Ptr<runtime.device> alias_dev, String alias_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_remove_coupling(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_resolve_supply(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_current_limit(Ptr<runtime.regulator> regulator2, int min_uA, int max_uA) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_set_drvdata(Ptr<runtime.regulator> regulator2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_load(Ptr<runtime.regulator> regulator2, int uA_load) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_mode(Ptr<runtime.regulator> regulator2, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_suspend_voltage(Ptr<runtime.regulator> regulator2, int min_uV, int max_uV, @OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_voltage(Ptr<runtime.regulator> regulator2, int min_uV, int max_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_voltage_rdev(Ptr<regulator_dev> rdev, int min_uV, int max_uV, @OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_voltage_time(Ptr<runtime.regulator> regulator2, int old_uV, int new_uV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_voltage_time_sel(Ptr<regulator_dev> rdev, @Unsigned int old_selector, @Unsigned int new_selector) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_set_voltage_unlocked(Ptr<runtime.regulator> regulator2, int min_uV, int max_uV, @OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_summary_lock_one(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_summary_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_summary_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_summary_show_children(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_summary_show_roots(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_summary_show_subtree(Ptr<SeqDefinitions.seq_file> s2, Ptr<regulator_dev> rdev, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_summary_unlock_one(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_suspend_disable(Ptr<regulator_dev> rdev, @OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_suspend_enable(Ptr<regulator_dev> rdev, @OriginalName(value="suspend_state_t") int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_sync_voltage(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_sync_voltage_rdev(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_unlock_recursive(Ptr<regulator_dev> rdev, @Unsigned int n_coupled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regulator_unregister(Ptr<regulator_dev> rdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regulator_unregister_notifier(Ptr<runtime.regulator> regulator2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regulator_unregister_supply_alias($arg1, (const u8*)$arg2)")
    public static void regulator_unregister_supply_alias(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_notifier_match")
    @NotUsableInJava
    public static class regulator_notifier_match
    extends Struct {
        public Ptr<runtime.regulator> regulator;
        public Ptr<misc.notifier_block> nb;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_supply_alias_match")
    @NotUsableInJava
    public static class regulator_supply_alias_match
    extends Struct {
        public Ptr<runtime.device> dev;
        public String id;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_bulk_devres")
    @NotUsableInJava
    public static class regulator_bulk_devres
    extends Struct {
        public Ptr<regulator_bulk_data> consumers;
        public int num_consumers;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_irq")
    @NotUsableInJava
    public static class regulator_irq
    extends Struct {
        public regulator_irq_data rdata;
        public regulator_irq_desc desc;
        public int irq;
        public int retry_cnt;
        public DelayedDefinitions.delayed_work isr_work;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_irq_desc")
    @NotUsableInJava
    public static class regulator_irq_desc
    extends Struct {
        public String name;
        public int fatal_cnt;
        public int reread_ms;
        public int irq_off_ms;
        public boolean skip_off;
        public boolean high_prio;
        public Ptr<?> data;
        public Ptr<?> die;
        public Ptr<?> map_event;
        public Ptr<?> renable;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_irq_data")
    @NotUsableInJava
    public static class regulator_irq_data
    extends Struct {
        public Ptr<regulator_err_state> states;
        public int num_states;
        public Ptr<?> data;
        public long opaque;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_err_state")
    @NotUsableInJava
    public static class regulator_err_state
    extends Struct {
        public Ptr<regulator_dev> rdev;
        public @Unsigned long notifs;
        public @Unsigned long errors;
        public int possible_errs;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_supply_alias")
    @NotUsableInJava
    public static class regulator_supply_alias
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.device> src_dev;
        public String src_supply;
        public Ptr<runtime.device> alias_dev;
        public String alias_supply;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_map")
    @NotUsableInJava
    public static class regulator_map
    extends Struct {
        public ListDefinitions.list_head list;
        public String dev_name;
        public String supply;
        public Ptr<regulator_dev> regulator;
    }

    @Type(noCCodeGeneration=true, cType="enum regulator_get_type")
    public static enum regulator_get_type implements Enum<regulator_get_type>,
    TypedEnum<regulator_get_type, Integer>
    {
        NORMAL_GET,
        EXCLUSIVE_GET,
        OPTIONAL_GET,
        MAX_GET_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct regulator_voltage")
    @NotUsableInJava
    public static class regulator_voltage
    extends Struct {
        public int min_uV;
        public int max_uV;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_consumer_supply")
    @NotUsableInJava
    public static class regulator_consumer_supply
    extends Struct {
        public String dev_name;
        public String supply;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_state")
    @NotUsableInJava
    public static class regulator_state
    extends Struct {
        public int uV;
        public int min_uV;
        public int max_uV;
        public @Unsigned int mode;
        public int enabled;
        public boolean changeable;
    }

    @Type(noCCodeGeneration=true, cType="enum regulator_active_discharge")
    public static enum regulator_active_discharge implements Enum<regulator_active_discharge>,
    TypedEnum<regulator_active_discharge, Integer>
    {
        REGULATOR_ACTIVE_DISCHARGE_DEFAULT,
        REGULATOR_ACTIVE_DISCHARGE_DISABLE,
        REGULATOR_ACTIVE_DISCHARGE_ENABLE;

    }

    @Type(noCCodeGeneration=true, cType="struct regulator_enable_gpio")
    @NotUsableInJava
    public static class regulator_enable_gpio
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<GpioDefinitions.gpio_desc> gpiod;
        public @Unsigned int enable_count;
        public @Unsigned int request_count;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_config")
    @NotUsableInJava
    public static class regulator_config
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<regulator_init_data> init_data;
        public Ptr<?> driver_data;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public Ptr<runtime.regmap> regmap;
        public Ptr<GpioDefinitions.gpio_desc> ena_gpiod;
    }

    @Type(noCCodeGeneration=true, cType="enum regulator_type")
    public static enum regulator_type implements Enum<regulator_type>,
    TypedEnum<regulator_type, Integer>
    {
        REGULATOR_VOLTAGE,
        REGULATOR_CURRENT;

    }

    @Type(noCCodeGeneration=true, cType="struct regulator_ops")
    @NotUsableInJava
    public static class regulator_ops
    extends Struct {
        public Ptr<?> list_voltage;
        public Ptr<?> set_voltage;
        public Ptr<?> map_voltage;
        public Ptr<?> set_voltage_sel;
        public Ptr<?> get_voltage;
        public Ptr<?> get_voltage_sel;
        public Ptr<?> set_current_limit;
        public Ptr<?> get_current_limit;
        public Ptr<?> set_input_current_limit;
        public Ptr<?> set_over_current_protection;
        public Ptr<?> set_over_voltage_protection;
        public Ptr<?> set_under_voltage_protection;
        public Ptr<?> set_thermal_protection;
        public Ptr<?> set_active_discharge;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> is_enabled;
        public Ptr<?> set_mode;
        public Ptr<?> get_mode;
        public Ptr<?> get_error_flags;
        public Ptr<?> enable_time;
        public Ptr<?> set_ramp_delay;
        public Ptr<?> set_voltage_time;
        public Ptr<?> set_voltage_time_sel;
        public Ptr<?> set_soft_start;
        public Ptr<?> get_status;
        public Ptr<?> get_optimum_mode;
        public Ptr<?> set_load;
        public Ptr<?> set_bypass;
        public Ptr<?> get_bypass;
        public Ptr<?> set_suspend_voltage;
        public Ptr<?> set_suspend_enable;
        public Ptr<?> set_suspend_disable;
        public Ptr<?> set_suspend_mode;
        public Ptr<?> resume;
        public Ptr<?> set_pull_down;
    }

    @Type(noCCodeGeneration=true, cType="enum regulator_detection_severity")
    public static enum regulator_detection_severity implements Enum<regulator_detection_severity>,
    TypedEnum<regulator_detection_severity, Integer>
    {
        REGULATOR_SEVERITY_PROT,
        REGULATOR_SEVERITY_ERR,
        REGULATOR_SEVERITY_WARN;

    }

    @Type(noCCodeGeneration=true, cType="enum regulator_status")
    public static enum regulator_status implements Enum<regulator_status>,
    TypedEnum<regulator_status, Integer>
    {
        REGULATOR_STATUS_OFF,
        REGULATOR_STATUS_ON,
        REGULATOR_STATUS_ERROR,
        REGULATOR_STATUS_FAST,
        REGULATOR_STATUS_NORMAL,
        REGULATOR_STATUS_IDLE,
        REGULATOR_STATUS_STANDBY,
        REGULATOR_STATUS_BYPASS,
        REGULATOR_STATUS_UNDEFINED;

    }

    @Type(noCCodeGeneration=true, cType="struct regulator_dev")
    @NotUsableInJava
    public static class regulator_dev
    extends Struct {
        public Ptr<regulator_desc> desc;
        public int exclusive;
        public @Unsigned int use_count;
        public @Unsigned int open_count;
        public @Unsigned int bypass_count;
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head consumer_list;
        public misc.coupling_desc coupling_desc;
        public misc.blocking_notifier_head notifier;
        public misc.ww_mutex mutex;
        public Ptr<TaskDefinitions.task_struct> mutex_owner;
        public int ref_cnt;
        public Ptr<runtime.module> owner;
        public runtime.device dev;
        public Ptr<misc.regulation_constraints> constraints;
        public Ptr<runtime.regulator> supply;
        public String supply_name;
        public Ptr<runtime.regmap> regmap;
        public DelayedDefinitions.delayed_work disable_work;
        public Ptr<?> reg_data;
        public Ptr<runtime.dentry> debugfs;
        public Ptr<regulator_enable_gpio> ena_pin;
        public @Unsigned int ena_gpio_state;
        public @Unsigned int is_switch;
        public @OriginalName(value="ktime_t") long last_off;
        public int cached_err;
        public boolean use_cached_err;
        public  @OriginalName(value="spinlock_t") runtime.spinlock err_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_coupler")
    @NotUsableInJava
    public static class regulator_coupler
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<?> attach_regulator;
        public Ptr<?> detach_regulator;
        public Ptr<?> balance_voltage;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_bulk_data")
    @NotUsableInJava
    public static class regulator_bulk_data
    extends Struct {
        public String supply;
        public Ptr<runtime.regulator> consumer;
        public int init_load_uA;
        public int ret;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_desc")
    @NotUsableInJava
    public static class regulator_desc
    extends Struct {
        public String name;
        public String supply_name;
        public String of_match;
        public boolean of_match_full_name;
        public String regulators_node;
        public Ptr<?> of_parse_cb;
        public int id;
        public @Unsigned int continuous_voltage_range;
        public @Unsigned int n_voltages;
        public @Unsigned int n_current_limits;
        public Ptr<regulator_ops> ops;
        public int irq;
        public regulator_type type;
        public Ptr<runtime.module> owner;
        public @Unsigned int min_uV;
        public @Unsigned int uV_step;
        public @Unsigned int linear_min_sel;
        public int fixed_uV;
        public @Unsigned int ramp_delay;
        public int min_dropout_uV;
        public Ptr<LinearDefinitions.linear_range> linear_ranges;
        public Ptr<@Unsigned Integer> linear_range_selectors_bitfield;
        public int n_linear_ranges;
        public Ptr<@Unsigned Integer> volt_table;
        public Ptr<@Unsigned Integer> curr_table;
        public @Unsigned int vsel_range_reg;
        public @Unsigned int vsel_range_mask;
        public boolean range_applied_by_vsel;
        public @Unsigned int vsel_reg;
        public @Unsigned int vsel_mask;
        public @Unsigned int vsel_step;
        public @Unsigned int csel_reg;
        public @Unsigned int csel_mask;
        public @Unsigned int apply_reg;
        public @Unsigned int apply_bit;
        public @Unsigned int enable_reg;
        public @Unsigned int enable_mask;
        public @Unsigned int enable_val;
        public @Unsigned int disable_val;
        public boolean enable_is_inverted;
        public @Unsigned int bypass_reg;
        public @Unsigned int bypass_mask;
        public @Unsigned int bypass_val_on;
        public @Unsigned int bypass_val_off;
        public @Unsigned int active_discharge_on;
        public @Unsigned int active_discharge_off;
        public @Unsigned int active_discharge_mask;
        public @Unsigned int active_discharge_reg;
        public @Unsigned int soft_start_reg;
        public @Unsigned int soft_start_mask;
        public @Unsigned int soft_start_val_on;
        public @Unsigned int pull_down_reg;
        public @Unsigned int pull_down_mask;
        public @Unsigned int pull_down_val_on;
        public @Unsigned int ramp_reg;
        public @Unsigned int ramp_mask;
        public Ptr<@Unsigned Integer> ramp_delay_table;
        public @Unsigned int n_ramp_values;
        public @Unsigned int enable_time;
        public @Unsigned int off_on_delay;
        public @Unsigned int poll_enabled_time;
        public Ptr<?> of_map_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct regulator_init_data")
    @NotUsableInJava
    public static class regulator_init_data
    extends Struct {
        public String supply_regulator;
        public misc.regulation_constraints constraints;
        public int num_consumer_supplies;
        public Ptr<regulator_consumer_supply> consumer_supplies;
        public Ptr<?> regulator_init;
        public Ptr<?> driver_data;
    }
}

