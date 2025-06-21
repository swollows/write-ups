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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SerialDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UartDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __uart_read_properties(Ptr<uart_port> port2, boolean use_defaults) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_add_one_port(Ptr<uart_driver> drv, Ptr<uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_read_and_validate_port_properties(Ptr<uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_read_port_properties(Ptr<uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_remove_one_port(Ptr<uart_driver> drv, Ptr<uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean uart_port_trylock_irqsave(Ptr<uart_port> up, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __uart_start(Ptr<uart_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_break_ctl(Ptr<TtyDefinitions.tty_struct> tty, int break_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean uart_carrier_raised(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uart_change_line_settings($arg1, $arg2, (const struct ktermios*)$arg3)")
    public static void uart_change_line_settings(Ptr<TtyDefinitions.tty_struct> tty, Ptr<uart_state> state2, Ptr<runtime.ktermios> old_termios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int uart_chars_in_buffer(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_close(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TtyDefinitions.tty_driver> uart_console_device(Ptr<runtime.console> co, Ptr<Integer> index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uart_console_write($arg1, (const u8*)$arg2, $arg3, (void (*)(struct uart_port*, u8))$arg4)")
    public static void uart_console_write(Ptr<uart_port> port2, String s2, @Unsigned int count, Ptr<?> putchar2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_dtr_rts(Ptr<TtyDefinitions.tty_port> port2, boolean active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_flush_buffer(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_flush_chars(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_free_xmit_buf(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uart_get_baud_rate($arg1, $arg2, (const struct ktermios*)$arg3, $arg4, $arg5)")
    public static @Unsigned int uart_get_baud_rate(Ptr<uart_port> port2, Ptr<runtime.ktermios> termios3, Ptr<runtime.ktermios> old, @Unsigned int min, @Unsigned int max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<uart_port> uart_get_console(Ptr<uart_port> ports, int nr, Ptr<runtime.console> co) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int uart_get_divisor(Ptr<uart_port> port2, @Unsigned int baud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_get_icount(Ptr<TtyDefinitions.tty_struct> tty, Ptr<SerialDefinitions.serial_icounter_struct> icount) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_get_info(Ptr<TtyDefinitions.tty_port> port2, Ptr<SerialDefinitions.serial_struct> retinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_get_info_user(Ptr<TtyDefinitions.tty_struct> tty, Ptr<SerialDefinitions.serial_struct> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_get_rs485_mode(Ptr<uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_handle_cts_change(Ptr<uart_port> uport, boolean active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_handle_dcd_change(Ptr<uart_port> uport, boolean active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_hangup(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_insert_char(Ptr<uart_port> port2, @Unsigned int status, @Unsigned int overrun, char ch, char flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_install(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_ioctl(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uart_match_port((const struct uart_port*)$arg1, (const struct uart_port*)$arg2)")
    public static boolean uart_match_port(Ptr<uart_port> port1, Ptr<uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_open(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_parse_earlycon(String p, String iotype, Ptr<@Unsigned @OriginalName(value="resource_size_t") Long> addr2, Ptr<String> options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uart_parse_options((const u8*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static void uart_parse_options(String options, Ptr<Integer> baud, Ptr<Integer> parity, Ptr<Integer> bits, Ptr<Integer> flow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_poll_get_char(Ptr<TtyDefinitions.tty_driver> driver, int line2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_poll_init(Ptr<TtyDefinitions.tty_driver> driver, int line2, String options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_poll_put_char(Ptr<TtyDefinitions.tty_driver> driver, int line2, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_port_activate(Ptr<TtyDefinitions.tty_port> port2, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_port_shutdown(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_port_startup(Ptr<TtyDefinitions.tty_struct> tty, Ptr<uart_state> state2, boolean init_hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_put_char(Ptr<TtyDefinitions.tty_struct> tty, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_register_driver(Ptr<uart_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_resume_port(Ptr<uart_driver> drv, Ptr<uart_port> uport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_rs485_config(Ptr<uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_sanitize_serial_rs485(Ptr<uart_port> port2, Ptr<SerialDefinitions.serial_rs485> rs485) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_sanitize_serial_rs485_delays(Ptr<uart_port> port2, Ptr<SerialDefinitions.serial_rs485> rs485) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_send_xchar(Ptr<TtyDefinitions.tty_struct> tty, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_set_info(Ptr<TtyDefinitions.tty_struct> tty, Ptr<TtyDefinitions.tty_port> port2, Ptr<uart_state> state2, Ptr<SerialDefinitions.serial_struct> new_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_set_info_user(Ptr<TtyDefinitions.tty_struct> tty, Ptr<SerialDefinitions.serial_struct> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_set_ldisc(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_set_options(Ptr<uart_port> port2, Ptr<runtime.console> co, int baud, int parity, int bits, int flow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_set_rs485_config(Ptr<TtyDefinitions.tty_struct> tty, Ptr<uart_port> port2, Ptr<SerialDefinitions.serial_rs485> rs485_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uart_set_termios($arg1, (const struct ktermios*)$arg2)")
    public static void uart_set_termios(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.ktermios> old_termios) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_shutdown(Ptr<TtyDefinitions.tty_struct> tty, Ptr<uart_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_start(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_startup(Ptr<TtyDefinitions.tty_struct> tty, Ptr<uart_state> state2, boolean init_hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_stop(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_suspend_port(Ptr<uart_driver> drv, Ptr<uart_port> uport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_throttle(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_tiocmget(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_tiocmset(Ptr<TtyDefinitions.tty_struct> tty, @Unsigned int set, @Unsigned int clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean uart_try_toggle_sysrq(Ptr<uart_port> port2, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_tty_port_shutdown(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_unregister_driver(Ptr<uart_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_unthrottle(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_update_mctrl(Ptr<uart_port> port2, @Unsigned int set, @Unsigned int clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_update_timeout(Ptr<uart_port> port2, @Unsigned int cflag, @Unsigned int baud) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uart_wait_modem_status(Ptr<uart_state> state2, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_wait_until_sent(Ptr<TtyDefinitions.tty_struct> tty, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uart_write($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long uart_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int uart_write_room(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_write_wakeup(Ptr<uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uart_xchar_out(Ptr<uart_port> uport, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct uart_match")
    @NotUsableInJava
    public static class uart_match
    extends Struct {
        public Ptr<uart_port> port;
        public Ptr<uart_driver> driver;
    }

    @Type(noCCodeGeneration=true, cType="struct uart_driver")
    @NotUsableInJava
    public static class uart_driver
    extends Struct {
        public Ptr<runtime.module> owner;
        public String driver_name;
        public String dev_name;
        public int major;
        public int minor;
        public int nr;
        public Ptr<runtime.console> cons;
        public Ptr<uart_state> state;
        public Ptr<TtyDefinitions.tty_driver> tty_driver;
    }

    @Type(noCCodeGeneration=true, cType="enum uart_pm_state")
    public static enum uart_pm_state implements Enum<uart_pm_state>,
    TypedEnum<uart_pm_state, Integer>
    {
        UART_PM_STATE_ON,
        UART_PM_STATE_OFF,
        UART_PM_STATE_UNDEFINED;

    }

    @Type(noCCodeGeneration=true, cType="struct uart_state")
    @NotUsableInJava
    public static class uart_state
    extends Struct {
        public TtyDefinitions.tty_port port;
        public uart_pm_state pm_state;
        public AtomicDefinitions.atomic_t refcount;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head remove_wait;
        public Ptr<uart_port> uart_port;
    }

    @Type(noCCodeGeneration=true, cType="struct uart_icount")
    @NotUsableInJava
    public static class uart_icount
    extends Struct {
        public @Unsigned int cts;
        public @Unsigned int dsr;
        public @Unsigned int rng;
        public @Unsigned int dcd;
        public @Unsigned int rx;
        public @Unsigned int tx;
        public @Unsigned int frame;
        public @Unsigned int overrun;
        public @Unsigned int parity;
        public @Unsigned int brk;
        public @Unsigned int buf_overrun;
    }

    @Type(noCCodeGeneration=true, cType="struct uart_port")
    @NotUsableInJava
    public static class uart_port
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned long iobase;
        public String membase;
        public Ptr<?> serial_in;
        public Ptr<?> serial_out;
        public Ptr<?> set_termios;
        public Ptr<?> set_ldisc;
        public Ptr<?> get_mctrl;
        public Ptr<?> set_mctrl;
        public Ptr<?> get_divisor;
        public Ptr<?> set_divisor;
        public Ptr<?> startup;
        public Ptr<?> shutdown;
        public Ptr<?> throttle;
        public Ptr<?> unthrottle;
        public Ptr<?> handle_irq;
        public Ptr<?> pm;
        public Ptr<?> handle_break;
        public Ptr<?> rs485_config;
        public Ptr<?> iso7816_config;
        public @Unsigned int ctrl_id;
        public @Unsigned int port_id;
        public @Unsigned int irq;
        public @Unsigned long irqflags;
        public @Unsigned int uartclk;
        public @Unsigned int fifosize;
        public char x_char;
        public char regshift;
        public char iotype;
        public char quirks;
        public @Unsigned int read_status_mask;
        public @Unsigned int ignore_status_mask;
        public Ptr<uart_state> state;
        public uart_icount icount;
        public Ptr<runtime.console> cons;
        public @Unsigned @OriginalName(value="upf_t") long flags;
        public @Unsigned @OriginalName(value="upstat_t") int status;
        public boolean hw_stopped;
        public @Unsigned int mctrl;
        public @Unsigned int frame_time;
        public @Unsigned int type;
        public Ptr<uart_ops> ops;
        public @Unsigned int custom_divisor;
        public @Unsigned int line;
        public @Unsigned int minor;
        public @Unsigned @OriginalName(value="resource_size_t") long mapbase;
        public @Unsigned @OriginalName(value="resource_size_t") long mapsize;
        public Ptr<runtime.device> dev;
        public Ptr<SerialDefinitions.serial_port_device> port_dev;
        public @Unsigned long sysrq;
        public char sysrq_ch;
        public char has_sysrq;
        public char sysrq_seq;
        public char hub6;
        public char suspended;
        public char console_reinit;
        public String name;
        public Ptr<AttributeDefinitions.attribute_group> attr_group;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> tty_groups;
        public SerialDefinitions.serial_rs485 rs485;
        public SerialDefinitions.serial_rs485 rs485_supported;
        public Ptr<GpioDefinitions.gpio_desc> rs485_term_gpio;
        public Ptr<GpioDefinitions.gpio_desc> rs485_rx_during_tx_gpio;
        public SerialDefinitions.serial_iso7816 iso7816;
        public Ptr<?> private_data;
    }

    @Type(noCCodeGeneration=true, cType="struct uart_ops")
    @NotUsableInJava
    public static class uart_ops
    extends Struct {
        public Ptr<?> tx_empty;
        public Ptr<?> set_mctrl;
        public Ptr<?> get_mctrl;
        public Ptr<?> stop_tx;
        public Ptr<?> start_tx;
        public Ptr<?> throttle;
        public Ptr<?> unthrottle;
        public Ptr<?> send_xchar;
        public Ptr<?> stop_rx;
        public Ptr<?> start_rx;
        public Ptr<?> enable_ms;
        public Ptr<?> break_ctl;
        public Ptr<?> startup;
        public Ptr<?> shutdown;
        public Ptr<?> flush_buffer;
        public Ptr<?> set_termios;
        public Ptr<?> set_ldisc;
        public Ptr<?> pm;
        public Ptr<?> type;
        public Ptr<?> release_port;
        public Ptr<?> request_port;
        public Ptr<?> config_port;
        public Ptr<?> verify_port;
        public Ptr<?> ioctl;
        public Ptr<?> poll_init;
        public Ptr<?> poll_put_char;
        public Ptr<?> poll_get_char;
    }
}

