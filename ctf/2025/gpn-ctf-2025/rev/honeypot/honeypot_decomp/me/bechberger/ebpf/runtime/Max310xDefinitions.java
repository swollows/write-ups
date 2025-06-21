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
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.SerialDefinitions;
import me.bechberger.ebpf.runtime.SpiDefinitions;
import me.bechberger.ebpf.runtime.UartDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Max310xDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_break_ctl(Ptr<UartDefinitions.uart_port> port2, int break_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_config_port(Ptr<UartDefinitions.uart_port> port2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_detect(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int max310x_get_mctrl(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_gpio_direction_input(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_gpio_direction_output(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_gpio_get(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_gpio_set(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_gpio_set_config(Ptr<GpioDefinitions.gpio_chip> chip, @Unsigned int offset, @Unsigned long config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_handle_rx(Ptr<UartDefinitions.uart_port> port2, @Unsigned int rxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_handle_tx(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_i2c_extended_reg_enable(Ptr<runtime.device> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_i2c_probe(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_i2c_remove(Ptr<I2cDefinitions.i2c_client> client) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn max310x_ist(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_md_proc(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_null_void(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn max310x_port_irq(Ptr<max310x_port> s2, int portno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="max310x_probe($arg1, (const struct max310x_devtype*)$arg2, (const struct max310x_if_cfg*)$arg3, $arg4, $arg5)")
    public static int max310x_probe(Ptr<runtime.device> dev, Ptr<max310x_devtype> devtype, Ptr<max310x_if_cfg> if_cfg, Ptr<Ptr<runtime.regmap>> regmaps, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean max310x_reg_noinc(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean max310x_reg_precious(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean max310x_reg_volatile(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean max310x_reg_writeable(Ptr<runtime.device> dev, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_request_port(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_rs485_config(Ptr<UartDefinitions.uart_port> port2, Ptr<runtime.ktermios> termios3, Ptr<SerialDefinitions.serial_rs485> rs485) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_rs_proc(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_set_mctrl(Ptr<UartDefinitions.uart_port> port2, @Unsigned int mctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_set_ref_clk(Ptr<runtime.device> dev, Ptr<max310x_port> s2, @Unsigned long freq, boolean xtal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="max310x_set_termios($arg1, $arg2, (const struct ktermios*)$arg3)")
    public static void max310x_set_termios(Ptr<UartDefinitions.uart_port> port2, Ptr<runtime.ktermios> termios3, Ptr<runtime.ktermios> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_shutdown(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_spi_extended_reg_enable(Ptr<runtime.device> dev, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_spi_probe(Ptr<SpiDefinitions.spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_spi_remove(Ptr<SpiDefinitions.spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_start_tx(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_startup(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int max310x_tx_empty(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_tx_proc(Ptr<misc.work_struct> ws) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)max310x_type($arg1))")
    public static String max310x_type(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void max310x_uart_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_uart_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int max310x_verify_port(Ptr<UartDefinitions.uart_port> port2, Ptr<SerialDefinitions.serial_struct> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct max310x_port")
    @NotUsableInJava
    public static class max310x_port
    extends Struct {
        public Ptr<max310x_devtype> devtype;
        public Ptr<max310x_if_cfg> if_cfg;
        public Ptr<runtime.regmap> regmap;
        public Ptr<runtime.clk> clk;
        public GpioDefinitions.gpio_chip gpio;
        public max310x_one @Size(value=0) [] p;
    }

    @Type(noCCodeGeneration=true, cType="struct max310x_one")
    @NotUsableInJava
    public static class max310x_one
    extends Struct {
        public UartDefinitions.uart_port port;
        public misc.work_struct tx_work;
        public misc.work_struct md_work;
        public misc.work_struct rs_work;
        public Ptr<runtime.regmap> regmap;
        public char @Size(value=128) [] rx_buf;
    }

    @Type(noCCodeGeneration=true, cType="struct max310x_devtype")
    @NotUsableInJava
    public static class max310x_devtype
    extends Struct {
        public misc.slave_addr_of_max310x_devtype slave_addr;
        public int nr;
        public char @Size(value=9) [] name;
        public char mode1;
        public char rev_id_val;
        public char rev_id_reg;
        public char power_reg;
        public char power_bit;
    }

    @Type(noCCodeGeneration=true, cType="struct max310x_if_cfg")
    @NotUsableInJava
    public static class max310x_if_cfg
    extends Struct {
        public Ptr<?> extended_reg_enable;
        public char rev_id_offset;
    }
}

