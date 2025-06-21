/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.UartDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SerialDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __serial_port_busy(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_port_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_base_port_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_port_set_tx(Ptr<UartDefinitions.uart_port> port2, Ptr<serial_port_device> port_dev, boolean enabled) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_port_shutdown(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_port_startup(Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_port_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_port_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_port_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_port_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_putc(Ptr<UartDefinitions.uart_port> port2, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long serial_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_ctrl_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_base_ctrl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_ctrl_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_ctrl_register_port(Ptr<UartDefinitions.uart_driver> drv, Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_ctrl_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_ctrl_unregister_port(Ptr<UartDefinitions.uart_driver> drv, Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_do_unlink(Ptr<IrqDefinitions.irq_info> i, Ptr<runtime.uart_8250_port> up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int serial_icr_read(Ptr<runtime.uart_8250_port> up, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_link_irq_chain(Ptr<runtime.uart_8250_port> up) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_pci_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_pci_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_pci_guess_board(Ptr<PciDefinitions.pci_dev> dev, Ptr<misc.pciserial_board> board) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_port_out_sync(Ptr<UartDefinitions.uart_port> p, int offset, int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<serial_ctrl_device> serial_base_ctrl_add(Ptr<UartDefinitions.uart_port> port2, Ptr<runtime.device> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_ctrl_device_remove(Ptr<serial_ctrl_device> ctrl_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_ctrl_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serial_base_device_init($arg1, $arg2, $arg3, (const struct device_type*)$arg4, (void (*)(struct device*))$arg5, $arg6, $arg7)")
    public static int serial_base_device_init(Ptr<UartDefinitions.uart_port> port2, Ptr<runtime.device> dev, Ptr<runtime.device> parent_dev, Ptr<DeviceDefinitions.device_type> type2, Ptr<?> release, @Unsigned int ctrl_id, @Unsigned int port_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_base_driver_register(Ptr<DeviceDefinitions.device_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_driver_unregister(Ptr<DeviceDefinitions.device_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_base_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serial_base_match($arg1, (const struct device_driver*)$arg2)")
    public static int serial_base_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_base_match_and_update_preferred_console(Ptr<UartDefinitions.uart_driver> drv, Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<serial_port_device> serial_base_port_add(Ptr<UartDefinitions.uart_port> port2, Ptr<serial_ctrl_device> ctrl_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_port_device_remove(Ptr<serial_port_device> port_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_base_port_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_core_add_one_port(Ptr<UartDefinitions.uart_driver> drv, Ptr<UartDefinitions.uart_port> uport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_core_register_port(Ptr<UartDefinitions.uart_driver> drv, Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_core_remove_one_port(Ptr<UartDefinitions.uart_driver> drv, Ptr<UartDefinitions.uart_port> uport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_core_unregister_port(Ptr<UartDefinitions.uart_driver> drv, Ptr<UartDefinitions.uart_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_match_port(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="serial_pnp_probe($arg1, (const struct pnp_device_id*)$arg2)")
    public static int serial_pnp_probe(Ptr<PnpDefinitions.pnp_dev> dev, Ptr<PnpDefinitions.pnp_device_id> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void serial_pnp_remove(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_pnp_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int serial_pnp_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct serial_struct32")
    @NotUsableInJava
    public static class serial_struct32
    extends Struct {
        public @OriginalName(value="compat_int_t") int type;
        public @OriginalName(value="compat_int_t") int line;
        public @Unsigned @OriginalName(value="compat_uint_t") int port;
        public @OriginalName(value="compat_int_t") int irq;
        public @OriginalName(value="compat_int_t") int flags;
        public @OriginalName(value="compat_int_t") int xmit_fifo_size;
        public @OriginalName(value="compat_int_t") int custom_divisor;
        public @OriginalName(value="compat_int_t") int baud_base;
        public @Unsigned short close_delay;
        public char io_type;
        public char reserved_char;
        public @OriginalName(value="compat_int_t") int hub6;
        public @Unsigned short closing_wait;
        public @Unsigned short closing_wait2;
        public @Unsigned @OriginalName(value="compat_uint_t") int iomem_base;
        public @Unsigned short iomem_reg_shift;
        public @Unsigned int port_high;
        public @OriginalName(value="compat_int_t") int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct serial_private")
    @NotUsableInJava
    public static class serial_private
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> dev;
        public @Unsigned int nr;
        public Ptr<PciDefinitions.pci_serial_quirk> quirk;
        public Ptr<misc.pciserial_board> board;
        public int @Size(value=0) [] line;
    }

    @Type(noCCodeGeneration=true, cType="struct serial_in_rdev")
    @NotUsableInJava
    public static class serial_in_rdev
    extends Struct {
        public RbDefinitions.rb_root_cached serial_rb;
        public  @OriginalName(value="spinlock_t") runtime.spinlock serial_lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head serial_io_wait;
    }

    @Type(noCCodeGeneration=true, cType="struct serial_ctrl_device")
    @NotUsableInJava
    public static class serial_ctrl_device
    extends Struct {
        public runtime.device dev;
        public runtime.ida port_ida;
    }

    @Type(noCCodeGeneration=true, cType="struct serial_port_device")
    @NotUsableInJava
    public static class serial_port_device
    extends Struct {
        public runtime.device dev;
        public Ptr<UartDefinitions.uart_port> port;
        public @Unsigned int tx_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct serial_iso7816")
    @NotUsableInJava
    public static class serial_iso7816
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int tg;
        public @Unsigned int sc_fi;
        public @Unsigned int sc_di;
        public @Unsigned int clk;
        public @Unsigned int @Size(value=5) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct serial_rs485")
    @NotUsableInJava
    public static class serial_rs485
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int delay_rts_before_send;
        public @Unsigned int delay_rts_after_send;
        @InlineUnion(value=5168)
        public @InlineUnion(value=5168) @Unsigned int @Size(value=5) [] padding;
        @InlineUnion(value=5168)
        public  @InlineUnion(value=5168) AnonDefinitions.anon_member_of_anon_member_of_serial_rs485 anon3$1;
    }

    @Type(noCCodeGeneration=true, cType="struct serial_struct")
    @NotUsableInJava
    public static class serial_struct
    extends Struct {
        public int type;
        public int line;
        public @Unsigned int port;
        public int irq;
        public int flags;
        public int xmit_fifo_size;
        public int custom_divisor;
        public int baud_base;
        public @Unsigned short close_delay;
        public char io_type;
        public char @Size(value=1) [] reserved_char;
        public int hub6;
        public @Unsigned short closing_wait;
        public @Unsigned short closing_wait2;
        public String iomem_base;
        public @Unsigned short iomem_reg_shift;
        public @Unsigned int port_high;
        public @Unsigned long iomap_base;
    }

    @Type(noCCodeGeneration=true, cType="struct serial_icounter_struct")
    @NotUsableInJava
    public static class serial_icounter_struct
    extends Struct {
        public int cts;
        public int dsr;
        public int rng;
        public int dcd;
        public int rx;
        public int tx;
        public int frame;
        public int overrun;
        public int parity;
        public int brk;
        public int buf_overrun;
        public int @Size(value=9) [] reserved;
    }
}

