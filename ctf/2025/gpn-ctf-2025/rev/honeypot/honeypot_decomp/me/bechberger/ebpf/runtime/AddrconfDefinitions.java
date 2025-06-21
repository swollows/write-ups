/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class AddrconfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __addrconf_sysctl_register(Ptr<runtime.net> net2, String dev_name, Ptr<Inet6Definitions.inet6_dev> idev, Ptr<Ipv6Definitions.ipv6_devconf> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Inet6Definitions.inet6_dev> addrconf_add_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_add_ifaddr(Ptr<runtime.net> net2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_add_linklocal($arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static void addrconf_add_linklocal(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> addr2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_add_mroute(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_addr_eui48_base($arg1, (const const u8*)$arg2)")
    public static void addrconf_addr_eui48_base(Ptr<Character> eui, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_addr_gen(Ptr<Inet6Definitions.inet6_dev> idev, boolean prefix_route) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_dad_completed(Ptr<Inet6Definitions.inet6_ifaddr> ifp, boolean bump_id, boolean send_na) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_dad_failure(Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_dad_kick(Ptr<Inet6Definitions.inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_dad_run(Ptr<Inet6Definitions.inet6_dev> idev, boolean restart) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_dad_start(Ptr<Inet6Definitions.inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_dad_stop(Ptr<Inet6Definitions.inet6_ifaddr> ifp, int dad_failed) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_dad_work(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_del_dad_work(Ptr<Inet6Definitions.inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_del_ifaddr(Ptr<runtime.net> net2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_disable_policy_idev(Ptr<Inet6Definitions.inet6_dev> idev, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_fixup_forwarding((const struct ctl_table*)$arg1, $arg2, $arg3)")
    public static int addrconf_fixup_forwarding(Ptr<misc.ctl_table> table, Ptr<Integer> p, int newf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_get_prefix_route((const struct in6_addr*)$arg1, $arg2, (const struct net_device*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<Fib6Definitions.fib6_info> addrconf_get_prefix_route(Ptr<In6Definitions.in6_addr> pfx, int plen, Ptr<NetDefinitions.net_device> dev, @Unsigned int flags, @Unsigned int noflags, boolean no_gw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_ifdown(Ptr<NetDefinitions.net_device> dev, boolean unregister) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_ifid_6lowpan(Ptr<Character> eui, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_ifid_ieee1394(Ptr<Character> eui, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_ifid_infiniband(Ptr<Character> eui, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_ifid_ip6tnl(Ptr<Character> eui, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_init_auto_addrs(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_join_solict($arg1, (const struct in6_addr*)$arg2)")
    public static void addrconf_join_solict(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_leave_anycast(Ptr<Inet6Definitions.inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_leave_solict($arg1, (const struct in6_addr*)$arg2)")
    public static void addrconf_leave_solict(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_mod_dad_work(Ptr<Inet6Definitions.inet6_ifaddr> ifp, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_notify(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_permanent_addr(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_prefix_rcv(Ptr<NetDefinitions.net_device> dev, Ptr<Character> opt, int len, boolean sllao) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_prefix_rcv_add_addr($arg1, $arg2, (const struct prefix_info*)$arg3, $arg4, (const struct in6_addr*)$arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static int addrconf_prefix_rcv_add_addr(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, Ptr<misc.prefix_info> pinfo, Ptr<Inet6Definitions.inet6_dev> in6_dev, Ptr<In6Definitions.in6_addr> addr2, int addr_type, @Unsigned int addr_flags, boolean sllao, boolean tokenized, @Unsigned int valid_lft, @Unsigned int prefered_lft) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_prefix_route(Ptr<In6Definitions.in6_addr> pfx, int plen, @Unsigned int metric, Ptr<NetDefinitions.net_device> dev, @Unsigned long expires, @Unsigned int flags, @Unsigned @OriginalName(value="gfp_t") int gfp_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_rs_timer(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_set_dstaddr(Ptr<runtime.net> net2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_sysctl_addr_gen_mode((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int addrconf_sysctl_addr_gen_mode(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_sysctl_disable((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int addrconf_sysctl_disable(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_sysctl_disable_policy((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int addrconf_sysctl_disable_policy(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_sysctl_forward((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int addrconf_sysctl_forward(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_sysctl_ignore_routes_with_linkdown((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int addrconf_sysctl_ignore_routes_with_linkdown(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_sysctl_mtu((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int addrconf_sysctl_mtu(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_sysctl_proxy_ndp((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int addrconf_sysctl_proxy_ndp(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int addrconf_sysctl_register(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_sysctl_stable_secret((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int addrconf_sysctl_stable_secret(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_sysctl_unregister(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_verify_rtnl(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void addrconf_verify_work(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="addrconf_f6i_alloc($arg1, $arg2, (const struct in6_addr*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<Fib6Definitions.fib6_info> addrconf_f6i_alloc(Ptr<runtime.net> net2, Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> addr2, boolean anycast, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }
}

