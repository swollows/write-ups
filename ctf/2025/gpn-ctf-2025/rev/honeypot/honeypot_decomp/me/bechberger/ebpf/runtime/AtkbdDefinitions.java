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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmiDefinitions;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.Ps2Definitions;
import me.bechberger.ebpf.runtime.SerioDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AtkbdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_apply_forced_release_keylist($arg1, (const void*)$arg2)")
    public static void atkbd_apply_forced_release_keylist(Ptr<atkbd> atkbd2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short atkbd_attr_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atkbd_cleanup(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_connect(Ptr<runtime.serio> serio2, Ptr<SerioDefinitions.serio_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_deactivate_fixup((const struct dmi_system_id*)$arg1)")
    public static int atkbd_deactivate_fixup(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atkbd_disconnect(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_do_set_extra($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long atkbd_do_set_extra(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b, @Unsigned long s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_do_set_force_release($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long atkbd_do_set_force_release(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b, @Unsigned long s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_do_set_scroll($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long atkbd_do_set_scroll(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b, @Unsigned long s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_do_set_set($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long atkbd_do_set_set(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b, @Unsigned long s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_do_set_softraw($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long atkbd_do_set_softraw(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b, @Unsigned long s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_do_set_softrepeat($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long atkbd_do_set_softrepeat(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b, @Unsigned long s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long atkbd_do_show_err_count(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long atkbd_do_show_extra(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long atkbd_do_show_force_release(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long atkbd_do_show_function_row_physmap(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long atkbd_do_show_scroll(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long atkbd_do_show_set(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long atkbd_do_show_softraw(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long atkbd_do_show_softrepeat(Ptr<runtime.device> d, Ptr<DeviceDefinitions.device_attribute> attr2, String b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_event(Ptr<InputDefinitions.input_dev> dev, @Unsigned int type2, @Unsigned int code2, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atkbd_event_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atkbd_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_get_keymap_from_fwnode(Ptr<atkbd> atkbd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int atkbd_oqo_01plus_scancode_fixup(Ptr<atkbd> atkbd2, @Unsigned int code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ps2Definitions.ps2_disposition atkbd_pre_receive_byte(Ptr<runtime.ps2dev> ps2dev2, char data, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_probe(Ptr<atkbd> atkbd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atkbd_receive_byte(Ptr<runtime.ps2dev> ps2dev2, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_reconnect(Ptr<runtime.serio> serio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atkbd_schedule_event_work(Ptr<atkbd> atkbd2, int event_bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_select_set(Ptr<atkbd> atkbd2, int target_set, int allow_extra) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atkbd_set_device_attrs(Ptr<atkbd> atkbd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_set_extra($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long atkbd_set_extra(Ptr<atkbd> atkbd2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_set_force_release($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long atkbd_set_force_release(Ptr<atkbd> atkbd2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void atkbd_set_keycode_table(Ptr<atkbd> atkbd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_set_leds(Ptr<atkbd> atkbd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int atkbd_set_repeat_rate(Ptr<atkbd> atkbd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_set_scroll($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long atkbd_set_scroll(Ptr<atkbd> atkbd2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_set_set($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long atkbd_set_set(Ptr<atkbd> atkbd2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_set_softraw($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long atkbd_set_softraw(Ptr<atkbd> atkbd2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_set_softrepeat($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long atkbd_set_softrepeat(Ptr<atkbd> atkbd2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_setup_forced_release((const struct dmi_system_id*)$arg1)")
    public static int atkbd_setup_forced_release(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="atkbd_setup_scancode_fixup((const struct dmi_system_id*)$arg1)")
    public static int atkbd_setup_scancode_fixup(Ptr<DmiDefinitions.dmi_system_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct atkbd")
    @NotUsableInJava
    public static class atkbd
    extends Struct {
        public runtime.ps2dev ps2dev;
        public Ptr<InputDefinitions.input_dev> dev;
        public char @Size(value=64) [] name;
        public char @Size(value=32) [] phys;
        public @Unsigned short id;
        public @Unsigned short @Size(value=512) [] keycode;
        public @Unsigned long @Size(value=8) [] force_release_mask;
        public char set;
        public boolean translated;
        public boolean extra;
        public boolean write;
        public boolean softrepeat;
        public boolean softraw;
        public boolean scroll;
        public boolean enabled;
        public char emul;
        public boolean resend;
        public boolean release;
        public @Unsigned long xl_bit;
        public @Unsigned int last;
        public @Unsigned long time;
        public @Unsigned long err_count;
        public DelayedDefinitions.delayed_work event_work;
        public @Unsigned long event_jiffies;
        public @Unsigned long event_mask;
        public runtime.mutex mutex;
        public misc.vivaldi_data vdata;
    }
}

