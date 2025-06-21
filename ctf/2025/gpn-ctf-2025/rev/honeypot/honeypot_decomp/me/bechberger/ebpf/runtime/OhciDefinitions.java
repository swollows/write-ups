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
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.ResetDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class OhciDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_bus_resume(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_bus_suspend(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_dump(Ptr<ohci_hcd> controller2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_dump_intr_mask(Ptr<ohci_hcd> ohci, String label, @Unsigned int mask, Ptr<String> next, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_dump_status(Ptr<ohci_hcd> controller2, Ptr<String> next, Ptr<@Unsigned Integer> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_endpoint_disable(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_get_frame(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_hcd_mod_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_hcd_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_hub_control(Ptr<UsbDefinitions.usb_hcd> hcd, @Unsigned short typeReq, @Unsigned short wValue, @Unsigned short wIndex, String buf, @Unsigned short wLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_hub_status_data(Ptr<UsbDefinitions.usb_hcd> hcd, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_init(Ptr<ohci_hcd> ohci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ohci_init_driver($arg1, (const struct ohci_driver_overrides*)$arg2)")
    public static void ohci_init_driver(Ptr<misc.hc_driver> drv, Ptr<ohci_driver_overrides> over) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="irqreturn_t") runtime.irqreturn ohci_irq(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_restart(Ptr<ohci_hcd> ohci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_resume(Ptr<UsbDefinitions.usb_hcd> hcd, boolean hibernated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_rh_resume(Ptr<ohci_hcd> ohci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_rh_suspend(Ptr<ohci_hcd> ohci, int autostop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_root_hub_state_changes(Ptr<ohci_hcd> ohci, int changed, int any_connected, int rhsc_status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_run(Ptr<ohci_hcd> ohci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_setup(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_shutdown(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_start(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_stop(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_suspend(Ptr<UsbDefinitions.usb_hcd> hcd, boolean do_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_urb_dequeue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_urb_enqueue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_work(Ptr<ohci_hcd> ohci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_pci_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ohci_pci_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int ohci_pci_probe(Ptr<PciDefinitions.pci_dev> dev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_pci_reset(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_pci_resume(Ptr<UsbDefinitions.usb_hcd> hcd, @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_quirk_amd700(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_quirk_amd756(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_quirk_nec(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_quirk_nec_worker(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_quirk_ns(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_quirk_opti(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_quirk_qemu(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_quirk_toshiba_scc(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_quirk_zfmicro(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_platform_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_platform_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_platform_power_off(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_platform_power_on(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_platform_probe(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ohci_platform_remove(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_platform_restore(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_platform_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_platform_resume_common(Ptr<runtime.device> dev, boolean hibernated) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ohci_platform_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ohci_platform_priv")
    @NotUsableInJava
    public static class ohci_platform_priv
    extends Struct {
        public Ptr<runtime.clk> @Size(value=4) [] clks;
        public Ptr<ResetDefinitions.reset_control> resets;
    }

    @Type(noCCodeGeneration=true, cType="struct ohci_driver_overrides")
    @NotUsableInJava
    public static class ohci_driver_overrides
    extends Struct {
        public String product_desc;
        public @Unsigned long extra_priv_size;
        public Ptr<?> reset;
    }

    @Type(noCCodeGeneration=true, cType="struct ohci_hcd")
    @NotUsableInJava
    public static class ohci_hcd
    extends Struct {
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<ohci_regs> regs;
        public Ptr<ohci_hcca> hcca;
        public @Unsigned @OriginalName(value="dma_addr_t") long hcca_dma;
        public Ptr<runtime.ed> ed_rm_list;
        public Ptr<runtime.ed> ed_bulktail;
        public Ptr<runtime.ed> ed_controltail;
        public Ptr<runtime.ed> @Size(value=32) [] periodic;
        public Ptr<?> start_hnp;
        public Ptr<DmaDefinitions.dma_pool> td_cache;
        public Ptr<DmaDefinitions.dma_pool> ed_cache;
        public Ptr<runtime.td> @Size(value=64) [] td_hash;
        public Ptr<runtime.td> dl_start;
        public Ptr<runtime.td> dl_end;
        public ListDefinitions.list_head pending;
        public ListDefinitions.list_head eds_in_use;
        public ohci_rh_state rh_state;
        public int num_ports;
        public int @Size(value=32) [] load;
        public @Unsigned int hc_control;
        public @Unsigned long next_statechange;
        public @Unsigned int fminterval;
        public @Unsigned int autostop;
        public @Unsigned int working;
        public @Unsigned int restart_work;
        public @Unsigned long flags;
        public @Unsigned int prev_frame_no;
        public @Unsigned int wdh_cnt;
        public @Unsigned int prev_wdh_cnt;
        public @Unsigned int prev_donehead;
        public TimerDefinitions.timer_list io_watchdog;
        public misc.work_struct nec_work;
        public Ptr<runtime.dentry> debug_dir;
        public @Unsigned long @Size(value=0) [] priv;
    }

    @Type(noCCodeGeneration=true, cType="enum ohci_rh_state")
    public static enum ohci_rh_state implements Enum<ohci_rh_state>,
    TypedEnum<ohci_rh_state, Integer>
    {
        OHCI_RH_HALTED,
        OHCI_RH_SUSPENDED,
        OHCI_RH_RUNNING;

    }

    @Type(noCCodeGeneration=true, cType="struct ohci_regs")
    @NotUsableInJava
    public static class ohci_regs
    extends Struct {
        public @Unsigned @OriginalName(value="__hc32") int revision;
        public @Unsigned @OriginalName(value="__hc32") int control;
        public @Unsigned @OriginalName(value="__hc32") int cmdstatus;
        public @Unsigned @OriginalName(value="__hc32") int intrstatus;
        public @Unsigned @OriginalName(value="__hc32") int intrenable;
        public @Unsigned @OriginalName(value="__hc32") int intrdisable;
        public @Unsigned @OriginalName(value="__hc32") int hcca;
        public @Unsigned @OriginalName(value="__hc32") int ed_periodcurrent;
        public @Unsigned @OriginalName(value="__hc32") int ed_controlhead;
        public @Unsigned @OriginalName(value="__hc32") int ed_controlcurrent;
        public @Unsigned @OriginalName(value="__hc32") int ed_bulkhead;
        public @Unsigned @OriginalName(value="__hc32") int ed_bulkcurrent;
        public @Unsigned @OriginalName(value="__hc32") int donehead;
        public @Unsigned @OriginalName(value="__hc32") int fminterval;
        public @Unsigned @OriginalName(value="__hc32") int fmremaining;
        public @Unsigned @OriginalName(value="__hc32") int fmnumber;
        public @Unsigned @OriginalName(value="__hc32") int periodicstart;
        public @Unsigned @OriginalName(value="__hc32") int lsthresh;
        public ohci_roothub_regs roothub;
    }

    @Type(noCCodeGeneration=true, cType="struct ohci_roothub_regs")
    @NotUsableInJava
    public static class ohci_roothub_regs
    extends Struct {
        public @Unsigned @OriginalName(value="__hc32") int a;
        public @Unsigned @OriginalName(value="__hc32") int b;
        public @Unsigned @OriginalName(value="__hc32") int status;
        public @Unsigned @OriginalName(value="__hc32") int @Size(value=15) [] portstatus;
    }

    @Type(noCCodeGeneration=true, cType="struct ohci_hcca")
    @NotUsableInJava
    public static class ohci_hcca
    extends Struct {
        public @Unsigned @OriginalName(value="__hc32") int @Size(value=32) [] int_table;
        public @Unsigned @OriginalName(value="__hc32") int frame_no;
        public @Unsigned @OriginalName(value="__hc32") int done_head;
        public char @Size(value=116) [] reserved_for_hc;
        public char @Size(value=4) [] what;
    }
}

