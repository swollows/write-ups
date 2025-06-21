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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SerdevDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __serdev_device_driver_register(Ptr<serdev_device_driver> sdrv, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean serdev_acpi_get_uart_resource(Ptr<AcpiDefinitions.acpi_resource> ares, Ptr<Ptr<AcpiDefinitions.acpi_resource_uart_serialbus>> uart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_controller_add(Ptr<serdev_controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<serdev_controller> serdev_controller_alloc(Ptr<runtime.device> host, Ptr<runtime.device> parent, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_controller_remove(Ptr<serdev_controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_ctrl_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_device_add(Ptr<serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<serdev_device> serdev_device_alloc(Ptr<serdev_controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_device_break_ctl(Ptr<serdev_device> serdev, int break_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_device_close(Ptr<serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_device_get_tiocm(Ptr<serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serdev_device_match($arg1, (const struct device_driver*)$arg2)")
    public static int serdev_device_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_device_open(Ptr<serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_device_remove(Ptr<serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int serdev_device_set_baudrate(Ptr<serdev_device> serdev, @Unsigned int speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_device_set_flow_control(Ptr<serdev_device> serdev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_device_set_parity(Ptr<serdev_device> serdev, serdev_parity parity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_device_set_tiocm(Ptr<serdev_device> serdev, int set, int clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serdev_device_uevent((const struct device*)$arg1, $arg2)")
    public static int serdev_device_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_device_wait_until_sent(Ptr<serdev_device> serdev, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serdev_device_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long serdev_device_write(Ptr<serdev_device> serdev, Ptr<Character> buf, @Unsigned long count, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serdev_device_write_buf($arg1, (const u8*)$arg2, $arg3)")
    public static int serdev_device_write_buf(Ptr<serdev_device> serdev, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_device_write_flush(Ptr<serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_device_write_room(Ptr<serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_device_write_wakeup(Ptr<serdev_device> serdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_drv_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_drv_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serdev_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_remove_device(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> serdev_tty_port_register(Ptr<TtyDefinitions.tty_port> port2, Ptr<runtime.device> host, Ptr<runtime.device> parent, Ptr<TtyDefinitions.tty_driver> drv, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serdev_tty_port_unregister(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct serdev_device_driver")
    @NotUsableInJava
    public static class serdev_device_driver
    extends Struct {
        public DeviceDefinitions.device_driver driver;
        public Ptr<?> probe;
        public Ptr<?> remove;
    }

    @Type(noCCodeGeneration=true, cType="struct serdev_controller_ops")
    @NotUsableInJava
    public static class serdev_controller_ops
    extends Struct {
        public Ptr<?> write_buf;
        public Ptr<?> write_flush;
        public Ptr<?> write_room;
        public Ptr<?> open;
        public Ptr<?> close;
        public Ptr<?> set_flow_control;
        public Ptr<?> set_parity;
        public Ptr<?> set_baudrate;
        public Ptr<?> wait_until_sent;
        public Ptr<?> get_tiocm;
        public Ptr<?> set_tiocm;
        public Ptr<?> break_ctl;
    }

    @Type(noCCodeGeneration=true, cType="enum serdev_parity")
    public static enum serdev_parity implements Enum<serdev_parity>,
    TypedEnum<serdev_parity, Integer>
    {
        SERDEV_PARITY_NONE,
        SERDEV_PARITY_EVEN,
        SERDEV_PARITY_ODD;

    }

    @Type(noCCodeGeneration=true, cType="struct serdev_controller")
    @NotUsableInJava
    public static class serdev_controller
    extends Struct {
        public runtime.device dev;
        public Ptr<runtime.device> host;
        public @Unsigned int nr;
        public Ptr<serdev_device> serdev;
        public Ptr<serdev_controller_ops> ops;
    }

    @Type(noCCodeGeneration=true, cType="struct serdev_device")
    @NotUsableInJava
    public static class serdev_device
    extends Struct {
        public runtime.device dev;
        public int nr;
        public Ptr<serdev_controller> ctrl;
        public Ptr<serdev_device_ops> ops;
        public runtime.completion write_comp;
        public runtime.mutex write_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct serdev_device_ops")
    @NotUsableInJava
    public static class serdev_device_ops
    extends Struct {
        public Ptr<?> receive_buf;
        public Ptr<?> write_wakeup;
    }
}

