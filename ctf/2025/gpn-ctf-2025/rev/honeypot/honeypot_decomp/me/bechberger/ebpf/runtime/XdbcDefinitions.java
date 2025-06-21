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
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class XdbcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdbc_alloc_ring(Ptr<xdbc_segment> seg, Ptr<xdbc_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdbc_bulk_transfer(Ptr<?> data, int size, boolean read2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdbc_free_ring(Ptr<xdbc_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xdbc_get_page(Ptr<@Unsigned @OriginalName(value="dma_addr_t") Long> dma_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdbc_handle_events() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdbc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> xdbc_map_pci_mmio(@Unsigned int bus, @Unsigned int dev, @Unsigned int func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdbc_mem_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xdbc_reset_ring(Ptr<xdbc_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdbc_scrub_function(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xdbc_start() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_state")
    @NotUsableInJava
    public static class xdbc_state
    extends Struct {
        public @Unsigned short vendor;
        public @Unsigned short device;
        public @Unsigned int bus;
        public @Unsigned int dev;
        public @Unsigned int func;
        public Ptr<?> xhci_base;
        public @Unsigned long xhci_start;
        public @Unsigned long xhci_length;
        public int port_number;
        public Ptr<xdbc_regs> xdbc_reg;
        public @Unsigned @OriginalName(value="dma_addr_t") long table_dma;
        public Ptr<?> table_base;
        public @Unsigned @OriginalName(value="dma_addr_t") long erst_dma;
        public @Unsigned long erst_size;
        public Ptr<?> erst_base;
        public xdbc_ring evt_ring;
        public xdbc_segment evt_seg;
        public @Unsigned @OriginalName(value="dma_addr_t") long dbcc_dma;
        public @Unsigned long dbcc_size;
        public Ptr<?> dbcc_base;
        public @Unsigned @OriginalName(value="dma_addr_t") long string_dma;
        public @Unsigned long string_size;
        public Ptr<?> string_base;
        public xdbc_ring out_ring;
        public xdbc_segment out_seg;
        public Ptr<?> out_buf;
        public @Unsigned @OriginalName(value="dma_addr_t") long out_dma;
        public xdbc_ring in_ring;
        public xdbc_segment in_seg;
        public Ptr<?> in_buf;
        public @Unsigned @OriginalName(value="dma_addr_t") long in_dma;
        public @Unsigned int flags;
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_ring")
    @NotUsableInJava
    public static class xdbc_ring
    extends Struct {
        public Ptr<xdbc_segment> segment;
        public Ptr<xdbc_trb> enqueue;
        public Ptr<xdbc_trb> dequeue;
        public @Unsigned int cycle_state;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_segment")
    @NotUsableInJava
    public static class xdbc_segment
    extends Struct {
        public Ptr<xdbc_trb> trbs;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_strings")
    @NotUsableInJava
    public static class xdbc_strings
    extends Struct {
        public char @Size(value=64) [] string0;
        public char @Size(value=64) [] manufacturer;
        public char @Size(value=64) [] product;
        public char @Size(value=64) [] serial;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_context")
    @NotUsableInJava
    public static class xdbc_context
    extends Struct {
        public xdbc_info_context info;
        public xdbc_ep_context out;
        public xdbc_ep_context in;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_ep_context")
    @NotUsableInJava
    public static class xdbc_ep_context
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int ep_info1;
        public @Unsigned @OriginalName(value="__le32") int ep_info2;
        public @Unsigned @OriginalName(value="__le64") long deq;
        public @Unsigned @OriginalName(value="__le32") int tx_info;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=11) [] __reserved_0;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_info_context")
    @NotUsableInJava
    public static class xdbc_info_context
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long string0;
        public @Unsigned @OriginalName(value="__le64") long manufacturer;
        public @Unsigned @OriginalName(value="__le64") long product;
        public @Unsigned @OriginalName(value="__le64") long serial;
        public @Unsigned @OriginalName(value="__le32") int length;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=7) [] __reserved_0;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_erst_entry")
    @NotUsableInJava
    public static class xdbc_erst_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long seg_addr;
        public @Unsigned @OriginalName(value="__le32") int seg_size;
        public @Unsigned @OriginalName(value="__le32") int __reserved_0;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_trb")
    @NotUsableInJava
    public static class xdbc_trb
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int @Size(value=4) [] field;
    }

    @Type(noCCodeGeneration=true, cType="struct xdbc_regs")
    @NotUsableInJava
    public static class xdbc_regs
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

