/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.MdDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class BindDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bind_rdev_to_array(Ptr<MdDefinitions.md_rdev> rdev, Ptr<runtime.mddev> mddev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bind_virq_for_mce() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bind_evtchn_to_cpu(Ptr<IrqDefinitions.irq_info> info2, @Unsigned int cpu2, boolean force_affinity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bind_evtchn_to_irq(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bind_evtchn_to_irq_chip(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn, Ptr<IrqDefinitions.irq_chip> chip, Ptr<XenbusDefinitions.xenbus_device> dev, boolean shared) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bind_evtchn_to_irq_lateeoi(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bind_evtchn_to_irqhandler($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int bind_evtchn_to_irqhandler(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long irqflags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bind_evtchn_to_irqhandler_lateeoi($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int bind_evtchn_to_irqhandler_lateeoi(@Unsigned @OriginalName(value="evtchn_port_t") int evtchn, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long irqflags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bind_interdomain_evtchn_to_irq_lateeoi(Ptr<XenbusDefinitions.xenbus_device> dev, @Unsigned @OriginalName(value="evtchn_port_t") int remote_port) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bind_interdomain_evtchn_to_irqhandler_lateeoi($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int bind_interdomain_evtchn_to_irqhandler_lateeoi(Ptr<XenbusDefinitions.xenbus_device> dev, @Unsigned @OriginalName(value="evtchn_port_t") int remote_port, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long irqflags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bind_ipi_to_irqhandler($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int bind_ipi_to_irqhandler(misc.ipi_vector ipi, @Unsigned int cpu2, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long irqflags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bind_mode_show(Ptr<DeviceDefinitions.device_driver> drv, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bind_mode_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bind_mode_store(Ptr<DeviceDefinitions.device_driver> drv, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bind_virq_to_irq(@Unsigned int virq, @Unsigned int cpu2, boolean percpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bind_virq_to_irqhandler($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5, $arg6)")
    public static int bind_virq_to_irqhandler(@Unsigned int virq, @Unsigned int cpu2, @OriginalName(value="irq_handler_t") Ptr<?> handler, @Unsigned long irqflags, String devname, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bind_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bind_store(Ptr<DeviceDefinitions.device_driver> drv, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }
}

