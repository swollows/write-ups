/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NetifDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netif_napi_del(Ptr<NapiDefinitions.napi_struct> napi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netif_receive_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netif_receive_skb_core(Ptr<Ptr<SkDefinitions.sk_buff>> pskb, boolean pfmemalloc, Ptr<Ptr<PacketDefinitions.packet_type>> ppt_prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netif_receive_skb_list_core(Ptr<ListDefinitions.list_head> head, boolean pfmemalloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netif_receive_skb_one_core(Ptr<SkDefinitions.sk_buff> skb, boolean pfmemalloc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netif_reschedule(Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netif_rx(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netif_schedule(Ptr<runtime.Qdisc> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__netif_set_xps_queue($arg1, (const long unsigned int*)$arg2, $arg3, $arg4)")
    public static int __netif_set_xps_queue(Ptr<NetDefinitions.net_device> dev, Ptr<@Unsigned Long> mask, @Unsigned short index2, misc.xps_map_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_device_attach(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_device_detach(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_get_num_default_rss_queues() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netif_inherit_tso_max($arg1, (const struct net_device*)$arg2)")
    public static void netif_inherit_tso_max(Ptr<NetDefinitions.net_device> to, Ptr<NetDefinitions.net_device> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netif_napi_add_weight($arg1, $arg2, (int (*)(struct napi_struct*, int))$arg3, $arg4)")
    public static void netif_napi_add_weight(Ptr<NetDefinitions.net_device> dev, Ptr<NapiDefinitions.napi_struct> napi, Ptr<?> poll, int weight) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_queue_set_napi(Ptr<NetDefinitions.net_device> dev, @Unsigned int queue_index, NetdevDefinitions.netdev_queue_type type2, Ptr<NapiDefinitions.napi_struct> napi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int netif_receive_generic_xdp(Ptr<Ptr<SkDefinitions.sk_buff>> pskb, Ptr<XdpDefinitions.xdp_buff> xdp2, Ptr<BpfDefinitions.bpf_prog> xdp_prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_receive_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_receive_skb_core(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_receive_skb_list(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_receive_skb_list_internal(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_reset_xps_queues(Ptr<NetDefinitions.net_device> dev, @Unsigned short offset, @Unsigned short count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_rx(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_rx_internal(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_schedule_queue(Ptr<NetdevDefinitions.netdev_queue> txq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_set_real_num_queues(Ptr<NetDefinitions.net_device> dev, @Unsigned int txq, @Unsigned int rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_set_real_num_rx_queues(Ptr<NetDefinitions.net_device> dev, @Unsigned int rxq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_set_real_num_tx_queues(Ptr<NetDefinitions.net_device> dev, @Unsigned int txq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_set_tso_max_segs(Ptr<NetDefinitions.net_device> dev, @Unsigned int segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_set_tso_max_size(Ptr<NetDefinitions.net_device> dev, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netif_set_xps_queue($arg1, (const struct cpumask*)$arg2, $arg3)")
    public static int netif_set_xps_queue(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.cpumask> mask, @Unsigned short index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="netdev_features_t") long netif_skb_features(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netif_stacked_transfer_operstate((const struct net_device*)$arg1, $arg2)")
    public static void netif_stacked_transfer_operstate(Ptr<NetDefinitions.net_device> rootdev, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_tx_stop_all_queues(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_tx_wake_queue(Ptr<NetdevDefinitions.netdev_queue> dev_queue) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_carrier_event(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_carrier_off(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_carrier_on(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_freeze_queues(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netif_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_tx_lock(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netif_tx_unlock(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct netif_security_struct")
    @NotUsableInJava
    public static class netif_security_struct
    extends Struct {
        public Ptr<runtime.net> ns;
        public int ifindex;
        public @Unsigned int sid;
    }
}

