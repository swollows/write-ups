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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BacklightDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DevfreqDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.runtime.ExtconDefinitions;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GenDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.GpiodDefinitions;
import me.bechberger.ebpf.runtime.HteDefinitions;
import me.bechberger.ebpf.runtime.HwmonDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IccDefinitions;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.MboxDefinitions;
import me.bechberger.ebpf.runtime.MipiDefinitions;
import me.bechberger.ebpf.runtime.MmcDefinitions;
import me.bechberger.ebpf.runtime.NdDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NvmemDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PowerDefinitions;
import me.bechberger.ebpf.runtime.PseDefinitions;
import me.bechberger.ebpf.runtime.PwmDefinitions;
import me.bechberger.ebpf.runtime.RegDefinitions;
import me.bechberger.ebpf.runtime.RegmapDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.ResetDefinitions;
import me.bechberger.ebpf.runtime.RprocDefinitions;
import me.bechberger.ebpf.runtime.RtcDefinitions;
import me.bechberger.ebpf.runtime.SerdevDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.SysDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.WatchdogDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DevmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_add_action($arg1, (void (*)(void*))$arg2, $arg3, (const u8*)$arg4)")
    public static int __devm_add_action(Ptr<runtime.device> dev, Ptr<?> action, Ptr<?> data, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __devm_alloc_percpu(Ptr<runtime.device> dev, @Unsigned long size, @Unsigned long align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __devm_clk_bulk_get(Ptr<runtime.device> dev, int num_clks, Ptr<ClkDefinitions.clk_bulk_data> clks, boolean optional) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_clk_get($arg1, (const u8*)$arg2, (struct clk* (*)(struct device*, const u8*))$arg3, (int (*)(struct clk*))$arg4, (void (*)(struct clk*))$arg5)")
    public static Ptr<runtime.clk> __devm_clk_get(Ptr<runtime.device> dev, String id, Ptr<?> get, Ptr<?> init, Ptr<?> exit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_clk_hw_register_divider($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const struct clk_hw*)$arg5, (const struct clk_parent_data*)$arg6, $arg7, $arg8, $arg9, $arg10, $arg11, (const struct clk_div_table*)$arg12, $arg13)")
    public static Ptr<ClkDefinitions.clk_hw> __devm_clk_hw_register_divider(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String parent_name, Ptr<ClkDefinitions.clk_hw> parent_hw, Ptr<ClkDefinitions.clk_parent_data> parent_data, @Unsigned long flags, Ptr<?> reg, char shift, char width, char clk_divider_flags, Ptr<ClkDefinitions.clk_div_table> table, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_clk_hw_register_gate($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const struct clk_hw*)$arg5, (const struct clk_parent_data*)$arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static Ptr<ClkDefinitions.clk_hw> __devm_clk_hw_register_gate(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String parent_name, Ptr<ClkDefinitions.clk_hw> parent_hw, Ptr<ClkDefinitions.clk_parent_data> parent_data, @Unsigned long flags, Ptr<?> reg, char bit_idx, char clk_gate_flags, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_irq_alloc_descs($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct irq_affinity_desc*)$arg7)")
    public static int __devm_irq_alloc_descs(Ptr<runtime.device> dev, int irq, @Unsigned int from, @Unsigned int cnt, int node2, Ptr<runtime.module> owner, Ptr<IrqDefinitions.irq_affinity_desc> affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_regmap_init_i2c($arg1, (const struct regmap_config*)$arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<runtime.regmap> __devm_regmap_init_i2c(Ptr<I2cDefinitions.i2c_client> i2c, Ptr<RegmapDefinitions.regmap_config> config, Ptr<LockDefinitions.lock_class_key> lock_key, String lock_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_acpi_dma_controller_free(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_acpi_dma_controller_register($arg1, (struct dma_chan* (*)(struct acpi_dma_spec*, struct acpi_dma*))$arg2, $arg3)")
    public static int devm_acpi_dma_controller_register(Ptr<runtime.device> dev, Ptr<?> acpi_dma_xlate, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_acpi_dma_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_action_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_action_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_aperture_acquire_for_platform_device(Ptr<PlatformDefinitions.platform_device> pdev, @Unsigned @OriginalName(value="resource_size_t") long base, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_aperture_acquire_release(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_backlight_device_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_backlight_device_register($arg1, (const u8*)$arg2, $arg3, $arg4, (const struct backlight_ops*)$arg5, (const struct backlight_properties*)$arg6)")
    public static Ptr<BacklightDefinitions.backlight_device> devm_backlight_device_register(Ptr<runtime.device> dev, String name, Ptr<runtime.device> parent, Ptr<?> devdata, Ptr<BacklightDefinitions.backlight_ops> ops, Ptr<BacklightDefinitions.backlight_properties> props) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_backlight_device_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_backlight_device_unregister(Ptr<runtime.device> dev, Ptr<BacklightDefinitions.backlight_device> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_battery_hook_register(Ptr<runtime.device> dev, Ptr<AcpiDefinitions.acpi_battery_hook> hook) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_battery_hook_unregister(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_clk_bulk_get(Ptr<runtime.device> dev, int num_clks, Ptr<ClkDefinitions.clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_clk_bulk_get_all(Ptr<runtime.device> dev, Ptr<Ptr<ClkDefinitions.clk_bulk_data>> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_clk_bulk_get_all_enable(Ptr<runtime.device> dev, Ptr<Ptr<ClkDefinitions.clk_bulk_data>> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_clk_bulk_get_optional(Ptr<runtime.device> dev, int num_clks, Ptr<ClkDefinitions.clk_bulk_data> clks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_bulk_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_bulk_release_all(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_bulk_release_all_enable(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_get($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> devm_clk_get(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_get_enabled($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> devm_clk_get_enabled(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_get_optional($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> devm_clk_get_optional(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_get_optional_enabled($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> devm_clk_get_optional_enabled(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_get_optional_enabled_with_rate($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.clk> devm_clk_get_optional_enabled_with_rate(Ptr<runtime.device> dev, String id, @Unsigned long rate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_get_optional_prepared($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> devm_clk_get_optional_prepared(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_get_prepared($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.clk> devm_clk_get_prepared(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_hw_release_divider(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_hw_release_gate(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_clk_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_put(Ptr<runtime.device> dev, Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevfreqDefinitions.devfreq_event_dev> devm_devfreq_event_add_edev(Ptr<runtime.device> dev, Ptr<DevfreqDefinitions.devfreq_event_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_devfreq_event_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_event_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_event_remove_edev(Ptr<runtime.device> dev, Ptr<DevfreqDefinitions.devfreq_event_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DrmDefinitions.drm_bridge> devm_drm_panel_bridge_add(Ptr<runtime.device> dev, Ptr<DrmDefinitions.drm_panel> panel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DrmDefinitions.drm_bridge> devm_drm_panel_bridge_add_typed(Ptr<runtime.device> dev, Ptr<DrmDefinitions.drm_panel> panel, @Unsigned int connector_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_drm_panel_bridge_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_free_irq(Ptr<runtime.device> dev, @Unsigned int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_free_pages(Ptr<runtime.device> dev, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_free_percpu(Ptr<runtime.device> dev, Ptr<?> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_fwnode_gpiod_get_index($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, (const u8*)$arg6)")
    public static Ptr<GpioDefinitions.gpio_desc> devm_fwnode_gpiod_get_index(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String con_id, int index2, GpiodDefinitions.gpiod_flags flags, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_get_clk_from_child($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.clk> devm_get_clk_from_child(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long devm_get_free_pages(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_gpio_chip_release(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_gpiochip_add_data_with_key(Ptr<runtime.device> dev, Ptr<GpioDefinitions.gpio_chip> gc, Ptr<?> data, Ptr<LockDefinitions.lock_class_key> lock_key, Ptr<LockDefinitions.lock_class_key> request_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gpiod_get($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<GpioDefinitions.gpio_desc> devm_gpiod_get(Ptr<runtime.device> dev, String con_id, GpiodDefinitions.gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gpiod_get_array($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<GpioDefinitions.gpio_descs> devm_gpiod_get_array(Ptr<runtime.device> dev, String con_id, GpiodDefinitions.gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gpiod_get_array_optional($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<GpioDefinitions.gpio_descs> devm_gpiod_get_array_optional(Ptr<runtime.device> dev, String con_id, GpiodDefinitions.gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gpiod_get_index($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<GpioDefinitions.gpio_desc> devm_gpiod_get_index(Ptr<runtime.device> dev, String con_id, @Unsigned int idx, GpiodDefinitions.gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gpiod_get_index_optional($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<GpioDefinitions.gpio_desc> devm_gpiod_get_index_optional(Ptr<runtime.device> dev, String con_id, @Unsigned int index2, GpiodDefinitions.gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gpiod_get_optional($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<GpioDefinitions.gpio_desc> devm_gpiod_get_optional(Ptr<runtime.device> dev, String con_id, GpiodDefinitions.gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_gpiod_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_gpiod_match_array(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_gpiod_put(Ptr<runtime.device> dev, Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_gpiod_put_array(Ptr<runtime.device> dev, Ptr<GpioDefinitions.gpio_descs> descs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_gpiod_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_gpiod_release_array(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_gpiod_unhinge(Ptr<runtime.device> dev, Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_hwmon_device_register_with_groups($arg1, (const u8*)$arg2, $arg3, (const struct attribute_group**)$arg4)")
    public static Ptr<runtime.device> devm_hwmon_device_register_with_groups(Ptr<runtime.device> dev, String name, Ptr<?> drvdata, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_hwmon_device_register_with_info($arg1, (const u8*)$arg2, $arg3, (const struct hwmon_chip_info*)$arg4, (const struct attribute_group**)$arg5)")
    public static Ptr<runtime.device> devm_hwmon_device_register_with_info(Ptr<runtime.device> dev, String name, Ptr<?> drvdata, Ptr<HwmonDefinitions.hwmon_chip_info> chip, Ptr<Ptr<AttributeDefinitions.attribute_group>> extra_groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_hwmon_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_hwmon_sanitize_name($arg1, (const u8*)$arg2)")
    public static String devm_hwmon_sanitize_name(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_icc_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_irq_alloc_generic_chip($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<IrqDefinitions.irq_chip_generic> devm_irq_alloc_generic_chip(Ptr<runtime.device> dev, String name, int num_ct, @Unsigned int irq_base, Ptr<?> reg_base, @OriginalName(value="irq_flow_handler_t") Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_irq_desc_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> devm_irq_domain_create_sim(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, @Unsigned int num_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_irq_domain_create_sim_full($arg1, $arg2, $arg3, (const struct irq_sim_ops*)$arg4, $arg5)")
    public static Ptr<IrqDefinitions.irq_domain> devm_irq_domain_create_sim_full(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, @Unsigned int num_irqs, Ptr<IrqDefinitions.irq_sim_ops> ops, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_irq_domain_instantiate($arg1, (const struct irq_domain_info*)$arg2)")
    public static Ptr<IrqDefinitions.irq_domain> devm_irq_domain_instantiate(Ptr<runtime.device> dev, Ptr<IrqDefinitions.irq_domain_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_irq_domain_remove(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_irq_domain_remove_sim(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_irq_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_irq_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_irq_remove_generic_chip(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_irq_setup_generic_chip(Ptr<runtime.device> dev, Ptr<IrqDefinitions.irq_chip_generic> gc, @Unsigned int msk, IrqDefinitions.irq_gc_flags flags, @Unsigned int clr, @Unsigned int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_kasprintf($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static String devm_kasprintf(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="gfp_t") int gfp, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_kfree($arg1, (const void*)$arg2)")
    public static void devm_kfree(Ptr<runtime.device> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_kmalloc(Ptr<runtime.device> dev, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_kmalloc_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_kmalloc_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_kmemdup($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static Ptr<?> devm_kmemdup(Ptr<runtime.device> dev, Ptr<?> src, @Unsigned long len, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_krealloc(Ptr<runtime.device> dev, Ptr<?> ptr, @Unsigned long new_size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_kstrdup($arg1, (const u8*)$arg2, $arg3)")
    public static String devm_kstrdup(Ptr<runtime.device> dev, String s2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)devm_kstrdup_const($arg1, (const u8*)$arg2, $arg3))")
    public static String devm_kstrdup_const(Ptr<runtime.device> dev, String s2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_kvasprintf($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static String devm_kvasprintf(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="gfp_t") int gfp, String fmt, Ptr<misc.__va_list_tag> ap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_led_classdev_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_led_classdev_register_ext(Ptr<runtime.device> parent, Ptr<LedDefinitions.led_classdev> led_cdev, Ptr<LedDefinitions.led_init_data> init_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_led_classdev_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_led_classdev_unregister(Ptr<runtime.device> dev, Ptr<LedDefinitions.led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<LedDefinitions.led_classdev> devm_led_get(Ptr<runtime.device> dev, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_led_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BacklightDefinitions.backlight_device> devm_of_find_backlight(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_of_icc_get($arg1, (const u8*)$arg2)")
    public static Ptr<IccDefinitions.icc_path> devm_of_icc_get(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<LedDefinitions.led_classdev> devm_of_led_get(Ptr<runtime.device> dev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<LedDefinitions.led_classdev> devm_of_led_get_optional(Ptr<runtime.device> dev, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pages_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pages_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_percpu_match(Ptr<runtime.device> dev, Ptr<?> data, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_percpu_release(Ptr<runtime.device> dev, Ptr<?> pdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pm_clk_create(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_pm_domain_attach_list($arg1, (const struct dev_pm_domain_attach_data*)$arg2, $arg3)")
    public static int devm_pm_domain_attach_list(Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_pm_domain_attach_data> data, Ptr<Ptr<DevDefinitions.dev_pm_domain_list>> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pm_runtime_enable(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_power_supply_register($arg1, (const struct power_supply_desc*)$arg2, (const struct power_supply_config*)$arg3)")
    public static Ptr<PowerDefinitions.power_supply> devm_power_supply_register(Ptr<runtime.device> parent, Ptr<PowerDefinitions.power_supply_desc> desc, Ptr<PowerDefinitions.power_supply_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_power_supply_register_no_ws($arg1, (const struct power_supply_desc*)$arg2, (const struct power_supply_config*)$arg3)")
    public static Ptr<PowerDefinitions.power_supply> devm_power_supply_register_no_ws(Ptr<runtime.device> parent, Ptr<PowerDefinitions.power_supply_desc> desc, Ptr<PowerDefinitions.power_supply_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_power_supply_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_release_action($arg1, (void (*)(void*))$arg2, $arg3)")
    public static void devm_release_action(Ptr<runtime.device> dev, Ptr<?> action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_remove_action($arg1, (void (*)(void*))$arg2, $arg3)")
    public static void devm_remove_action(Ptr<runtime.device> dev, Ptr<?> action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_request_any_context_irq($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int devm_request_any_context_irq(Ptr<runtime.device> dev, @Unsigned int irq, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long irqflags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_request_threaded_irq($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, $arg7)")
    public static int devm_request_threaded_irq(Ptr<runtime.device> dev, @Unsigned int irq, @OriginalName(value="irq_handler_t") Ptr<?> handler, @OriginalName(value="irq_handler_t") Ptr<?> thread_fn, @Unsigned long irqflags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_rtc_nvmem_register(Ptr<RtcDefinitions.rtc_device> rtc, Ptr<NvmemDefinitions.nvmem_config> nvmem_config2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevDefinitions.dev_dax> __devm_create_dev_dax(Ptr<DevDefinitions.dev_dax_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_drm_dev_alloc($arg1, (const struct drm_driver*)$arg2, $arg3, $arg4)")
    public static Ptr<?> __devm_drm_dev_alloc(Ptr<runtime.device> parent, Ptr<DrmDefinitions.drm_driver> driver, @Unsigned long size, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __devm_mbox_controller_unregister(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_of_phy_provider_register($arg1, $arg2, $arg3, (struct phy* (*)(struct device*, const struct of_phandle_args*))$arg4)")
    public static Ptr<PhyDefinitions.phy_provider> __devm_of_phy_provider_register(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> children, Ptr<runtime.module> owner, Ptr<?> of_xlate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_regmap_init($arg1, (const struct regmap_bus*)$arg2, $arg3, (const struct regmap_config*)$arg4, $arg5, (const u8*)$arg6)")
    public static Ptr<runtime.regmap> __devm_regmap_init(Ptr<runtime.device> dev, Ptr<RegmapDefinitions.regmap_bus> bus, Ptr<?> bus_context, Ptr<RegmapDefinitions.regmap_config> config, Ptr<LockDefinitions.lock_class_key> lock_key, String lock_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __devm_release_region(Ptr<runtime.device> dev, Ptr<runtime.resource> parent, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_request_region($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static Ptr<runtime.resource> __devm_request_region(Ptr<runtime.device> dev, Ptr<runtime.resource> parent, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long n, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_hw_get_clk($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.clk> devm_clk_hw_get_clk(Ptr<runtime.device> dev, Ptr<ClkDefinitions.clk_hw> hw, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_clk_hw_register(Ptr<runtime.device> dev, Ptr<ClkDefinitions.clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_hw_unregister_cb(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_clk_notifier_register(Ptr<runtime.device> dev, Ptr<runtime.clk> clk2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_notifier_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_clk_rate_exclusive_get(Ptr<runtime.device> dev, Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_rate_exclusive_put(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.clk> devm_clk_register(Ptr<runtime.device> dev, Ptr<ClkDefinitions.clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_unregister_cb(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DevDefinitions.dev_dax> devm_create_dev_dax(Ptr<DevDefinitions.dev_dax_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_drm_dev_init_release(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_extcon_dev_allocate($arg1, (const unsigned int*)$arg2)")
    public static Ptr<ExtconDefinitions.extcon_dev> devm_extcon_dev_allocate(Ptr<runtime.device> dev, Ptr<@Unsigned Integer> supported_cable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_extcon_dev_free(Ptr<runtime.device> dev, Ptr<ExtconDefinitions.extcon_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_extcon_dev_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_extcon_dev_notifier_all_unreg(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_extcon_dev_notifier_unreg(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_extcon_dev_register(Ptr<runtime.device> dev, Ptr<ExtconDefinitions.extcon_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_extcon_dev_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_extcon_dev_unreg(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_extcon_dev_unregister(Ptr<runtime.device> dev, Ptr<ExtconDefinitions.extcon_dev> edev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_extcon_register_notifier(Ptr<runtime.device> dev, Ptr<ExtconDefinitions.extcon_dev> edev, @Unsigned int id, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_extcon_register_notifier_all(Ptr<runtime.device> dev, Ptr<ExtconDefinitions.extcon_dev> edev, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_extcon_unregister_notifier(Ptr<runtime.device> dev, Ptr<ExtconDefinitions.extcon_dev> edev, @Unsigned int id, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_extcon_unregister_notifier_all(Ptr<runtime.device> dev, Ptr<ExtconDefinitions.extcon_dev> edev, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_hwrng_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_hwrng_register(Ptr<runtime.device> dev, Ptr<runtime.hwrng> rng) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_hwrng_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_hwrng_unregister(Ptr<runtime.device> dev, Ptr<runtime.hwrng> rng) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<InputDefinitions.input_dev> devm_input_allocate_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_input_device_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_input_device_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_input_device_unregister(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_led_trigger_register(Ptr<runtime.device> dev, Ptr<LedDefinitions.led_trigger> trig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_led_trigger_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_mbox_controller_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_mbox_controller_register(Ptr<runtime.device> dev, Ptr<MboxDefinitions.mbox_controller> mbox) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_mbox_controller_unregister(Ptr<runtime.device> dev, Ptr<MboxDefinitions.mbox_controller> mbox) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_memremap_pages(Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_pagemap> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_memremap_pages_release(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_memunmap_pages(Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_pagemap> pgmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_of_phy_get($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.phy> devm_of_phy_get(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.phy> devm_of_phy_get_by_index(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_of_phy_optional_get($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<runtime.phy> devm_of_phy_optional_get(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_of_phy_provider_unregister(Ptr<runtime.device> dev, Ptr<PhyDefinitions.phy_provider> phy_provider2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_phy_consume(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_phy_create($arg1, $arg2, (const struct phy_ops*)$arg3)")
    public static Ptr<runtime.phy> devm_phy_create(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> node2, Ptr<PhyDefinitions.phy_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_phy_destroy(Ptr<runtime.device> dev, Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_phy_get($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.phy> devm_phy_get(Ptr<runtime.device> dev, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_phy_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_phy_optional_get($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.phy> devm_phy_optional_get(Ptr<runtime.device> dev, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_phy_provider_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_phy_put(Ptr<runtime.device> dev, Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_phy_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_platform_get_and_ioremap_resource(Ptr<PlatformDefinitions.platform_device> pdev, @Unsigned int index2, Ptr<Ptr<runtime.resource>> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_platform_get_irqs_affinity(Ptr<PlatformDefinitions.platform_device> dev, Ptr<IrqDefinitions.irq_affinity> affd, @Unsigned int minvec, @Unsigned int maxvec, Ptr<Ptr<Integer>> irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_platform_get_irqs_affinity_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_platform_ioremap_resource(Ptr<PlatformDefinitions.platform_device> pdev, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_platform_ioremap_resource_byname($arg1, (const u8*)$arg2)")
    public static Ptr<?> devm_platform_ioremap_resource_byname(Ptr<PlatformDefinitions.platform_device> pdev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pm_opp_config_release(Ptr<?> token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pm_opp_set_config(Ptr<runtime.device> dev, Ptr<DevDefinitions.dev_pm_opp_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_region_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_region_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_register_dax_mapping(Ptr<DevDefinitions.dev_dax> dev_dax2, int range_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_register_framebuffer(Ptr<runtime.device> dev, Ptr<FbDefinitions.fb_info> fb_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_register_power_off_handler($arg1, (int (*)(struct sys_off_data*))$arg2, $arg3)")
    public static int devm_register_power_off_handler(Ptr<runtime.device> dev, Ptr<?> callback2, Ptr<?> cb_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_register_reboot_notifier(Ptr<runtime.device> dev, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_register_restart_handler($arg1, (int (*)(struct sys_off_data*))$arg2, $arg3)")
    public static int devm_register_restart_handler(Ptr<runtime.device> dev, Ptr<?> callback2, Ptr<?> cb_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_register_sys_off_handler($arg1, $arg2, $arg3, (int (*)(struct sys_off_data*))$arg4, $arg5)")
    public static int devm_register_sys_off_handler(Ptr<runtime.device> dev, SysDefinitions.sys_off_mode mode, int priority, Ptr<?> callback2, Ptr<?> cb_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regmap_add_irq_chip($arg1, $arg2, $arg3, $arg4, $arg5, (const struct regmap_irq_chip*)$arg6, $arg7)")
    public static int devm_regmap_add_irq_chip(Ptr<runtime.device> dev, Ptr<runtime.regmap> map2, int irq, int irq_flags, int irq_base, Ptr<RegmapDefinitions.regmap_irq_chip> chip, Ptr<Ptr<RegmapDefinitions.regmap_irq_chip_data>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regmap_add_irq_chip_fwnode($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, (const struct regmap_irq_chip*)$arg7, $arg8)")
    public static int devm_regmap_add_irq_chip_fwnode(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<runtime.regmap> map2, int irq, int irq_flags, int irq_base, Ptr<RegmapDefinitions.regmap_irq_chip> chip, Ptr<Ptr<RegmapDefinitions.regmap_irq_chip_data>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regmap_del_irq_chip(Ptr<runtime.device> dev, int irq, Ptr<RegmapDefinitions.regmap_irq_chip_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RegmapDefinitions.regmap_field> devm_regmap_field_alloc(Ptr<runtime.device> dev, Ptr<runtime.regmap> regmap2, RegDefinitions.reg_field reg_field2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regmap_field_bulk_alloc($arg1, $arg2, $arg3, (const struct reg_field*)$arg4, $arg5)")
    public static int devm_regmap_field_bulk_alloc(Ptr<runtime.device> dev, Ptr<runtime.regmap> regmap2, Ptr<Ptr<RegmapDefinitions.regmap_field>> rm_field, Ptr<RegDefinitions.reg_field> reg_field2, int num_fields) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regmap_field_bulk_free(Ptr<runtime.device> dev, Ptr<RegmapDefinitions.regmap_field> field) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regmap_field_free(Ptr<runtime.device> dev, Ptr<RegmapDefinitions.regmap_field> field) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_regmap_irq_chip_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regmap_irq_chip_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regmap_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_release_resource(Ptr<runtime.device> dev, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> devm_request_free_mem_region(Ptr<runtime.device> dev, Ptr<runtime.resource> base, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_request_resource(Ptr<runtime.device> dev, Ptr<runtime.resource> root, Ptr<runtime.resource> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_resource_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_resource_release(Ptr<runtime.device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_rproc_add(Ptr<runtime.device> dev, Ptr<runtime.rproc> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_rproc_alloc($arg1, (const u8*)$arg2, (const struct rproc_ops*)$arg3, (const u8*)$arg4, $arg5)")
    public static Ptr<runtime.rproc> devm_rproc_alloc(Ptr<runtime.device> dev, String name, Ptr<RprocDefinitions.rproc_ops> ops, String firmware2, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_rproc_free(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_rproc_remove(Ptr<?> rproc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_thermal_of_cooling_device_register($arg1, $arg2, (const u8*)$arg3, $arg4, (const struct thermal_cooling_device_ops*)$arg5)")
    public static Ptr<ThermalDefinitions.thermal_cooling_device> devm_thermal_of_cooling_device_register(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String type2, Ptr<?> devdata, Ptr<ThermalDefinitions.thermal_cooling_device_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_unregister_framebuffer(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_unregister_reboot_notifier(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_unregister_sys_off_handler(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_watchdog_register_device(Ptr<runtime.device> dev, Ptr<WatchdogDefinitions.watchdog_device> wdd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_watchdog_unregister_device(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __devm_hte_release_ts(Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __devm_pwmchip_add(Ptr<runtime.device> dev, Ptr<PwmDefinitions.pwm_chip> chip, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_regmap_init_mmio_clk($arg1, (const u8*)$arg2, $arg3, (const struct regmap_config*)$arg4, $arg5, (const u8*)$arg6)")
    public static Ptr<runtime.regmap> __devm_regmap_init_mmio_clk(Ptr<runtime.device> dev, String clk_id, Ptr<?> regs, Ptr<RegmapDefinitions.regmap_config> config, Ptr<LockDefinitions.lock_class_key> lock_key, String lock_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __devm_rtc_register_device(Ptr<runtime.module> owner, Ptr<RtcDefinitions.rtc_device> rtc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SpiDefinitions.spi_controller> __devm_spi_alloc_controller(Ptr<runtime.device> dev, @Unsigned int size, boolean slave) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _devm_regulator_bulk_get(Ptr<runtime.device> dev, int num_consumers, Ptr<RegulatorDefinitions.regulator_bulk_data> consumers, RegulatorDefinitions.regulator_get_type get_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_devm_regulator_get($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<runtime.regulator> _devm_regulator_get(Ptr<runtime.device> dev, String id, int get_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_devm_regulator_get_enable($arg1, (const u8*)$arg2, $arg3)")
    public static int _devm_regulator_get_enable(Ptr<runtime.device> dev, String id, int get_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_acpi_fan_create_hwmon(Ptr<AcpiDefinitions.acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> devm_alloc_etherdev_mqs(Ptr<runtime.device> dev, int sizeof_priv, @Unsigned int txqs, @Unsigned int rxqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_attr_group_remove(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_hw_register_clkdev($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4)")
    public static int devm_clk_hw_register_clkdev(Ptr<runtime.device> dev, Ptr<ClkDefinitions.clk_hw> hw, String con_id, String dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_hw_register_composite_pdata($arg1, (const u8*)$arg2, (const struct clk_parent_data*)$arg3, $arg4, $arg5, (const struct clk_ops*)$arg6, $arg7, (const struct clk_ops*)$arg8, $arg9, (const struct clk_ops*)$arg10, $arg11)")
    public static Ptr<ClkDefinitions.clk_hw> devm_clk_hw_register_composite_pdata(Ptr<runtime.device> dev, String name, Ptr<ClkDefinitions.clk_parent_data> parent_data, int num_parents, Ptr<ClkDefinitions.clk_hw> mux_hw, Ptr<ClkDefinitions.clk_ops> mux_ops, Ptr<ClkDefinitions.clk_hw> rate_hw, Ptr<ClkDefinitions.clk_ops> rate_ops, Ptr<ClkDefinitions.clk_hw> gate_hw, Ptr<ClkDefinitions.clk_ops> gate_ops, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_hw_register_fixed_rate_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_hw_release_composite(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clkdev_release(Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_component_match_release(Ptr<runtime.device> parent, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_device_add_group($arg1, (const struct attribute_group*)$arg2)")
    public static int devm_device_add_group(Ptr<runtime.device> dev, Ptr<AttributeDefinitions.attribute_group> grp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_drm_bridge_add(Ptr<runtime.device> dev, Ptr<DrmDefinitions.drm_bridge> bridge) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_free_netdev(Ptr<runtime.device> dev, Ptr<?> _this) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_fwnode_pwm_get($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<PwmDefinitions.pwm_device> devm_fwnode_pwm_get(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_hte_register_chip(Ptr<HteDefinitions.hte_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_hte_request_ts_ns(Ptr<runtime.device> dev, Ptr<HteDefinitions.hte_ts_desc> desc, @OriginalName(value="hte_ts_cb_t") Ptr<?> cb, @OriginalName(value="hte_ts_sec_cb_t") Ptr<?> tcb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_hwspin_lock_device_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_hwspin_lock_free(Ptr<runtime.device> dev, Ptr<runtime.hwspinlock> hwlock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_hwspin_lock_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_hwspin_lock_register($arg1, $arg2, (const struct hwspinlock_ops*)$arg3, $arg4, $arg5)")
    public static int devm_hwspin_lock_register(Ptr<runtime.device> dev, Ptr<misc.hwspinlock_device> bank, Ptr<misc.hwspinlock_ops> ops, int base_id, int num_locks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_hwspin_lock_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.hwspinlock> devm_hwspin_lock_request(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.hwspinlock> devm_hwspin_lock_request_specific(Ptr<runtime.device> dev, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_hwspin_lock_unreg(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_hwspin_lock_unregister(Ptr<runtime.device> dev, Ptr<misc.hwspinlock_device> bank) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_kasprintf_strarray($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<String> devm_kasprintf_strarray(Ptr<runtime.device> dev, String prefix, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_kfree_strarray(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_memremap(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_memremap_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_memremap_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_memunmap(Ptr<runtime.device> dev, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_mipi_dsi_attach(Ptr<runtime.device> dev, Ptr<MipiDefinitions.mipi_dsi_device> dsi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_mipi_dsi_detach(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_mipi_dsi_device_register_full($arg1, $arg2, (const struct mipi_dsi_device_info*)$arg3)")
    public static Ptr<MipiDefinitions.mipi_dsi_device> devm_mipi_dsi_device_register_full(Ptr<runtime.device> dev, Ptr<MipiDefinitions.mipi_dsi_host> host, Ptr<MipiDefinitions.mipi_dsi_device_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_mipi_dsi_device_unregister(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_name_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_namespace_disable(Ptr<runtime.device> dev, Ptr<NdDefinitions.nd_namespace_common> ndns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_namespace_enable(Ptr<runtime.device> dev, Ptr<NdDefinitions.nd_namespace_common> ndns, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_nvdimm_memremap(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned long size, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_nvmem_cell_get($arg1, (const u8*)$arg2)")
    public static Ptr<NvmemDefinitions.nvmem_cell> devm_nvmem_cell_get(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_nvmem_cell_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_nvmem_cell_put(Ptr<runtime.device> dev, Ptr<NvmemDefinitions.nvmem_cell> cell) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_nvmem_cell_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_nvmem_device_get($arg1, (const u8*)$arg2)")
    public static Ptr<NvmemDefinitions.nvmem_device> devm_nvmem_device_get(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_nvmem_device_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_nvmem_device_put(Ptr<runtime.device> dev, Ptr<NvmemDefinitions.nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_nvmem_device_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_nvmem_register($arg1, (const struct nvmem_config*)$arg2)")
    public static Ptr<NvmemDefinitions.nvmem_device> devm_nvmem_register(Ptr<runtime.device> dev, Ptr<NvmemDefinitions.nvmem_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_nvmem_unregister(Ptr<?> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PciDefinitions.pci_host_bridge> devm_pci_alloc_host_bridge(Ptr<runtime.device> dev, @Unsigned long priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pci_alloc_host_bridge_release(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pse_controller_register(Ptr<runtime.device> dev, Ptr<PseDefinitions.pse_controller_dev> pcdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pse_controller_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_pwm_get($arg1, (const u8*)$arg2)")
    public static Ptr<PwmDefinitions.pwm_device> devm_pwm_get(Ptr<runtime.device> dev, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pwm_release(Ptr<?> pwm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PwmDefinitions.pwm_chip> devm_pwmchip_alloc(Ptr<runtime.device> parent, @Unsigned int npwm, @Unsigned long sizeof_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pwmchip_put(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pwmchip_remove(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_rdev_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_register_netdev(Ptr<runtime.device> dev, Ptr<NetDefinitions.net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regulator_bulk_disable(Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_regulator_bulk_get(Ptr<runtime.device> dev, int num_consumers, Ptr<RegulatorDefinitions.regulator_bulk_data> consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_bulk_get_const($arg1, $arg2, (const struct regulator_bulk_data*)$arg3, $arg4)")
    public static int devm_regulator_bulk_get_const(Ptr<runtime.device> dev, int num_consumers, Ptr<RegulatorDefinitions.regulator_bulk_data> in_consumers, Ptr<Ptr<RegulatorDefinitions.regulator_bulk_data>> out_consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_bulk_get_enable($arg1, $arg2, (const u8**)$arg3)")
    public static int devm_regulator_bulk_get_enable(Ptr<runtime.device> dev, int num_consumers, Ptr<String> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_regulator_bulk_get_exclusive(Ptr<runtime.device> dev, int num_consumers, Ptr<RegulatorDefinitions.regulator_bulk_data> consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_regulator_bulk_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regulator_bulk_put(Ptr<RegulatorDefinitions.regulator_bulk_data> consumers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_bulk_register_supply_alias($arg1, (const u8**)$arg2, $arg3, (const u8**)$arg4, $arg5)")
    public static int devm_regulator_bulk_register_supply_alias(Ptr<runtime.device> dev, Ptr<String> id, Ptr<runtime.device> alias_dev, Ptr<String> alias_id, int num_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regulator_bulk_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regulator_destroy_notifier(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regulator_destroy_supply_alias(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_get($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.regulator> devm_regulator_get(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_get_enable($arg1, (const u8*)$arg2)")
    public static int devm_regulator_get_enable(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_get_enable_optional($arg1, (const u8*)$arg2)")
    public static int devm_regulator_get_enable_optional(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_get_enable_read_voltage($arg1, (const u8*)$arg2)")
    public static int devm_regulator_get_enable_read_voltage(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_get_exclusive($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.regulator> devm_regulator_get_exclusive(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_get_optional($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.regulator> devm_regulator_get_optional(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_irq_helper($arg1, (const struct regulator_irq_desc*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<?> devm_regulator_irq_helper(Ptr<runtime.device> dev, Ptr<RegulatorDefinitions.regulator_irq_desc> d, int irq, int irq_flags, int common_errs, Ptr<Integer> per_rdev_errs, Ptr<Ptr<RegulatorDefinitions.regulator_dev>> rdev, int rdev_amount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_regulator_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_regulator_match_notifier(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_regulator_match_supply_alias(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regulator_put(Ptr<runtime.regulator> regulator2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_register($arg1, (const struct regulator_desc*)$arg2, (const struct regulator_config*)$arg3)")
    public static Ptr<RegulatorDefinitions.regulator_dev> devm_regulator_register(Ptr<runtime.device> dev, Ptr<RegulatorDefinitions.regulator_desc> regulator_desc2, Ptr<RegulatorDefinitions.regulator_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_regulator_register_notifier(Ptr<runtime.regulator> regulator2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_regulator_register_supply_alias($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4)")
    public static int devm_regulator_register_supply_alias(Ptr<runtime.device> dev, String id, Ptr<runtime.device> alias_dev, String alias_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regulator_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_regulator_unregister_notifier(Ptr<runtime.regulator> regulator2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RtcDefinitions.rtc_device> devm_rtc_allocate_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_rtc_device_register($arg1, (const u8*)$arg2, (const struct rtc_class_ops*)$arg3, $arg4)")
    public static Ptr<RtcDefinitions.rtc_device> devm_rtc_device_register(Ptr<runtime.device> dev, String name, Ptr<RtcDefinitions.rtc_class_ops> ops, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_rtc_release_device(Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_rtc_unregister_device(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_serdev_device_close(Ptr<?> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_serdev_device_open(Ptr<runtime.device> dev, Ptr<SerdevDefinitions.serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_spi_optimize_message(Ptr<runtime.device> dev, Ptr<SpiDefinitions.spi_device> spi, Ptr<SpiDefinitions.spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_spi_register_controller(Ptr<runtime.device> dev, Ptr<SpiDefinitions.spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_spi_release_controller(Ptr<runtime.device> dev, Ptr<?> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_spi_unoptimize_message(Ptr<?> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_spi_unregister(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_unregister_netdev(Ptr<runtime.device> dev, Ptr<?> _this) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_clk_hw_register_mux($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8**)$arg5, (const struct clk_hw**)$arg6, (const struct clk_parent_data*)$arg7, $arg8, $arg9, $arg10, $arg11, $arg12, (const unsigned int*)$arg13, $arg14)")
    public static Ptr<ClkDefinitions.clk_hw> __devm_clk_hw_register_mux(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, char num_parents, Ptr<String> parent_names, Ptr<Ptr<ClkDefinitions.clk_hw>> parent_hws, Ptr<ClkDefinitions.clk_parent_data> parent_data, @Unsigned long flags, Ptr<?> reg, char shift, @Unsigned int mask, char clk_mux_flags, Ptr<@Unsigned Integer> table, Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_intel_scu_ipc_register($arg1, (const struct intel_scu_ipc_data*)$arg2, $arg3)")
    public static Ptr<IntelDefinitions.intel_scu_ipc_dev> __devm_intel_scu_ipc_register(Ptr<runtime.device> parent, Ptr<IntelDefinitions.intel_scu_ipc_data> scu_data, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __devm_ioremap(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned @OriginalName(value="resource_size_t") long size, devm_ioremap_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_ioremap_resource($arg1, (const struct resource*)$arg2, $arg3)")
    public static Ptr<?> __devm_ioremap_resource(Ptr<runtime.device> dev, Ptr<runtime.resource> res, devm_ioremap_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __devm_mdiobus_register(Ptr<runtime.device> dev, Ptr<misc.mii_bus> bus, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_pci_epc_create($arg1, (const struct pci_epc_ops*)$arg2, $arg3)")
    public static Ptr<PciDefinitions.pci_epc> __devm_pci_epc_create(Ptr<runtime.device> dev, Ptr<PciDefinitions.pci_epc_ops> ops, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_regmap_init_spi($arg1, (const struct regmap_config*)$arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<runtime.regmap> __devm_regmap_init_spi(Ptr<SpiDefinitions.spi_device> spi, Ptr<RegmapDefinitions.regmap_config> config, Ptr<LockDefinitions.lock_class_key> lock_key, String lock_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __devm_reset_control_bulk_get(Ptr<runtime.device> dev, int num_rstcs, Ptr<ResetDefinitions.reset_control_bulk_data> rstcs, boolean shared, boolean optional, boolean acquired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__devm_reset_control_get($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<ResetDefinitions.reset_control> __devm_reset_control_get(Ptr<runtime.device> dev, String id, int index2, boolean shared, boolean optional, boolean acquired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_acpi_dev_add_driver_gpios($arg1, (const struct acpi_gpio_mapping*)$arg2)")
    public static int devm_acpi_dev_add_driver_gpios(Ptr<runtime.device> dev, Ptr<AcpiDefinitions.acpi_gpio_mapping> gpios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_aperture_acquire_from_firmware(Ptr<DrmDefinitions.drm_device> dev, @Unsigned @OriginalName(value="resource_size_t") long base, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_arch_io_free_memtype_wc_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_arch_io_reserve_memtype_wc(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_arch_phys_ac_add_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_arch_phys_wc_add(Ptr<runtime.device> dev, @Unsigned long base, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> devm_bitmap_alloc(Ptr<runtime.device> dev, @Unsigned int nbits, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_bitmap_free(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Long> devm_bitmap_zalloc(Ptr<runtime.device> dev, @Unsigned int nbits, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_blk_crypto_profile_init(Ptr<runtime.device> dev, Ptr<BlkDefinitions.blk_crypto_profile> profile, @Unsigned int num_slots) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_hw_register_fixed_factor($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<ClkDefinitions.clk_hw> devm_clk_hw_register_fixed_factor(Ptr<runtime.device> dev, String name, String parent_name, @Unsigned long flags, @Unsigned int mult, @Unsigned int div) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_hw_register_fixed_factor_fwname($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, $arg6, $arg7)")
    public static Ptr<ClkDefinitions.clk_hw> devm_clk_hw_register_fixed_factor_fwname(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String fw_name, @Unsigned long flags, @Unsigned int mult, @Unsigned int div) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_hw_register_fixed_factor_index($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<ClkDefinitions.clk_hw> devm_clk_hw_register_fixed_factor_index(Ptr<runtime.device> dev, String name, @Unsigned int index2, @Unsigned long flags, @Unsigned int mult, @Unsigned int div) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_hw_register_fixed_factor_parent_hw($arg1, (const u8*)$arg2, (const struct clk_hw*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<ClkDefinitions.clk_hw> devm_clk_hw_register_fixed_factor_parent_hw(Ptr<runtime.device> dev, String name, Ptr<ClkDefinitions.clk_hw> parent_hw, @Unsigned long flags, @Unsigned int mult, @Unsigned int div) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_hw_register_fixed_factor_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_clk_hw_register_fixed_factor_with_accuracy_fwname($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<ClkDefinitions.clk_hw> devm_clk_hw_register_fixed_factor_with_accuracy_fwname(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> np, String name, String fw_name, @Unsigned long flags, @Unsigned int mult, @Unsigned int div, @Unsigned long acc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_clk_hw_release_mux(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_devfreq_add_device($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<runtime.devfreq> devm_devfreq_add_device(Ptr<runtime.device> dev, Ptr<DevfreqDefinitions.devfreq_dev_profile> profile, String governor_name, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_devfreq_add_governor(Ptr<runtime.device> dev, Ptr<DevfreqDefinitions.devfreq_governor> governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_devfreq_dev_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_dev_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_notifier_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_opp_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_devfreq_register_notifier(Ptr<runtime.device> dev, Ptr<runtime.devfreq> devfreq2, Ptr<misc.notifier_block> nb, @Unsigned int list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_devfreq_register_opp_notifier(Ptr<runtime.device> dev, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_remove_device(Ptr<runtime.device> dev, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_remove_governor(Ptr<?> governor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_unregister_notifier(Ptr<runtime.device> dev, Ptr<runtime.devfreq> devfreq2, Ptr<misc.notifier_block> nb, @Unsigned int list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_devfreq_unregister_opp_notifier(Ptr<runtime.device> dev, Ptr<runtime.devfreq> devfreq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_drm_panel_add_follower(Ptr<runtime.device> follower_dev, Ptr<DrmDefinitions.drm_panel_follower> follower) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gen_pool_create($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<GenDefinitions.gen_pool> devm_gen_pool_create(Ptr<runtime.device> dev, int min_alloc_order, int nid, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_gen_pool_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_gen_pool_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_gpio_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gpio_request($arg1, $arg2, (const u8*)$arg3)")
    public static int devm_gpio_request(Ptr<runtime.device> dev, @Unsigned int gpio, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_gpio_request_one($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int devm_gpio_request_one(Ptr<runtime.device> dev, @Unsigned int gpio, @Unsigned long flags, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_i2c_add_adapter(Ptr<runtime.device> dev, Ptr<I2cDefinitions.i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_i2c_del_adapter(Ptr<?> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<I2cDefinitions.i2c_client> devm_i2c_new_dummy_device(Ptr<runtime.device> dev, Ptr<I2cDefinitions.i2c_adapter> adapter, @Unsigned short address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_i2c_release_dummy(Ptr<?> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_icc_bulk_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_init_badblocks(Ptr<runtime.device> dev, Ptr<runtime.badblocks> bb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IntelDefinitions.intel_scu_ipc_dev> devm_intel_scu_ipc_dev_get(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_intel_scu_ipc_dev_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_intel_scu_ipc_unregister(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_ioport_map(Ptr<runtime.device> dev, @Unsigned long port2, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_ioport_map_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_ioport_map_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_ioport_unmap(Ptr<runtime.device> dev, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_ioremap(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_ioremap_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_ioremap_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_ioremap_resource($arg1, (const struct resource*)$arg2)")
    public static Ptr<?> devm_ioremap_resource(Ptr<runtime.device> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_ioremap_resource_wc($arg1, (const struct resource*)$arg2)")
    public static Ptr<?> devm_ioremap_resource_wc(Ptr<runtime.device> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_ioremap_uc(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_ioremap_wc(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_iounmap(Ptr<runtime.device> dev, Ptr<?> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.mii_bus> devm_mdiobus_alloc_size(Ptr<runtime.device> dev, int sizeof_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_mdiobus_free(Ptr<runtime.device> dev, Ptr<?> _this) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_mdiobus_unregister(Ptr<runtime.device> dev, Ptr<?> _this) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_mfd_add_devices($arg1, $arg2, (const struct mfd_cell*)$arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int devm_mfd_add_devices(Ptr<runtime.device> dev, int id, Ptr<misc.mfd_cell> cells, int n_devs, Ptr<runtime.resource> mem_base, int irq_base, Ptr<IrqDefinitions.irq_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_mfd_dev_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MmcDefinitions.mmc_host> devm_mmc_alloc_host(Ptr<runtime.device> dev, int extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_mmc_host_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_nsio_disable(Ptr<runtime.device> dev, Ptr<NdDefinitions.nd_namespace_io> nsio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_nsio_enable(Ptr<runtime.device> dev, Ptr<NdDefinitions.nd_namespace_io> nsio, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_of_icc_bulk_get(Ptr<runtime.device> dev, int num_paths, Ptr<IccDefinitions.icc_bulk_data> paths) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_of_iomap(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> node2, int index2, Ptr<@Unsigned @OriginalName(value="resource_size_t") Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_of_phy_package_join(Ptr<runtime.device> dev, Ptr<PhyDefinitions.phy_device> phydev, @Unsigned long priv_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pci_epc_destroy(Ptr<runtime.device> dev, Ptr<PciDefinitions.pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pci_epc_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pci_epc_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_pci_remap_cfg_resource(Ptr<runtime.device> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> devm_pci_remap_cfgspace(Ptr<runtime.device> dev, @Unsigned @OriginalName(value="resource_size_t") long offset, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_pci_remap_iospace($arg1, (const struct resource*)$arg2, $arg3)")
    public static int devm_pci_remap_iospace(Ptr<runtime.device> dev, Ptr<runtime.resource> res, @Unsigned @OriginalName(value="phys_addr_t") long phys_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pci_unmap_iospace(Ptr<runtime.device> dev, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_phy_package_join(Ptr<runtime.device> dev, Ptr<PhyDefinitions.phy_device> phydev, int base_addr, @Unsigned long priv_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_phy_package_leave(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pinctrl_dev_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pinctrl_dev_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.pinctrl> devm_pinctrl_get(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pinctrl_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pinctrl_put(Ptr<runtime.pinctrl> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PinctrlDefinitions.pinctrl_dev> devm_pinctrl_register(Ptr<runtime.device> dev, Ptr<PinctrlDefinitions.pinctrl_desc> pctldesc, Ptr<?> driver_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_pinctrl_register_and_init(Ptr<runtime.device> dev, Ptr<PinctrlDefinitions.pinctrl_desc> pctldesc, Ptr<?> driver_data, Ptr<Ptr<PinctrlDefinitions.pinctrl_dev>> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pinctrl_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_pinctrl_unregister(Ptr<runtime.device> dev, Ptr<PinctrlDefinitions.pinctrl_dev> pctldev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_pwm_lpss_probe($arg1, $arg2, (const struct pwm_lpss_boardinfo*)$arg3)")
    public static Ptr<PwmDefinitions.pwm_chip> devm_pwm_lpss_probe(Ptr<runtime.device> dev, Ptr<?> base, Ptr<PwmDefinitions.pwm_lpss_boardinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_request_pci_bus_resources(Ptr<runtime.device> dev, Ptr<ListDefinitions.list_head> resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ResetDefinitions.reset_control> devm_reset_control_array_get(Ptr<runtime.device> dev, boolean shared, boolean optional) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_reset_control_bulk_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_reset_control_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_reset_controller_register(Ptr<runtime.device> dev, Ptr<ResetDefinitions.reset_controller_dev> rcdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_reset_controller_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_spi_mem_dirmap_create($arg1, $arg2, (const struct spi_mem_dirmap_info*)$arg3)")
    public static Ptr<SpiDefinitions.spi_mem_dirmap_desc> devm_spi_mem_dirmap_create(Ptr<runtime.device> dev, Ptr<SpiDefinitions.spi_mem> mem, Ptr<SpiDefinitions.spi_mem_dirmap_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_spi_mem_dirmap_destroy(Ptr<runtime.device> dev, Ptr<SpiDefinitions.spi_mem_dirmap_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_spi_mem_dirmap_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_spi_mem_dirmap_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_thermal_add_hwmon_sysfs(Ptr<runtime.device> dev, Ptr<ThermalDefinitions.thermal_zone_device> tz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_thermal_hwmon_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UsbDefinitions.usb_phy> devm_usb_get_phy(Ptr<runtime.device> dev, UsbDefinitions.usb_phy_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UsbDefinitions.usb_phy> devm_usb_get_phy_by_node(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> node2, Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="devm_usb_get_phy_by_phandle($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<UsbDefinitions.usb_phy> devm_usb_get_phy_by_phandle(Ptr<runtime.device> dev, String phandle, char index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int devm_usb_phy_match(Ptr<runtime.device> dev, Ptr<?> res, Ptr<?> match_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_usb_phy_release(Ptr<runtime.device> dev, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_usb_phy_release2(Ptr<runtime.device> dev, Ptr<?> _res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void devm_usb_put_phy(Ptr<runtime.device> dev, Ptr<UsbDefinitions.usb_phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct devm_clk_state")
    @NotUsableInJava
    public static class devm_clk_state
    extends Struct {
        public Ptr<runtime.clk> clk;
        public Ptr<?> exit;
    }

    @Type(noCCodeGeneration=true, cType="enum devm_ioremap_type")
    public static enum devm_ioremap_type implements Enum<devm_ioremap_type>,
    TypedEnum<devm_ioremap_type, Integer>
    {
        DEVM_IOREMAP,
        DEVM_IOREMAP_UC,
        DEVM_IOREMAP_WC,
        DEVM_IOREMAP_NP;

    }
}

