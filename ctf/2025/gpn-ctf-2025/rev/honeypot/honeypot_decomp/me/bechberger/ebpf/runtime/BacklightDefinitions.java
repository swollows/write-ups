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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class BacklightDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void backlight_class_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int backlight_class_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="backlight_device_get_by_name((const u8*)$arg1)")
    public static Ptr<backlight_device> backlight_device_get_by_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<backlight_device> backlight_device_get_by_type(backlight_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="backlight_device_register((const u8*)$arg1, $arg2, $arg3, (const struct backlight_ops*)$arg4, (const struct backlight_properties*)$arg5)")
    public static Ptr<backlight_device> backlight_device_register(String name, Ptr<runtime.device> parent, Ptr<?> devdata, Ptr<backlight_ops> ops, Ptr<backlight_properties> props) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int backlight_device_set_brightness(Ptr<backlight_device> bd, @Unsigned long brightness) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void backlight_device_unregister(Ptr<backlight_device> bd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void backlight_force_update(Ptr<backlight_device> bd, backlight_update_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void backlight_generate_event(Ptr<backlight_device> bd, backlight_update_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int backlight_register_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int backlight_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int backlight_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int backlight_unregister_notifier(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum backlight_notification")
    public static enum backlight_notification implements Enum<backlight_notification>,
    TypedEnum<backlight_notification, Integer>
    {
        BACKLIGHT_REGISTERED,
        BACKLIGHT_UNREGISTERED;

    }

    @Type(noCCodeGeneration=true, cType="enum backlight_update_reason")
    public static enum backlight_update_reason implements Enum<backlight_update_reason>,
    TypedEnum<backlight_update_reason, Integer>
    {
        BACKLIGHT_UPDATE_HOTKEY,
        BACKLIGHT_UPDATE_SYSFS;

    }

    @Type(noCCodeGeneration=true, cType="struct backlight_properties")
    @NotUsableInJava
    public static class backlight_properties
    extends Struct {
        public int brightness;
        public int max_brightness;
        public int power;
        public backlight_type type;
        public @Unsigned int state;
        public backlight_scale scale;
    }

    @Type(noCCodeGeneration=true, cType="struct backlight_ops")
    @NotUsableInJava
    public static class backlight_ops
    extends Struct {
        public @Unsigned int options;
        public Ptr<?> update_status;
        public Ptr<?> get_brightness;
        public Ptr<?> controls_device;
    }

    @Type(noCCodeGeneration=true, cType="enum backlight_scale")
    public static enum backlight_scale implements Enum<backlight_scale>,
    TypedEnum<backlight_scale, Integer>
    {
        BACKLIGHT_SCALE_UNKNOWN,
        BACKLIGHT_SCALE_LINEAR,
        BACKLIGHT_SCALE_NON_LINEAR;

    }

    @Type(noCCodeGeneration=true, cType="enum backlight_type")
    public static enum backlight_type implements Enum<backlight_type>,
    TypedEnum<backlight_type, Integer>
    {
        BACKLIGHT_RAW,
        BACKLIGHT_PLATFORM,
        BACKLIGHT_FIRMWARE,
        BACKLIGHT_TYPE_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct backlight_device")
    @NotUsableInJava
    public static class backlight_device
    extends Struct {
        public backlight_properties props;
        public runtime.mutex update_lock;
        public runtime.mutex ops_lock;
        public Ptr<backlight_ops> ops;
        public misc.notifier_block fb_notif;
        public ListDefinitions.list_head entry;
        public runtime.device dev;
        public boolean @Size(value=32) [] fb_bl_on;
        public int use_count;
    }
}

