/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class HcdDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_pci_poweroff_late(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_pci_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_pci_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_pci_resume_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_pci_runtime_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_pci_runtime_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_pci_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_pci_suspend_noirq(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> hcd_buffer_alloc(Ptr<UsbDefinitions.usb_bus> bus, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> hcd_buffer_alloc_pages(Ptr<UsbDefinitions.usb_hcd> hcd, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_buffer_create(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hcd_buffer_destroy(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hcd_buffer_free(Ptr<UsbDefinitions.usb_bus> bus, @Unsigned long size, Ptr<?> addr2, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hcd_buffer_free_pages(Ptr<UsbDefinitions.usb_hcd> hcd, @Unsigned long size, Ptr<?> addr2, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_alloc_coherent(Ptr<UsbDefinitions.usb_bus> bus, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, Ptr<Ptr<?>> vaddr_handle, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_bus_resume(Ptr<UsbDefinitions.usb_device> rhdev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hcd_bus_suspend(Ptr<UsbDefinitions.usb_device> rhdev,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hcd_died_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hcd_free_coherent(Ptr<UsbDefinitions.usb_bus> bus, Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_handle, Ptr<Ptr<?>> vaddr_handle, @Unsigned long size, DmaDefinitions.dma_data_direction dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hcd_release(Ptr<runtime.kref> kref2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void hcd_resume_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }
}

