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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SkbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __skb_array_destroy_skb(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_flow_bpf_to_target((const struct bpf_flow_keys*)$arg1, $arg2, $arg3)")
    public static void __skb_flow_bpf_to_target(Ptr<BpfDefinitions.bpf_flow_keys> flow_keys2, Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<?> target_container) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_flow_dissect((const struct net*)$arg1, (const struct sk_buff*)$arg2, $arg3, $arg4, (const void*)$arg5, $arg6, $arg7, $arg8, $arg9)")
    public static boolean __skb_flow_dissect(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<?> target_container, Ptr<?> data, @Unsigned @OriginalName(value="__be16") short proto2, int nhoff, int hlen, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_flow_dissect_arp((const struct sk_buff*)$arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static FlowDefinitions.flow_dissect_ret __skb_flow_dissect_arp(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<?> target_container, Ptr<?> data, int nhoff, int hlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_flow_dissect_gre((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4, (const void*)$arg5, $arg6, $arg7, $arg8, $arg9)")
    public static FlowDefinitions.flow_dissect_ret __skb_flow_dissect_gre(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_dissector_key_control> key_control, Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<?> target_container, Ptr<?> data, Ptr<@Unsigned @OriginalName(value="__be16") Short> p_proto, Ptr<Integer> p_nhoff, Ptr<Integer> p_hlen, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_flow_get_ports((const struct sk_buff*)$arg1, $arg2, $arg3, (const void*)$arg4, $arg5)")
    public static @Unsigned @OriginalName(value="__be32") int __skb_flow_get_ports(Ptr<SkDefinitions.sk_buff> skb, int thoff, char ip_proto, Ptr<?> data, int hlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_get_hash_net((const struct net*)$arg1, $arg2)")
    public static void __skb_get_hash_net(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_get_hash_symmetric_net((const struct net*)$arg1, (const struct sk_buff*)$arg2)")
    public static @Unsigned int __skb_get_hash_symmetric_net(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_get_poff((const struct sk_buff*)$arg1, (const void*)$arg2, (const struct flow_keys_basic*)$arg3, $arg4)")
    public static @Unsigned int __skb_get_poff(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> data, Ptr<FlowDefinitions.flow_keys_basic> keys, int hlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_clone_tx_timestamp(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy_bits((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static int skb_copy_bits(Ptr<SkDefinitions.sk_buff> skb, int offset, Ptr<?> to, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean skb_defer_rx_timestamp(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_do_copy_data_nocache(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<IovDefinitions.iov_iter> from, String to, int copy, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_ext_del(Ptr<SkDefinitions.sk_buff> skb, skb_ext_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_flow_dissect_ct((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static void skb_flow_dissect_ct(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<?> target_container, Ptr<@Unsigned Short> ctinfo_map, @Unsigned long mapsize, boolean post_ct, @Unsigned short zone2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_flow_dissect_hash((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static void skb_flow_dissect_hash(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<?> target_container) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_flow_dissect_meta((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static void skb_flow_dissect_meta(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<?> target_container) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_flow_dissect_tunnel_info((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static void skb_flow_dissect_tunnel_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<?> target_container) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_flow_dissector_init($arg1, (const struct flow_dissector_key*)$arg2, $arg3)")
    public static void skb_flow_dissector_init(Ptr<FlowDefinitions.flow_dissector> flow_dissector2, Ptr<FlowDefinitions.flow_dissector_key> key2, @Unsigned int key_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_flow_get_icmp_tci((const struct sk_buff*)$arg1, $arg2, (const void*)$arg3, $arg4, $arg5)")
    public static void skb_flow_get_icmp_tci(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_dissector_key_icmp> key_icmp, Ptr<?> data, int thoff, int hlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_get_hash_perturb((const struct sk_buff*)$arg1, (const struct {\n  long long unsigned int key[2];\n}*)$arg2)")
    public static @Unsigned int skb_get_hash_perturb(Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.siphash_key_t> perturb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_get_poff((const struct sk_buff*)$arg1)")
    public static @Unsigned int skb_get_poff(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short __skb_gro_checksum_complete(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_udp_tunnel_segment($arg1, $arg2, (struct sk_buff* (*)(struct sk_buff*, long long unsigned int))$arg3, $arg4, $arg5)")
    public static Ptr<SkDefinitions.sk_buff> __skb_udp_tunnel_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features, Ptr<?> gso_inner_segment, @Unsigned @OriginalName(value="__be16") short new_protocol, boolean is_ipv6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy_to_linear_data($arg1, (const void*)$arg2, (const unsigned int)$arg3)")
    public static void skb_copy_to_linear_data(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> from, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_frag_unref(Ptr<SkDefinitions.sk_buff> skb, int f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_gro_receive(Ptr<SkDefinitions.sk_buff> p, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_gro_receive_list(Ptr<SkDefinitions.sk_buff> p, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_metadata_dst_cmp((const struct sk_buff*)$arg1, (const struct sk_buff*)$arg2)")
    public static int skb_metadata_dst_cmp(Ptr<SkDefinitions.sk_buff> skb_a, Ptr<SkDefinitions.sk_buff> skb_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_orphan_partial(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean skb_page_frag_refill(@Unsigned int sz, Ptr<PageDefinitions.page_frag> pfrag, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_page_unref(@Unsigned @OriginalName(value="netmem_ref") long netmem, boolean recycle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_put_data($arg1, (const void*)$arg2, $arg3)")
    public static Ptr<?> skb_put_data(Ptr<SkDefinitions.sk_buff> skb, Ptr<?> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_set_owner_w(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_still_in_host_queue($arg1, (const struct sk_buff*)$arg2)")
    public static boolean skb_still_in_host_queue(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_tunnel_check_pmtu(Ptr<SkDefinitions.sk_buff> skb, Ptr<DstDefinitions.dst_entry> encap_dst, int headroom, boolean reply) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_udp_tunnel_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features, boolean is_ipv6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_checksum((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4, (const struct skb_checksum_ops*)$arg5)")
    public static @Unsigned @OriginalName(value="__wsum") int __skb_checksum(Ptr<SkDefinitions.sk_buff> skb, int offset, int len, @Unsigned @OriginalName(value="__wsum") int csum, Ptr<skb_checksum_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short __skb_checksum_complete(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short __skb_checksum_complete_head(Ptr<SkDefinitions.sk_buff> skb, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __skb_clone(Ptr<SkDefinitions.sk_buff> n, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __skb_complete_tx_timestamp(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk, int tstype, boolean opt_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<skb_ext> __skb_ext_alloc(@Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __skb_ext_del(Ptr<SkDefinitions.sk_buff> skb, skb_ext_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __skb_ext_put(Ptr<skb_ext> ext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __skb_ext_set(Ptr<SkDefinitions.sk_buff> skb, skb_ext_id id, Ptr<skb_ext> ext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __skb_gso_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features, boolean tx_path) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __skb_pad(Ptr<SkDefinitions.sk_buff> skb, int pad, boolean free_on_error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __skb_send_sock(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int offset, int len, @OriginalName(value="sendmsg_func") Ptr<?> sendmsg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __skb_to_sgvec(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.scatterlist> sg2, int offset, int len, @Unsigned int recursion_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_tstamp_tx($arg1, (const struct sk_buff*)$arg2, $arg3, $arg4, $arg5)")
    public static void __skb_tstamp_tx(Ptr<SkDefinitions.sk_buff> orig_skb, Ptr<SkDefinitions.sk_buff> ack_skb, Ptr<skb_shared_hwtstamps> hwtstamps, Ptr<runtime.sock> sk, int tstype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __skb_unclone_keeptruesize(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="gfp_t") int pri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __skb_vlan_pop(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Short> vlan_tci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_warn_lro_forwarding((const struct sk_buff*)$arg1)")
    public static void __skb_warn_lro_forwarding(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __skb_zcopy_downgrade_managed(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_abort_seq_read(Ptr<skb_seq_state> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_add_rx_frag_netmem(Ptr<SkDefinitions.sk_buff> skb, int i, @Unsigned @OriginalName(value="netmem_ref") long netmem, int off, int size, @Unsigned int truesize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_append(Ptr<SkDefinitions.sk_buff> old, Ptr<SkDefinitions.sk_buff> newsk, Ptr<SkDefinitions.sk_buff_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_append_pagefrags(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.page> page2, int offset, @Unsigned long size, @Unsigned long max_frags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_attempt_defer_free(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_checksum((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="__wsum") int skb_checksum(Ptr<SkDefinitions.sk_buff> skb, int offset, int len, @Unsigned @OriginalName(value="__wsum") int csum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_checksum_help(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_checksum_setup(Ptr<SkDefinitions.sk_buff> skb, boolean recalculate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="__sum16") Short> skb_checksum_setup_ip(Ptr<SkDefinitions.sk_buff> skb, int proto2, @Unsigned int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_checksum_setup_ipv6(Ptr<SkDefinitions.sk_buff> skb, boolean recalculate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_checksum_trimmed($arg1, $arg2, (short unsigned int (*)(struct sk_buff*))$arg3)")
    public static Ptr<SkDefinitions.sk_buff> skb_checksum_trimmed(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int transport_len, Ptr<?> skb_chkf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_clone(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_clone_fraglist(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_clone_sk(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_coalesce_rx_frag(Ptr<SkDefinitions.sk_buff> skb, int i, int size, @Unsigned int truesize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_complete_tx_timestamp(Ptr<SkDefinitions.sk_buff> skb, Ptr<skb_shared_hwtstamps> hwtstamps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_complete_wifi_ack(Ptr<SkDefinitions.sk_buff> skb, boolean acked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_condense(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy((const struct sk_buff*)$arg1, $arg2)")
    public static Ptr<SkDefinitions.sk_buff> skb_copy(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy_and_csum_bits((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned @OriginalName(value="__wsum") int skb_copy_and_csum_bits(Ptr<SkDefinitions.sk_buff> skb, int offset, Ptr<Character> to, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy_and_csum_dev((const struct sk_buff*)$arg1, $arg2)")
    public static void skb_copy_and_csum_dev(Ptr<SkDefinitions.sk_buff> skb, Ptr<Character> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy_expand((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<SkDefinitions.sk_buff> skb_copy_expand(Ptr<SkDefinitions.sk_buff> skb, int newheadroom, int newtailroom, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy_header($arg1, (const struct sk_buff*)$arg2)")
    public static void skb_copy_header(Ptr<SkDefinitions.sk_buff> _new, Ptr<SkDefinitions.sk_buff> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_copy_seq_read(Ptr<skb_seq_state> st2, int offset, Ptr<?> to, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_copy_ubufs(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_cow_data(Ptr<SkDefinitions.sk_buff> skb, int tailbits, Ptr<Ptr<SkDefinitions.sk_buff>> trailer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_cow_data_for_xdp(Ptr<PageDefinitions.page_pool> pool, Ptr<Ptr<SkDefinitions.sk_buff>> pskb, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_crc32c_csum_help(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_csum_hwoffload_help($arg1, (const long long unsigned int)$arg2)")
    public static int skb_csum_hwoffload_help(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_dequeue(Ptr<SkDefinitions.sk_buff_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_dequeue_tail(Ptr<SkDefinitions.sk_buff_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_dump((const u8*)$arg1, (const struct sk_buff*)$arg2, $arg3)")
    public static void skb_dump(String level, Ptr<SkDefinitions.sk_buff> skb, boolean full_pkt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_ensure_writable(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int write_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_ensure_writable_head_tail(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_errqueue_purge(Ptr<SkDefinitions.sk_buff_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_eth_gso_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features, @Unsigned @OriginalName(value="__be16") short type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_eth_pop(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_eth_push($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int skb_eth_push(Ptr<SkDefinitions.sk_buff> skb, String dst, String src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_expand_head(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int headroom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> skb_ext_add(Ptr<SkDefinitions.sk_buff> skb, skb_ext_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<skb_ext> skb_ext_maybe_cow(Ptr<skb_ext> old, @Unsigned int old_active) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int skb_find_text(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int from, @Unsigned int to, Ptr<misc.ts_config> config) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_free_head(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_gso_transport_seglen((const struct sk_buff*)$arg1)")
    public static @Unsigned int skb_gso_transport_seglen(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_gso_validate_mac_len((const struct sk_buff*)$arg1, $arg2)")
    public static boolean skb_gso_validate_mac_len(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_gso_validate_network_len((const struct sk_buff*)$arg1, $arg2)")
    public static boolean skb_gso_validate_network_len(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_headers_offset_update(Ptr<SkDefinitions.sk_buff> skb, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_mac_gso_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_morph(Ptr<SkDefinitions.sk_buff> dst, Ptr<SkDefinitions.sk_buff> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_mpls_dec_ttl(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_mpls_pop(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be16") short next_proto, int mac_len, boolean ethernet) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_mpls_push(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int mpls_lse, @Unsigned @OriginalName(value="__be16") short mpls_proto, int mac_len, boolean ethernet) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_mpls_update_lse(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int mpls_lse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be16") short skb_network_protocol(Ptr<SkDefinitions.sk_buff> skb, Ptr<Integer> depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_panic($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void skb_panic(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int sz, Ptr<?> addr2, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean skb_partial_csum_set(Ptr<SkDefinitions.sk_buff> skb, @Unsigned short start, @Unsigned short off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_pp_cow_data(Ptr<PageDefinitions.page_pool> pool, Ptr<Ptr<SkDefinitions.sk_buff>> pskb, @Unsigned int headroom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_pp_frag_ref(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_prepare_seq_read(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int from, @Unsigned int to, Ptr<skb_seq_state> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> skb_pull(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> skb_pull_data(Ptr<SkDefinitions.sk_buff> skb, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> skb_pull_rcsum(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> skb_push(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> skb_put(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_queue_head(Ptr<SkDefinitions.sk_buff_head> list, Ptr<SkDefinitions.sk_buff> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_queue_purge_reason(Ptr<SkDefinitions.sk_buff_head> list, skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_queue_tail(Ptr<SkDefinitions.sk_buff_head> list, Ptr<SkDefinitions.sk_buff> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int skb_rbtree_purge(Ptr<RbDefinitions.rb_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_realloc_headroom(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int headroom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_recv_done(Ptr<runtime.virtqueue> rvq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_release_data(Ptr<SkDefinitions.sk_buff> skb, skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_release_head_state(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_reorder_vlan_header(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_scrub_packet(Ptr<SkDefinitions.sk_buff> skb, boolean xnet) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_segment(Ptr<SkDefinitions.sk_buff> head_skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_segment_list(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_send_sock(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int offset, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_send_sock_locked(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int offset, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_seq_read($arg1, (const u8**)$arg2, $arg3)")
    public static @Unsigned int skb_seq_read(@Unsigned int consumed, Ptr<Ptr<Character>> data, Ptr<skb_seq_state> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_shift(Ptr<SkDefinitions.sk_buff> tgt, Ptr<SkDefinitions.sk_buff> skb, int shiftlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_splice_bits(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk, @Unsigned int offset, Ptr<PipeDefinitions.pipe_inode_info> pipe2, @Unsigned int tlen, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long skb_splice_from_iter(Ptr<SkDefinitions.sk_buff> skb, Ptr<IovDefinitions.iov_iter> iter2, @OriginalName(value="ssize_t") long maxsize, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_split($arg1, $arg2, (const unsigned int)$arg3)")
    public static void skb_split(Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff> skb1, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_store_bits($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int skb_store_bits(Ptr<SkDefinitions.sk_buff> skb, int offset, Ptr<?> from, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_to_sgvec(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.scatterlist> sg2, int offset, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_to_sgvec_nomark(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.scatterlist> sg2, int offset, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_trim(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean skb_try_coalesce(Ptr<SkDefinitions.sk_buff> to, Ptr<SkDefinitions.sk_buff> from, Ptr<@OriginalName(value="bool") Boolean> fragstolen, Ptr<Integer> delta_truesize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_ts_finish(Ptr<misc.ts_config> conf, Ptr<misc.ts_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_ts_get_next_block($arg1, (const u8**)$arg2, $arg3, $arg4)")
    public static @Unsigned int skb_ts_get_next_block(@Unsigned int offset, Ptr<Ptr<Character>> text, Ptr<misc.ts_config> conf, Ptr<misc.ts_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_tstamp_tx(Ptr<SkDefinitions.sk_buff> orig_skb, Ptr<skb_shared_hwtstamps> hwtstamps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_tx_error(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_unlink(Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff_head> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_vlan_pop(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_vlan_push(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be16") short vlan_proto, @Unsigned short vlan_tci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_vlan_untag(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_warn_bad_offload((const struct sk_buff*)$arg1)")
    public static void skb_warn_bad_offload(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_xmit_done(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_zerocopy(Ptr<SkDefinitions.sk_buff> to, Ptr<SkDefinitions.sk_buff> from, int len, int hlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_zerocopy_clone(Ptr<SkDefinitions.sk_buff> nskb, Ptr<SkDefinitions.sk_buff> orig, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_zerocopy_headlen((const struct sk_buff*)$arg1)")
    public static @Unsigned int skb_zerocopy_headlen(Ptr<SkDefinitions.sk_buff> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_zerocopy_iter_stream(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.msghdr> msg, int len, Ptr<misc.ubuf_info> uarg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_datagram_iter((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4, $arg5, (long unsigned int (*)(const void*, long unsigned int, void*, struct iov_iter*))$arg6, $arg7)")
    public static int __skb_datagram_iter(Ptr<SkDefinitions.sk_buff> skb, int offset, Ptr<IovDefinitions.iov_iter> to, int len, boolean fault_short, Ptr<?> cb, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __skb_recv_datagram(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff_head> sk_queue, @Unsigned int flags, Ptr<Integer> off, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __skb_recv_udp(Ptr<runtime.sock> sk, @Unsigned int flags, Ptr<Integer> off, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __skb_try_recv_datagram(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff_head> queue, @Unsigned int flags, Ptr<Integer> off, Ptr<Integer> err, Ptr<Ptr<SkDefinitions.sk_buff>> last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __skb_try_recv_from_queue(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff_head> queue, @Unsigned int flags, Ptr<Integer> off, Ptr<Integer> err, Ptr<Ptr<SkDefinitions.sk_buff>> last) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__skb_wait_for_more_packets($arg1, $arg2, $arg3, $arg4, (const struct sk_buff*)$arg5)")
    public static int __skb_wait_for_more_packets(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff_head> queue, Ptr<Integer> err, Ptr<Long> timeo_p, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_consume_udp(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_copy_and_csum_datagram_msg(Ptr<SkDefinitions.sk_buff> skb, int hlen, Ptr<runtime.msghdr> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy_and_hash_datagram_iter((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int skb_copy_and_hash_datagram_iter(Ptr<SkDefinitions.sk_buff> skb, int offset, Ptr<IovDefinitions.iov_iter> to, int len, Ptr<misc.ahash_request> hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_copy_datagram_from_iter(Ptr<SkDefinitions.sk_buff> skb, int offset, Ptr<IovDefinitions.iov_iter> from, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skb_copy_datagram_iter((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static int skb_copy_datagram_iter(Ptr<SkDefinitions.sk_buff> skb, int offset, Ptr<IovDefinitions.iov_iter> to, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_do_redirect(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void skb_free_datagram(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skb_kill_datagram(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> skb_recv_datagram(Ptr<runtime.sock> sk, @Unsigned int flags, Ptr<Integer> err) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct skb_free_array")
    @NotUsableInJava
    public static class skb_free_array
    extends Struct {
        public @Unsigned int skb_count;
        public Ptr<?> @Size(value=16) [] skb_array;
    }

    @Type(noCCodeGeneration=true, cType="enum skb_drop_reason_subsys")
    public static enum skb_drop_reason_subsys implements Enum<skb_drop_reason_subsys>,
    TypedEnum<skb_drop_reason_subsys, Integer>
    {
        SKB_DROP_REASON_SUBSYS_CORE,
        SKB_DROP_REASON_SUBSYS_MAC80211_UNUSABLE,
        SKB_DROP_REASON_SUBSYS_MAC80211_MONITOR,
        SKB_DROP_REASON_SUBSYS_OPENVSWITCH,
        SKB_DROP_REASON_SUBSYS_NUM;

    }

    @Type(noCCodeGeneration=true, cType="struct skb_checksum_ops")
    @NotUsableInJava
    public static class skb_checksum_ops
    extends Struct {
        public Ptr<?> update;
        public Ptr<?> combine;
    }

    @Type(noCCodeGeneration=true, cType="struct skb_seq_state")
    @NotUsableInJava
    public static class skb_seq_state
    extends Struct {
        public @Unsigned int lower_offset;
        public @Unsigned int upper_offset;
        public @Unsigned int frag_idx;
        public @Unsigned int stepped_offset;
        public Ptr<SkDefinitions.sk_buff> root_skb;
        public Ptr<SkDefinitions.sk_buff> cur_skb;
        public Ptr<Character> frag_data;
        public @Unsigned int frag_off;
    }

    @Type(noCCodeGeneration=true, cType="struct skb_gso_cb")
    @NotUsableInJava
    public static class skb_gso_cb
    extends Struct {
        @InlineUnion(value=25517)
        public @InlineUnion(value=25517) int mac_offset;
        @InlineUnion(value=25517)
        public @InlineUnion(value=25517) int data_offset;
        public int encap_level;
        public @Unsigned @OriginalName(value="__wsum") int csum;
        public @Unsigned short csum_start;
    }

    @Type(noCCodeGeneration=true, cType="struct skb_array")
    @NotUsableInJava
    public static class skb_array
    extends Struct {
        public misc.ptr_ring ring;
    }

    @Type(noCCodeGeneration=true, cType="enum skb_tstamp_type")
    public static enum skb_tstamp_type implements Enum<skb_tstamp_type>,
    TypedEnum<skb_tstamp_type, Integer>
    {
        SKB_CLOCK_REALTIME,
        SKB_CLOCK_MONOTONIC,
        SKB_CLOCK_TAI,
        __SKB_CLOCK_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct skb_shared_info")
    @NotUsableInJava
    public static class skb_shared_info
    extends Struct {
        public char flags;
        public char meta_len;
        public char nr_frags;
        public char tx_flags;
        public @Unsigned short gso_size;
        public @Unsigned short gso_segs;
        public Ptr<SkDefinitions.sk_buff> frag_list;
        @InlineUnion(value=14682)
        public @InlineUnion(value=14682) skb_shared_hwtstamps hwtstamps;
        @InlineUnion(value=14682)
        public  @InlineUnion(value=14682) XskDefinitions.xsk_tx_metadata_compl xsk_meta;
        public @Unsigned int gso_type;
        public @Unsigned int tskey;
        public AtomicDefinitions.atomic_t dataref;
        public @Unsigned int xdp_frags_size;
        public Ptr<?> destructor_arg;
        public @OriginalName(value="skb_frag_t") skb_frag @Size(value=17) [] frags;
    }

    @Type(noCCodeGeneration=true, cType="struct skb_frag")
    @NotUsableInJava
    public static class skb_frag
    extends Struct {
        public @Unsigned @OriginalName(value="netmem_ref") long netmem;
        public @Unsigned int len;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="enum skb_drop_reason")
    public static enum skb_drop_reason implements Enum<skb_drop_reason>,
    TypedEnum<skb_drop_reason, Integer>
    {
        SKB_NOT_DROPPED_YET,
        SKB_CONSUMED,
        SKB_DROP_REASON_NOT_SPECIFIED,
        SKB_DROP_REASON_NO_SOCKET,
        SKB_DROP_REASON_PKT_TOO_SMALL,
        SKB_DROP_REASON_TCP_CSUM,
        SKB_DROP_REASON_SOCKET_FILTER,
        SKB_DROP_REASON_UDP_CSUM,
        SKB_DROP_REASON_NETFILTER_DROP,
        SKB_DROP_REASON_OTHERHOST,
        SKB_DROP_REASON_IP_CSUM,
        SKB_DROP_REASON_IP_INHDR,
        SKB_DROP_REASON_IP_RPFILTER,
        SKB_DROP_REASON_UNICAST_IN_L2_MULTICAST,
        SKB_DROP_REASON_XFRM_POLICY,
        SKB_DROP_REASON_IP_NOPROTO,
        SKB_DROP_REASON_SOCKET_RCVBUFF,
        SKB_DROP_REASON_PROTO_MEM,
        SKB_DROP_REASON_TCP_AUTH_HDR,
        SKB_DROP_REASON_TCP_MD5NOTFOUND,
        SKB_DROP_REASON_TCP_MD5UNEXPECTED,
        SKB_DROP_REASON_TCP_MD5FAILURE,
        SKB_DROP_REASON_TCP_AONOTFOUND,
        SKB_DROP_REASON_TCP_AOUNEXPECTED,
        SKB_DROP_REASON_TCP_AOKEYNOTFOUND,
        SKB_DROP_REASON_TCP_AOFAILURE,
        SKB_DROP_REASON_SOCKET_BACKLOG,
        SKB_DROP_REASON_TCP_FLAGS,
        SKB_DROP_REASON_TCP_ABORT_ON_DATA,
        SKB_DROP_REASON_TCP_ZEROWINDOW,
        SKB_DROP_REASON_TCP_OLD_DATA,
        SKB_DROP_REASON_TCP_OVERWINDOW,
        SKB_DROP_REASON_TCP_OFOMERGE,
        SKB_DROP_REASON_TCP_RFC7323_PAWS,
        SKB_DROP_REASON_TCP_OLD_SEQUENCE,
        SKB_DROP_REASON_TCP_INVALID_SEQUENCE,
        SKB_DROP_REASON_TCP_INVALID_ACK_SEQUENCE,
        SKB_DROP_REASON_TCP_RESET,
        SKB_DROP_REASON_TCP_INVALID_SYN,
        SKB_DROP_REASON_TCP_CLOSE,
        SKB_DROP_REASON_TCP_FASTOPEN,
        SKB_DROP_REASON_TCP_OLD_ACK,
        SKB_DROP_REASON_TCP_TOO_OLD_ACK,
        SKB_DROP_REASON_TCP_ACK_UNSENT_DATA,
        SKB_DROP_REASON_TCP_OFO_QUEUE_PRUNE,
        SKB_DROP_REASON_TCP_OFO_DROP,
        SKB_DROP_REASON_IP_OUTNOROUTES,
        SKB_DROP_REASON_BPF_CGROUP_EGRESS,
        SKB_DROP_REASON_IPV6DISABLED,
        SKB_DROP_REASON_NEIGH_CREATEFAIL,
        SKB_DROP_REASON_NEIGH_FAILED,
        SKB_DROP_REASON_NEIGH_QUEUEFULL,
        SKB_DROP_REASON_NEIGH_DEAD,
        SKB_DROP_REASON_TC_EGRESS,
        SKB_DROP_REASON_SECURITY_HOOK,
        SKB_DROP_REASON_QDISC_DROP,
        SKB_DROP_REASON_CPU_BACKLOG,
        SKB_DROP_REASON_XDP,
        SKB_DROP_REASON_TC_INGRESS,
        SKB_DROP_REASON_UNHANDLED_PROTO,
        SKB_DROP_REASON_SKB_CSUM,
        SKB_DROP_REASON_SKB_GSO_SEG,
        SKB_DROP_REASON_SKB_UCOPY_FAULT,
        SKB_DROP_REASON_DEV_HDR,
        SKB_DROP_REASON_DEV_READY,
        SKB_DROP_REASON_FULL_RING,
        SKB_DROP_REASON_NOMEM,
        SKB_DROP_REASON_HDR_TRUNC,
        SKB_DROP_REASON_TAP_FILTER,
        SKB_DROP_REASON_TAP_TXFILTER,
        SKB_DROP_REASON_ICMP_CSUM,
        SKB_DROP_REASON_INVALID_PROTO,
        SKB_DROP_REASON_IP_INADDRERRORS,
        SKB_DROP_REASON_IP_INNOROUTES,
        SKB_DROP_REASON_PKT_TOO_BIG,
        SKB_DROP_REASON_DUP_FRAG,
        SKB_DROP_REASON_FRAG_REASM_TIMEOUT,
        SKB_DROP_REASON_FRAG_TOO_FAR,
        SKB_DROP_REASON_TCP_MINTTL,
        SKB_DROP_REASON_IPV6_BAD_EXTHDR,
        SKB_DROP_REASON_IPV6_NDISC_FRAG,
        SKB_DROP_REASON_IPV6_NDISC_HOP_LIMIT,
        SKB_DROP_REASON_IPV6_NDISC_BAD_CODE,
        SKB_DROP_REASON_IPV6_NDISC_BAD_OPTIONS,
        SKB_DROP_REASON_IPV6_NDISC_NS_OTHERHOST,
        SKB_DROP_REASON_QUEUE_PURGE,
        SKB_DROP_REASON_TC_COOKIE_ERROR,
        SKB_DROP_REASON_PACKET_SOCK_ERROR,
        SKB_DROP_REASON_TC_CHAIN_NOTFOUND,
        SKB_DROP_REASON_TC_RECLASSIFY_LOOP,
        SKB_DROP_REASON_MAX,
        SKB_DROP_REASON_SUBSYS_MASK;

    }

    @Type(noCCodeGeneration=true, cType="struct skb_shared_hwtstamps")
    @NotUsableInJava
    public static class skb_shared_hwtstamps
    extends Struct {
        @InlineUnion(value=5528)
        public @InlineUnion(value=5528) @OriginalName(value="ktime_t") long hwtstamp;
        @InlineUnion(value=5528)
        public @InlineUnion(value=5528) Ptr<?> netdev_data;
    }

    @Type(noCCodeGeneration=true, cType="enum skb_ext_id")
    public static enum skb_ext_id implements Enum<skb_ext_id>,
    TypedEnum<skb_ext_id, Integer>
    {
        SKB_EXT_BRIDGE_NF,
        SKB_EXT_SEC_PATH,
        TC_SKB_EXT,
        SKB_EXT_MPTCP,
        SKB_EXT_NUM;

    }

    @Type(noCCodeGeneration=true, cType="struct skb_ext")
    @NotUsableInJava
    public static class skb_ext
    extends Struct {
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public char @Size(value=4) [] offset;
        public char chunks;
        public char @Size(value=0) [] data;
    }
}

