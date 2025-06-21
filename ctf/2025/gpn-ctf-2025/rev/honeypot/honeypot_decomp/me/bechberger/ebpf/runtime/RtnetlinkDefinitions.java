/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class RtnetlinkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.nlmsghdr> rtnetlink_ifinfo_prep(Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnetlink_bind(Ptr<runtime.net> net2, int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnetlink_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnetlink_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnetlink_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnetlink_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnetlink_put_metrics(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> metrics) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnetlink_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnetlink_rcv_msg(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnetlink_send(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2, @Unsigned int pid2, @Unsigned int group, int echo2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum rtnetlink_groups")
    public static enum rtnetlink_groups implements Enum<rtnetlink_groups>,
    TypedEnum<rtnetlink_groups, Integer>
    {
        RTNLGRP_NONE,
        RTNLGRP_LINK,
        RTNLGRP_NOTIFY,
        RTNLGRP_NEIGH,
        RTNLGRP_TC,
        RTNLGRP_IPV4_IFADDR,
        RTNLGRP_IPV4_MROUTE,
        RTNLGRP_IPV4_ROUTE,
        RTNLGRP_IPV4_RULE,
        RTNLGRP_IPV6_IFADDR,
        RTNLGRP_IPV6_MROUTE,
        RTNLGRP_IPV6_ROUTE,
        RTNLGRP_IPV6_IFINFO,
        RTNLGRP_DECnet_IFADDR,
        RTNLGRP_NOP2,
        RTNLGRP_DECnet_ROUTE,
        RTNLGRP_DECnet_RULE,
        RTNLGRP_NOP4,
        RTNLGRP_IPV6_PREFIX,
        RTNLGRP_IPV6_RULE,
        RTNLGRP_ND_USEROPT,
        RTNLGRP_PHONET_IFADDR,
        RTNLGRP_PHONET_ROUTE,
        RTNLGRP_DCB,
        RTNLGRP_IPV4_NETCONF,
        RTNLGRP_IPV6_NETCONF,
        RTNLGRP_MDB,
        RTNLGRP_MPLS_ROUTE,
        RTNLGRP_NSID,
        RTNLGRP_MPLS_NETCONF,
        RTNLGRP_IPV4_MROUTE_R,
        RTNLGRP_IPV6_MROUTE_R,
        RTNLGRP_NEXTHOP,
        RTNLGRP_BRVLAN,
        RTNLGRP_MCTP_IFADDR,
        RTNLGRP_TUNNEL,
        RTNLGRP_STATS,
        __RTNLGRP_MAX;

    }
}

