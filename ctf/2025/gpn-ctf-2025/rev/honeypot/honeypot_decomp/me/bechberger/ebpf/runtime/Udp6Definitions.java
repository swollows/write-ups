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
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.UdpDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Udp6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp6_csum_init(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.udphdr> uh, int proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp6_set_csum($arg1, $arg2, (const struct in6_addr*)$arg3, (const struct in6_addr*)$arg4, $arg5)")
    public static void udp6_set_csum(boolean nocheck, Ptr<SkDefinitions.sk_buff> skb, Ptr<In6Definitions.in6_addr> saddr, Ptr<In6Definitions.in6_addr> daddr, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __udp6_lib_err(Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_skb_parm> opt, char type2, char code2, int offset, @Unsigned @OriginalName(value="__be32") int info2, Ptr<UdpDefinitions.udp_table> udptable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__udp6_lib_lookup((const struct net*)$arg1, (const struct in6_addr*)$arg2, $arg3, (const struct in6_addr*)$arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<runtime.sock> __udp6_lib_lookup(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned @OriginalName(value="__be16") short dport, int dif, int sdif, Ptr<UdpDefinitions.udp_table> udptable, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__udp6_lib_mcast_deliver($arg1, $arg2, (const struct in6_addr*)$arg3, (const struct in6_addr*)$arg4, $arg5, $arg6)")
    public static int __udp6_lib_mcast_deliver(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<In6Definitions.in6_addr> saddr, Ptr<In6Definitions.in6_addr> daddr, Ptr<UdpDefinitions.udp_table> udptable, int proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __udp6_lib_rcv(Ptr<SkDefinitions.sk_buff> skb, Ptr<UdpDefinitions.udp_table> udptable, int proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp6_ehashfn((const struct net*)$arg1, (const struct in6_addr*)$arg2, (const short unsigned int)$arg3, (const struct in6_addr*)$arg4, (const short unsigned int)$arg5)")
    public static @Unsigned int udp6_ehashfn(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> laddr, @Unsigned short lport, Ptr<In6Definitions.in6_addr> faddr, @Unsigned @OriginalName(value="__be16") short fport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp6_gro_complete(Ptr<SkDefinitions.sk_buff> skb, int nhoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> udp6_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp6_lib_lookup((const struct net*)$arg1, (const struct in6_addr*)$arg2, $arg3, (const struct in6_addr*)$arg4, $arg5, $arg6)")
    public static Ptr<runtime.sock> udp6_lib_lookup(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned @OriginalName(value="__be16") short dport, int dif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp6_lib_lookup2((const struct net*)$arg1, (const struct in6_addr*)$arg2, $arg3, (const struct in6_addr*)$arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<runtime.sock> udp6_lib_lookup2(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned int hnum, int dif, int sdif, Ptr<UdpDefinitions.udp_hslot> hslot2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp6_lib_lookup_skb((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.sock> udp6_lib_lookup_skb(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be16") short dport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp6_proc_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp6_proc_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp6_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> udp6_ufo_fragment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp6_unicast_rcv_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.udphdr> uh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct udp6_sock")
    @NotUsableInJava
    public static class udp6_sock
    extends Struct {
        public UdpDefinitions.udp_sock udp;
        public Ipv6Definitions.ipv6_pinfo inet6;
    }
}

