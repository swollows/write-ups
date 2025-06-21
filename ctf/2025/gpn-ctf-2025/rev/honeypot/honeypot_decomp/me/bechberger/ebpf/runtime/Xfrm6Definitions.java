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
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.Ip6Definitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Xfrm6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__xfrm6_pref_hash((const union {\n  unsigned int a4;\n  unsigned int a6[4];\n  struct in6_addr in6;\n}*)$arg1, $arg2)")
    public static @Unsigned int __xfrm6_pref_hash(Ptr<XfrmDefinitions.xfrm_address_t> addr2, char prefixlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm6_udp_encap_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, boolean pull) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> xfrm6_gro_udp_encap_rcv(Ptr<runtime.sock> sk, Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_input_addr(Ptr<SkDefinitions.sk_buff> skb, Ptr<XfrmDefinitions.xfrm_address_t> daddr, Ptr<XfrmDefinitions.xfrm_address_t> saddr, char proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_rcv_spi(Ptr<SkDefinitions.sk_buff> skb, int nexthdr, @Unsigned @OriginalName(value="__be32") int spi, Ptr<Ip6Definitions.ip6_tnl> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_rcv_tnl(Ptr<SkDefinitions.sk_buff> skb, Ptr<Ip6Definitions.ip6_tnl> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_transport_finish(Ptr<SkDefinitions.sk_buff> skb, int async2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_transport_finish2(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_udp_encap_rcv(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_ah_err(Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_skb_parm> opt, char type2, char code2, int offset, @Unsigned @OriginalName(value="__be32") int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_ah_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_beet_encap_add(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_beet_make_header(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_esp_err(Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_skb_parm> opt, char type2, char code2, int offset, @Unsigned @OriginalName(value="__be32") int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_esp_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_extract_header(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_ipcomp_err(Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_skb_parm> opt, char type2, char code2, int offset, @Unsigned @OriginalName(value="__be32") int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_ipcomp_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_protocol_deregister(Ptr<xfrm6_protocol> handler, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_protocol_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_protocol_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_protocol_register(Ptr<xfrm6_protocol> handler, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_rcv_cb(Ptr<SkDefinitions.sk_buff> skb, char protocol, int err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_rcv_encap(Ptr<SkDefinitions.sk_buff> skb, int nexthdr, @Unsigned @OriginalName(value="__be32") int spi, int encap_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_tunnel_check_size(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_tunnel_encap_add(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm6_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __xfrm6_output_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_dst_destroy(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_dst_ifdown(Ptr<DstDefinitions.dst_entry> dst, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm6_dst_lookup((const struct xfrm_dst_lookup_params*)$arg1)")
    public static Ptr<DstDefinitions.dst_entry> xfrm6_dst_lookup(Ptr<XfrmDefinitions.xfrm_dst_lookup_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm6_fill_dst($arg1, $arg2, (const struct flowi*)$arg3)")
    public static int xfrm6_fill_dst(Ptr<XfrmDefinitions.xfrm_dst> xdst, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.flowi> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="xfrm6_get_saddr($arg1, (const struct xfrm_dst_lookup_params*)$arg2)")
    public static int xfrm6_get_saddr(Ptr<XfrmDefinitions.xfrm_address_t> saddr, Ptr<XfrmDefinitions.xfrm_dst_lookup_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_local_error(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_local_rxpmtu(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_redirect(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_remove_tunnel_encap(Ptr<XfrmDefinitions.xfrm_state> x, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_update_pmtu(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu, boolean confirm_neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void xfrm6_state_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int xfrm6_state_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct xfrm6_protocol")
    @NotUsableInJava
    public static class xfrm6_protocol
    extends Struct {
        public Ptr<?> handler;
        public Ptr<?> input_handler;
        public Ptr<?> cb_handler;
        public Ptr<?> err_handler;
        public Ptr<xfrm6_protocol> next;
        public int priority;
    }
}

