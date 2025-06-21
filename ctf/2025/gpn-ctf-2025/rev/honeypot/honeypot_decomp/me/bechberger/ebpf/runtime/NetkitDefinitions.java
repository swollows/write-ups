/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.RtnlDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NetkitDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_change_link(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<runtime.nlattr>> tb, Ptr<Ptr<runtime.nlattr>> data, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_close(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_del_link(Ptr<NetDefinitions.net_device> dev, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netkit_dev_fetch(Ptr<runtime.net> net2, @Unsigned int ifindex, @Unsigned int which) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_mprog_entry> netkit_entry_fetch(Ptr<NetDefinitions.net_device> dev, boolean bundle_fallback) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_entry_update(Ptr<NetDefinitions.net_device> dev, Ptr<BpfDefinitions.bpf_mprog_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_fill_info($arg1, (const struct net_device*)$arg2)")
    public static int netkit_fill_info(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_get_drvinfo(Ptr<NetDefinitions.net_device> dev, Ptr<EthtoolDefinitions.ethtool_drvinfo> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_get_iflink((const struct net_device*)$arg1)")
    public static int netkit_get_iflink(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_get_link_net((const struct net_device*)$arg1)")
    public static Ptr<runtime.net> netkit_get_link_net(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_get_size((const struct net_device*)$arg1)")
    public static @Unsigned long netkit_get_size(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_get_stats(Ptr<NetDefinitions.net_device> dev, Ptr<RtnlDefinitions.rtnl_link_stats64> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_link_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int netkit_link_attach(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_link_dealloc(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_link_detach(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_link_fdinfo((const struct bpf_link*)$arg1, $arg2)")
    public static void netkit_link_fdinfo(Ptr<BpfDefinitions.bpf_link> link2, Ptr<SeqDefinitions.seq_file> seq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_link_fill_info((const struct bpf_link*)$arg1, $arg2)")
    public static int netkit_link_fill_info(Ptr<BpfDefinitions.bpf_link> link2, Ptr<BpfDefinitions.bpf_link_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_link_release(Ptr<BpfDefinitions.bpf_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_link_update(Ptr<BpfDefinitions.bpf_link> link2, Ptr<BpfDefinitions.bpf_prog> nprog, Ptr<BpfDefinitions.bpf_prog> oprog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_new_link(Ptr<runtime.net> src_net, Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<runtime.nlattr>> tb, Ptr<Ptr<runtime.nlattr>> data, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_open(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> netkit_peer_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_prog_attach((const union bpf_attr*)$arg1, $arg2)")
    public static int netkit_prog_attach(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_prog_detach((const union bpf_attr*)$arg1, $arg2)")
    public static int netkit_prog_detach(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="netkit_prog_query((const union bpf_attr*)$arg1, $arg2)")
    public static int netkit_prog_query(Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_set_headroom(Ptr<NetDefinitions.net_device> dev, int headroom) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_set_macaddr(Ptr<NetDefinitions.net_device> dev, Ptr<?> sa) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_set_multicast(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_setup(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void netkit_uninit(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int netkit_validate(Ptr<Ptr<runtime.nlattr>> tb, Ptr<Ptr<runtime.nlattr>> data, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx netkit_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct netkit_link")
    @NotUsableInJava
    public static class netkit_link
    extends Struct {
        public BpfDefinitions.bpf_link link;
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned int location;
    }

    @Type(noCCodeGeneration=true, cType="enum netkit_scrub")
    public static enum netkit_scrub implements Enum<netkit_scrub>,
    TypedEnum<netkit_scrub, Integer>
    {
        NETKIT_SCRUB_NONE,
        NETKIT_SCRUB_DEFAULT;

    }

    @Type(noCCodeGeneration=true, cType="enum netkit_mode")
    public static enum netkit_mode implements Enum<netkit_mode>,
    TypedEnum<netkit_mode, Integer>
    {
        NETKIT_L2,
        NETKIT_L3;

    }

    @Type(noCCodeGeneration=true, cType="enum netkit_action")
    public static enum netkit_action implements Enum<netkit_action>,
    TypedEnum<netkit_action, Integer>
    {
        NETKIT_NEXT,
        NETKIT_PASS,
        NETKIT_DROP,
        NETKIT_REDIRECT;

    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int ifindex; unsigned int attach_type; }")
    @NotUsableInJava
    public static class netkit_of_anon_member_of_bpf_link_info_and_tcx_of_anon_member_of_bpf_link_info
    extends Struct {
        public @Unsigned int ifindex;
        public @Unsigned int attach_type;
    }

    @Type(noCCodeGeneration=true, cType="struct { union { unsigned int relative_fd; unsigned int relative_id; }; long long unsigned int expected_revision; }")
    @NotUsableInJava
    public static class netkit_of_anon_member_of_link_create_of_bpf_attr_and_tcx_of_anon_member_of_link_create_of_bpf_attr
    extends Struct {
        @InlineUnion(value=1766)
        public @InlineUnion(value=1766) @Unsigned int relative_fd;
        @InlineUnion(value=1766)
        public @InlineUnion(value=1766) @Unsigned int relative_id;
        public @Unsigned long expected_revision;
    }
}

