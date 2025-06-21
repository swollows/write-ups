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
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RegDefinitions;
import me.bechberger.ebpf.runtime.RegcacheDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RegmapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__regmap_init_i2c($arg1, (const struct regmap_config*)$arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<runtime.regmap> __regmap_init_i2c(Ptr<I2cDefinitions.i2c_client> i2c, Ptr<regmap_config> config, Ptr<LockDefinitions.lock_class_key> lock_key, String lock_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct regmap_bus*)regmap_get_i2c_bus($arg1, (const struct regmap_config*)$arg2))")
    public static Ptr<regmap_bus> regmap_get_i2c_bus(Ptr<I2cDefinitions.i2c_client> i2c, Ptr<regmap_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_i2c_gather_write($arg1, (const void*)$arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int regmap_i2c_gather_write(Ptr<?> context2, Ptr<?> reg, @Unsigned long reg_size, Ptr<?> val, @Unsigned long val_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_i2c_read($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int regmap_i2c_read(Ptr<?> context2, Ptr<?> reg, @Unsigned long reg_size, Ptr<?> val, @Unsigned long val_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_i2c_smbus_i2c_read($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int regmap_i2c_smbus_i2c_read(Ptr<?> context2, Ptr<?> reg, @Unsigned long reg_size, Ptr<?> val, @Unsigned long val_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_i2c_smbus_i2c_read_reg16($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int regmap_i2c_smbus_i2c_read_reg16(Ptr<?> context2, Ptr<?> reg, @Unsigned long reg_size, Ptr<?> val, @Unsigned long val_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_i2c_smbus_i2c_write($arg1, (const void*)$arg2, $arg3)")
    public static int regmap_i2c_smbus_i2c_write(Ptr<?> context2, Ptr<?> data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_i2c_smbus_i2c_write_reg16($arg1, (const void*)$arg2, $arg3)")
    public static int regmap_i2c_smbus_i2c_write_reg16(Ptr<?> context2, Ptr<?> data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_i2c_write($arg1, (const void*)$arg2, $arg3)")
    public static int regmap_i2c_write(Ptr<?> context2, Ptr<?> data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_smbus_byte_reg_read(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_smbus_byte_reg_write(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_smbus_word_read_swapped(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_smbus_word_reg_read(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_smbus_word_reg_write(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_smbus_word_write_swapped(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__regmap_init($arg1, (const struct regmap_bus*)$arg2, $arg3, (const struct regmap_config*)$arg4, $arg5, (const u8*)$arg6)")
    public static Ptr<runtime.regmap> __regmap_init(Ptr<runtime.device> dev, Ptr<regmap_bus> bus, Ptr<?> bus_context, Ptr<regmap_config> config, Ptr<LockDefinitions.lock_class_key> lock_key, String lock_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_bulk_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<@Unsigned Integer> regs, Ptr<?> val, @Unsigned long val_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_bus_formatted_write(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_bus_raw_write(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_bus_read(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_bus_reg_read(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_bus_reg_write(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_regmap_multi_reg_write($arg1, (const struct reg_sequence*)$arg2, $arg3)")
    public static int _regmap_multi_reg_write(Ptr<runtime.regmap> map2, Ptr<RegDefinitions.reg_sequence> regs, @Unsigned long num_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_range_multi_paged_reg_write(Ptr<runtime.regmap> map2, Ptr<RegDefinitions.reg_sequence> regs, @Unsigned long num_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_regmap_raw_multi_reg_write($arg1, (const struct reg_sequence*)$arg2, $arg3)")
    public static int _regmap_raw_multi_reg_write(Ptr<runtime.regmap> map2, Ptr<RegDefinitions.reg_sequence> regs, @Unsigned long num_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_raw_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned int val_len, boolean noinc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_regmap_raw_write($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int _regmap_raw_write(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_len, boolean noinc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="_regmap_raw_write_impl($arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int _regmap_raw_write_impl(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_len, boolean noinc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_select_page(Ptr<runtime.regmap> map2, Ptr<@Unsigned Integer> reg, Ptr<regmap_range_node> range2, @Unsigned int val_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_update_bits(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int mask, @Unsigned int val, Ptr<@OriginalName(value="bool") Boolean> change, boolean force_write) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _regmap_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_add_irq_chip($arg1, $arg2, $arg3, $arg4, (const struct regmap_irq_chip*)$arg5, $arg6)")
    public static int regmap_add_irq_chip(Ptr<runtime.regmap> map2, int irq, int irq_flags, int irq_base, Ptr<regmap_irq_chip> chip, Ptr<Ptr<regmap_irq_chip_data>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_add_irq_chip_fwnode($arg1, $arg2, $arg3, $arg4, $arg5, (const struct regmap_irq_chip*)$arg6, $arg7)")
    public static int regmap_add_irq_chip_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<runtime.regmap> map2, int irq, int irq_flags, int irq_base, Ptr<regmap_irq_chip> chip, Ptr<Ptr<regmap_irq_chip_data>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_async_complete(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_async_complete_cb(Ptr<regmap_async> async2, int ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_attach_dev($arg1, $arg2, (const struct regmap_config*)$arg3)")
    public static int regmap_attach_dev(Ptr<runtime.device> dev, Ptr<runtime.regmap> map2, Ptr<regmap_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_bulk_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_bulk_write($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int regmap_bulk_write(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_cached(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_can_raw_write(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_check_range_table($arg1, $arg2, (const struct regmap_access_table*)$arg3)")
    public static boolean regmap_check_range_table(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<regmap_access_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_del_irq_chip(int irq, Ptr<regmap_irq_chip_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_exit(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<regmap_field> regmap_field_alloc(Ptr<runtime.regmap> regmap2, RegDefinitions.reg_field reg_field2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_field_bulk_alloc($arg1, $arg2, (const struct reg_field*)$arg3, $arg4)")
    public static int regmap_field_bulk_alloc(Ptr<runtime.regmap> regmap2, Ptr<Ptr<regmap_field>> rm_field, Ptr<RegDefinitions.reg_field> reg_field2, int num_fields) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_field_bulk_free(Ptr<regmap_field> field) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_field_free(Ptr<regmap_field> field) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_field_read(Ptr<regmap_field> field, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_field_test_bits(Ptr<regmap_field> field, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_field_update_bits_base(Ptr<regmap_field> field, @Unsigned int mask, @Unsigned int val, Ptr<@OriginalName(value="bool") Boolean> change, boolean async2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_fields_read(Ptr<regmap_field> field, @Unsigned int id, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_fields_update_bits_base(Ptr<regmap_field> field, @Unsigned int id, @Unsigned int mask, @Unsigned int val, Ptr<@OriginalName(value="bool") Boolean> change, boolean async2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_10_14_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_12_20_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_16_be(Ptr<?> buf, @Unsigned int val, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_16_le(Ptr<?> buf, @Unsigned int val, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_16_native(Ptr<?> buf, @Unsigned int val, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_24_be(Ptr<?> buf, @Unsigned int val, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_2_6_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_32_be(Ptr<?> buf, @Unsigned int val, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_32_le(Ptr<?> buf, @Unsigned int val, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_32_native(Ptr<?> buf, @Unsigned int val, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_4_12_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_7_17_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_7_9_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_format_8(Ptr<?> buf, @Unsigned int val, @Unsigned int shift) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> regmap_get_device(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_get_max_register(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long regmap_get_raw_read_max(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long regmap_get_raw_write_max(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_get_reg_stride(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_get_val_bytes(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_get_val_endian($arg1, (const struct regmap_bus*)$arg2, (const struct regmap_config*)$arg3)")
    public static regmap_endian regmap_get_val_endian(Ptr<runtime.device> dev, Ptr<regmap_bus> bus, Ptr<regmap_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_initcall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_irq_chip_get_base(Ptr<regmap_irq_chip_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_irq_disable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_irq_enable(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<IrqDefinitions.irq_domain> regmap_irq_get_domain(Ptr<regmap_irq_chip_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_irq_get_irq_reg_linear(Ptr<regmap_irq_chip_data> data, @Unsigned int base, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_irq_get_virq(Ptr<regmap_irq_chip_data> data, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_irq_lock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_irq_map(Ptr<IrqDefinitions.irq_domain> h, @Unsigned int virq, @Unsigned @OriginalName(value="irq_hw_number_t") long hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_irq_set_type(Ptr<IrqDefinitions.irq_data> data, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_irq_set_type_config_simple($arg1, $arg2, (const struct regmap_irq*)$arg3, $arg4, $arg5)")
    public static int regmap_irq_set_type_config_simple(Ptr<Ptr<@Unsigned Integer>> buf, @Unsigned int type2, Ptr<regmap_irq> irq_data2, int idx, Ptr<?> irq_drv_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_irq_set_wake(Ptr<IrqDefinitions.irq_data> data, @Unsigned int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_irq_sync_unlock(Ptr<IrqDefinitions.irq_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn regmap_irq_thread(int irq, Ptr<?> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_lock_hwlock(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_lock_hwlock_irq(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_lock_hwlock_irqsave(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_lock_mutex(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_lock_raw_spinlock(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_lock_spinlock(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_lock_unlock_none(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_might_sleep(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_multi_reg_read(Ptr<runtime.regmap> map2, Ptr<@Unsigned Integer> regs, Ptr<?> val, @Unsigned long val_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_multi_reg_write($arg1, (const struct reg_sequence*)$arg2, $arg3)")
    public static int regmap_multi_reg_write(Ptr<runtime.regmap> map2, Ptr<RegDefinitions.reg_sequence> regs, int num_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_multi_reg_write_bypassed($arg1, (const struct reg_sequence*)$arg2, $arg3)")
    public static int regmap_multi_reg_write_bypassed(Ptr<runtime.regmap> map2, Ptr<RegDefinitions.reg_sequence> regs, int num_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_noinc_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_noinc_readwrite(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned int val_len, boolean write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_noinc_write($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int regmap_noinc_write(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_16_be((const void*)$arg1)")
    public static @Unsigned int regmap_parse_16_be(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_parse_16_be_inplace(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_16_le((const void*)$arg1)")
    public static @Unsigned int regmap_parse_16_le(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_parse_16_le_inplace(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_16_native((const void*)$arg1)")
    public static @Unsigned int regmap_parse_16_native(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_24_be((const void*)$arg1)")
    public static @Unsigned int regmap_parse_24_be(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_32_be((const void*)$arg1)")
    public static @Unsigned int regmap_parse_32_be(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_parse_32_be_inplace(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_32_le((const void*)$arg1)")
    public static @Unsigned int regmap_parse_32_le(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_parse_32_le_inplace(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_32_native((const void*)$arg1)")
    public static @Unsigned int regmap_parse_32_native(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_8((const void*)$arg1)")
    public static @Unsigned int regmap_parse_8(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_parse_inplace_noop(Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_parse_val($arg1, (const void*)$arg2, $arg3)")
    public static int regmap_parse_val(Ptr<runtime.regmap> map2, Ptr<?> buf, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_precious(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_raw_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_raw_write($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int regmap_raw_write(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_raw_write_async($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int regmap_raw_write_async(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_read(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_read_bypassed(Ptr<runtime.regmap> map2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_readable(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_readable_noinc(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_reg_in_ranges($arg1, (const struct regmap_range*)$arg2, $arg3)")
    public static boolean regmap_reg_in_ranges(@Unsigned int reg, Ptr<regmap_range> ranges, @Unsigned int nranges) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_register_patch($arg1, (const struct reg_sequence*)$arg2, $arg3)")
    public static int regmap_register_patch(Ptr<runtime.regmap> map2, Ptr<RegDefinitions.reg_sequence> regs, int num_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_reinit_cache($arg1, (const struct regmap_config*)$arg2)")
    public static int regmap_reinit_cache(Ptr<runtime.regmap> map2, Ptr<regmap_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_set_work_buf_flag_mask(Ptr<runtime.regmap> map2, int max_bytes, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_test_bits(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_unlock_hwlock(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_unlock_hwlock_irq(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_unlock_hwlock_irqrestore(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_unlock_mutex(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_unlock_raw_spinlock(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_unlock_spinlock(Ptr<?> __map) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_update_bits_base(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int mask, @Unsigned int val, Ptr<@OriginalName(value="bool") Boolean> change, boolean async2, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_volatile(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_write(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_write_async(Ptr<runtime.regmap> map2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_writeable(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean regmap_writeable_noinc(Ptr<runtime.regmap> map2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__regmap_init_mmio_clk($arg1, (const u8*)$arg2, $arg3, (const struct regmap_config*)$arg4, $arg5, (const u8*)$arg6)")
    public static Ptr<runtime.regmap> __regmap_init_mmio_clk(Ptr<runtime.device> dev, String clk_id, Ptr<?> regs, Ptr<regmap_config> config, Ptr<LockDefinitions.lock_class_key> lock_key, String lock_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_access_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_access_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> ignored) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_cache_bypass_write_file($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long regmap_cache_bypass_write_file(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_cache_only_write_file($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long regmap_cache_only_write_file(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_debugfs_exit(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_debugfs_free_dump_cache(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_debugfs_init(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_debugfs_initcall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long regmap_map_read_file(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_mmio_attach_clk(Ptr<runtime.regmap> map2, Ptr<runtime.clk> clk2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_detach_clk(Ptr<runtime.regmap> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_free_context(Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_mmio_gen_context($arg1, (const u8*)$arg2, $arg3, (const struct regmap_config*)$arg4)")
    public static Ptr<regmap_mmio_context> regmap_mmio_gen_context(Ptr<runtime.device> dev, String clk_id, Ptr<?> regs, Ptr<regmap_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_ioread16be(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_ioread16le(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_ioread32be(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_ioread32le(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_ioread8(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_iowrite16be(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_iowrite16le(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_iowrite32be(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_iowrite32le(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_iowrite8(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_mmio_noinc_read(Ptr<?> context2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_mmio_noinc_write($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int regmap_mmio_noinc_write(Ptr<?> context2, @Unsigned int reg, Ptr<?> val, @Unsigned long val_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_mmio_read(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_read16be(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_read16le(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_read16le_relaxed(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_read32be(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_read32le(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_read32le_relaxed(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_read8(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int regmap_mmio_read8_relaxed(Ptr<regmap_mmio_context> ctx, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int regmap_mmio_write(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_write16be(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_write16le(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_write16le_relaxed(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_write32be(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_write32le(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_write32le_relaxed(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_write8(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_mmio_write8_relaxed(Ptr<regmap_mmio_context> ctx, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long regmap_name_read_file(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long regmap_range_read_file(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long regmap_read_debugfs(Ptr<runtime.regmap> map2, @Unsigned int from, @Unsigned int to, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long regmap_reg_ranges_read_file(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__regmap_init_spi($arg1, (const struct regmap_config*)$arg2, $arg3, (const u8*)$arg4)")
    public static Ptr<runtime.regmap> __regmap_init_spi(Ptr<SpiDefinitions.spi_device> spi, Ptr<regmap_config> config, Ptr<LockDefinitions.lock_class_key> lock_key, String lock_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct regmap_bus*)regmap_get_spi_bus($arg1, (const struct regmap_config*)$arg2))")
    public static Ptr<regmap_bus> regmap_get_spi_bus(Ptr<SpiDefinitions.spi_device> spi, Ptr<regmap_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<regmap_async> regmap_spi_async_alloc() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_spi_async_write($arg1, (const void*)$arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int regmap_spi_async_write(Ptr<?> context2, Ptr<?> reg, @Unsigned long reg_len, Ptr<?> val, @Unsigned long val_len, Ptr<regmap_async> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void regmap_spi_complete(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_spi_gather_write($arg1, (const void*)$arg2, $arg3, (const void*)$arg4, $arg5)")
    public static int regmap_spi_gather_write(Ptr<?> context2, Ptr<?> reg, @Unsigned long reg_len, Ptr<?> val, @Unsigned long val_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_spi_read($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int regmap_spi_read(Ptr<?> context2, Ptr<?> reg, @Unsigned long reg_size, Ptr<?> val, @Unsigned long val_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="regmap_spi_write($arg1, (const void*)$arg2, $arg3)")
    public static int regmap_spi_write(Ptr<?> context2, Ptr<?> data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_mmio_context")
    @NotUsableInJava
    public static class regmap_mmio_context
    extends Struct {
        public Ptr<?> regs;
        public @Unsigned int val_bytes;
        public boolean big_endian;
        public boolean attached_clk;
        public Ptr<runtime.clk> clk;
        public Ptr<?> reg_write;
        public Ptr<?> reg_read;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_debugfs_node")
    @NotUsableInJava
    public static class regmap_debugfs_node
    extends Struct {
        public Ptr<runtime.regmap> map;
        public ListDefinitions.list_head link;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_debugfs_off_cache")
    @NotUsableInJava
    public static class regmap_debugfs_off_cache
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="off_t") long min;
        public @OriginalName(value="off_t") long max;
        public @Unsigned int base_reg;
        public @Unsigned int max_reg;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_irq_chip_data")
    @NotUsableInJava
    public static class regmap_irq_chip_data
    extends Struct {
        public runtime.mutex lock;
        public IrqDefinitions.irq_chip irq_chip;
        public Ptr<runtime.regmap> map;
        public Ptr<regmap_irq_chip> chip;
        public int irq_base;
        public Ptr<IrqDefinitions.irq_domain> domain;
        public int irq;
        public int wake_count;
        public Ptr<?> status_reg_buf;
        public Ptr<@Unsigned Integer> main_status_buf;
        public Ptr<@Unsigned Integer> status_buf;
        public Ptr<@Unsigned Integer> mask_buf;
        public Ptr<@Unsigned Integer> mask_buf_def;
        public Ptr<@Unsigned Integer> wake_buf;
        public Ptr<@Unsigned Integer> type_buf;
        public Ptr<@Unsigned Integer> type_buf_def;
        public Ptr<Ptr<@Unsigned Integer>> config_buf;
        public @Unsigned int irq_reg_stride;
        public Ptr<?> get_irq_reg;
        public @Unsigned int clear_status;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_field")
    @NotUsableInJava
    public static class regmap_field
    extends Struct {
        public Ptr<runtime.regmap> regmap;
        public @Unsigned int mask;
        public @Unsigned int shift;
        public @Unsigned int reg;
        public @Unsigned int id_size;
        public @Unsigned int id_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_async_spi")
    @NotUsableInJava
    public static class regmap_async_spi
    extends Struct {
        public regmap_async core;
        public SpiDefinitions.spi_message m;
        public SpiDefinitions.spi_transfer @Size(value=2) [] t;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_range_node")
    @NotUsableInJava
    public static class regmap_range_node
    extends Struct {
        public RbDefinitions.rb_node node;
        public String name;
        public Ptr<runtime.regmap> map;
        public @Unsigned int range_min;
        public @Unsigned int range_max;
        public @Unsigned int selector_reg;
        public @Unsigned int selector_mask;
        public int selector_shift;
        public @Unsigned int window_start;
        public @Unsigned int window_len;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_format")
    @NotUsableInJava
    public static class regmap_format
    extends Struct {
        public @Unsigned long buf_size;
        public @Unsigned long reg_bytes;
        public @Unsigned long pad_bytes;
        public @Unsigned long val_bytes;
        public @OriginalName(value="s8") byte reg_shift;
        public Ptr<?> format_write;
        public Ptr<?> format_reg;
        public Ptr<?> format_val;
        public Ptr<?> parse_val;
        public Ptr<?> parse_inplace;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_bus")
    @NotUsableInJava
    public static class regmap_bus
    extends Struct {
        public boolean fast_io;
        public boolean free_on_exit;
        public @OriginalName(value="regmap_hw_write") Ptr<?> write;
        public @OriginalName(value="regmap_hw_gather_write") Ptr<?> gather_write;
        public @OriginalName(value="regmap_hw_async_write") Ptr<?> async_write;
        public @OriginalName(value="regmap_hw_reg_write") Ptr<?> reg_write;
        public @OriginalName(value="regmap_hw_reg_noinc_write") Ptr<?> reg_noinc_write;
        public @OriginalName(value="regmap_hw_reg_update_bits") Ptr<?> reg_update_bits;
        public @OriginalName(value="regmap_hw_read") Ptr<?> read;
        public @OriginalName(value="regmap_hw_reg_read") Ptr<?> reg_read;
        public @OriginalName(value="regmap_hw_reg_noinc_read") Ptr<?> reg_noinc_read;
        public @OriginalName(value="regmap_hw_free_context") Ptr<?> free_context;
        public @OriginalName(value="regmap_hw_async_alloc") Ptr<?> async_alloc;
        public char read_flag_mask;
        public regmap_endian reg_format_endian_default;
        public regmap_endian val_format_endian_default;
        public @Unsigned long max_raw_read;
        public @Unsigned long max_raw_write;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_async")
    @NotUsableInJava
    public static class regmap_async
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.regmap> map;
        public Ptr<?> work_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_irq_chip")
    @NotUsableInJava
    public static class regmap_irq_chip
    extends Struct {
        public String name;
        public String domain_suffix;
        public @Unsigned int main_status;
        public @Unsigned int num_main_status_bits;
        public Ptr<regmap_irq_sub_irq_map> sub_reg_offsets;
        public int num_main_regs;
        public @Unsigned int status_base;
        public @Unsigned int mask_base;
        public @Unsigned int unmask_base;
        public @Unsigned int ack_base;
        public @Unsigned int wake_base;
        public Ptr<@Unsigned Integer> config_base;
        public @Unsigned int irq_reg_stride;
        public @Unsigned int init_ack_masked;
        public @Unsigned int mask_unmask_non_inverted;
        public @Unsigned int use_ack;
        public @Unsigned int ack_invert;
        public @Unsigned int clear_ack;
        public @Unsigned int status_invert;
        public @Unsigned int wake_invert;
        public @Unsigned int type_in_mask;
        public @Unsigned int clear_on_unmask;
        public @Unsigned int runtime_pm;
        public @Unsigned int no_status;
        public int num_regs;
        public Ptr<regmap_irq> irqs;
        public int num_irqs;
        public int num_config_bases;
        public int num_config_regs;
        public Ptr<?> handle_pre_irq;
        public Ptr<?> handle_post_irq;
        public Ptr<?> handle_mask_sync;
        public Ptr<?> set_type_config;
        public Ptr<?> get_irq_reg;
        public Ptr<?> irq_drv_data;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_irq_sub_irq_map")
    @NotUsableInJava
    public static class regmap_irq_sub_irq_map
    extends Struct {
        public @Unsigned int num_regs;
        public Ptr<@Unsigned Integer> offset;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_irq")
    @NotUsableInJava
    public static class regmap_irq
    extends Struct {
        public @Unsigned int reg_offset;
        public @Unsigned int mask;
        public regmap_irq_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_irq_type")
    @NotUsableInJava
    public static class regmap_irq_type
    extends Struct {
        public @Unsigned int type_reg_offset;
        public @Unsigned int type_reg_mask;
        public @Unsigned int type_rising_val;
        public @Unsigned int type_falling_val;
        public @Unsigned int type_level_low_val;
        public @Unsigned int type_level_high_val;
        public @Unsigned int types_supported;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_range_cfg")
    @NotUsableInJava
    public static class regmap_range_cfg
    extends Struct {
        public String name;
        public @Unsigned int range_min;
        public @Unsigned int range_max;
        public @Unsigned int selector_reg;
        public @Unsigned int selector_mask;
        public int selector_shift;
        public @Unsigned int window_start;
        public @Unsigned int window_len;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_config")
    @NotUsableInJava
    public static class regmap_config
    extends Struct {
        public String name;
        public int reg_bits;
        public int reg_stride;
        public int reg_shift;
        public @Unsigned int reg_base;
        public int pad_bits;
        public int val_bits;
        public Ptr<?> writeable_reg;
        public Ptr<?> readable_reg;
        public Ptr<?> volatile_reg;
        public Ptr<?> precious_reg;
        public Ptr<?> writeable_noinc_reg;
        public Ptr<?> readable_noinc_reg;
        public Ptr<?> reg_read;
        public Ptr<?> reg_write;
        public Ptr<?> reg_update_bits;
        public Ptr<?> read;
        public Ptr<?> write;
        public @Unsigned long max_raw_read;
        public @Unsigned long max_raw_write;
        public boolean can_sleep;
        public boolean fast_io;
        public boolean io_port;
        public boolean disable_locking;
        public @OriginalName(value="regmap_lock") Ptr<?> lock;
        public @OriginalName(value="regmap_unlock") Ptr<?> unlock;
        public Ptr<?> lock_arg;
        public @Unsigned int max_register;
        public boolean max_register_is_0;
        public Ptr<regmap_access_table> wr_table;
        public Ptr<regmap_access_table> rd_table;
        public Ptr<regmap_access_table> volatile_table;
        public Ptr<regmap_access_table> precious_table;
        public Ptr<regmap_access_table> wr_noinc_table;
        public Ptr<regmap_access_table> rd_noinc_table;
        public Ptr<RegDefinitions.reg_default> reg_defaults;
        public @Unsigned int num_reg_defaults;
        public RegcacheDefinitions.regcache_type cache_type;
        public Ptr<?> reg_defaults_raw;
        public @Unsigned int num_reg_defaults_raw;
        public @Unsigned long read_flag_mask;
        public @Unsigned long write_flag_mask;
        public boolean zero_flag_mask;
        public boolean use_single_read;
        public boolean use_single_write;
        public boolean use_relaxed_mmio;
        public boolean can_multi_write;
        public boolean use_hwlock;
        public boolean use_raw_spinlock;
        public @Unsigned int hwlock_id;
        public @Unsigned int hwlock_mode;
        public regmap_endian reg_format_endian;
        public regmap_endian val_format_endian;
        public Ptr<regmap_range_cfg> ranges;
        public @Unsigned int num_ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_access_table")
    @NotUsableInJava
    public static class regmap_access_table
    extends Struct {
        public Ptr<regmap_range> yes_ranges;
        public @Unsigned int n_yes_ranges;
        public Ptr<regmap_range> no_ranges;
        public @Unsigned int n_no_ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct regmap_range")
    @NotUsableInJava
    public static class regmap_range
    extends Struct {
        public @Unsigned int range_min;
        public @Unsigned int range_max;
    }

    @Type(noCCodeGeneration=true, cType="enum regmap_endian")
    public static enum regmap_endian implements Enum<regmap_endian>,
    TypedEnum<regmap_endian, Integer>
    {
        REGMAP_ENDIAN_DEFAULT,
        REGMAP_ENDIAN_BIG,
        REGMAP_ENDIAN_LITTLE,
        REGMAP_ENDIAN_NATIVE;

    }
}

