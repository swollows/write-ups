/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.GroDefinitions;
import me.bechberger.ebpf.runtime.GroupDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.InetDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LwtunnelDefinitions;
import me.bechberger.ebpf.runtime.MrDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.SctpDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class IpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__ip_append_data($arg1, $arg2, $arg3, $arg4, $arg5, (int (*)(void*, u8*, int, int, int, struct sk_buff*))$arg6, $arg7, $arg8, $arg9, $arg10)")
    public static int __ip_append_data(Ptr<runtime.sock> sk, Ptr<runtime.flowi4> fl4, Ptr<SkDefinitions.sk_buff_head> queue, Ptr<InetDefinitions.inet_cork> cork, Ptr<PageDefinitions.page_frag> pfrag, Ptr<?> getfrag, Ptr<?> from, int length, int transhdrlen, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip_finish_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip_local_out(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __ip_make_skb(Ptr<runtime.sock> sk, Ptr<runtime.flowi4> fl4, Ptr<SkDefinitions.sk_buff_head> queue, Ptr<InetDefinitions.inet_cork> cork) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip_queue_xmit(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl, char tos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_addr_string($arg1, $arg2, (const void*)$arg3, $arg4, (const u8*)$arg5)")
    public static String ip_addr_string(String buf, String end, Ptr<?> ptr, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_append_data($arg1, $arg2, (int (*)(void*, u8*, int, int, int, struct sk_buff*))$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static int ip_append_data(Ptr<runtime.sock> sk, Ptr<runtime.flowi4> fl4, Ptr<?> getfrag, Ptr<?> from, int length, int transhdrlen, Ptr<misc.ipcm_cookie> ipc, Ptr<Ptr<runtime.rtable>> rtp, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_build_and_send_pkt($arg1, (const struct sock*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int ip_build_and_send_pkt(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be32") int daddr, Ptr<ip_options_rcu> opt, char tos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ip_check_defrag(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_copy_metadata(Ptr<SkDefinitions.sk_buff> to, Ptr<SkDefinitions.sk_buff> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_defrag(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_do_fragment($arg1, $arg2, $arg3, (int (*)(struct net*, struct sock*, struct sk_buff*))$arg4)")
    public static int ip_do_fragment(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_expire(Ptr<TimerDefinitions.timer_list> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_finish_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_finish_output2(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_flush_pending_frames(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_frag_init(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int hlen, @Unsigned int ll_rs, @Unsigned int mtu, boolean DF, Ptr<ip_frag_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ip_frag_next(Ptr<SkDefinitions.sk_buff> skb, Ptr<ip_frag_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_frag_queue(Ptr<ipq> qp, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_frag_reasm(Ptr<ipq> qp, Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff> prev_tail, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_fraglist_init(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.iphdr> iph, @Unsigned int hlen, Ptr<ip_fraglist_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_fraglist_prepare(Ptr<SkDefinitions.sk_buff> skb, Ptr<ip_fraglist_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_fragment($arg1, $arg2, $arg3, $arg4, (int (*)(struct net*, struct sock*, struct sk_buff*))$arg5)")
    public static int ip_fragment(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu, Ptr<?> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_generic_getfrag(Ptr<?> from, String to, int offset, int len, int odd, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_ipgre_mc_map($arg1, (const u8*)$arg2, $arg3)")
    public static void ip_ipgre_mc_map(@Unsigned @OriginalName(value="__be32") int naddr, String broadcast, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_local_out(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_make_skb($arg1, $arg2, (int (*)(void*, u8*, int, int, int, struct sk_buff*))$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10)")
    public static Ptr<SkDefinitions.sk_buff> ip_make_skb(Ptr<runtime.sock> sk, Ptr<runtime.flowi4> fl4, Ptr<?> getfrag, Ptr<?> from, int length, int transhdrlen, Ptr<misc.ipcm_cookie> ipc, Ptr<Ptr<runtime.rtable>> rtp, Ptr<InetDefinitions.inet_cork> cork, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_finish_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_output(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_push_pending_frames(Ptr<runtime.sock> sk, Ptr<runtime.flowi4> fl4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_queue_xmit(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_reply_glue_bits(Ptr<?> dptr, String to, int offset, int len, int odd, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_send_check(Ptr<runtime.iphdr> iph) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_send_skb(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_send_unicast_reply($arg1, $arg2, (const struct ip_options*)$arg3, $arg4, $arg5, (const struct ip_reply_arg*)$arg6, $arg7, $arg8, $arg9)")
    public static void ip_send_unicast_reply(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, Ptr<ip_options> sopt, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr, Ptr<ip_reply_arg> arg2, @Unsigned int len, @Unsigned long transmit_time, @Unsigned int txhash) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_setup_cork(Ptr<runtime.sock> sk, Ptr<InetDefinitions.inet_cork> cork, Ptr<misc.ipcm_cookie> ipc, Ptr<Ptr<runtime.rtable>> rtp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_skb_dst_mtu($arg1, (const struct sk_buff*)$arg2)")
    public static @Unsigned int ip_skb_dst_mtu(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_tunnel_info_opts_get($arg1, (const struct ip_tunnel_info*)$arg2)")
    public static void ip_tunnel_info_opts_get(Ptr<?> to, Ptr<ip_tunnel_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> __ip_dev_find(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int addr2, boolean devref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_compute_csum((const void*)$arg1, $arg2)")
    public static @Unsigned @OriginalName(value="__sum16") short ip_compute_csum(Ptr<?> buff, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_fib_check_default(@Unsigned @OriginalName(value="__be32") int gw, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_forward(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_forward_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_misc_proc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_proc_exit_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_proc_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_tun_build_state($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6)")
    public static int ip_tun_build_state(Ptr<runtime.net> net2, Ptr<runtime.nlattr> attr2, @Unsigned int family, Ptr<?> cfg, Ptr<Ptr<LwtunnelDefinitions.lwtunnel_state>> ts, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_tun_cmp_encap(Ptr<LwtunnelDefinitions.lwtunnel_state> a, Ptr<LwtunnelDefinitions.lwtunnel_state> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_tun_destroy_state(Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_tun_encap_nlsize(Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_tun_fill_encap_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<LwtunnelDefinitions.lwtunnel_state> lwtstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_tun_opts_nlsize(Ptr<ip_tunnel_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_tun_parse_opts(Ptr<runtime.nlattr> attr2, Ptr<ip_tunnel_info> info2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_tun_parse_opts_geneve(Ptr<runtime.nlattr> attr2, Ptr<ip_tunnel_info> info2, int opts_len, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_tunnel_core_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_tunnel_need_metadata() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ip_tunnel_netlink_encap_parms(Ptr<Ptr<runtime.nlattr>> data, Ptr<ip_tunnel_encap> encap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_tunnel_netlink_parms(Ptr<Ptr<runtime.nlattr>> data, Ptr<ip_tunnel_parm_kern> parms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_tunnel_parse_protocol((const struct sk_buff*)$arg1)")
    public static @Unsigned @OriginalName(value="__be16") short ip_tunnel_parse_protocol(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_tunnel_unneed_metadata() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ip_do_redirect(Ptr<runtime.rtable> rt, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.flowi4> fl4, boolean kill_route) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip_options_compile(Ptr<runtime.net> net2, Ptr<ip_options> opt, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned @OriginalName(value="__be32") Integer> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__ip_options_echo($arg1, $arg2, $arg3, (const struct ip_options*)$arg4)")
    public static int __ip_options_echo(Ptr<runtime.net> net2, Ptr<ip_options> dopt, Ptr<SkDefinitions.sk_buff> skb, Ptr<ip_options> sopt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ip_rt_update_pmtu(Ptr<runtime.rtable> rt, Ptr<runtime.flowi4> fl4, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ip_select_ident(Ptr<runtime.net> net2, Ptr<runtime.iphdr> iph, int segs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_do_redirect(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_encap(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be32") int daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_error(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_fib_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_metrics> ip_fib_metrics_init(Ptr<runtime.nlattr> fc_mx, int fc_mx_len, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_fib_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_forward_options(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_handle_martian_source(Ptr<NetDefinitions.net_device> dev, Ptr<InDefinitions.in_device> in_dev, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_icmp_error_rfc4884((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static void ip_icmp_error_rfc4884(Ptr<SkDefinitions.sk_buff> skb, Ptr<SockDefinitions.sock_ee_data_rfc4884> out, int thlen, int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_validate_source(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr, char tos, Ptr<NetDefinitions.net_device> dev, Ptr<InDefinitions.in_device> in_dev, Ptr<@Unsigned Integer> itag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_metrics_convert(Ptr<runtime.nlattr> fc_mx, int fc_mx_len, Ptr<@Unsigned Integer> metrics, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mr_forward(Ptr<runtime.net> net2, Ptr<MrDefinitions.mr_table> mrt, Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<misc.mfc_cache> c, int local) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mr_input(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mroute_getsockopt(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mroute_setsockopt(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ip_mtu_from_fib_result(Ptr<FibDefinitions.fib_result> res, @Unsigned @OriginalName(value="__be32") int daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_multipath_l3_keys((const struct sk_buff*)$arg1, $arg2)")
    public static void ip_multipath_l3_keys(Ptr<SkDefinitions.sk_buff> skb, Ptr<FlowDefinitions.flow_keys> hash_keys) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_options_build(Ptr<SkDefinitions.sk_buff> skb, Ptr<ip_options> opt, @Unsigned @OriginalName(value="__be32") int daddr, Ptr<runtime.rtable> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_options_compile(Ptr<runtime.net> net2, Ptr<ip_options> opt, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_options_fragment(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_options_get(Ptr<runtime.net> net2, Ptr<Ptr<ip_options_rcu>> optp, misc.sockptr_t data, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_options_rcv_srr(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_options_undo(Ptr<ip_options> opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_route_input_noref(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr, char tos, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_route_input_rcu(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr, char tos, Ptr<NetDefinitions.net_device> dev, Ptr<FibDefinitions.fib_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_route_input_slow(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr, char tos, Ptr<NetDefinitions.net_device> dev, Ptr<FibDefinitions.fib_result> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_route_output_flow($arg1, $arg2, (const struct sock*)$arg3)")
    public static Ptr<runtime.rtable> ip_route_output_flow(Ptr<runtime.net> net2, Ptr<runtime.flowi4> flp4, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_route_output_key_hash($arg1, $arg2, (const struct sk_buff*)$arg3)")
    public static Ptr<runtime.rtable> ip_route_output_key_hash(Ptr<runtime.net> net2, Ptr<runtime.flowi4> fl4, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_route_output_key_hash_rcu($arg1, $arg2, $arg3, (const struct sk_buff*)$arg4)")
    public static Ptr<runtime.rtable> ip_route_output_key_hash_rcu(Ptr<runtime.net> net2, Ptr<runtime.flowi4> fl4, Ptr<FibDefinitions.fib_result> res, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_route_use_hint($arg1, $arg2, $arg3, $arg4, $arg5, (const struct sk_buff*)$arg6)")
    public static int ip_route_use_hint(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be32") int saddr, char tos, Ptr<NetDefinitions.net_device> dev, Ptr<SkDefinitions.sk_buff> hint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_rt_bug(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_rt_do_proc_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_rt_do_proc_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_rt_get_source(Ptr<Character> addr2, Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.rtable> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_rt_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_rt_ioctl(Ptr<runtime.net> net2, @Unsigned int cmd, Ptr<runtime.rtentry> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_rt_multicast_event(Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_rt_send_redirect(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_rt_update_pmtu(Ptr<DstDefinitions.dst_entry> dst, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu, boolean confirm_neigh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_static_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_valid_fib_dump_req($arg1, (const struct nlmsghdr*)$arg2, $arg3, $arg4)")
    public static int ip_valid_fib_dump_req(Ptr<runtime.net> net2, Ptr<runtime.nlmsghdr> nlh, Ptr<FibDefinitions.fib_dump_filter> filter, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ____ip_mc_inc_group(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int addr2, @Unsigned int mode, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ip_mc_dec_group(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int addr2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ip_mc_inc_group(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int addr2, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ip_mc_join_group(Ptr<runtime.sock> sk, Ptr<ip_mreqn> imr, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ip_sock_set_tos(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ip_call_ra_chain(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_check_mc_rcu(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int mc_addr, @Unsigned @OriginalName(value="__be32") int src_addr, char proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_cmsg_recv_offset(Ptr<runtime.msghdr> msg, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int tlen, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_cmsg_send(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, Ptr<misc.ipcm_cookie> ipc, boolean allow_ipv6) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_get_mcast_msfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, misc.sockptr_t optlen, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_getsockopt(Ptr<runtime.sock> sk, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_icmp_error(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int err, @Unsigned @OriginalName(value="__be16") short port2, @Unsigned int info2, Ptr<Character> payload) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_list_rcv(Ptr<ListDefinitions.list_head> head, Ptr<PacketDefinitions.packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_local_deliver(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_local_deliver_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_local_error(Ptr<runtime.sock> sk, int err, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned @OriginalName(value="__be16") short port2, @Unsigned int info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_ma_put(Ptr<ip_mc_list> im) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_add_src(Ptr<InDefinitions.in_device> in_dev, Ptr<@Unsigned @OriginalName(value="__be32") Integer> pmca, int sfmode, int sfcount, Ptr<@Unsigned @OriginalName(value="__be32") Integer> psfsrc, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_check_igmp(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_clear_src(Ptr<ip_mc_list> pmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_del1_src(Ptr<ip_mc_list> pmc, int sfmode, Ptr<@Unsigned @OriginalName(value="__be32") Integer> psfsrc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_del_src(Ptr<InDefinitions.in_device> in_dev, Ptr<@Unsigned @OriginalName(value="__be32") Integer> pmca, int sfmode, int sfcount, Ptr<@Unsigned @OriginalName(value="__be32") Integer> psfsrc, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_destroy_dev(Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_down(Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_drop_socket(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<InDefinitions.in_device> ip_mc_find_dev(Ptr<runtime.net> net2, Ptr<ip_mreqn> imr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_gsfget(Ptr<runtime.sock> sk, Ptr<GroupDefinitions.group_filter> gsf, misc.sockptr_t optval, @Unsigned long ss_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_inc_group(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_init_dev(Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_join_group(Ptr<runtime.sock> sk, Ptr<ip_mreqn> imr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_join_group_ssm(Ptr<runtime.sock> sk, Ptr<ip_mreqn> imr, @Unsigned int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_leave_group(Ptr<runtime.sock> sk, Ptr<ip_mreqn> imr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_leave_src(Ptr<runtime.sock> sk, Ptr<ip_mc_socklist> iml, Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_msfget(Ptr<runtime.sock> sk, Ptr<ip_msfilter> msf, misc.sockptr_t optval, misc.sockptr_t optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_msfilter(Ptr<runtime.sock> sk, Ptr<ip_msfilter> msf, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_remap(Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_mc_sf_allow((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int ip_mc_sf_allow(Ptr<runtime.sock> sk, @Unsigned @OriginalName(value="__be32") int loc_addr, @Unsigned @OriginalName(value="__be32") int rmt_addr, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mc_source(int add, int omode, Ptr<runtime.sock> sk, Ptr<ip_mreq_source> mreqs, int ifindex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_unmap(Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_mc_up(Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__sum16") short ip_mc_validate_checksum(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_mcast_join_leave(Ptr<runtime.sock> sk, int optname, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_protocol_deliver_rcu(Ptr<runtime.net> net2, Ptr<SkDefinitions.sk_buff> skb, int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ip_ra_control($arg1, $arg2, (void (*)(struct sock*))$arg3)")
    public static int ip_ra_control(Ptr<runtime.sock> sk, char on, Ptr<?> destructor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_ra_destroy_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_rcv(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<PacketDefinitions.packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ip_rcv_core(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_rcv_finish(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ip_rcv_options(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_recv_error(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, int len, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_route_me_harder(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int addr_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_set_mcast_msfilter(Ptr<runtime.sock> sk, misc.sockptr_t optval, int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_setsockopt(Ptr<runtime.sock> sk, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_sock_set_freebind(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ip_sock_set_mtu_discover(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_sock_set_pktinfo(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_sock_set_recverr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_sock_set_tos(Ptr<runtime.sock> sk, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_sublist_rcv(Ptr<ListDefinitions.list_head> head, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ip_sublist_rcv_finish(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ipq")
    @NotUsableInJava
    public static class ipq
    extends Struct {
        public InetDefinitions.inet_frag_queue q;
        public char ecn;
        public @Unsigned short max_df_size;
        public int iif;
        public @Unsigned int rid;
        public Ptr<InetDefinitions.inet_peer> peer;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel_fan")
    @NotUsableInJava
    public static class ip_tunnel_fan
    extends Struct {
        public ListDefinitions.list_head fan_maps;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel_prl_entry")
    @NotUsableInJava
    public static class ip_tunnel_prl_entry
    extends Struct {
        public Ptr<ip_tunnel_prl_entry> next;
        public @Unsigned @OriginalName(value="__be32") int addr;
        public @Unsigned short flags;
        public misc.callback_head callback_head;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel_6rd_parm")
    @NotUsableInJava
    public static class ip_tunnel_6rd_parm
    extends Struct {
        public In6Definitions.in6_addr prefix;
        public @Unsigned @OriginalName(value="__be32") int relay_prefix;
        public @Unsigned short prefixlen;
        public @Unsigned short relay_prefixlen;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel")
    @NotUsableInJava
    public static class ip_tunnel
    extends Struct {
        public Ptr<ip_tunnel> next;
        public misc.hlist_node hash_node;
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public Ptr<runtime.net> net;
        public @Unsigned long err_time;
        public int err_count;
        public @Unsigned int i_seqno;
        public AtomicDefinitions.atomic_t o_seqno;
        public int tun_hlen;
        public @Unsigned int index;
        public char erspan_ver;
        public char dir;
        public @Unsigned short hwid;
        public DstDefinitions.dst_cache dst_cache;
        public ip_tunnel_parm_kern parms;
        public int mlink;
        public int encap_hlen;
        public int hlen;
        public ip_tunnel_encap encap;
        public ip_tunnel_6rd_parm ip6rd;
        public Ptr<ip_tunnel_prl_entry> prl;
        public @Unsigned int prl_count;
        public ip_tunnel_fan fan;
        public @Unsigned int ip_tnl_net_id;
        public GroDefinitions.gro_cells gro_cells;
        public @Unsigned int fwmark;
        public boolean collect_md;
        public boolean ignore_df;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int ipv4_addr; struct in6_addr ipv6_addr; }")
    @NotUsableInJava
    public static class ip_addr_of_addr_of_ident_of_icmp_ext_echo_iio
    extends Union {
        public @Unsigned @OriginalName(value="__be32") int ipv4_addr;
        public In6Definitions.in6_addr ipv6_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_beet_phdr")
    @NotUsableInJava
    public static class ip_beet_phdr
    extends Struct {
        public char nexthdr;
        public char hdrlen;
        public char padlen;
        public char reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_rt_info")
    @NotUsableInJava
    public static class ip_rt_info
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int daddr;
        public @Unsigned @OriginalName(value="__be32") int saddr;
        public @OriginalName(value="u_int8_t") char tos;
        public @Unsigned @OriginalName(value="u_int32_t") int mark;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_reply_arg")
    @NotUsableInJava
    public static class ip_reply_arg
    extends Struct {
        public runtime.kvec @Size(value=1) [] iov;
        public int flags;
        public @Unsigned @OriginalName(value="__wsum") int csum;
        public int csumoffset;
        public int bound_dev_if;
        public char tos;
        public misc.kuid_t uid;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_frag_state")
    @NotUsableInJava
    public static class ip_frag_state
    extends Struct {
        public boolean DF;
        public @Unsigned int hlen;
        public @Unsigned int ll_rs;
        public @Unsigned int mtu;
        public @Unsigned int left;
        public int offset;
        public int ptr;
        public @Unsigned @OriginalName(value="__be16") short not_last_frag;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_fraglist_iter")
    @NotUsableInJava
    public static class ip_fraglist_iter
    extends Struct {
        public Ptr<SkDefinitions.sk_buff> frag;
        public Ptr<runtime.iphdr> iph;
        public int offset;
        public @Unsigned int hlen;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_esp_hdr")
    @NotUsableInJava
    public static class ip_esp_hdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int spi;
        public @Unsigned @OriginalName(value="__be32") int seq_no;
        public char @Size(value=0) [] enc_data;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_auth_hdr")
    @NotUsableInJava
    public static class ip_auth_hdr
    extends Struct {
        public char nexthdr;
        public char hdrlen;
        public @Unsigned @OriginalName(value="__be16") short reserved;
        public @Unsigned @OriginalName(value="__be32") int spi;
        public @Unsigned @OriginalName(value="__be32") int seq_no;
        public char @Size(value=0) [] auth_data;
    }

    @Type(noCCodeGeneration=true, cType="enum ip_conntrack_status")
    public static enum ip_conntrack_status implements Enum<ip_conntrack_status>,
    TypedEnum<ip_conntrack_status, Integer>
    {
        IPS_EXPECTED_BIT,
        IPS_EXPECTED,
        IPS_SEEN_REPLY_BIT,
        IPS_SEEN_REPLY,
        IPS_ASSURED_BIT,
        IPS_ASSURED,
        IPS_CONFIRMED_BIT,
        IPS_CONFIRMED,
        IPS_SRC_NAT_BIT,
        IPS_SRC_NAT,
        IPS_DST_NAT_BIT,
        IPS_DST_NAT,
        IPS_NAT_MASK,
        IPS_SEQ_ADJUST_BIT,
        IPS_SEQ_ADJUST,
        IPS_SRC_NAT_DONE_BIT,
        IPS_SRC_NAT_DONE,
        IPS_DST_NAT_DONE_BIT,
        IPS_DST_NAT_DONE,
        IPS_NAT_DONE_MASK,
        IPS_DYING_BIT,
        IPS_DYING,
        IPS_FIXED_TIMEOUT_BIT,
        IPS_FIXED_TIMEOUT,
        IPS_TEMPLATE_BIT,
        IPS_TEMPLATE,
        IPS_UNTRACKED_BIT,
        IPS_UNTRACKED,
        IPS_NAT_CLASH_BIT,
        IPS_NAT_CLASH,
        IPS_HELPER_BIT,
        IPS_HELPER,
        IPS_OFFLOAD_BIT,
        IPS_OFFLOAD,
        IPS_HW_OFFLOAD_BIT,
        IPS_HW_OFFLOAD,
        IPS_UNCHANGEABLE_MASK,
        __IPS_MAX_BIT;

    }

    @Type(noCCodeGeneration=true, cType="enum ip_conntrack_info")
    public static enum ip_conntrack_info implements Enum<ip_conntrack_info>,
    TypedEnum<ip_conntrack_info, Integer>
    {
        IP_CT_ESTABLISHED,
        IP_CT_RELATED,
        IP_CT_NEW,
        IP_CT_IS_REPLY,
        IP_CT_ESTABLISHED_REPLY,
        IP_CT_RELATED_REPLY,
        IP_CT_NUMBER,
        IP_CT_UNTRACKED;

    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel_encap_ops")
    @NotUsableInJava
    public static class ip_tunnel_encap_ops
    extends Struct {
        public Ptr<?> encap_hlen;
        public Ptr<?> build_header;
        public Ptr<?> err_handler;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_options_data")
    @NotUsableInJava
    public static class ip_options_data
    extends Struct {
        public ip_options_rcu opt;
        public char @Size(value=40) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_sf_list")
    @NotUsableInJava
    public static class ip_sf_list
    extends Struct {
        public Ptr<ip_sf_list> sf_next;
        public @Unsigned long @Size(value=2) [] sf_count;
        public @Unsigned @OriginalName(value="__be32") int sf_inaddr;
        public char sf_gsresp;
        public char sf_oldin;
        public char sf_crcount;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_sf_socklist")
    @NotUsableInJava
    public static class ip_sf_socklist
    extends Struct {
        public @Unsigned int sl_max;
        public @Unsigned int sl_count;
        public misc.callback_head rcu;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=0) [] sl_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_mc_socklist")
    @NotUsableInJava
    public static class ip_mc_socklist
    extends Struct {
        public Ptr<ip_mc_socklist> next_rcu;
        public ip_mreqn multi;
        public @Unsigned int sfmode;
        public Ptr<ip_sf_socklist> sflist;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_mc_list")
    @NotUsableInJava
    public static class ip_mc_list
    extends Struct {
        public Ptr<InDefinitions.in_device> _interface;
        public @Unsigned @OriginalName(value="__be32") int multiaddr;
        public @Unsigned int sfmode;
        public Ptr<ip_sf_list> sources;
        public Ptr<ip_sf_list> tomb;
        public @Unsigned long @Size(value=2) [] sfcount;
        @InlineUnion(value=25448)
        public @InlineUnion(value=25448) Ptr<ip_mc_list> next;
        @InlineUnion(value=25448)
        public @InlineUnion(value=25448) Ptr<ip_mc_list> next_rcu;
        public Ptr<ip_mc_list> next_hash;
        public TimerDefinitions.timer_list timer;
        public int users;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public char tm_running;
        public char reporter;
        public char unsolicit_count;
        public char loaded;
        public char gsquery;
        public char crcount;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_msfilter")
    @NotUsableInJava
    public static class ip_msfilter
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int imsf_multiaddr;
        public @Unsigned @OriginalName(value="__be32") int imsf_interface;
        public @Unsigned int imsf_fmode;
        public @Unsigned int imsf_numsrc;
        @InlineUnion(value=25421)
        public @InlineUnion(value=25421) @Unsigned @OriginalName(value="__be32") int @Size(value=1) [] imsf_slist;
        @InlineUnion(value=25421)
        public  @InlineUnion(value=25421) AnonDefinitions.anon_member_of_anon_member_of_ip_msfilter anon4$1;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_mreq_source")
    @NotUsableInJava
    public static class ip_mreq_source
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int imr_multiaddr;
        public @Unsigned @OriginalName(value="__be32") int imr_interface;
        public @Unsigned @OriginalName(value="__be32") int imr_sourceaddr;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_mreqn")
    @NotUsableInJava
    public static class ip_mreqn
    extends Struct {
        public InDefinitions.in_addr imr_multiaddr;
        public InDefinitions.in_addr imr_address;
        public int imr_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="enum ip_defrag_users")
    public static enum ip_defrag_users implements Enum<ip_defrag_users>,
    TypedEnum<ip_defrag_users, Integer>
    {
        IP_DEFRAG_LOCAL_DELIVER,
        IP_DEFRAG_CALL_RA_CHAIN,
        IP_DEFRAG_CONNTRACK_IN,
        __IP_DEFRAG_CONNTRACK_IN_END,
        IP_DEFRAG_CONNTRACK_OUT,
        __IP_DEFRAG_CONNTRACK_OUT_END,
        IP_DEFRAG_CONNTRACK_BRIDGE_IN,
        __IP_DEFRAG_CONNTRACK_BRIDGE_IN,
        IP_DEFRAG_VS_IN,
        IP_DEFRAG_VS_OUT,
        IP_DEFRAG_VS_FWD,
        IP_DEFRAG_AF_PACKET,
        IP_DEFRAG_MACVLAN;

    }

    @Type(noCCodeGeneration=true, cType="struct ip_rt_acct")
    @NotUsableInJava
    public static class ip_rt_acct
    extends Struct {
        public @Unsigned int o_bytes;
        public @Unsigned int o_packets;
        public @Unsigned int i_bytes;
        public @Unsigned int i_packets;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel_encap")
    @NotUsableInJava
    public static class ip_tunnel_encap
    extends Struct {
        public @Unsigned short type;
        public @Unsigned short flags;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public @Unsigned @OriginalName(value="__be16") short dport;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel_key")
    @NotUsableInJava
    public static class ip_tunnel_key
    extends Struct {
        public @Unsigned @OriginalName(value="__be64") long tun_id;
        public UDefinitions.u_of_ip_tunnel_key u;
        public @Unsigned long @Size(value=1) [] tun_flags;
        public @Unsigned @OriginalName(value="__be32") int label;
        public @Unsigned int nhid;
        public char tos;
        public char ttl;
        public @Unsigned @OriginalName(value="__be16") short tp_src;
        public @Unsigned @OriginalName(value="__be16") short tp_dst;
        public char flow_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel_info")
    @NotUsableInJava
    public static class ip_tunnel_info
    extends Struct {
        public ip_tunnel_key key;
        public ip_tunnel_encap encap;
        public DstDefinitions.dst_cache dst_cache;
        public char options_len;
        public char mode;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_tunnel_parm_kern")
    @NotUsableInJava
    public static class ip_tunnel_parm_kern
    extends Struct {
        public char @Size(value=16) [] name;
        public @Unsigned long @Size(value=1) [] i_flags;
        public @Unsigned long @Size(value=1) [] o_flags;
        public @Unsigned @OriginalName(value="__be32") int i_key;
        public @Unsigned @OriginalName(value="__be32") int o_key;
        public int link;
        public runtime.iphdr iph;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_ct_sctp")
    @NotUsableInJava
    public static class ip_ct_sctp
    extends Struct {
        public SctpDefinitions.sctp_conntrack state;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=2) [] vtag;
        public char @Size(value=2) [] init;
        public char last_dir;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_ct_tcp")
    @NotUsableInJava
    public static class ip_ct_tcp
    extends Struct {
        public ip_ct_tcp_state @Size(value=2) [] seen;
        public @OriginalName(value="u_int8_t") char state;
        public @OriginalName(value="u_int8_t") char last_dir;
        public @OriginalName(value="u_int8_t") char retrans;
        public @OriginalName(value="u_int8_t") char last_index;
        public @Unsigned @OriginalName(value="u_int32_t") int last_seq;
        public @Unsigned @OriginalName(value="u_int32_t") int last_ack;
        public @Unsigned @OriginalName(value="u_int32_t") int last_end;
        public @Unsigned @OriginalName(value="u_int16_t") short last_win;
        public @OriginalName(value="u_int8_t") char last_wscale;
        public @OriginalName(value="u_int8_t") char last_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_ct_tcp_state")
    @NotUsableInJava
    public static class ip_ct_tcp_state
    extends Struct {
        public @Unsigned @OriginalName(value="u_int32_t") int td_end;
        public @Unsigned @OriginalName(value="u_int32_t") int td_maxend;
        public @Unsigned @OriginalName(value="u_int32_t") int td_maxwin;
        public @Unsigned @OriginalName(value="u_int32_t") int td_maxack;
        public @OriginalName(value="u_int8_t") char td_scale;
        public @OriginalName(value="u_int8_t") char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_options_rcu")
    @NotUsableInJava
    public static class ip_options_rcu
    extends Struct {
        public misc.callback_head rcu;
        public ip_options opt;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_options")
    @NotUsableInJava
    public static class ip_options
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int faddr;
        public @Unsigned @OriginalName(value="__be32") int nexthop;
        public char optlen;
        public char srr;
        public char rr;
        public char ts;
        public char is_strictroute;
        public char srr_is_hit;
        public char is_changed;
        public char rr_needaddr;
        public char ts_needtime;
        public char ts_needaddr;
        public char router_alert;
        public char cipso;
        public char __pad2;
        public char @Size(value=0) [] __data;
    }

    @Type(noCCodeGeneration=true, cType="struct ip_ra_chain")
    @NotUsableInJava
    public static class ip_ra_chain
    extends Struct {
        public Ptr<ip_ra_chain> next;
        public Ptr<runtime.sock> sk;
        @InlineUnion(value=12580)
        public @InlineUnion(value=12580) Ptr<?> destructor;
        @InlineUnion(value=12580)
        public @InlineUnion(value=12580) Ptr<runtime.sock> saved_sk;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum ip_conntrack_dir")
    public static enum ip_conntrack_dir implements Enum<ip_conntrack_dir>,
    TypedEnum<ip_conntrack_dir, Integer>
    {
        IP_CT_DIR_ORIGINAL,
        IP_CT_DIR_REPLY,
        IP_CT_DIR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct ip_conntrack_stat")
    @NotUsableInJava
    public static class ip_conntrack_stat
    extends Struct {
        public @Unsigned int found;
        public @Unsigned int invalid;
        public @Unsigned int insert;
        public @Unsigned int insert_failed;
        public @Unsigned int clash_resolve;
        public @Unsigned int drop;
        public @Unsigned int early_drop;
        public @Unsigned int error;
        public @Unsigned int expect_new;
        public @Unsigned int expect_create;
        public @Unsigned int expect_delete;
        public @Unsigned int search_restart;
        public @Unsigned int chaintoolong;
    }
}

