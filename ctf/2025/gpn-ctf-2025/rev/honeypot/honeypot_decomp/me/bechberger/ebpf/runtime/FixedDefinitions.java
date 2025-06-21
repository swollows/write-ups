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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class FixedDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fixed_counter_disabled(int i, Ptr<runtime.pmu> pmu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long fixed_size_llseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int whence, @OriginalName(value="loff_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PhyDefinitions.phy_device> __fixed_phy_register(@Unsigned int irq, Ptr<fixed_phy_status> status, Ptr<DeviceDefinitions.device_node> np, Ptr<GpioDefinitions.gpio_desc> gpiod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixed_mdio_bus_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixed_mdio_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixed_mdio_read(Ptr<misc.mii_bus> bus, int phy_addr, int reg_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixed_mdio_write(Ptr<misc.mii_bus> bus, int phy_addr, int reg_num, @Unsigned short val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixed_phy_add(@Unsigned int irq, int phy_addr, Ptr<fixed_phy_status> status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixed_phy_add_gpiod(@Unsigned int irq, int phy_addr, Ptr<fixed_phy_status> status, Ptr<GpioDefinitions.gpio_desc> gpiod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fixed_phy_change_carrier(Ptr<NetDefinitions.net_device> dev, boolean new_carrier) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixed_phy_del(int phy_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PhyDefinitions.phy_device> fixed_phy_register(@Unsigned int irq, Ptr<fixed_phy_status> status, Ptr<DeviceDefinitions.device_node> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PhyDefinitions.phy_device> fixed_phy_register_with_gpiod(@Unsigned int irq, Ptr<fixed_phy_status> status, Ptr<GpioDefinitions.gpio_desc> gpiod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fixed_phy_set_link_update($arg1, (int (*)(struct net_device*, struct fixed_phy_status*))$arg2)")
    public static int fixed_phy_set_link_update(Ptr<PhyDefinitions.phy_device> phydev, Ptr<?> link_update2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fixed_phy_unregister(Ptr<PhyDefinitions.phy_device> phy2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fixed_regulator_data")
    @NotUsableInJava
    public static class fixed_regulator_data
    extends Struct {
        public fixed_voltage_config cfg;
        public RegulatorDefinitions.regulator_init_data init_data;
        public PlatformDefinitions.platform_device pdev;
    }

    @Type(noCCodeGeneration=true, cType="struct fixed_voltage_config")
    @NotUsableInJava
    public static class fixed_voltage_config
    extends Struct {
        public String supply_name;
        public String input_supply;
        public int microvolts;
        public @Unsigned int startup_delay;
        public @Unsigned int off_on_delay;
        public @Unsigned int enabled_at_boot;
        public Ptr<RegulatorDefinitions.regulator_init_data> init_data;
    }

    @Type(noCCodeGeneration=true, cType="struct fixed_phy")
    @NotUsableInJava
    public static class fixed_phy
    extends Struct {
        public int addr;
        public Ptr<PhyDefinitions.phy_device> phydev;
        public fixed_phy_status status;
        public boolean no_carrier;
        public Ptr<?> link_update;
        public ListDefinitions.list_head node;
        public Ptr<GpioDefinitions.gpio_desc> link_gpiod;
    }

    @Type(noCCodeGeneration=true, cType="struct fixed_mdio_bus")
    @NotUsableInJava
    public static class fixed_mdio_bus
    extends Struct {
        public Ptr<misc.mii_bus> mii_bus;
        public ListDefinitions.list_head phys;
    }

    @Type(noCCodeGeneration=true, cType="struct fixed_phy_status")
    @NotUsableInJava
    public static class fixed_phy_status
    extends Struct {
        public int link;
        public int speed;
        public int duplex;
        public int pause;
        public int asym_pause;
    }

    @Type(noCCodeGeneration=true, cType="struct fixed_range_block")
    @NotUsableInJava
    public static class fixed_range_block
    extends Struct {
        public int base_msr;
        public int ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct fixed_percpu_data")
    @NotUsableInJava
    public static class fixed_percpu_data
    extends Struct {
        public char @Size(value=40) [] gs_base;
        public @Unsigned long stack_canary;
    }

    @Type(noCCodeGeneration=true, cType="enum fixed_addresses")
    public static enum fixed_addresses implements Enum<fixed_addresses>,
    TypedEnum<fixed_addresses, Integer>
    {
        VSYSCALL_PAGE,
        FIX_DBGP_BASE,
        FIX_EARLYCON_MEM_BASE,
        FIX_APIC_BASE,
        FIX_IO_APIC_BASE_0,
        FIX_IO_APIC_BASE_END,
        FIX_PARAVIRT_BOOTMAP,
        FIX_APEI_GHES_IRQ,
        FIX_APEI_GHES_NMI,
        __end_of_permanent_fixed_addresses,
        FIX_BTMAP_END,
        FIX_BTMAP_BEGIN,
        FIX_TBOOT_BASE,
        __end_of_fixed_addresses;

    }
}

