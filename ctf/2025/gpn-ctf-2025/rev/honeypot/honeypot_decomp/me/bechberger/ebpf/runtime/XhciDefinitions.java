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
import me.bechberger.ebpf.runtime.DbcDefinitions;
import me.bechberger.ebpf.runtime.DebugfsDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.ResetDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class XhciDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_add_in_port(Ptr<xhci_hcd> xhci, @Unsigned int num_ports, Ptr<@Unsigned @OriginalName(value="__le32") Integer> addr2, int max_caps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_add_interrupter(Ptr<xhci_hcd> xhci, Ptr<xhci_interrupter> ir, @Unsigned int intr_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_command> xhci_alloc_command(Ptr<xhci_hcd> xhci, boolean allocate_completion, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_command> xhci_alloc_command_with_ctx(Ptr<xhci_hcd> xhci, boolean allocate_completion, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_container_ctx> xhci_alloc_container_ctx(Ptr<xhci_hcd> xhci, int type2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_interrupter> xhci_alloc_interrupter(Ptr<xhci_hcd> xhci, @Unsigned int segs, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_alloc_segments_for_ring(Ptr<xhci_hcd> xhci, Ptr<Ptr<xhci_segment>> first, Ptr<Ptr<xhci_segment>> last, @Unsigned int num_segs, @Unsigned int cycle_state, xhci_ring_type type2, @Unsigned int max_packet, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_stream_info> xhci_alloc_stream_info(Ptr<xhci_hcd> xhci, @Unsigned int num_stream_ctxs, @Unsigned int num_streams, @Unsigned int max_packet, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_alloc_tt_info(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev, Ptr<UsbDefinitions.usb_device> hdev, Ptr<UsbDefinitions.usb_tt> tt, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_alloc_virt_device(Ptr<xhci_hcd> xhci, int slot_id, Ptr<UsbDefinitions.usb_device> udev, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_clear_endpoint_bw_info(Ptr<xhci_bw_info> bw_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_context_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_copy_ep0_dequeue_into_input_ctx(Ptr<xhci_hcd> xhci, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_create_rhub_port_array(Ptr<xhci_hcd> xhci, Ptr<xhci_hub> rhub, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_interrupter> xhci_create_secondary_interrupter(Ptr<UsbDefinitions.usb_hcd> hcd, @Unsigned int segs, @Unsigned int imod_interval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_dbg_trace($arg1, (void (*)(struct va_format*))$arg2, (const u8*)$arg3, $arg4_)")
    public static void xhci_dbg_trace(Ptr<xhci_hcd> xhci, Ptr<?> trace, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_create_endpoint(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> dev, int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_create_root() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_create_slot(Ptr<xhci_hcd> xhci, int slot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_create_stream_files(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> dev, int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_exit(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_debugfs_extcap_regset($arg1, $arg2, (const struct debugfs_reg32*)$arg3, $arg4, (const u8*)$arg5)")
    public static void xhci_debugfs_extcap_regset(Ptr<xhci_hcd> xhci, int cap_id, Ptr<DebugfsDefinitions.debugfs_reg32> regs, @Unsigned long n, String cap_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_init(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_debugfs_regset($arg1, $arg2, (const struct debugfs_reg32*)$arg3, $arg4, $arg5, (const u8*)$arg6, $arg7_)")
    public static void xhci_debugfs_regset(Ptr<xhci_hcd> xhci, @Unsigned int base, Ptr<DebugfsDefinitions.debugfs_reg32> regs, @Unsigned long nregs, Ptr<runtime.dentry> parent, String fmt, Object ... param6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_remove_endpoint(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> dev, int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_remove_root() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_debugfs_remove_slot(Ptr<xhci_hcd> xhci, int slot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)xhci_decode_portsc($arg1, $arg2))")
    public static String xhci_decode_portsc(String str, @Unsigned int portsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_device_name_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_ring> xhci_dma_to_transfer_ring(Ptr<xhci_virt_ep> ep, @Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_endpoint_context_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_endpoint_copy(Ptr<xhci_hcd> xhci, Ptr<xhci_container_ctx> in_ctx, Ptr<xhci_container_ctx> out_ctx, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_endpoint_init(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev, Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_host_endpoint> ep, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_endpoint_zero(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_find_next_ext_cap(Ptr<?> base, @Unsigned int start, int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_command(Ptr<xhci_hcd> xhci, Ptr<xhci_command> command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_container_ctx(Ptr<xhci_hcd> xhci, Ptr<xhci_container_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_endpoint_ring(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_interrupter(Ptr<xhci_hcd> xhci, Ptr<xhci_interrupter> ir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_segments_for_ring(Ptr<xhci_hcd> xhci, Ptr<xhci_segment> first) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_stream_ctx(Ptr<xhci_hcd> xhci, @Unsigned int num_stream_ctxs, Ptr<xhci_stream_ctx> stream_ctx, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_stream_info(Ptr<xhci_hcd> xhci, Ptr<xhci_stream_info> stream_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_virt_device(Ptr<xhci_hcd> xhci, int slot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_virt_devices_depth_first(Ptr<xhci_hcd> xhci, int slot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_ep_ctx> xhci_get_ep_ctx(Ptr<xhci_hcd> xhci, Ptr<xhci_container_ctx> ctx, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_input_control_ctx> xhci_get_input_control_ctx(Ptr<xhci_container_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_slot_ctx> xhci_get_slot_ctx(Ptr<xhci_hcd> xhci, Ptr<xhci_container_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String xhci_get_slot_state(Ptr<xhci_hcd> xhci, Ptr<xhci_container_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_initialize_ring_info(Ptr<xhci_ring> ring, @Unsigned int cycle_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_mem_cleanup(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_mem_init(Ptr<xhci_hcd> xhci, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xhci_microframes_to_exponent(Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_host_endpoint> ep, @Unsigned int desc_interval, @Unsigned int min_exponent, @Unsigned int max_exponent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xhci_parse_exponent_interval(Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_port_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_port_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long xhci_port_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_portsc_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_remove_secondary_interrupter(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<xhci_interrupter> ir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_ring> xhci_ring_alloc(Ptr<xhci_hcd> xhci, @Unsigned int num_segs, @Unsigned int cycle_state, xhci_ring_type type2, @Unsigned int max_packet, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_ring_cycle_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_ring_dequeue_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_ring_dump_segment(Ptr<SeqDefinitions.seq_file> s2, Ptr<xhci_segment> seg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_ring_enqueue_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_ring_expansion(Ptr<xhci_hcd> xhci, Ptr<xhci_ring> ring, @Unsigned int num_new_segs, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_ring_free(Ptr<xhci_hcd> xhci, Ptr<xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_ring_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_ring_trb_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_segment> xhci_segment_alloc(Ptr<xhci_hcd> xhci, @Unsigned int cycle_state, @Unsigned int max_packet, @Unsigned int num, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_setup_addressable_virt_dev(Ptr<xhci_hcd> xhci, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_setup_no_streams_ep_input_ctx(Ptr<xhci_ep_ctx> ep_ctx, Ptr<xhci_virt_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_setup_port_arrays(Ptr<xhci_hcd> xhci, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_setup_streams_ep_input_ctx(Ptr<xhci_hcd> xhci, Ptr<xhci_ep_ctx> ep_ctx, Ptr<xhci_stream_info> stream_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_slot_context_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_slot_copy(Ptr<xhci_hcd> xhci, Ptr<xhci_container_ctx> in_ctx, Ptr<xhci_container_ctx> out_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_stream_context_array_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_stream_context_array_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_stream_id_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_stream_id_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_stream_id_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long xhci_stream_id_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_update_bw_info(Ptr<xhci_hcd> xhci, Ptr<xhci_container_ctx> in_ctx, Ptr<xhci_input_control_ctx> ctrl_ctx, Ptr<xhci_virt_device> virt_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_update_stream_segment_mapping(Ptr<runtime.xarray> trb_address_map, Ptr<xhci_ring> ring, Ptr<xhci_segment> first_seg, Ptr<xhci_segment> last_seg, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_urb_free_priv(Ptr<misc.urb_priv> urb_priv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_add_endpoint(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_add_ep_to_interval_table(Ptr<xhci_hcd> xhci, Ptr<xhci_bw_info> ep_bw, Ptr<xhci_interval_bw_table> bw_table, Ptr<UsbDefinitions.usb_device> udev, Ptr<xhci_virt_ep> virt_ep, Ptr<xhci_tt_bw_info> tt_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_address_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, @Unsigned int timeout_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_alloc_dev(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_alloc_streams(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, Ptr<Ptr<UsbDefinitions.usb_host_endpoint>> eps, @Unsigned int num_eps, @Unsigned int num_streams, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short xhci_calculate_lpm_timeout(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, misc.usb3_link_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_calculate_streams_and_bitmask(Ptr<xhci_hcd> xhci, Ptr<UsbDefinitions.usb_device> udev, Ptr<Ptr<UsbDefinitions.usb_host_endpoint>> eps, @Unsigned int num_eps, Ptr<@Unsigned Integer> num_streams, Ptr<@Unsigned Integer> changed_ep_bitmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short xhci_calculate_u1_timeout(Ptr<xhci_hcd> xhci, Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_endpoint_descriptor> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short xhci_calculate_u2_timeout(Ptr<xhci_hcd> xhci, Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_endpoint_descriptor> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_change_max_exit_latency(Ptr<xhci_hcd> xhci, Ptr<UsbDefinitions.usb_device> udev, @Unsigned short max_exit_latency) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_check_args($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6)")
    public static int xhci_check_args(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_host_endpoint> ep, int check_ep, boolean check_virt_dev, String func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_check_bandwidth(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_check_bw_drop_ep_streams(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> vdev, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_check_bw_table(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev, int old_active_eps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_check_ep0_maxpacket(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_clear_tt_buffer_complete(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_configure_endpoint(Ptr<xhci_hcd> xhci, Ptr<UsbDefinitions.usb_device> udev, Ptr<xhci_command> command, boolean ctx_change, boolean must_succeed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)xhci_decode_ctrl_ctx($arg1, $arg2, $arg3))")
    public static String xhci_decode_ctrl_ctx(String str, @Unsigned long drop, @Unsigned long add) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_disable_hub_port_wake(Ptr<xhci_hcd> xhci, Ptr<xhci_hub> rhub, boolean do_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_disable_slot(Ptr<xhci_hcd> xhci, @Unsigned int slot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_disable_usb3_lpm_timeout(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, misc.usb3_link_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_discover_or_reset_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_drop_endpoint(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, Ptr<UsbDefinitions.usb_host_endpoint> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_drop_ep_from_interval_table(Ptr<xhci_hcd> xhci, Ptr<xhci_bw_info> ep_bw, Ptr<xhci_interval_bw_table> bw_table, Ptr<UsbDefinitions.usb_device> udev, Ptr<xhci_virt_ep> virt_ep, Ptr<xhci_tt_bw_info> tt_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_enable_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_enable_usb3_lpm_timeout(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, misc.usb3_link_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_endpoint_disable(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> host_ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_endpoint_reset(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_host_endpoint> host_ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_find_raw_port_number(Ptr<UsbDefinitions.usb_hcd> hcd, int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_dev(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_device_endpoint_resources(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev, boolean drop_control_ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_free_host_resources(Ptr<xhci_hcd> xhci, Ptr<xhci_input_control_ctx> ctrl_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_free_streams(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, Ptr<Ptr<UsbDefinitions.usb_host_endpoint>> eps, @Unsigned int num_eps, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_gen_setup(Ptr<UsbDefinitions.usb_hcd> hcd, @OriginalName(value="xhci_get_quirks_t") Ptr<?> get_quirks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xhci_get_endpoint_index(Ptr<UsbDefinitions.usb_endpoint_descriptor> desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_get_frame(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xhci_get_ss_bw_consumed(Ptr<xhci_bw_info> ep_bw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short xhci_get_timeout_no_hub_lpm(Ptr<UsbDefinitions.usb_device> udev, misc.usb3_link_state state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_halt(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_handshake(Ptr<?> ptr, @Unsigned int mask, @Unsigned int done, @Unsigned long timeout_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_handshake_check_state(Ptr<xhci_hcd> xhci, Ptr<?> ptr, @Unsigned int mask, @Unsigned int done, int usec, @Unsigned int exit_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_hcd_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_hcd_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_hcd_init_usb3_data(Ptr<xhci_hcd> xhci, Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_init(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_init_driver($arg1, (const struct xhci_driver_overrides*)$arg2)")
    public static void xhci_init_driver(Ptr<misc.hc_driver> drv, Ptr<xhci_driver_overrides> over) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xhci_last_valid_endpoint(@Unsigned int added_ctxs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_map_temp_buffer(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_map_urb_for_dma(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xhci_pending_portevent(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_quiesce(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_reserve_bandwidth(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev, Ptr<xhci_container_ctx> in_ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_reset(Ptr<xhci_hcd> xhci, @Unsigned long timeout_us) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_reset_bandwidth(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_resume(Ptr<xhci_hcd> xhci,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_run(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_run_finished(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_set_cmd_ring_deq(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_set_interrupter_moderation(Ptr<xhci_interrupter> ir, @Unsigned int imod_interval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_set_usb2_hardware_lpm(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_setup_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev, xhci_setup_dev setup, @Unsigned int timeout_ms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_shutdown(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_start(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_stop(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_suspend(Ptr<xhci_hcd> xhci, boolean do_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_unmap_urb_for_dma(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_update_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> udev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_update_hub_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> hdev, Ptr<UsbDefinitions.usb_tt> tt, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_update_tt_active_eps(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev, int old_active_eps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_urb_dequeue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_urb_enqueue(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_zero_64b_regs(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_zero_in_ctx(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_device> virt_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_abort_cmd_ring(Ptr<xhci_hcd> xhci, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_align_td(Ptr<xhci_hcd> xhci, Ptr<runtime.urb> urb2, @Unsigned int enqd_len, Ptr<@Unsigned Integer> trb_buff_len, Ptr<xhci_segment> seg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_cleanup_command_queue(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_clear_hub_tt_buffer(Ptr<xhci_hcd> xhci, Ptr<xhci_td> td2, Ptr<xhci_virt_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_dbc_alloc_requests($arg1, $arg2, $arg3, (void (*)(struct xhci_dbc*, struct dbc_request*))$arg4)")
    public static int xhci_dbc_alloc_requests(Ptr<xhci_dbc> dbc, @Unsigned int direction, Ptr<ListDefinitions.list_head> head, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_dbc_tty_probe(Ptr<runtime.device> dev, Ptr<?> base, Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_dbc_tty_register_device(Ptr<xhci_dbc> dbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_tty_remove(Ptr<xhci_dbc> dbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_tty_unregister_device(Ptr<xhci_dbc> dbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)xhci_decode_usbsts($arg1, $arg2))")
    public static String xhci_decode_usbsts(String str, @Unsigned int usbsts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_get_isoc_frame_id(Ptr<xhci_hcd> xhci, Ptr<runtime.urb> urb2, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_virt_ep> xhci_get_virt_ep(Ptr<xhci_hcd> xhci, @Unsigned int slot_id, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_giveback_invalidated_tds(Ptr<xhci_virt_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_handle_command_timeout(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_handle_event_trb(Ptr<xhci_hcd> xhci, Ptr<xhci_interrupter> ir, Ptr<xhci_trb> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_handle_events(Ptr<xhci_hcd> xhci, Ptr<xhci_interrupter> ir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_handle_halted_endpoint(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_ep> ep, Ptr<xhci_td> td2, xhci_ep_reset_type reset_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_handle_stopped_cmd_ring(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cur_cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_hc_died(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_invalidate_cancelled_tds(Ptr<xhci_virt_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xhci_irq(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_is_vendor_info_code(Ptr<xhci_hcd> xhci, @Unsigned int trb_comp_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_kill_ring_urbs(Ptr<xhci_hcd> xhci, Ptr<xhci_ring> ring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_move_dequeue_past_td(Ptr<xhci_hcd> xhci, @Unsigned int slot_id, @Unsigned int ep_index, @Unsigned int stream_id, Ptr<xhci_td> td2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xhci_msi_irq(int irq, Ptr<?> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_process_cancelled_tds(Ptr<xhci_virt_ep> ep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_address_device(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cmd, @Unsigned @OriginalName(value="dma_addr_t") long in_ctx_ptr, @Unsigned int slot_id, xhci_setup_dev setup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_bulk_tx(Ptr<xhci_hcd> xhci, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<runtime.urb> urb2, int slot_id, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_configure_endpoint(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cmd, @Unsigned @OriginalName(value="dma_addr_t") long in_ctx_ptr, @Unsigned int slot_id, boolean command_must_succeed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_ctrl_tx(Ptr<xhci_hcd> xhci, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<runtime.urb> urb2, int slot_id, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_evaluate_context(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cmd, @Unsigned @OriginalName(value="dma_addr_t") long in_ctx_ptr, @Unsigned int slot_id, boolean command_must_succeed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_intr_tx(Ptr<xhci_hcd> xhci, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<runtime.urb> urb2, int slot_id, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_isoc_tx(Ptr<xhci_hcd> xhci, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<runtime.urb> urb2, int slot_id, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_isoc_tx_prepare(Ptr<xhci_hcd> xhci, @Unsigned @OriginalName(value="gfp_t") int mem_flags, Ptr<runtime.urb> urb2, int slot_id, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_reset_device(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cmd, @Unsigned int slot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_reset_ep(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cmd, int slot_id, @Unsigned int ep_index, xhci_ep_reset_type reset_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_slot_control(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cmd, @Unsigned int trb_type, @Unsigned int slot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_stop_endpoint(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cmd, int slot_id, @Unsigned int ep_index, int suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_queue_vendor_command(Ptr<xhci_hcd> xhci, Ptr<xhci_command> cmd, @Unsigned int field1, @Unsigned int field2, @Unsigned int field3, @Unsigned int field4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_ring_cmd_db(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_ring_doorbell_for_active_rings(Ptr<xhci_hcd> xhci, @Unsigned int slot_id, @Unsigned int ep_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_ring_ep_doorbell(Ptr<xhci_hcd> xhci, @Unsigned int slot_id, @Unsigned int ep_index, @Unsigned int stream_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_td_cleanup(Ptr<xhci_hcd> xhci, Ptr<xhci_td> td2, Ptr<xhci_ring> ep_ring, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xhci_td_remainder(Ptr<xhci_hcd> xhci, int transferred, int trb_buff_len, @Unsigned int td_total_len, Ptr<runtime.urb> urb2, boolean more_trbs_coming) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="dma_addr_t") long xhci_trb_virt_to_dma(Ptr<xhci_segment> seg, Ptr<xhci_trb> trb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_ring> xhci_triad_to_transfer_ring(Ptr<xhci_hcd> xhci, @Unsigned int slot_id, @Unsigned int ep_index, @Unsigned int stream_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_unmap_td_bounce_buffer(Ptr<xhci_hcd> xhci, Ptr<xhci_ring> ring, Ptr<xhci_td> td2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_update_erst_dequeue(Ptr<xhci_hcd> xhci, Ptr<xhci_interrupter> ir, boolean clear_ehb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_ring> xhci_virt_ep_to_ring(Ptr<xhci_hcd> xhci, Ptr<xhci_virt_ep> ep, @Unsigned int stream_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_alloc_dbc($arg1, $arg2, (const struct dbc_driver*)$arg3)")
    public static Ptr<xhci_dbc> xhci_alloc_dbc(Ptr<runtime.device> dev, Ptr<?> base, Ptr<DbcDefinitions.dbc_driver> driver) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_bus_resume(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_bus_suspend(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_create_dbc_dev(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_create_intel_xhci_sw_pdev(Ptr<xhci_hcd> xhci, @Unsigned int cap_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_create_usb3x_bos_desc(Ptr<xhci_hcd> xhci, String buf, @Unsigned short wLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static evtreturn xhci_dbc_do_handle_events(Ptr<xhci_dbc> dbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_flush_endpoint_requests(Ptr<DbcDefinitions.dbc_ep> dep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_giveback(Ptr<DbcDefinitions.dbc_request> req2, int status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_handle_events(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_dbc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_mem_cleanup(Ptr<xhci_dbc> dbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_dbc_mem_init(Ptr<xhci_dbc> dbc, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_dbc_queue_bulk_tx(Ptr<DbcDefinitions.dbc_ep> dep, Ptr<DbcDefinitions.dbc_request> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_remove(Ptr<xhci_dbc> dbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_dbc_resume(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_ring> xhci_dbc_ring_alloc(Ptr<runtime.device> dev, xhci_ring_type type2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_dbc_start(Ptr<xhci_dbc> dbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_dbc_stop(Ptr<xhci_dbc> dbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_dbc_suspend(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_enter_test_mode(Ptr<xhci_hcd> xhci, @Unsigned short test_mode, @Unsigned short wIndex, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_ext_cap_init(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xhci_get_port_status(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<xhci_bus_state> bus_state, @Unsigned short wIndex, @Unsigned int raw_port_status, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long xhci_get_resuming_ports(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<xhci_hub> xhci_get_rhub(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_get_usb2_port_status(Ptr<xhci_port> port2, Ptr<@Unsigned Integer> status, @Unsigned int portsc, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_get_usb3_port_status(Ptr<xhci_port> port2, Ptr<@Unsigned Integer> status, @Unsigned int portsc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_handle_usb2_port_link_resume(Ptr<xhci_port> port2, @Unsigned int portsc, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_hub_control(Ptr<UsbDefinitions.usb_hcd> hcd, @Unsigned short typeReq, @Unsigned short wValue, @Unsigned short wIndex, String buf, @Unsigned short wLength) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_hub_status_data(Ptr<UsbDefinitions.usb_hcd> hcd, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_intel_unregister_pdev(Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_pci_common_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int xhci_pci_common_probe(Ptr<PciDefinitions.pci_dev> dev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_pci_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_pci_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_pci_poweroff_late(Ptr<UsbDefinitions.usb_hcd> hcd, boolean do_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xhci_pci_probe($arg1, (const struct pci_device_id*)$arg2)")
    public static int xhci_pci_probe(Ptr<PciDefinitions.pci_dev> dev, Ptr<PciDefinitions.pci_device_id> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_pci_quirks(Ptr<runtime.device> dev, Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_pci_remove(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_pci_resume(Ptr<UsbDefinitions.usb_hcd> hcd,  @OriginalName(value="pm_message_t") PmDefinitions.pm_message msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_pci_run(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_pci_setup(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_pci_shutdown(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_pci_stop(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_pci_suspend(Ptr<UsbDefinitions.usb_hcd> hcd, boolean do_wakeup) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_pci_update_hub_device(Ptr<UsbDefinitions.usb_hcd> hcd, Ptr<UsbDefinitions.usb_device> hdev, Ptr<UsbDefinitions.usb_tt> tt, @Unsigned @OriginalName(value="gfp_t") int mem_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static UsbDefinitions.usb_link_tunnel_mode xhci_port_is_tunneled(Ptr<xhci_hcd> xhci, Ptr<xhci_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int xhci_port_state_to_neutral(@Unsigned int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_remove_dbc_dev(Ptr<xhci_hcd> xhci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_ring_device(Ptr<xhci_hcd> xhci, int slot_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_set_link_state(Ptr<xhci_hcd> xhci, Ptr<xhci_port> port2, @Unsigned int link_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_set_port_power(Ptr<xhci_hcd> xhci, Ptr<xhci_port> port2, boolean on, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_ssic_port_unused_quirk(Ptr<UsbDefinitions.usb_hcd> hcd, boolean suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_stop_device(Ptr<xhci_hcd> xhci, int slot_id, int suspend) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xhci_test_and_clear_bit(Ptr<xhci_hcd> xhci, Ptr<xhci_port> port2, @Unsigned int port_bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xhci_try_enable_msi(Ptr<UsbDefinitions.usb_hcd> hcd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum evtreturn")
    public static enum evtreturn implements Enum<evtreturn>,
    TypedEnum<evtreturn, Integer>
    {
        EVT_ERR,
        EVT_DONE,
        EVT_GSER,
        EVT_DISC;

    }

    @Type(noCCodeGeneration=true, cType="enum xhci_ep_reset_type")
    public static enum xhci_ep_reset_type implements Enum<xhci_ep_reset_type>,
    TypedEnum<xhci_ep_reset_type, Integer>
    {
        EP_HARD_RESET,
        EP_SOFT_RESET;

    }

    @Type(noCCodeGeneration=true, cType="enum xhci_setup_dev")
    public static enum xhci_setup_dev implements Enum<xhci_setup_dev>,
    TypedEnum<xhci_setup_dev, Integer>
    {
        SETUP_CONTEXT_ONLY,
        SETUP_CONTEXT_ADDRESS;

    }

    @Type(noCCodeGeneration=true, cType="enum xhci_overhead_type")
    public static enum xhci_overhead_type implements Enum<xhci_overhead_type>,
    TypedEnum<xhci_overhead_type, Integer>
    {
        LS_OVERHEAD_TYPE,
        FS_OVERHEAD_TYPE,
        HS_OVERHEAD_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct xhci_slot_priv")
    @NotUsableInJava
    public static class xhci_slot_priv
    extends Struct {
        public char @Size(value=32) [] name;
        public Ptr<runtime.dentry> root;
        public Ptr<xhci_ep_priv> @Size(value=31) [] eps;
        public Ptr<xhci_virt_device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_ep_priv")
    @NotUsableInJava
    public static class xhci_ep_priv
    extends Struct {
        public char @Size(value=32) [] name;
        public Ptr<runtime.dentry> root;
        public Ptr<xhci_stream_info> stream_info;
        public Ptr<xhci_ring> show_ring;
        public @Unsigned int stream_id;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_file_map")
    @NotUsableInJava
    public static class xhci_file_map
    extends Struct {
        public String name;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_regset")
    @NotUsableInJava
    public static class xhci_regset
    extends Struct {
        public char @Size(value=32) [] name;
        public DebugfsDefinitions.debugfs_regset32 regset;
        public @Unsigned long nregs;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_td")
    @NotUsableInJava
    public static class xhci_td
    extends Struct {
        public ListDefinitions.list_head td_list;
        public ListDefinitions.list_head cancelled_td_list;
        public int status;
        public xhci_cancelled_td_status cancel_status;
        public Ptr<runtime.urb> urb;
        public Ptr<xhci_segment> start_seg;
        public Ptr<xhci_trb> first_trb;
        public Ptr<xhci_trb> last_trb;
        public Ptr<xhci_segment> last_trb_seg;
        public Ptr<xhci_segment> bounce_seg;
        public boolean urb_length_set;
        public boolean error_mid_td;
    }

    @Type(noCCodeGeneration=true, cType="enum xhci_cancelled_td_status")
    public static enum xhci_cancelled_td_status implements Enum<xhci_cancelled_td_status>,
    TypedEnum<xhci_cancelled_td_status, Integer>
    {
        TD_DIRTY,
        TD_HALTED,
        TD_CLEARING_CACHE,
        TD_CLEARING_CACHE_DEFERRED,
        TD_CLEARED;

    }

    @Type(noCCodeGeneration=true, cType="struct xhci_input_control_ctx")
    @NotUsableInJava
    public static class xhci_input_control_ctx
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int drop_flags;
        public @Unsigned @OriginalName(value="__le32") int add_flags;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=6) [] rsvd2;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_slot_ctx")
    @NotUsableInJava
    public static class xhci_slot_ctx
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int dev_info;
        public @Unsigned @OriginalName(value="__le32") int dev_info2;
        public @Unsigned @OriginalName(value="__le32") int tt_info;
        public @Unsigned @OriginalName(value="__le32") int dev_state;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=4) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_driver_overrides")
    @NotUsableInJava
    public static class xhci_driver_overrides
    extends Struct {
        public @Unsigned long extra_priv_size;
        public Ptr<?> reset;
        public Ptr<?> start;
        public Ptr<?> add_endpoint;
        public Ptr<?> drop_endpoint;
        public Ptr<?> check_bandwidth;
        public Ptr<?> reset_bandwidth;
        public Ptr<?> update_hub_device;
        public Ptr<?> hub_control;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_dbc")
    @NotUsableInJava
    public static class xhci_dbc
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<runtime.device> dev;
        public Ptr<xhci_hcd> xhci;
        public Ptr<DbcDefinitions.dbc_regs> regs;
        public Ptr<xhci_ring> ring_evt;
        public Ptr<xhci_ring> ring_in;
        public Ptr<xhci_ring> ring_out;
        public xhci_erst erst;
        public Ptr<xhci_container_ctx> ctx;
        public Ptr<DbcDefinitions.dbc_str_descs> string;
        public @Unsigned @OriginalName(value="dma_addr_t") long string_dma;
        public @Unsigned long string_size;
        public @Unsigned short idVendor;
        public @Unsigned short idProduct;
        public @Unsigned short bcdDevice;
        public char bInterfaceProtocol;
        public DbcDefinitions.dbc_state state;
        public DelayedDefinitions.delayed_work event_work;
        public @Unsigned int poll_interval;
        public @Unsigned int resume_required;
        public DbcDefinitions.dbc_ep @Size(value=2) [] eps;
        public Ptr<DbcDefinitions.dbc_driver> driver;
        public Ptr<?> priv;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_ep_ctx")
    @NotUsableInJava
    public static class xhci_ep_ctx
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int ep_info;
        public @Unsigned @OriginalName(value="__le32") int ep_info2;
        public @Unsigned @OriginalName(value="__le64") long deq;
        public @Unsigned @OriginalName(value="__le32") int tx_info;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_hub")
    @NotUsableInJava
    public static class xhci_hub
    extends Struct {
        public Ptr<Ptr<xhci_port>> ports;
        public @Unsigned int num_ports;
        public Ptr<UsbDefinitions.usb_hcd> hcd;
        public xhci_bus_state bus_state;
        public char maj_rev;
        public char min_rev;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_port_cap")
    @NotUsableInJava
    public static class xhci_port_cap
    extends Struct {
        public Ptr<@Unsigned Integer> psi;
        public char psi_count;
        public char psi_uid_count;
        public char maj_rev;
        public char min_rev;
        public @Unsigned int protocol_caps;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_interrupter")
    @NotUsableInJava
    public static class xhci_interrupter
    extends Struct {
        public Ptr<xhci_ring> event_ring;
        public xhci_erst erst;
        public Ptr<xhci_intr_reg> ir_set;
        public @Unsigned int intr_num;
        public boolean ip_autoclear;
        public @Unsigned int isoc_bei_interval;
        public @Unsigned int s3_irq_pending;
        public @Unsigned int s3_irq_control;
        public @Unsigned int s3_erst_size;
        public @Unsigned long s3_erst_base;
        public @Unsigned long s3_erst_dequeue;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_bus_state")
    @NotUsableInJava
    public static class xhci_bus_state
    extends Struct {
        public @Unsigned long bus_suspended;
        public @Unsigned long next_statechange;
        public @Unsigned int port_c_suspend;
        public @Unsigned int suspended_ports;
        public @Unsigned int port_remote_wakeup;
        public @Unsigned long resuming_ports;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_scratchpad")
    @NotUsableInJava
    public static class xhci_scratchpad
    extends Struct {
        public Ptr<@Unsigned Long> sp_array;
        public @Unsigned @OriginalName(value="dma_addr_t") long sp_dma;
        public Ptr<Ptr<?>> sp_buffers;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_erst")
    @NotUsableInJava
    public static class xhci_erst
    extends Struct {
        public Ptr<xhci_erst_entry> entries;
        public @Unsigned int num_entries;
        public @Unsigned @OriginalName(value="dma_addr_t") long erst_dma_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_erst_entry")
    @NotUsableInJava
    public static class xhci_erst_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long seg_addr;
        public @Unsigned @OriginalName(value="__le32") int seg_size;
        public @Unsigned @OriginalName(value="__le32") int rsvd;
    }

    @Type(noCCodeGeneration=true, cType="enum xhci_ring_type")
    public static enum xhci_ring_type implements Enum<xhci_ring_type>,
    TypedEnum<xhci_ring_type, Integer>
    {
        TYPE_CTRL,
        TYPE_ISOC,
        TYPE_BULK,
        TYPE_INTR,
        TYPE_STREAM,
        TYPE_COMMAND,
        TYPE_EVENT;

    }

    @Type(noCCodeGeneration=true, cType="struct xhci_generic_trb")
    @NotUsableInJava
    public static class xhci_generic_trb
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int @Size(value=4) [] field;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_event_cmd")
    @NotUsableInJava
    public static class xhci_event_cmd
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long cmd_trb;
        public @Unsigned @OriginalName(value="__le32") int status;
        public @Unsigned @OriginalName(value="__le32") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_link_trb")
    @NotUsableInJava
    public static class xhci_link_trb
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long segment_ptr;
        public @Unsigned @OriginalName(value="__le32") int intr_target;
        public @Unsigned @OriginalName(value="__le32") int control;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_transfer_event")
    @NotUsableInJava
    public static class xhci_transfer_event
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long buffer;
        public @Unsigned @OriginalName(value="__le32") int transfer_len;
        public @Unsigned @OriginalName(value="__le32") int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_device_context_array")
    @NotUsableInJava
    public static class xhci_device_context_array
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long @Size(value=256) [] dev_context_ptrs;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_root_port_bw_info")
    @NotUsableInJava
    public static class xhci_root_port_bw_info
    extends Struct {
        public ListDefinitions.list_head tts;
        public @Unsigned int num_active_tts;
        public xhci_interval_bw_table bw_table;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_tt_bw_info")
    @NotUsableInJava
    public static class xhci_tt_bw_info
    extends Struct {
        public ListDefinitions.list_head tt_list;
        public int slot_id;
        public int ttport;
        public xhci_interval_bw_table bw_table;
        public int active_eps;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_port")
    @NotUsableInJava
    public static class xhci_port
    extends Struct {
        public Ptr<@Unsigned @OriginalName(value="__le32") Integer> addr;
        public int hw_portnum;
        public int hcd_portnum;
        public Ptr<xhci_hub> rhub;
        public Ptr<xhci_port_cap> port_cap;
        public @Unsigned int lpm_incapable;
        public @Unsigned long resume_timestamp;
        public boolean rexit_active;
        public int slot_id;
        public runtime.completion rexit_done;
        public runtime.completion u3exit_done;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_interval_bw_table")
    @NotUsableInJava
    public static class xhci_interval_bw_table
    extends Struct {
        public @Unsigned int interval0_esit_payload;
        public xhci_interval_bw @Size(value=16) [] interval_bw;
        public @Unsigned int bw_used;
        public @Unsigned int ss_bw_in;
        public @Unsigned int ss_bw_out;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_interval_bw")
    @NotUsableInJava
    public static class xhci_interval_bw
    extends Struct {
        public @Unsigned int num_packets;
        public ListDefinitions.list_head endpoints;
        public @Unsigned int @Size(value=3) [] overhead;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_segment")
    @NotUsableInJava
    public static class xhci_segment
    extends Struct {
        public Ptr<xhci_trb> trbs;
        public Ptr<xhci_segment> next;
        public @Unsigned int num;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
        public @Unsigned @OriginalName(value="dma_addr_t") long bounce_dma;
        public Ptr<?> bounce_buf;
        public @Unsigned int bounce_offs;
        public @Unsigned int bounce_len;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_hcd")
    @NotUsableInJava
    public static class xhci_hcd
    extends Struct {
        public Ptr<UsbDefinitions.usb_hcd> main_hcd;
        public Ptr<UsbDefinitions.usb_hcd> shared_hcd;
        public Ptr<xhci_cap_regs> cap_regs;
        public Ptr<xhci_op_regs> op_regs;
        public Ptr<xhci_run_regs> run_regs;
        public Ptr<xhci_doorbell_array> dba;
        public @Unsigned int hcs_params1;
        public @Unsigned int hcs_params2;
        public @Unsigned int hcs_params3;
        public @Unsigned int hcc_params;
        public @Unsigned int hcc_params2;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned short hci_version;
        public @Unsigned short max_interrupters;
        public @Unsigned int imod_interval;
        public int page_size;
        public int page_shift;
        public int nvecs;
        public Ptr<runtime.clk> clk;
        public Ptr<runtime.clk> reg_clk;
        public Ptr<ResetDefinitions.reset_control> reset;
        public Ptr<xhci_device_context_array> dcbaa;
        public Ptr<Ptr<xhci_interrupter>> interrupters;
        public Ptr<xhci_ring> cmd_ring;
        public @Unsigned int cmd_ring_state;
        public ListDefinitions.list_head cmd_list;
        public @Unsigned int cmd_ring_reserved_trbs;
        public DelayedDefinitions.delayed_work cmd_timer;
        public runtime.completion cmd_ring_stop_completion;
        public Ptr<xhci_command> current_cmd;
        public Ptr<xhci_scratchpad> scratchpad;
        public runtime.mutex mutex;
        public Ptr<xhci_virt_device> @Size(value=256) [] devs;
        public Ptr<xhci_root_port_bw_info> rh_bw;
        public Ptr<DmaDefinitions.dma_pool> device_pool;
        public Ptr<DmaDefinitions.dma_pool> segment_pool;
        public Ptr<DmaDefinitions.dma_pool> small_streams_pool;
        public Ptr<DmaDefinitions.dma_pool> medium_streams_pool;
        public @Unsigned int xhc_state;
        public @Unsigned long run_graceperiod;
        public misc.s3_save s3;
        public @Unsigned long quirks;
        public @Unsigned int num_active_eps;
        public @Unsigned int limit_active_eps;
        public Ptr<xhci_port> hw_ports;
        public xhci_hub usb2_rhub;
        public xhci_hub usb3_rhub;
        public @Unsigned int hw_lpm_support;
        public @Unsigned int broken_suspend;
        public @Unsigned int allow_single_roothub;
        public Ptr<xhci_port_cap> port_caps;
        public @Unsigned int num_port_caps;
        public TimerDefinitions.timer_list comp_mode_recovery_timer;
        public @Unsigned int port_status_u0;
        public @Unsigned short test_mode;
        public Ptr<runtime.dentry> debugfs_root;
        public Ptr<runtime.dentry> debugfs_slots;
        public ListDefinitions.list_head regset_list;
        public Ptr<?> dbc;
        public @Unsigned long @Size(value=0) [] priv;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_virt_device")
    @NotUsableInJava
    public static class xhci_virt_device
    extends Struct {
        public int slot_id;
        public Ptr<UsbDefinitions.usb_device> udev;
        public Ptr<xhci_container_ctx> out_ctx;
        public Ptr<xhci_container_ctx> in_ctx;
        public xhci_virt_ep @Size(value=31) [] eps;
        public Ptr<xhci_port> rhub_port;
        public Ptr<xhci_interval_bw_table> bw_table;
        public Ptr<xhci_tt_bw_info> tt_info;
        public @Unsigned long flags;
        public @Unsigned short current_mel;
        public Ptr<?> debugfs_private;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_virt_ep")
    @NotUsableInJava
    public static class xhci_virt_ep
    extends Struct {
        public Ptr<xhci_virt_device> vdev;
        public @Unsigned int ep_index;
        public Ptr<xhci_ring> ring;
        public Ptr<xhci_stream_info> stream_info;
        public Ptr<xhci_ring> new_ring;
        public @Unsigned int err_count;
        public @Unsigned int ep_state;
        public ListDefinitions.list_head cancelled_td_list;
        public Ptr<xhci_hcd> xhci;
        public Ptr<xhci_segment> queued_deq_seg;
        public Ptr<xhci_trb> queued_deq_ptr;
        public boolean skip;
        public xhci_bw_info bw_info;
        public ListDefinitions.list_head bw_endpoint_list;
        public @Unsigned long stop_time;
        public int next_frame_id;
        public boolean use_extended_tbc;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_bw_info")
    @NotUsableInJava
    public static class xhci_bw_info
    extends Struct {
        public @Unsigned int ep_interval;
        public @Unsigned int mult;
        public @Unsigned int num_packets;
        public @Unsigned int max_packet_size;
        public @Unsigned int max_esit_payload;
        public @Unsigned int type;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_ring")
    @NotUsableInJava
    public static class xhci_ring
    extends Struct {
        public Ptr<xhci_segment> first_seg;
        public Ptr<xhci_segment> last_seg;
        public Ptr<xhci_trb> enqueue;
        public Ptr<xhci_segment> enq_seg;
        public Ptr<xhci_trb> dequeue;
        public Ptr<xhci_segment> deq_seg;
        public ListDefinitions.list_head td_list;
        public @Unsigned int cycle_state;
        public @Unsigned int stream_id;
        public @Unsigned int num_segs;
        public @Unsigned int num_trbs_free;
        public @Unsigned int bounce_buf_len;
        public xhci_ring_type type;
        public boolean last_td_was_short;
        public Ptr<runtime.xarray> trb_address_map;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_stream_info")
    @NotUsableInJava
    public static class xhci_stream_info
    extends Struct {
        public Ptr<Ptr<xhci_ring>> stream_rings;
        public @Unsigned int num_streams;
        public Ptr<xhci_stream_ctx> stream_ctx_array;
        public @Unsigned int num_stream_ctxs;
        public @Unsigned @OriginalName(value="dma_addr_t") long ctx_array_dma;
        public runtime.xarray trb_address_map;
        public Ptr<xhci_command> free_streams_command;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_stream_ctx")
    @NotUsableInJava
    public static class xhci_stream_ctx
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long stream_ring;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=2) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="union xhci_trb")
    @NotUsableInJava
    public static class xhci_trb
    extends Union {
        public xhci_link_trb link;
        public xhci_transfer_event trans_event;
        public xhci_event_cmd event_cmd;
        public xhci_generic_trb generic;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_command")
    @NotUsableInJava
    public static class xhci_command
    extends Struct {
        public Ptr<xhci_container_ctx> in_ctx;
        public @Unsigned int status;
        public int slot_id;
        public Ptr<runtime.completion> completion;
        public Ptr<xhci_trb> command_trb;
        public ListDefinitions.list_head cmd_list;
        public @Unsigned int timeout_ms;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_container_ctx")
    @NotUsableInJava
    public static class xhci_container_ctx
    extends Struct {
        public @Unsigned int type;
        public int size;
        public Ptr<Character> bytes;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_doorbell_array")
    @NotUsableInJava
    public static class xhci_doorbell_array
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int @Size(value=256) [] doorbell;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_run_regs")
    @NotUsableInJava
    public static class xhci_run_regs
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int microframe_index;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=7) [] rsvd;
        public xhci_intr_reg @Size(value=128) [] ir_set;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_intr_reg")
    @NotUsableInJava
    public static class xhci_intr_reg
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int irq_pending;
        public @Unsigned @OriginalName(value="__le32") int irq_control;
        public @Unsigned @OriginalName(value="__le32") int erst_size;
        public @Unsigned @OriginalName(value="__le32") int rsvd;
        public @Unsigned @OriginalName(value="__le64") long erst_base;
        public @Unsigned @OriginalName(value="__le64") long erst_dequeue;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_op_regs")
    @NotUsableInJava
    public static class xhci_op_regs
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int command;
        public @Unsigned @OriginalName(value="__le32") int status;
        public @Unsigned @OriginalName(value="__le32") int page_size;
        public @Unsigned @OriginalName(value="__le32") int reserved1;
        public @Unsigned @OriginalName(value="__le32") int reserved2;
        public @Unsigned @OriginalName(value="__le32") int dev_notification;
        public @Unsigned @OriginalName(value="__le64") long cmd_ring;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=4) [] reserved3;
        public @Unsigned @OriginalName(value="__le64") long dcbaa_ptr;
        public @Unsigned @OriginalName(value="__le32") int config_reg;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=241) [] reserved4;
        public @Unsigned @OriginalName(value="__le32") int port_status_base;
        public @Unsigned @OriginalName(value="__le32") int port_power_base;
        public @Unsigned @OriginalName(value="__le32") int port_link_base;
        public @Unsigned @OriginalName(value="__le32") int reserved5;
        public @Unsigned @OriginalName(value="__le32") int @Size(value=1016) [] reserved6;
    }

    @Type(noCCodeGeneration=true, cType="struct xhci_cap_regs")
    @NotUsableInJava
    public static class xhci_cap_regs
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int hc_capbase;
        public @Unsigned @OriginalName(value="__le32") int hcs_params1;
        public @Unsigned @OriginalName(value="__le32") int hcs_params2;
        public @Unsigned @OriginalName(value="__le32") int hcs_params3;
        public @Unsigned @OriginalName(value="__le32") int hcc_params;
        public @Unsigned @OriginalName(value="__le32") int db_off;
        public @Unsigned @OriginalName(value="__le32") int run_regs_off;
        public @Unsigned @OriginalName(value="__le32") int hcc_params2;
    }
}

