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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CommonDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.Icmpv6Definitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.Ip6Definitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NeighDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class Ipv6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__ipv6_addr_type((const struct in6_addr*)$arg1)")
    public static int __ipv6_addr_type(Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ipv6_chk_addr_and_flags($arg1, (const struct in6_addr*)$arg2, (const struct net_device*)$arg3, $arg4, $arg5, $arg6)")
    public static Ptr<NetDefinitions.net_device> __ipv6_chk_addr_and_flags(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev, boolean skip_dev_check, int strict, @Unsigned int banned_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ipv6_dev_get_saddr(Ptr<runtime.net> net2, Ptr<ipv6_saddr_dst> dst, Ptr<Inet6Definitions.inet6_dev> idev, Ptr<ipv6_saddr_score> scores, int hiscore_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ipv6_ifa_notify(int event2, Ptr<Inet6Definitions.inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ipv6_isatap_ifid(Ptr<Character> eui, @Unsigned @OriginalName(value="__be32") int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Inet6Definitions.inet6_ifaddr> ipv6_add_addr(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<misc.ifa6_config> cfg, boolean can_block, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Inet6Definitions.inet6_dev> ipv6_add_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_addr($arg1, (const struct in6_addr*)$arg2, (const struct net_device*)$arg3, $arg4)")
    public static int ipv6_chk_addr(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev, int strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_addr_and_flags($arg1, (const struct in6_addr*)$arg2, (const struct net_device*)$arg3, $arg4, $arg5, $arg6)")
    public static int ipv6_chk_addr_and_flags(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev, boolean skip_dev_check, int strict, @Unsigned int banned_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_custom_prefix((const struct in6_addr*)$arg1, (const unsigned int)$arg2, $arg3)")
    public static boolean ipv6_chk_custom_prefix(Ptr<In6Definitions.in6_addr> addr2, @Unsigned int prefix_len, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_home_addr($arg1, (const struct in6_addr*)$arg2)")
    public static int ipv6_chk_home_addr(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_prefix((const struct in6_addr*)$arg1, $arg2)")
    public static int ipv6_chk_prefix(Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_rpl_srh_loop($arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static int ipv6_chk_rpl_srh_loop(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> segs, char nsegs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_create_tempaddr(Ptr<Inet6Definitions.inet6_ifaddr> ifp, boolean block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_del_addr(Ptr<Inet6Definitions.inet6_ifaddr> ifp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_dev_find($arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static Ptr<NetDefinitions.net_device> ipv6_dev_find(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_dev_get_saddr($arg1, (const struct net_device*)$arg2, (const struct in6_addr*)$arg3, $arg4, $arg5)")
    public static int ipv6_dev_get_saddr(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dst_dev, Ptr<In6Definitions.in6_addr> daddr, @Unsigned int prefs, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_eth_mc_map((const struct in6_addr*)$arg1, $arg2)")
    public static void ipv6_eth_mc_map(Ptr<In6Definitions.in6_addr> addr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_exthdrs_offload_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Inet6Definitions.inet6_dev> ipv6_find_idev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_generate_eui64(Ptr<Character> eui, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_generate_stable_address($arg1, $arg2, (const struct inet6_dev*)$arg3)")
    public static int ipv6_generate_stable_address(Ptr<In6Definitions.in6_addr> address, char dad_count, Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_get_ifaddr($arg1, (const struct in6_addr*)$arg2, $arg3, $arg4)")
    public static Ptr<Inet6Definitions.inet6_ifaddr> ipv6_get_ifaddr(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, Ptr<NetDefinitions.net_device> dev, int strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_get_lladdr(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> addr2, @Unsigned int banned_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_get_saddr_eval(Ptr<runtime.net> net2, Ptr<ipv6_saddr_score> score, Ptr<ipv6_saddr_dst> dst, int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_ib_mc_map((const struct in6_addr*)$arg1, (const u8*)$arg2, $arg3)")
    public static void ipv6_ib_mc_map(Ptr<In6Definitions.in6_addr> addr2, String broadcast, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ctl_table> ipv6_icmp_sysctl_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ipv6_icmp_sysctl_table_size() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_inherit_eui64(Ptr<Character> eui, Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_init_mibs(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_ipgre_mc_map((const struct in6_addr*)$arg1, (const u8*)$arg2, $arg3)")
    public static int ipv6_ipgre_mc_map(Ptr<In6Definitions.in6_addr> addr2, String broadcast, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_mc_config($arg1, $arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static int ipv6_mc_config(Ptr<runtime.sock> sk, boolean join, Ptr<In6Definitions.in6_addr> addr2, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ipv6_mod_enabled() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_opt_accepted((const struct sock*)$arg1, (const struct sk_buff*)$arg2, (const struct inet6_skb_parm*)$arg3)")
    public static boolean ipv6_opt_accepted(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<Inet6Definitions.inet6_skb_parm> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be32") int ipv6_proxy_select_ident(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_route_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_rpl_addr_compress($arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static void ipv6_rpl_addr_compress(Ptr<?> dst, Ptr<In6Definitions.in6_addr> addr2, char pfx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_rpl_addr_decompress($arg1, (const struct in6_addr*)$arg2, (const void*)$arg3, $arg4)")
    public static void ipv6_rpl_addr_decompress(Ptr<In6Definitions.in6_addr> dst, Ptr<In6Definitions.in6_addr> daddr, Ptr<?> post, char pfx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_rpl_srh_compress($arg1, (const struct ipv6_rpl_sr_hdr*)$arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static void ipv6_rpl_srh_compress(Ptr<ipv6_rpl_sr_hdr> outhdr, Ptr<ipv6_rpl_sr_hdr> inhdr, Ptr<In6Definitions.in6_addr> daddr, char n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_rpl_srh_decompress($arg1, (const struct ipv6_rpl_sr_hdr*)$arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static void ipv6_rpl_srh_decompress(Ptr<ipv6_rpl_sr_hdr> outhdr, Ptr<ipv6_rpl_sr_hdr> inhdr, Ptr<In6Definitions.in6_addr> daddr, char n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_select_ident($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static @Unsigned @OriginalName(value="__be32") int ipv6_select_ident(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_store_devconf((const struct ipv6_devconf*)$arg1, $arg2, $arg3)")
    public static void ipv6_store_devconf(Ptr<ipv6_devconf> cnf, Ptr<Integer> array, int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ipv6_dev_mc_dec($arg1, (const struct in6_addr*)$arg2)")
    public static int __ipv6_dev_mc_dec(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ipv6_dev_mc_inc($arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static int __ipv6_dev_mc_inc(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> addr2, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ipv6_sock_mc_close(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ipv6_sock_mc_join($arg1, $arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static int __ipv6_sock_mc_join(Ptr<runtime.sock> sk, int ifindex, Ptr<In6Definitions.in6_addr> addr2, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_addr_cmp((const struct in6_addr*)$arg1, (const struct in6_addr*)$arg2)")
    public static int ipv6_addr_cmp(Ptr<In6Definitions.in6_addr> a1, Ptr<In6Definitions.in6_addr> a2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_mcast_addr($arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static boolean ipv6_chk_mcast_addr(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> group, Ptr<In6Definitions.in6_addr> src_addr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_dev_mc_dec($arg1, (const struct in6_addr*)$arg2)")
    public static int ipv6_dev_mc_dec(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_dev_mc_inc($arg1, (const struct in6_addr*)$arg2)")
    public static int ipv6_dev_mc_inc(Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ipv6_ext_hdr(char nexthdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_find_hdr((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ipv6_find_hdr(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Integer> offset, int target, Ptr<@Unsigned Short> fragoff, Ptr<Integer> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_find_tlv((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static int ipv6_find_tlv(Ptr<SkDefinitions.sk_buff> skb, int offset, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_get_msfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, misc.sockptr_t optlen, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_icmp_error(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int err, @Unsigned @OriginalName(value="__be16") short port2, @Unsigned int info2, Ptr<Character> payload) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_list_rcv(Ptr<ListDefinitions.list_head> head, Ptr<PacketDefinitions.packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_local_error(Ptr<runtime.sock> sk, int err, Ptr<runtime.flowi6> fl6, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_local_rxpmtu(Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_mc_dad_complete(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_mc_destroy_dev(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_mc_down(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_mc_init_dev(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_mc_netdev_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_mc_remap(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_mc_unmap(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_mc_up(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_mcast_join_leave(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_misc_proc_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_misc_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_proc_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_proc_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_rcv(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<PacketDefinitions.packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_recv_error(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, int len, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_recv_rxpmtu(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, int len, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_set_mcast_msfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_set_opt_hdr(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_skip_exthdr((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static int ipv6_skip_exthdr(Ptr<SkDefinitions.sk_buff> skb, int start, Ptr<Character> nexthdrp, Ptr<@Unsigned @OriginalName(value="__be16") Short> frag_offp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_sock_mc_close(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_sock_mc_drop($arg1, $arg2, (const struct in6_addr*)$arg3)")
    public static int ipv6_sock_mc_drop(Ptr<runtime.sock> sk, int ifindex, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_sock_mc_join($arg1, $arg2, (const struct in6_addr*)$arg3)")
    public static int ipv6_sock_mc_join(Ptr<runtime.sock> sk, int ifindex, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_sock_mc_join_ssm($arg1, $arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static int ipv6_sock_mc_join_ssm(Ptr<runtime.sock> sk, int ifindex, Ptr<In6Definitions.in6_addr> addr2, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ipv6_txoptions> ipv6_update_options(Ptr<runtime.sock> sk, Ptr<ipv6_txoptions> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_flowlabel_get(Ptr<runtime.sock> sk, Ptr<In6Definitions.in6_flowlabel_req> freq, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_flowlabel_opt(Ptr<runtime.sock> sk, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_flowlabel_opt_get(Ptr<runtime.sock> sk, Ptr<In6Definitions.in6_flowlabel_req> freq, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_gro_complete(Ptr<SkDefinitions.sk_buff> skb, int nhoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ipv6_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ipv6_gso_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_hopopt_jumbo_remove(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_inetpeer_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_inetpeer_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_offload_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ipv6_raw_deliver(Ptr<SkDefinitions.sk_buff> skb, int nexthdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_route_ioctl(Ptr<runtime.net> net2, @Unsigned int cmd, Ptr<In6Definitions.in6_rtmsg> rtmsg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ctl_table> ipv6_route_sysctl_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long ipv6_route_sysctl_table_size(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_skb_to_auditdata(Ptr<SkDefinitions.sk_buff> skb, Ptr<CommonDefinitions.common_audit_data> ad, Ptr<Character> proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_sysctl_rtcache_flush((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ipv6_sysctl_rtcache_flush(Ptr<misc.ctl_table> ctl, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ipv6_addr_label($arg1, (const struct in6_addr*)$arg2, $arg3, $arg4)")
    public static Ptr<misc.ip6addrlbl_entry> __ipv6_addr_label(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, int type2, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ipv6_dev_ac_dec($arg1, (const struct in6_addr*)$arg2)")
    public static int __ipv6_dev_ac_dec(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ipv6_dev_ac_inc($arg1, (const struct in6_addr*)$arg2)")
    public static int __ipv6_dev_ac_inc(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ipv6_txoptions> __ipv6_fixup_options(Ptr<ipv6_txoptions> opt_space, Ptr<ipv6_txoptions> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ipv6_sock_ac_close(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_ac_destroy_dev(Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_addr_label($arg1, (const struct in6_addr*)$arg2, $arg3, $arg4)")
    public static @Unsigned int ipv6_addr_label(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> addr2, int type2, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_addr_label_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_addr_label_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_addr_label_rtnl_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_anycast_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_anycast_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_acast_addr($arg1, $arg2, (const struct in6_addr*)$arg3)")
    public static boolean ipv6_chk_acast_addr(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_chk_acast_addr_src($arg1, $arg2, (const struct in6_addr*)$arg3)")
    public static boolean ipv6_chk_acast_addr_src(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ipv6_dest_hao(Ptr<SkDefinitions.sk_buff> skb, int optoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_destopt_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ipv6_txoptions> ipv6_dup_options(Ptr<runtime.sock> sk, Ptr<ipv6_txoptions> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_exthdrs_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_exthdrs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_frag_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_frag_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_frag_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_frags_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_frags_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_frags_pre_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ipv6_hop_ra(Ptr<SkDefinitions.sk_buff> skb, int optoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_mc_check_mld(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short ipv6_mc_validate_checksum(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_netfilter_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_netfilter_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_parse_hopopts(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_push_exthdr(Ptr<SkDefinitions.sk_buff> skb, Ptr<Character> proto2, char type2, Ptr<ipv6_opt_hdr> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_push_frag_opts(Ptr<SkDefinitions.sk_buff> skb, Ptr<ipv6_txoptions> opt, Ptr<Character> proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_push_nfrag_opts(Ptr<SkDefinitions.sk_buff> skb, Ptr<ipv6_txoptions> opt, Ptr<Character> proto2, Ptr<Ptr<In6Definitions.in6_addr>> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_push_rthdr0(Ptr<SkDefinitions.sk_buff> skb, Ptr<Character> proto2, Ptr<ipv6_rt_hdr> opt, Ptr<Ptr<In6Definitions.in6_addr>> addr_p, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_push_rthdr4(Ptr<SkDefinitions.sk_buff> skb, Ptr<Character> proto2, Ptr<ipv6_rt_hdr> opt, Ptr<Ptr<In6Definitions.in6_addr>> addr_p, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_rcv_saddr_equal((const struct in6_addr*)$arg1, (const struct in6_addr*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static boolean ipv6_rcv_saddr_equal(Ptr<In6Definitions.in6_addr> sk1_rcv_saddr6, Ptr<In6Definitions.in6_addr> sk2_rcv_saddr6, @Unsigned @OriginalName(value="__be32") int sk1_rcv_saddr, @Unsigned @OriginalName(value="__be32") int sk2_rcv_saddr, boolean sk1_ipv6only, boolean sk2_ipv6only, boolean match_sk1_wildcard, boolean match_sk2_wildcard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_renew_option(int renewtype, Ptr<Ptr<ipv6_opt_hdr>> dest, Ptr<ipv6_opt_hdr> old, Ptr<ipv6_opt_hdr> _new, int newtype, Ptr<String> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ipv6_txoptions> ipv6_renew_options(Ptr<runtime.sock> sk, Ptr<ipv6_txoptions> opt, int newtype, Ptr<ipv6_opt_hdr> newopt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ipv6_route_seq_next(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_route_seq_setup_walk(Ptr<ipv6_route_iter> iter2, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_route_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ipv6_route_seq_start(Ptr<SeqDefinitions.seq_file> seq, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_route_seq_stop(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_route_yield(Ptr<Fib6Definitions.fib6_walker> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_rpl_srh_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_rthdr_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_sock_ac_close(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_sock_ac_drop($arg1, $arg2, (const struct in6_addr*)$arg3)")
    public static int ipv6_sock_ac_drop(Ptr<runtime.sock> sk, int ifindex, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipv6_sock_ac_join($arg1, $arg2, (const struct in6_addr*)$arg3)")
    public static int ipv6_sock_ac_join(Ptr<runtime.sock> sk, int ifindex, Ptr<In6Definitions.in6_addr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_srh_rcv(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_sysctl_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_sysctl_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipv6_sysctl_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipv6_sysctl_unregister() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_mreq")
    @NotUsableInJava
    public static class ipv6_mreq
    extends Struct {
        public In6Definitions.in6_addr ipv6mr_multiaddr;
        public int ipv6mr_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_saddr_dst")
    @NotUsableInJava
    public static class ipv6_saddr_dst
    extends Struct {
        public Ptr<In6Definitions.in6_addr> addr;
        public int ifindex;
        public int scope;
        public int label;
        public @Unsigned int prefs;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_saddr_score")
    @NotUsableInJava
    public static class ipv6_saddr_score
    extends Struct {
        public int rule;
        public int addr_type;
        public Ptr<Inet6Definitions.inet6_ifaddr> ifa;
        public @Unsigned long @Size(value=1) [] scorebits;
        public int scopedist;
        public int matchlen;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_params")
    @NotUsableInJava
    public static class ipv6_params
    extends Struct {
        public int disable_ipv6;
        public int autoconf;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_rpl_sr_hdr")
    @NotUsableInJava
    public static class ipv6_rpl_sr_hdr
    extends Struct {
        public char nexthdr;
        public char hdrlen;
        public char type;
        public char segments_left;
        public @Unsigned int cmpre;
        public @Unsigned int cmpri;
        public @Unsigned int reserved;
        public @Unsigned int pad;
        public @Unsigned int reserved1;
        public misc.segments_of_ipv6_rpl_sr_hdr segments;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_destopt_hao")
    @NotUsableInJava
    public static class ipv6_destopt_hao
    extends Struct {
        public char type;
        public char length;
        public In6Definitions.in6_addr addr;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_route_iter")
    @NotUsableInJava
    public static class ipv6_route_iter
    extends Struct {
        public SeqDefinitions.seq_net_private p;
        public Fib6Definitions.fib6_walker w;
        public @OriginalName(value="loff_t") long skip;
        public Ptr<Fib6Definitions.fib6_table> tbl;
        public int sernum;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_sr_hdr")
    @NotUsableInJava
    public static class ipv6_sr_hdr
    extends Struct {
        public char nexthdr;
        public char hdrlen;
        public char type;
        public char segments_left;
        public char first_segment;
        public char flags;
        public @Unsigned short tag;
        public In6Definitions.in6_addr @Size(value=0) [] segments;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct in6_addr src; struct in6_addr dst; }")
    @NotUsableInJava
    public static class ipv6_of_u_of_ip_tunnel_key
    extends Struct {
        public In6Definitions.in6_addr src;
        public In6Definitions.in6_addr dst;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_bpf_stub")
    @NotUsableInJava
    public static class ipv6_bpf_stub
    extends Struct {
        public Ptr<?> inet6_bind;
        public Ptr<?> udp6_lib_lookup;
        public Ptr<?> ipv6_setsockopt;
        public Ptr<?> ipv6_getsockopt;
        public Ptr<?> ipv6_dev_get_saddr;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_stub")
    @NotUsableInJava
    public static class ipv6_stub
    extends Struct {
        public Ptr<?> ipv6_sock_mc_join;
        public Ptr<?> ipv6_sock_mc_drop;
        public Ptr<?> ipv6_dst_lookup_flow;
        public Ptr<?> ipv6_route_input;
        public Ptr<?> fib6_get_table;
        public Ptr<?> fib6_lookup;
        public Ptr<?> fib6_table_lookup;
        public Ptr<?> fib6_select_path;
        public Ptr<?> ip6_mtu_from_fib6;
        public Ptr<?> fib6_nh_init;
        public Ptr<?> fib6_nh_release;
        public Ptr<?> fib6_nh_release_dsts;
        public Ptr<?> fib6_update_sernum;
        public Ptr<?> ip6_del_rt;
        public Ptr<?> fib6_rt_update;
        public Ptr<?> udpv6_encap_enable;
        public Ptr<?> ndisc_send_na;
        public Ptr<?> xfrm6_local_rxpmtu;
        public Ptr<?> xfrm6_udp_encap_rcv;
        public Ptr<?> xfrm6_gro_udp_encap_rcv;
        public Ptr<?> xfrm6_rcv_encap;
        public Ptr<NeighDefinitions.neigh_table> nd_tbl;
        public Ptr<?> ipv6_fragment;
        public Ptr<?> ipv6_dev_find;
        public Ptr<?> ip6_xmit;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int saddr[4]; unsigned int daddr[4]; short unsigned int sport; short unsigned int dport; }")
    @NotUsableInJava
    public static class ipv6_of_anon_member_of_bpf_sock_tuple
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] saddr;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] daddr;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public @Unsigned @OriginalName(value="__be16") short dport;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_fl_socklist")
    @NotUsableInJava
    public static class ipv6_fl_socklist
    extends Struct {
        public Ptr<ipv6_fl_socklist> next;
        public Ptr<Ip6Definitions.ip6_flowlabel> fl;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_ac_socklist")
    @NotUsableInJava
    public static class ipv6_ac_socklist
    extends Struct {
        public In6Definitions.in6_addr acl_addr;
        public int acl_ifindex;
        public Ptr<ipv6_ac_socklist> acl_next;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_mc_socklist")
    @NotUsableInJava
    public static class ipv6_mc_socklist
    extends Struct {
        public In6Definitions.in6_addr addr;
        public int ifindex;
        public @Unsigned int sfmode;
        public Ptr<ipv6_mc_socklist> next;
        public Ptr<Ip6Definitions.ip6_sf_socklist> sflist;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_pinfo")
    @NotUsableInJava
    public static class ipv6_pinfo
    extends Struct {
        public In6Definitions.in6_addr saddr;
        public In6Definitions.in6_pktinfo sticky_pktinfo;
        public Ptr<In6Definitions.in6_addr> daddr_cache;
        public Ptr<In6Definitions.in6_addr> saddr_cache;
        public @Unsigned @OriginalName(value="__be32") int flow_label;
        public @Unsigned int frag_size;
        public short hop_limit;
        public char mcast_hops;
        public int ucast_oif;
        public int mcast_oif;
        public misc.rxopt_of_ipv6_pinfo rxopt;
        public char srcprefs;
        public char pmtudisc;
        public char min_hopcount;
        public char tclass;
        public @Unsigned @OriginalName(value="__be32") int rcv_flowinfo;
        public @Unsigned int dst_cookie;
        public Ptr<ipv6_mc_socklist> ipv6_mc_list;
        public Ptr<ipv6_ac_socklist> ipv6_ac_list;
        public Ptr<ipv6_fl_socklist> ipv6_fl_list;
        public Ptr<ipv6_txoptions> opt;
        public Ptr<SkDefinitions.sk_buff> pktoptions;
        public Ptr<SkDefinitions.sk_buff> rxpmtu;
        public Inet6Definitions.inet6_cork cork;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_txoptions")
    @NotUsableInJava
    public static class ipv6_txoptions
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public int tot_len;
        public @Unsigned short opt_flen;
        public @Unsigned short opt_nflen;
        public Ptr<ipv6_opt_hdr> hopopt;
        public Ptr<ipv6_opt_hdr> dst0opt;
        public Ptr<ipv6_rt_hdr> srcrt;
        public Ptr<ipv6_opt_hdr> dst1opt;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_opt_hdr")
    @NotUsableInJava
    public static class ipv6_opt_hdr
    extends Struct {
        public char nexthdr;
        public char hdrlen;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_rt_hdr")
    @NotUsableInJava
    public static class ipv6_rt_hdr
    extends Struct {
        public char nexthdr;
        public char hdrlen;
        public char type;
        public char segments_left;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_devstat")
    @NotUsableInJava
    public static class ipv6_devstat
    extends Struct {
        public Ptr<ProcDefinitions.proc_dir_entry> proc_dir_entry;
        public Ptr<misc.ipstats_mib> ipv6;
        public Ptr<Icmpv6Definitions.icmpv6_mib_device> icmpv6dev;
        public Ptr<misc.icmpv6msg_mib_device> icmpv6msgdev;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_stable_secret")
    @NotUsableInJava
    public static class ipv6_stable_secret
    extends Struct {
        public boolean initialized;
        public In6Definitions.in6_addr secret;
    }

    @Type(noCCodeGeneration=true, cType="struct ipv6_devconf")
    @NotUsableInJava
    public static class ipv6_devconf
    extends Struct {
        public char @Size(value=0) [] __cacheline_group_begin__ipv6_devconf_read_txrx;
        public int disable_ipv6;
        public int hop_limit;
        public int mtu6;
        public int forwarding;
        public int disable_policy;
        public int proxy_ndp;
        public char @Size(value=0) [] __cacheline_group_end__ipv6_devconf_read_txrx;
        public int accept_ra;
        public int accept_redirects;
        public int autoconf;
        public int dad_transmits;
        public int rtr_solicits;
        public int rtr_solicit_interval;
        public int rtr_solicit_max_interval;
        public int rtr_solicit_delay;
        public int force_mld_version;
        public int mldv1_unsolicited_report_interval;
        public int mldv2_unsolicited_report_interval;
        public int use_tempaddr;
        public int temp_valid_lft;
        public int temp_prefered_lft;
        public int regen_min_advance;
        public int regen_max_retry;
        public int max_desync_factor;
        public int max_addresses;
        public int accept_ra_defrtr;
        public @Unsigned int ra_defrtr_metric;
        public int accept_ra_min_hop_limit;
        public int accept_ra_min_lft;
        public int accept_ra_pinfo;
        public int ignore_routes_with_linkdown;
        public int accept_ra_rtr_pref;
        public int rtr_probe_interval;
        public int accept_ra_rt_info_min_plen;
        public int accept_ra_rt_info_max_plen;
        public int accept_source_route;
        public int accept_ra_from_local;
        public AtomicDefinitions.atomic_t mc_forwarding;
        public int drop_unicast_in_l2_multicast;
        public int accept_dad;
        public int force_tllao;
        public int ndisc_notify;
        public int suppress_frag_ndisc;
        public int accept_ra_mtu;
        public int drop_unsolicited_na;
        public int accept_untracked_na;
        public ipv6_stable_secret stable_secret;
        public int use_oif_addrs_only;
        public int keep_addr_on_down;
        public int seg6_enabled;
        public int seg6_require_hmac;
        public @Unsigned int enhanced_dad;
        public @Unsigned int addr_gen_mode;
        public int ndisc_tclass;
        public int rpl_seg_enabled;
        public @Unsigned int ioam6_id;
        public @Unsigned int ioam6_id_wide;
        public char ioam6_enabled;
        public char ndisc_evict_nocarrier;
        public char ra_honor_pio_life;
        public char ra_honor_pio_pflag;
        public Ptr<misc.ctl_table_header> sysctl_header;
    }
}

