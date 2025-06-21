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
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.Ipv4Definitions;
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.ProtoDefinitions;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.RhashtableDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.SockDefinitions;
import me.bechberger.ebpf.runtime.TcpDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class InetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __inet_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock, Ptr<runtime.sock> newsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inet_bind(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inet_listen_sk(Ptr<runtime.sock> sk, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inet_stream_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len, int flags, int is_sendmsg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_accept(Ptr<runtime.socket> sock2, Ptr<runtime.socket> newsock, Ptr<ProtoDefinitions.proto_accept_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_add_offload((const struct net_offload*)$arg1, $arg2)")
    public static int inet_add_offload(Ptr<NetDefinitions.net_offload> prot, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_add_protocol((const struct net_protocol*)$arg1, $arg2)")
    public static int inet_add_protocol(Ptr<NetDefinitions.net_protocol> prot, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_autobind(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_bind_sk(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr, int addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_compat_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_compat_routing_ioctl(Ptr<runtime.sock> sk, @Unsigned int cmd, Ptr<CompatDefinitions.compat_rtentry> ur) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_create(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_ctl_sock_create(Ptr<Ptr<runtime.sock>> sk, @Unsigned short family, @Unsigned short type2, char protocol, Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be32") int inet_current_timestamp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_del_offload((const struct net_offload*)$arg1, $arg2)")
    public static int inet_del_offload(Ptr<NetDefinitions.net_offload> prot, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_del_protocol((const struct net_protocol*)$arg1, $arg2)")
    public static int inet_del_protocol(Ptr<NetDefinitions.net_protocol> prot, char protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_dgram_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_getname(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_gro_complete(Ptr<SkDefinitions.sk_buff> skb, int nhoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> inet_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> inet_gso_segment(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="netdev_features_t") long features) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_init_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_listen(Ptr<runtime.socket> sock2, int backlog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_recv_error(Ptr<runtime.sock> sk, Ptr<runtime.msghdr> msg, int len, Ptr<Integer> addr_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long size, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_register_protosw(Ptr<inet_protosw> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_release(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_reset_saddr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_send_prepare(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_shutdown(Ptr<runtime.socket> sock2, int how) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_sk_rebuild_header(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_sk_reselect_saddr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_sk_rx_dst_set($arg1, (const struct sk_buff*)$arg2)")
    public static void inet_sk_rx_dst_set(Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_sk_set_state(Ptr<runtime.sock> sk, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_sk_state_store(Ptr<runtime.sock> sk, int newstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_sock_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_splice_eof(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_stream_connect(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> uaddr, int addr_len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_unregister_protosw(Ptr<inet_protosw> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inet_bhash2_update_saddr(Ptr<runtime.sock> sk, Ptr<?> saddr, int family, boolean reset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inet_check_established(Ptr<inet_timewait_death_row> death_row, Ptr<runtime.sock> sk, @Unsigned short lport, Ptr<Ptr<inet_timewait_sock>> twp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __inet_del_ifa(Ptr<InDefinitions.in_device> in_dev, Ptr<Ptr<InDefinitions.in_ifaddr>> ifap, int destroy, Ptr<runtime.nlmsghdr> nlh, @Unsigned int portid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inet_hash(Ptr<runtime.sock> sk, Ptr<runtime.sock> osk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__inet_hash_connect($arg1, $arg2, $arg3, (int (*)(struct inet_timewait_death_row*, struct sock*, short unsigned int, struct inet_timewait_sock**))$arg4)")
    public static int __inet_hash_connect(Ptr<inet_timewait_death_row> death_row, Ptr<runtime.sock> sk, @Unsigned long port_offset, Ptr<?> check_established) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__inet_inherit_port((const struct sock*)$arg1, $arg2)")
    public static int __inet_inherit_port(Ptr<runtime.sock> sk, Ptr<runtime.sock> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __inet_insert_ifa(Ptr<InDefinitions.in_ifaddr> ifa, Ptr<runtime.nlmsghdr> nlh, @Unsigned int portid, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__inet_lookup_established((const struct net*)$arg1, $arg2, (const unsigned int)$arg3, (const short unsigned int)$arg4, (const unsigned int)$arg5, (const short unsigned int)$arg6, (const int)$arg7, (const int)$arg8)")
    public static Ptr<runtime.sock> __inet_lookup_established(Ptr<runtime.net> net2, Ptr<inet_hashinfo> hashinfo, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned short hnum, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__inet_lookup_listener((const struct net*)$arg1, $arg2, $arg3, $arg4, (const unsigned int)$arg5, $arg6, (const unsigned int)$arg7, (const short unsigned int)$arg8, (const int)$arg9, (const int)$arg10)")
    public static Ptr<runtime.sock> __inet_lookup_listener(Ptr<runtime.net> net2, Ptr<inet_hashinfo> hashinfo, Ptr<SkDefinitions.sk_buff> skb, int doff, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned short hnum, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inet_addr_is_any(Ptr<runtime.sockaddr> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_addr_onlink(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int a, @Unsigned @OriginalName(value="__be32") int b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<InDefinitions.in_ifaddr> inet_alloc_ifa(Ptr<InDefinitions.in_device> in_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_bhash2_addr_any_hashbucket((const struct sock*)$arg1, (const struct net*)$arg2, $arg3)")
    public static Ptr<inet_bind_hashbucket> inet_bhash2_addr_any_hashbucket(Ptr<runtime.sock> sk, Ptr<runtime.net> net2, int port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_bhash2_reset_saddr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_bhash2_update_saddr(Ptr<runtime.sock> sk, Ptr<?> saddr, int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_bind2_bucket_create($arg1, $arg2, $arg3, $arg4, (const struct sock*)$arg5)")
    public static Ptr<inet_bind2_bucket> inet_bind2_bucket_create(Ptr<KmemDefinitions.kmem_cache> cachep, Ptr<runtime.net> net2, Ptr<inet_bind_hashbucket> head, Ptr<inet_bind_bucket> tb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_bind2_bucket_destroy(Ptr<KmemDefinitions.kmem_cache> cachep, Ptr<inet_bind2_bucket> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_bind2_bucket_find((const struct inet_bind_hashbucket*)$arg1, (const struct net*)$arg2, $arg3, $arg4, (const struct sock*)$arg5)")
    public static Ptr<inet_bind2_bucket> inet_bind2_bucket_find(Ptr<inet_bind_hashbucket> head, Ptr<runtime.net> net2, @Unsigned short port2, int l3mdev, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_bind2_bucket_match_addr_any((const struct inet_bind2_bucket*)$arg1, (const struct net*)$arg2, $arg3, $arg4, (const struct sock*)$arg5)")
    public static boolean inet_bind2_bucket_match_addr_any(Ptr<inet_bind2_bucket> tb, Ptr<runtime.net> net2, @Unsigned short port2, int l3mdev, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_bind_bucket_create($arg1, $arg2, $arg3, (const short unsigned int)$arg4, $arg5)")
    public static Ptr<inet_bind_bucket> inet_bind_bucket_create(Ptr<KmemDefinitions.kmem_cache> cachep, Ptr<runtime.net> net2, Ptr<inet_bind_hashbucket> head, @Unsigned short snum, int l3mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_bind_bucket_destroy(Ptr<KmemDefinitions.kmem_cache> cachep, Ptr<inet_bind_bucket> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_bind_bucket_match((const struct inet_bind_bucket*)$arg1, (const struct net*)$arg2, $arg3, $arg4)")
    public static boolean inet_bind_bucket_match(Ptr<inet_bind_bucket> tb, Ptr<runtime.net> net2, @Unsigned short port2, int l3mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_bind_hash(Ptr<runtime.sock> sk, Ptr<inet_bind_bucket> tb, Ptr<inet_bind2_bucket> tb2, @Unsigned short port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_blackhole_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be32") int inet_confirm_addr(Ptr<runtime.net> net2, Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int dst, @Unsigned @OriginalName(value="__be32") int local, int scope) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_dump_ifaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inet_ehash_insert(Ptr<runtime.sock> sk, Ptr<runtime.sock> osk, Ptr<@OriginalName(value="bool") Boolean> found_dup_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_ehash_locks_alloc(Ptr<inet_hashinfo> hashinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inet_ehash_nolisten(Ptr<runtime.sock> sk, Ptr<runtime.sock> osk, Ptr<@OriginalName(value="bool") Boolean> found_dup_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_ehashfn((const struct net*)$arg1, (const unsigned int)$arg2, (const short unsigned int)$arg3, (const unsigned int)$arg4, (const short unsigned int)$arg5)")
    public static @Unsigned int inet_ehashfn(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int laddr, @Unsigned short lport, @Unsigned @OriginalName(value="__be32") int faddr, @Unsigned @OriginalName(value="__be16") short fport) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_fill_ifaddr($arg1, (const struct in_ifaddr*)$arg2, $arg3)")
    public static int inet_fill_ifaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<InDefinitions.in_ifaddr> ifa, Ptr<inet_fill_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_fill_link_af($arg1, (const struct net_device*)$arg2, $arg3)")
    public static int inet_fill_link_af(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_get_link_af_size((const struct net_device*)$arg1, $arg2)")
    public static @Unsigned long inet_get_link_af_size(Ptr<NetDefinitions.net_device> dev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_getpeer($arg1, (const struct inetpeer_addr*)$arg2, $arg3)")
    public static Ptr<inet_peer> inet_getpeer(Ptr<inet_peer_base> base, Ptr<misc.inetpeer_addr> daddr, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_gifconf(Ptr<NetDefinitions.net_device> dev, String buf, int len, int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_hash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_hash_connect(Ptr<inet_timewait_death_row> death_row, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_hash_remove(Ptr<InDefinitions.in_ifaddr> ifa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_hashinfo2_init($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void inet_hashinfo2_init(Ptr<inet_hashinfo> h, String name, @Unsigned long numentries, int scale, @Unsigned long low_limit, @Unsigned long high_limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_hashinfo2_init_mod(Ptr<inet_hashinfo> h) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<InDefinitions.in_ifaddr> inet_ifa_byprefix(Ptr<InDefinitions.in_device> in_dev, @Unsigned @OriginalName(value="__be32") int prefix, @Unsigned @OriginalName(value="__be32") int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_initpeers() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<inet_listen_hashbucket> inet_lhash2_bucket_sk(Ptr<inet_hashinfo> h, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_lhash2_lookup((const struct net*)$arg1, $arg2, $arg3, $arg4, (const unsigned int)$arg5, $arg6, (const unsigned int)$arg7, (const short unsigned int)$arg8, (const int)$arg9, (const int)$arg10)")
    public static Ptr<runtime.sock> inet_lhash2_lookup(Ptr<runtime.net> net2, Ptr<inet_listen_hashbucket> ilb2, Ptr<SkDefinitions.sk_buff> skb, int doff, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned short hnum, int dif, int sdif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<InDefinitions.in_ifaddr> inet_lookup_ifaddr_rcu(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_lookup_reuseport((const struct net*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9)")
    public static Ptr<runtime.sock> inet_lookup_reuseport(Ptr<runtime.net> net2, Ptr<runtime.sock> sk, Ptr<SkDefinitions.sk_buff> skb, int doff, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned short hnum, Ptr<?> ehashfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_lookup_run_sk_lookup((const struct net*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, (const int)$arg9, $arg10)")
    public static Ptr<runtime.sock> inet_lookup_run_sk_lookup(Ptr<runtime.net> net2, int protocol, Ptr<SkDefinitions.sk_buff> skb, int doff, @Unsigned @OriginalName(value="__be32") int saddr, @Unsigned @OriginalName(value="__be16") short sport, @Unsigned @OriginalName(value="__be32") int daddr, @Unsigned short hnum, int dif, Ptr<?> ehashfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_netconf_dump_devconf(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_netconf_fill_devconf($arg1, $arg2, (const struct ipv4_devconf*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static int inet_netconf_fill_devconf(Ptr<SkDefinitions.sk_buff> skb, int ifindex, Ptr<Ipv4Definitions.ipv4_devconf> devconf, @Unsigned int portid, @Unsigned int seq, int event2, @Unsigned int flags, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_netconf_get_devconf(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_netconf_notify_devconf(Ptr<runtime.net> net2, int event2, int type2, int ifindex, Ptr<Ipv4Definitions.ipv4_devconf> devconf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_peer_base_init(Ptr<inet_peer_base> bp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inet_peer_xrlim_allow(Ptr<inet_peer> peer, int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<inet_hashinfo> inet_pernet_hashinfo_alloc(Ptr<inet_hashinfo> hashinfo, @Unsigned int ehash_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_pernet_hashinfo_free(Ptr<inet_hashinfo> hashinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_proto_csum_replace16($arg1, $arg2, (const unsigned int*)$arg3, (const unsigned int*)$arg4, $arg5)")
    public static void inet_proto_csum_replace16(Ptr<@Unsigned @OriginalName(value="__sum16") Short> sum, Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned @OriginalName(value="__be32") Integer> from, Ptr<@Unsigned @OriginalName(value="__be32") Integer> to, boolean pseudohdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_proto_csum_replace4(Ptr<@Unsigned @OriginalName(value="__sum16") Short> sum, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be32") int from, @Unsigned @OriginalName(value="__be32") int to, boolean pseudohdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_proto_csum_replace_by_diff(Ptr<@Unsigned @OriginalName(value="__sum16") Short> sum, Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__wsum") int diff, boolean pseudohdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_pton_with_scope($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5)")
    public static int inet_pton_with_scope(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__kernel_sa_family_t") short af, String src, String port2, Ptr<KernelDefinitions.__kernel_sockaddr_storage> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_put_port(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_putpeer(Ptr<inet_peer> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_rcu_free_ifa(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_rtm_deladdr(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_rtm_newaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_select_addr((const struct net_device*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="__be32") int inet_select_addr(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int dst, int scope) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_set_link_af($arg1, (const struct nlattr*)$arg2, $arg3)")
    public static int inet_set_link_af(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.nlattr> nla, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_unhash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_valid_dump_ifaddr_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int inet_valid_dump_ifaddr_req(Ptr<runtime.nlmsghdr> nlh, Ptr<inet_fill_args> fillargs, Ptr<Ptr<runtime.net>> tgt_net, Ptr<runtime.sock> sk, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_validate_link_af((const struct net_device*)$arg1, (const struct nlattr*)$arg2, $arg3)")
    public static int inet_validate_link_af(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.nlattr> nla, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__inet_dev_addr_type($arg1, (const struct net_device*)$arg2, $arg3, $arg4)")
    public static @Unsigned int __inet_dev_addr_type(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int addr2, @Unsigned int tb_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __inet_twsk_schedule(Ptr<inet_timewait_sock> tw, int timeo, boolean rearm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int inet_addr_type(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_addr_type_dev_table($arg1, (const struct net_device*)$arg2, $arg3)")
    public static @Unsigned int inet_addr_type_dev_table(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int inet_addr_type_table(Ptr<runtime.net> net2, @Unsigned @OriginalName(value="__be32") int addr2, @Unsigned int tb_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_dev_addr_type($arg1, (const struct net_device*)$arg2, $arg3)")
    public static @Unsigned int inet_dev_addr_type(Ptr<runtime.net> net2, Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be32") int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_dump_fib(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_frag_destroy(Ptr<inet_frag_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_frag_destroy_rcu(Ptr<misc.callback_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<inet_frag_queue> inet_frag_find(Ptr<runtime.fqdir> fqdir2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_frag_kill(Ptr<inet_frag_queue> fq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> inet_frag_pull_head(Ptr<inet_frag_queue> q) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_frag_queue_insert(Ptr<inet_frag_queue> q, Ptr<SkDefinitions.sk_buff> skb, int offset, int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int inet_frag_rbtree_purge(Ptr<RbDefinitions.rb_root> root, SkbDefinitions.skb_drop_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_frag_reasm_finish(Ptr<inet_frag_queue> q, Ptr<SkDefinitions.sk_buff> head, Ptr<?> reasm_data, boolean try_coalesce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> inet_frag_reasm_prepare(Ptr<inet_frag_queue> q, Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_frag_wq_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_frags_fini(Ptr<inet_frags> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_frags_free_cb(Ptr<?> ptr, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_frags_init(Ptr<inet_frags> f) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_rtm_delroute(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_rtm_getroute(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_rtm_newroute(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_rtm_valid_getroute_req($arg1, (const struct nlmsghdr*)$arg2, $arg3, $arg4)")
    public static int inet_rtm_valid_getroute_req(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_twsk_alloc((const struct sock*)$arg1, $arg2, (const int)$arg3)")
    public static Ptr<inet_timewait_sock> inet_twsk_alloc(Ptr<runtime.sock> sk, Ptr<inet_timewait_death_row> dr, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_twsk_bind_unhash(Ptr<inet_timewait_sock> tw, Ptr<inet_hashinfo> hashinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_twsk_deschedule_put(Ptr<inet_timewait_sock> tw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_twsk_free(Ptr<inet_timewait_sock> tw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_twsk_hashdance_schedule(Ptr<inet_timewait_sock> tw, Ptr<runtime.sock> sk, Ptr<inet_hashinfo> hashinfo, int timeo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_twsk_kill(Ptr<inet_timewait_sock> tw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_twsk_purge(Ptr<inet_hashinfo> hashinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_twsk_put(Ptr<inet_timewait_sock> tw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __inet_csk_reqsk_queue_drop(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, boolean from_timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_bhash2_addr_any_conflict((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static boolean inet_bhash2_addr_any_conflict(Ptr<runtime.sock> sk, int port2, int l3mdev, boolean relax, boolean reuseport_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_bind_conflict((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static boolean inet_bind_conflict(Ptr<runtime.sock> sk, Ptr<runtime.sock> sk2, misc.kuid_t sk_uid, boolean relax, boolean reuseport_cb_ok, boolean reuseport_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_child_forget(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, Ptr<runtime.sock> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> inet_csk_accept(Ptr<runtime.sock> sk, Ptr<ProtoDefinitions.proto_accept_arg> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_addr2sockaddr(Ptr<runtime.sock> sk, Ptr<runtime.sockaddr> uaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_csk_bind_conflict((const struct sock*)$arg1, (const struct inet_bind_bucket*)$arg2, (const struct inet_bind2_bucket*)$arg3, $arg4, $arg5)")
    public static int inet_csk_bind_conflict(Ptr<runtime.sock> sk, Ptr<inet_bind_bucket> tb, Ptr<inet_bind2_bucket> tb2, boolean relax, boolean reuseport_ok) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_clear_xmit_timers(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_clear_xmit_timers_sync(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_csk_clone_lock((const struct sock*)$arg1, (const struct request_sock*)$arg2, (const unsigned int)$arg3)")
    public static Ptr<runtime.sock> inet_csk_clone_lock(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, @Unsigned @OriginalName(value="gfp_t") int priority) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> inet_csk_complete_hashdance(Ptr<runtime.sock> sk, Ptr<runtime.sock> child, Ptr<RequestDefinitions.request_sock> req2, boolean own_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_delete_keepalive_timer(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_destroy_sock(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_csk_find_open_port((const struct sock*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static Ptr<inet_bind_hashbucket> inet_csk_find_open_port(Ptr<runtime.sock> sk, Ptr<Ptr<inet_bind_bucket>> tb_ret, Ptr<Ptr<inet_bind2_bucket>> tb2_ret, Ptr<Ptr<inet_bind_hashbucket>> head2_ret, Ptr<Integer> port_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_csk_get_port(Ptr<runtime.sock> sk, @Unsigned short snum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_csk_init_xmit_timers($arg1, (void (*)(struct timer_list*))$arg2, (void (*)(struct timer_list*))$arg3, (void (*)(struct timer_list*))$arg4)")
    public static void inet_csk_init_xmit_timers(Ptr<runtime.sock> sk, Ptr<?> retransmit_handler, Ptr<?> delack_handler, Ptr<?> keepalive_handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int inet_csk_listen_start(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_listen_stop(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_prepare_forced_close(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> inet_csk_rebuild_route(Ptr<runtime.sock> sk, Ptr<runtime.flowi> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.sock> inet_csk_reqsk_queue_add(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, Ptr<runtime.sock> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inet_csk_reqsk_queue_drop(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_reqsk_queue_drop_and_put(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean inet_csk_reqsk_queue_hash_add(Ptr<runtime.sock> sk, Ptr<RequestDefinitions.request_sock> req2, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_reset_keepalive_timer(Ptr<runtime.sock> sk, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_csk_route_child_sock((const struct sock*)$arg1, $arg2, (const struct request_sock*)$arg3)")
    public static Ptr<DstDefinitions.dst_entry> inet_csk_route_child_sock(Ptr<runtime.sock> sk, Ptr<runtime.sock> newsk, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_csk_route_req((const struct sock*)$arg1, $arg2, (const struct request_sock*)$arg3)")
    public static Ptr<DstDefinitions.dst_entry> inet_csk_route_req(Ptr<runtime.sock> sk, Ptr<runtime.flowi4> fl4, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void inet_csk_update_fastreuse(Ptr<inet_bind_bucket> tb, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DstDefinitions.dst_entry> inet_csk_update_pmtu(Ptr<runtime.sock> sk, @Unsigned int mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_rcv_saddr_any((const struct sock*)$arg1)")
    public static boolean inet_rcv_saddr_any(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_rcv_saddr_equal((const struct sock*)$arg1, (const struct sock*)$arg2, $arg3)")
    public static boolean inet_rcv_saddr_equal(Ptr<runtime.sock> sk, Ptr<runtime.sock> sk2, boolean match_wildcard) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_reqsk_alloc((const struct request_sock_ops*)$arg1, $arg2, $arg3)")
    public static Ptr<RequestDefinitions.request_sock> inet_reqsk_alloc(Ptr<RequestDefinitions.request_sock_ops> ops, Ptr<runtime.sock> sk_listener, boolean attach_listener) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RequestDefinitions.request_sock> inet_reqsk_clone(Ptr<RequestDefinitions.request_sock> req2, Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_rtx_syn_ack((const struct sock*)$arg1, $arg2)")
    public static int inet_rtx_syn_ack(Ptr<runtime.sock> parent, Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="inet_sk_get_local_port_range((const struct sock*)$arg1, $arg2, $arg3)")
    public static boolean inet_sk_get_local_port_range(Ptr<runtime.sock> sk, Ptr<Integer> low, Ptr<Integer> high) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct inet_fill_args")
    @NotUsableInJava
    public static class inet_fill_args
    extends Struct {
        public @Unsigned int portid;
        public @Unsigned int seq;
        public int event;
        public @Unsigned int flags;
        public int netnsid;
        public int ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_peer")
    @NotUsableInJava
    public static class inet_peer
    extends Struct {
        public RbDefinitions.rb_node rb_node;
        public misc.inetpeer_addr daddr;
        public @Unsigned int @Size(value=17) [] metrics;
        public @Unsigned int rate_tokens;
        public @Unsigned int n_redirects;
        public @Unsigned long rate_last;
        @InlineUnion(value=34351)
        public  @InlineUnion(value=34351) AnonDefinitions.anon_member_of_anon_member_of_inet_peer anon6$0;
        @InlineUnion(value=34351)
        public @InlineUnion(value=34351) misc.callback_head rcu;
        public @Unsigned int dtime;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_protosw")
    @NotUsableInJava
    public static class inet_protosw
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned short type;
        public @Unsigned short protocol;
        public Ptr<runtime.proto> prot;
        public Ptr<ProtoDefinitions.proto_ops> ops;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="enum inet_csk_ack_state_t")
    public static enum inet_csk_ack_state_t implements Enum<inet_csk_ack_state_t>,
    TypedEnum<inet_csk_ack_state_t, Integer>
    {
        ICSK_ACK_SCHED,
        ICSK_ACK_TIMER,
        ICSK_ACK_PUSHED,
        ICSK_ACK_PUSHED2,
        ICSK_ACK_NOW,
        ICSK_ACK_NOMEM;

    }

    @Type(noCCodeGeneration=true, cType="union inet_addr")
    @NotUsableInJava
    public static class inet_addr
    extends Union {
        public @Unsigned int @Size(value=4) [] all;
        public @Unsigned @OriginalName(value="__be32") int ip;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] ip6;
        public InDefinitions.in_addr in;
        public In6Definitions.in6_addr in6;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_skb_parm")
    @NotUsableInJava
    public static class inet_skb_parm
    extends Struct {
        public int iif;
        public IpDefinitions.ip_options opt;
        public @Unsigned short flags;
        public @Unsigned short frag_max_size;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_timewait_sock")
    @NotUsableInJava
    public static class inet_timewait_sock
    extends Struct {
        public SockDefinitions.sock_common __tw_common;
        public @Unsigned int tw_mark;
        public char tw_substate;
        public char tw_rcv_wscale;
        public @Unsigned @OriginalName(value="__be16") short tw_sport;
        public @Unsigned int tw_transparent;
        public @Unsigned int tw_flowlabel;
        public @Unsigned int tw_usec_ts;
        public @Unsigned int tw_pad;
        public @Unsigned int tw_tos;
        public @Unsigned int tw_txhash;
        public @Unsigned int tw_priority;
        public TimerDefinitions.timer_list tw_timer;
        public Ptr<inet_bind_bucket> tw_tb;
        public Ptr<inet_bind2_bucket> tw_tb2;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_bind2_bucket")
    @NotUsableInJava
    public static class inet_bind2_bucket
    extends Struct {
        public misc.possible_net_t ib_net;
        public int l3mdev;
        public @Unsigned short port;
        public @Unsigned short addr_type;
        public In6Definitions.in6_addr v6_rcv_saddr;
        public misc.hlist_node node;
        public misc.hlist_node bhash_node;
        public misc.hlist_head owners;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_bind_bucket")
    @NotUsableInJava
    public static class inet_bind_bucket
    extends Struct {
        public misc.possible_net_t ib_net;
        public int l3mdev;
        public @Unsigned short port;
        public byte fastreuse;
        public byte fastreuseport;
        public misc.kuid_t fastuid;
        public In6Definitions.in6_addr fast_v6_rcv_saddr;
        public @Unsigned @OriginalName(value="__be32") int fast_rcv_saddr;
        public @Unsigned short fast_sk_family;
        public boolean fast_ipv6_only;
        public misc.hlist_node node;
        public misc.hlist_head bhash2;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_connection_sock")
    @NotUsableInJava
    public static class inet_connection_sock
    extends Struct {
        public inet_sock icsk_inet;
        public RequestDefinitions.request_sock_queue icsk_accept_queue;
        public Ptr<inet_bind_bucket> icsk_bind_hash;
        public Ptr<inet_bind2_bucket> icsk_bind2_hash;
        public @Unsigned long icsk_timeout;
        public TimerDefinitions.timer_list icsk_retransmit_timer;
        public TimerDefinitions.timer_list icsk_delack_timer;
        public @Unsigned int icsk_rto;
        public @Unsigned int icsk_rto_min;
        public @Unsigned int icsk_delack_max;
        public @Unsigned int icsk_pmtu_cookie;
        public Ptr<TcpDefinitions.tcp_congestion_ops> icsk_ca_ops;
        public Ptr<inet_connection_sock_af_ops> icsk_af_ops;
        public Ptr<TcpDefinitions.tcp_ulp_ops> icsk_ulp_ops;
        public Ptr<?> icsk_ulp_data;
        public Ptr<?> icsk_clean_acked;
        public Ptr<?> icsk_sync_mss;
        public char icsk_ca_state;
        public char icsk_ca_initialized;
        public char icsk_ca_setsockopt;
        public char icsk_ca_dst_locked;
        public char icsk_retransmits;
        public char icsk_pending;
        public char icsk_backoff;
        public char icsk_syn_retries;
        public char icsk_probes_out;
        public @Unsigned short icsk_ext_hdr_len;
        public misc.icsk_ack_of_inet_connection_sock icsk_ack;
        public misc.icsk_mtup_of_inet_connection_sock icsk_mtup;
        public @Unsigned int icsk_probes_tstamp;
        public @Unsigned int icsk_user_timeout;
        public @Unsigned long @Size(value=13) [] icsk_ca_priv;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_connection_sock_af_ops")
    @NotUsableInJava
    public static class inet_connection_sock_af_ops
    extends Struct {
        public Ptr<?> queue_xmit;
        public Ptr<?> send_check;
        public Ptr<?> rebuild_header;
        public Ptr<?> sk_rx_dst_set;
        public Ptr<?> conn_request;
        public Ptr<?> syn_recv_sock;
        public @Unsigned short net_header_len;
        public @Unsigned short sockaddr_len;
        public Ptr<?> setsockopt;
        public Ptr<?> getsockopt;
        public Ptr<?> addr2sockaddr;
        public Ptr<?> mtu_reduced;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_request_sock")
    @NotUsableInJava
    public static class inet_request_sock
    extends Struct {
        public RequestDefinitions.request_sock req;
        public @Unsigned short snd_wscale;
        public @Unsigned short rcv_wscale;
        public @Unsigned short tstamp_ok;
        public @Unsigned short sack_ok;
        public @Unsigned short wscale_ok;
        public @Unsigned short ecn_ok;
        public @Unsigned short acked;
        public @Unsigned short no_srccheck;
        public @Unsigned short smc_ok;
        public @Unsigned int ir_mark;
        @InlineUnion(value=23121)
        public @InlineUnion(value=23121) Ptr<IpDefinitions.ip_options_rcu> ireq_opt;
        @InlineUnion(value=23121)
        public  @InlineUnion(value=23121) AnonDefinitions.anon_member_of_anon_member_of_inet_request_sock anon11$1;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_listen_hashbucket")
    @NotUsableInJava
    public static class inet_listen_hashbucket
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.hlist_nulls_head nulls_head;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_bind_hashbucket")
    @NotUsableInJava
    public static class inet_bind_hashbucket
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public misc.hlist_head chain;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_ehash_bucket")
    @NotUsableInJava
    public static class inet_ehash_bucket
    extends Struct {
        public misc.hlist_nulls_head chain;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_hashinfo")
    @NotUsableInJava
    public static class inet_hashinfo
    extends Struct {
        public Ptr<inet_ehash_bucket> ehash;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> ehash_locks;
        public @Unsigned int ehash_mask;
        public @Unsigned int ehash_locks_mask;
        public Ptr<KmemDefinitions.kmem_cache> bind_bucket_cachep;
        public Ptr<inet_bind_hashbucket> bhash;
        public Ptr<KmemDefinitions.kmem_cache> bind2_bucket_cachep;
        public Ptr<inet_bind_hashbucket> bhash2;
        public @Unsigned int bhash_size;
        public @Unsigned int lhash2_mask;
        public Ptr<inet_listen_hashbucket> lhash2;
        public boolean pernet;
    }

    @Type(noCCodeGeneration=true, cType="struct { const unsigned int*; short unsigned int port; u8 protocol; u8 operation; _Bool is_ipv6; }")
    @NotUsableInJava
    public static class inet_network_of_param_of_tomoyo_request_info
    extends Struct {
        public Ptr<@Unsigned @OriginalName(value="__be32") Integer> address;
        public @Unsigned short port;
        public char protocol;
        public char operation;
        public boolean is_ipv6;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_sock")
    @NotUsableInJava
    public static class inet_sock
    extends Struct {
        public runtime.sock sk;
        public Ptr<Ipv6Definitions.ipv6_pinfo> pinet6;
        public @Unsigned long inet_flags;
        public @Unsigned @OriginalName(value="__be32") int inet_saddr;
        public short uc_ttl;
        public @Unsigned @OriginalName(value="__be16") short inet_sport;
        public Ptr<IpDefinitions.ip_options_rcu> inet_opt;
        public AtomicDefinitions.atomic_t inet_id;
        public char tos;
        public char min_ttl;
        public char mc_ttl;
        public char pmtudisc;
        public char rcv_tos;
        public char convert_csum;
        public int uc_index;
        public int mc_index;
        public @Unsigned @OriginalName(value="__be32") int mc_addr;
        public @Unsigned int local_port_range;
        public Ptr<IpDefinitions.ip_mc_socklist> mc_list;
        public inet_cork_full cork;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_cork_full")
    @NotUsableInJava
    public static class inet_cork_full
    extends Struct {
        public inet_cork base;
        public runtime.flowi fl;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_cork")
    @NotUsableInJava
    public static class inet_cork
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned @OriginalName(value="__be32") int addr;
        public Ptr<IpDefinitions.ip_options> opt;
        public @Unsigned int fragsize;
        public int length;
        public Ptr<DstDefinitions.dst_entry> dst;
        public char tx_flags;
        public char ttl;
        public short tos;
        public char priority;
        public @Unsigned short gso_size;
        public @Unsigned long transmit_time;
        public @Unsigned int mark;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_peer_base")
    @NotUsableInJava
    public static class inet_peer_base
    extends Struct {
        public RbDefinitions.rb_root rb_root;
        public misc.seqlock_t lock;
        public int total;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_timewait_death_row")
    @NotUsableInJava
    public static class inet_timewait_death_row
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct tw_refcount;
        public Ptr<inet_hashinfo> hashinfo;
        public int sysctl_max_tw_buckets;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_frag_queue")
    @NotUsableInJava
    public static class inet_frag_queue
    extends Struct {
        public misc.rhash_head node;
        public KeyDefinitions.key_of_inet_frag_queue key;
        public TimerDefinitions.timer_list timer;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public RbDefinitions.rb_root rb_fragments;
        public Ptr<SkDefinitions.sk_buff> fragments_tail;
        public Ptr<SkDefinitions.sk_buff> last_run_head;
        public @OriginalName(value="ktime_t") long stamp;
        public int len;
        public int meat;
        public char tstamp_type;
        public char flags;
        public @Unsigned short max_size;
        public Ptr<runtime.fqdir> fqdir;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct inet_frags")
    @NotUsableInJava
    public static class inet_frags
    extends Struct {
        public @Unsigned int qsize;
        public Ptr<?> constructor;
        public Ptr<?> destructor;
        public Ptr<?> frag_expire;
        public Ptr<KmemDefinitions.kmem_cache> frags_cachep;
        public String frags_cache_name;
        public RhashtableDefinitions.rhashtable_params rhash_params;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        public runtime.completion completion;
    }
}

