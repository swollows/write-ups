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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VlanDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="vlan_ioctl_set((int (*)(struct net*, void*))$arg1)")
    public static void vlan_ioctl_set(Ptr<?> hook) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __vlan_insert_inner_tag(Ptr<SkDefinitions.sk_buff> skb, @Unsigned @OriginalName(value="__be16") short vlan_proto, @Unsigned short vlan_tci, @Unsigned int mac_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__be16") short vlan_get_protocol_dgram(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short vlan_get_tci(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> vlan_remove_tag(Ptr<SkDefinitions.sk_buff> skb, Ptr<@Unsigned Short> vlan_tci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<NetDefinitions.net_device> __vlan_find_dev_deep_rcu(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short vlan_proto, @Unsigned short vlan_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vlan_add_rx_filter_info(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vlan_dev_real_dev((const struct net_device*)$arg1)")
    public static Ptr<NetDefinitions.net_device> vlan_dev_real_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vlan_dev_vlan_id((const struct net_device*)$arg1)")
    public static @Unsigned short vlan_dev_vlan_id(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vlan_dev_vlan_proto((const struct net_device*)$arg1)")
    public static @Unsigned @OriginalName(value="__be16") short vlan_dev_vlan_proto(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vlan_do_receive(Ptr<Ptr<SkDefinitions.sk_buff>> skbp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vlan_filter_drop_vids(Ptr<vlan_info> vlan_info2, @Unsigned @OriginalName(value="__be16") short proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vlan_filter_push_vids(Ptr<vlan_info> vlan_info2, @Unsigned @OriginalName(value="__be16") short proto2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vlan_for_each($arg1, (int (*)(struct net_device*, int, void*))$arg2, $arg3)")
    public static int vlan_for_each(Ptr<NetDefinitions.net_device> dev, Ptr<?> action, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vlan_gro_complete(Ptr<SkDefinitions.sk_buff> skb, int nhoff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> vlan_gro_receive(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vlan_info_rcu_free(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vlan_kill_rx_filter_info(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vlan_offload_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vlan_uses_dev((const struct net_device*)$arg1)")
    public static boolean vlan_uses_dev(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vlan_vid_add(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vlan_vid_del(Ptr<NetDefinitions.net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vlan_vids_add_by_dev($arg1, (const struct net_device*)$arg2)")
    public static int vlan_vids_add_by_dev(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> by_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vlan_vids_del_by_dev($arg1, (const struct net_device*)$arg2)")
    public static void vlan_vids_del_by_dev(Ptr<NetDefinitions.net_device> dev, Ptr<NetDefinitions.net_device> by_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vlan_vid")
    @NotUsableInJava
    public static class vlan_vid
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned @OriginalName(value="__be16") short proto;
        public @Unsigned short vid;
    }

    @Type(noCCodeGeneration=true, cType="struct vlan_vid_info")
    @NotUsableInJava
    public static class vlan_vid_info
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned @OriginalName(value="__be16") short proto;
        public @Unsigned short vid;
        public int refcount;
    }

    @Type(noCCodeGeneration=true, cType="struct vlan_group")
    @NotUsableInJava
    public static class vlan_group
    extends Struct {
        public @Unsigned int nr_vlan_devs;
        public misc.hlist_node hlist;
        public Ptr<Ptr<NetDefinitions.net_device>> @Size(value=16) [] vlan_devices_arrays;
    }

    @Type(noCCodeGeneration=true, cType="enum vlan_protos")
    public static enum vlan_protos implements Enum<vlan_protos>,
    TypedEnum<vlan_protos, Integer>
    {
        VLAN_PROTO_8021Q,
        VLAN_PROTO_8021AD,
        VLAN_PROTO_NUM;

    }

    @Type(noCCodeGeneration=true, cType="struct vlan_dev_priv")
    @NotUsableInJava
    public static class vlan_dev_priv
    extends Struct {
        public @Unsigned int nr_ingress_mappings;
        public @Unsigned int @Size(value=8) [] ingress_priority_map;
        public @Unsigned int nr_egress_mappings;
        public Ptr<vlan_priority_tci_mapping> @Size(value=16) [] egress_priority_map;
        public @Unsigned @OriginalName(value="__be16") short vlan_proto;
        public @Unsigned short vlan_id;
        public @Unsigned short flags;
        public Ptr<NetDefinitions.net_device> real_dev;
        public  @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public char @Size(value=6) [] real_dev_addr;
        public Ptr<ProcDefinitions.proc_dir_entry> dent;
        public Ptr<vlan_pcpu_stats> vlan_pcpu_stats;
        public Ptr<runtime.netpoll> netpoll;
    }

    @Type(noCCodeGeneration=true, cType="struct vlan_priority_tci_mapping")
    @NotUsableInJava
    public static class vlan_priority_tci_mapping
    extends Struct {
        public @Unsigned int priority;
        public @Unsigned short vlan_qos;
        public Ptr<vlan_priority_tci_mapping> next;
    }

    @Type(noCCodeGeneration=true, cType="struct vlan_pcpu_stats")
    @NotUsableInJava
    public static class vlan_pcpu_stats
    extends Struct {
        public misc.u64_stats_t rx_packets;
        public misc.u64_stats_t rx_bytes;
        public misc.u64_stats_t rx_multicast;
        public misc.u64_stats_t tx_packets;
        public misc.u64_stats_t tx_bytes;
        public misc.u64_stats_sync syncp;
        public @Unsigned int rx_errors;
        public @Unsigned int tx_dropped;
    }

    @Type(noCCodeGeneration=true, cType="struct vlan_ethhdr")
    @NotUsableInJava
    public static class vlan_ethhdr
    extends Struct {
        @InlineUnion(value=26964)
        public  @InlineUnion(value=26964) misc.addrs_of_anon_member_of_vlan_ethhdr_and_anon_member_of_anon_member_of_vlan_ethhdr anon0$0;
        @InlineUnion(value=26964)
        public  @InlineUnion(value=26964) misc.addrs_of_anon_member_of_vlan_ethhdr_and_anon_member_of_anon_member_of_vlan_ethhdr addrs;
        public @Unsigned @OriginalName(value="__be16") short h_vlan_proto;
        public @Unsigned @OriginalName(value="__be16") short h_vlan_TCI;
        public @Unsigned @OriginalName(value="__be16") short h_vlan_encapsulated_proto;
    }

    @Type(noCCodeGeneration=true, cType="enum vlan_flags")
    public static enum vlan_flags implements Enum<vlan_flags>,
    TypedEnum<vlan_flags, Integer>
    {
        VLAN_FLAG_REORDER_HDR,
        VLAN_FLAG_GVRP,
        VLAN_FLAG_LOOSE_BINDING,
        VLAN_FLAG_MVRP,
        VLAN_FLAG_BRIDGE_BINDING;

    }

    @Type(noCCodeGeneration=true, cType="struct vlan_info")
    @NotUsableInJava
    public static class vlan_info
    extends Struct {
        public Ptr<NetDefinitions.net_device> real_dev;
        public vlan_group grp;
        public ListDefinitions.list_head vid_list;
        public @Unsigned int nr_vids;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct vlan_hdr")
    @NotUsableInJava
    public static class vlan_hdr
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short h_vlan_TCI;
        public @Unsigned @OriginalName(value="__be16") short h_vlan_encapsulated_proto;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 dst[6]; u8 src[6]; }")
    @NotUsableInJava
    public static class vlan_push_eth_of_anon_member_of_flow_action_entry
    extends Struct {
        public char @Size(value=6) [] dst;
        public char @Size(value=6) [] src;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int vid; short unsigned int proto; u8 prio; }")
    @NotUsableInJava
    public static class vlan_of_anon_member_of_flow_action_entry
    extends Struct {
        public @Unsigned short vid;
        public @Unsigned @OriginalName(value="__be16") short proto;
        public char prio;
    }

    @Type(noCCodeGeneration=true, cType="enum vlan_mode_of_bridge_of_anon_member_of_net_device_path")
    public static enum vlan_mode_of_bridge_of_anon_member_of_net_device_path implements Enum<vlan_mode_of_bridge_of_anon_member_of_net_device_path>,
    TypedEnum<vlan_mode_of_bridge_of_anon_member_of_net_device_path, Integer>
    {
        DEV_PATH_BR_VLAN_KEEP,
        DEV_PATH_BR_VLAN_TAG,
        DEV_PATH_BR_VLAN_UNTAG,
        DEV_PATH_BR_VLAN_UNTAG_HW;

    }
}

