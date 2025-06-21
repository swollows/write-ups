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
import me.bechberger.ebpf.runtime.AddrDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NeighDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Inet6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inet6_bind(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__inet6_lookup_skb($arg1, $arg2, $arg3, (const short unsigned int)$arg4, (const short unsigned int)$arg5, $arg6, $arg7, $arg8)")
    public static Ptr<runtime.sock> __inet6_lookup_skb(Ptr<InetDefinitions.inet_hashinfo> hashinfo, Ptr<SkDefinitions.sk_buff> skb, int doff, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be16") short dport, int iif, int sdif, Ptr<@OriginalName(value="bool") Boolean> refcounted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_addr_add(Ptr<runtime.net> net2, int ifindex, Ptr<misc.ifa6_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_addr_modify(Ptr<runtime.net> net2, Ptr<inet6_ifaddr> ifp, Ptr<misc.ifa6_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_bind_sk(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_cleanup_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_compat_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_create(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_csk_addr2sockaddr(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_csk_route_req((const struct sock*)$arg1, $arg2, (const struct request_sock*)$arg3, $arg4)")
    public static Ptr<DstDefinitions.dst_entry> inet6_csk_route_req(Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, Ptr<RequestDefinitions.request_sock> req2, char proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> inet6_csk_route_socket(Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> inet6_csk_update_pmtu(Ptr<runtime.sock> sk, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_csk_xmit(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl_unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_dump_addr(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, AddrDefinitions.addr_type_t type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_dump_ifacaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_dump_ifaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_dump_ifinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_dump_ifmcaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_fill_ifacaddr($arg1, (const struct ifacaddr6*)$arg2, $arg3)")
    public static int inet6_fill_ifacaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.ifacaddr6> ifaca, Ptr<inet6_fill_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_fill_ifaddr($arg1, (const struct inet6_ifaddr*)$arg2, $arg3)")
    public static int inet6_fill_ifaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<inet6_ifaddr> ifa, Ptr<inet6_fill_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_fill_ifinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<inet6_dev> idev, @Unsigned int portid, @Unsigned int seq, int event2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_fill_ifla6_attrs(Ptr<SkDefinitions.sk_buff> skb, Ptr<inet6_dev> idev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_fill_link_af($arg1, (const struct net_device*)$arg2, $arg3)")
    public static int inet6_fill_link_af(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_get_link_af_size((const struct net_device*)$arg1, $arg2)")
    public static @Unsigned long inet6_get_link_af_size(Ptr<NetDefinitions.net_device> dev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_getname(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_ifa_finish_destroy(Ptr<inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_ifinfo_notify(int event2, Ptr<inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_netconf_dump_devconf(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_netconf_fill_devconf(Ptr<SkDefinitions.sk_buff> skb, int ifindex, Ptr<Ipv6Definitions.ipv6_devconf> devconf, @Unsigned int portid, @Unsigned int seq, int event2, @Unsigned int flags, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_netconf_get_devconf(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_netconf_notify_devconf(Ptr<runtime.net> net2, int event2, int type2, int ifindex, Ptr<Ipv6Definitions.ipv6_devconf> devconf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_register_protosw(Ptr<InetDefinitions.inet_protosw> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_release(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_rtm_deladdr(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_rtm_getaddr(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_rtm_newaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_set_iftoken(Ptr<inet6_dev> idev, Ptr<In6Definitions.in6_addr> token, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_set_link_af($arg1, (const struct nlattr*)$arg2, $arg3)")
    public static int inet6_set_link_af(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.nlattr> nla, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_sk_rebuild_header(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_sk_rx_dst_set($arg1, (const struct sk_buff*)$arg2)")
    public static void inet6_sk_rx_dst_set(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_sock_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_unregister_protosw(Ptr<InetDefinitions.inet_protosw> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_valid_dump_ifaddr_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int inet6_valid_dump_ifaddr_req(Ptr<runtime.nlmsghdr> nlh, Ptr<inet6_fill_args> fillargs, Ptr<Ptr<runtime.net>> tgt_net, Ptr<runtime.sock> sk, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_validate_link_af((const struct net_device*)$arg1, (const struct nlattr*)$arg2, $arg3)")
    public static int inet6_validate_link_af(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.nlattr> nla, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__inet6_check_established($arg1, $arg2, (const short unsigned int)$arg3, $arg4)")
    public static int __inet6_check_established(Ptr<InetDefinitions.inet_timewait_death_row> death_row, Ptr<runtime.sock> sk, @Unsigned short lport, Ptr<Ptr<InetDefinitions.inet_timewait_sock>> twp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__inet6_lookup_established((const struct net*)$arg1, $arg2, (const struct in6_addr*)$arg3, (const short unsigned int)$arg4, (const struct in6_addr*)$arg5, (const short unsigned int)$arg6, (const int)$arg7, (const int)$arg8)")
    public static Ptr<runtime.sock> __inet6_lookup_established(Ptr<runtime.net> net2, Ptr<InetDefinitions.inet_hashinfo> hashinfo, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned short hnum, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_add_offload((const struct net_offload*)$arg1, $arg2)")
    public static int inet6_add_offload(Ptr<NetDefinitions.net_offload> prot, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_add_protocol((const struct inet6_protocol*)$arg1, $arg2)")
    public static int inet6_add_protocol(Ptr<inet6_protocol> prot, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_del_offload((const struct net_offload*)$arg1, $arg2)")
    public static int inet6_del_offload(Ptr<NetDefinitions.net_offload> prot, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_del_protocol((const struct inet6_protocol*)$arg1, $arg2)")
    public static int inet6_del_protocol(Ptr<inet6_protocol> prot, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_ehashfn((const struct net*)$arg1, (const struct in6_addr*)$arg2, (const short unsigned int)$arg3, (const struct in6_addr*)$arg4, (const short unsigned int)$arg5)")
    public static @Unsigned int inet6_ehashfn(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> laddr, @Unsigned short lport, Ptr<In6Definitions.in6_addr> faddr, @Unsigned @OriginalName(value="__be16") short fport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_hash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_hash_connect(Ptr<InetDefinitions.inet_timewait_death_row> death_row, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_lhash2_lookup((const struct net*)$arg1, $arg2, $arg3, $arg4, (const struct in6_addr*)$arg5, (const short unsigned int)$arg6, (const struct in6_addr*)$arg7, (const short unsigned int)$arg8, (const int)$arg9, (const int)$arg10)")
    public static Ptr<runtime.sock> inet6_lhash2_lookup(Ptr<runtime.net> net2, Ptr<InetDefinitions.inet_listen_hashbucket> ilb2, Ptr<SkDefinitions.sk_buff> skb, int doff, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned short hnum, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_lookup((const struct net*)$arg1, $arg2, $arg3, $arg4, (const struct in6_addr*)$arg5, (const short unsigned int)$arg6, (const struct in6_addr*)$arg7, (const short unsigned int)$arg8, (const int)$arg9)")
    public static Ptr<runtime.sock> inet6_lookup(Ptr<runtime.net> net2, Ptr<InetDefinitions.inet_hashinfo> hashinfo, Ptr<SkDefinitions.sk_buff> skb, int doff, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned @OriginalName(value="__be16") short dport, int dif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_lookup_listener((const struct net*)$arg1, $arg2, $arg3, $arg4, (const struct in6_addr*)$arg5, (const short unsigned int)$arg6, (const struct in6_addr*)$arg7, (const short unsigned int)$arg8, (const int)$arg9, (const int)$arg10)")
    public static Ptr<runtime.sock> inet6_lookup_listener(Ptr<runtime.net> net2, Ptr<InetDefinitions.inet_hashinfo> hashinfo, Ptr<SkDefinitions.sk_buff> skb, int doff, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned short hnum, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_lookup_reuseport((const struct net*)$arg1, $arg2, $arg3, $arg4, (const struct in6_addr*)$arg5, $arg6, (const struct in6_addr*)$arg7, $arg8, $arg9)")
    public static Ptr<runtime.sock> inet6_lookup_reuseport(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int doff, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned short hnum, Ptr<?> ehashfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_lookup_run_sk_lookup((const struct net*)$arg1, $arg2, $arg3, $arg4, (const struct in6_addr*)$arg5, (const short unsigned int)$arg6, (const struct in6_addr*)$arg7, (const short unsigned int)$arg8, (const int)$arg9, $arg10)")
    public static Ptr<runtime.sock> inet6_lookup_run_sk_lookup(Ptr<runtime.net> net2, int protocol, Ptr<SkDefinitions.sk_buff> skb, int doff, Ptr<In6Definitions.in6_addr> saddr, @Unsigned @OriginalName(value="__be16") short sport, Ptr<In6Definitions.in6_addr> daddr, @Unsigned short hnum, int dif, Ptr<?> ehashfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_mc_check((const struct sock*)$arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static boolean inet6_mc_check(Ptr<runtime.sock> sk, Ptr<In6Definitions.in6_addr> mc_addr, Ptr<In6Definitions.in6_addr> src_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_pton($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int inet6_pton(Ptr<runtime.net> net2, String src, @Unsigned short port_num, Ptr<KernelDefinitions.__kernel_sockaddr_storage> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet6_rt_notify(int event2, Ptr<Fib6Definitions.fib6_info> rt, Ptr<misc.nl_info> info2, @Unsigned int nlm_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_rtm_delroute(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_rtm_getroute(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_rtm_newroute(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet6_rtm_valid_getroute_req($arg1, (const struct nlmsghdr*)$arg2, $arg3, $arg4)")
    public static int inet6_rtm_valid_getroute_req(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet6_dump_fib(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct inet6_fill_args")
    @NotUsableInJava
    public static class inet6_fill_args
    extends Struct {
        public @Unsigned int portid;
        public @Unsigned int seq;
        public int event;
        public @Unsigned int flags;
        public int netnsid;
        public int ifindex;
        public AddrDefinitions.addr_type_t type;
    }

    @Type(noCCodeGeneration=true, cType="struct inet6_ifaddr")
    @NotUsableInJava
    public static class inet6_ifaddr
    extends Struct {
        public In6Definitions.in6_addr addr;
        public @Unsigned int prefix_len;
        public @Unsigned int rt_priority;
        public @Unsigned int valid_lft;
        public @Unsigned int prefered_lft;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public int state;
        public @Unsigned int flags;
        public char dad_probes;
        public char stable_privacy_retry;
        public @Unsigned short scope;
        public @Unsigned long dad_nonce;
        public @Unsigned long cstamp;
        public @Unsigned long tstamp;
        public DelayedDefinitions.delayed_work dad_work;
        public Ptr<inet6_dev> idev;
        public Ptr<Fib6Definitions.fib6_info> rt;
        public misc.hlist_node addr_lst;
        public ListDefinitions.list_head if_list;
        public ListDefinitions.list_head if_list_aux;
        public ListDefinitions.list_head tmp_list;
        public Ptr<inet6_ifaddr> ifpub;
        public int regen_count;
        public boolean tokenized;
        public char ifa_proto;
        public misc.callback_head rcu;
        public In6Definitions.in6_addr peer_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct inet6_protocol")
    @NotUsableInJava
    public static class inet6_protocol
    extends Struct {
        public Ptr<?> handler;
        public Ptr<?> err_handler;
        public @Unsigned int flags;
        public @Unsigned int secret;
    }

    @Type(noCCodeGeneration=true, cType="struct inet6_skb_parm")
    @NotUsableInJava
    public static class inet6_skb_parm
    extends Struct {
        public int iif;
        public @Unsigned @OriginalName(value="__be16") short ra;
        public @Unsigned short dst0;
        public @Unsigned short srcrt;
        public @Unsigned short dst1;
        public @Unsigned short lastopt;
        public @Unsigned short nhoff;
        public @Unsigned short flags;
        public @Unsigned short dsthao;
        public @Unsigned short frag_max_size;
        public @Unsigned short srhoff;
    }

    @Type(noCCodeGeneration=true, cType="struct inet6_cork")
    @NotUsableInJava
    public static class inet6_cork
    extends Struct {
        public Ptr<Ipv6Definitions.ipv6_txoptions> opt;
        public char hop_limit;
        public char tclass;
    }

    @Type(noCCodeGeneration=true, cType="struct inet6_dev")
    @NotUsableInJava
    public static class inet6_dev
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public ListDefinitions.list_head addr_list;
        public Ptr<runtime.ifmcaddr6> mc_list;
        public Ptr<runtime.ifmcaddr6> mc_tomb;
        public char mc_qrv;
        public char mc_gq_running;
        public char mc_ifc_count;
        public char mc_dad_count;
        public @Unsigned long mc_v1_seen;
        public @Unsigned long mc_qi;
        public @Unsigned long mc_qri;
        public @Unsigned long mc_maxdelay;
        public DelayedDefinitions.delayed_work mc_gq_work;
        public DelayedDefinitions.delayed_work mc_ifc_work;
        public DelayedDefinitions.delayed_work mc_dad_work;
        public DelayedDefinitions.delayed_work mc_query_work;
        public DelayedDefinitions.delayed_work mc_report_work;
        public SkDefinitions.sk_buff_head mc_query_queue;
        public SkDefinitions.sk_buff_head mc_report_queue;
        public  @OriginalName(value="spinlock_t") runtime.spinlock mc_query_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock mc_report_lock;
        public runtime.mutex mc_lock;
        public Ptr<runtime.ifacaddr6> ac_list;
        public misc.rwlock_t lock;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @Unsigned int if_flags;
        public int dead;
        public @Unsigned int desync_factor;
        public ListDefinitions.list_head tempaddr_list;
        public In6Definitions.in6_addr token;
        public Ptr<NeighDefinitions.neigh_parms> nd_parms;
        public Ipv6Definitions.ipv6_devconf cnf;
        public Ipv6Definitions.ipv6_devstat stats;
        public TimerDefinitions.timer_list rs_timer;
        public int rs_interval;
        public char rs_probes;
        public @Unsigned long tstamp;
        public misc.callback_head rcu;
        public @Unsigned int ra_mtu;
    }
}

