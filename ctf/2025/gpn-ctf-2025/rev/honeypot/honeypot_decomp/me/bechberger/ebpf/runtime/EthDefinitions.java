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
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class EthDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void eth_commit_mac_addr_change(Ptr<NetDefinitions.net_device> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eth_get_headlen((const struct net_device*)$arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned int eth_get_headlen(Ptr<NetDefinitions.net_device> dev, Ptr<?> data, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eth_gro_complete(Ptr<SkDefinitions.sk_buff> skb, int nhoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> eth_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eth_header($arg1, $arg2, $arg3, (const void*)$arg4, (const void*)$arg5, $arg6)")
    public static int eth_header(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned short type2, Ptr<?> daddr, Ptr<?> saddr, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eth_header_cache((const struct neighbour*)$arg1, $arg2, $arg3)")
    public static int eth_header_cache(Ptr<runtime.neighbour> neigh, Ptr<misc.hh_cache> hh, @Unsigned @OriginalName(value="__be16") short type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eth_header_cache_update($arg1, (const struct net_device*)$arg2, (const u8*)$arg3)")
    public static void eth_header_cache_update(Ptr<misc.hh_cache> hh, Ptr<NetDefinitions.net_device> dev, String haddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eth_header_parse((const struct sk_buff*)$arg1, $arg2)")
    public static int eth_header_parse(Ptr<SkDefinitions.sk_buff> skb, String haddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eth_header_parse_protocol((const struct sk_buff*)$arg1)")
    public static @Unsigned @OriginalName(value="__be16") short eth_header_parse_protocol(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eth_mac_addr(Ptr<NetDefinitions.net_device> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eth_offload_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eth_platform_get_mac_address(Ptr<runtime.device> dev, Ptr<Character> mac_addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eth_prepare_mac_addr_change(Ptr<NetDefinitions.net_device> dev, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be16") short eth_type_trans(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eth_validate_addr(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }
}

