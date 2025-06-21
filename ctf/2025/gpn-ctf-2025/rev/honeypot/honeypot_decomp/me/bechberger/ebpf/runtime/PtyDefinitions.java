/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class PtyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pty_bsd_compat_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_bsd_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_cleanup(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_close(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_common_install(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty, boolean legacy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_flush_buffer(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_install(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_open(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_remove(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_resize(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.winsize> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_set_lock(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Integer> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_set_pktmode(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Integer> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pty_set_termios($arg1, (const struct ktermios*)$arg2)")
    public static void pty_set_termios(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.ktermios> old_termios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_show_fdinfo(Ptr<TtyDefinitions.tty_struct> tty, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_signal(Ptr<TtyDefinitions.tty_struct> tty, int sig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_start(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_stop(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long pty_unix98_compat_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_unix98_install(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pty_unix98_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_unix98_remove(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pty_unthrottle(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pty_write($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long pty_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> buf, @Unsigned long c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int pty_write_room(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }
}

