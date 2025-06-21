/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.InputDefinitions;
import me.bechberger.ebpf.runtime.LedDefinitions;
import me.bechberger.ebpf.runtime.TaskletDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KbdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kbd_bh(Ptr<TaskletDefinitions.tasklet_struct> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kbd_connect($arg1, $arg2, (const struct input_device_id*)$arg3)")
    public static int kbd_connect(Ptr<InputDefinitions.input_handler> handler, Ptr<InputDefinitions.input_dev> dev, Ptr<InputDefinitions.input_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kbd_disconnect(Ptr<InputDefinitions.input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kbd_event(Ptr<InputDefinitions.input_handle> handle, @Unsigned int event_type, @Unsigned int event_code, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kbd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kbd_keycode(@Unsigned int keycode, int down, boolean hw_raw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kbd_led_trigger_activate(Ptr<LedDefinitions.led_classdev> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean kbd_match(Ptr<InputDefinitions.input_handler> handler, Ptr<InputDefinitions.input_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kbd_rate(Ptr<kbd_repeat> rpt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int kbd_rate_helper(Ptr<InputDefinitions.input_handle> handle, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kbd_start(Ptr<InputDefinitions.input_handle> handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct kbd_led_trigger")
    @NotUsableInJava
    public static class kbd_led_trigger
    extends Struct {
        public LedDefinitions.led_trigger trigger;
        public @Unsigned int mask;
    }

    @Type(noCCodeGeneration=true, cType="struct kbd_struct")
    @NotUsableInJava
    public static class kbd_struct
    extends Struct {
        public char lockstate;
        public char slockstate;
        public char ledmode;
        public char ledflagstate;
        public char default_ledflagstate;
        public char kbdmode;
        public char modeflags;
    }

    @Type(noCCodeGeneration=true, cType="struct kbd_repeat")
    @NotUsableInJava
    public static class kbd_repeat
    extends Struct {
        public int delay;
        public int period;
    }
}

