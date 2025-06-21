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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NvmemDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_get_mac_address(Ptr<runtime.device> dev, Ptr<?> addrbuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __nvmem_cell_entry_write(Ptr<nvmem_cell_entry> cell, Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__nvmem_device_get($arg1, (int (*)(struct device*, const void*))$arg2)")
    public static Ptr<nvmem_device> __nvmem_device_get(Ptr<?> data, Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __nvmem_device_put(Ptr<nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_access_with_keepouts(Ptr<nvmem_device> nvmem, @Unsigned int offset, Ptr<?> val, @Unsigned long bytes, int write2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_add_cell_lookups(Ptr<nvmem_cell_lookup> entries, @Unsigned long nentries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_add_cell_table(Ptr<nvmem_cell_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_add_one_cell($arg1, (const struct nvmem_cell_info*)$arg2)")
    public static int nvmem_add_one_cell(Ptr<nvmem_device> nvmem, Ptr<nvmem_cell_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short nvmem_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short nvmem_bin_attr_get_umode(Ptr<nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short nvmem_bin_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long nvmem_cell_attr_read(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_get($arg1, (const u8*)$arg2)")
    public static Ptr<nvmem_cell> nvmem_cell_get(Ptr<runtime.device> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_get_from_lookup($arg1, (const u8*)$arg2)")
    public static Ptr<nvmem_cell> nvmem_cell_get_from_lookup(Ptr<runtime.device> dev, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_info_to_nvmem_cell_entry_nodup($arg1, (const struct nvmem_cell_info*)$arg2, $arg3)")
    public static int nvmem_cell_info_to_nvmem_cell_entry_nodup(Ptr<nvmem_device> nvmem, Ptr<nvmem_cell_info> info2, Ptr<nvmem_cell_entry> cell) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> nvmem_cell_prepare_write_buffer(Ptr<nvmem_cell_entry> cell, Ptr<Character> _buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_cell_put(Ptr<nvmem_cell> cell) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> nvmem_cell_read(Ptr<nvmem_cell> cell, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_read_common($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int nvmem_cell_read_common(Ptr<runtime.device> dev, String cell_id, Ptr<?> val, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_read_u16($arg1, (const u8*)$arg2, $arg3)")
    public static int nvmem_cell_read_u16(Ptr<runtime.device> dev, String cell_id, Ptr<@Unsigned Short> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_read_u32($arg1, (const u8*)$arg2, $arg3)")
    public static int nvmem_cell_read_u32(Ptr<runtime.device> dev, String cell_id, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_read_u64($arg1, (const u8*)$arg2, $arg3)")
    public static int nvmem_cell_read_u64(Ptr<runtime.device> dev, String cell_id, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_read_u8($arg1, (const u8*)$arg2, $arg3)")
    public static int nvmem_cell_read_u8(Ptr<runtime.device> dev, String cell_id, Ptr<Character> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)nvmem_cell_read_variable_common($arg1, (const u8*)$arg2, $arg3, $arg4))")
    public static Ptr<?> nvmem_cell_read_variable_common(Ptr<runtime.device> dev, String cell_id, @Unsigned long max_len, Ptr<@Unsigned Long> len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_read_variable_le_u32($arg1, (const u8*)$arg2, $arg3)")
    public static int nvmem_cell_read_variable_le_u32(Ptr<runtime.device> dev, String cell_id, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_cell_read_variable_le_u64($arg1, (const u8*)$arg2, $arg3)")
    public static int nvmem_cell_read_variable_le_u64(Ptr<runtime.device> dev, String cell_id, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_cell_write(Ptr<nvmem_cell> cell, Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_create_cell($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<nvmem_cell> nvmem_create_cell(Ptr<nvmem_cell_entry> entry, String id, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_del_cell_lookups(Ptr<nvmem_cell_lookup> entries, @Unsigned long nentries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_del_cell_table(Ptr<nvmem_cell_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)nvmem_dev_name($arg1))")
    public static String nvmem_dev_name(Ptr<nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long nvmem_dev_size(Ptr<nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long nvmem_device_cell_read(Ptr<nvmem_device> nvmem, Ptr<nvmem_cell_info> info2, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_device_cell_write(Ptr<nvmem_device> nvmem, Ptr<nvmem_cell_info> info2, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_device_find($arg1, (int (*)(struct device*, const void*))$arg2)")
    public static Ptr<nvmem_device> nvmem_device_find(Ptr<?> data, Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_device_get($arg1, (const u8*)$arg2)")
    public static Ptr<nvmem_device> nvmem_device_get(Ptr<runtime.device> dev, String dev_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_device_put(Ptr<nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_device_read(Ptr<nvmem_device> nvmem, @Unsigned int offset, @Unsigned long bytes, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_device_remove_all_cells((const struct nvmem_device*)$arg1)")
    public static void nvmem_device_remove_all_cells(Ptr<nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_device_write(Ptr<nvmem_device> nvmem, @Unsigned int offset, @Unsigned long bytes, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_layout_register(Ptr<nvmem_layout> layout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_layout_unregister(Ptr<nvmem_layout> layout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_populate_sysfs_cells(Ptr<nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_reg_read(Ptr<nvmem_device> nvmem, @Unsigned int offset, Ptr<?> val, @Unsigned long bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="nvmem_register((const struct nvmem_config*)$arg1)")
    public static Ptr<nvmem_device> nvmem_register(Ptr<nvmem_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_register_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_shift_read_buffer_in_place(Ptr<nvmem_cell_entry> cell, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void nvmem_unregister(Ptr<nvmem_device> nvmem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int nvmem_unregister_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_cell")
    @NotUsableInJava
    public static class nvmem_cell
    extends Struct {
        public Ptr<nvmem_cell_entry> entry;
        public String id;
        public int index;
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_cell_entry")
    @NotUsableInJava
    public static class nvmem_cell_entry
    extends Struct {
        public String name;
        public int offset;
        public @Unsigned long raw_len;
        public int bytes;
        public int bit_offset;
        public int nbits;
        public @OriginalName(value="nvmem_cell_post_process_t") Ptr<?> read_post_process;
        public Ptr<?> priv;
        public Ptr<DeviceDefinitions.device_node> np;
        public Ptr<nvmem_device> nvmem;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_cell_table")
    @NotUsableInJava
    public static class nvmem_cell_table
    extends Struct {
        public String nvmem_name;
        public Ptr<nvmem_cell_info> cells;
        public @Unsigned long ncells;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_device")
    @NotUsableInJava
    public static class nvmem_device
    extends Struct {
        public Ptr<runtime.module> owner;
        public runtime.device dev;
        public ListDefinitions.list_head node;
        public int stride;
        public int word_size;
        public int id;
        public runtime.kref refcnt;
        public @Unsigned long size;
        public boolean read_only;
        public boolean root_only;
        public int flags;
        public nvmem_type type;
        public misc.bin_attribute eeprom;
        public Ptr<runtime.device> base_dev;
        public ListDefinitions.list_head cells;
        public Ptr<?> fixup_dt_cell_info;
        public Ptr<nvmem_keepout> keepout;
        public @Unsigned int nkeepout;
        public @OriginalName(value="nvmem_reg_read_t") Ptr<?> reg_read;
        public @OriginalName(value="nvmem_reg_write_t") Ptr<?> reg_write;
        public Ptr<GpioDefinitions.gpio_desc> wp_gpio;
        public Ptr<nvmem_layout> layout;
        public Ptr<?> priv;
        public boolean sysfs_cells_populated;
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_cell_lookup")
    @NotUsableInJava
    public static class nvmem_cell_lookup
    extends Struct {
        public String nvmem_name;
        public String cell_name;
        public String dev_id;
        public String con_id;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_layout")
    @NotUsableInJava
    public static class nvmem_layout
    extends Struct {
        public runtime.device dev;
        public Ptr<nvmem_device> nvmem;
        public Ptr<?> add_cells;
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_config")
    @NotUsableInJava
    public static class nvmem_config
    extends Struct {
        public Ptr<runtime.device> dev;
        public String name;
        public int id;
        public Ptr<runtime.module> owner;
        public Ptr<nvmem_cell_info> cells;
        public int ncells;
        public boolean add_legacy_fixed_of_cells;
        public Ptr<?> fixup_dt_cell_info;
        public Ptr<nvmem_keepout> keepout;
        public @Unsigned int nkeepout;
        public nvmem_type type;
        public boolean read_only;
        public boolean root_only;
        public boolean ignore_wp;
        public Ptr<nvmem_layout> layout;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public @OriginalName(value="nvmem_reg_read_t") Ptr<?> reg_read;
        public @OriginalName(value="nvmem_reg_write_t") Ptr<?> reg_write;
        public int size;
        public int word_size;
        public int stride;
        public Ptr<?> priv;
        public boolean compat;
        public Ptr<runtime.device> base_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_cell_info")
    @NotUsableInJava
    public static class nvmem_cell_info
    extends Struct {
        public String name;
        public @Unsigned int offset;
        public @Unsigned long raw_len;
        public @Unsigned int bytes;
        public @Unsigned int bit_offset;
        public @Unsigned int nbits;
        public Ptr<DeviceDefinitions.device_node> np;
        public @OriginalName(value="nvmem_cell_post_process_t") Ptr<?> read_post_process;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct nvmem_keepout")
    @NotUsableInJava
    public static class nvmem_keepout
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int end;
        public char value;
    }

    @Type(noCCodeGeneration=true, cType="enum nvmem_type")
    public static enum nvmem_type implements Enum<nvmem_type>,
    TypedEnum<nvmem_type, Integer>
    {
        NVMEM_TYPE_UNKNOWN,
        NVMEM_TYPE_EEPROM,
        NVMEM_TYPE_OTP,
        NVMEM_TYPE_BATTERY_BACKED,
        NVMEM_TYPE_FRAM;

    }
}

