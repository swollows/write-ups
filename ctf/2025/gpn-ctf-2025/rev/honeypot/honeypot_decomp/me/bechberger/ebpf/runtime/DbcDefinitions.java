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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.TaskletDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.XhciDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DbcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbc_port_activate(Ptr<TtyDefinitions.tty_port> _port, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_read_complete(Ptr<XhciDefinitions.xhci_dbc> dbc, Ptr<dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_rx_push(Ptr<TaskletDefinitions.tasklet_struct> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_start_rx(Ptr<dbc_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbc_start_tx(Ptr<dbc_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dbc_tty_chars_in_buffer(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_tty_close(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_tty_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_tty_flush_chars(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbc_tty_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbc_tty_install(Ptr<TtyDefinitions.tty_driver> driver, Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbc_tty_open(Ptr<TtyDefinitions.tty_struct> tty, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbc_tty_put_char(Ptr<TtyDefinitions.tty_struct> tty, char ch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_tty_unthrottle(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbc_tty_write($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long dbc_tty_write(Ptr<TtyDefinitions.tty_struct> tty, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dbc_tty_write_room(Ptr<TtyDefinitions.tty_struct> tty) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_write_complete(Ptr<XhciDefinitions.xhci_dbc> dbc, Ptr<dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dbc_request> dbc_alloc_request(Ptr<XhciDefinitions.xhci_dbc> dbc, @Unsigned int direction, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dbc_bInterfaceProtocol_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbc_bInterfaceProtocol_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dbc_bInterfaceProtocol_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dbc_bcdDevice_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbc_bcdDevice_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dbc_bcdDevice_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbc_ep_do_queue(Ptr<dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dbc_ep_queue(Ptr<dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_free_request(Ptr<dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dbc_handle_xfer_event(Ptr<XhciDefinitions.xhci_dbc> dbc, Ptr<XhciDefinitions.xhci_trb> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dbc_idProduct_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbc_idProduct_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dbc_idProduct_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dbc_idVendor_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbc_idVendor_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dbc_idVendor_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dbc_poll_interval_ms_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbc_poll_interval_ms_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dbc_poll_interval_ms_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long dbc_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dbc_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long dbc_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dbc_port")
    @NotUsableInJava
    public static class dbc_port
    extends Struct {
        public TtyDefinitions.tty_port port;
        public  @OriginalName(value="spinlock_t") runtime.spinlock port_lock;
        public int minor;
        public ListDefinitions.list_head read_pool;
        public ListDefinitions.list_head read_queue;
        public @Unsigned int n_read;
        public TaskletDefinitions.tasklet_struct push;
        public ListDefinitions.list_head write_pool;
        public @Unsigned int tx_boundary;
        public boolean registered;
    }

    @Type(noCCodeGeneration=true, cType="struct dbc_request")
    @NotUsableInJava
    public static class dbc_request
    extends Struct {
        public Ptr<?> buf;
        public @Unsigned int length;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
        public Ptr<?> complete;
        public ListDefinitions.list_head list_pool;
        public int status;
        public @Unsigned int actual;
        public Ptr<XhciDefinitions.xhci_dbc> dbc;
        public ListDefinitions.list_head list_pending;
        public @Unsigned @OriginalName(value="dma_addr_t") long trb_dma;
        public Ptr<XhciDefinitions.xhci_trb> trb;
        public @Unsigned int direction;
    }

    @Type(noCCodeGeneration=true, cType="struct dbc_driver")
    @NotUsableInJava
    public static class dbc_driver
    extends Struct {
        public Ptr<?> configure;
        public Ptr<?> disconnect;
    }

    @Type(noCCodeGeneration=true, cType="struct dbc_ep")
    @NotUsableInJava
    public static class dbc_ep
    extends Struct {
        public Ptr<XhciDefinitions.xhci_dbc> dbc;
        public ListDefinitions.list_head list_pending;
        public Ptr<XhciDefinitions.xhci_ring> ring;
        public @Unsigned int direction;
        public @Unsigned int halted;
    }

    @Type(noCCodeGeneration=true, cType="enum dbc_state")
    public static enum dbc_state implements Enum<dbc_state>,
    TypedEnum<dbc_state, Integer>
    {
        DS_DISABLED,
        DS_INITIALIZED,
        DS_ENABLED,
        DS_CONNECTED,
        DS_CONFIGURED,
        DS_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct dbc_str_descs")
    @NotUsableInJava
    public static class dbc_str_descs
    extends Struct {
        public char @Size(value=64) [] string0;
        public char @Size(value=64) [] manufacturer;
        public char @Size(value=64) [] product;
        public char @Size(value=64) [] serial;
    }

    @Type(noCCodeGeneration=true, cType="struct dbc_info_context")
    @NotUsableInJava
    public static class dbc_info_context
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long string0;
        public @Unsigned @OriginalName(value="__le64") long manufacturer;
        public @Unsigned @OriginalName(value="__le64") long product;
        public @Unsigned @OriginalName(value="__le64") long serial;
        public @Unsigned @OriginalName(value="__le32") int length;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=7) [] __reserved_0;
    }

    @Type(noCCodeGeneration=true, cType="struct dbc_regs")
    @NotUsableInJava
    public static class dbc_regs
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int capability;
        public @Unsigned @OriginalName(value="__le32") int doorbell;
        public @Unsigned @OriginalName(value="__le32") int ersts;
        public @Unsigned @OriginalName(value="__le32") int __reserved_0;
        public @Unsigned @OriginalName(value="__le64") long erstba;
        public @Unsigned @OriginalName(value="__le64") long erdp;
        public @Unsigned @OriginalName(value="__le32") int control;
        public @Unsigned @OriginalName(value="__le32") int status;
        public @Unsigned @OriginalName(value="__le32") int portsc;
        public @Unsigned @OriginalName(value="__le32") int __reserved_1;
        public @Unsigned @OriginalName(value="__le64") long dccp;
        public @Unsigned @OriginalName(value="__le32") int devinfo1;
        public @Unsigned @OriginalName(value="__le32") int devinfo2;
    }
}

