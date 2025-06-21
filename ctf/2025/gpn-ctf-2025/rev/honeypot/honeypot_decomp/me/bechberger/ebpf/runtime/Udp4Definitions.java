/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.UdpDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class Udp4Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp4_gro_complete(Ptr<SkDefinitions.sk_buff> skb, int nhoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> udp4_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> udp4_ufo_fragment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __udp4_lib_err(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int info2, Ptr<UdpDefinitions.udp_table> udptable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__udp4_lib_lookup((const struct net*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<runtime.sock> __udp4_lib_lookup(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be16") short dport, int dif, int sdif, Ptr<UdpDefinitions.udp_table> udptable, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __udp4_lib_mcast_deliver(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.udphdr> uh, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be32") int daddr, Ptr<UdpDefinitions.udp_table> udptable, int proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __udp4_lib_rcv(Ptr<SkDefinitions.sk_buff> skb, Ptr<UdpDefinitions.udp_table> udptable, int proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp4_csum_init(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.udphdr> uh, int proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp4_hwcsum(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int src, @Unsigned @OriginalName(value="__be32") int dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp4_lib_lookup((const struct net*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<runtime.sock> udp4_lib_lookup(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be16") short dport, int dif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp4_lib_lookup2((const struct net*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<runtime.sock> udp4_lib_lookup2(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned int hnum, int dif, int sdif, Ptr<UdpDefinitions.udp_hslot> hslot2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="udp4_lib_lookup_skb((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.sock> udp4_lib_lookup_skb(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be16") short dport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp4_proc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void udp4_proc_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp4_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp4_proc_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int udp4_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }
}

