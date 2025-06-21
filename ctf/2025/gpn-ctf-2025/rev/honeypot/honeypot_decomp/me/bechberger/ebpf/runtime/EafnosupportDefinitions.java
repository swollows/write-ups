/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class EafnosupportDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Fib6Definitions.fib6_table> eafnosupport_fib6_get_table(Ptr<runtime.net> net2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eafnosupport_fib6_lookup(Ptr<runtime.net> net2, int oif, Ptr<runtime.flowi6> fl6, Ptr<Fib6Definitions.fib6_result> res, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eafnosupport_fib6_nh_init(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_nh> fib6_nh2, Ptr<Fib6Definitions.fib6_config> cfg, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eafnosupport_fib6_select_path((const struct net*)$arg1, $arg2, $arg3, $arg4, $arg5, (const struct sk_buff*)$arg6, $arg7)")
    public static void eafnosupport_fib6_select_path(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_result> res, Ptr<runtime.flowi6> fl6, int oif, boolean have_oif_match, Ptr<SkDefinitions.sk_buff> skb, int strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eafnosupport_fib6_table_lookup(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_table> table, int oif, Ptr<runtime.flowi6> fl6, Ptr<Fib6Definitions.fib6_result> res, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eafnosupport_ip6_del_rt(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_info> rt, boolean skip_notify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eafnosupport_ip6_mtu_from_fib6((const struct fib6_result*)$arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static @Unsigned int eafnosupport_ip6_mtu_from_fib6(Ptr<Fib6Definitions.fib6_result> res, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eafnosupport_ipv6_dev_find($arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static Ptr<NetDefinitions.net_device> eafnosupport_ipv6_dev_find(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eafnosupport_ipv6_dst_lookup_flow($arg1, (const struct sock*)$arg2, $arg3, (const struct in6_addr*)$arg4)")
    public static Ptr<DstDefinitions.dst_entry> eafnosupport_ipv6_dst_lookup_flow(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, Ptr<In6Definitions.in6_addr> final_dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="eafnosupport_ipv6_fragment($arg1, $arg2, $arg3, (int (*)(struct net*, struct sock*, struct sk_buff*))$arg4)")
    public static int eafnosupport_ipv6_fragment(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int eafnosupport_ipv6_route_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }
}

