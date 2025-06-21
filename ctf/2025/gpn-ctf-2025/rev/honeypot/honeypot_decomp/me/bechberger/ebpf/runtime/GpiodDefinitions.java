/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class GpiodDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_export(Ptr<GpioDefinitions.gpio_desc> desc, boolean direction_may_change) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_export_link($arg1, (const u8*)$arg2, $arg3)")
    public static int gpiod_export_link(Ptr<runtime.device> dev, String name, Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_unexport(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_add_hogs(Ptr<gpiod_hog> hogs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_add_lookup_table(Ptr<gpiod_lookup_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_add_lookup_tables(Ptr<Ptr<gpiod_lookup_table>> tables, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_cansleep((const struct gpio_desc*)$arg1)")
    public static int gpiod_cansleep(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_configure_flags($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int gpiod_configure_flags(Ptr<GpioDefinitions.gpio_desc> desc, String con_id, @Unsigned long lflags, gpiod_flags dflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_count($arg1, (const u8*)$arg2)")
    public static int gpiod_count(Ptr<runtime.device> dev, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_direction_input(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_direction_output(Ptr<GpioDefinitions.gpio_desc> desc, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_direction_output_raw(Ptr<GpioDefinitions.gpio_desc> desc, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_direction_output_raw_commit(Ptr<GpioDefinitions.gpio_desc> desc, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_disable_hw_timestamp_ns(Ptr<GpioDefinitions.gpio_desc> desc, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_enable_hw_timestamp_ns(Ptr<GpioDefinitions.gpio_desc> desc, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_find($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<GpioDefinitions.gpio_desc> gpiod_find(Ptr<runtime.device> dev, String con_id, @Unsigned int idx, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_find_and_request($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5, (const u8*)$arg6, $arg7)")
    public static Ptr<GpioDefinitions.gpio_desc> gpiod_find_and_request(Ptr<runtime.device> consumer, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String con_id, @Unsigned int idx, gpiod_flags flags, String label, boolean platform_lookup_allowed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<gpiod_lookup_table> gpiod_find_lookup_table(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_free(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_free_commit(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<GpioDefinitions.gpio_desc> gpiod_get(Ptr<runtime.device> dev, String con_id, gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_array($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<GpioDefinitions.gpio_descs> gpiod_get_array(Ptr<runtime.device> dev, String con_id, gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_array_optional($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<GpioDefinitions.gpio_descs> gpiod_get_array_optional(Ptr<runtime.device> dev, String con_id, gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_get_array_value(@Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_get_array_value_cansleep(@Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_get_array_value_complex(boolean raw, boolean can_sleep, @Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_get_direction(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_index($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<GpioDefinitions.gpio_desc> gpiod_get_index(Ptr<runtime.device> dev, String con_id, @Unsigned int idx, gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_index_optional($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<GpioDefinitions.gpio_desc> gpiod_get_index_optional(Ptr<runtime.device> dev, String con_id, @Unsigned int index2, gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)gpiod_get_label($arg1))")
    public static String gpiod_get_label(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_optional($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<GpioDefinitions.gpio_desc> gpiod_get_optional(Ptr<runtime.device> dev, String con_id, gpiod_flags flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_get_raw_array_value(@Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_get_raw_array_value_cansleep(@Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_raw_value((const struct gpio_desc*)$arg1)")
    public static int gpiod_get_raw_value(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_raw_value_cansleep((const struct gpio_desc*)$arg1)")
    public static int gpiod_get_raw_value_cansleep(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_raw_value_commit((const struct gpio_desc*)$arg1)")
    public static int gpiod_get_raw_value_commit(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_value((const struct gpio_desc*)$arg1)")
    public static int gpiod_get_value(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_get_value_cansleep((const struct gpio_desc*)$arg1)")
    public static int gpiod_get_value_cansleep(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_is_active_low((const struct gpio_desc*)$arg1)")
    public static int gpiod_is_active_low(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_line_state_notify(Ptr<GpioDefinitions.gpio_desc> desc, @Unsigned long action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_put(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_put_array(Ptr<GpioDefinitions.gpio_descs> descs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_remove_hogs(Ptr<gpiod_hog> hogs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_remove_lookup_table(Ptr<gpiod_lookup_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_request($arg1, (const u8*)$arg2)")
    public static int gpiod_request(Ptr<GpioDefinitions.gpio_desc> desc, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_request_commit($arg1, (const u8*)$arg2)")
    public static int gpiod_request_commit(Ptr<GpioDefinitions.gpio_desc> desc, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_set_array_value(@Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_set_array_value_cansleep(@Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_set_array_value_complex(boolean raw, boolean can_sleep, @Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_set_config(Ptr<GpioDefinitions.gpio_desc> desc, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_set_consumer_name($arg1, (const u8*)$arg2)")
    public static int gpiod_set_consumer_name(Ptr<GpioDefinitions.gpio_desc> desc, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_set_debounce(Ptr<GpioDefinitions.gpio_desc> desc, @Unsigned int debounce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_set_raw_array_value(@Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_set_raw_array_value_cansleep(@Unsigned int array_size, Ptr<Ptr<GpioDefinitions.gpio_desc>> desc_array, Ptr<GpioDefinitions.gpio_array> array_info, Ptr<@Unsigned Long> value_bitmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_set_raw_value(Ptr<GpioDefinitions.gpio_desc> desc, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_set_raw_value_cansleep(Ptr<GpioDefinitions.gpio_desc> desc, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_set_raw_value_commit(Ptr<GpioDefinitions.gpio_desc> desc, boolean value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpiod_set_transitory(Ptr<GpioDefinitions.gpio_desc> desc, boolean transitory) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_set_value(Ptr<GpioDefinitions.gpio_desc> desc, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_set_value_cansleep(Ptr<GpioDefinitions.gpio_desc> desc, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_set_value_nocheck(Ptr<GpioDefinitions.gpio_desc> desc, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_to_chip((const struct gpio_desc*)$arg1)")
    public static Ptr<GpioDefinitions.gpio_chip> gpiod_to_chip(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<GpioDefinitions.gpio_device> gpiod_to_gpio_device(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpiod_to_irq((const struct gpio_desc*)$arg1)")
    public static int gpiod_to_irq(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpiod_toggle_active_low(Ptr<GpioDefinitions.gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct gpiod_hog")
    @NotUsableInJava
    public static class gpiod_hog
    extends Struct {
        public ListDefinitions.list_head list;
        public String chip_label;
        public @Unsigned short chip_hwnum;
        public String line_name;
        public @Unsigned long lflags;
        public int dflags;
    }

    @Type(noCCodeGeneration=true, cType="struct gpiod_data")
    @NotUsableInJava
    public static class gpiod_data
    extends Struct {
        public Ptr<GpioDefinitions.gpio_desc> desc;
        public runtime.mutex mutex;
        public Ptr<KernfsDefinitions.kernfs_node> value_kn;
        public int irq;
        public char irq_flags;
        public boolean direction_can_change;
    }

    @Type(noCCodeGeneration=true, cType="struct gpiod_lookup_table")
    @NotUsableInJava
    public static class gpiod_lookup_table
    extends Struct {
        public ListDefinitions.list_head list;
        public String dev_id;
        public gpiod_lookup @Size(value=0) [] table;
    }

    @Type(noCCodeGeneration=true, cType="struct gpiod_lookup")
    @NotUsableInJava
    public static class gpiod_lookup
    extends Struct {
        public String key;
        public @Unsigned short chip_hwnum;
        public String con_id;
        public @Unsigned int idx;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="enum gpiod_flags")
    public static enum gpiod_flags implements Enum<gpiod_flags>,
    TypedEnum<gpiod_flags, Integer>
    {
        GPIOD_ASIS,
        GPIOD_IN,
        GPIOD_OUT_LOW,
        GPIOD_OUT_HIGH,
        GPIOD_OUT_LOW_OPEN_DRAIN,
        GPIOD_OUT_HIGH_OPEN_DRAIN;

    }
}

