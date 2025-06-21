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
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PcieDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AerDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __aer_print_error(Ptr<PciDefinitions.pci_dev> dev, Ptr<aer_err_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aer_dev_correctable_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aer_dev_fatal_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aer_dev_nonfatal_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aer_enable_irq(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aer_enable_rootport(Ptr<aer_rpc> rpc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aer_get_device_error_info(Ptr<PciDefinitions.pci_dev> dev, Ptr<aer_err_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn aer_irq(int irq, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn aer_isr(int irq, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aer_print_error(Ptr<PciDefinitions.pci_dev> dev, Ptr<aer_err_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aer_print_port_info(Ptr<PciDefinitions.pci_dev> dev, Ptr<aer_err_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aer_probe(Ptr<PcieDefinitions.pcie_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aer_process_err_devices(Ptr<aer_err_info> e_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aer_recover_queue(int domain, @Unsigned int bus, @Unsigned int devfn, int severity2, Ptr<aer_capability_regs> aer_regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aer_recover_work_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void aer_remove(Ptr<PcieDefinitions.pcie_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aer_resume(Ptr<PcieDefinitions.pcie_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="pci_ers_result_t") int aer_root_reset(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aer_rootport_total_err_cor_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aer_rootport_total_err_fatal_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long aer_rootport_total_err_nonfatal_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short aer_stats_attrs_are_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> a, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int aer_suspend(Ptr<PcieDefinitions.pcie_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct aer_recover_entry")
    @NotUsableInJava
    public static class aer_recover_entry
    extends Struct {
        public char bus;
        public char devfn;
        public @Unsigned short domain;
        public int severity;
        public Ptr<aer_capability_regs> regs;
    }

    @Type(noCCodeGeneration=true, cType="struct aer_rpc")
    @NotUsableInJava
    public static class aer_rpc
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> rpd;
        public aer_fifo_of_aer_rpc aer_fifo;
    }

    @Type(noCCodeGeneration=true, cType="struct { union { struct __kfifo kfifo; struct aer_err_source *type; const struct aer_err_source*; u8 (*rectype)[0]; struct aer_err_source *ptr; const struct aer_err_source*; }; struct aer_err_source buf[128]; }")
    @NotUsableInJava
    public static class aer_fifo_of_aer_rpc
    extends Struct {
        @InlineUnion(value=93715)
        public  @InlineUnion(value=93715) runtime.__kfifo kfifo;
        @InlineUnion(value=93715)
        public @InlineUnion(value=93715) Ptr<aer_err_source> type;
        @InlineUnion(value=93715)
        public @InlineUnion(value=93715) Ptr<aer_err_source> const_type;
        @InlineUnion(value=93715)
        public @InlineUnion(value=93715) Ptr<char @Size(value=0) []> rectype;
        @InlineUnion(value=93715)
        public @InlineUnion(value=93715) Ptr<aer_err_source> ptr;
        @InlineUnion(value=93715)
        public @InlineUnion(value=93715) Ptr<aer_err_source> ptr_const;
        public aer_err_source @Size(value=128) [] buf;
    }

    @Type(noCCodeGeneration=true, cType="struct aer_err_source")
    @NotUsableInJava
    public static class aer_err_source
    extends Struct {
        public @Unsigned int status;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct aer_stats")
    @NotUsableInJava
    public static class aer_stats
    extends Struct {
        public @Unsigned long @Size(value=16) [] dev_cor_errs;
        public @Unsigned long @Size(value=27) [] dev_fatal_errs;
        public @Unsigned long @Size(value=27) [] dev_nonfatal_errs;
        public @Unsigned long dev_total_cor_errs;
        public @Unsigned long dev_total_fatal_errs;
        public @Unsigned long dev_total_nonfatal_errs;
        public @Unsigned long rootport_total_cor_errs;
        public @Unsigned long rootport_total_fatal_errs;
        public @Unsigned long rootport_total_nonfatal_errs;
    }

    @Type(noCCodeGeneration=true, cType="struct aer_capability_regs")
    @NotUsableInJava
    public static class aer_capability_regs
    extends Struct {
        public @Unsigned int header;
        public @Unsigned int uncor_status;
        public @Unsigned int uncor_mask;
        public @Unsigned int uncor_severity;
        public @Unsigned int cor_status;
        public @Unsigned int cor_mask;
        public @Unsigned int cap_control;
        public PcieDefinitions.pcie_tlp_log header_log;
        public @Unsigned int root_command;
        public @Unsigned int root_status;
        public @Unsigned short cor_err_source;
        public @Unsigned short uncor_err_source;
    }

    @Type(noCCodeGeneration=true, cType="struct aer_err_info")
    @NotUsableInJava
    public static class aer_err_info
    extends Struct {
        public Ptr<PciDefinitions.pci_dev> @Size(value=5) [] dev;
        public int error_dev_num;
        public @Unsigned int id;
        public @Unsigned int severity;
        public @Unsigned int __pad1;
        public @Unsigned int multi_error_valid;
        public @Unsigned int first_error;
        public @Unsigned int __pad2;
        public @Unsigned int tlp_header_valid;
        public @Unsigned int status;
        public @Unsigned int mask;
        public PcieDefinitions.pcie_tlp_log tlp;
    }
}

