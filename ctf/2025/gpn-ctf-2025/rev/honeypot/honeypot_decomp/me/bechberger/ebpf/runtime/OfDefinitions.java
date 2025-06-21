/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.DevfreqDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.IccDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MboxDefinitions;
import me.bechberger.ebpf.runtime.MipiDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.PseDefinitions;
import me.bechberger.ebpf.runtime.PwmDefinitions;
import me.bechberger.ebpf.runtime.ResetDefinitions;
import me.bechberger.ebpf.runtime.ThermalDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class OfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="of_icc_get($arg1, (const u8*)$arg2)")
    public static Ptr<IccDefinitions.icc_path> of_icc_get(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IccDefinitions.icc_path> of_icc_get_by_index(Ptr<runtime.device> dev, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_icc_get_from_provider((const struct of_phandle_args*)$arg1)")
    public static Ptr<IccDefinitions.icc_node_data> of_icc_get_from_provider(Ptr<of_phandle_args> spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_icc_xlate_onecell((const struct of_phandle_args*)$arg1, $arg2)")
    public static Ptr<IccDefinitions.icc_node> of_icc_xlate_onecell(Ptr<of_phandle_args> spec, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<LedDefinitions.led_classdev> of_led_get(Ptr<DeviceDefinitions.device_node> np, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_pm_clk_add_clk($arg1, (const u8*)$arg2)")
    public static int of_pm_clk_add_clk(Ptr<runtime.device> dev, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_pm_clk_add_clks(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void of_set_phy_eee_broken(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void of_set_phy_supported(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__of_phy_provider_register($arg1, $arg2, $arg3, (struct phy* (*)(struct device*, const struct of_phandle_args*))$arg4)")
    public static Ptr<PhyDefinitions.phy_provider> __of_phy_provider_register(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_node> children, Ptr<runtime.module> owner, Ptr<?> of_xlate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_clk_hw_register(Ptr<DeviceDefinitions.device_node> node2, Ptr<ClkDefinitions.clk_hw> hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ThermalDefinitions.thermal_cooling_device> of_devfreq_cooling_register(Ptr<DeviceDefinitions.device_node> np, Ptr<runtime.devfreq> df) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ThermalDefinitions.thermal_cooling_device> of_devfreq_cooling_register_power(Ptr<DeviceDefinitions.device_node> np, Ptr<runtime.devfreq> df, Ptr<DevfreqDefinitions.devfreq_cooling_power> dfc_power) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_mbox_index_xlate($arg1, (const struct of_phandle_args*)$arg2)")
    public static Ptr<MboxDefinitions.mbox_chan> of_mbox_index_xlate(Ptr<MboxDefinitions.mbox_controller> mbox, Ptr<of_phandle_args> sp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void of_pci_make_dev_node(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_phandle_args_to_fwspec($arg1, (const unsigned int*)$arg2, $arg3, $arg4)")
    public static void of_phandle_args_to_fwspec(Ptr<DeviceDefinitions.device_node> np, Ptr<@Unsigned Integer> args, @Unsigned int count, Ptr<IrqDefinitions.irq_fwspec> fwspec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_phy_get($arg1, (const u8*)$arg2)")
    public static Ptr<runtime.phy> of_phy_get(Ptr<DeviceDefinitions.device_node> np, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void of_phy_provider_unregister(Ptr<PhyDefinitions.phy_provider> phy_provider2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void of_phy_put(Ptr<runtime.phy> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_phy_simple_xlate($arg1, (const struct of_phandle_args*)$arg2)")
    public static Ptr<runtime.phy> of_phy_simple_xlate(Ptr<runtime.device> dev, Ptr<of_phandle_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MipiDefinitions.mipi_dsi_device> of_find_mipi_dsi_device_by_node(Ptr<DeviceDefinitions.device_node> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MipiDefinitions.mipi_dsi_host> of_find_mipi_dsi_host_by_node(Ptr<DeviceDefinitions.device_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_hte_req_count(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_hwspin_lock_get_id(Ptr<DeviceDefinitions.device_node> np, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_hwspin_lock_get_id_byname($arg1, (const u8*)$arg2)")
    public static int of_hwspin_lock_get_id_byname(Ptr<DeviceDefinitions.device_node> np, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_load_pse_pis(Ptr<PseDefinitions.pse_controller_dev> pcdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PseDefinitions.pse_control> of_pse_control_get(Ptr<DeviceDefinitions.device_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_pwm_single_xlate($arg1, (const struct of_phandle_args*)$arg2)")
    public static Ptr<PwmDefinitions.pwm_device> of_pwm_single_xlate(Ptr<PwmDefinitions.pwm_chip> chip, Ptr<of_phandle_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_pwm_xlate_with_flags($arg1, (const struct of_phandle_args*)$arg2)")
    public static Ptr<PwmDefinitions.pwm_device> of_pwm_xlate_with_flags(Ptr<PwmDefinitions.pwm_chip> chip, Ptr<of_phandle_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_syscon_register_regmap(Ptr<DeviceDefinitions.device_node> np, Ptr<runtime.regmap> regmap2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__of_reset_control_get($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<ResetDefinitions.reset_control> __of_reset_control_get(Ptr<DeviceDefinitions.device_node> node2, String id, int index2, boolean shared, boolean optional, boolean acquired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> of_css(Ptr<KernfsDefinitions.kernfs_open_file> of) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_icc_bulk_get(Ptr<runtime.device> dev, int num_paths, Ptr<IccDefinitions.icc_bulk_data> paths) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_numa_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_of_peak> of_peak(Ptr<KernfsDefinitions.kernfs_open_file> of) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int of_phy_package_join(Ptr<PhyDefinitions.phy_device> phydev, @Unsigned long priv_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ResetDefinitions.reset_control> of_reset_control_array_get(Ptr<DeviceDefinitions.device_node> np, boolean shared, boolean optional, boolean acquired) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="of_reset_simple_xlate($arg1, (const struct of_phandle_args*)$arg2)")
    public static int of_reset_simple_xlate(Ptr<ResetDefinitions.reset_controller_dev> rcdev, Ptr<of_phandle_args> reset_spec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct of_dma")
    @NotUsableInJava
    public static class of_dma
    extends Struct {
        public ListDefinitions.list_head of_dma_controllers;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public Ptr<?> of_dma_xlate;
        public Ptr<?> of_dma_route_allocate;
        public Ptr<DmaDefinitions.dma_router> dma_router;
        public Ptr<?> of_dma_data;
    }

    @Type(noCCodeGeneration=true, cType="struct of_pci_range")
    @NotUsableInJava
    public static class of_pci_range
    extends Struct {
        @InlineUnion(value=66000)
        public @InlineUnion(value=66000) @Unsigned long pci_addr;
        @InlineUnion(value=66000)
        public @InlineUnion(value=66000) @Unsigned long bus_addr;
        public @Unsigned long cpu_addr;
        public @Unsigned long size;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct of_pci_range_parser")
    @NotUsableInJava
    public static class of_pci_range_parser
    extends Struct {
        public Ptr<DeviceDefinitions.device_node> node;
        public @OriginalName(value="of_bus") Ptr<?> bus;
        public Ptr<@Unsigned @OriginalName(value="__be32") Integer> range;
        public Ptr<@Unsigned @OriginalName(value="__be32") Integer> end;
        public int na;
        public int ns;
        public int pna;
        public boolean dma;
    }

    @Type(noCCodeGeneration=true, cType="struct of_dev_auxdata")
    @NotUsableInJava
    public static class of_dev_auxdata
    extends Struct {
        public String compatible;
        public @Unsigned @OriginalName(value="resource_size_t") long phys_addr;
        public String name;
        public Ptr<?> platform_data;
    }

    @Type(noCCodeGeneration=true, cType="struct of_phandle_args")
    @NotUsableInJava
    public static class of_phandle_args
    extends Struct {
        public Ptr<DeviceDefinitions.device_node> np;
        public int args_count;
        public @Unsigned @OriginalName(value="uint32_t") int @Size(value=16) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct of_device_id")
    @NotUsableInJava
    public static class of_device_id
    extends Struct {
        public char @Size(value=32) [] name;
        public char @Size(value=32) [] type;
        public char @Size(value=128) [] compatible;
        public Ptr<?> data;
    }
}

