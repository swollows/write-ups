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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.PinDefinitions;
import me.bechberger.ebpf.runtime.PinctrlDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class GpioDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short gpio_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_sysfs_free_irq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn gpio_sysfs_irq(int irq, Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_sysfs_request_irq(Ptr<runtime.device> dev, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_chrdev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_chrdev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_desc_to_lineinfo(Ptr<gpio_desc> desc, Ptr<gpio_v2_line_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_device_unregistered_notify(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long gpio_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long gpio_ioctl_compat(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int gpio_v2_line_config_debounce_period(Ptr<gpio_v2_line_config> lc, @Unsigned int line_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean gpio_v2_line_config_debounced(Ptr<gpio_v2_line_config> lc, @Unsigned int line_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long gpio_v2_line_config_flags(Ptr<gpio_v2_line_config> lc, @Unsigned int line_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_v2_line_config_flags_to_desc_flags(@Unsigned long flags, Ptr<@Unsigned Long> flagsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_v2_line_config_output_value(Ptr<gpio_v2_line_config> lc, @Unsigned int line_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_v2_line_config_validate(Ptr<gpio_v2_line_config> lc, @Unsigned int num_lines) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_v2_line_info_to_v1(Ptr<gpio_v2_line_info> info_v2, Ptr<misc.gpioline_info> info_v1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int gpio_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_chip_get_multiple(Ptr<gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_chip_match_by_fwnode($arg1, (const void*)$arg2)")
    public static int gpio_chip_match_by_fwnode(Ptr<gpio_chip> gc, Ptr<?> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_chip_match_by_label($arg1, (const void*)$arg2)")
    public static int gpio_chip_match_by_label(Ptr<gpio_chip> gc, Ptr<?> label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_chip_set_multiple(Ptr<gpio_chip> gc, Ptr<@Unsigned Long> mask, Ptr<@Unsigned Long> bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_device_find((const void*)$arg1, (int (*)(struct gpio_chip*, const void*))$arg2)")
    public static Ptr<gpio_device> gpio_device_find(Ptr<?> data, Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_device_find_by_fwnode((const struct fwnode_handle*)$arg1)")
    public static Ptr<gpio_device> gpio_device_find_by_fwnode(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_device_find_by_label((const u8*)$arg1)")
    public static Ptr<gpio_device> gpio_device_find_by_label(String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<gpio_device> gpio_device_get(Ptr<gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_device_get_base(Ptr<gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<gpio_chip> gpio_device_get_chip(Ptr<gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<gpio_desc> gpio_device_get_desc(Ptr<gpio_device> gdev, @Unsigned int hwnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)gpio_device_get_label($arg1))")
    public static String gpio_device_get_label(Ptr<gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_device_put(Ptr<gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> gpio_device_to_device(Ptr<gpio_device> gdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_name_to_desc((const const u8*)$arg1)")
    public static Ptr<gpio_desc> gpio_name_to_desc(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_set_bias(Ptr<gpio_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_set_config_with_argument(Ptr<gpio_desc> desc, PinDefinitions.pin_config_param mode, @Unsigned int argument) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_set_debounce_timeout(Ptr<gpio_desc> desc, @Unsigned int debounce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_set_open_drain_value_commit(Ptr<gpio_desc> desc, boolean value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_set_open_source_value_commit(Ptr<gpio_desc> desc, boolean value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_stub_drv_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<gpio_desc> gpio_to_desc(@Unsigned int gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_clk_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_clk_driver_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gpio_free(@Unsigned int gpio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_request($arg1, (const u8*)$arg2)")
    public static int gpio_request(@Unsigned int gpio, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gpio_request_one($arg1, $arg2, (const u8*)$arg3)")
    public static int gpio_request_one(@Unsigned int gpio, @Unsigned long flags, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gpio_set_func(Ptr<runtime.wm8350> wm83502, int gpio, int func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_pin_range")
    @NotUsableInJava
    public static class gpio_pin_range
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<PinctrlDefinitions.pinctrl_dev> pctldev;
        public PinctrlDefinitions.pinctrl_gpio_range range;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_chardev_data")
    @NotUsableInJava
    public static class gpio_chardev_data
    extends Struct {
        public Ptr<gpio_device> gdev;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait;
        public misc.events_of_gpio_chardev_data events;
        public misc.notifier_block lineinfo_changed_nb;
        public misc.notifier_block device_unregistered_nb;
        public Ptr<@Unsigned Long> watched_lines;
        public AtomicDefinitions.atomic_t watch_abi_version;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_v2_line_event")
    @NotUsableInJava
    public static class gpio_v2_line_event
    extends Struct {
        public @Unsigned long timestamp_ns;
        public @Unsigned int id;
        public @Unsigned int offset;
        public @Unsigned int seqno;
        public @Unsigned int line_seqno;
        public @Unsigned int @Size(value=6) [] padding;
    }

    @Type(noCCodeGeneration=true, cType="enum gpio_v2_line_event_id")
    public static enum gpio_v2_line_event_id implements Enum<gpio_v2_line_event_id>,
    TypedEnum<gpio_v2_line_event_id, Integer>
    {
        GPIO_V2_LINE_EVENT_RISING_EDGE,
        GPIO_V2_LINE_EVENT_FALLING_EDGE;

    }

    @Type(noCCodeGeneration=true, cType="struct gpio_v2_line_info_changed")
    @NotUsableInJava
    public static class gpio_v2_line_info_changed
    extends Struct {
        public gpio_v2_line_info info;
        public @Unsigned long timestamp_ns;
        public @Unsigned int event_type;
        public @Unsigned int @Size(value=5) [] padding;
    }

    @Type(noCCodeGeneration=true, cType="enum gpio_v2_line_changed_type")
    public static enum gpio_v2_line_changed_type implements Enum<gpio_v2_line_changed_type>,
    TypedEnum<gpio_v2_line_changed_type, Integer>
    {
        GPIO_V2_LINE_CHANGED_REQUESTED,
        GPIO_V2_LINE_CHANGED_RELEASED,
        GPIO_V2_LINE_CHANGED_CONFIG;

    }

    @Type(noCCodeGeneration=true, cType="struct gpio_v2_line_info")
    @NotUsableInJava
    public static class gpio_v2_line_info
    extends Struct {
        public char @Size(value=32) [] name;
        public char @Size(value=32) [] consumer;
        public @Unsigned int offset;
        public @Unsigned int num_attrs;
        public @Unsigned long flags;
        public gpio_v2_line_attribute @Size(value=10) [] attrs;
        public @Unsigned int @Size(value=4) [] padding;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_v2_line_request")
    @NotUsableInJava
    public static class gpio_v2_line_request
    extends Struct {
        public @Unsigned int @Size(value=64) [] offsets;
        public char @Size(value=32) [] consumer;
        public gpio_v2_line_config config;
        public @Unsigned int num_lines;
        public @Unsigned int event_buffer_size;
        public @Unsigned int @Size(value=5) [] padding;
        public int fd;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_v2_line_config")
    @NotUsableInJava
    public static class gpio_v2_line_config
    extends Struct {
        public @Unsigned long flags;
        public @Unsigned int num_attrs;
        public @Unsigned int @Size(value=5) [] padding;
        public gpio_v2_line_config_attribute @Size(value=10) [] attrs;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_v2_line_config_attribute")
    @NotUsableInJava
    public static class gpio_v2_line_config_attribute
    extends Struct {
        public gpio_v2_line_attribute attr;
        public @Unsigned long mask;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_v2_line_attribute")
    @NotUsableInJava
    public static class gpio_v2_line_attribute
    extends Struct {
        public @Unsigned int id;
        public @Unsigned int padding;
        @InlineUnion(value=63837)
        public @InlineUnion(value=63837) @Unsigned long flags;
        @InlineUnion(value=63837)
        public @InlineUnion(value=63837) @Unsigned long values;
        @InlineUnion(value=63837)
        public @InlineUnion(value=63837) @Unsigned int debounce_period_us;
    }

    @Type(noCCodeGeneration=true, cType="enum gpio_v2_line_attr_id")
    public static enum gpio_v2_line_attr_id implements Enum<gpio_v2_line_attr_id>,
    TypedEnum<gpio_v2_line_attr_id, Integer>
    {
        GPIO_V2_LINE_ATTR_ID_FLAGS,
        GPIO_V2_LINE_ATTR_ID_OUTPUT_VALUES,
        GPIO_V2_LINE_ATTR_ID_DEBOUNCE;

    }

    @Type(noCCodeGeneration=true, cType="struct gpio_v2_line_values")
    @NotUsableInJava
    public static class gpio_v2_line_values
    extends Struct {
        public @Unsigned long bits;
        public @Unsigned long mask;
    }

    @Type(noCCodeGeneration=true, cType="enum gpio_v2_line_flag")
    public static enum gpio_v2_line_flag implements Enum<gpio_v2_line_flag>,
    TypedEnum<gpio_v2_line_flag, Integer>
    {
        GPIO_V2_LINE_FLAG_USED,
        GPIO_V2_LINE_FLAG_ACTIVE_LOW,
        GPIO_V2_LINE_FLAG_INPUT,
        GPIO_V2_LINE_FLAG_OUTPUT,
        GPIO_V2_LINE_FLAG_EDGE_RISING,
        GPIO_V2_LINE_FLAG_EDGE_FALLING,
        GPIO_V2_LINE_FLAG_OPEN_DRAIN,
        GPIO_V2_LINE_FLAG_OPEN_SOURCE,
        GPIO_V2_LINE_FLAG_BIAS_PULL_UP,
        GPIO_V2_LINE_FLAG_BIAS_PULL_DOWN,
        GPIO_V2_LINE_FLAG_BIAS_DISABLED,
        GPIO_V2_LINE_FLAG_EVENT_CLOCK_REALTIME,
        GPIO_V2_LINE_FLAG_EVENT_CLOCK_HTE;

    }

    @Type(noCCodeGeneration=true, cType="struct gpio_chip_guard")
    @NotUsableInJava
    public static class gpio_chip_guard
    extends Struct {
        public Ptr<gpio_device> gdev;
        public Ptr<gpio_chip> gc;
        public int idx;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_array")
    @NotUsableInJava
    public static class gpio_array
    extends Struct {
        public Ptr<Ptr<gpio_desc>> desc;
        public @Unsigned int size;
        public Ptr<gpio_chip> chip;
        public Ptr<@Unsigned Long> get_mask;
        public Ptr<@Unsigned Long> set_mask;
        public @Unsigned long @Size(value=0) [] invert_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_descs")
    @NotUsableInJava
    public static class gpio_descs
    extends Struct {
        public Ptr<gpio_array> info;
        public @Unsigned int ndescs;
        public Ptr<gpio_desc> @Size(value=0) [] desc;
    }

    @Type(noCCodeGeneration=true, cType="enum gpio_select")
    public static enum gpio_select implements Enum<gpio_select>,
    TypedEnum<gpio_select, Integer>
    {
        NO_GPIO,
        GPIO_1,
        GPIO_2;

    }

    @Type(noCCodeGeneration=true, cType="enum gpio_lookup_flags")
    public static enum gpio_lookup_flags implements Enum<gpio_lookup_flags>,
    TypedEnum<gpio_lookup_flags, Integer>
    {
        GPIO_ACTIVE_HIGH,
        GPIO_ACTIVE_LOW,
        GPIO_OPEN_DRAIN,
        GPIO_OPEN_SOURCE,
        GPIO_PERSISTENT,
        GPIO_TRANSITORY,
        GPIO_PULL_UP,
        GPIO_PULL_DOWN,
        GPIO_PULL_DISABLE,
        GPIO_LOOKUP_FLAGS_DEFAULT;

    }

    @Type(noCCodeGeneration=true, cType="struct gpio_desc_label")
    @NotUsableInJava
    public static class gpio_desc_label
    extends Struct {
        public misc.callback_head rh;
        public char @Size(value=0) [] str;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_device")
    @NotUsableInJava
    public static class gpio_device
    extends Struct {
        public runtime.device dev;
        public runtime.cdev chrdev;
        public int id;
        public Ptr<runtime.device> mockdev;
        public Ptr<runtime.module> owner;
        public Ptr<gpio_chip> chip;
        public Ptr<gpio_desc> descs;
        public SrcuDefinitions.srcu_struct desc_srcu;
        public @Unsigned int base;
        public @Unsigned short ngpio;
        public boolean can_sleep;
        public String label;
        public Ptr<?> data;
        public ListDefinitions.list_head list;
        public misc.blocking_notifier_head line_state_notifier;
        public misc.blocking_notifier_head device_notifier;
        public SrcuDefinitions.srcu_struct srcu;
        public ListDefinitions.list_head pin_ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_desc")
    @NotUsableInJava
    public static class gpio_desc
    extends Struct {
        public Ptr<gpio_device> gdev;
        public @Unsigned long flags;
        public Ptr<gpio_desc_label> label;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_irq_chip")
    @NotUsableInJava
    public static class gpio_irq_chip
    extends Struct {
        public Ptr<IrqDefinitions.irq_chip> chip;
        public Ptr<IrqDefinitions.irq_domain> domain;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public Ptr<IrqDefinitions.irq_domain> parent_domain;
        public Ptr<?> child_to_parent_hwirq;
        public Ptr<?> populate_parent_alloc_arg;
        public Ptr<?> child_offset_to_irq;
        public IrqDefinitions.irq_domain_ops child_irq_domain_ops;
        public @OriginalName(value="irq_flow_handler_t") Ptr<?> handler;
        public @Unsigned int default_type;
        public Ptr<LockDefinitions.lock_class_key> lock_key;
        public Ptr<LockDefinitions.lock_class_key> request_key;
        public @OriginalName(value="irq_flow_handler_t") Ptr<?> parent_handler;
        @InlineUnion(value=15285)
        public @InlineUnion(value=15285) Ptr<?> parent_handler_data;
        @InlineUnion(value=15285)
        public @InlineUnion(value=15285) Ptr<Ptr<?>> parent_handler_data_array;
        public @Unsigned int num_parents;
        public Ptr<@Unsigned Integer> parents;
        public Ptr<@Unsigned Integer> map;
        public boolean threaded;
        public boolean per_parent_data;
        public boolean initialized;
        public boolean domain_is_allocated_externally;
        public Ptr<?> init_hw;
        public Ptr<?> init_valid_mask;
        public Ptr<@Unsigned Long> valid_mask;
        public @Unsigned int first;
        public Ptr<?> irq_enable;
        public Ptr<?> irq_disable;
        public Ptr<?> irq_unmask;
        public Ptr<?> irq_mask;
    }

    @Type(noCCodeGeneration=true, cType="union gpio_irq_fwspec")
    @NotUsableInJava
    public static class gpio_irq_fwspec
    extends Union {
        public IrqDefinitions.irq_fwspec fwspec;
        public @OriginalName(value="msi_alloc_info_t") IrqDefinitions.irq_alloc_info msiinfo;
    }

    @Type(noCCodeGeneration=true, cType="struct gpio_chip")
    @NotUsableInJava
    public static class gpio_chip
    extends Struct {
        public String label;
        public Ptr<gpio_device> gpiodev;
        public Ptr<runtime.device> parent;
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public Ptr<runtime.module> owner;
        public Ptr<?> request;
        public Ptr<?> free;
        public Ptr<?> get_direction;
        public Ptr<?> direction_input;
        public Ptr<?> direction_output;
        public Ptr<?> get;
        public Ptr<?> get_multiple;
        public Ptr<?> set;
        public Ptr<?> set_multiple;
        public Ptr<?> set_config;
        public Ptr<?> to_irq;
        public Ptr<?> dbg_show;
        public Ptr<?> init_valid_mask;
        public Ptr<?> add_pin_ranges;
        public Ptr<?> en_hw_timestamp;
        public Ptr<?> dis_hw_timestamp;
        public int base;
        public @Unsigned short ngpio;
        public @Unsigned short offset;
        public Ptr<String> names;
        public boolean can_sleep;
        public Ptr<?> read_reg;
        public Ptr<?> write_reg;
        public boolean be_bits;
        public Ptr<?> reg_dat;
        public Ptr<?> reg_set;
        public Ptr<?> reg_clr;
        public Ptr<?> reg_dir_out;
        public Ptr<?> reg_dir_in;
        public boolean bgpio_dir_unreadable;
        public int bgpio_bits;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock bgpio_lock;
        public @Unsigned long bgpio_data;
        public @Unsigned long bgpio_dir;
        public gpio_irq_chip irq;
        public Ptr<@Unsigned Long> valid_mask;
    }
}

