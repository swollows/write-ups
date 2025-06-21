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
import me.bechberger.ebpf.runtime.DstDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NlaDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class RtnlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_net_dumpid(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_net_dumpid_one(int id, Ptr<?> peer, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_net_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_fill_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_net_getid(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_net_newid(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_net_notifyid(Ptr<runtime.net> net2, int cmd, int id, @Unsigned int portid, Ptr<runtime.nlmsghdr> nlh, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_valid_dump_net_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4)")
    public static int rtnl_valid_dump_net_req(Ptr<runtime.nlmsghdr> nlh, Ptr<runtime.sock> sk, Ptr<rtnl_net_dump_cb> net_cb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rtnl_link_register(Ptr<rtnl_link_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rtnl_link_unregister(Ptr<rtnl_link_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rtnl_newlink(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<rtnl_newlink_tbs> tbs, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__rtnl_register_many((const struct rtnl_msg_handler*)$arg1, $arg2)")
    public static int __rtnl_register_many(Ptr<rtnl_msg_handler> handlers, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __rtnl_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__rtnl_unregister_many((const struct rtnl_msg_handler*)$arg1, $arg2)")
    public static void __rtnl_unregister_many(Ptr<rtnl_msg_handler> handlers, int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct rtnl_af_ops*)rtnl_af_lookup((const int)$arg1))")
    public static Ptr<rtnl_af_ops> rtnl_af_lookup(int family) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_af_register(Ptr<rtnl_af_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_af_unregister(Ptr<rtnl_af_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_bridge_dellink(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_bridge_getlink(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_bridge_notify(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_bridge_setlink(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_configure_link($arg1, (const struct ifinfomsg*)$arg2, $arg3, (const struct nlmsghdr*)$arg4)")
    public static int rtnl_configure_link(Ptr<NetDefinitions.net_device> dev, Ptr<runtime.ifinfomsg> ifm, @Unsigned int portid, Ptr<runtime.nlmsghdr> nlh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_create_link($arg1, (const u8*)$arg2, $arg3, (const struct rtnl_link_ops*)$arg4, $arg5, $arg6)")
    public static Ptr<NetDefinitions.net_device> rtnl_create_link(Ptr<runtime.net> net2, String ifname, char name_assign_type, Ptr<rtnl_link_ops> ops, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_delete_link($arg1, $arg2, (const struct nlmsghdr*)$arg3)")
    public static int rtnl_delete_link(Ptr<NetDefinitions.net_device> dev, @Unsigned int portid, Ptr<runtime.nlmsghdr> nlh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_dellink(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_dellinkprop(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> rtnl_dev_get(Ptr<runtime.net> net2, Ptr<Ptr<runtime.nlattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_dump_all(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_dump_ifinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_ensure_unique_netns(Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, boolean netns_id_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_fdb_add(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_fdb_del(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_fdb_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_fdb_get(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_fdb_notify(Ptr<NetDefinitions.net_device> dev, Ptr<Character> addr2, @Unsigned short vid, int type2, @Unsigned short ndm_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_fill_ifinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<runtime.net> src_net, int type2, @Unsigned int pid2, @Unsigned int seq, @Unsigned int change, @Unsigned int flags, @Unsigned int ext_filter_mask, @Unsigned int event2, Ptr<Integer> new_nsid, int new_ifindex, int tgt_netnsid, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_fill_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_fill_vf(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_fill_vfinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, int vfs_num, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.net> rtnl_get_net_ns_capable(Ptr<runtime.sock> sk, int netnsid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_getlink(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_is_locked() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_kfree_skbs(Ptr<SkDefinitions.sk_buff> head, Ptr<SkDefinitions.sk_buff> tail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_link_fill($arg1, (const struct net_device*)$arg2)")
    public static int rtnl_link_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.net> rtnl_link_get_net(Ptr<runtime.net> src_net, Ptr<Ptr<runtime.nlattr>> tb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_link_get_net_capable((const struct sk_buff*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<runtime.net> rtnl_link_get_net_capable(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> src_net, Ptr<Ptr<runtime.nlattr>> tb, int cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_link_get_size((const struct net_device*)$arg1)")
    public static @Unsigned long rtnl_link_get_size(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_link_register(Ptr<rtnl_link_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_link_unregister(Ptr<rtnl_link_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_lock_killable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_mdb_add(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_mdb_del(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_mdb_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_mdb_get(Ptr<SkDefinitions.sk_buff> in_skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_newlink(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_newlink_create($arg1, $arg2, (const struct rtnl_link_ops*)$arg3, (const struct nlmsghdr*)$arg4, $arg5, $arg6, $arg7)")
    public static int rtnl_newlink_create(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.ifinfomsg> ifm, Ptr<rtnl_link_ops> ops, Ptr<runtime.nlmsghdr> nlh, Ptr<Ptr<runtime.nlattr>> tb, Ptr<Ptr<runtime.nlattr>> data, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_newlinkprop(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_nla_parse_ifinfomsg($arg1, (const struct nlattr*)$arg2, $arg3)")
    public static int rtnl_nla_parse_ifinfomsg(Ptr<Ptr<runtime.nlattr>> tb, Ptr<runtime.nlattr> nla_peer, Ptr<NetlinkDefinitions.netlink_ext_ack> exterr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_notify($arg1, $arg2, $arg3, $arg4, (const struct nlmsghdr*)$arg5, $arg6)")
    public static void rtnl_notify(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2, @Unsigned int pid2, @Unsigned int group, Ptr<runtime.nlmsghdr> nlh, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_offload_xstats_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<Integer> prividx, @Unsigned int off_filter_mask, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_offload_xstats_fill_hw_s_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_offload_xstats_get_size((const struct net_device*)$arg1, $arg2)")
    public static int rtnl_offload_xstats_get_size(Ptr<NetDefinitions.net_device> dev, @Unsigned int off_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_offload_xstats_notify(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_port_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned int ext_filter_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_put_cacheinfo(Ptr<SkDefinitions.sk_buff> skb, Ptr<DstDefinitions.dst_entry> dst, @Unsigned int id, long expires, @Unsigned int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_register(int protocol, int msgtype, @OriginalName(value="rtnl_doit_func") Ptr<?> doit, @OriginalName(value="rtnl_dumpit_func") Ptr<?> dumpit, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_register_internal(Ptr<runtime.module> owner, int protocol, int msgtype, @OriginalName(value="rtnl_doit_func") Ptr<?> doit, @OriginalName(value="rtnl_dumpit_func") Ptr<?> dumpit, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_register_module(Ptr<runtime.module> owner, int protocol, int msgtype, @OriginalName(value="rtnl_doit_func") Ptr<?> doit, @OriginalName(value="rtnl_dumpit_func") Ptr<?> dumpit, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_set_sk_err(Ptr<runtime.net> net2, @Unsigned int group, int error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_setlink(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_stats_dump(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_stats_get(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_stats_get_parse((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4)")
    public static int rtnl_stats_get_parse(Ptr<runtime.nlmsghdr> nlh, @Unsigned int filter_mask, Ptr<rtnl_stats_dump_filters> filters, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_stats_set(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.nlmsghdr> nlh, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_trylock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_unicast(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.net> net2, @Unsigned int pid2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_unregister(int protocol, int msgtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rtnl_unregister_all(int protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_valid_stats_req((const struct nlmsghdr*)$arg1, $arg2, $arg3, $arg4)")
    public static int rtnl_valid_stats_req(Ptr<runtime.nlmsghdr> nlh, boolean strict_check, boolean is_dump, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_validate_mdb_entry((const struct nlattr*)$arg1, $arg2)")
    public static int rtnl_validate_mdb_entry(Ptr<runtime.nlattr> attr2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_validate_mdb_entry_del_bulk((const struct nlattr*)$arg1, $arg2)")
    public static int rtnl_validate_mdb_entry_del_bulk(Ptr<runtime.nlattr> attr2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rtnl_validate_mdb_entry_get((const struct nlattr*)$arg1, $arg2)")
    public static int rtnl_validate_mdb_entry_get(Ptr<runtime.nlattr> attr2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rtnl_xdp_fill(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_net_dump_cb")
    @NotUsableInJava
    public static class rtnl_net_dump_cb
    extends Struct {
        public Ptr<runtime.net> tgt_net;
        public Ptr<runtime.net> ref_net;
        public Ptr<SkDefinitions.sk_buff> skb;
        public NetDefinitions.net_fill_args fillargs;
        public int idx;
        public int s_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_mdb_dump_ctx")
    @NotUsableInJava
    public static class rtnl_mdb_dump_ctx
    extends Struct {
        public long idx;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_stats_dump_filters")
    @NotUsableInJava
    public static class rtnl_stats_dump_filters
    extends Struct {
        public @Unsigned int @Size(value=6) [] mask;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_offload_xstats_request_used")
    @NotUsableInJava
    public static class rtnl_offload_xstats_request_used
    extends Struct {
        public boolean request;
        public boolean used;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_newlink_tbs")
    @NotUsableInJava
    public static class rtnl_newlink_tbs
    extends Struct {
        public Ptr<runtime.nlattr> @Size(value=66) [] tb;
        public Ptr<runtime.nlattr> @Size(value=51) [] attr;
        public Ptr<runtime.nlattr> @Size(value=45) [] slave_attr;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_link")
    @NotUsableInJava
    public static class rtnl_link
    extends Struct {
        public @OriginalName(value="rtnl_doit_func") Ptr<?> doit;
        public @OriginalName(value="rtnl_dumpit_func") Ptr<?> dumpit;
        public Ptr<runtime.module> owner;
        public @Unsigned int flags;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_af_ops")
    @NotUsableInJava
    public static class rtnl_af_ops
    extends Struct {
        public ListDefinitions.list_head list;
        public int family;
        public Ptr<?> fill_link_af;
        public Ptr<?> get_link_af_size;
        public Ptr<?> validate_link_af;
        public Ptr<?> set_link_af;
        public Ptr<?> fill_stats_af;
        public Ptr<?> get_stats_af_size;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_msg_handler")
    @NotUsableInJava
    public static class rtnl_msg_handler
    extends Struct {
        public Ptr<runtime.module> owner;
        public int protocol;
        public int msgtype;
        public @OriginalName(value="rtnl_doit_func") Ptr<?> doit;
        public @OriginalName(value="rtnl_dumpit_func") Ptr<?> dumpit;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="enum rtnl_kinds")
    public static enum rtnl_kinds implements Enum<rtnl_kinds>,
    TypedEnum<rtnl_kinds, Integer>
    {
        RTNL_KIND_NEW,
        RTNL_KIND_DEL,
        RTNL_KIND_GET,
        RTNL_KIND_SET;

    }

    @Type(noCCodeGeneration=true, cType="enum rtnl_link_flags")
    public static enum rtnl_link_flags implements Enum<rtnl_link_flags>,
    TypedEnum<rtnl_link_flags, Integer>
    {
        RTNL_FLAG_DOIT_UNLOCKED,
        RTNL_FLAG_BULK_DEL_SUPPORTED,
        RTNL_FLAG_DUMP_UNLOCKED,
        RTNL_FLAG_DUMP_SPLIT_NLM_DONE;

    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_link_ifmap")
    @NotUsableInJava
    public static class rtnl_link_ifmap
    extends Struct {
        public @Unsigned long mem_start;
        public @Unsigned long mem_end;
        public @Unsigned long base_addr;
        public @Unsigned short irq;
        public char dma;
        public char port;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_link_stats")
    @NotUsableInJava
    public static class rtnl_link_stats
    extends Struct {
        public @Unsigned int rx_packets;
        public @Unsigned int tx_packets;
        public @Unsigned int rx_bytes;
        public @Unsigned int tx_bytes;
        public @Unsigned int rx_errors;
        public @Unsigned int tx_errors;
        public @Unsigned int rx_dropped;
        public @Unsigned int tx_dropped;
        public @Unsigned int multicast;
        public @Unsigned int collisions;
        public @Unsigned int rx_length_errors;
        public @Unsigned int rx_over_errors;
        public @Unsigned int rx_crc_errors;
        public @Unsigned int rx_frame_errors;
        public @Unsigned int rx_fifo_errors;
        public @Unsigned int rx_missed_errors;
        public @Unsigned int tx_aborted_errors;
        public @Unsigned int tx_carrier_errors;
        public @Unsigned int tx_fifo_errors;
        public @Unsigned int tx_heartbeat_errors;
        public @Unsigned int tx_window_errors;
        public @Unsigned int rx_compressed;
        public @Unsigned int tx_compressed;
        public @Unsigned int rx_nohandler;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_link_ops")
    @NotUsableInJava
    public static class rtnl_link_ops
    extends Struct {
        public ListDefinitions.list_head list;
        public String kind;
        public @Unsigned long priv_size;
        public Ptr<?> alloc;
        public Ptr<?> setup;
        public boolean netns_refund;
        public @Unsigned int maxtype;
        public Ptr<NlaDefinitions.nla_policy> policy;
        public Ptr<?> validate;
        public Ptr<?> newlink;
        public Ptr<?> changelink;
        public Ptr<?> dellink;
        public Ptr<?> get_size;
        public Ptr<?> fill_info;
        public Ptr<?> get_xstats_size;
        public Ptr<?> fill_xstats;
        public Ptr<?> get_num_tx_queues;
        public Ptr<?> get_num_rx_queues;
        public @Unsigned int slave_maxtype;
        public Ptr<NlaDefinitions.nla_policy> slave_policy;
        public Ptr<?> slave_changelink;
        public Ptr<?> get_slave_size;
        public Ptr<?> fill_slave_info;
        public Ptr<?> get_link_net;
        public Ptr<?> get_linkxstats_size;
        public Ptr<?> fill_linkxstats;
    }

    @Type(noCCodeGeneration=true, cType="enum rtnl_link_state_of_net_device")
    public static enum rtnl_link_state_of_net_device implements Enum<rtnl_link_state_of_net_device>,
    TypedEnum<rtnl_link_state_of_net_device, Integer>
    {
        RTNL_LINK_INITIALIZED,
        RTNL_LINK_INITIALIZING;

    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_hw_stats64")
    @NotUsableInJava
    public static class rtnl_hw_stats64
    extends Struct {
        public @Unsigned long rx_packets;
        public @Unsigned long tx_packets;
        public @Unsigned long rx_bytes;
        public @Unsigned long tx_bytes;
        public @Unsigned long rx_errors;
        public @Unsigned long tx_errors;
        public @Unsigned long rx_dropped;
        public @Unsigned long tx_dropped;
        public @Unsigned long multicast;
    }

    @Type(noCCodeGeneration=true, cType="struct rtnl_link_stats64")
    @NotUsableInJava
    public static class rtnl_link_stats64
    extends Struct {
        public @Unsigned long rx_packets;
        public @Unsigned long tx_packets;
        public @Unsigned long rx_bytes;
        public @Unsigned long tx_bytes;
        public @Unsigned long rx_errors;
        public @Unsigned long tx_errors;
        public @Unsigned long rx_dropped;
        public @Unsigned long tx_dropped;
        public @Unsigned long multicast;
        public @Unsigned long collisions;
        public @Unsigned long rx_length_errors;
        public @Unsigned long rx_over_errors;
        public @Unsigned long rx_crc_errors;
        public @Unsigned long rx_frame_errors;
        public @Unsigned long rx_fifo_errors;
        public @Unsigned long rx_missed_errors;
        public @Unsigned long tx_aborted_errors;
        public @Unsigned long tx_carrier_errors;
        public @Unsigned long tx_fifo_errors;
        public @Unsigned long tx_heartbeat_errors;
        public @Unsigned long tx_window_errors;
        public @Unsigned long rx_compressed;
        public @Unsigned long tx_compressed;
        public @Unsigned long rx_nohandler;
        public @Unsigned long rx_otherhost_dropped;
    }
}

