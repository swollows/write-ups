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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ArpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_accept(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int sip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_constructor(Ptr<runtime.neighbour> neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arp_create($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, (const u8*)$arg7, (const u8*)$arg8)")
    public static Ptr<SkDefinitions.sk_buff> arp_create(int type2, int ptype, @Unsigned @OriginalName(value="__be32") int dest_ip, Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int src_ip, String dest_hw, String src_hw, String target_hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arp_error_report(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arp_format_neigh_entry(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.neighbour> n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arp_hash((const void*)$arg1, (const struct net_device*)$arg2, $arg3)")
    public static @Unsigned int arp_hash(Ptr<?> pkey, Ptr<NetDefinitions.net_device> dev, Ptr<@Unsigned Integer> hash_rnd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arp_ifdown(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_ignore(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int sip, @Unsigned @OriginalName(value="__be32") int tip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_invalidate(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int ip, boolean force) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_ioctl(Ptr<runtime.net> net2, @Unsigned int cmd, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arp_is_multicast((const void*)$arg1)")
    public static int arp_is_multicast(Ptr<?> pkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arp_key_eq((const struct neighbour*)$arg1, (const void*)$arg2)")
    public static boolean arp_key_eq(Ptr<runtime.neighbour> neigh, Ptr<?> pkey) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_mc_map(@Unsigned @OriginalName(value="__be32") int addr2, Ptr<Character> haddr, Ptr<NetDefinitions.net_device> dev, int dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arp_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_netdev_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_process(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_rcv(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<PacketDefinitions.packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> arp_req_dev(Ptr<runtime.net> net2, Ptr<arpreq> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> arp_req_dev_by_name(Ptr<runtime.net> net2, Ptr<arpreq> r, boolean getarp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_req_get(Ptr<runtime.net> net2, Ptr<arpreq> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_req_set(Ptr<runtime.net> net2, Ptr<arpreq> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arp_send($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, (const u8*)$arg7, (const u8*)$arg8)")
    public static void arp_send(int type2, int ptype, @Unsigned @OriginalName(value="__be32") int dest_ip, Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int src_ip, String dest_hw, String src_hw, String target_hw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="arp_send_dst($arg1, $arg2, $arg3, $arg4, $arg5, (const u8*)$arg6, (const u8*)$arg7, (const u8*)$arg8, $arg9)")
    public static void arp_send_dst(int type2, int ptype, @Unsigned @OriginalName(value="__be32") int dest_ip, Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int src_ip, String dest_hw, String src_hw, String target_hw, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> arp_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arp_solicit(Ptr<runtime.neighbour> neigh, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void arp_xmit(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int arp_xmit_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct arpreq")
    @NotUsableInJava
    public static class arpreq
    extends Struct {
        public runtime.sockaddr arp_pa;
        public runtime.sockaddr arp_ha;
        public int arp_flags;
        public runtime.sockaddr arp_netmask;
        public char @Size(value=16) [] arp_dev;
    }
}

