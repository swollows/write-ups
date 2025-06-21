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
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.ResetDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MdioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mdio_bus_device_stat_field_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdio_bus_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdio_bus_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mdio_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int mdio_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long mdio_bus_stat_field_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mdio_find_bus((const u8*)$arg1)")
    public static Ptr<misc.mii_bus> mdio_find_bus(String mdio_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mdio_uevent((const struct device*)$arg1, $arg2)")
    public static int mdio_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mdio_device_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int mdio_device_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mdio_device> mdio_device_create(Ptr<misc.mii_bus> bus, int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdio_device_free(Ptr<mdio_device> mdiodev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdio_device_register(Ptr<mdio_device> mdiodev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdio_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdio_device_remove(Ptr<mdio_device> mdiodev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdio_device_reset(Ptr<mdio_device> mdiodev, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdio_driver_register(Ptr<mdio_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdio_driver_unregister(Ptr<mdio_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdio_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdio_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mdio_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdio_bus_phy_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mdio_bus_phy_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mdio_device_id")
    @NotUsableInJava
    public static class mdio_device_id
    extends Struct {
        public @Unsigned int phy_id;
        public @Unsigned int phy_id_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct mdio_bus_stat_attr")
    @NotUsableInJava
    public static class mdio_bus_stat_attr
    extends Struct {
        public int addr;
        public @Unsigned int field_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct mdio_driver")
    @NotUsableInJava
    public static class mdio_driver
    extends Struct {
        public mdio_driver_common mdiodrv;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
    }

    @Type(noCCodeGeneration=true, cType="struct mdio_driver_common")
    @NotUsableInJava
    public static class mdio_driver_common
    extends Struct {
        public DeviceDefinitions.device_driver driver;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct mdio_board_entry")
    @NotUsableInJava
    public static class mdio_board_entry
    extends Struct {
        public ListDefinitions.list_head list;
        public mdio_board_info board_info;
    }

    @Type(noCCodeGeneration=true, cType="struct mdio_board_info")
    @NotUsableInJava
    public static class mdio_board_info
    extends Struct {
        public String bus_id;
        public char @Size(value=32) [] modalias;
        public int mdio_addr;
        public Ptr<?> platform_data;
    }

    @Type(noCCodeGeneration=true, cType="struct mdio_bus_stats")
    @NotUsableInJava
    public static class mdio_bus_stats
    extends Struct {
        public misc.u64_stats_t transfers;
        public misc.u64_stats_t errors;
        public misc.u64_stats_t writes;
        public misc.u64_stats_t reads;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="struct mdio_device")
    @NotUsableInJava
    public static class mdio_device
    extends Struct {
        public runtime.device dev;
        public Ptr<misc.mii_bus> bus;
        public char @Size(value=32) [] modalias;
        public Ptr<?> bus_match;
        public Ptr<?> device_free;
        public Ptr<?> device_remove;
        public int addr;
        public int flags;
        public int reset_state;
        public Ptr<GpioDefinitions.gpio_desc> reset_gpio;
        public Ptr<ResetDefinitions.reset_control> reset_ctrl;
        public @Unsigned int reset_assert_delay;
        public @Unsigned int reset_deassert_delay;
    }
}

