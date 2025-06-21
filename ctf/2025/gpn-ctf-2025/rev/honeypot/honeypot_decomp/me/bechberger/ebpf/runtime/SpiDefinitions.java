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
import me.bechberger.ebpf.runtime.AddrDefinitions;
import me.bechberger.ebpf.runtime.DataDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DummyDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.KthreadDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PtpDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.SoftwareDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SpiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_add_device(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<spi_controller> __spi_alloc_controller(Ptr<runtime.device> dev, @Unsigned int size, boolean slave) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_async(Ptr<spi_device> spi, Ptr<spi_message> message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_map_msg(Ptr<spi_controller> ctlr, Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_optimize_message(Ptr<spi_device> spi, Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __spi_pump_messages(Ptr<spi_controller> ctlr, boolean in_kthread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_pump_transfer_message(Ptr<spi_controller> ctlr, Ptr<spi_message> msg, boolean was_busy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_register_driver(Ptr<runtime.module> owner, Ptr<spi_driver> sdrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __spi_replace_transfers_release(Ptr<spi_controller> ctlr, Ptr<spi_message> msg, Ptr<?> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_split_transfer_maxsize(Ptr<spi_controller> ctlr, Ptr<spi_message> msg, Ptr<Ptr<spi_transfer>> xferp, @Unsigned long maxsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_sync(Ptr<spi_device> spi, Ptr<spi_message> message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __spi_validate(Ptr<spi_device> spi, Ptr<spi_message> message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _spi_transfer_cs_change_delay(Ptr<spi_message> msg, Ptr<spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _spi_xfer_word_delay_update(Ptr<spi_transfer> xfer, Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_acpi_controller_match($arg1, (const void*)$arg2)")
    public static int spi_acpi_controller_match(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_add_device(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<spi_device> spi_alloc_device(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<spi_statistics> spi_alloc_pcpu_stats(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_async(Ptr<spi_device> spi, Ptr<spi_message> message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_bus_lock(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_bus_unlock(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_complete(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_bytes_rx_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_bytes_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_bytes_tx_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_errors_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_controller_initialize_queue(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_messages_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_controller_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_controller_resume(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_spi_async_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_spi_sync_immediate_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_spi_sync_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_controller_suspend(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_timedout_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo0_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo10_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo11_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo12_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo13_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo14_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo15_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo16_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo1_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo2_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo3_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo4_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo5_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo6_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo7_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo8_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfer_bytes_histo9_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfers_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_controller_transfers_split_maxsize_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_delay_exec(Ptr<spi_delay> _delay, Ptr<spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_delay_to_ns(Ptr<spi_delay> _delay, Ptr<spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_destroy_queue(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_dev_check(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_dev_set_name(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_bytes_rx_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_bytes_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_bytes_tx_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_errors_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_messages_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_spi_async_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_spi_sync_immediate_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_spi_sync_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_timedout_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo0_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo10_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo11_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo12_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo13_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo14_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo15_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo16_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo1_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo2_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo3_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo4_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo5_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo6_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo7_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo8_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfer_bytes_histo9_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfers_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_device_transfers_split_maxsize_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_emit_pcpu_stats(Ptr<spi_statistics> stat2, String buf, @Unsigned long offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_finalize_current_message(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_finalize_current_transfer(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_flush_queue(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct spi_device_id*)spi_get_device_id((const struct spi_device*)$arg1))")
    public static Ptr<spi_device_id> spi_get_device_id(Ptr<spi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)spi_get_device_match_data((const struct spi_device*)$arg1))")
    public static Ptr<?> spi_get_device_match_data(Ptr<spi_device> sdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_get_gpio_descs(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<spi_message> spi_get_next_queued_message(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_map_buf(Ptr<spi_controller> ctlr, Ptr<runtime.device> dev, Ptr<SgDefinitions.sg_table> sgt, Ptr<?> buf, @Unsigned long len, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_map_buf_attrs(Ptr<spi_controller> ctlr, Ptr<runtime.device> dev, Ptr<SgDefinitions.sg_table> sgt, Ptr<?> buf, @Unsigned long len, DmaDefinitions.dma_data_direction dir, @Unsigned long attrs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_map_msg(Ptr<spi_controller> ctlr, Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_match_device($arg1, (const struct device_driver*)$arg2)")
    public static int spi_match_device(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_maybe_optimize_message(Ptr<spi_device> spi, Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<spi_device> spi_new_ancillary_device(Ptr<spi_device> spi, char chip_select) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<spi_device> spi_new_device(Ptr<spi_controller> ctlr, Ptr<spi_board_info> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_optimize_message(Ptr<spi_device> spi, Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_pump_messages(Ptr<KthreadDefinitions.kthread_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_queued_transfer(Ptr<spi_device> spi, Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_register_board_info((const struct spi_board_info*)$arg1, $arg2)")
    public static int spi_register_board_info(Ptr<spi_board_info> info2, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_register_controller(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_res_release(Ptr<spi_controller> ctlr, Ptr<spi_message> message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_set_cs(Ptr<spi_device> spi, boolean enable, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_set_thread_rt(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_setup(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_split_transfers_maxsize(Ptr<spi_controller> ctlr, Ptr<spi_message> msg, @Unsigned long maxsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_split_transfers_maxwords(Ptr<spi_controller> ctlr, Ptr<spi_message> msg, @Unsigned long maxwords) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_statistics_add_transfer_stats(Ptr<spi_statistics> pcpu_stats, Ptr<spi_transfer> xfer, Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_stop_queue(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_sync(Ptr<spi_device> spi, Ptr<spi_message> message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_sync_locked(Ptr<spi_device> spi, Ptr<spi_message> message) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_take_timestamp_post(Ptr<spi_controller> ctlr, Ptr<spi_transfer> xfer, @Unsigned long progress, boolean irqs_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_take_timestamp_pre(Ptr<spi_controller> ctlr, Ptr<spi_transfer> xfer, @Unsigned long progress, boolean irqs_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_target_abort(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_transfer_cs_change_delay_exec(Ptr<spi_message> msg, Ptr<spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_transfer_one_message(Ptr<spi_controller> ctlr, Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_transfer_wait(Ptr<spi_controller> ctlr, Ptr<spi_message> msg, Ptr<spi_transfer> xfer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_uevent((const struct device*)$arg1, $arg2)")
    public static int spi_uevent(Ptr<runtime.device> dev, Ptr<KobjDefinitions.kobj_uevent_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_unmap_buf(Ptr<spi_controller> ctlr, Ptr<runtime.device> dev, Ptr<SgDefinitions.sg_table> sgt, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_unoptimize_message(Ptr<spi_message> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_unregister_controller(Ptr<spi_controller> ctlr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_unregister_device(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_write_then_read($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int spi_write_then_read(Ptr<spi_device> spi, Ptr<?> txbuf, @Unsigned int n_tx, Ptr<?> rxbuf, @Unsigned int n_rx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_controller_dma_map_mem_op_data($arg1, (const struct spi_mem_op*)$arg2, $arg3)")
    public static int spi_controller_dma_map_mem_op_data(Ptr<spi_controller> ctlr, Ptr<spi_mem_op> op, Ptr<SgDefinitions.sg_table> sgt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_controller_dma_unmap_mem_op_data($arg1, (const struct spi_mem_op*)$arg2, $arg3)")
    public static void spi_controller_dma_unmap_mem_op_data(Ptr<spi_controller> ctlr, Ptr<spi_mem_op> op, Ptr<SgDefinitions.sg_table> sgt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_mem_access_end(Ptr<spi_mem> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_mem_access_start(Ptr<spi_mem> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_add_op_stats($arg1, (const struct spi_mem_op*)$arg2, $arg3)")
    public static void spi_mem_add_op_stats(Ptr<spi_statistics> pcpu_stats, Ptr<spi_mem_op> op, int exec_op_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_mem_adjust_op_size(Ptr<spi_mem> mem, Ptr<spi_mem_op> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean spi_mem_buswidth_is_valid(char buswidth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_check_op((const struct spi_mem_op*)$arg1)")
    public static int spi_mem_check_op(Ptr<spi_mem_op> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_default_supports_op($arg1, (const struct spi_mem_op*)$arg2)")
    public static boolean spi_mem_default_supports_op(Ptr<spi_mem> mem, Ptr<spi_mem_op> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_dirmap_create($arg1, (const struct spi_mem_dirmap_info*)$arg2)")
    public static Ptr<spi_mem_dirmap_desc> spi_mem_dirmap_create(Ptr<spi_mem> mem, Ptr<spi_mem_dirmap_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_mem_dirmap_destroy(Ptr<spi_mem_dirmap_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_mem_dirmap_read(Ptr<spi_mem_dirmap_desc> desc, @Unsigned long offs, @Unsigned long len, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_dirmap_write($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static @OriginalName(value="ssize_t") long spi_mem_dirmap_write(Ptr<spi_mem_dirmap_desc> desc, @Unsigned long offs, @Unsigned long len, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_mem_driver_register_with_owner(Ptr<spi_mem_driver> memdrv, Ptr<runtime.module> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_mem_driver_unregister(Ptr<spi_mem_driver> memdrv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_exec_op($arg1, (const struct spi_mem_op*)$arg2)")
    public static int spi_mem_exec_op(Ptr<spi_mem> mem, Ptr<spi_mem_op> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)spi_mem_get_name($arg1))")
    public static String spi_mem_get_name(Ptr<spi_mem> mem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spi_mem_no_dirmap_read(Ptr<spi_mem_dirmap_desc> desc, @Unsigned long offs, @Unsigned long len, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_no_dirmap_write($arg1, $arg2, $arg3, (const void*)$arg4)")
    public static @OriginalName(value="ssize_t") long spi_mem_no_dirmap_write(Ptr<spi_mem_dirmap_desc> desc, @Unsigned long offs, @Unsigned long len, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_poll_status($arg1, (const struct spi_mem_op*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int spi_mem_poll_status(Ptr<spi_mem> mem, Ptr<spi_mem_op> op, @Unsigned short mask, @Unsigned short match, @Unsigned long initial_delay_us, @Unsigned long polling_delay_us, @Unsigned short timeout_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_mem_probe(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_mem_remove(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spi_mem_shutdown(Ptr<spi_device> spi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_mem_supports_op($arg1, (const struct spi_mem_op*)$arg2)")
    public static boolean spi_mem_supports_op(Ptr<spi_mem> mem, Ptr<spi_mem_op> op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spi_sync_transfer(Ptr<spi_device> spi, Ptr<spi_transfer> xfers, @Unsigned int num_xfers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="spi_write($arg1, (const void*)$arg2, $arg3)")
    public static int spi_write(Ptr<spi_device> spi, Ptr<?> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct spi_board_info")
    @NotUsableInJava
    public static class spi_board_info
    extends Struct {
        public char @Size(value=32) [] modalias;
        public Ptr<?> platform_data;
        public Ptr<SoftwareDefinitions.software_node> swnode;
        public Ptr<?> controller_data;
        public int irq;
        public @Unsigned int max_speed_hz;
        public @Unsigned short bus_num;
        public @Unsigned short chip_select;
        public @Unsigned int mode;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_replaced_transfers")
    @NotUsableInJava
    public static class spi_replaced_transfers
    extends Struct {
        public @OriginalName(value="spi_replaced_release_t") Ptr<?> release;
        public Ptr<?> extradata;
        public ListDefinitions.list_head replaced_transfers;
        public Ptr<ListDefinitions.list_head> replaced_after;
        public @Unsigned long inserted;
        public spi_transfer @Size(value=0) [] inserted_transfers;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_res")
    @NotUsableInJava
    public static class spi_res
    extends Struct {
        public ListDefinitions.list_head entry;
        public @OriginalName(value="spi_res_release_t") Ptr<?> release;
        public @Unsigned long @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_mem_driver")
    @NotUsableInJava
    public static class spi_mem_driver
    extends Struct {
        public spi_driver spidrv;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_mem")
    @NotUsableInJava
    public static class spi_mem
    extends Struct {
        public Ptr<spi_device> spi;
        public Ptr<?> drvpriv;
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_mem_dirmap_desc")
    @NotUsableInJava
    public static class spi_mem_dirmap_desc
    extends Struct {
        public Ptr<spi_mem> mem;
        public spi_mem_dirmap_info info;
        public @Unsigned int nodirmap;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_mem_dirmap_info")
    @NotUsableInJava
    public static class spi_mem_dirmap_info
    extends Struct {
        public spi_mem_op op_tmpl;
        public @Unsigned long offset;
        public @Unsigned long length;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_mem_op")
    @NotUsableInJava
    public static class spi_mem_op
    extends Struct {
        public misc.cmd_of_spi_mem_op cmd;
        public AddrDefinitions.addr_of_spi_mem_op addr;
        public DummyDefinitions.dummy_of_spi_mem_op dummy;
        public DataDefinitions.data_of_spi_mem_op data;
    }

    @Type(noCCodeGeneration=true, cType="enum spi_mem_data_dir")
    public static enum spi_mem_data_dir implements Enum<spi_mem_data_dir>,
    TypedEnum<spi_mem_data_dir, Integer>
    {
        SPI_MEM_NO_DATA,
        SPI_MEM_DATA_IN,
        SPI_MEM_DATA_OUT;

    }

    @Type(noCCodeGeneration=true, cType="struct spi_driver")
    @NotUsableInJava
    public static class spi_driver
    extends Struct {
        public Ptr<spi_device_id> id_table;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public DeviceDefinitions.device_driver driver;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_device_id")
    @NotUsableInJava
    public static class spi_device_id
    extends Struct {
        public char @Size(value=32) [] name;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_controller_mem_caps")
    @NotUsableInJava
    public static class spi_controller_mem_caps
    extends Struct {
        public boolean dtr;
        public boolean ecc;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_controller_mem_ops")
    @NotUsableInJava
    public static class spi_controller_mem_ops
    extends Struct {
        public Ptr<?> adjust_op_size;
        public Ptr<?> supports_op;
        public Ptr<?> exec_op;
        public Ptr<?> get_name;
        public Ptr<?> dirmap_create;
        public Ptr<?> dirmap_destroy;
        public Ptr<?> dirmap_read;
        public Ptr<?> dirmap_write;
        public Ptr<?> poll_status;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_transfer")
    @NotUsableInJava
    public static class spi_transfer
    extends Struct {
        public Ptr<?> tx_buf;
        public Ptr<?> rx_buf;
        public @Unsigned int len;
        public @Unsigned short error;
        public boolean tx_sg_mapped;
        public boolean rx_sg_mapped;
        public SgDefinitions.sg_table tx_sg;
        public SgDefinitions.sg_table rx_sg;
        public @Unsigned @OriginalName(value="dma_addr_t") long tx_dma;
        public @Unsigned @OriginalName(value="dma_addr_t") long rx_dma;
        public @Unsigned int dummy_data;
        public @Unsigned int cs_off;
        public @Unsigned int cs_change;
        public @Unsigned int tx_nbits;
        public @Unsigned int rx_nbits;
        public @Unsigned int timestamped;
        public char bits_per_word;
        public spi_delay delay;
        public spi_delay cs_change_delay;
        public spi_delay word_delay;
        public @Unsigned int speed_hz;
        public @Unsigned int effective_speed_hz;
        public @Unsigned int ptp_sts_word_pre;
        public @Unsigned int ptp_sts_word_post;
        public Ptr<PtpDefinitions.ptp_system_timestamp> ptp_sts;
        public ListDefinitions.list_head transfer_list;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_message")
    @NotUsableInJava
    public static class spi_message
    extends Struct {
        public ListDefinitions.list_head transfers;
        public Ptr<spi_device> spi;
        public boolean pre_optimized;
        public boolean optimized;
        public boolean prepared;
        public int status;
        public Ptr<?> complete;
        public Ptr<?> context;
        public @Unsigned int frame_length;
        public @Unsigned int actual_length;
        public ListDefinitions.list_head queue;
        public Ptr<?> state;
        public Ptr<?> opt_state;
        public ListDefinitions.list_head resources;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_controller")
    @NotUsableInJava
    public static class spi_controller
    extends Struct {
        public runtime.device dev;
        public ListDefinitions.list_head list;
        public short bus_num;
        public @Unsigned short num_chipselect;
        public @Unsigned short dma_alignment;
        public @Unsigned int mode_bits;
        public @Unsigned int buswidth_override_bits;
        public @Unsigned int bits_per_word_mask;
        public @Unsigned int min_speed_hz;
        public @Unsigned int max_speed_hz;
        public @Unsigned short flags;
        public boolean devm_allocated;
        @InlineUnion(value=18769)
        public @InlineUnion(value=18769) boolean slave;
        @InlineUnion(value=18769)
        public @InlineUnion(value=18769) boolean target;
        public Ptr<?> max_transfer_size;
        public Ptr<?> max_message_size;
        public runtime.mutex io_mutex;
        public runtime.mutex add_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock bus_lock_spinlock;
        public runtime.mutex bus_lock_mutex;
        public boolean bus_lock_flag;
        public Ptr<?> setup;
        public Ptr<?> set_cs_timing;
        public Ptr<?> transfer;
        public Ptr<?> cleanup;
        public Ptr<?> can_dma;
        public Ptr<runtime.device> dma_map_dev;
        public Ptr<runtime.device> cur_rx_dma_dev;
        public Ptr<runtime.device> cur_tx_dma_dev;
        public boolean queued;
        public Ptr<KthreadDefinitions.kthread_worker> kworker;
        public KthreadDefinitions.kthread_work pump_messages;
        public  @OriginalName(value="spinlock_t") runtime.spinlock queue_lock;
        public ListDefinitions.list_head queue;
        public Ptr<spi_message> cur_msg;
        public runtime.completion cur_msg_completion;
        public boolean cur_msg_incomplete;
        public boolean cur_msg_need_completion;
        public boolean busy;
        public boolean running;
        public boolean rt;
        public boolean auto_runtime_pm;
        public boolean fallback;
        public boolean last_cs_mode_high;
        public @OriginalName(value="s8") byte @Size(value=16) [] last_cs;
        public @Unsigned int last_cs_index_mask;
        public runtime.completion xfer_completion;
        public @Unsigned long max_dma_len;
        public Ptr<?> optimize_message;
        public Ptr<?> unoptimize_message;
        public Ptr<?> prepare_transfer_hardware;
        public Ptr<?> transfer_one_message;
        public Ptr<?> unprepare_transfer_hardware;
        public Ptr<?> prepare_message;
        public Ptr<?> unprepare_message;
        public Ptr<?> target_abort;
        public Ptr<?> set_cs;
        public Ptr<?> transfer_one;
        public Ptr<?> handle_err;
        public Ptr<spi_controller_mem_ops> mem_ops;
        public Ptr<spi_controller_mem_caps> mem_caps;
        public Ptr<Ptr<GpioDefinitions.gpio_desc>> cs_gpiods;
        public boolean use_gpio_descriptors;
        public @OriginalName(value="s8") byte unused_native_cs;
        public @OriginalName(value="s8") byte max_native_cs;
        public Ptr<spi_statistics> pcpu_statistics;
        public Ptr<DmaDefinitions.dma_chan> dma_tx;
        public Ptr<DmaDefinitions.dma_chan> dma_rx;
        public Ptr<?> dummy_rx;
        public Ptr<?> dummy_tx;
        public Ptr<?> fw_translate_cs;
        public boolean ptp_sts_supported;
        public @Unsigned long irq_flags;
        public boolean queue_empty;
        public boolean must_async;
        public boolean defer_optimize_message;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_device")
    @NotUsableInJava
    public static class spi_device
    extends Struct {
        public runtime.device dev;
        public Ptr<spi_controller> controller;
        public @Unsigned int max_speed_hz;
        public char @Size(value=16) [] chip_select;
        public char bits_per_word;
        public boolean rt;
        public @Unsigned int mode;
        public int irq;
        public Ptr<?> controller_state;
        public Ptr<?> controller_data;
        public char @Size(value=32) [] modalias;
        public String driver_override;
        public Ptr<GpioDefinitions.gpio_desc> @Size(value=16) [] cs_gpiod;
        public spi_delay word_delay;
        public spi_delay cs_setup;
        public spi_delay cs_hold;
        public spi_delay cs_inactive;
        public Ptr<spi_statistics> pcpu_statistics;
        public @Unsigned int cs_index_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_delay")
    @NotUsableInJava
    public static class spi_delay
    extends Struct {
        public @Unsigned short value;
        public char unit;
    }

    @Type(noCCodeGeneration=true, cType="struct spi_statistics")
    @NotUsableInJava
    public static class spi_statistics
    extends Struct {
        public misc.u64_stats_sync syncp;
        public misc.u64_stats_t messages;
        public misc.u64_stats_t transfers;
        public misc.u64_stats_t errors;
        public misc.u64_stats_t timedout;
        public misc.u64_stats_t spi_sync;
        public misc.u64_stats_t spi_sync_immediate;
        public misc.u64_stats_t spi_async;
        public misc.u64_stats_t bytes;
        public misc.u64_stats_t bytes_rx;
        public misc.u64_stats_t bytes_tx;
        public misc.u64_stats_t @Size(value=17) [] transfer_bytes_histo;
        public misc.u64_stats_t transfers_split_maxsize;
    }
}

