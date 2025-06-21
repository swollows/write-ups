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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RtnlDefinitions;
import me.bechberger.ebpf.runtime.SendDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.VirtioDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VirtnetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __virtnet_xdp_xmit_one(Ptr<virtnet_info> vi, Ptr<SendDefinitions.send_queue> sq, Ptr<XdpDefinitions.xdp_frame> xdpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_alloc_queues(Ptr<virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_build_xdp_buff_mrg(Ptr<NetDefinitions.net_device> dev, Ptr<virtnet_info> vi, Ptr<misc.receive_queue> rq2, Ptr<XdpDefinitions.xdp_buff> xdp2, Ptr<?> buf, @Unsigned int len, @Unsigned int frame_sz, Ptr<Integer> num_buf, Ptr<@Unsigned Integer> xdp_frags_truesize, Ptr<virtnet_rq_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_clean_affinity(Ptr<virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_close(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtnet_commit_rss_command(Ptr<virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_config_changed(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_config_changed_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_cpu_dead(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_cpu_down_prep(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_cpu_notif_add(Ptr<virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_cpu_online(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtnet_fill_stats($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static void virtnet_fill_stats(Ptr<virtnet_info> vi, @Unsigned int qid, Ptr<virtnet_stats_ctx> ctx, Ptr<Character> base, boolean drv_stats, char reply_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_find_vqs(Ptr<virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_free_queues(Ptr<virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_freeze(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_freeze_down(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_base_stats(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_queue_stats_rx> rx, Ptr<NetdevDefinitions.netdev_queue_stats_tx> tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_channels(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_channels> channels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_get_coalesce(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_coalesce> ec, Ptr<KernelDefinitions.kernel_ethtool_coalesce> kernel_coal, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_drvinfo(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_drvinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_ethtool_stats(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_stats> stats, Ptr<@Unsigned Long> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_get_hw_stats(Ptr<virtnet_info> vi, Ptr<virtnet_stats_ctx> ctx, int qid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_get_link_ksettings(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_get_per_queue_coalesce(Ptr<NetDefinitions.net_device> dev, @Unsigned int queue, Ptr<EthtoolDefinitions.ethtool_coalesce> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_get_phys_port_name(Ptr<NetDefinitions.net_device> dev, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_queue_stats_rx(Ptr<NetDefinitions.net_device> dev, int i, Ptr<NetdevDefinitions.netdev_queue_stats_rx> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_queue_stats_tx(Ptr<NetDefinitions.net_device> dev, int i, Ptr<NetdevDefinitions.netdev_queue_stats_tx> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_ringparam(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_ringparam> ring, Ptr<KernelDefinitions.kernel_ethtool_ringparam> kernel_ring, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_get_rxfh(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_rxfh_param> rxfh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int virtnet_get_rxfh_indir_size(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int virtnet_get_rxfh_key_size(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_get_rxnfc(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_rxnfc> info2, Ptr<@Unsigned Integer> rule_locs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_get_sset_count(Ptr<NetDefinitions.net_device> dev, int sset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_stats_string(Ptr<virtnet_info> vi, int type2, int qid, Ptr<Ptr<Character>> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_get_strings(Ptr<NetDefinitions.net_device> dev, @Unsigned int stringset, Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_open(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_poll(Ptr<NapiDefinitions.napi_struct> napi, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_poll_tx(Ptr<NapiDefinitions.napi_struct> napi, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_probe(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_receive_done(Ptr<virtnet_info> vi, Ptr<misc.receive_queue> rq2, Ptr<SkDefinitions.sk_buff> skb, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_receive_xsk_bufs(Ptr<virtnet_info> vi, Ptr<misc.receive_queue> rq2, int budget, Ptr<@Unsigned Integer> xdp_xmit, Ptr<virtnet_rq_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_remove(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_restore(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> virtnet_rq_alloc(Ptr<misc.receive_queue> rq2, @Unsigned int size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_rq_bind_xsk_pool(Ptr<virtnet_info> vi, Ptr<misc.receive_queue> rq2, Ptr<XskDefinitions.xsk_buff_pool> pool) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_rq_free_buf(Ptr<virtnet_info> vi, Ptr<misc.receive_queue> rq2, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_rq_init_one_sg(Ptr<misc.receive_queue> rq2, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_rq_unmap(Ptr<misc.receive_queue> rq2, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_rq_unmap_free_buf(Ptr<runtime.virtqueue> vq, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_rx_dim_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_rx_mode_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_rx_resume(Ptr<virtnet_info> vi, Ptr<misc.receive_queue> rq2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtnet_send_command_reply(Ptr<virtnet_info> vi, char _class2, char cmd, Ptr<runtime.scatterlist> out, Ptr<runtime.scatterlist> in) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_send_ctrl_coal_vq_cmd(Ptr<virtnet_info> vi, @Unsigned short vqn, @Unsigned int max_usecs, @Unsigned int max_packets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_send_rx_ctrl_coal_vq_cmd(Ptr<virtnet_info> vi, @Unsigned short queue, @Unsigned int max_usecs, @Unsigned int max_packets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_send_rx_notf_coal_cmds(Ptr<virtnet_info> vi, Ptr<EthtoolDefinitions.ethtool_coalesce> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_send_tx_ctrl_coal_vq_cmd(Ptr<virtnet_info> vi, @Unsigned short queue, @Unsigned int max_usecs, @Unsigned int max_packets) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_set_affinity(Ptr<virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_channels(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_channels> channels) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_coalesce(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_coalesce> ec, Ptr<KernelDefinitions.kernel_ethtool_coalesce> kernel_coal, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_features(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_guest_offloads(Ptr<virtnet_info> vi, @Unsigned long offloads) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtnet_set_link_ksettings($arg1, (const struct ethtool_link_ksettings*)$arg2)")
    public static int virtnet_set_link_ksettings(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_mac_address(Ptr<NetDefinitions.net_device> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_per_queue_coalesce(Ptr<NetDefinitions.net_device> dev, @Unsigned int queue, Ptr<EthtoolDefinitions.ethtool_coalesce> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_queues(Ptr<virtnet_info> vi, @Unsigned short queue_pairs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_ringparam(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_ringparam> ring, Ptr<KernelDefinitions.kernel_ethtool_ringparam> kernel_ring, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_set_rx_mode(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_rxfh(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_rxfh_param> rxfh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_set_rxnfc(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_rxnfc> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> virtnet_skb_append_frag(Ptr<SkDefinitions.sk_buff> head_skb, Ptr<SkDefinitions.sk_buff> curr_skb, Ptr<runtime.page> page2, Ptr<?> buf, int len, int truesize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_sq_free_unused_buf(Ptr<runtime.virtqueue> vq, Ptr<?> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_stats(Ptr<NetDefinitions.net_device> dev, Ptr<RtnlDefinitions.rtnl_link_stats64> tot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_stats_ctx_init(Ptr<virtnet_info> vi, Ptr<virtnet_stats_ctx> ctx, Ptr<@Unsigned Long> data, boolean to_qstat) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_tx_timeout(Ptr<NetDefinitions.net_device> dev, @Unsigned int txqueue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virtnet_update_settings(Ptr<virtnet_info> vi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_validate(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean virtnet_validate_features(Ptr<VirtioDefinitions.virtio_device> vdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_vlan_rx_add_vid(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_vlan_rx_kill_vid(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_xdp(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_bpf> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_xdp_handler(Ptr<BpfDefinitions.bpf_prog> xdp_prog, Ptr<XdpDefinitions.xdp_buff> xdp2, Ptr<NetDefinitions.net_device> dev, Ptr<@Unsigned Integer> xdp_xmit, Ptr<virtnet_rq_stats> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virtnet_xdp_rx_hash((const struct xdp_md*)$arg1, $arg2, $arg3)")
    public static int virtnet_xdp_rx_hash(Ptr<XdpDefinitions.xdp_md> _ctx, Ptr<@Unsigned Integer> hash2, Ptr<XdpDefinitions.xdp_rss_hash_type> rss_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_xdp_set(Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_xdp_xmit(Ptr<NetDefinitions.net_device> dev, int n, Ptr<Ptr<XdpDefinitions.xdp_frame>> frames, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_xsk_pool_enable(Ptr<NetDefinitions.net_device> dev, Ptr<XskDefinitions.xsk_buff_pool> pool, @Unsigned short qid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int virtnet_xsk_wakeup(Ptr<NetDefinitions.net_device> dev, @Unsigned int qid, @Unsigned int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct virtnet_stats_ctx")
    @NotUsableInJava
    public static class virtnet_stats_ctx
    extends Struct {
        public boolean to_qstat;
        public @Unsigned int @Size(value=3) [] desc_num;
        public @Unsigned long @Size(value=3) [] bitmap;
        public @Unsigned int @Size(value=3) [] size;
        public Ptr<@Unsigned Long> data;
    }

    @Type(noCCodeGeneration=true, cType="struct virtnet_info")
    @NotUsableInJava
    public static class virtnet_info
    extends Struct {
        public Ptr<VirtioDefinitions.virtio_device> vdev;
        public Ptr<runtime.virtqueue> cvq;
        public Ptr<NetDefinitions.net_device> dev;
        public Ptr<SendDefinitions.send_queue> sq;
        public Ptr<misc.receive_queue> rq;
        public @Unsigned int status;
        public @Unsigned short max_queue_pairs;
        public @Unsigned short curr_queue_pairs;
        public @Unsigned short xdp_queue_pairs;
        public boolean xdp_enabled;
        public boolean big_packets;
        public @Unsigned int big_packets_num_skbfrags;
        public boolean mergeable_rx_bufs;
        public boolean has_rss;
        public boolean has_rss_hash_report;
        public char rss_key_size;
        public @Unsigned short rss_indir_table_size;
        public @Unsigned int rss_hash_types_supported;
        public @Unsigned int rss_hash_types_saved;
        public VirtioDefinitions.virtio_net_ctrl_rss rss;
        public boolean has_cvq;
        public runtime.mutex cvq_lock;
        public boolean any_header_sg;
        public char hdr_len;
        public DelayedDefinitions.delayed_work refill;
        public boolean refill_enabled;
        public  @OriginalName(value="spinlock_t") runtime.spinlock refill_lock;
        public misc.work_struct config_work;
        public misc.work_struct rx_mode_work;
        public boolean rx_mode_work_enabled;
        public boolean affinity_hint_set;
        public misc.hlist_node node;
        public misc.hlist_node node_dead;
        public Ptr<misc.control_buf> ctrl;
        public char duplex;
        public @Unsigned int speed;
        public boolean rx_dim_enabled;
        public virtnet_interrupt_coalesce intr_coal_tx;
        public virtnet_interrupt_coalesce intr_coal_rx;
        public @Unsigned long guest_offloads;
        public @Unsigned long guest_offloads_capable;
        public Ptr<runtime.failover> failover;
        public @Unsigned long device_stats_cap;
    }

    @Type(noCCodeGeneration=true, cType="struct virtnet_rq_dma")
    @NotUsableInJava
    public static class virtnet_rq_dma
    extends Struct {
        public @Unsigned @OriginalName(value="dma_addr_t") long addr;
        public @Unsigned int ref;
        public @Unsigned short len;
        public @Unsigned short need_sync;
    }

    @Type(noCCodeGeneration=true, cType="struct virtnet_interrupt_coalesce")
    @NotUsableInJava
    public static class virtnet_interrupt_coalesce
    extends Struct {
        public @Unsigned int max_packets;
        public @Unsigned int max_usecs;
    }

    @Type(noCCodeGeneration=true, cType="struct virtnet_rq_stats")
    @NotUsableInJava
    public static class virtnet_rq_stats
    extends Struct {
        public misc.u64_stats_sync syncp;
        public misc.u64_stats_t packets;
        public misc.u64_stats_t bytes;
        public misc.u64_stats_t drops;
        public misc.u64_stats_t xdp_packets;
        public misc.u64_stats_t xdp_tx;
        public misc.u64_stats_t xdp_redirects;
        public misc.u64_stats_t xdp_drops;
        public misc.u64_stats_t kicks;
    }

    @Type(noCCodeGeneration=true, cType="struct virtnet_sq_stats")
    @NotUsableInJava
    public static class virtnet_sq_stats
    extends Struct {
        public misc.u64_stats_sync syncp;
        public misc.u64_stats_t packets;
        public misc.u64_stats_t bytes;
        public misc.u64_stats_t xdp_tx;
        public misc.u64_stats_t xdp_tx_drops;
        public misc.u64_stats_t kicks;
        public misc.u64_stats_t tx_timeouts;
        public misc.u64_stats_t stop;
        public misc.u64_stats_t wake;
    }

    @Type(noCCodeGeneration=true, cType="struct virtnet_sq_free_stats")
    @NotUsableInJava
    public static class virtnet_sq_free_stats
    extends Struct {
        public @Unsigned long packets;
        public @Unsigned long bytes;
        public @Unsigned long napi_packets;
        public @Unsigned long napi_bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct virtnet_stat_desc")
    @NotUsableInJava
    public static class virtnet_stat_desc
    extends Struct {
        public char @Size(value=32) [] desc;
        public @Unsigned long offset;
        public @Unsigned long qstat_offset;
    }
}

