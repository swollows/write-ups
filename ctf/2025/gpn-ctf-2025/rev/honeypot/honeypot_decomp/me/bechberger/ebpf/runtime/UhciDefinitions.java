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
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class UhciDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_check_and_reset_hc(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned long base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_reset_hc(Ptr<PciDefinitions.pci_dev> pdev, @Unsigned long base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_activate_qh(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_check_bandwidth(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_check_ports(Ptr<uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long uhci_debug_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long off, int whence) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_debug_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long uhci_debug_read(Ptr<runtime.file> file2, String buf, @Unsigned long nbytes, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_debug_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_finish_suspend(Ptr<uhci_hcd> uhci, int port2, @Unsigned long port_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_free_qh(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_free_td(Ptr<uhci_hcd> uhci, Ptr<uhci_td> td2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_free_urb_priv(Ptr<uhci_hcd> uhci, Ptr<misc.urb_priv> urbp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_fsbr_timeout(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_giveback_urb(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_hc_died(Ptr<uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_hcd_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_hcd_endpoint_disable(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> hep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_hcd_get_frame_number(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_hcd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_hub_control(Ptr<UsbDefinitions.usb_hcd> hcd, @Unsigned short typeReq, @Unsigned short wValue, @Unsigned short wIndex, String buf, @Unsigned short wLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_hub_status_data(Ptr<UsbDefinitions.usb_hcd> hcd, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn uhci_irq(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_make_qh_idle(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_map_status(int status, int dir_out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_pci_check_and_reset_hc(Ptr<uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_pci_configure_hc(Ptr<uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_pci_global_suspend_mode_is_broken(Ptr<uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_pci_init(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="uhci_pci_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int uhci_pci_probe(Ptr<PciDefinitions.pci_dev> dev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_pci_reset_hc(Ptr<uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_pci_resume(Ptr<UsbDefinitions.usb_hcd> hcd, @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_pci_resume_detect_interrupts_are_broken(Ptr<uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_pci_suspend(Ptr<UsbDefinitions.usb_hcd> hcd, boolean do_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_reserve_bandwidth(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_result_common(Ptr<uhci_hcd> uhci, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_result_isochronous(Ptr<uhci_hcd> uhci, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_rh_resume(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_rh_suspend(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_scan_qh(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_scan_schedule(Ptr<uhci_hcd> uhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_show_qh(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh, String buf, int len, int space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_show_sc(int port2, @Unsigned short status, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_show_status(Ptr<uhci_hcd> uhci, String buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_shutdown(Ptr<PciDefinitions.pci_dev> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_sprint_schedule(Ptr<uhci_hcd> uhci, String buf, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_start(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_stop(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_submit_common(Ptr<uhci_hcd> uhci, Ptr<runtime.urb> urb2, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_submit_control(Ptr<uhci_hcd> uhci, Ptr<runtime.urb> urb2, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_submit_isochronous(Ptr<uhci_hcd> uhci, Ptr<runtime.urb> urb2, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_unlink_qh(Ptr<uhci_hcd> uhci, Ptr<uhci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_urb_dequeue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int uhci_urb_enqueue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void uhci_urbp_wants_fsbr(Ptr<uhci_hcd> uhci, Ptr<misc.urb_priv> urbp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct uhci_debug")
    @NotUsableInJava
    public static class uhci_debug
    extends Struct {
        public int size;
        public String data;
    }

    @Type(noCCodeGeneration=true, cType="struct uhci_hcd")
    @NotUsableInJava
    public static class uhci_hcd
    extends Struct {
        public @Unsigned long io_addr;
        public Ptr<?> regs;
        public Ptr<DmaDefinitions.dma_pool> qh_pool;
        public Ptr<DmaDefinitions.dma_pool> td_pool;
        public Ptr<uhci_td> term_td;
        public Ptr<uhci_qh> @Size(value=11) [] skelqh;
        public Ptr<uhci_qh> next_qh;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned @OriginalName(value="dma_addr_t") long frame_dma_handle;
        public Ptr<@Unsigned @OriginalName(value="__le32") Integer> frame;
        public Ptr<Ptr<?>> frame_cpu;
        public uhci_rh_state rh_state;
        public @Unsigned long auto_stop_time;
        public @Unsigned int frame_number;
        public @Unsigned int is_stopped;
        public @Unsigned int last_iso_frame;
        public @Unsigned int cur_iso_frame;
        public @Unsigned int scan_in_progress;
        public @Unsigned int need_rescan;
        public @Unsigned int dead;
        public @Unsigned int RD_enable;
        public @Unsigned int is_initialized;
        public @Unsigned int fsbr_is_on;
        public @Unsigned int fsbr_is_wanted;
        public @Unsigned int fsbr_expiring;
        public TimerDefinitions.timer_list fsbr_timer;
        public @Unsigned int oc_low;
        public @Unsigned int wait_for_hp;
        public @Unsigned int big_endian_mmio;
        public @Unsigned int big_endian_desc;
        public @Unsigned int is_aspeed;
        public @Unsigned long port_c_suspend;
        public @Unsigned long resuming_ports;
        public @Unsigned long ports_timeout;
        public ListDefinitions.list_head idle_qh_list;
        public int rh_numports;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitqh;
        public int num_waiting;
        public int total_load;
        public short @Size(value=32) [] load;
        public Ptr<runtime.clk> clk;
        public Ptr<?> reset_hc;
        public Ptr<?> check_and_reset_hc;
        public Ptr<?> configure_hc;
        public Ptr<?> resume_detect_interrupts_are_broken;
        public Ptr<?> global_suspend_mode_is_broken;
    }

    @Type(noCCodeGeneration=true, cType="enum uhci_rh_state")
    public static enum uhci_rh_state implements Enum<uhci_rh_state>,
    TypedEnum<uhci_rh_state, Integer>
    {
        UHCI_RH_RESET,
        UHCI_RH_SUSPENDED,
        UHCI_RH_AUTO_STOPPED,
        UHCI_RH_RESUMING,
        UHCI_RH_SUSPENDING,
        UHCI_RH_RUNNING,
        UHCI_RH_RUNNING_NODEVS;

    }

    @Type(noCCodeGeneration=true, cType="struct uhci_td")
    @NotUsableInJava
    public static class uhci_td
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int link;
        public @Unsigned @OriginalName(value="__le32") int status;
        public @Unsigned @OriginalName(value="__le32") int token;
        public @Unsigned @OriginalName(value="__le32") int buffer;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma_handle;
        public ListDefinitions.list_head list;
        public int frame;
        public ListDefinitions.list_head fl_list;
    }

    @Type(noCCodeGeneration=true, cType="struct uhci_qh")
    @NotUsableInJava
    public static class uhci_qh
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int link;
        public @Unsigned @OriginalName(value="__le32") int element;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma_handle;
        public ListDefinitions.list_head node;
        public Ptr<UsbDefinitions.usb_host_endpoint> hep;
        public Ptr<UsbDefinitions.usb_device> udev;
        public ListDefinitions.list_head queue;
        public Ptr<uhci_td> dummy_td;
        public Ptr<uhci_td> post_td;
        public Ptr<UsbDefinitions.usb_iso_packet_descriptor> iso_packet_desc;
        public @Unsigned long advance_jiffies;
        public @Unsigned int unlink_frame;
        public @Unsigned int period;
        public short phase;
        public short load;
        public @Unsigned int iso_frame;
        public int state;
        public int type;
        public int skel;
        public @Unsigned int initial_toggle;
        public @Unsigned int needs_fixup;
        public @Unsigned int is_stopped;
        public @Unsigned int wait_expired;
        public @Unsigned int bandwidth_reserved;
    }
}

