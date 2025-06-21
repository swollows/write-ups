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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.Fib6Definitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.GroDefinitions;
import me.bechberger.ebpf.runtime.GroupDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LwtunnelDefinitions;
import me.bechberger.ebpf.runtime.MrDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.Rt6Definitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Ip6Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip6_local_out(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_addr_string($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5)")
    public static String ip6_addr_string(String buf, String end, Ptr<Character> addr2, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_addr_string_sa($arg1, $arg2, (const struct sockaddr_in6*)$arg3, $arg4, (const u8*)$arg5)")
    public static String ip6_addr_string_sa(String buf, String end, Ptr<misc.sockaddr_in6> sa, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_compressed_string($arg1, (const u8*)$arg2)")
    public static String ip6_compressed_string(String p, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_dst_hoplimit(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_err_gen_icmpv6_unreach(Ptr<SkDefinitions.sk_buff> skb, int nhs, int type2, @Unsigned int data_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_find_1stfragopt(Ptr<SkDefinitions.sk_buff> skb, Ptr<Ptr<Character>> nexthdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_local_out(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_string($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static String ip6_string(String p, String addr2, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip6_datagram_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ip6_dgram_sock_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<runtime.sock> sp, @Unsigned short srcp, @Unsigned short destp, int rqueue, int bucket2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_datagram_connect(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_datagram_connect_v6_only(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_datagram_dst_update(Ptr<runtime.sock> sk, boolean fix_sk_saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_datagram_recv_common_ctl(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_datagram_recv_ctl(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_datagram_recv_specific_ctl(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_datagram_release_cb(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_datagram_send_ctl(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<runtime.flowi6> fl6, Ptr<misc.ipcm6_cookie> ipc6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_input_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_mc_add_src($arg1, (const struct in6_addr*)$arg2, $arg3, $arg4, (const struct in6_addr*)$arg5, $arg6)")
    public static int ip6_mc_add_src(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> pmca, int sfmode, int sfcount, Ptr<In6Definitions.in6_addr> psfsrc, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_mc_del1_src($arg1, $arg2, (const struct in6_addr*)$arg3)")
    public static int ip6_mc_del1_src(Ptr<runtime.ifmcaddr6> pmc, int sfmode, Ptr<In6Definitions.in6_addr> psfsrc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_mc_del_src($arg1, (const struct in6_addr*)$arg2, $arg3, $arg4, (const struct in6_addr*)$arg5, $arg6)")
    public static int ip6_mc_del_src(Ptr<Inet6Definitions.inet6_dev> idev, Ptr<In6Definitions.in6_addr> pmca, int sfmode, int sfcount, Ptr<In6Definitions.in6_addr> psfsrc, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_mc_find_dev_rtnl($arg1, (const struct in6_addr*)$arg2, $arg3)")
    public static Ptr<Inet6Definitions.inet6_dev> ip6_mc_find_dev_rtnl(Ptr<runtime.net> net2, Ptr<In6Definitions.in6_addr> group, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_mc_hdr((const struct sock*)$arg1, $arg2, $arg3, (const struct in6_addr*)$arg4, (const struct in6_addr*)$arg5, $arg6, $arg7)")
    public static void ip6_mc_hdr(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<In6Definitions.in6_addr> saddr, Ptr<In6Definitions.in6_addr> daddr, int proto2, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mc_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mc_leave_src(Ptr<runtime.sock> sk, Ptr<Ipv6Definitions.ipv6_mc_socklist> iml, Ptr<Inet6Definitions.inet6_dev> idev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mc_msfget(Ptr<runtime.sock> sk, Ptr<GroupDefinitions.group_filter> gsf, misc.sockptr_t optval, @Unsigned long ss_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mc_msfilter(Ptr<runtime.sock> sk, Ptr<GroupDefinitions.group_filter> gsf, Ptr<KernelDefinitions.__kernel_sockaddr_storage> list) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mc_source(int add, int omode, Ptr<runtime.sock> sk, Ptr<GroupDefinitions.group_source_req> pgsr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_mr_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_mr_forward(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt, Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.mfc6_cache> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mr_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mroute_getsockopt(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_mroute_setsockopt(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_protocol_deliver_rcu(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, int nexthdr, boolean have_final) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_ra_control(Ptr<runtime.sock> sk, int sel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ip6_rcv_core(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_rcv_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_sublist_rcv(Ptr<ListDefinitions.list_head> head, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_sublist_rcv_finish(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_tun_build_state($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int ip6_tun_build_state(Ptr<runtime.net> net2, Ptr<runtime.nlattr> attr2, @Unsigned int family, Ptr<?> cfg, Ptr<Ptr<LwtunnelDefinitions.lwtunnel_state>> ts, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_tun_encap_nlsize(Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_tun_fill_encap_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip6_del_rt_siblings(Ptr<Fib6Definitions.fib6_info> rt, Ptr<Fib6Definitions.fib6_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ip6_flush_pending_frames(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff_head> queue, Ptr<InetDefinitions.inet_cork_full> cork, Ptr<Inet6Definitions.inet6_cork> v6_cork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __ip6_make_skb(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff_head> queue, Ptr<InetDefinitions.inet_cork_full> cork, Ptr<Inet6Definitions.inet6_cork> v6_cork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ip6_route_redirect($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, $arg5)")
    public static Ptr<Rt6Definitions.rt6_info> __ip6_route_redirect(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_table> table, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ip6_rt_update_pmtu($arg1, (const struct sock*)$arg2, (const struct ipv6hdr*)$arg3, $arg4, $arg5)")
    public static void __ip6_rt_update_pmtu(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<runtime.ipv6hdr> iph, @Unsigned int mtu, boolean confirm_neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_append_data($arg1, (int (*)(void*, u8*, int, int, int, struct sk_buff*))$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static int ip6_append_data(Ptr<runtime.sock> sk, Ptr<?> getfrag, Ptr<?> from, @Unsigned long length, int transhdrlen, Ptr<misc.ipcm6_cookie> ipc6, Ptr<runtime.flowi6> fl6, Ptr<Rt6Definitions.rt6_info> rt, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_autoflowlabel($arg1, (const struct sock*)$arg2)")
    public static boolean ip6_autoflowlabel(Ptr<runtime.net> net2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> ip6_blackhole_route(Ptr<runtime.net> net2, Ptr<DstDefinitions.dst_entry> dst_orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_confirm_neigh((const struct dst_entry*)$arg1, (const void*)$arg2)")
    public static void ip6_confirm_neigh(Ptr<DstDefinitions.dst_entry> dst, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_copy_metadata(Ptr<SkDefinitions.sk_buff> to, Ptr<SkDefinitions.sk_buff> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_cork_release(Ptr<InetDefinitions.inet_cork_full> cork, Ptr<Inet6Definitions.inet6_cork> v6_cork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_create_rt_rcu((const struct fib6_result*)$arg1)")
    public static Ptr<Rt6Definitions.rt6_info> ip6_create_rt_rcu(Ptr<Fib6Definitions.fib6_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_default_advmss((const struct dst_entry*)$arg1)")
    public static @Unsigned int ip6_default_advmss(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_del_cached_rt(Ptr<Fib6Definitions.fib6_config> cfg, Ptr<Fib6Definitions.fib6_info> rt, Ptr<Fib6Definitions.fib6_nh> nh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_del_rt(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_info> rt, boolean skip_notify) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Rt6Definitions.rt6_info> ip6_dst_alloc(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> ip6_dst_check(Ptr<DstDefinitions.dst_entry> dst, @Unsigned int cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_dst_destroy(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_dst_gc(Ptr<DstDefinitions.dst_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_dst_ifdown(Ptr<DstDefinitions.dst_entry> dst, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_dst_lookup(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<Ptr<DstDefinitions.dst_entry>> dst, Ptr<runtime.flowi6> fl6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_dst_lookup_flow($arg1, (const struct sock*)$arg2, $arg3, (const struct in6_addr*)$arg4)")
    public static Ptr<DstDefinitions.dst_entry> ip6_dst_lookup_flow(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, Ptr<In6Definitions.in6_addr> final_dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_dst_lookup_tail($arg1, (const struct sock*)$arg2, $arg3, $arg4)")
    public static int ip6_dst_lookup_tail(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<Ptr<DstDefinitions.dst_entry>> dst, Ptr<runtime.flowi6> fl6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_dst_neigh_lookup((const struct dst_entry*)$arg1, $arg2, (const void*)$arg3)")
    public static Ptr<runtime.neighbour> ip6_dst_neigh_lookup(Ptr<DstDefinitions.dst_entry> dst, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_finish_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_finish_output2(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_fl_gc(Ptr<TimerDefinitions.timer_list> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_flowlabel_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_flowlabel_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_flowlabel_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_flowlabel_proc_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_flush_pending_frames(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_forward(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_forward_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_frag_init(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hlen, @Unsigned int mtu, @Unsigned short needed_tailroom, int hdr_room, Ptr<Character> prevhdr, char nexthdr, @Unsigned @OriginalName(value="__be32") int frag_id, Ptr<ip6_frag_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ip6_frag_next(Ptr<SkDefinitions.sk_buff> skb, Ptr<ip6_frag_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_fraglist_init(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hlen, Ptr<Character> prevhdr, char nexthdr, @Unsigned @OriginalName(value="__be32") int frag_id, Ptr<ip6_fraglist_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_fraglist_prepare(Ptr<SkDefinitions.sk_buff> skb, Ptr<ip6_fraglist_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_fragment($arg1, $arg2, $arg3, (int (*)(struct net*, struct sock*, struct sk_buff*))$arg4)")
    public static int ip6_fragment(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ip6_hold_safe(Ptr<runtime.net> net2, Ptr<Ptr<Rt6Definitions.rt6_info>> prt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_ins_rt(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_link_failure(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_make_skb($arg1, (int (*)(void*, u8*, int, int, int, struct sk_buff*))$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<SkDefinitions.sk_buff> ip6_make_skb(Ptr<runtime.sock> sk, Ptr<?> getfrag, Ptr<?> from, @Unsigned long length, int transhdrlen, Ptr<misc.ipcm6_cookie> ipc6, Ptr<Rt6Definitions.rt6_info> rt, @Unsigned int flags, Ptr<InetDefinitions.inet_cork_full> cork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_mtu((const struct dst_entry*)$arg1)")
    public static @Unsigned int ip6_mtu(Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_mtu_from_fib6((const struct fib6_result*)$arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static @Unsigned int ip6_mtu_from_fib6(Ptr<Fib6Definitions.fib6_result> res, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_multipath_l3_keys((const struct sk_buff*)$arg1, $arg2, $arg3)")
    public static void ip6_multipath_l3_keys(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_keys> keys, Ptr<FlowDefinitions.flow_keys> flkeys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_negative_advice(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_neigh_lookup((const struct in6_addr*)$arg1, $arg2, $arg3, (const void*)$arg4)")
    public static Ptr<runtime.neighbour> ip6_neigh_lookup(Ptr<In6Definitions.in6_addr> gw, Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_pkt_discard(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_pkt_discard_out(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_pkt_drop(Ptr<SkDefinitions.sk_buff> skb, char code2, int ipstats_mib_noroutes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_pkt_prohibit(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_pkt_prohibit_out(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_pol_route($arg1, $arg2, $arg3, $arg4, (const struct sk_buff*)$arg5, $arg6)")
    public static Ptr<Rt6Definitions.rt6_info> ip6_pol_route(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_table> table, int oif, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_pol_route_input($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, $arg5)")
    public static Ptr<Rt6Definitions.rt6_info> ip6_pol_route_input(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_table> table, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_pol_route_lookup($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, $arg5)")
    public static Ptr<Rt6Definitions.rt6_info> ip6_pol_route_lookup(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_table> table, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_pol_route_output($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, $arg5)")
    public static Ptr<Rt6Definitions.rt6_info> ip6_pol_route_output(Ptr<runtime.net> net2, Ptr<Fib6Definitions.fib6_table> table, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_push_pending_frames(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_redirect(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2, int oif, @Unsigned int mark, misc.kuid_t uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_redirect_nh_match((const struct fib6_result*)$arg1, $arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static boolean ip6_redirect_nh_match(Ptr<Fib6Definitions.fib6_result> res, Ptr<runtime.flowi6> fl6, Ptr<In6Definitions.in6_addr> gw, Ptr<Ptr<Rt6Definitions.rt6_info>> ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_redirect_no_header(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2, int oif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_add(Ptr<Fib6Definitions.fib6_config> cfg, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_route_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_del(Ptr<Fib6Definitions.fib6_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_dev_notify(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Fib6Definitions.fib6_info> ip6_route_info_create(Ptr<Fib6Definitions.fib6_config> cfg, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_route_init_special_entries() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_route_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_route_input_lookup($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4, $arg5)")
    public static Ptr<DstDefinitions.dst_entry> ip6_route_input_lookup(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_route_lookup($arg1, $arg2, (const struct sk_buff*)$arg3, $arg4)")
    public static Ptr<DstDefinitions.dst_entry> ip6_route_lookup(Ptr<runtime.net> net2, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_route_mpath_notify(Ptr<Fib6Definitions.fib6_info> rt, Ptr<Fib6Definitions.fib6_info> rt_last, Ptr<misc.nl_info> info2, @Unsigned short nlflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_multipath_add(Ptr<Fib6Definitions.fib6_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_multipath_del(Ptr<Fib6Definitions.fib6_config> cfg, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_route_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_route_net_exit_late(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_net_init_late(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_route_output_flags($arg1, (const struct sock*)$arg2, $arg3, $arg4)")
    public static Ptr<DstDefinitions.dst_entry> ip6_route_output_flags(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_route_redirect($arg1, (const struct flowi6*)$arg2, (const struct sk_buff*)$arg3, (const struct in6_addr*)$arg4)")
    public static Ptr<DstDefinitions.dst_entry> ip6_route_redirect(Ptr<runtime.net> net2, Ptr<runtime.flowi6> fl6, Ptr<SkDefinitions.sk_buff> skb, Ptr<In6Definitions.in6_addr> gateway) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_rt_cache_alloc((const struct fib6_result*)$arg1, (const struct in6_addr*)$arg2, (const struct in6_addr*)$arg3)")
    public static Ptr<Rt6Definitions.rt6_info> ip6_rt_cache_alloc(Ptr<Fib6Definitions.fib6_result> res, Ptr<In6Definitions.in6_addr> daddr, Ptr<In6Definitions.in6_addr> saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_rt_copy_init($arg1, (const struct fib6_result*)$arg2)")
    public static void ip6_rt_copy_init(Ptr<Rt6Definitions.rt6_info> rt, Ptr<Fib6Definitions.fib6_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_rt_get_dev_rcu((const struct fib6_result*)$arg1)")
    public static Ptr<NetDefinitions.net_device> ip6_rt_get_dev_rcu(Ptr<Fib6Definitions.fib6_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_rt_update_pmtu(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu, boolean confirm_neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_send_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_setup_cork(Ptr<runtime.sock> sk, Ptr<InetDefinitions.inet_cork_full> cork, Ptr<Inet6Definitions.inet6_cork> v6_cork, Ptr<misc.ipcm6_cookie> ipc6, Ptr<Rt6Definitions.rt6_info> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_sk_dst_lookup_flow($arg1, $arg2, (const struct in6_addr*)$arg3, $arg4)")
    public static Ptr<DstDefinitions.dst_entry> ip6_sk_dst_lookup_flow(Ptr<runtime.sock> sk, Ptr<runtime.flowi6> fl6, Ptr<In6Definitions.in6_addr> final_dst, boolean connected) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_sk_dst_store_flow($arg1, $arg2, (const struct flowi6*)$arg3)")
    public static void ip6_sk_dst_store_flow(Ptr<runtime.sock> sk, Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.flowi6> fl6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_sk_redirect(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_sk_update_pmtu(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="__be32") int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_update_pmtu(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int mtu, int oif, @Unsigned int mark, misc.kuid_t uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip6_xmit((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7)")
    public static int ip6_xmit(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi6> fl6, @Unsigned int mark, Ptr<Ipv6Definitions.ipv6_txoptions> opt, int tclass, @Unsigned int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip6_frag_expire(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_frag_queue(Ptr<misc.frag_queue> fq, Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.frag_hdr> fhdr, int nhoff, Ptr<@Unsigned Integer> prob_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_frag_reasm(Ptr<misc.frag_queue> fq, Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff> prev_tail, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ip6_parse_tlv(boolean hopbyhop, Ptr<SkDefinitions.sk_buff> skb, int max_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip6_route_me_harder(Ptr<runtime.net> net2, Ptr<runtime.sock> sk_partial, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ip6_tlvopt_unknown(Ptr<SkDefinitions.sk_buff> skb, int optoff, boolean disallow_unknowns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct __ip6_tnl_parm")
    @NotUsableInJava
    public static class __ip6_tnl_parm
    extends Struct {
        public char @Size(value=16) [] name;
        public int link;
        public char proto;
        public char encap_limit;
        public char hop_limit;
        public boolean collect_md;
        public @Unsigned @OriginalName(value="__be32") int flowinfo;
        public @Unsigned int flags;
        public In6Definitions.in6_addr laddr;
        public In6Definitions.in6_addr raddr;
        public @Unsigned long @Size(value=1) [] i_flags;
        public @Unsigned long @Size(value=1) [] o_flags;
        public @Unsigned @OriginalName(value="__be32") int i_key;
        public @Unsigned @OriginalName(value="__be32") int o_key;
        public @Unsigned int fwmark;
        public @Unsigned int index;
        public char erspan_ver;
        public char dir;
        public @Unsigned short hwid;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_tnl")
    @NotUsableInJava
    public static class ip6_tnl
    extends Struct {
        public Ptr<ip6_tnl> next;
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public Ptr<runtime.net> net;
        public __ip6_tnl_parm parms;
        public runtime.flowi fl;
        public DstDefinitions.dst_cache dst_cache;
        public GroDefinitions.gro_cells gro_cells;
        public int err_count;
        public @Unsigned long err_time;
        public @Unsigned int i_seqno;
        public AtomicDefinitions.atomic_t o_seqno;
        public int hlen;
        public int tun_hlen;
        public int encap_hlen;
        public IpDefinitions.ip_tunnel_encap encap;
        public int mlink;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_ra_chain")
    @NotUsableInJava
    public static class ip6_ra_chain
    extends Struct {
        public Ptr<ip6_ra_chain> next;
        public Ptr<runtime.sock> sk;
        public int sel;
        public Ptr<?> destructor;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_mtuinfo")
    @NotUsableInJava
    public static class ip6_mtuinfo
    extends Struct {
        public misc.sockaddr_in6 ip6m_addr;
        public @Unsigned int ip6m_mtu;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_rt_info")
    @NotUsableInJava
    public static class ip6_rt_info
    extends Struct {
        public In6Definitions.in6_addr daddr;
        public In6Definitions.in6_addr saddr;
        public @Unsigned @OriginalName(value="u_int32_t") int mark;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_frag_state")
    @NotUsableInJava
    public static class ip6_frag_state
    extends Struct {
        public Ptr<Character> prevhdr;
        public @Unsigned int hlen;
        public @Unsigned int mtu;
        public @Unsigned int left;
        public int offset;
        public int ptr;
        public int hroom;
        public int troom;
        public @Unsigned @OriginalName(value="__be32") int frag_id;
        public char nexthdr;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_fraglist_iter")
    @NotUsableInJava
    public static class ip6_fraglist_iter
    extends Struct {
        public Ptr<runtime.ipv6hdr> tmp_hdr;
        public Ptr<SkDefinitions.sk_buff> frag;
        public int offset;
        public @Unsigned int hlen;
        public @Unsigned @OriginalName(value="__be32") int frag_id;
        public char nexthdr;
    }

    @Type(noCCodeGeneration=true, cType="enum ip6_defrag_users")
    public static enum ip6_defrag_users implements Enum<ip6_defrag_users>,
    TypedEnum<ip6_defrag_users, Integer>
    {
        IP6_DEFRAG_LOCAL_DELIVER,
        IP6_DEFRAG_CONNTRACK_IN,
        __IP6_DEFRAG_CONNTRACK_IN,
        IP6_DEFRAG_CONNTRACK_OUT,
        __IP6_DEFRAG_CONNTRACK_OUT,
        IP6_DEFRAG_CONNTRACK_BRIDGE_IN,
        __IP6_DEFRAG_CONNTRACK_BRIDGE_IN;

    }

    @Type(noCCodeGeneration=true, cType="struct ip6_tnl_encap_ops")
    @NotUsableInJava
    public static class ip6_tnl_encap_ops
    extends Struct {
        public Ptr<?> encap_hlen;
        public Ptr<?> build_header;
        public Ptr<?> err_handler;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_flowlabel")
    @NotUsableInJava
    public static class ip6_flowlabel
    extends Struct {
        public Ptr<ip6_flowlabel> next;
        public @Unsigned @OriginalName(value="__be32") int label;
        public AtomicDefinitions.atomic_t users;
        public In6Definitions.in6_addr dst;
        public Ptr<Ipv6Definitions.ipv6_txoptions> opt;
        public @Unsigned long linger;
        public misc.callback_head rcu;
        public char share;
        public misc.owner_of_ip6_flowlabel owner;
        public @Unsigned long lastuse;
        public @Unsigned long expires;
        public Ptr<runtime.net> fl_net;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_sf_socklist")
    @NotUsableInJava
    public static class ip6_sf_socklist
    extends Struct {
        public @Unsigned int sl_max;
        public @Unsigned int sl_count;
        public misc.callback_head rcu;
        public In6Definitions.in6_addr @Size(value=0) [] sl_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct ip6_sf_list")
    @NotUsableInJava
    public static class ip6_sf_list
    extends Struct {
        public Ptr<ip6_sf_list> sf_next;
        public In6Definitions.in6_addr sf_addr;
        public @Unsigned long @Size(value=2) [] sf_count;
        public char sf_gsresp;
        public char sf_oldin;
        public char sf_crcount;
        public misc.callback_head rcu;
    }
}

