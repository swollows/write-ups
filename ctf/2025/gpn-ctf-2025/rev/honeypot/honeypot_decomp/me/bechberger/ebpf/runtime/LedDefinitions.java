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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.McDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class LedDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_add_lookup(Ptr<led_lookup_data> led_lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="led_classdev_next_name((const u8*)$arg1, $arg2, $arg3)")
    public static int led_classdev_next_name(String init_name, String name, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_classdev_notify_brightness_hw_changed(Ptr<led_classdev> led_cdev, @Unsigned int brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_classdev_register_ext(Ptr<runtime.device> parent, Ptr<led_classdev> led_cdev, Ptr<led_init_data> init_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_classdev_resume(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_classdev_suspend(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_classdev_unregister(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<led_classdev> led_get(Ptr<runtime.device> dev, String con_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_put(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_remove_lookup(Ptr<led_lookup_data> led_lookup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_mc_trigger_event(Ptr<led_trigger> trig, Ptr<@Unsigned Integer> intensity_value, @Unsigned int num_colors, led_brightness brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long led_panic_blink(int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_trigger_blink(Ptr<led_trigger> trig, @Unsigned long delay_on, @Unsigned long delay_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_trigger_blink_oneshot(Ptr<led_trigger> trig, @Unsigned long delay_on, @Unsigned long delay_off, int invert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_trigger_event(Ptr<led_trigger> trig, led_brightness brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_trigger_format(String buf, @Unsigned long size, Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_trigger_panic_notifier(Ptr<misc.notifier_block> nb, @Unsigned long code2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long led_trigger_read(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> attr2, String buf, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_trigger_register(Ptr<led_trigger> trig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="led_trigger_register_simple((const u8*)$arg1, $arg2)")
    public static void led_trigger_register_simple(String name, Ptr<Ptr<led_trigger>> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_trigger_remove(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_trigger_set(Ptr<led_classdev> led_cdev, Ptr<led_trigger> trig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_trigger_set_default(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="led_trigger_snprintf($arg1, $arg2, (const u8*)$arg3, $arg4_)")
    public static int led_trigger_snprintf(String buf, @OriginalName(value="ssize_t") long size, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_trigger_unregister(Ptr<led_trigger> trig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_trigger_unregister_simple(Ptr<led_trigger> trig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long led_trigger_write(Ptr<runtime.file> filp, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_blink_set(Ptr<led_classdev> led_cdev, Ptr<@Unsigned Long> delay_on, Ptr<@Unsigned Long> delay_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_blink_set_nosleep(Ptr<led_classdev> led_cdev, @Unsigned long delay_on, @Unsigned long delay_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_blink_set_oneshot(Ptr<led_classdev> led_cdev, Ptr<@Unsigned Long> delay_on, Ptr<@Unsigned Long> delay_off, int invert) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_blink_setup(Ptr<led_classdev> led_cdev, Ptr<@Unsigned Long> delay_on, Ptr<@Unsigned Long> delay_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_compose_name(Ptr<runtime.device> dev, Ptr<led_init_data> init_data, String led_classdev_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)led_get_color_name($arg1))")
    public static String led_get_color_name(char color_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Integer> led_get_default_pattern(Ptr<led_classdev> led_cdev, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_init_core(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static led_default_state led_init_default_state_get(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_mc_set_brightness(Ptr<led_classdev> led_cdev, Ptr<@Unsigned Integer> intensity_value, @Unsigned int num_colors, @Unsigned int brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_parse_fwnode_props(Ptr<runtime.device> dev, Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<led_properties> props) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_set_brightness(Ptr<led_classdev> led_cdev, @Unsigned int brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_set_brightness_nopm(Ptr<led_classdev> led_cdev, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_set_brightness_nosleep(Ptr<led_classdev> led_cdev, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_set_brightness_sync(Ptr<led_classdev> led_cdev, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_stop_software_blink(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_sysfs_disable(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_sysfs_enable(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void led_timer_function(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int led_update_brightness(Ptr<led_classdev> led_cdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct led_trigger_cpu")
    @NotUsableInJava
    public static class led_trigger_cpu
    extends Struct {
        public boolean is_active;
        public char @Size(value=8) [] name;
        public Ptr<led_trigger> _trig;
    }

    @Type(noCCodeGeneration=true, cType="struct led_lookup_data")
    @NotUsableInJava
    public static class led_lookup_data
    extends Struct {
        public ListDefinitions.list_head list;
        public String provider;
        public String dev_id;
        public String con_id;
    }

    @Type(noCCodeGeneration=true, cType="struct led_classdev_mc")
    @NotUsableInJava
    public static class led_classdev_mc
    extends Struct {
        public led_classdev led_cdev;
        public @Unsigned int num_colors;
        public Ptr<McDefinitions.mc_subled> subled_info;
    }

    @Type(noCCodeGeneration=true, cType="struct led_properties")
    @NotUsableInJava
    public static class led_properties
    extends Struct {
        public @Unsigned int color;
        public boolean color_present;
        public String function;
        public @Unsigned int func_enum;
        public boolean func_enum_present;
        public String label;
    }

    @Type(noCCodeGeneration=true, cType="struct led_trigger")
    @NotUsableInJava
    public static class led_trigger
    extends Struct {
        public String name;
        public Ptr<?> activate;
        public Ptr<?> deactivate;
        public led_brightness brightness;
        public Ptr<led_hw_trigger_type> trigger_type;
        public  @OriginalName(value="spinlock_t") runtime.spinlock leddev_list_lock;
        public ListDefinitions.list_head led_cdevs;
        public ListDefinitions.list_head next_trig;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> groups;
    }

    @Type(noCCodeGeneration=true, cType="struct led_pattern")
    @NotUsableInJava
    public static class led_pattern
    extends Struct {
        public @Unsigned int delta_t;
        public int brightness;
    }

    @Type(noCCodeGeneration=true, cType="struct led_classdev")
    @NotUsableInJava
    public static class led_classdev
    extends Struct {
        public String name;
        public @Unsigned int brightness;
        public @Unsigned int max_brightness;
        public @Unsigned int color;
        public int flags;
        public @Unsigned long work_flags;
        public Ptr<?> brightness_set;
        public Ptr<?> brightness_set_blocking;
        public Ptr<?> brightness_get;
        public Ptr<?> blink_set;
        public Ptr<?> pattern_set;
        public Ptr<?> pattern_clear;
        public Ptr<runtime.device> dev;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> groups;
        public ListDefinitions.list_head node;
        public String default_trigger;
        public @Unsigned long blink_delay_on;
        public @Unsigned long blink_delay_off;
        public TimerDefinitions.timer_list blink_timer;
        public int blink_brightness;
        public int new_blink_brightness;
        public Ptr<?> flash_resume;
        public misc.work_struct set_brightness_work;
        public int delayed_set_value;
        public @Unsigned long delayed_delay_on;
        public @Unsigned long delayed_delay_off;
        public misc.rw_semaphore trigger_lock;
        public Ptr<led_trigger> trigger;
        public ListDefinitions.list_head trig_list;
        public Ptr<?> trigger_data;
        public boolean activated;
        public Ptr<led_hw_trigger_type> trigger_type;
        public String hw_control_trigger;
        public Ptr<?> hw_control_is_supported;
        public Ptr<?> hw_control_set;
        public Ptr<?> hw_control_get;
        public Ptr<?> hw_control_get_device;
        public int brightness_hw_changed;
        public Ptr<KernfsDefinitions.kernfs_node> brightness_hw_changed_kn;
        public runtime.mutex led_access;
    }

    @Type(noCCodeGeneration=true, cType="struct led_hw_trigger_type")
    @NotUsableInJava
    public static class led_hw_trigger_type
    extends Struct {
        public int dummy;
    }

    @Type(noCCodeGeneration=true, cType="struct led_init_data")
    @NotUsableInJava
    public static class led_init_data
    extends Struct {
        public Ptr<FwnodeDefinitions.fwnode_handle> fwnode;
        public String default_label;
        public String devicename;
        public boolean devname_mandatory;
    }

    @Type(noCCodeGeneration=true, cType="enum led_default_state")
    public static enum led_default_state implements Enum<led_default_state>,
    TypedEnum<led_default_state, Integer>
    {
        LEDS_DEFSTATE_OFF,
        LEDS_DEFSTATE_ON,
        LEDS_DEFSTATE_KEEP;

    }

    @Type(noCCodeGeneration=true, cType="enum led_brightness")
    public static enum led_brightness implements Enum<led_brightness>,
    TypedEnum<led_brightness, Integer>
    {
        LED_OFF,
        LED_ON,
        LED_HALF,
        LED_FULL;

    }
}

