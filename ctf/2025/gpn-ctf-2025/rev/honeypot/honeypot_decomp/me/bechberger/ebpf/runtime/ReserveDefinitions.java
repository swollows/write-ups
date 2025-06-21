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
import me.bechberger.ebpf.runtime.EhciDefinitions;
import me.bechberger.ebpf.runtime.IovaDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ReserveDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_bootmem_region(@Unsigned @OriginalName(value="phys_addr_t") long start, @Unsigned @OriginalName(value="phys_addr_t") long end, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __reserve_bp_slot(Ptr<PerfDefinitions.perf_event> bp, @Unsigned long bp_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.bp_state reserve_additional_memory() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reserve_backup_gdb(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, @Unsigned @OriginalName(value="ext4_group_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_bios_regions() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reserve_bp_slot(Ptr<PerfDefinitions.perf_event> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_ds_buffers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="reserve_region_with_split($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void reserve_region_with_split(Ptr<runtime.resource> root, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reserve_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __reserve_free_pmem(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_bad_mem(@Unsigned long pattern, @Unsigned @OriginalName(value="phys_addr_t") long start_bad, @Unsigned @OriginalName(value="phys_addr_t") long end_bad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_crashkernel_generic(String cmdline, @Unsigned long crash_size, @Unsigned long crash_base, @Unsigned long crash_low_size, boolean high) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.iova> reserve_iova(Ptr<IovaDefinitions.iova_domain> iovad, @Unsigned long pfn_lo, @Unsigned long pfn_hi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_irq_vector_locked(Ptr<IrqDefinitions.irq_data> irqd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_lbr_buffers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reserve_mem(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="reserve_mem_find_by_name((const u8*)$arg1, $arg2, $arg3)")
    public static int reserve_mem_find_by_name(String name, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> start, Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reserve_mem_notifier(Ptr<misc.notifier_block> nb, @Unsigned long action, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_real_mode() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_release_intr_bandwidth(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh, int sign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_release_iso_bandwidth(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_iso_stream> stream, int sign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reserve_evntsel_nmi(@Unsigned int msr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_ibft_region() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_initrd() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_initrd_mem() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reserve_perfctr_nmi(@Unsigned int msr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int reserve_pfn_range(@Unsigned long paddr, @Unsigned long size, Ptr< @OriginalName(value="pgprot_t") runtime.pgprot> vma_prot, int strict_prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean reserve_pmc_hardware() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_range(Ptr<PnpDefinitions.pnp_dev> dev, Ptr<runtime.resource> r, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_standard_io_resources() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void reserve_top_address(@Unsigned long reserve) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct reserve_mem_table")
    @NotUsableInJava
    public static class reserve_mem_table
    extends Struct {
        public char @Size(value=16) [] name;
        public @Unsigned @OriginalName(value="phys_addr_t") long start;
        public @Unsigned @OriginalName(value="phys_addr_t") long size;
    }
}

