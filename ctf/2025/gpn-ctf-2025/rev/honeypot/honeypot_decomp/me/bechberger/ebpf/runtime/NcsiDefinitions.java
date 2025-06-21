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
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NcsiDefinitions {
    public static final @Unsigned int ncsi_dev_state_registered = 0;
    public static final @Unsigned int ncsi_dev_state_functional = 256;
    public static final @Unsigned int ncsi_dev_state_probe = 512;
    public static final @Unsigned int ncsi_dev_state_config = 768;
    public static final @Unsigned int ncsi_dev_state_suspend = 1024;

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rcv_rsp(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<PacketDefinitions.packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_ae(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_cis(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_dbf(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_dc(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_dcnt(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_dgmf(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_dp(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_dv(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_ebf(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_ec(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_ecnt(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_egmf(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_ev(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gc(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gcps(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gls(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gmcma(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gnpts(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gns(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gp(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gps(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gpuuid(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_gvi(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_oem(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_oem_bcm(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_oem_intel(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_oem_mlx(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_pldm(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_rc(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_sl(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_sma(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_snfc(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_sp(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_rsp_handler_svf(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_validate_rsp_pkt(Ptr<ncsi_request> nr, @Unsigned short payload) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ncsi_calculate_checksum(String data, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_clear_interface_nl(Ptr<SkDefinitions.sk_buff> msg, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_cmd_build_header(Ptr<ncsi_pkt_hdr> h, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_ae(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_dc(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_default(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_ebf(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_egmf(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_ev(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_oem(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_rc(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_sl(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_sma(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_snfc(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_sp(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_cmd_handler_svf(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_init_netlink() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_pkg_info_all_nl(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_pkg_info_nl(Ptr<SkDefinitions.sk_buff> msg, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_send_cmd_nl(Ptr<SkDefinitions.sk_buff> msg, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ncsi_send_netlink_err($arg1, $arg2, $arg3, (const struct nlmsghdr*)$arg4, $arg5)")
    public static int ncsi_send_netlink_err(Ptr<NetDefinitions.net_device> dev, @Unsigned int snd_seq, @Unsigned int snd_portid, Ptr<runtime.nlmsghdr> nlhdr, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_send_netlink_rsp(Ptr<ncsi_request> nr, Ptr<ncsi_package> np, Ptr<ncsi_channel> nc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_send_netlink_timeout(Ptr<ncsi_request> nr, Ptr<ncsi_package> np, Ptr<ncsi_channel> nc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_set_channel_mask_nl(Ptr<SkDefinitions.sk_buff> msg, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_set_interface_nl(Ptr<SkDefinitions.sk_buff> msg, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_set_package_mask_nl(Ptr<SkDefinitions.sk_buff> msg, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_write_package_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<ncsi_dev_priv> ndp, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_xmit_cmd(Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ncsi_channel> ncsi_add_channel(Ptr<ncsi_package> np, char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ncsi_package> ncsi_add_package(Ptr<ncsi_dev_priv> ndp, char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ncsi_request> ncsi_alloc_request(Ptr<ncsi_dev_priv> ndp, @Unsigned int req_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ncsi_channel_has_link(Ptr<ncsi_channel> channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ncsi_channel_is_last(Ptr<ncsi_dev_priv> ndp, Ptr<ncsi_channel> channel2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ncsi_channel_is_tx(Ptr<ncsi_dev_priv> ndp, Ptr<ncsi_channel> nc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_channel_monitor(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_choose_active_channel(Ptr<ncsi_dev_priv> ndp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_configure_channel(Ptr<ncsi_dev_priv> ndp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_dev_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ncsi_channel> ncsi_find_channel(Ptr<ncsi_package> np, char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ncsi_dev> ncsi_find_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ncsi_package> ncsi_find_package(Ptr<ncsi_dev_priv> ndp, char id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_find_package_and_channel(Ptr<ncsi_dev_priv> ndp, char id, Ptr<Ptr<ncsi_package>> np, Ptr<Ptr<ncsi_channel>> nc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_free_request(Ptr<ncsi_request> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_kick_channels(Ptr<ncsi_dev_priv> ndp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_oem_gma_handler_bcm(Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_oem_gma_handler_intel(Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_oem_gma_handler_mlx(Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_oem_smaf_mlx(Ptr<ncsi_cmd_arg> nca) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_probe_channel(Ptr<ncsi_dev_priv> ndp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_process_next_channel(Ptr<ncsi_dev_priv> ndp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ncsi_register_dev($arg1, (void (*)(struct ncsi_dev*))$arg2)")
    public static Ptr<ncsi_dev> ncsi_register_dev(Ptr<NetDefinitions.net_device> dev, Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_remove_package(Ptr<ncsi_package> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_report_link(Ptr<ncsi_dev_priv> ndp, boolean force_down) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_request_timeout(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_reset_dev(Ptr<ncsi_dev> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_start_channel_monitor(Ptr<ncsi_channel> nc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_start_dev(Ptr<ncsi_dev> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_stop_channel_monitor(Ptr<ncsi_channel> nc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_stop_dev(Ptr<ncsi_dev> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_suspend_channel(Ptr<ncsi_dev_priv> ndp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ncsi_unregister_dev(Ptr<ncsi_dev> nd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_update_tx_channel(Ptr<ncsi_dev_priv> ndp, Ptr<ncsi_package> _package, Ptr<ncsi_channel> disable, Ptr<ncsi_channel> enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_vlan_rx_add_vid(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_vlan_rx_kill_vid(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_aen_handler_cr(Ptr<ncsi_dev_priv> ndp, Ptr<ncsi_aen_pkt_hdr> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_aen_handler_hncdsc(Ptr<ncsi_dev_priv> ndp, Ptr<ncsi_aen_pkt_hdr> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ncsi_aen_handler_lsc(Ptr<ncsi_dev_priv> ndp, Ptr<ncsi_aen_pkt_hdr> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_oem_gma_handler")
    @NotUsableInJava
    public static class ncsi_oem_gma_handler
    extends Struct {
        public @Unsigned int mfr_id;
        public Ptr<?> handler;
    }

    @Type(noCCodeGeneration=true, cType="enum ncsi_dev_state")
    public static enum ncsi_dev_state implements Enum<ncsi_dev_state>,
    TypedEnum<ncsi_dev_state, Integer>
    {
        ncsi_dev_state_registered,
        ncsi_dev_state_functional,
        ncsi_dev_state_probe,
        ncsi_dev_state_config,
        ncsi_dev_state_suspend;

    }

    @Type(noCCodeGeneration=true, cType="enum ncsi_nl_channel_attrs")
    public static enum ncsi_nl_channel_attrs implements Enum<ncsi_nl_channel_attrs>,
    TypedEnum<ncsi_nl_channel_attrs, Integer>
    {
        NCSI_CHANNEL_ATTR_UNSPEC,
        NCSI_CHANNEL_ATTR,
        NCSI_CHANNEL_ATTR_ID,
        NCSI_CHANNEL_ATTR_VERSION_MAJOR,
        NCSI_CHANNEL_ATTR_VERSION_MINOR,
        NCSI_CHANNEL_ATTR_VERSION_STR,
        NCSI_CHANNEL_ATTR_LINK_STATE,
        NCSI_CHANNEL_ATTR_ACTIVE,
        NCSI_CHANNEL_ATTR_FORCED,
        NCSI_CHANNEL_ATTR_VLAN_LIST,
        NCSI_CHANNEL_ATTR_VLAN_ID,
        __NCSI_CHANNEL_ATTR_AFTER_LAST,
        NCSI_CHANNEL_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum ncsi_nl_pkg_attrs")
    public static enum ncsi_nl_pkg_attrs implements Enum<ncsi_nl_pkg_attrs>,
    TypedEnum<ncsi_nl_pkg_attrs, Integer>
    {
        NCSI_PKG_ATTR_UNSPEC,
        NCSI_PKG_ATTR,
        NCSI_PKG_ATTR_ID,
        NCSI_PKG_ATTR_FORCED,
        NCSI_PKG_ATTR_CHANNEL_LIST,
        __NCSI_PKG_ATTR_AFTER_LAST,
        NCSI_PKG_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum ncsi_nl_attrs")
    public static enum ncsi_nl_attrs implements Enum<ncsi_nl_attrs>,
    TypedEnum<ncsi_nl_attrs, Integer>
    {
        NCSI_ATTR_UNSPEC,
        NCSI_ATTR_IFINDEX,
        NCSI_ATTR_PACKAGE_LIST,
        NCSI_ATTR_PACKAGE_ID,
        NCSI_ATTR_CHANNEL_ID,
        NCSI_ATTR_DATA,
        NCSI_ATTR_MULTI_FLAG,
        NCSI_ATTR_PACKAGE_MASK,
        NCSI_ATTR_CHANNEL_MASK,
        __NCSI_ATTR_AFTER_LAST,
        NCSI_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum ncsi_nl_commands")
    public static enum ncsi_nl_commands implements Enum<ncsi_nl_commands>,
    TypedEnum<ncsi_nl_commands, Integer>
    {
        NCSI_CMD_UNSPEC,
        NCSI_CMD_PKG_INFO,
        NCSI_CMD_SET_INTERFACE,
        NCSI_CMD_CLEAR_INTERFACE,
        NCSI_CMD_SEND_CMD,
        NCSI_CMD_SET_PACKAGE_MASK,
        NCSI_CMD_SET_CHANNEL_MASK,
        __NCSI_CMD_AFTER_LAST,
        NCSI_CMD_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_handler")
    @NotUsableInJava
    public static class ncsi_cmd_handler
    extends Struct {
        public char type;
        public int payload;
        public Ptr<?> handler;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_oem_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_oem_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public @Unsigned @OriginalName(value="__be32") int mfr_id;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_rc_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_rc_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public @Unsigned @OriginalName(value="__be32") int reserved;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=22) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_dc_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_dc_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public char @Size(value=3) [] reserved;
        public char ald;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=22) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_sp_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_sp_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public char @Size(value=3) [] reserved;
        public char hw_arbitration;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=22) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=26) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_arg")
    @NotUsableInJava
    public static class ncsi_cmd_arg
    extends Struct {
        public Ptr<ncsi_dev_priv> ndp;
        public char type;
        public char id;
        public char _package;
        public char channel;
        public @Unsigned short payload;
        public @Unsigned int req_flags;
        @InlineUnion(value=66719)
        public @InlineUnion(value=66719) char @Size(value=16) [] bytes;
        @InlineUnion(value=66719)
        public @InlineUnion(value=66719) @Unsigned short @Size(value=8) [] words;
        @InlineUnion(value=66719)
        public @InlineUnion(value=66719) @Unsigned int @Size(value=4) [] dwords;
        public String data;
        public Ptr<GenlDefinitions.genl_info> info;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_handler")
    @NotUsableInJava
    public static class ncsi_rsp_handler
    extends Struct {
        public char type;
        public int payload;
        public Ptr<?> handler;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_oem_handler")
    @NotUsableInJava
    public static class ncsi_rsp_oem_handler
    extends Struct {
        public @Unsigned int mfr_id;
        public Ptr<?> handler;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gmcma_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gmcma_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public char address_count;
        public char @Size(value=3) [] reserved;
        public char @Size(value=0) [] addresses;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gpuuid_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gpuuid_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public char @Size(value=16) [] uuid;
        public @Unsigned @OriginalName(value="__be32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gps_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gps_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public @Unsigned @OriginalName(value="__be32") int status;
        public @Unsigned @OriginalName(value="__be32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gnpts_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gnpts_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public @Unsigned @OriginalName(value="__be32") int tx_pkts;
        public @Unsigned @OriginalName(value="__be32") int tx_dropped;
        public @Unsigned @OriginalName(value="__be32") int tx_channel_err;
        public @Unsigned @OriginalName(value="__be32") int tx_us_err;
        public @Unsigned @OriginalName(value="__be32") int rx_pkts;
        public @Unsigned @OriginalName(value="__be32") int rx_dropped;
        public @Unsigned @OriginalName(value="__be32") int rx_channel_err;
        public @Unsigned @OriginalName(value="__be32") int rx_us_err;
        public @Unsigned @OriginalName(value="__be32") int rx_os_err;
        public @Unsigned @OriginalName(value="__be32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gns_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gns_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public @Unsigned @OriginalName(value="__be32") int rx_cmds;
        public @Unsigned @OriginalName(value="__be32") int dropped_cmds;
        public @Unsigned @OriginalName(value="__be32") int cmd_type_errs;
        public @Unsigned @OriginalName(value="__be32") int cmd_csum_errs;
        public @Unsigned @OriginalName(value="__be32") int rx_pkts;
        public @Unsigned @OriginalName(value="__be32") int tx_pkts;
        public @Unsigned @OriginalName(value="__be32") int tx_aen_pkts;
        public @Unsigned @OriginalName(value="__be32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gcps_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gcps_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public @Unsigned @OriginalName(value="__be32") int cnt_hi;
        public @Unsigned @OriginalName(value="__be32") int cnt_lo;
        public @Unsigned @OriginalName(value="__be32") int rx_bytes;
        public @Unsigned @OriginalName(value="__be32") int tx_bytes;
        public @Unsigned @OriginalName(value="__be32") int rx_uc_pkts;
        public @Unsigned @OriginalName(value="__be32") int rx_mc_pkts;
        public @Unsigned @OriginalName(value="__be32") int rx_bc_pkts;
        public @Unsigned @OriginalName(value="__be32") int tx_uc_pkts;
        public @Unsigned @OriginalName(value="__be32") int tx_mc_pkts;
        public @Unsigned @OriginalName(value="__be32") int tx_bc_pkts;
        public @Unsigned @OriginalName(value="__be32") int fcs_err;
        public @Unsigned @OriginalName(value="__be32") int align_err;
        public @Unsigned @OriginalName(value="__be32") int false_carrier;
        public @Unsigned @OriginalName(value="__be32") int runt_pkts;
        public @Unsigned @OriginalName(value="__be32") int jabber_pkts;
        public @Unsigned @OriginalName(value="__be32") int rx_pause_xon;
        public @Unsigned @OriginalName(value="__be32") int rx_pause_xoff;
        public @Unsigned @OriginalName(value="__be32") int tx_pause_xon;
        public @Unsigned @OriginalName(value="__be32") int tx_pause_xoff;
        public @Unsigned @OriginalName(value="__be32") int tx_s_collision;
        public @Unsigned @OriginalName(value="__be32") int tx_m_collision;
        public @Unsigned @OriginalName(value="__be32") int l_collision;
        public @Unsigned @OriginalName(value="__be32") int e_collision;
        public @Unsigned @OriginalName(value="__be32") int rx_ctl_frames;
        public @Unsigned @OriginalName(value="__be32") int rx_64_frames;
        public @Unsigned @OriginalName(value="__be32") int rx_127_frames;
        public @Unsigned @OriginalName(value="__be32") int rx_255_frames;
        public @Unsigned @OriginalName(value="__be32") int rx_511_frames;
        public @Unsigned @OriginalName(value="__be32") int rx_1023_frames;
        public @Unsigned @OriginalName(value="__be32") int rx_1522_frames;
        public @Unsigned @OriginalName(value="__be32") int rx_9022_frames;
        public @Unsigned @OriginalName(value="__be32") int tx_64_frames;
        public @Unsigned @OriginalName(value="__be32") int tx_127_frames;
        public @Unsigned @OriginalName(value="__be32") int tx_255_frames;
        public @Unsigned @OriginalName(value="__be32") int tx_511_frames;
        public @Unsigned @OriginalName(value="__be32") int tx_1023_frames;
        public @Unsigned @OriginalName(value="__be32") int tx_1522_frames;
        public @Unsigned @OriginalName(value="__be32") int tx_9022_frames;
        public @Unsigned @OriginalName(value="__be32") int rx_valid_bytes;
        public @Unsigned @OriginalName(value="__be32") int rx_runt_pkts;
        public @Unsigned @OriginalName(value="__be32") int rx_jabber_pkts;
        public @Unsigned @OriginalName(value="__be32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gp_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gp_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public char mac_cnt;
        public char @Size(value=2) [] reserved;
        public char mac_enable;
        public char vlan_cnt;
        public char reserved1;
        public @Unsigned @OriginalName(value="__be16") short vlan_enable;
        public @Unsigned @OriginalName(value="__be32") int link_mode;
        public @Unsigned @OriginalName(value="__be32") int bc_mode;
        public @Unsigned @OriginalName(value="__be32") int valid_modes;
        public char vlan_mode;
        public char fc_mode;
        public char @Size(value=2) [] reserved2;
        public @Unsigned @OriginalName(value="__be32") int aen_mode;
        public char @Size(value=6) [] mac;
        public @Unsigned @OriginalName(value="__be16") short vlan;
        public @Unsigned @OriginalName(value="__be32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gc_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gc_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public @Unsigned @OriginalName(value="__be32") int cap;
        public @Unsigned @OriginalName(value="__be32") int bc_cap;
        public @Unsigned @OriginalName(value="__be32") int mc_cap;
        public @Unsigned @OriginalName(value="__be32") int buf_cap;
        public @Unsigned @OriginalName(value="__be32") int aen_cap;
        public char vlan_cnt;
        public char mixed_cnt;
        public char mc_cnt;
        public char uc_cnt;
        public char @Size(value=2) [] reserved;
        public char vlan_mode;
        public char channel_cnt;
        public @Unsigned @OriginalName(value="__be32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gvi_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gvi_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public char major;
        public char minor;
        public char update;
        public char alpha1;
        public char @Size(value=3) [] reserved;
        public char alpha2;
        public char @Size(value=12) [] fw_name;
        public @Unsigned @OriginalName(value="__be32") int fw_version;
        public @Unsigned @OriginalName(value="__be16") short @Size(value=4) [] pci_ids;
        public @Unsigned @OriginalName(value="__be32") int mf_id;
        public @Unsigned @OriginalName(value="__be32") int checksum;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_gls_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_gls_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public @Unsigned @OriginalName(value="__be32") int status;
        public @Unsigned @OriginalName(value="__be32") int other;
        public @Unsigned @OriginalName(value="__be32") int oem_status;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=10) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_oem_intel_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_oem_intel_pkt
    extends Struct {
        public char cmd;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_oem_bcm_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_oem_bcm_pkt
    extends Struct {
        public char ver;
        public char type;
        public @Unsigned @OriginalName(value="__be16") short len;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_oem_mlx_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_oem_mlx_pkt
    extends Struct {
        public char cmd_rev;
        public char cmd;
        public char param;
        public char optional;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_oem_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_oem_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public @Unsigned @OriginalName(value="__be32") int mfr_id;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_snfc_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_snfc_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public char @Size(value=3) [] reserved;
        public char mode;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=22) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_egmf_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_egmf_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public @Unsigned @OriginalName(value="__be32") int mode;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=22) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_ebf_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_ebf_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public @Unsigned @OriginalName(value="__be32") int mode;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=22) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_sma_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_sma_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public char @Size(value=6) [] mac;
        public char index;
        public char at_e;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=18) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_ev_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_ev_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public char @Size(value=3) [] reserved;
        public char mode;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=22) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_svf_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_svf_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public @Unsigned @OriginalName(value="__be16") short reserved;
        public @Unsigned @OriginalName(value="__be16") short vlan;
        public @Unsigned @OriginalName(value="__be16") short reserved1;
        public char index;
        public char enable;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=18) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_sl_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_sl_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public @Unsigned @OriginalName(value="__be32") int mode;
        public @Unsigned @OriginalName(value="__be32") int oem_mode;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=18) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_ae_pkt")
    @NotUsableInJava
    public static class ncsi_cmd_ae_pkt
    extends Struct {
        public ncsi_cmd_pkt_hdr cmd;
        public char @Size(value=3) [] reserved;
        public char mc_id;
        public @Unsigned @OriginalName(value="__be32") int mode;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=18) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_pkt")
    @NotUsableInJava
    public static class ncsi_rsp_pkt
    extends Struct {
        public ncsi_rsp_pkt_hdr rsp;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=22) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_rsp_pkt_hdr")
    @NotUsableInJava
    public static class ncsi_rsp_pkt_hdr
    extends Struct {
        public ncsi_pkt_hdr common;
        public @Unsigned @OriginalName(value="__be16") short code;
        public @Unsigned @OriginalName(value="__be16") short reason;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_cmd_pkt_hdr")
    @NotUsableInJava
    public static class ncsi_cmd_pkt_hdr
    extends Struct {
        public ncsi_pkt_hdr common;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_aen_handler")
    @NotUsableInJava
    public static class ncsi_aen_handler
    extends Struct {
        public char type;
        public int payload;
        public Ptr<?> handler;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_aen_hncdsc_pkt")
    @NotUsableInJava
    public static class ncsi_aen_hncdsc_pkt
    extends Struct {
        public ncsi_aen_pkt_hdr aen;
        public @Unsigned @OriginalName(value="__be32") int status;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=18) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_aen_lsc_pkt")
    @NotUsableInJava
    public static class ncsi_aen_lsc_pkt
    extends Struct {
        public ncsi_aen_pkt_hdr aen;
        public @Unsigned @OriginalName(value="__be32") int status;
        public @Unsigned @OriginalName(value="__be32") int oem_status;
        public @Unsigned @OriginalName(value="__be32") int checksum;
        public char @Size(value=14) [] pad;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_aen_pkt_hdr")
    @NotUsableInJava
    public static class ncsi_aen_pkt_hdr
    extends Struct {
        public ncsi_pkt_hdr common;
        public char @Size(value=3) [] reserved2;
        public char type;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_pkt_hdr")
    @NotUsableInJava
    public static class ncsi_pkt_hdr
    extends Struct {
        public char mc_id;
        public char revision;
        public char reserved;
        public char id;
        public char type;
        public char channel;
        public @Unsigned @OriginalName(value="__be16") short length;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=2) [] reserved1;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_request")
    @NotUsableInJava
    public static class ncsi_request
    extends Struct {
        public char id;
        public boolean used;
        public @Unsigned int flags;
        public Ptr<ncsi_dev_priv> ndp;
        public Ptr<SkDefinitions.sk_buff> cmd;
        public Ptr<SkDefinitions.sk_buff> rsp;
        public TimerDefinitions.timer_list timer;
        public boolean enabled;
        public @Unsigned int snd_seq;
        public @Unsigned int snd_portid;
        public runtime.nlmsghdr nlhdr;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_dev_priv")
    @NotUsableInJava
    public static class ncsi_dev_priv
    extends Struct {
        public ncsi_dev ndev;
        public @Unsigned int flags;
        public @Unsigned int gma_flag;
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int package_probe_id;
        public @Unsigned int package_num;
        public @Unsigned int channel_probe_id;
        public ListDefinitions.list_head packages;
        public Ptr<ncsi_channel> hot_channel;
        public ncsi_request @Size(value=256) [] requests;
        public @Unsigned int request_id;
        public @Unsigned int pending_req_num;
        public Ptr<ncsi_package> active_package;
        public Ptr<ncsi_channel> active_channel;
        public ListDefinitions.list_head channel_queue;
        public misc.work_struct work;
        public PacketDefinitions.packet_type ptype;
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head vlan_vids;
        public boolean multi_package;
        public boolean mlx_multi_host;
        public @Unsigned int package_whitelist;
        public char channel_count;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_package")
    @NotUsableInJava
    public static class ncsi_package
    extends Struct {
        public char id;
        public char @Size(value=16) [] uuid;
        public Ptr<ncsi_dev_priv> ndp;
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int channel_num;
        public ListDefinitions.list_head channels;
        public ListDefinitions.list_head node;
        public boolean multi_channel;
        public @Unsigned int channel_whitelist;
        public Ptr<ncsi_channel> preferred_channel;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_channel")
    @NotUsableInJava
    public static class ncsi_channel
    extends Struct {
        public char id;
        public int state;
        public boolean reconfigure_needed;
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<ncsi_package> _package;
        public ncsi_channel_version version;
        public ncsi_channel_cap @Size(value=6) [] caps;
        public ncsi_channel_mode @Size(value=8) [] modes;
        public ncsi_channel_mac_filter mac_filter;
        public ncsi_channel_vlan_filter vlan_filter;
        public ncsi_channel_stats stats;
        public misc.monitor_of_ncsi_channel monitor;
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head link;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_channel_stats")
    @NotUsableInJava
    public static class ncsi_channel_stats
    extends Struct {
        public @Unsigned int hnc_cnt_hi;
        public @Unsigned int hnc_cnt_lo;
        public @Unsigned int hnc_rx_bytes;
        public @Unsigned int hnc_tx_bytes;
        public @Unsigned int hnc_rx_uc_pkts;
        public @Unsigned int hnc_rx_mc_pkts;
        public @Unsigned int hnc_rx_bc_pkts;
        public @Unsigned int hnc_tx_uc_pkts;
        public @Unsigned int hnc_tx_mc_pkts;
        public @Unsigned int hnc_tx_bc_pkts;
        public @Unsigned int hnc_fcs_err;
        public @Unsigned int hnc_align_err;
        public @Unsigned int hnc_false_carrier;
        public @Unsigned int hnc_runt_pkts;
        public @Unsigned int hnc_jabber_pkts;
        public @Unsigned int hnc_rx_pause_xon;
        public @Unsigned int hnc_rx_pause_xoff;
        public @Unsigned int hnc_tx_pause_xon;
        public @Unsigned int hnc_tx_pause_xoff;
        public @Unsigned int hnc_tx_s_collision;
        public @Unsigned int hnc_tx_m_collision;
        public @Unsigned int hnc_l_collision;
        public @Unsigned int hnc_e_collision;
        public @Unsigned int hnc_rx_ctl_frames;
        public @Unsigned int hnc_rx_64_frames;
        public @Unsigned int hnc_rx_127_frames;
        public @Unsigned int hnc_rx_255_frames;
        public @Unsigned int hnc_rx_511_frames;
        public @Unsigned int hnc_rx_1023_frames;
        public @Unsigned int hnc_rx_1522_frames;
        public @Unsigned int hnc_rx_9022_frames;
        public @Unsigned int hnc_tx_64_frames;
        public @Unsigned int hnc_tx_127_frames;
        public @Unsigned int hnc_tx_255_frames;
        public @Unsigned int hnc_tx_511_frames;
        public @Unsigned int hnc_tx_1023_frames;
        public @Unsigned int hnc_tx_1522_frames;
        public @Unsigned int hnc_tx_9022_frames;
        public @Unsigned int hnc_rx_valid_bytes;
        public @Unsigned int hnc_rx_runt_pkts;
        public @Unsigned int hnc_rx_jabber_pkts;
        public @Unsigned int ncsi_rx_cmds;
        public @Unsigned int ncsi_dropped_cmds;
        public @Unsigned int ncsi_cmd_type_errs;
        public @Unsigned int ncsi_cmd_csum_errs;
        public @Unsigned int ncsi_rx_pkts;
        public @Unsigned int ncsi_tx_pkts;
        public @Unsigned int ncsi_tx_aen_pkts;
        public @Unsigned int pt_tx_pkts;
        public @Unsigned int pt_tx_dropped;
        public @Unsigned int pt_tx_channel_err;
        public @Unsigned int pt_tx_us_err;
        public @Unsigned int pt_rx_pkts;
        public @Unsigned int pt_rx_dropped;
        public @Unsigned int pt_rx_channel_err;
        public @Unsigned int pt_rx_us_err;
        public @Unsigned int pt_rx_os_err;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_channel_vlan_filter")
    @NotUsableInJava
    public static class ncsi_channel_vlan_filter
    extends Struct {
        public char n_vids;
        public @Unsigned long bitmap;
        public Ptr<@Unsigned Short> vids;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_channel_mac_filter")
    @NotUsableInJava
    public static class ncsi_channel_mac_filter
    extends Struct {
        public char n_uc;
        public char n_mc;
        public char n_mixed;
        public @Unsigned long bitmap;
        public String addrs;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_channel_mode")
    @NotUsableInJava
    public static class ncsi_channel_mode
    extends Struct {
        public @Unsigned int index;
        public @Unsigned int enable;
        public @Unsigned int size;
        public @Unsigned int @Size(value=8) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_channel_cap")
    @NotUsableInJava
    public static class ncsi_channel_cap
    extends Struct {
        public @Unsigned int index;
        public @Unsigned int cap;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_channel_version")
    @NotUsableInJava
    public static class ncsi_channel_version
    extends Struct {
        public char major;
        public char minor;
        public char update;
        public char alpha1;
        public char alpha2;
        public char @Size(value=12) [] fw_name;
        public @Unsigned int fw_version;
        public @Unsigned short @Size(value=4) [] pci_ids;
        public @Unsigned int mf_id;
    }

    @Type(noCCodeGeneration=true, cType="struct ncsi_dev")
    @NotUsableInJava
    public static class ncsi_dev
    extends Struct {
        public int state;
        public int link_up;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<?> handler;
    }
}

