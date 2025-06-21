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
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RtnlDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XenDefinitions;
import me.bechberger.ebpf.runtime.XenbusDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class XennetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_alloc_rx_buffers(Ptr<misc.netfront_queue> queue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_bus_close(Ptr<XenbusDefinitions.xenbus_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_change_mtu(Ptr<NetDefinitions.net_device> dev, int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_close(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_connect(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> xennet_create_dev(Ptr<XenbusDefinitions.xenbus_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_create_queues(Ptr<misc.netfront_info> info2, Ptr<@Unsigned Integer> num_queues) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_destroy_queues(Ptr<misc.netfront_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_disconnect_backend(Ptr<misc.netfront_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netdev_features_t") long xennet_fix_features(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_free_netdev(Ptr<NetDefinitions.net_device> netdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_get_ethtool_stats(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_stats> stats, Ptr<@Unsigned Long> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_get_responses(Ptr<misc.netfront_queue> queue, Ptr<misc.netfront_rx_info> rinfo, @Unsigned @OriginalName(value="RING_IDX") int rp, Ptr<SkDefinitions.sk_buff_head> list, Ptr<@OriginalName(value="bool") Boolean> need_xdp_flush) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_get_sset_count(Ptr<NetDefinitions.net_device> dev, int string_set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_get_stats64(Ptr<NetDefinitions.net_device> dev, Ptr<RtnlDefinitions.rtnl_link_stats64> tot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_get_strings(Ptr<NetDefinitions.net_device> dev, @Unsigned int stringset, Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xennet_handle_rx(Ptr<misc.netfront_queue> queue, Ptr<@Unsigned Integer> eoi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xennet_handle_tx(Ptr<misc.netfront_queue> queue, Ptr<@Unsigned Integer> eoi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xennet_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_make_one_txreq(@Unsigned long gfn, @Unsigned int offset, @Unsigned int len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_move_rx_slot(Ptr<misc.netfront_queue> queue, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="grant_ref_t") int ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_open(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_poll(Ptr<NapiDefinitions.napi_struct> napi, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_poll_controller(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_remove(Ptr<XenbusDefinitions.xenbus_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xennet_rx_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short xennet_select_queue(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> sb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_set_features(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx xennet_start_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean xennet_tx_buf_gc(Ptr<misc.netfront_queue> queue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn xennet_tx_interrupt(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_tx_setup_grant(@Unsigned long gfn, @Unsigned int offset, @Unsigned int len, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xennet_uninit(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_xdp(Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_bpf> xdp2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_xdp_set(Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xennet_xdp_xmit(Ptr<NetDefinitions.net_device> dev, int n, Ptr<Ptr<XdpDefinitions.xdp_frame>> frames, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xennet_stat")
    @NotUsableInJava
    public static class xennet_stat
    extends Struct {
        public char @Size(value=32) [] name;
        public @Unsigned short offset;
    }

    @Type(noCCodeGeneration=true, cType="struct xennet_gnttab_make_txreq")
    @NotUsableInJava
    public static class xennet_gnttab_make_txreq
    extends Struct {
        public Ptr<misc.netfront_queue> queue;
        public Ptr<SkDefinitions.sk_buff> skb;
        public Ptr<runtime.page> page;
        public Ptr<XenDefinitions.xen_netif_tx_request> tx;
        public XenDefinitions.xen_netif_tx_request tx_local;
        public @Unsigned int size;
    }
}

