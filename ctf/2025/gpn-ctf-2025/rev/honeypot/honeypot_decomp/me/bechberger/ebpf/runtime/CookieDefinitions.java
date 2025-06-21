/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TcpDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class CookieDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__cookie_v4_check((const struct iphdr*)$arg1, (const struct tcphdr*)$arg2)")
    public static int __cookie_v4_check(Ptr<runtime.iphdr> iph, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cookie_v4_init_sequence((const struct iphdr*)$arg1, (const struct tcphdr*)$arg2, $arg3)")
    public static @Unsigned int __cookie_v4_init_sequence(Ptr<runtime.iphdr> iph, Ptr<runtime.tcphdr> th, Ptr<@Unsigned Short> mssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RequestDefinitions.request_sock> cookie_bpf_check(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long cookie_init_timestamp(Ptr<RequestDefinitions.request_sock> req2, @Unsigned long now) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cookie_tcp_reqsk_alloc((const struct request_sock_ops*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static Ptr<RequestDefinitions.request_sock> cookie_tcp_reqsk_alloc(Ptr<RequestDefinitions.request_sock_ops> ops, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<TcpDefinitions.tcp_options_received> tcp_opt, int mss, @Unsigned int tsoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cookie_tcp_reqsk_init(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cookie_timestamp_decode((const struct net*)$arg1, $arg2)")
    public static boolean cookie_timestamp_decode(Ptr<runtime.net> net2, Ptr<TcpDefinitions.tcp_options_received> tcp_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> cookie_v4_check(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cookie_v4_init_sequence((const struct sk_buff*)$arg1, $arg2)")
    public static @Unsigned int cookie_v4_init_sequence(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Short> mssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cookie_v6_check((const struct ipv6hdr*)$arg1, (const struct tcphdr*)$arg2)")
    public static int __cookie_v6_check(Ptr<runtime.ipv6hdr> iph, Ptr<runtime.tcphdr> th) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__cookie_v6_init_sequence((const struct ipv6hdr*)$arg1, (const struct tcphdr*)$arg2, $arg3)")
    public static @Unsigned int __cookie_v6_init_sequence(Ptr<runtime.ipv6hdr> iph, Ptr<runtime.tcphdr> th, Ptr<@Unsigned Short> mssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> cookie_v6_check(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cookie_v6_init_sequence((const struct sk_buff*)$arg1, $arg2)")
    public static @Unsigned int cookie_v6_init_sequence(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Short> mssp) {
        throw new MethodIsBPFRelatedFunction();
    }
}

