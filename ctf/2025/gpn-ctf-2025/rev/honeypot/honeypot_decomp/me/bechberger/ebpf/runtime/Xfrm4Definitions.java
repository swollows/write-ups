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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Xfrm4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm4_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm4_local_error(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__xfrm4_dst_lookup($arg1, (const struct xfrm_dst_lookup_params*)$arg2)")
    public static Ptr<DstDefinitions.dst_entry> __xfrm4_dst_lookup(Ptr<runtime.flowi4> fl4, Ptr<XfrmDefinitions.xfrm_dst_lookup_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_beet_encap_add(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm4_dst_destroy(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm4_dst_lookup((const struct xfrm_dst_lookup_params*)$arg1)")
    public static Ptr<DstDefinitions.dst_entry> xfrm4_dst_lookup(Ptr<XfrmDefinitions.xfrm_dst_lookup_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm4_fill_dst($arg1, $arg2, (const struct flowi*)$arg3)")
    public static int xfrm4_fill_dst(Ptr<XfrmDefinitions.xfrm_dst> xdst, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.flowi> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm4_get_saddr($arg1, (const struct xfrm_dst_lookup_params*)$arg2)")
    public static int xfrm4_get_saddr(Ptr<XfrmDefinitions.xfrm_address_t> saddr, Ptr<XfrmDefinitions.xfrm_dst_lookup_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm4_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm4_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm4_redirect(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_tunnel_encap_add(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm4_update_pmtu(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu, boolean confirm_neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm4_udp_encap_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, boolean pull) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> xfrm4_gro_udp_encap_rcv(Ptr<runtime.sock> sk, Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_rcv_encap_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_rcv_encap_finish2(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_remove_beet_encap(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_remove_tunnel_encap(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_transport_finish(Ptr<SkDefinitions.sk_buff> skb, int async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_udp_encap_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_ah_err(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_ah_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_esp_err(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_esp_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_ipcomp_err(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_ipcomp_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_protocol_deregister(Ptr<xfrm4_protocol> handler, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm4_protocol_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_protocol_register(Ptr<xfrm4_protocol> handler, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_rcv_cb(Ptr<SkDefinitions.sk_buff> skb, char protocol, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm4_rcv_encap(Ptr<SkDefinitions.sk_buff> skb, int nexthdr, @Unsigned @OriginalName(value="__be32") int spi, int encap_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm4_state_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm4_protocol")
    @NotUsableInJava
    public static class xfrm4_protocol
    extends Struct {
        public Ptr<?> handler;
        public Ptr<?> input_handler;
        public Ptr<?> cb_handler;
        public Ptr<?> err_handler;
        public Ptr<xfrm4_protocol> next;
        public int priority;
    }
}

