/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.UartDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class Univ8250Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int univ8250_console_exit(Ptr<runtime.console> co) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int univ8250_console_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int univ8250_console_match(Ptr<runtime.console> co, String name, int idx, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int univ8250_console_setup(Ptr<runtime.console> co, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="univ8250_console_write($arg1, (const u8*)$arg2, $arg3)")
    public static void univ8250_console_write(Ptr<runtime.console> co, String s2, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void univ8250_release_irq(Ptr<runtime.uart_8250_port> up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int univ8250_setup_irq(Ptr<runtime.uart_8250_port> up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void univ8250_setup_timer(Ptr<runtime.uart_8250_port> up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void univ8250_config_port(Ptr<UartDefinitions.uart_port> port2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void univ8250_release_port(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int univ8250_request_port(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void univ8250_rsa_support(Ptr<UartDefinitions.uart_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }
}

