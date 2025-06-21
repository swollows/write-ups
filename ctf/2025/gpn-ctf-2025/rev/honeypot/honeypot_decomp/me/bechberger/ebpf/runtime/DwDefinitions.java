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
import me.bechberger.ebpf.runtime.ClkDefinitions;
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.I2cDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MsiDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.ResetDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DwDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_chained_msi_isr(Ptr<IrqDefinitions.irq_desc> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn dw_handle_msi_irq(Ptr<dw_pcie_rp> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_msi_ack_irq(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_msi_mask_irq(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_msi_unmask_irq(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pci_bottom_ack(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pci_bottom_mask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pci_bottom_unmask(Ptr<IrqDefinitions.irq_data> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pci_setup_msi_msg(Ptr<IrqDefinitions.irq_data> d, Ptr<MsiDefinitions.msi_msg> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_allocate_domains(Ptr<dw_pcie_rp> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_free_msi(Ptr<dw_pcie_rp> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_host_deinit(Ptr<dw_pcie_rp> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_host_init(Ptr<dw_pcie_rp> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_iatu_setup(Ptr<dw_pcie_rp> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_irq_domain_alloc(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs, Ptr<?> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_irq_domain_free(Ptr<IrqDefinitions.irq_domain> domain, @Unsigned int virq, @Unsigned int nr_irqs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_msi_host_init(Ptr<dw_pcie_rp> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dw_pcie_other_conf_map_bus(Ptr<PciDefinitions.pci_bus> bus, @Unsigned int devfn, int where) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> dw_pcie_own_conf_map_bus(Ptr<PciDefinitions.pci_bus> bus, @Unsigned int devfn, int where) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_rd_other_conf(Ptr<PciDefinitions.pci_bus> bus, @Unsigned int devfn, int where, int size, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_resume_noirq(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_setup_rc(Ptr<dw_pcie_rp> pp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_suspend_noirq(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_wr_other_conf(Ptr<PciDefinitions.pci_bus> bus, @Unsigned int devfn, int where, int size, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_i2c_exit_driver() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_i2c_init_driver() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_i2c_plat_pm_cleanup(Ptr<dw_i2c_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_i2c_plat_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_i2c_plat_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_plat_pcie_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_plat_pcie_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char __dw_pcie_find_next_cap(Ptr<dw_pcie> pci, char cap_ptr, char cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_disable_atu(Ptr<dw_pcie> pci, @Unsigned int dir, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_edma_detect(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_edma_irq_vector(Ptr<runtime.device> dev, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_edma_remove(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char dw_pcie_find_capability(Ptr<dw_pcie> pci, char cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short dw_pcie_find_ext_capability(Ptr<dw_pcie> pci, char cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_get_resources(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_iatu_detect(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_link_up(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_prog_ep_inbound_atu(Ptr<dw_pcie> pci, char func_no, int index2, int type2, @Unsigned long cpu_addr, char bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_prog_inbound_atu(Ptr<dw_pcie> pci, int index2, int type2, @Unsigned long cpu_addr, @Unsigned long pci_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dw_pcie_prog_outbound_atu($arg1, (const struct dw_pcie_ob_atu_cfg*)$arg2)")
    public static int dw_pcie_prog_outbound_atu(Ptr<dw_pcie> pci, Ptr<dw_pcie_ob_atu_cfg> atu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_read(Ptr<?> addr2, int size, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dw_pcie_read_dbi(Ptr<dw_pcie> pci, @Unsigned int reg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dw_pcie_readl_atu(Ptr<dw_pcie> pci, @Unsigned int dir, @Unsigned int index2, @Unsigned int reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_setup(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_upconfig_setup(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_version_detect(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_wait_for_link(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_write(Ptr<?> addr2, int size, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_write_dbi(Ptr<dw_pcie> pci, @Unsigned int reg, @Unsigned long size, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_write_dbi2(Ptr<dw_pcie> pci, @Unsigned int reg, @Unsigned long size, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_writel_atu(Ptr<dw_pcie> pci, @Unsigned int dir, @Unsigned int index2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_reg_read(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_reg_read_swab(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_reg_read_word(Ptr<?> context2, @Unsigned int reg, Ptr<@Unsigned Integer> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_reg_write(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_reg_write_swab(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_reg_write_word(Ptr<?> context2, @Unsigned int reg, @Unsigned int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char __dw_pcie_ep_find_next_cap(Ptr<dw_pcie_ep> ep, char func_no, char cap_ptr, char cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dw_pcie_ep_reset_bar(Ptr<dw_pcie> pci, char func_no, PciDefinitions.pci_barno bar, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_cleanup(Ptr<dw_pcie_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_clear_bar(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no, Ptr<PciDefinitions.pci_epf_bar> epf_bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_deinit(Ptr<dw_pcie_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct pci_epc_features*)dw_pcie_ep_get_features($arg1, $arg2, $arg3))")
    public static Ptr<PciDefinitions.pci_epc_features> dw_pcie_ep_get_features(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dw_pcie_ep_func> dw_pcie_ep_get_func_from_ep(Ptr<dw_pcie_ep> ep, char func_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_get_msi(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_get_msix(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_init(Ptr<dw_pcie_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_init_non_sticky_registers(Ptr<dw_pcie> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_init_registers(Ptr<dw_pcie_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_linkdown(Ptr<dw_pcie_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_linkup(Ptr<dw_pcie_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_map_addr(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no, @Unsigned @OriginalName(value="phys_addr_t") long addr2, @Unsigned long pci_addr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_raise_intx_irq(Ptr<dw_pcie_ep> ep, char func_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_raise_irq(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no, @Unsigned int type2, @Unsigned short interrupt_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_raise_msi_irq(Ptr<dw_pcie_ep> ep, char func_no, char interrupt_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_raise_msix_irq(Ptr<dw_pcie_ep> ep, char func_no, @Unsigned short interrupt_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_raise_msix_irq_doorbell(Ptr<dw_pcie_ep> ep, char func_no, @Unsigned short interrupt_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_reset_bar(Ptr<dw_pcie> pci, PciDefinitions.pci_barno bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_set_bar(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no, Ptr<PciDefinitions.pci_epf_bar> epf_bar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_set_msi(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no, char interrupts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_set_msix(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no, @Unsigned short interrupts, PciDefinitions.pci_barno bir, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_start(Ptr<PciDefinitions.pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_stop(Ptr<PciDefinitions.pci_epc> epc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dw_pcie_ep_unmap_addr(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no, @Unsigned @OriginalName(value="phys_addr_t") long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dw_pcie_ep_write_header(Ptr<PciDefinitions.pci_epc> epc, char func_no, char vfunc_no, Ptr<PciDefinitions.pci_epf_header> hdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum dw_edma_chip_flags")
    public static enum dw_edma_chip_flags implements Enum<dw_edma_chip_flags>,
    TypedEnum<dw_edma_chip_flags, Integer>
    {
        DW_EDMA_CHIP_LOCAL;

    }

    @Type(noCCodeGeneration=true, cType="struct dw_plat_pcie_of_data")
    @NotUsableInJava
    public static class dw_plat_pcie_of_data
    extends Struct {
        public dw_pcie_device_mode mode;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_plat_pcie")
    @NotUsableInJava
    public static class dw_plat_pcie
    extends Struct {
        public Ptr<dw_pcie> pci;
        public dw_pcie_device_mode mode;
    }

    @Type(noCCodeGeneration=true, cType="enum dw_pcie_device_mode")
    public static enum dw_pcie_device_mode implements Enum<dw_pcie_device_mode>,
    TypedEnum<dw_pcie_device_mode, Integer>
    {
        DW_PCIE_UNKNOWN_TYPE,
        DW_PCIE_EP_TYPE,
        DW_PCIE_LEG_EP_TYPE,
        DW_PCIE_RC_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct dw_i2c_dev")
    @NotUsableInJava
    public static class dw_i2c_dev
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<runtime.regmap> map;
        public Ptr<runtime.regmap> sysmap;
        public Ptr<?> base;
        public Ptr<?> ext;
        public runtime.completion cmd_complete;
        public Ptr<runtime.clk> clk;
        public Ptr<runtime.clk> pclk;
        public Ptr<ResetDefinitions.reset_control> rst;
        public Ptr<I2cDefinitions.i2c_client> slave;
        public Ptr<?> get_clk_rate_khz;
        public int cmd_err;
        public Ptr<I2cDefinitions.i2c_msg> msgs;
        public int msgs_num;
        public int msg_write_idx;
        public @Unsigned int tx_buf_len;
        public Ptr<Character> tx_buf;
        public int msg_read_idx;
        public @Unsigned int rx_buf_len;
        public Ptr<Character> rx_buf;
        public int msg_err;
        public @Unsigned int status;
        public @Unsigned int abort_source;
        public @Unsigned int sw_mask;
        public int irq;
        public @Unsigned int flags;
        public I2cDefinitions.i2c_adapter adapter;
        public @Unsigned int functionality;
        public @Unsigned int master_cfg;
        public @Unsigned int slave_cfg;
        public @Unsigned int tx_fifo_depth;
        public @Unsigned int rx_fifo_depth;
        public int rx_outstanding;
        public I2cDefinitions.i2c_timings timings;
        public @Unsigned int sda_hold_time;
        public @Unsigned short ss_hcnt;
        public @Unsigned short ss_lcnt;
        public @Unsigned short fs_hcnt;
        public @Unsigned short fs_lcnt;
        public @Unsigned short fp_hcnt;
        public @Unsigned short fp_lcnt;
        public @Unsigned short hs_hcnt;
        public @Unsigned short hs_lcnt;
        public Ptr<?> acquire_lock;
        public Ptr<?> release_lock;
        public int semaphore_idx;
        public boolean shared_with_punit;
        public Ptr<?> init;
        public Ptr<?> set_sda_hold_time;
        public int mode;
        public I2cDefinitions.i2c_bus_recovery_info rinfo;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_pcie")
    @NotUsableInJava
    public static class dw_pcie
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<?> dbi_base;
        public @Unsigned @OriginalName(value="resource_size_t") long dbi_phys_addr;
        public Ptr<?> dbi_base2;
        public Ptr<?> atu_base;
        public @Unsigned @OriginalName(value="resource_size_t") long atu_phys_addr;
        public @Unsigned long atu_size;
        public @Unsigned int num_ib_windows;
        public @Unsigned int num_ob_windows;
        public @Unsigned int region_align;
        public @Unsigned long region_limit;
        public dw_pcie_rp pp;
        public dw_pcie_ep ep;
        public Ptr<dw_pcie_ops> ops;
        public @Unsigned int version;
        public @Unsigned int type;
        public @Unsigned long caps;
        public int num_lanes;
        public int max_link_speed;
        public char @Size(value=2) [] n_fts;
        public dw_edma_chip edma;
        public ClkDefinitions.clk_bulk_data @Size(value=3) [] app_clks;
        public ClkDefinitions.clk_bulk_data @Size(value=4) [] core_clks;
        public ResetDefinitions.reset_control_bulk_data @Size(value=3) [] app_rsts;
        public ResetDefinitions.reset_control_bulk_data @Size(value=7) [] core_rsts;
        public Ptr<GpioDefinitions.gpio_desc> pe_rst;
        public boolean suspended;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_pcie_ops")
    @NotUsableInJava
    public static class dw_pcie_ops
    extends Struct {
        public Ptr<?> cpu_addr_fixup;
        public Ptr<?> read_dbi;
        public Ptr<?> write_dbi;
        public Ptr<?> write_dbi2;
        public Ptr<?> link_up;
        public Ptr<?> get_ltssm;
        public Ptr<?> start_link;
        public Ptr<?> stop_link;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_pcie_ep_func")
    @NotUsableInJava
    public static class dw_pcie_ep_func
    extends Struct {
        public ListDefinitions.list_head list;
        public char func_no;
        public char msi_cap;
        public char msix_cap;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_pcie_ep")
    @NotUsableInJava
    public static class dw_pcie_ep
    extends Struct {
        public Ptr<PciDefinitions.pci_epc> epc;
        public ListDefinitions.list_head func_list;
        public Ptr<dw_pcie_ep_ops> ops;
        public @Unsigned @OriginalName(value="phys_addr_t") long phys_base;
        public @Unsigned long addr_size;
        public @Unsigned long page_size;
        public char @Size(value=6) [] bar_to_atu;
        public Ptr<@Unsigned @OriginalName(value="phys_addr_t") Long> outbound_addr;
        public Ptr<@Unsigned Long> ib_window_map;
        public Ptr<@Unsigned Long> ob_window_map;
        public Ptr<?> msi_mem;
        public @Unsigned @OriginalName(value="phys_addr_t") long msi_mem_phys;
        public Ptr<PciDefinitions.pci_epf_bar> @Size(value=6) [] epf_bar;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_pcie_ep_ops")
    @NotUsableInJava
    public static class dw_pcie_ep_ops
    extends Struct {
        public Ptr<?> pre_init;
        public Ptr<?> init;
        public Ptr<?> raise_irq;
        public Ptr<?> get_features;
        public Ptr<?> get_dbi_offset;
        public Ptr<?> get_dbi2_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_pcie_rp")
    @NotUsableInJava
    public static class dw_pcie_rp
    extends Struct {
        public boolean has_msi_ctrl;
        public boolean cfg0_io_shared;
        public @Unsigned long cfg0_base;
        public Ptr<?> va_cfg0_base;
        public @Unsigned int cfg0_size;
        public @Unsigned @OriginalName(value="resource_size_t") long io_base;
        public @Unsigned @OriginalName(value="phys_addr_t") long io_bus_addr;
        public @Unsigned int io_size;
        public int irq;
        public Ptr<dw_pcie_host_ops> ops;
        public int @Size(value=8) [] msi_irq;
        public Ptr<IrqDefinitions.irq_domain> irq_domain;
        public Ptr<IrqDefinitions.irq_domain> msi_domain;
        public @Unsigned @OriginalName(value="dma_addr_t") long msi_data;
        public Ptr<IrqDefinitions.irq_chip> msi_irq_chip;
        public @Unsigned int num_vectors;
        public @Unsigned int @Size(value=8) [] irq_mask;
        public Ptr<PciDefinitions.pci_host_bridge> bridge;
        public  @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public @Unsigned long @Size(value=4) [] msi_irq_in_use;
        public boolean use_atu_msg;
        public int msg_atu_index;
        public Ptr<runtime.resource> msg_res;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_pcie_host_ops")
    @NotUsableInJava
    public static class dw_pcie_host_ops
    extends Struct {
        public Ptr<?> init;
        public Ptr<?> deinit;
        public Ptr<?> post_init;
        public Ptr<?> msi_init;
        public Ptr<?> pme_turn_off;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_pcie_ob_atu_cfg")
    @NotUsableInJava
    public static class dw_pcie_ob_atu_cfg
    extends Struct {
        public int index;
        public int type;
        public char func_no;
        public char code;
        public char routing;
        public @Unsigned long cpu_addr;
        public @Unsigned long pci_addr;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="enum dw_pcie_ltssm")
    public static enum dw_pcie_ltssm implements Enum<dw_pcie_ltssm>,
    TypedEnum<dw_pcie_ltssm, Integer>
    {
        DW_PCIE_LTSSM_DETECT_QUIET,
        DW_PCIE_LTSSM_DETECT_ACT,
        DW_PCIE_LTSSM_L0,
        DW_PCIE_LTSSM_L2_IDLE,
        DW_PCIE_LTSSM_UNKNOWN;

    }

    @Type(noCCodeGeneration=true, cType="enum dw_pcie_core_rst")
    public static enum dw_pcie_core_rst implements Enum<dw_pcie_core_rst>,
    TypedEnum<dw_pcie_core_rst, Integer>
    {
        DW_PCIE_NON_STICKY_RST,
        DW_PCIE_STICKY_RST,
        DW_PCIE_CORE_RST,
        DW_PCIE_PIPE_RST,
        DW_PCIE_PHY_RST,
        DW_PCIE_HOT_RST,
        DW_PCIE_PWR_RST,
        DW_PCIE_NUM_CORE_RSTS;

    }

    @Type(noCCodeGeneration=true, cType="enum dw_pcie_app_rst")
    public static enum dw_pcie_app_rst implements Enum<dw_pcie_app_rst>,
    TypedEnum<dw_pcie_app_rst, Integer>
    {
        DW_PCIE_DBI_RST,
        DW_PCIE_MSTR_RST,
        DW_PCIE_SLV_RST,
        DW_PCIE_NUM_APP_RSTS;

    }

    @Type(noCCodeGeneration=true, cType="enum dw_pcie_core_clk")
    public static enum dw_pcie_core_clk implements Enum<dw_pcie_core_clk>,
    TypedEnum<dw_pcie_core_clk, Integer>
    {
        DW_PCIE_PIPE_CLK,
        DW_PCIE_CORE_CLK,
        DW_PCIE_AUX_CLK,
        DW_PCIE_REF_CLK,
        DW_PCIE_NUM_CORE_CLKS;

    }

    @Type(noCCodeGeneration=true, cType="enum dw_pcie_app_clk")
    public static enum dw_pcie_app_clk implements Enum<dw_pcie_app_clk>,
    TypedEnum<dw_pcie_app_clk, Integer>
    {
        DW_PCIE_DBI_CLK,
        DW_PCIE_MSTR_CLK,
        DW_PCIE_SLV_CLK,
        DW_PCIE_NUM_APP_CLKS;

    }

    @Type(noCCodeGeneration=true, cType="struct dw_edma_chip")
    @NotUsableInJava
    public static class dw_edma_chip
    extends Struct {
        public Ptr<runtime.device> dev;
        public int nr_irqs;
        public Ptr<dw_edma_plat_ops> ops;
        public @Unsigned int flags;
        public Ptr<?> reg_base;
        public @Unsigned short ll_wr_cnt;
        public @Unsigned short ll_rd_cnt;
        public dw_edma_region @Size(value=8) [] ll_region_wr;
        public dw_edma_region @Size(value=8) [] ll_region_rd;
        public dw_edma_region @Size(value=8) [] dt_region_wr;
        public dw_edma_region @Size(value=8) [] dt_region_rd;
        public dw_edma_map_format mf;
        public @OriginalName(value="dw_edma") Ptr<?> dw;
    }

    @Type(noCCodeGeneration=true, cType="enum dw_edma_map_format")
    public static enum dw_edma_map_format implements Enum<dw_edma_map_format>,
    TypedEnum<dw_edma_map_format, Integer>
    {
        EDMA_MF_EDMA_LEGACY,
        EDMA_MF_EDMA_UNROLL,
        EDMA_MF_HDMA_COMPAT,
        EDMA_MF_HDMA_NATIVE;

    }

    @Type(noCCodeGeneration=true, cType="struct dw_edma_plat_ops")
    @NotUsableInJava
    public static class dw_edma_plat_ops
    extends Struct {
        public Ptr<?> irq_vector;
        public Ptr<?> pci_address;
    }

    @Type(noCCodeGeneration=true, cType="struct dw_edma_region")
    @NotUsableInJava
    public static class dw_edma_region
    extends Struct {
        public @Unsigned long paddr;
        public misc.vaddr_of_dw_edma_region vaddr;
        public @Unsigned long sz;
    }
}

