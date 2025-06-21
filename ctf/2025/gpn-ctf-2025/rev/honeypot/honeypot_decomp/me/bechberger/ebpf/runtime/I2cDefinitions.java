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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DwDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.RtDefinitions;
import me.bechberger.ebpf.runtime.SoftwareDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class I2cDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __i2c_smbus_xfer(Ptr<i2c_adapter> adapter, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<i2c_smbus_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_client> i2c_new_smbus_alert_device(Ptr<i2c_adapter> adapter, Ptr<i2c_smbus_alert_setup> setup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_setup_smbus_alert(Ptr<i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char i2c_smbus_msg_pec(char pec, Ptr<i2c_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char i2c_smbus_pec(char crc, Ptr<Character> p, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_read_block_data((const struct i2c_client*)$arg1, $arg2, $arg3)")
    public static int i2c_smbus_read_block_data(Ptr<i2c_client> client, char command, Ptr<Character> values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_read_byte((const struct i2c_client*)$arg1)")
    public static int i2c_smbus_read_byte(Ptr<i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_read_byte_data((const struct i2c_client*)$arg1, $arg2)")
    public static int i2c_smbus_read_byte_data(Ptr<i2c_client> client, char command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_read_i2c_block_data((const struct i2c_client*)$arg1, $arg2, $arg3, $arg4)")
    public static int i2c_smbus_read_i2c_block_data(Ptr<i2c_client> client, char command, char length, Ptr<Character> values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_read_i2c_block_data_or_emulated((const struct i2c_client*)$arg1, $arg2, $arg3, $arg4)")
    public static int i2c_smbus_read_i2c_block_data_or_emulated(Ptr<i2c_client> client, char command, char length, Ptr<Character> values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_read_word_data((const struct i2c_client*)$arg1, $arg2)")
    public static int i2c_smbus_read_word_data(Ptr<i2c_client> client, char command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_smbus_try_get_dmabuf(Ptr<i2c_msg> msg, char init_val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_write_block_data((const struct i2c_client*)$arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int i2c_smbus_write_block_data(Ptr<i2c_client> client, char command, char length, Ptr<Character> values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_write_byte((const struct i2c_client*)$arg1, $arg2)")
    public static int i2c_smbus_write_byte(Ptr<i2c_client> client, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_write_byte_data((const struct i2c_client*)$arg1, $arg2, $arg3)")
    public static int i2c_smbus_write_byte_data(Ptr<i2c_client> client, char command, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_write_i2c_block_data((const struct i2c_client*)$arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int i2c_smbus_write_i2c_block_data(Ptr<i2c_client> client, char command, char length, Ptr<Character> values) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_smbus_write_word_data((const struct i2c_client*)$arg1, $arg2, $arg3)")
    public static int i2c_smbus_write_word_data(Ptr<i2c_client> client, char command, @Unsigned short value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_smbus_xfer(Ptr<i2c_adapter> adapter, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int protocol, Ptr<i2c_smbus_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_smbus_xfer_emulated(Ptr<i2c_adapter> adapter, @Unsigned short addr2, @Unsigned short flags, char read_write, char command, int size, Ptr<i2c_smbus_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dev_attach_adapter(Ptr<runtime.device> dev, Ptr<?> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dev_detach_adapter(Ptr<runtime.device> dev, Ptr<?> dummy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dev_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_dw_get_clk_rate_khz(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __i2c_dw_disable(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int i2c_acpi_add_device(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int level, Ptr<?> data, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_add_irq_resource(Ptr<AcpiDefinitions.acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_client_count(Ptr<AcpiDefinitions.acpi_device> adev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_do_lookup(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<i2c_acpi_lookup> lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_fill_info(Ptr<AcpiDefinitions.acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_adapter> i2c_acpi_find_adapter_by_handle(@OriginalName(value="acpi_handle") Ptr<?> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_acpi_find_bus_speed(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean i2c_acpi_get_i2c_resource(Ptr<AcpiDefinitions.acpi_resource> ares, Ptr<Ptr<AcpiDefinitions.acpi_resource_i2c_serialbus>> i2c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_get_info(Ptr<AcpiDefinitions.acpi_device> adev, Ptr<i2c_board_info> info2, Ptr<i2c_adapter> adapter, Ptr<@OriginalName(value="acpi_handle") Ptr<?>> adapter_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_get_irq(Ptr<i2c_client> client, Ptr<@OriginalName(value="bool") Boolean> wake_capable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_install_space_handler(Ptr<i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int i2c_acpi_lookup_speed(@OriginalName(value="acpi_handle") Ptr<?> handle, @Unsigned int level, Ptr<?> data, Ptr<Ptr<?>> return_value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_client> i2c_acpi_new_device_by_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, int index2, Ptr<i2c_board_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_notify(Ptr<misc.notifier_block> nb, @Unsigned long value, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_acpi_register_devices(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_acpi_remove_space_handler(Ptr<i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_acpi_resource_count(Ptr<AcpiDefinitions.acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="acpi_status") int i2c_acpi_space_handler(@Unsigned int function, @Unsigned @OriginalName(value="acpi_physical_address") long command, @Unsigned int bits, Ptr<@Unsigned Long> value64, Ptr<?> handler_context, Ptr<?> region_context) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean i2c_acpi_waive_d0_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_acquire_lock(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_dw_clk_rate(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_disable(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_dw_func(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_fw_parse_and_configure(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_handle_tx_abort(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_init_regmap(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_prepare(Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_prepare_clk(Ptr<DwDefinitions.dw_i2c_dev> dev, boolean prepare) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_probe(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_dw_read_scl_reg(Ptr<DwDefinitions.dw_i2c_dev> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_release_lock(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_resume(Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_runtime_resume(Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_runtime_suspend(Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_dw_scl_hcnt(Ptr<DwDefinitions.dw_i2c_dev> dev, @Unsigned int reg, @Unsigned int ic_clk, @Unsigned int tSYMBOL, @Unsigned int tf, int cond, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_dw_scl_lcnt(Ptr<DwDefinitions.dw_i2c_dev> dev, @Unsigned int reg, @Unsigned int ic_clk, @Unsigned int tLOW, @Unsigned int tf, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_set_fifo_size(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_set_sda_hold(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_suspend(Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_wait_bus_not_busy(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_register_board_info($arg1, (const struct i2c_board_info*)$arg2, $arg3)")
    public static int i2c_register_board_info(int busnum, Ptr<i2c_board_info> info2, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __i2c_check_addr_busy(Ptr<runtime.device> dev, Ptr<?> addrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __i2c_transfer(Ptr<i2c_adapter> adap, Ptr<i2c_msg> msgs, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_adapter_depth(Ptr<i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_adapter_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_adapter_lock_bus(Ptr<i2c_adapter> adapter, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_adapter_trylock_bus(Ptr<i2c_adapter> adapter, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_adapter_unlock_bus(Ptr<i2c_adapter> adapter, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_add_adapter(Ptr<i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_add_numbered_adapter(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_check_7bit_addr_validity_strict(@Unsigned short addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_check_addr_busy(Ptr<i2c_adapter> adapter, int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_check_for_quirks(Ptr<i2c_adapter> adap, Ptr<i2c_msg> msgs, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_check_mux_children(Ptr<runtime.device> dev, Ptr<?> addrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_check_mux_parents(Ptr<i2c_adapter> adapter, int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_client_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct i2c_device_id*)i2c_client_get_device_id((const struct i2c_client*)$arg1))")
    public static Ptr<i2c_device_id> i2c_client_get_device_id(Ptr<i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_clients_command(Ptr<i2c_adapter> adap, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_cmd(Ptr<runtime.device> dev, Ptr<?> _arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_default_probe(Ptr<i2c_adapter> adap, @Unsigned short addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_del_adapter(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_del_driver(Ptr<i2c_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_detect(Ptr<i2c_adapter> adapter, Ptr<i2c_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_detect_address(Ptr<i2c_client> temp_client, Ptr<i2c_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_dev_irq_from_resources((const struct resource*)$arg1, $arg2)")
    public static int i2c_dev_irq_from_resources(Ptr<runtime.resource> resources, @Unsigned int num_resources) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_dev_or_parent_fwnode_match($arg1, (const void*)$arg2)")
    public static int i2c_dev_or_parent_fwnode_match(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_device_match($arg1, (const struct device_driver*)$arg2)")
    public static int i2c_device_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_device_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_device_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_device_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_device_uevent((const struct device*)$arg1, $arg2)")
    public static int i2c_device_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_do_del_adapter(Ptr<i2c_driver> driver, Ptr<i2c_adapter> adapter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_baytrail_probe_lock_support(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_check_stopbit(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_configure_master(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_init_master(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn i2c_dw_isr(int this_irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_prepare_recovery(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_probe_master(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_process_transfer(Ptr<DwDefinitions.dw_i2c_dev> dev, @Unsigned int stat2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_read(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int i2c_dw_read_clear_intrbits(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_set_timings_master(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_unprepare_recovery(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_dw_xfer(Ptr<i2c_adapter> adap, Ptr<i2c_msg> msgs, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_xfer_init(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_dw_xfer_msg(Ptr<DwDefinitions.dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_adapter> i2c_find_adapter_by_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_client> i2c_find_device_by_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_for_each_dev($arg1, (int (*)(struct device*, void*))$arg2)")
    public static int i2c_for_each_dev(Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)i2c_freq_mode_string($arg1))")
    public static String i2c_freq_mode_string(@Unsigned int bus_freq_hz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_generic_scl_recovery(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_adapter> i2c_get_adapter(int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_adapter> i2c_get_adapter_by_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_get_device_id((const struct i2c_client*)$arg1, $arg2)")
    public static int i2c_get_device_id(Ptr<i2c_client> client, Ptr<i2c_device_identity> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> i2c_get_dma_safe_msg_buf(Ptr<i2c_msg> msg, @Unsigned int threshold) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)i2c_get_match_data((const struct i2c_client*)$arg1))")
    public static Ptr<?> i2c_get_match_data(Ptr<i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_gpio_init_pinctrl_recovery(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_handle_smbus_host_notify(Ptr<i2c_adapter> adap, @Unsigned short addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_host_notify_irq_map(Ptr<IrqDefinitions.irq_domain> h, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw_irq_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_init_recovery(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct i2c_device_id*)i2c_match_id((const struct i2c_device_id*)$arg1, (const struct i2c_client*)$arg2))")
    public static Ptr<i2c_device_id> i2c_match_id(Ptr<i2c_device_id> id, Ptr<i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_new_ancillary_device($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<i2c_client> i2c_new_ancillary_device(Ptr<i2c_client> client, String name, @Unsigned short default_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_new_client_device($arg1, (const struct i2c_board_info*)$arg2)")
    public static Ptr<i2c_client> i2c_new_client_device(Ptr<i2c_adapter> adap, Ptr<i2c_board_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_client> i2c_new_dummy_device(Ptr<i2c_adapter> adapter, @Unsigned short address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_new_scanned_device($arg1, $arg2, (const short unsigned int*)$arg3, (int (*)(struct i2c_adapter*, short unsigned int))$arg4)")
    public static Ptr<i2c_client> i2c_new_scanned_device(Ptr<i2c_adapter> adap, Ptr<i2c_board_info> info2, Ptr<@Unsigned Short> addr_list, Ptr<?> probe2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_parse_fw_timings(Ptr<runtime.device> dev, Ptr<i2c_timings> t, boolean use_defaults) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_parse_timing(Ptr<runtime.device> dev, String prop_name, Ptr<@Unsigned Integer> cur_val_p, @Unsigned int def_val, boolean use_def) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_probe_func_quick_read(Ptr<i2c_adapter> adap, @Unsigned short addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_put_adapter(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_put_dma_safe_msg_buf(Ptr<Character> buf, Ptr<i2c_msg> msg, boolean xferred) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_recover_bus(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_register_adapter(Ptr<i2c_adapter> adap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_register_driver(Ptr<runtime.module> owner, Ptr<i2c_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_transfer(Ptr<i2c_adapter> adap, Ptr<i2c_msg> msgs, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="i2c_transfer_buffer_flags((const struct i2c_client*)$arg1, $arg2, $arg3, $arg4)")
    public static int i2c_transfer_buffer_flags(Ptr<i2c_client> client, String buf, int count, @Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int i2c_transfer_trace_reg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_transfer_trace_unreg() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_unlock_addr(Ptr<i2c_adapter> adap, @Unsigned short addr2, @Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void i2c_unregister_device(Ptr<i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_adapter> i2c_verify_adapter(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<i2c_client> i2c_verify_client(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_acpi_irq_context")
    @NotUsableInJava
    public static class i2c_acpi_irq_context
    extends Struct {
        public int irq;
        public boolean wake_capable;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_acpi_lookup")
    @NotUsableInJava
    public static class i2c_acpi_lookup
    extends Struct {
        public Ptr<i2c_board_info> info;
        public @OriginalName(value="acpi_handle") Ptr<?> adapter_handle;
        public @OriginalName(value="acpi_handle") Ptr<?> device_handle;
        public @OriginalName(value="acpi_handle") Ptr<?> search_handle;
        public int n;
        public int index;
        public @Unsigned int speed;
        public @Unsigned int min_speed;
        public @Unsigned int force_speed;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_acpi_handler_data")
    @NotUsableInJava
    public static class i2c_acpi_handler_data
    extends Struct {
        public AcpiDefinitions.acpi_connection_info info;
        public Ptr<i2c_adapter> adapter;
    }

    @Type(noCCodeGeneration=true, cType="enum i2c_driver_flags")
    public static enum i2c_driver_flags implements Enum<i2c_driver_flags>,
    TypedEnum<i2c_driver_flags, Integer>
    {
        I2C_DRV_ACPI_WAIVE_D0_PROBE;

    }

    @Type(noCCodeGeneration=true, cType="struct i2c_dw_semaphore_callbacks")
    @NotUsableInJava
    public static class i2c_dw_semaphore_callbacks
    extends Struct {
        public Ptr<?> probe;
        public Ptr<?> remove;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_rdwr_ioctl_data32")
    @NotUsableInJava
    public static class i2c_rdwr_ioctl_data32
    extends Struct {
        public @Unsigned @OriginalName(value="compat_caddr_t") int msgs;
        public @Unsigned int nmsgs;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_msg32")
    @NotUsableInJava
    public static class i2c_msg32
    extends Struct {
        public @Unsigned short addr;
        public @Unsigned short flags;
        public @Unsigned short len;
        public @Unsigned @OriginalName(value="compat_caddr_t") int buf;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_smbus_ioctl_data32")
    @NotUsableInJava
    public static class i2c_smbus_ioctl_data32
    extends Struct {
        public char read_write;
        public char command;
        public @Unsigned int size;
        public @Unsigned @OriginalName(value="compat_caddr_t") int data;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_dev")
    @NotUsableInJava
    public static class i2c_dev
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<i2c_adapter> adap;
        public runtime.device dev;
        public runtime.cdev cdev;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_rdwr_ioctl_data")
    @NotUsableInJava
    public static class i2c_rdwr_ioctl_data
    extends Struct {
        public Ptr<i2c_msg> msgs;
        public @Unsigned int nmsgs;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_smbus_ioctl_data")
    @NotUsableInJava
    public static class i2c_smbus_ioctl_data
    extends Struct {
        public char read_write;
        public char command;
        public @Unsigned int size;
        public Ptr<i2c_smbus_data> data;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_smbus_alert_setup")
    @NotUsableInJava
    public static class i2c_smbus_alert_setup
    extends Struct {
        public int irq;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_cmd_arg")
    @NotUsableInJava
    public static class i2c_cmd_arg
    extends Struct {
        public @Unsigned int cmd;
        public Ptr<?> arg;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_devinfo")
    @NotUsableInJava
    public static class i2c_devinfo
    extends Struct {
        public ListDefinitions.list_head list;
        public int busnum;
        public i2c_board_info board_info;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_timings")
    @NotUsableInJava
    public static class i2c_timings
    extends Struct {
        public @Unsigned int bus_freq_hz;
        public @Unsigned int scl_rise_ns;
        public @Unsigned int scl_fall_ns;
        public @Unsigned int scl_int_delay_ns;
        public @Unsigned int sda_fall_ns;
        public @Unsigned int sda_hold_ns;
        public @Unsigned int digital_filter_width_ns;
        public @Unsigned int analog_filter_cutoff_freq_hz;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_device_identity")
    @NotUsableInJava
    public static class i2c_device_identity
    extends Struct {
        public @Unsigned short manufacturer_id;
        public @Unsigned short part_id;
        public char die_revision;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_adapter_quirks")
    @NotUsableInJava
    public static class i2c_adapter_quirks
    extends Struct {
        public @Unsigned long flags;
        public int max_num_msgs;
        public @Unsigned short max_write_len;
        public @Unsigned short max_read_len;
        public @Unsigned short max_comb_1st_msg_len;
        public @Unsigned short max_comb_2nd_msg_len;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_bus_recovery_info")
    @NotUsableInJava
    public static class i2c_bus_recovery_info
    extends Struct {
        public Ptr<?> recover_bus;
        public Ptr<?> get_scl;
        public Ptr<?> set_scl;
        public Ptr<?> get_sda;
        public Ptr<?> set_sda;
        public Ptr<?> get_bus_free;
        public Ptr<?> prepare_recovery;
        public Ptr<?> unprepare_recovery;
        public Ptr<GpioDefinitions.gpio_desc> scl_gpiod;
        public Ptr<GpioDefinitions.gpio_desc> sda_gpiod;
        public Ptr<runtime.pinctrl> pinctrl;
        public Ptr<PinctrlDefinitions.pinctrl_state> pins_default;
        public Ptr<PinctrlDefinitions.pinctrl_state> pins_gpio;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_lock_operations")
    @NotUsableInJava
    public static class i2c_lock_operations
    extends Struct {
        public Ptr<?> lock_bus;
        public Ptr<?> trylock_bus;
        public Ptr<?> unlock_bus;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_algorithm")
    @NotUsableInJava
    public static class i2c_algorithm
    extends Struct {
        @InlineUnion(value=18949)
        public @InlineUnion(value=18949) Ptr<?> xfer;
        @InlineUnion(value=18949)
        public @InlineUnion(value=18949) Ptr<?> master_xfer;
        @InlineUnion(value=18953)
        public @InlineUnion(value=18953) Ptr<?> xfer_atomic;
        @InlineUnion(value=18953)
        public @InlineUnion(value=18953) Ptr<?> master_xfer_atomic;
        public Ptr<?> smbus_xfer;
        public Ptr<?> smbus_xfer_atomic;
        public Ptr<?> functionality;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_adapter")
    @NotUsableInJava
    public static class i2c_adapter
    extends Struct {
        public Ptr<runtime.module> owner;
        public @Unsigned int _class;
        public Ptr<i2c_algorithm> algo;
        public Ptr<?> algo_data;
        public Ptr<i2c_lock_operations> lock_ops;
        public RtDefinitions.rt_mutex bus_lock;
        public RtDefinitions.rt_mutex mux_lock;
        public int timeout;
        public int retries;
        public runtime.device dev;
        public @Unsigned long locked_flags;
        public int nr;
        public char @Size(value=48) [] name;
        public runtime.completion dev_released;
        public runtime.mutex userspace_clients_lock;
        public ListDefinitions.list_head userspace_clients;
        public Ptr<i2c_bus_recovery_info> bus_recovery_info;
        public Ptr<i2c_adapter_quirks> quirks;
        public Ptr<IrqDefinitions.irq_domain> host_notify_domain;
        public Ptr<runtime.regulator> bus_regulator;
        public Ptr<runtime.dentry> debugfs;
        public @Unsigned long @Size(value=2) [] addrs_in_instantiation;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_board_info")
    @NotUsableInJava
    public static class i2c_board_info
    extends Struct {
        public char @Size(value=20) [] type;
        public @Unsigned short flags;
        public @Unsigned short addr;
        public String dev_name;
        public Ptr<?> platform_data;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public Ptr<SoftwareDefinitions.software_node> swnode;
        public Ptr<runtime.resource> resources;
        public @Unsigned int num_resources;
        public int irq;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_driver")
    @NotUsableInJava
    public static class i2c_driver
    extends Struct {
        public @Unsigned int _class;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public Ptr<?> alert;
        public Ptr<?> command;
        public DeviceDefinitions.device_driver driver;
        public Ptr<i2c_device_id> id_table;
        public Ptr<?> detect;
        public Ptr<@Unsigned Short> address_list;
        public ListDefinitions.list_head clients;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum i2c_alert_protocol")
    public static enum i2c_alert_protocol implements Enum<i2c_alert_protocol>,
    TypedEnum<i2c_alert_protocol, Integer>
    {
        I2C_PROTOCOL_SMBUS_ALERT,
        I2C_PROTOCOL_SMBUS_HOST_NOTIFY;

    }

    @Type(noCCodeGeneration=true, cType="struct i2c_client")
    @NotUsableInJava
    public static class i2c_client
    extends Struct {
        public @Unsigned short flags;
        public @Unsigned short addr;
        public char @Size(value=20) [] name;
        public Ptr<i2c_adapter> adapter;
        public runtime.device dev;
        public int init_irq;
        public int irq;
        public ListDefinitions.list_head detected;
        public Ptr<?> devres_group_id;
    }

    @Type(noCCodeGeneration=true, cType="union i2c_smbus_data")
    @NotUsableInJava
    public static class i2c_smbus_data
    extends Union {
        public char _byte;
        public @Unsigned short word;
        public char @Size(value=34) [] block;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_msg")
    @NotUsableInJava
    public static class i2c_msg
    extends Struct {
        public @Unsigned short addr;
        public @Unsigned short flags;
        public @Unsigned short len;
        public Ptr<Character> buf;
    }

    @Type(noCCodeGeneration=true, cType="struct i2c_device_id")
    @NotUsableInJava
    public static class i2c_device_id
    extends Struct {
        public char @Size(value=20) [] name;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }
}

