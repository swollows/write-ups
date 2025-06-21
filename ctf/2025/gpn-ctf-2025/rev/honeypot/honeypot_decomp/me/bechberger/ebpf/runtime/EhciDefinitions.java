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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.HrtimerDefinitions;
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
import me.bechberger.ebpf.type.Union;

public final class EhciDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_post_add(Ptr<PciDefinitions.pci_dev> pdev, Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<PciDefinitions.pci_dev> companion, Ptr<UsbDefinitions.usb_hcd> companion_hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_pre_add(Ptr<PciDefinitions.pci_dev> pdev, Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<PciDefinitions.pci_dev> companion, Ptr<UsbDefinitions.usb_hcd> companion_hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_remove(Ptr<PciDefinitions.pci_dev> pdev, Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<PciDefinitions.pci_dev> companion, Ptr<UsbDefinitions.usb_hcd> companion_hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_wait_for_companions(Ptr<PciDefinitions.pci_dev> pdev, Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<PciDefinitions.pci_dev> companion, Ptr<UsbDefinitions.usb_hcd> companion_hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_pci_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ehci_pci_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int ehci_pci_probe(Ptr<PciDefinitions.pci_dev> pdev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_pci_reinit(Ptr<ehci_hcd> ehci, Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_pci_remove(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_pci_resume(Ptr<UsbDefinitions.usb_hcd> hcd, @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_pci_setup(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_adjust_port_wakeup_flags(Ptr<ehci_hcd> ehci, boolean suspending, boolean do_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_bus_resume(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_bus_suspend(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_clear_tt_buffer(Ptr<ehci_hcd> ehci, Ptr<ehci_qh> qh, Ptr<runtime.urb> urb2, @Unsigned int token) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_clear_tt_buffer_complete(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_disable_ASE(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_disable_PSE(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_enable_event(Ptr<ehci_hcd> ehci, @Unsigned int event2, boolean resched) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_endpoint_disable(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_endpoint_reset(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_get_frame(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ehci_get_resuming_ports(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_halt(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_handle_controller_death(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_handle_intr_unlinks(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_handle_start_intr_unlinks(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_handover_companion_ports(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_handshake(Ptr<ehci_hcd> ehci, Ptr<?> ptr, @Unsigned int mask, @Unsigned int done, int usec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_hcd_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_hcd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static HrtimerDefinitions.hrtimer_restart ehci_hrtimer_func(Ptr<runtime.hrtimer> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_hub_control(Ptr<UsbDefinitions.usb_hcd> hcd, @Unsigned short typeReq, @Unsigned short wValue, @Unsigned short wIndex, String buf, @Unsigned short wLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_hub_descriptor(Ptr<ehci_hcd> ehci, Ptr<UsbDefinitions.usb_hub_descriptor> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_hub_status_data(Ptr<UsbDefinitions.usb_hcd> hcd, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_iaa_watchdog(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_init(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ehci_init_driver($arg1, (const struct ehci_driver_overrides*)$arg2)")
    public static void ehci_init_driver(Ptr<misc.hc_driver> drv, Ptr<ehci_driver_overrides> over) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="irqreturn_t") runtime.irqreturn ehci_irq(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_mem_cleanup(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_mem_init(Ptr<ehci_hcd> ehci, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_poll_ASS(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_poll_PSS(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_port_handed_over(Ptr<UsbDefinitions.usb_hcd> hcd, int portnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_port_power(Ptr<ehci_hcd> ehci, int portnum, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ehci_qh> ehci_qh_alloc(Ptr<ehci_hcd> ehci, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ehci_qtd> ehci_qtd_alloc(Ptr<ehci_hcd> ehci, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_quiesce(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_relinquish_port(Ptr<UsbDefinitions.usb_hcd> hcd, int portnum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_remove_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_reset(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_resume(Ptr<UsbDefinitions.usb_hcd> hcd, boolean force_reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_run(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_shutdown(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_silence_controller(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_stop(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_suspend(Ptr<UsbDefinitions.usb_hcd> hcd, boolean do_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_urb_dequeue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_urb_done(Ptr<ehci_hcd> ehci, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_urb_enqueue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_work(Ptr<ehci_hcd> ehci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_platform_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_platform_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_platform_power_off(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_platform_power_on(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_platform_probe(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ehci_platform_remove(Ptr<PlatformDefinitions.platform_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_platform_reset(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_platform_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ehci_platform_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_dev")
    @NotUsableInJava
    public static class ehci_dev
    extends Struct {
        public @Unsigned int bus;
        public @Unsigned int slot;
        public @Unsigned int func;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_tt")
    @NotUsableInJava
    public static class ehci_tt
    extends Struct {
        public @Unsigned short @Size(value=8) [] bandwidth;
        public ListDefinitions.list_head tt_list;
        public ListDefinitions.list_head ps_list;
        public Ptr<UsbDefinitions.usb_tt> usb_tt;
        public int tt_port;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_iso_sched")
    @NotUsableInJava
    public static class ehci_iso_sched
    extends Struct {
        public ListDefinitions.list_head td_list;
        public @Unsigned int span;
        public @Unsigned int first_packet;
        public ehci_iso_packet @Size(value=0) [] packet;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_iso_packet")
    @NotUsableInJava
    public static class ehci_iso_packet
    extends Struct {
        public @Unsigned long bufp;
        public @Unsigned @OriginalName(value="__le32") int transaction;
        public char cross;
        public @Unsigned int buf1;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_platform_priv")
    @NotUsableInJava
    public static class ehci_platform_priv
    extends Struct {
        public Ptr<runtime.clk> @Size(value=4) [] clks;
        public Ptr<ResetDefinitions.reset_control> rsts;
        public boolean reset_on_resume;
        public boolean quirk_poll;
        public TimerDefinitions.timer_list poll_timer;
        public DelayedDefinitions.delayed_work poll_work;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_driver_overrides")
    @NotUsableInJava
    public static class ehci_driver_overrides
    extends Struct {
        public @Unsigned long extra_priv_size;
        public Ptr<?> reset;
        public Ptr<?> port_power;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_iso_stream")
    @NotUsableInJava
    public static class ehci_iso_stream
    extends Struct {
        public Ptr<ehci_qh_hw> hw;
        public char bEndpointAddress;
        public char highspeed;
        public ListDefinitions.list_head td_list;
        public ListDefinitions.list_head free_list;
        public ehci_per_sched ps;
        public @Unsigned int next_uframe;
        public @Unsigned @OriginalName(value="__le32") int splits;
        public @Unsigned short uperiod;
        public @Unsigned short maxp;
        public @Unsigned int bandwidth;
        public @Unsigned @OriginalName(value="__le32") int buf0;
        public @Unsigned @OriginalName(value="__le32") int buf1;
        public @Unsigned @OriginalName(value="__le32") int buf2;
        public @Unsigned @OriginalName(value="__le32") int address;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_qh_hw")
    @NotUsableInJava
    public static class ehci_qh_hw
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int hw_next;
        public @Unsigned @OriginalName(value="__le32") int hw_info1;
        public @Unsigned @OriginalName(value="__le32") int hw_info2;
        public @Unsigned @OriginalName(value="__le32") int hw_current;
        public @Unsigned @OriginalName(value="__le32") int hw_qtd_next;
        public @Unsigned @OriginalName(value="__le32") int hw_alt_next;
        public @Unsigned @OriginalName(value="__le32") int hw_token;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=5) [] hw_buf;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=5) [] hw_buf_hi;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_fstn")
    @NotUsableInJava
    public static class ehci_fstn
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int hw_next;
        public @Unsigned @OriginalName(value="__le32") int hw_prev;
        public @Unsigned @OriginalName(value="dma_addr_t") long fstn_dma;
        public ehci_shadow fstn_next;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_qtd")
    @NotUsableInJava
    public static class ehci_qtd
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int hw_next;
        public @Unsigned @OriginalName(value="__le32") int hw_alt_next;
        public @Unsigned @OriginalName(value="__le32") int hw_token;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=5) [] hw_buf;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=5) [] hw_buf_hi;
        public @Unsigned @OriginalName(value="dma_addr_t") long qtd_dma;
        public ListDefinitions.list_head qtd_list;
        public Ptr<runtime.urb> urb;
        public @Unsigned long length;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_sitd")
    @NotUsableInJava
    public static class ehci_sitd
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int hw_next;
        public @Unsigned @OriginalName(value="__le32") int hw_fullspeed_ep;
        public @Unsigned @OriginalName(value="__le32") int hw_uframe;
        public @Unsigned @OriginalName(value="__le32") int hw_results;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=2) [] hw_buf;
        public @Unsigned @OriginalName(value="__le32") int hw_backpointer;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=2) [] hw_buf_hi;
        public @Unsigned @OriginalName(value="dma_addr_t") long sitd_dma;
        public ehci_shadow sitd_next;
        public Ptr<runtime.urb> urb;
        public Ptr<ehci_iso_stream> stream;
        public ListDefinitions.list_head sitd_list;
        public @Unsigned int frame;
        public @Unsigned int index;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_itd")
    @NotUsableInJava
    public static class ehci_itd
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int hw_next;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=8) [] hw_transaction;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=7) [] hw_bufp;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=7) [] hw_bufp_hi;
        public @Unsigned @OriginalName(value="dma_addr_t") long itd_dma;
        public ehci_shadow itd_next;
        public Ptr<runtime.urb> urb;
        public Ptr<ehci_iso_stream> stream;
        public ListDefinitions.list_head itd_list;
        public @Unsigned int frame;
        public @Unsigned int pg;
        public @Unsigned int @Size(value=8) [] index;
    }

    @Type(noCCodeGeneration=true, cType="union ehci_shadow")
    @NotUsableInJava
    public static class ehci_shadow
    extends Union {
        public Ptr<ehci_qh> qh;
        public Ptr<ehci_itd> itd;
        public Ptr<ehci_sitd> sitd;
        public Ptr<ehci_fstn> fstn;
        public Ptr<@Unsigned @OriginalName(value="__le32") Integer> hw_next;
        public Ptr<?> ptr;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_qh")
    @NotUsableInJava
    public static class ehci_qh
    extends Struct {
        public Ptr<ehci_qh_hw> hw;
        public @Unsigned @OriginalName(value="dma_addr_t") long qh_dma;
        public ehci_shadow qh_next;
        public ListDefinitions.list_head qtd_list;
        public ListDefinitions.list_head intr_node;
        public Ptr<ehci_qtd> dummy;
        public ListDefinitions.list_head unlink_node;
        public ehci_per_sched ps;
        public @Unsigned int unlink_cycle;
        public char qh_state;
        public char xacterrs;
        public char unlink_reason;
        public char gap_uf;
        public @Unsigned int is_out;
        public @Unsigned int clearing_tt;
        public @Unsigned int dequeue_during_giveback;
        public @Unsigned int should_be_inactive;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_dbg_port")
    @NotUsableInJava
    public static class ehci_dbg_port
    extends Struct {
        public @Unsigned int control;
        public @Unsigned int pids;
        public @Unsigned int data03;
        public @Unsigned int data47;
        public @Unsigned int address;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_regs")
    @NotUsableInJava
    public static class ehci_regs
    extends Struct {
        public @Unsigned int command;
        public @Unsigned int status;
        public @Unsigned int intr_enable;
        public @Unsigned int frame_index;
        public @Unsigned int segment;
        public @Unsigned int frame_list;
        public @Unsigned int async_next;
        public @Unsigned int @Size(value=2) [] reserved1;
        public @Unsigned int txfill_tuning;
        public @Unsigned int @Size(value=6) [] reserved2;
        public @Unsigned int configured_flag;
        @InlineUnion(value=21705)
        public @InlineUnion(value=21705) @Unsigned int @Size(value=15) [] port_status;
        @InlineUnion(value=21705)
        public  @InlineUnion(value=21705) AnonDefinitions.anon_member_of_anon_member_of_ehci_regs anon11$1;
        @InlineUnion(value=21708)
        public  @InlineUnion(value=21708) AnonDefinitions.anon_member_of_anon_member_of_ehci_regs anon12$0;
        @InlineUnion(value=21708)
        public @InlineUnion(value=21708) @Unsigned int @Size(value=4) [] brcm_insnreg;
        public @Unsigned int @Size(value=2) [] reserved5;
        public @Unsigned int usbmode_ex;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_caps")
    @NotUsableInJava
    public static class ehci_caps
    extends Struct {
        public @Unsigned int hc_capbase;
        public @Unsigned int hcs_params;
        public @Unsigned int hcc_params;
        public char @Size(value=8) [] portroute;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_hcd")
    @NotUsableInJava
    public static class ehci_hcd
    extends Struct {
        public ehci_hrtimer_event next_hrtimer_event;
        public @Unsigned int enabled_hrtimer_events;
        public @OriginalName(value="ktime_t") long @Size(value=12) [] hr_timeouts;
        public runtime.hrtimer hrtimer;
        public int PSS_poll_count;
        public int ASS_poll_count;
        public int died_poll_count;
        public Ptr<ehci_caps> caps;
        public Ptr<ehci_regs> regs;
        public Ptr<ehci_dbg_port> debug;
        public @Unsigned int hcs_params;
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ehci_rh_state rh_state;
        public boolean scanning;
        public boolean need_rescan;
        public boolean intr_unlinking;
        public boolean iaa_in_progress;
        public boolean async_unlinking;
        public boolean shutdown;
        public Ptr<ehci_qh> qh_scan_next;
        public Ptr<ehci_qh> async;
        public Ptr<ehci_qh> dummy;
        public ListDefinitions.list_head async_unlink;
        public ListDefinitions.list_head async_idle;
        public @Unsigned int async_unlink_cycle;
        public @Unsigned int async_count;
        public @Unsigned @OriginalName(value="__le32") int old_current;
        public @Unsigned @OriginalName(value="__le32") int old_token;
        public @Unsigned int periodic_size;
        public Ptr<@Unsigned @OriginalName(value="__le32") Integer> periodic;
        public @Unsigned @OriginalName(value="dma_addr_t") long periodic_dma;
        public ListDefinitions.list_head intr_qh_list;
        public @Unsigned int i_thresh;
        public Ptr<ehci_shadow> pshadow;
        public ListDefinitions.list_head intr_unlink_wait;
        public ListDefinitions.list_head intr_unlink;
        public @Unsigned int intr_unlink_wait_cycle;
        public @Unsigned int intr_unlink_cycle;
        public @Unsigned int now_frame;
        public @Unsigned int last_iso_frame;
        public @Unsigned int intr_count;
        public @Unsigned int isoc_count;
        public @Unsigned int periodic_count;
        public @Unsigned int uframe_periodic_max;
        public ListDefinitions.list_head cached_itd_list;
        public Ptr<ehci_itd> last_itd_to_free;
        public ListDefinitions.list_head cached_sitd_list;
        public Ptr<ehci_sitd> last_sitd_to_free;
        public @Unsigned long @Size(value=15) [] reset_done;
        public @Unsigned long bus_suspended;
        public @Unsigned long companion_ports;
        public @Unsigned long owned_ports;
        public @Unsigned long port_c_suspend;
        public @Unsigned long suspended_ports;
        public @Unsigned long resuming_ports;
        public Ptr<DmaDefinitions.dma_pool> qh_pool;
        public Ptr<DmaDefinitions.dma_pool> qtd_pool;
        public Ptr<DmaDefinitions.dma_pool> itd_pool;
        public Ptr<DmaDefinitions.dma_pool> sitd_pool;
        public @Unsigned int random_frame;
        public @Unsigned long next_statechange;
        public @OriginalName(value="ktime_t") long last_periodic_enable;
        public @Unsigned int command;
        public @Unsigned int no_selective_suspend;
        public @Unsigned int has_fsl_port_bug;
        public @Unsigned int has_fsl_hs_errata;
        public @Unsigned int has_fsl_susp_errata;
        public @Unsigned int has_ci_pec_bug;
        public @Unsigned int big_endian_mmio;
        public @Unsigned int big_endian_desc;
        public @Unsigned int big_endian_capbase;
        public @Unsigned int has_amcc_usb23;
        public @Unsigned int need_io_watchdog;
        public @Unsigned int amd_pll_fix;
        public @Unsigned int use_dummy_qh;
        public @Unsigned int has_synopsys_hc_bug;
        public @Unsigned int frame_index_bug;
        public @Unsigned int need_oc_pp_cycle;
        public @Unsigned int imx28_write_fix;
        public @Unsigned int spurious_oc;
        public @Unsigned int is_aspeed;
        public @Unsigned int zx_wakeup_clear_needed;
        public Ptr<@Unsigned @OriginalName(value="__le32") Integer> ohci_hcctrl_reg;
        public @Unsigned int has_hostpc;
        public @Unsigned int has_tdi_phy_lpm;
        public @Unsigned int has_ppcd;
        public char sbrn;
        public ehci_stats stats;
        public Ptr<runtime.dentry> debug_dir;
        public char @Size(value=64) [] bandwidth;
        public char @Size(value=64) [] tt_budget;
        public ListDefinitions.list_head tt_list;
        public @Unsigned long @Size(value=0) [] priv;
    }

    @Type(noCCodeGeneration=true, cType="enum ehci_hrtimer_event")
    public static enum ehci_hrtimer_event implements Enum<ehci_hrtimer_event>,
    TypedEnum<ehci_hrtimer_event, Integer>
    {
        EHCI_HRTIMER_POLL_ASS,
        EHCI_HRTIMER_POLL_PSS,
        EHCI_HRTIMER_POLL_DEAD,
        EHCI_HRTIMER_UNLINK_INTR,
        EHCI_HRTIMER_FREE_ITDS,
        EHCI_HRTIMER_ACTIVE_UNLINK,
        EHCI_HRTIMER_START_UNLINK_INTR,
        EHCI_HRTIMER_ASYNC_UNLINKS,
        EHCI_HRTIMER_IAA_WATCHDOG,
        EHCI_HRTIMER_DISABLE_PERIODIC,
        EHCI_HRTIMER_DISABLE_ASYNC,
        EHCI_HRTIMER_IO_WATCHDOG,
        EHCI_HRTIMER_NUM_EVENTS;

    }

    @Type(noCCodeGeneration=true, cType="enum ehci_rh_state")
    public static enum ehci_rh_state implements Enum<ehci_rh_state>,
    TypedEnum<ehci_rh_state, Integer>
    {
        EHCI_RH_HALTED,
        EHCI_RH_SUSPENDED,
        EHCI_RH_RUNNING,
        EHCI_RH_STOPPING;

    }

    @Type(noCCodeGeneration=true, cType="struct ehci_per_sched")
    @NotUsableInJava
    public static class ehci_per_sched
    extends Struct {
        public Ptr<UsbDefinitions.usb_device> udev;
        public Ptr<UsbDefinitions.usb_host_endpoint> ep;
        public ListDefinitions.list_head ps_list;
        public @Unsigned short tt_usecs;
        public @Unsigned short cs_mask;
        public @Unsigned short period;
        public @Unsigned short phase;
        public char bw_phase;
        public char phase_uf;
        public char usecs;
        public char c_usecs;
        public char bw_uperiod;
        public char bw_period;
    }

    @Type(noCCodeGeneration=true, cType="struct ehci_stats")
    @NotUsableInJava
    public static class ehci_stats
    extends Struct {
        public @Unsigned long normal;
        public @Unsigned long error;
        public @Unsigned long iaa;
        public @Unsigned long lost_iaa;
        public @Unsigned long complete;
        public @Unsigned long unlink;
    }
}

