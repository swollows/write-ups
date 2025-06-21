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
import me.bechberger.ebpf.runtime.CommonDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Ipv4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_frags_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv4_frags_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_frags_pre_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_fwd_update_priority((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ipv4_fwd_update_priority(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_local_port_range((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ipv4_local_port_range(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_mib_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv4_mib_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv4_offload_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_ping_group_range((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ipv4_ping_group_range(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_privileged_ports((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ipv4_privileged_ports(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_sysctl_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv4_sysctl_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_doint_and_flush((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ipv4_doint_and_flush(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ipv4_sk_update_pmtu(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> ipv4_blackhole_route(Ptr<runtime.net> net2, Ptr<DstDefinitions.dst_entry> dst_orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_confirm_neigh((const struct dst_entry*)$arg1, (const void*)$arg2)")
    public static void ipv4_confirm_neigh(Ptr<DstDefinitions.dst_entry> dst, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Integer> ipv4_cow_metrics(Ptr<DstDefinitions.dst_entry> dst, @Unsigned long old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_default_advmss((const struct dst_entry*)$arg1)")
    public static @Unsigned int ipv4_default_advmss(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> ipv4_dst_check(Ptr<DstDefinitions.dst_entry> dst, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_dst_destroy(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_inetpeer_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv4_inetpeer_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_link_failure(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_mtu((const struct dst_entry*)$arg1)")
    public static @Unsigned int ipv4_mtu(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_negative_advice(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_neigh_lookup((const struct dst_entry*)$arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.neighbour> ipv4_neigh_lookup(Ptr<DstDefinitions.dst_entry> dst, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_redirect(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2, int oif, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_send_dest_unreach(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_sk_redirect(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_sk_update_pmtu(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv4_skb_to_auditdata(Ptr<SkDefinitions.sk_buff> skb, Ptr<CommonDefinitions.common_audit_data> ad, Ptr<Character> proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_sysctl_rtcache_flush((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ipv4_sysctl_rtcache_flush(Ptr<misc.ctl_table> __ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv4_update_pmtu(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2, @Unsigned int mtu, int oif, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv4_pktinfo_prepare((const struct sock*)$arg1, $arg2, $arg3)")
    public static void ipv4_pktinfo_prepare(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, boolean drop_dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ipv4_addr_key")
    @NotUsableInJava
    public static class ipv4_addr_key
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int addr;
        public int vif;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int src; unsigned int dst; }")
    @NotUsableInJava
    public static class ipv4_of_u_of_ip_tunnel_key
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int src;
        public @Unsigned @OriginalName(value="__be32") int dst;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv4_devconf")
    @NotUsableInJava
    public static class ipv4_devconf
    extends Struct {
        public Ptr<?> sysctl;
        public int @Size(value=33) [] data;
        public @Unsigned long @Size(value=1) [] state;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int saddr; unsigned int daddr; short unsigned int sport; short unsigned int dport; }")
    @NotUsableInJava
    public static class ipv4_of_anon_member_of_bpf_sock_tuple
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int saddr;
        public @Unsigned @OriginalName(value="__be32") int daddr;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public @Unsigned @OriginalName(value="__be16") short dport;
    }
}

