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
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class HubDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_activate(Ptr<UsbDefinitions.usb_hub> hub, hub_activation_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_configure(Ptr<UsbDefinitions.usb_hub> hub, Ptr<UsbDefinitions.usb_endpoint_descriptor> endpoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_disconnect(Ptr<UsbDefinitions.usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_event(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_ext_port_status(Ptr<UsbDefinitions.usb_hub> hub, int port1, int type2, Ptr<@Unsigned Short> status, Ptr<@Unsigned Short> change, Ptr<@Unsigned Integer> ext_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_get(Ptr<UsbDefinitions.usb_hub> hub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_hub_status(Ptr<UsbDefinitions.usb_hub> hub, Ptr<@Unsigned Short> status, Ptr<@Unsigned Short> change) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_init_func2(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_init_func3(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_ioctl(Ptr<UsbDefinitions.usb_interface> intf, @Unsigned int code2, Ptr<?> user_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_irq(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_is_superspeedplus(Ptr<UsbDefinitions.usb_device> hdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_port_connect(Ptr<UsbDefinitions.usb_hub> hub, int port1, @Unsigned short portstatus, @Unsigned short portchange) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_port_connect_change(Ptr<UsbDefinitions.usb_hub> hub, int port1, @Unsigned short portstatus, @Unsigned short portchange) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_port_debounce(Ptr<UsbDefinitions.usb_hub> hub, int port1, boolean must_be_connected) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_port_disable(Ptr<UsbDefinitions.usb_hub> hub, int port1, int set_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_port_init(Ptr<UsbDefinitions.usb_hub> hub, Ptr<UsbDefinitions.usb_device> udev, int port1, int retry_counter, Ptr<UsbDefinitions.usb_device_descriptor> dev_descr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_port_logical_disconnect(Ptr<UsbDefinitions.usb_hub> hub, int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_port_reset(Ptr<UsbDefinitions.usb_hub> hub, int port1, Ptr<UsbDefinitions.usb_device> udev, @Unsigned int delay, boolean warm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_port_wait_reset(Ptr<UsbDefinitions.usb_hub> hub, int port1, Ptr<UsbDefinitions.usb_device> udev, @Unsigned int delay, boolean warm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean hub_port_warm_reset_required(Ptr<UsbDefinitions.usb_hub> hub, int port1, @Unsigned short portstatus) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_post_reset(Ptr<UsbDefinitions.usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_power_on(Ptr<UsbDefinitions.usb_hub> hub, boolean do_delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_pre_reset(Ptr<UsbDefinitions.usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hub_probe($arg1, (const struct usb_device_id*)$arg2)")
    public static int hub_probe(Ptr<UsbDefinitions.usb_interface> intf, Ptr<UsbDefinitions.usb_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_put(Ptr<UsbDefinitions.usb_hub> hub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_quiesce(Ptr<UsbDefinitions.usb_hub> hub, hub_quiescing_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_reset_resume(Ptr<UsbDefinitions.usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_resubmit_irq_urb(Ptr<UsbDefinitions.usb_hub> hub) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_resume(Ptr<UsbDefinitions.usb_interface> intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_retry_irq_urb(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hub_suspend(Ptr<UsbDefinitions.usb_interface> intf,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hub_tt_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum hub_quiescing_type")
    public static enum hub_quiescing_type implements Enum<hub_quiescing_type>,
    TypedEnum<hub_quiescing_type, Integer>
    {
        HUB_DISCONNECT,
        HUB_PRE_RESET,
        HUB_SUSPEND;

    }

    @Type(noCCodeGeneration=true, cType="enum hub_activation_type")
    public static enum hub_activation_type implements Enum<hub_activation_type>,
    TypedEnum<hub_activation_type, Integer>
    {
        HUB_INIT,
        HUB_INIT2,
        HUB_INIT3,
        HUB_POST_RESET,
        HUB_RESUME,
        HUB_RESET_RESUME;

    }

    @Type(noCCodeGeneration=true, cType="enum hub_led_mode")
    public static enum hub_led_mode implements Enum<hub_led_mode>,
    TypedEnum<hub_led_mode, Boolean>
    {
        INDICATOR_AUTO,
        INDICATOR_CYCLE,
        INDICATOR_GREEN_BLINK,
        INDICATOR_GREEN_BLINK_OFF,
        INDICATOR_AMBER_BLINK,
        INDICATOR_AMBER_BLINK_OFF,
        INDICATOR_ALT_BLINK,
        INDICATOR_ALT_BLINK_OFF;

    }
}

