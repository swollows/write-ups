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
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.SerialDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UartDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SccnxpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_break_ctl(Ptr<UartDefinitions.uart_port> port2, int break_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_config_port(Ptr<UartDefinitions.uart_port> port2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_console_putchar(Ptr<UartDefinitions.uart_port> port2, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sccnxp_console_setup(Ptr<runtime.console> co, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sccnxp_console_write($arg1, (const u8*)$arg2, $arg3)")
    public static void sccnxp_console_write(Ptr<runtime.console> co, String c, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_disable_irq(Ptr<UartDefinitions.uart_port> port2, int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sccnxp_get_mctrl(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_handle_events(Ptr<sccnxp_port> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_handle_rx(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_handle_tx(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn sccnxp_ist(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sccnxp_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char sccnxp_read(Ptr<UartDefinitions.uart_port> port2, char reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_release_port(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sccnxp_request_port(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sccnxp_set_baud(Ptr<UartDefinitions.uart_port> port2, int baud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_set_bit(Ptr<UartDefinitions.uart_port> port2, int sig, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_set_mctrl(Ptr<UartDefinitions.uart_port> port2, @Unsigned int mctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sccnxp_set_termios($arg1, $arg2, (const struct ktermios*)$arg3)")
    public static void sccnxp_set_termios(Ptr<UartDefinitions.uart_port> port2, Ptr<runtime.ktermios> termios3, Ptr<runtime.ktermios> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_shutdown(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_start_tx(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sccnxp_startup(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_stop_rx(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_stop_tx(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int sccnxp_tx_empty(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)sccnxp_type($arg1))")
    public static String sccnxp_type(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_uart_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sccnxp_uart_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sccnxp_verify_port(Ptr<UartDefinitions.uart_port> port2, Ptr<SerialDefinitions.serial_struct> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sccnxp_write(Ptr<UartDefinitions.uart_port> port2, char reg, char v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sccnxp_port")
    @NotUsableInJava
    public static class sccnxp_port
    extends Struct {
        public UartDefinitions.uart_driver uart;
        public UartDefinitions.uart_port @Size(value=2) [] port;
        public boolean @Size(value=2) [] opened;
        public int irq;
        public char imr;
        public Ptr<sccnxp_chip> chip;
        public runtime.console console;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public boolean poll;
        public TimerDefinitions.timer_list timer;
        public sccnxp_pdata pdata;
        public Ptr<runtime.regulator> regulator;
    }

    @Type(noCCodeGeneration=true, cType="struct sccnxp_chip")
    @NotUsableInJava
    public static class sccnxp_chip
    extends Struct {
        public String name;
        public @Unsigned int nr;
        public @Unsigned long freq_min;
        public @Unsigned long freq_std;
        public @Unsigned long freq_max;
        public @Unsigned int flags;
        public @Unsigned int fifosize;
        public @Unsigned int trwd;
    }

    @Type(noCCodeGeneration=true, cType="struct sccnxp_pdata")
    @NotUsableInJava
    public static class sccnxp_pdata
    extends Struct {
        public char reg_shift;
        public @Unsigned int @Size(value=2) [] mctrl_cfg;
        public @Unsigned int poll_time_us;
    }
}

