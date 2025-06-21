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
import me.bechberger.ebpf.runtime.DebugfsDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.RegulatorDefinitions;
import me.bechberger.ebpf.runtime.ResetDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class Dwc2Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dwc2_lowlevel_hw_disable(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dwc2_lowlevel_hw_enable(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_check_core_version(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_complete_periodic_xfer(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd, dwc2_halt_status halt_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_driver_probe(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_driver_remove(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_driver_shutdown(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_halt_channel(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, Ptr<dwc2_qtd> qtd, dwc2_halt_status halt_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn dwc2_handle_hcd_intr(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_ack_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_ahberr_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_babble_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_chhltd_intr_dma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_frmovrun_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_n_intr(Ptr<dwc2_hsotg> hsotg, int chnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_nak_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_nyet_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_stall_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_xacterr_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_xfercomp_intr(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_save_data_toggle(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hprt0_enable(Ptr<dwc2_hsotg> hsotg, @Unsigned int hprt0, Ptr<@Unsigned Integer> hprt0_modify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_lowlevel_hw_disable(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_lowlevel_hw_enable(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_lowlevel_hw_init(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_platform_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_platform_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dwc2_readl(Ptr<dwc2_hsotg> hsotg, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_release_channel(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, Ptr<dwc2_qtd> qtd, dwc2_halt_status halt_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_reset_control_assert(Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_update_urb_state(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_hcd_urb> urb2, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_update_urb_state_abn(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_hcd_urb> urb2, Ptr<dwc2_qtd> qtd, dwc2_halt_status halt_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_writel(Ptr<dwc2_hsotg> hsotg, @Unsigned int value, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_xfercomp_isoc_split_in(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_backup_global_registers(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_check_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_cmpl_host_isoc_dma_desc(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, Ptr<dwc2_qtd> qtd, Ptr<dwc2_qh> qh, @Unsigned short idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_complete_isoc_xfer_ddma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, dwc2_halt_status halt_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_complete_non_isoc_xfer_ddma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, dwc2_halt_status halt_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_core_reset(Ptr<dwc2_hsotg> hsotg, boolean skip_wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_desc_list_alloc(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_desc_list_free(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_disable_global_interrupts(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_dump_global_registers(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_dump_host_registers(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_enable_acg(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_enable_global_interrupts(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_enter_hibernation(Ptr<dwc2_hsotg> hsotg, int is_host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_enter_partial_power_down(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_exit_hibernation(Ptr<dwc2_hsotg> hsotg, int rem_wakeup, int reset, int is_host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_exit_partial_power_down(Ptr<dwc2_hsotg> hsotg, int rem_wakeup, boolean restore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_fill_host_isoc_dma_desc(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qtd> qtd, Ptr<dwc2_qh> qh, @Unsigned int max_xfer_size, @Unsigned short idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_flush_rx_fifo(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dwc2_flush_tx_fifo($arg1, (const int)$arg2)")
    public static void dwc2_flush_tx_fifo(Ptr<dwc2_hsotg> hsotg, int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_force_dr_mode(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_force_mode(Ptr<dwc2_hsotg> hsotg, boolean host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_fs_phy_init(Ptr<dwc2_hsotg> hsotg, boolean select_phy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_get_hwparams(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_complete_xfer_ddma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, int chnum, dwc2_halt_status halt_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_qh_free_ddma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_qh_init_ddma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_start_xfer_ddma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hib_restore_common(Ptr<dwc2_hsotg> hsotg, int rem_wakeup, int is_host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hs_phy_init(Ptr<dwc2_hsotg> hsotg, boolean select_phy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hsotg_wait_bit_clear(Ptr<dwc2_hsotg> hsotg, @Unsigned int offset, @Unsigned int mask, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hsotg_wait_bit_set(Ptr<dwc2_hsotg> hsotg, @Unsigned int offset, @Unsigned int mask, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dwc2_hw_is_device(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dwc2_hw_is_host(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dwc2_hw_is_otg(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dwc2_iddig_filter_enabled(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_init_fs_ls_pclk_sel(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_init_isoc_dma_desc(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh, @Unsigned short skip_frames) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_init_non_isoc_dma_desc(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_init_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dwc2_is_controller_alive(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dwc2_op_mode(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_phy_init(Ptr<dwc2_hsotg> hsotg, boolean select_phy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_release_channel_ddma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_restore_essential_regs(Ptr<dwc2_hsotg> hsotg, int rmode, int is_host) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_restore_global_registers(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_amcc_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_amlogic_a1_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_amlogic_g12a_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_amlogic_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_bcm_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_cv1800_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_default_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_his_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_jz4775_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_loongson_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_ltq_ase_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_ltq_danube_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_ltq_xrx200_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_param_tx_fifo_sizes(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_rk_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_s3c6400_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_socfpga_agilex_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_stm32f4x9_fsotg_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_stm32f7_hsotg_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_stm32mp15_fsotg_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_stm32mp15_hsotg_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_x1600_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_x2000_params(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_update_frame_list(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_wait_for_mode(Ptr<dwc2_hsotg> hsotg, boolean host_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _dwc2_hcd_clear_tt_buffer_complete(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _dwc2_hcd_endpoint_disable(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _dwc2_hcd_endpoint_reset(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _dwc2_hcd_get_frame_number(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _dwc2_hcd_hub_control(Ptr<UsbDefinitions.usb_hcd> hcd, @Unsigned short typereq, @Unsigned short wvalue, @Unsigned short windex, String buf, @Unsigned short wlength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _dwc2_hcd_hub_status_data(Ptr<UsbDefinitions.usb_hcd> hcd, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn _dwc2_hcd_irq(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _dwc2_hcd_resume(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _dwc2_hcd_start(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void _dwc2_hcd_stop(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _dwc2_hcd_suspend(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _dwc2_hcd_urb_dequeue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int _dwc2_hcd_urb_enqueue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_alloc_dma_aligned_buffer(Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_assign_and_init_hc(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_backup_host_registers(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int dwc2_calc_frame_interval(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_change_bus_speed(Ptr<UsbDefinitions.usb_hcd> hcd, int speed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_config_fifos(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_conn_id_status_change(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_core_host_init(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_core_init(Ptr<dwc2_hsotg> hsotg, boolean initial_setup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_disable_host_interrupts(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_enable_common_interrupts(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_free_dev(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_free_dma_aligned_buffer(Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn dwc2_handle_common_intr(int irq, Ptr<?> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_handle_gpwrdn_intr(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_handle_lpm_intr(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_handle_otg_intr(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_handle_usb_suspend_intr(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_handle_wakeup_detected_intr(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_cleanup(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hc_continue_transfer(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_halt(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, dwc2_halt_status halt_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_init(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_init_xfer(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, Ptr<dwc2_qtd> qtd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_set_even_odd_frame(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, Ptr<@Unsigned Integer> hcchar) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_start_transfer(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_start_transfer_ddma(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hc_write_packet(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_connect(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_disconnect(Ptr<dwc2_hsotg> hsotg, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_dump_state(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_free(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_get_frame_number(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_get_future_frame_number(Ptr<dwc2_hsotg> hsotg, int us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_hub_control(Ptr<dwc2_hsotg> hsotg, @Unsigned short typereq, @Unsigned short wvalue, @Unsigned short windex, String buf, @Unsigned short wlength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_init(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_is_b_host(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_is_status_changed(Ptr<dwc2_hsotg> hsotg, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_phy_reset_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_queue_transactions(Ptr<dwc2_hsotg> hsotg, dwc2_transaction_type tr_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_reinit(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_remove(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_reset_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static dwc2_transaction_type dwc2_hcd_select_transactions(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_start(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_start_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_stop(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_urb_dequeue(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_hcd_urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dwc2_host_can_poweroff_phy(Ptr<dwc2_hsotg> dwc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_host_complete(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qtd> qtd, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_host_enter_clock_gating(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_host_enter_hibernation(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_host_enter_partial_power_down(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_host_exit_clock_gating(Ptr<dwc2_hsotg> hsotg, int rem_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_host_exit_hibernation(Ptr<dwc2_hsotg> hsotg, int rem_wakeup, int reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_host_exit_partial_power_down(Ptr<dwc2_hsotg> hsotg, int rem_wakeup, boolean restore) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_host_get_speed(Ptr<dwc2_hsotg> hsotg, Ptr<?> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dwc2_tt> dwc2_host_get_tt_info(Ptr<dwc2_hsotg> hsotg, Ptr<?> context2, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<Integer> ttport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_host_put_tt_info(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_tt> dwc_tt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_kill_urbs_in_qh_list(Ptr<dwc2_hsotg> hsotg, Ptr<ListDefinitions.list_head> qh_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_map_urb_for_dma(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_port_resume(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_port_suspend(Ptr<dwc2_hsotg> hsotg, @Unsigned short windex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_process_non_periodic_channels(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_process_periodic_channels(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_qh_list_free(Ptr<dwc2_hsotg> hsotg, Ptr<ListDefinitions.list_head> qh_list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_queue_transaction(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_host_chan> chan, @Unsigned short fifo_dwords_avail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_read_packet(Ptr<dwc2_hsotg> hsotg, Ptr<Character> dest, @Unsigned short bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_reset_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_restore_host_registers(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_set_pid_isoc(Ptr<dwc2_host_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_unmap_urb_for_dma(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_wakeup_detected(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_wakeup_from_lpm_l1(Ptr<dwc2_hsotg> hsotg, boolean remotewakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_debugfs_exit(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_debugfs_init(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_do_reserve(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_do_unreserve(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_drd_exit(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_drd_init(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_drd_resume(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_drd_role_sw_set(Ptr<UsbDefinitions.usb_role_switch> sw, UsbDefinitions.usb_role role) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_drd_suspend(Ptr<dwc2_hsotg> hsotg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_qh_add(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<dwc2_qh> dwc2_hcd_qh_create(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_hcd_urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_qh_deactivate(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh, int sched_next_periodic_split) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_qh_free(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_qh_unlink(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_hcd_qtd_add(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qtd> qtd, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_hcd_qtd_init(Ptr<dwc2_qtd> qtd, Ptr<dwc2_hcd_urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_ovr_avalid(Ptr<dwc2_hsotg> hsotg, boolean valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_ovr_bvalid(Ptr<dwc2_hsotg> hsotg, boolean valid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_pick_first_frame(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_qh_init(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh, Ptr<dwc2_hcd_urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dwc2_uframe_schedule_split(Ptr<dwc2_hsotg> hsotg, Ptr<dwc2_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dwc2_unreserve_timer_fn(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart dwc2_wait_timer_fn(Ptr<runtime.hrtimer> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_hsotg_plat")
    @NotUsableInJava
    public static class dwc2_hsotg_plat
    extends Struct {
        public dwc2_hsotg_dmamode dma;
        public @Unsigned int is_osc;
        public int phy_type;
        public Ptr<?> phy_init;
        public Ptr<?> phy_exit;
    }

    @Type(noCCodeGeneration=true, cType="enum dwc2_hsotg_dmamode")
    public static enum dwc2_hsotg_dmamode implements Enum<dwc2_hsotg_dmamode>,
    TypedEnum<dwc2_hsotg_dmamode, Integer>
    {
        S3C_HSOTG_DMA_NONE,
        S3C_HSOTG_DMA_ONLY,
        S3C_HSOTG_DMA_DRV;

    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_hs_transfer_time")
    @NotUsableInJava
    public static class dwc2_hs_transfer_time
    extends Struct {
        public @Unsigned int start_schedule_us;
        public @Unsigned short duration_us;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_tt")
    @NotUsableInJava
    public static class dwc2_tt
    extends Struct {
        public int refcount;
        public Ptr<UsbDefinitions.usb_tt> usb_tt;
        public @Unsigned long @Size(value=0) [] periodic_bitmaps;
    }

    @Type(noCCodeGeneration=true, cType="enum dwc2_transaction_type")
    public static enum dwc2_transaction_type implements Enum<dwc2_transaction_type>,
    TypedEnum<dwc2_transaction_type, Integer>
    {
        DWC2_TRANSACTION_NONE,
        DWC2_TRANSACTION_PERIODIC,
        DWC2_TRANSACTION_NON_PERIODIC,
        DWC2_TRANSACTION_ALL;

    }

    @Type(noCCodeGeneration=true, cType="enum dwc2_control_phase")
    public static enum dwc2_control_phase implements Enum<dwc2_control_phase>,
    TypedEnum<dwc2_control_phase, Integer>
    {
        DWC2_CONTROL_SETUP,
        DWC2_CONTROL_DATA,
        DWC2_CONTROL_STATUS;

    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_qtd")
    @NotUsableInJava
    public static class dwc2_qtd
    extends Struct {
        public dwc2_control_phase control_phase;
        public char in_process;
        public char data_toggle;
        public char complete_split;
        public char isoc_split_pos;
        public @Unsigned short isoc_frame_index;
        public @Unsigned short isoc_split_offset;
        public @Unsigned short isoc_td_last;
        public @Unsigned short isoc_td_first;
        public @Unsigned int ssplit_out_xfer_count;
        public char error_count;
        public char n_desc;
        public @Unsigned short isoc_frame_index_last;
        public @Unsigned short num_naks;
        public Ptr<dwc2_hcd_urb> urb;
        public Ptr<dwc2_qh> qh;
        public ListDefinitions.list_head qtd_list_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_hcd_urb")
    @NotUsableInJava
    public static class dwc2_hcd_urb
    extends Struct {
        public Ptr<?> priv;
        public Ptr<dwc2_qtd> qtd;
        public Ptr<?> buf;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
        public Ptr<?> setup_packet;
        public @Unsigned @OriginalName(value="dma_addr_t") long setup_dma;
        public @Unsigned int length;
        public @Unsigned int actual_length;
        public @Unsigned int status;
        public @Unsigned int error_count;
        public @Unsigned int packet_count;
        public @Unsigned int flags;
        public @Unsigned short interval;
        public dwc2_hcd_pipe_info pipe_info;
        public dwc2_hcd_iso_packet_desc @Size(value=0) [] iso_descs;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_hcd_iso_packet_desc")
    @NotUsableInJava
    public static class dwc2_hcd_iso_packet_desc
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int length;
        public @Unsigned int actual_length;
        public @Unsigned int status;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_hcd_pipe_info")
    @NotUsableInJava
    public static class dwc2_hcd_pipe_info
    extends Struct {
        public char dev_addr;
        public char ep_num;
        public char pipe_type;
        public char pipe_dir;
        public @Unsigned short maxp;
        public @Unsigned short maxp_mult;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_qh")
    @NotUsableInJava
    public static class dwc2_qh
    extends Struct {
        public Ptr<dwc2_hsotg> hsotg;
        public char ep_type;
        public char ep_is_in;
        public @Unsigned short maxp;
        public @Unsigned short maxp_mult;
        public char dev_speed;
        public char data_toggle;
        public char ping_state;
        public char do_split;
        public char td_first;
        public char td_last;
        public @Unsigned short host_us;
        public @Unsigned short device_us;
        public @Unsigned short host_interval;
        public @Unsigned short device_interval;
        public @Unsigned short next_active_frame;
        public @Unsigned short start_active_frame;
        public short num_hs_transfers;
        public dwc2_hs_transfer_time @Size(value=8) [] hs_transfers;
        public @Unsigned int ls_start_schedule_slice;
        public @Unsigned short ntd;
        public Ptr<Character> dw_align_buf;
        public @Unsigned @OriginalName(value="dma_addr_t") long dw_align_buf_dma;
        public ListDefinitions.list_head qtd_list;
        public Ptr<dwc2_host_chan> channel;
        public ListDefinitions.list_head qh_list_entry;
        public Ptr<dwc2_dma_desc> desc_list;
        public @Unsigned @OriginalName(value="dma_addr_t") long desc_list_dma;
        public @Unsigned int desc_list_sz;
        public Ptr<@Unsigned Integer> n_bytes;
        public TimerDefinitions.timer_list unreserve_timer;
        public runtime.hrtimer wait_timer;
        public Ptr<dwc2_tt> dwc_tt;
        public int ttport;
        public @Unsigned int tt_buffer_dirty;
        public @Unsigned int unreserve_pending;
        public @Unsigned int schedule_low_speed;
        public @Unsigned int want_wait;
        public @Unsigned int wait_timer_cancel;
    }

    @Type(noCCodeGeneration=true, cType="enum dwc2_halt_status")
    public static enum dwc2_halt_status implements Enum<dwc2_halt_status>,
    TypedEnum<dwc2_halt_status, Integer>
    {
        DWC2_HC_XFER_NO_HALT_STATUS,
        DWC2_HC_XFER_COMPLETE,
        DWC2_HC_XFER_URB_COMPLETE,
        DWC2_HC_XFER_ACK,
        DWC2_HC_XFER_NAK,
        DWC2_HC_XFER_NYET,
        DWC2_HC_XFER_STALL,
        DWC2_HC_XFER_XACT_ERR,
        DWC2_HC_XFER_FRAME_OVERRUN,
        DWC2_HC_XFER_BABBLE_ERR,
        DWC2_HC_XFER_DATA_TOGGLE_ERR,
        DWC2_HC_XFER_AHB_ERR,
        DWC2_HC_XFER_PERIODIC_INCOMPLETE,
        DWC2_HC_XFER_URB_DEQUEUE;

    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_host_chan")
    @NotUsableInJava
    public static class dwc2_host_chan
    extends Struct {
        public char hc_num;
        public @Unsigned int dev_addr;
        public @Unsigned int ep_num;
        public @Unsigned int ep_is_in;
        public @Unsigned int speed;
        public @Unsigned int ep_type;
        public @Unsigned int max_packet;
        public @Unsigned int data_pid_start;
        public @Unsigned int multi_count;
        public Ptr<Character> xfer_buf;
        public @Unsigned @OriginalName(value="dma_addr_t") long xfer_dma;
        public @Unsigned @OriginalName(value="dma_addr_t") long align_buf;
        public @Unsigned int xfer_len;
        public @Unsigned int xfer_count;
        public @Unsigned short start_pkt_count;
        public char xfer_started;
        public char do_ping;
        public char error_state;
        public char halt_on_queue;
        public char halt_pending;
        public char do_split;
        public char complete_split;
        public char hub_addr;
        public char hub_port;
        public char xact_pos;
        public char requests;
        public char schinfo;
        public @Unsigned short ntd;
        public dwc2_halt_status halt_status;
        public @Unsigned int hcint;
        public Ptr<dwc2_qh> qh;
        public ListDefinitions.list_head hc_list_entry;
        public @Unsigned @OriginalName(value="dma_addr_t") long desc_list_addr;
        public @Unsigned int desc_list_sz;
        public ListDefinitions.list_head split_order_list_entry;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_dma_desc")
    @NotUsableInJava
    public static class dwc2_dma_desc
    extends Struct {
        public @Unsigned int status;
        public @Unsigned int buf;
    }

    @Type(noCCodeGeneration=true, cType="union dwc2_hcd_internal_flags")
    @NotUsableInJava
    public static class dwc2_hcd_internal_flags
    extends Union {
        public @Unsigned int d32;
        public misc.b_of_dwc2_hcd_internal_flags b;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_hregs_backup")
    @NotUsableInJava
    public static class dwc2_hregs_backup
    extends Struct {
        public @Unsigned int hcfg;
        public @Unsigned int hflbaddr;
        public @Unsigned int haintmsk;
        public @Unsigned int @Size(value=16) [] hcchar;
        public @Unsigned int @Size(value=16) [] hcsplt;
        public @Unsigned int @Size(value=16) [] hcintmsk;
        public @Unsigned int @Size(value=16) [] hctsiz;
        public @Unsigned int @Size(value=16) [] hcidma;
        public @Unsigned int @Size(value=16) [] hcidmab;
        public @Unsigned int hprt0;
        public @Unsigned int hfir;
        public @Unsigned int hptxfsiz;
        public boolean valid;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_dregs_backup")
    @NotUsableInJava
    public static class dwc2_dregs_backup
    extends Struct {
        public @Unsigned int dcfg;
        public @Unsigned int dctl;
        public @Unsigned int daintmsk;
        public @Unsigned int diepmsk;
        public @Unsigned int doepmsk;
        public @Unsigned int @Size(value=16) [] diepctl;
        public @Unsigned int @Size(value=16) [] dieptsiz;
        public @Unsigned int @Size(value=16) [] diepdma;
        public @Unsigned int @Size(value=16) [] doepctl;
        public @Unsigned int @Size(value=16) [] doeptsiz;
        public @Unsigned int @Size(value=16) [] doepdma;
        public @Unsigned int @Size(value=16) [] dtxfsiz;
        public boolean valid;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_gregs_backup")
    @NotUsableInJava
    public static class dwc2_gregs_backup
    extends Struct {
        public @Unsigned int gotgctl;
        public @Unsigned int gintmsk;
        public @Unsigned int gahbcfg;
        public @Unsigned int gusbcfg;
        public @Unsigned int grxfsiz;
        public @Unsigned int gnptxfsiz;
        public @Unsigned int gi2cctl;
        public @Unsigned int glpmcfg;
        public @Unsigned int pcgcctl;
        public @Unsigned int pcgcctl1;
        public @Unsigned int gdfifocfg;
        public @Unsigned int gpwrdn;
        public boolean valid;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_hw_params")
    @NotUsableInJava
    public static class dwc2_hw_params
    extends Struct {
        public @Unsigned int op_mode;
        public @Unsigned int arch;
        public @Unsigned int dma_desc_enable;
        public @Unsigned int enable_dynamic_fifo;
        public @Unsigned int en_multiple_tx_fifo;
        public @Unsigned int rx_fifo_size;
        public @Unsigned int host_nperio_tx_fifo_size;
        public @Unsigned int dev_nperio_tx_fifo_size;
        public @Unsigned int host_perio_tx_fifo_size;
        public @Unsigned int nperio_tx_q_depth;
        public @Unsigned int host_perio_tx_q_depth;
        public @Unsigned int dev_token_q_depth;
        public @Unsigned int max_transfer_size;
        public @Unsigned int max_packet_count;
        public @Unsigned int host_channels;
        public @Unsigned int hs_phy_type;
        public @Unsigned int fs_phy_type;
        public @Unsigned int i2c_enable;
        public @Unsigned int acg_enable;
        public @Unsigned int num_dev_ep;
        public @Unsigned int num_dev_in_eps;
        public @Unsigned int num_dev_perio_in_ep;
        public @Unsigned int total_fifo_size;
        public @Unsigned int power_optimized;
        public @Unsigned int hibernation;
        public @Unsigned int utmi_phy_data_width;
        public @Unsigned int lpm_mode;
        public @Unsigned int ipg_isoc_en;
        public @Unsigned int service_interval_mode;
        public @Unsigned int snpsid;
        public @Unsigned int dev_ep_dirs;
        public @Unsigned int @Size(value=16) [] g_tx_fifo_size;
    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_core_params")
    @NotUsableInJava
    public static class dwc2_core_params
    extends Struct {
        public UsbDefinitions.usb_otg_caps otg_caps;
        public char phy_type;
        public char speed;
        public char phy_utmi_width;
        public boolean eusb2_disc;
        public boolean phy_ulpi_ddr;
        public boolean phy_ulpi_ext_vbus;
        public boolean enable_dynamic_fifo;
        public boolean en_multiple_tx_fifo;
        public boolean i2c_enable;
        public boolean acg_enable;
        public boolean ulpi_fs_ls;
        public boolean ts_dline;
        public boolean reload_ctl;
        public boolean uframe_sched;
        public boolean external_id_pin_ctl;
        public int power_down;
        public boolean no_clock_gating;
        public boolean lpm;
        public boolean lpm_clock_gating;
        public boolean besl;
        public boolean hird_threshold_en;
        public boolean service_interval;
        public char hird_threshold;
        public boolean activate_stm_fs_transceiver;
        public boolean activate_stm_id_vb_detection;
        public boolean activate_ingenic_overcurrent_detection;
        public boolean ipg_isoc_en;
        public @Unsigned short max_packet_count;
        public @Unsigned int max_transfer_size;
        public @Unsigned int ahbcfg;
        public @Unsigned int ref_clk_per;
        public @Unsigned short sof_cnt_wkup_alert;
        public boolean host_dma;
        public boolean dma_desc_enable;
        public boolean dma_desc_fs_enable;
        public boolean host_support_fs_ls_low_power;
        public boolean host_ls_low_power_phy_clk;
        public boolean oc_disable;
        public char host_channels;
        public @Unsigned short host_rx_fifo_size;
        public @Unsigned short host_nperio_tx_fifo_size;
        public @Unsigned short host_perio_tx_fifo_size;
        public boolean g_dma;
        public boolean g_dma_desc;
        public @Unsigned int g_rx_fifo_size;
        public @Unsigned int g_np_tx_fifo_size;
        public @Unsigned int @Size(value=16) [] g_tx_fifo_size;
        public boolean change_speed_quirk;
    }

    @Type(noCCodeGeneration=true, cType="enum dwc2_lx_state")
    public static enum dwc2_lx_state implements Enum<dwc2_lx_state>,
    TypedEnum<dwc2_lx_state, Integer>
    {
        DWC2_L0,
        DWC2_L1,
        DWC2_L2,
        DWC2_L3;

    }

    @Type(noCCodeGeneration=true, cType="struct dwc2_hsotg")
    @NotUsableInJava
    public static class dwc2_hsotg
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<?> regs;
        public dwc2_hw_params hw_params;
        public dwc2_core_params params;
        public UsbDefinitions.usb_otg_state op_state;
        public UsbDefinitions.usb_dr_mode dr_mode;
        public Ptr<UsbDefinitions.usb_role_switch> role_sw;
        public UsbDefinitions.usb_dr_mode role_sw_default_mode;
        public @Unsigned int hcd_enabled;
        public @Unsigned int gadget_enabled;
        public @Unsigned int ll_hw_enabled;
        public @Unsigned int hibernated;
        public @Unsigned int in_ppd;
        public boolean bus_suspended;
        public @Unsigned int reset_phy_on_wake;
        public @Unsigned int need_phy_for_wake;
        public @Unsigned int phy_off_for_suspend;
        public @Unsigned short frame_number;
        public Ptr<runtime.phy> phy;
        public Ptr<UsbDefinitions.usb_phy> uphy;
        public Ptr<dwc2_hsotg_plat> plat;
        public RegulatorDefinitions.regulator_bulk_data @Size(value=2) [] supplies;
        public Ptr<runtime.regulator> vbus_supply;
        public Ptr<runtime.regulator> usb33d;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<?> priv;
        public int irq;
        public Ptr<runtime.clk> clk;
        public Ptr<runtime.clk> utmi_clk;
        public Ptr<ResetDefinitions.reset_control> reset;
        public Ptr<ResetDefinitions.reset_control> reset_ecc;
        public @Unsigned int queuing_high_bandwidth;
        public @Unsigned int srp_success;
        public Ptr<WorkqueueDefinitions.workqueue_struct> wq_otg;
        public misc.work_struct wf_otg;
        public TimerDefinitions.timer_list wkp_timer;
        public dwc2_lx_state lx_state;
        public dwc2_gregs_backup gr_backup;
        public dwc2_dregs_backup dr_backup;
        public dwc2_hregs_backup hr_backup;
        public Ptr<runtime.dentry> debug_root;
        public Ptr<DebugfsDefinitions.debugfs_regset32> regset;
        public boolean needs_byte_swap;
        public dwc2_hcd_internal_flags flags;
        public ListDefinitions.list_head non_periodic_sched_inactive;
        public ListDefinitions.list_head non_periodic_sched_waiting;
        public ListDefinitions.list_head non_periodic_sched_active;
        public Ptr<ListDefinitions.list_head> non_periodic_qh_ptr;
        public ListDefinitions.list_head periodic_sched_inactive;
        public ListDefinitions.list_head periodic_sched_ready;
        public ListDefinitions.list_head periodic_sched_assigned;
        public ListDefinitions.list_head periodic_sched_queued;
        public ListDefinitions.list_head split_order;
        public @Unsigned short periodic_usecs;
        public @Unsigned long @Size(value=13) [] hs_periodic_bitmap;
        public @Unsigned short periodic_qh_count;
        public boolean new_connection;
        public @Unsigned short last_frame_num;
        public ListDefinitions.list_head free_hc_list;
        public int periodic_channels;
        public int non_periodic_channels;
        public int available_host_channels;
        public Ptr<dwc2_host_chan> @Size(value=16) [] hc_ptr_array;
        public Ptr<Character> status_buf;
        public @Unsigned @OriginalName(value="dma_addr_t") long status_buf_dma;
        public DelayedDefinitions.delayed_work start_work;
        public DelayedDefinitions.delayed_work reset_work;
        public misc.work_struct phy_reset_work;
        public char otg_port;
        public Ptr<@Unsigned Integer> frame_list;
        public @Unsigned @OriginalName(value="dma_addr_t") long frame_list_dma;
        public @Unsigned int frame_list_sz;
        public Ptr<KmemDefinitions.kmem_cache> desc_gen_cache;
        public Ptr<KmemDefinitions.kmem_cache> desc_hsisoc_cache;
        public Ptr<KmemDefinitions.kmem_cache> unaligned_cache;
    }
}

