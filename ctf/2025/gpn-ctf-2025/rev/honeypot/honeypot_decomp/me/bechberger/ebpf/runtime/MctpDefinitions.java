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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class MctpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mctp_neigh_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_neigh_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_neigh_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_neigh_lookup(Ptr<mctp_dev> mdev, @OriginalName(value="mctp_eid_t") char eid, Ptr<?> ret_hwaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_neigh_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_neigh_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_neigh_remove_dev(Ptr<mctp_dev> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_rtm_delneigh(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_rtm_getneigh(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_rtm_newneigh(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mctp_key_done_in(Ptr<mctp_sk_key> key2, Ptr<runtime.net> net2, @Unsigned long flags, @Unsigned long reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mctp_sk_key> mctp_alloc_local_tag(Ptr<mctp_sock> msk, @Unsigned int netid, @OriginalName(value="mctp_eid_t") char local, @OriginalName(value="mctp_eid_t") char peer, boolean manual, Ptr<Character> tagp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mctp_default_net(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_default_net_set(Ptr<runtime.net> net2, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_delroute(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_do_fragment_route(Ptr<mctp_route> rt, Ptr<SkDefinitions.sk_buff> skb, @Unsigned int mtu, char tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_dump_rtinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_frag_queue(Ptr<mctp_sk_key> key2, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_key_add(Ptr<mctp_sk_key> key2, Ptr<mctp_sock> msk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mctp_sk_key> mctp_key_alloc(Ptr<mctp_sock> msk, @Unsigned int net2, @OriginalName(value="mctp_eid_t") char local, @OriginalName(value="mctp_eid_t") char peer, char tag, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_key_unref(Ptr<mctp_sk_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_local_output(Ptr<runtime.sock> sk, Ptr<mctp_route> rt, Ptr<SkDefinitions.sk_buff> skb, @OriginalName(value="mctp_eid_t") char daddr, char req_tag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_newroute(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_pkttype_receive(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<PacketDefinitions.packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_route_add(Ptr<mctp_dev> mdev, @OriginalName(value="mctp_eid_t") char daddr_start, @Unsigned int daddr_extent, @Unsigned int mtu, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_route_add_local(Ptr<mctp_dev> mdev, @OriginalName(value="mctp_eid_t") char addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_route_discard(Ptr<mctp_route> route, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_route_input(Ptr<mctp_route> route, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mctp_route> mctp_route_lookup(Ptr<runtime.net> net2, @Unsigned int dnet, @OriginalName(value="mctp_eid_t") char daddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_route_output(Ptr<mctp_route> route, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_route_release(Ptr<mctp_route> rt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_route_remove(Ptr<mctp_dev> mdev, @OriginalName(value="mctp_eid_t") char daddr_start, @Unsigned int daddr_extent, char type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_route_remove_dev(Ptr<mctp_dev> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_route_remove_local(Ptr<mctp_dev> mdev, @OriginalName(value="mctp_eid_t") char addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_routes_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_routes_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_routes_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_routes_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__mctp_dev_get((const struct net_device*)$arg1)")
    public static Ptr<mctp_dev> __mctp_dev_get(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mctp_dev> mctp_add_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_addr_notify(Ptr<mctp_dev> mdev, @OriginalName(value="mctp_eid_t") char eid, int msg_type, Ptr<SkDefinitions.sk_buff> req_skb, Ptr<runtime.nlmsghdr> req_nlh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mctp_dev_get_rtnl((const struct net_device*)$arg1)")
    public static Ptr<mctp_dev> mctp_dev_get_rtnl(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_dev_hold(Ptr<mctp_dev> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_dev_notify(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_dev_put(Ptr<mctp_dev> mdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_dev_release_key(Ptr<mctp_dev> dev, Ptr<mctp_sk_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_dev_set_key(Ptr<mctp_dev> dev, Ptr<mctp_sk_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_device_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_device_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_dump_addrinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_fill_addrinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<mctp_dev> mdev, @OriginalName(value="mctp_eid_t") char eid, int msg_type, @Unsigned int portid, @Unsigned int seq, int flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mctp_fill_link_af($arg1, (const struct net_device*)$arg2, $arg3)")
    public static int mctp_fill_link_af(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mctp_get_link_af_size((const struct net_device*)$arg1, $arg2)")
    public static @Unsigned long mctp_get_link_af_size(Ptr<NetDefinitions.net_device> dev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mctp_register_netdev($arg1, (const struct mctp_netdev_ops*)$arg2)")
    public static int mctp_register_netdev(Ptr<NetDefinitions.net_device> dev, Ptr<mctp_netdev_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_rtm_deladdr(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_rtm_newaddr(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mctp_set_link_af($arg1, (const struct nlattr*)$arg2, $arg3)")
    public static int mctp_set_link_af(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.nlattr> attr2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_unregister_netdev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_bind(Ptr<runtime.socket> sock2, Ptr<runtime.sockaddr> addr2, int addrlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_compat_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_getsockopt(Ptr<runtime.socket> sock2, int level, int optname, String optval, Ptr<Integer> optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_ioctl(Ptr<runtime.socket> sock2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_ioctl_alloctag(Ptr<mctp_sock> msk, boolean tagv2, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_ioctl_tag_copy_from_user(@Unsigned long arg2, Ptr<mctp_ioc_tag_ctl2> ctl, boolean tagv2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_pf_create(Ptr<runtime.net> net2, Ptr<runtime.socket> sock2, int protocol, int kern) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_recvmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_release(Ptr<runtime.socket> sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_sendmsg(Ptr<runtime.socket> sock2, Ptr<runtime.msghdr> msg, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_setsockopt(Ptr<runtime.socket> sock2, int level, int optname, misc.sockptr_t optval, @Unsigned int optlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_sk_close(Ptr<runtime.sock> sk, long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_sk_destruct(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_sk_expire_keys(Ptr<TimerDefinitions.timer_list> timer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_sk_hash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mctp_sk_init(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mctp_sk_unhash(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_dump_cb")
    @NotUsableInJava
    public static class mctp_dump_cb
    extends Struct {
        public int h;
        public int idx;
        public @Unsigned long a_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_neigh")
    @NotUsableInJava
    public static class mctp_neigh
    extends Struct {
        public Ptr<mctp_dev> dev;
        public @OriginalName(value="mctp_eid_t") char eid;
        public mctp_neigh_source source;
        public char @Size(value=32) [] ha;
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="enum mctp_neigh_source")
    public static enum mctp_neigh_source implements Enum<mctp_neigh_source>,
    TypedEnum<mctp_neigh_source, Integer>
    {
        MCTP_NEIGH_STATIC,
        MCTP_NEIGH_DISCOVER;

    }

    @Type(noCCodeGeneration=true, cType="struct mctp_netdev_ops")
    @NotUsableInJava
    public static class mctp_netdev_ops
    extends Struct {
        public Ptr<?> release_flow;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_route")
    @NotUsableInJava
    public static class mctp_route
    extends Struct {
        public @OriginalName(value="mctp_eid_t") char min;
        public @OriginalName(value="mctp_eid_t") char max;
        public char type;
        public @Unsigned int mtu;
        public Ptr<mctp_dev> dev;
        public Ptr<?> output;
        public ListDefinitions.list_head list;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_skb_cb")
    @NotUsableInJava
    public static class mctp_skb_cb
    extends Struct {
        public @Unsigned int magic;
        public @Unsigned int net;
        public int ifindex;
        public @OriginalName(value="mctp_eid_t") char src;
        public char halen;
        public char @Size(value=32) [] haddr;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_sk_key")
    @NotUsableInJava
    public static class mctp_sk_key
    extends Struct {
        public @Unsigned int net;
        public @OriginalName(value="mctp_eid_t") char peer_addr;
        public @OriginalName(value="mctp_eid_t") char local_addr;
        public char tag;
        public Ptr<runtime.sock> sk;
        public misc.hlist_node hlist;
        public misc.hlist_node sklist;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public Ptr<SkDefinitions.sk_buff> reasm_head;
        public Ptr<Ptr<SkDefinitions.sk_buff>> reasm_tailp;
        public boolean reasm_dead;
        public char last_seq;
        public boolean valid;
        public @Unsigned long expiry;
        public @Unsigned long dev_flow_state;
        public Ptr<mctp_dev> dev;
        public boolean manual_alloc;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_sock")
    @NotUsableInJava
    public static class mctp_sock
    extends Struct {
        public runtime.sock sk;
        public @Unsigned int bind_net;
        public @OriginalName(value="mctp_eid_t") char bind_addr;
        public char bind_type;
        public boolean addr_ext;
        public misc.hlist_head keys;
        public TimerDefinitions.timer_list key_expiry;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_hdr")
    @NotUsableInJava
    public static class mctp_hdr
    extends Struct {
        public char ver;
        public char dest;
        public char src;
        public char flags_seq_tag;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_ioc_tag_ctl2")
    @NotUsableInJava
    public static class mctp_ioc_tag_ctl2
    extends Struct {
        public @Unsigned int net;
        public @OriginalName(value="mctp_eid_t") char peer_addr;
        public @OriginalName(value="mctp_eid_t") char local_addr;
        public @Unsigned short flags;
        public char tag;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_ioc_tag_ctl")
    @NotUsableInJava
    public static class mctp_ioc_tag_ctl
    extends Struct {
        public @OriginalName(value="mctp_eid_t") char peer_addr;
        public char tag;
        public @Unsigned short flags;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_addr")
    @NotUsableInJava
    public static class mctp_addr
    extends Struct {
        public @OriginalName(value="mctp_eid_t") char s_addr;
    }

    @Type(noCCodeGeneration=true, cType="struct mctp_dev")
    @NotUsableInJava
    public static class mctp_dev
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refs;
        public @Unsigned int net;
        public Ptr<mctp_netdev_ops> ops;
        public Ptr<Character> addrs;
        public @Unsigned long num_addrs;
        public  @OriginalName(value="spinlock_t") runtime.spinlock addrs_lock;
        public misc.callback_head rcu;
    }
}

