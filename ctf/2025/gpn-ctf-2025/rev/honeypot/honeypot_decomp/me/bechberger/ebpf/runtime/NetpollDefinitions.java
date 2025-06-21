/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class NetpollDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netpoll_cleanup(Ptr<runtime.netpoll> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __netpoll_free(Ptr<runtime.netpoll> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx __netpoll_send_skb(Ptr<runtime.netpoll> np, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __netpoll_setup(Ptr<runtime.netpoll> np, Ptr<NetDefinitions.net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netpoll_cleanup(Ptr<runtime.netpoll> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netpoll_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netpoll_parse_ip_addr((const u8*)$arg1, $arg2)")
    public static int netpoll_parse_ip_addr(String str, Ptr<InetDefinitions.inet_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netpoll_parse_options(Ptr<runtime.netpoll> np, String opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netpoll_poll_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netpoll_poll_disable(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netpoll_poll_enable(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netpoll_print_options(Ptr<runtime.netpoll> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx netpoll_send_skb(Ptr<runtime.netpoll> np, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netpoll_send_udp($arg1, (const u8*)$arg2, $arg3)")
    public static void netpoll_send_udp(Ptr<runtime.netpoll> np, String msg, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netpoll_setup(Ptr<runtime.netpoll> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx netpoll_start_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<NetdevDefinitions.netdev_queue> txq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct netpoll_info")
    @NotUsableInJava
    public static class netpoll_info
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public runtime.semaphore dev_lock;
        public SkDefinitions.sk_buff_head txq;
        public DelayedDefinitions.delayed_work tx_work;
        public Ptr<runtime.netpoll> netpoll;
        public misc.callback_head rcu;
    }
}

