/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.SerdevDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class TtyportDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ttyport_break_ctl(Ptr<SerdevDefinitions.serdev_controller> ctrl, @Unsigned int break_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ttyport_close(Ptr<SerdevDefinitions.serdev_controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ttyport_get_tiocm(Ptr<SerdevDefinitions.serdev_controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ttyport_open(Ptr<SerdevDefinitions.serdev_controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ttyport_receive_buf($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static @Unsigned long ttyport_receive_buf(Ptr<TtyDefinitions.tty_port> port2, Ptr<Character> cp, Ptr<Character> fp, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ttyport_set_baudrate(Ptr<SerdevDefinitions.serdev_controller> ctrl, @Unsigned int speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ttyport_set_flow_control(Ptr<SerdevDefinitions.serdev_controller> ctrl, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ttyport_set_parity(Ptr<SerdevDefinitions.serdev_controller> ctrl, SerdevDefinitions.serdev_parity parity) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ttyport_set_tiocm(Ptr<SerdevDefinitions.serdev_controller> ctrl, @Unsigned int set, @Unsigned int clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ttyport_wait_until_sent(Ptr<SerdevDefinitions.serdev_controller> ctrl, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ttyport_write_buf($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long ttyport_write_buf(Ptr<SerdevDefinitions.serdev_controller> ctrl, Ptr<Character> data, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ttyport_write_flush(Ptr<SerdevDefinitions.serdev_controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ttyport_write_room(Ptr<SerdevDefinitions.serdev_controller> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ttyport_write_wakeup(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

