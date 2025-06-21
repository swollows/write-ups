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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PortDefinitions;
import me.bechberger.ebpf.runtime.RdmaDefinitions;
import me.bechberger.ebpf.runtime.RdmacgDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class IbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ib_prctl_set(Ptr<TaskDefinitions.task_struct> task2, @Unsigned long ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ib_security_struct")
    @NotUsableInJava
    public static class ib_security_struct
    extends Struct {
        public @Unsigned int sid;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_core_device")
    @NotUsableInJava
    public static class ib_core_device
    extends Struct {
        public runtime.device dev;
        public misc.possible_net_t rdma_net;
        public Ptr<runtime.kobject> ports_kobj;
        public ListDefinitions.list_head port_list;
        public Ptr<ib_device> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_device_ops")
    @NotUsableInJava
    public static class ib_device_ops
    extends Struct {
        public Ptr<runtime.module> owner;
        public RdmaDefinitions.rdma_driver_id driver_id;
        public @Unsigned int uverbs_abi_ver;
        public @Unsigned int uverbs_no_driver_id_binding;
        public Ptr<AttributeDefinitions.attribute_group> device_group;
        public Ptr<Ptr<AttributeDefinitions.attribute_group>> port_groups;
        public Ptr<?> post_send;
        public Ptr<?> post_recv;
        public Ptr<?> drain_rq;
        public Ptr<?> drain_sq;
        public Ptr<?> poll_cq;
        public Ptr<?> peek_cq;
        public Ptr<?> req_notify_cq;
        public Ptr<?> post_srq_recv;
        public Ptr<?> process_mad;
        public Ptr<?> query_device;
        public Ptr<?> modify_device;
        public Ptr<?> get_dev_fw_str;
        public Ptr<?> get_vector_affinity;
        public Ptr<?> query_port;
        public Ptr<?> modify_port;
        public Ptr<?> get_port_immutable;
        public Ptr<?> get_link_layer;
        public Ptr<?> get_netdev;
        public Ptr<?> alloc_rdma_netdev;
        public Ptr<?> rdma_netdev_get_params;
        public Ptr<?> query_gid;
        public Ptr<?> add_gid;
        public Ptr<?> del_gid;
        public Ptr<?> query_pkey;
        public Ptr<?> alloc_ucontext;
        public Ptr<?> dealloc_ucontext;
        public Ptr<?> mmap;
        public Ptr<?> mmap_free;
        public Ptr<?> disassociate_ucontext;
        public Ptr<?> alloc_pd;
        public Ptr<?> dealloc_pd;
        public Ptr<?> create_ah;
        public Ptr<?> create_user_ah;
        public Ptr<?> modify_ah;
        public Ptr<?> query_ah;
        public Ptr<?> destroy_ah;
        public Ptr<?> create_srq;
        public Ptr<?> modify_srq;
        public Ptr<?> query_srq;
        public Ptr<?> destroy_srq;
        public Ptr<?> create_qp;
        public Ptr<?> modify_qp;
        public Ptr<?> query_qp;
        public Ptr<?> destroy_qp;
        public Ptr<?> create_cq;
        public Ptr<?> modify_cq;
        public Ptr<?> destroy_cq;
        public Ptr<?> resize_cq;
        public Ptr<?> get_dma_mr;
        public Ptr<?> reg_user_mr;
        public Ptr<?> reg_user_mr_dmabuf;
        public Ptr<?> rereg_user_mr;
        public Ptr<?> dereg_mr;
        public Ptr<?> alloc_mr;
        public Ptr<?> alloc_mr_integrity;
        public Ptr<?> advise_mr;
        public Ptr<?> map_mr_sg;
        public Ptr<?> check_mr_status;
        public Ptr<?> alloc_mw;
        public Ptr<?> dealloc_mw;
        public Ptr<?> attach_mcast;
        public Ptr<?> detach_mcast;
        public Ptr<?> alloc_xrcd;
        public Ptr<?> dealloc_xrcd;
        public Ptr<?> create_flow;
        public Ptr<?> destroy_flow;
        public Ptr<?> destroy_flow_action;
        public Ptr<?> set_vf_link_state;
        public Ptr<?> get_vf_config;
        public Ptr<?> get_vf_stats;
        public Ptr<?> get_vf_guid;
        public Ptr<?> set_vf_guid;
        public Ptr<?> create_wq;
        public Ptr<?> destroy_wq;
        public Ptr<?> modify_wq;
        public Ptr<?> create_rwq_ind_table;
        public Ptr<?> destroy_rwq_ind_table;
        public Ptr<?> alloc_dm;
        public Ptr<?> dealloc_dm;
        public Ptr<?> reg_dm_mr;
        public Ptr<?> create_counters;
        public Ptr<?> destroy_counters;
        public Ptr<?> read_counters;
        public Ptr<?> map_mr_sg_pi;
        public Ptr<?> alloc_hw_device_stats;
        public Ptr<?> alloc_hw_port_stats;
        public Ptr<?> get_hw_stats;
        public Ptr<?> modify_hw_stat;
        public Ptr<?> fill_res_mr_entry;
        public Ptr<?> fill_res_mr_entry_raw;
        public Ptr<?> fill_res_cq_entry;
        public Ptr<?> fill_res_cq_entry_raw;
        public Ptr<?> fill_res_qp_entry;
        public Ptr<?> fill_res_qp_entry_raw;
        public Ptr<?> fill_res_cm_id_entry;
        public Ptr<?> fill_res_srq_entry;
        public Ptr<?> fill_res_srq_entry_raw;
        public Ptr<?> enable_driver;
        public Ptr<?> dealloc_driver;
        public Ptr<?> iw_add_ref;
        public Ptr<?> iw_rem_ref;
        public Ptr<?> iw_get_qp;
        public Ptr<?> iw_connect;
        public Ptr<?> iw_accept;
        public Ptr<?> iw_reject;
        public Ptr<?> iw_create_listen;
        public Ptr<?> iw_destroy_listen;
        public Ptr<?> counter_bind_qp;
        public Ptr<?> counter_unbind_qp;
        public Ptr<?> counter_dealloc;
        public Ptr<?> counter_alloc_stats;
        public Ptr<?> counter_update_stats;
        public Ptr<?> fill_stat_mr_entry;
        public Ptr<?> query_ucontext;
        public Ptr<?> get_numa_node;
        public Ptr<?> add_sub_dev;
        public Ptr<?> del_sub_dev;
        public @Unsigned long size_ib_ah;
        public @Unsigned long size_ib_counters;
        public @Unsigned long size_ib_cq;
        public @Unsigned long size_ib_mw;
        public @Unsigned long size_ib_pd;
        public @Unsigned long size_ib_qp;
        public @Unsigned long size_ib_rwq_ind_table;
        public @Unsigned long size_ib_srq;
        public @Unsigned long size_ib_ucontext;
        public @Unsigned long size_ib_xrcd;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_counters_read_attr")
    @NotUsableInJava
    public static class ib_counters_read_attr
    extends Struct {
        public Ptr<@Unsigned Long> counters_buff;
        public @Unsigned int ncounters;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_port_data")
    @NotUsableInJava
    public static class ib_port_data
    extends Struct {
        public Ptr<ib_device> ib_dev;
        public ib_port_immutable immutable;
        public  @OriginalName(value="spinlock_t") runtime.spinlock pkey_list_lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock netdev_lock;
        public ListDefinitions.list_head pkey_list;
        public ib_port_cache cache;
        public Ptr<NetDefinitions.net_device> netdev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p netdev_tracker;
        public misc.hlist_node ndev_hash_link;
        public RdmaDefinitions.rdma_port_counter port_counter;
        public @OriginalName(value="ib_port") Ptr<?> sysfs;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_port_immutable")
    @NotUsableInJava
    public static class ib_port_immutable
    extends Struct {
        public int pkey_tbl_len;
        public int gid_tbl_len;
        public @Unsigned int core_cap_flags;
        public @Unsigned int max_mad_size;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_port_cache")
    @NotUsableInJava
    public static class ib_port_cache
    extends Struct {
        public @Unsigned long subnet_prefix;
        public @OriginalName(value="ib_pkey_cache") Ptr<?> pkey;
        public @OriginalName(value="ib_gid_table") Ptr<?> gid;
        public char lmc;
        public ib_port_state port_state;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_flow_action_type")
    public static enum ib_flow_action_type implements Enum<ib_flow_action_type>,
    TypedEnum<ib_flow_action_type, Integer>
    {
        IB_FLOW_ACTION_UNSPECIFIED,
        IB_FLOW_ACTION_ESP;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow")
    @NotUsableInJava
    public static class ib_flow
    extends Struct {
        public Ptr<ib_qp> qp;
        public Ptr<ib_device> device;
        public Ptr<ib_uobject> uobject;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_attr")
    @NotUsableInJava
    public static class ib_flow_attr
    extends Struct {
        public ib_flow_attr_type type;
        public @Unsigned short size;
        public @Unsigned short priority;
        public @Unsigned int flags;
        public char num_of_specs;
        public @Unsigned int port;
        public ib_flow_spec @Size(value=0) [] flows;
    }

    @Type(noCCodeGeneration=true, cType="union ib_flow_spec")
    @NotUsableInJava
    public static class ib_flow_spec
    extends Union {
        public AnonDefinitions.anon_member_of_ib_flow_spec anon0;
        public ib_flow_spec_eth eth;
        public ib_flow_spec_ib ib;
        public ib_flow_spec_ipv4 ipv4;
        public ib_flow_spec_tcp_udp tcp_udp;
        public ib_flow_spec_ipv6 ipv6;
        public ib_flow_spec_tunnel tunnel;
        public ib_flow_spec_esp esp;
        public ib_flow_spec_gre gre;
        public ib_flow_spec_mpls mpls;
        public ib_flow_spec_action_tag flow_tag;
        public ib_flow_spec_action_drop drop;
        public ib_flow_spec_action_handle action;
        public ib_flow_spec_action_count flow_count;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_counters")
    @NotUsableInJava
    public static class ib_counters
    extends Struct {
        public Ptr<ib_device> device;
        public Ptr<ib_uobject> uobject;
        public AtomicDefinitions.atomic_t usecnt;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_action_count")
    @NotUsableInJava
    public static class ib_flow_spec_action_count
    extends Struct {
        public ib_flow_spec_type type;
        public @Unsigned short size;
        public Ptr<ib_counters> counters;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_action")
    @NotUsableInJava
    public static class ib_flow_action
    extends Struct {
        public Ptr<ib_device> device;
        public Ptr<ib_uobject> uobject;
        public ib_flow_action_type type;
        public AtomicDefinitions.atomic_t usecnt;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_action_handle")
    @NotUsableInJava
    public static class ib_flow_spec_action_handle
    extends Struct {
        public ib_flow_spec_type type;
        public @Unsigned short size;
        public Ptr<ib_flow_action> act;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_action_drop")
    @NotUsableInJava
    public static class ib_flow_spec_action_drop
    extends Struct {
        public ib_flow_spec_type type;
        public @Unsigned short size;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_action_tag")
    @NotUsableInJava
    public static class ib_flow_spec_action_tag
    extends Struct {
        public ib_flow_spec_type type;
        public @Unsigned short size;
        public @Unsigned int tag_id;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_mpls")
    @NotUsableInJava
    public static class ib_flow_spec_mpls
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_mpls_filter val;
        public ib_flow_mpls_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_mpls_filter")
    @NotUsableInJava
    public static class ib_flow_mpls_filter
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int tag;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_gre")
    @NotUsableInJava
    public static class ib_flow_spec_gre
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_gre_filter val;
        public ib_flow_gre_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_gre_filter")
    @NotUsableInJava
    public static class ib_flow_gre_filter
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short c_ks_res0_ver;
        public @Unsigned @OriginalName(value="__be16") short protocol;
        public @Unsigned @OriginalName(value="__be32") int key;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_esp")
    @NotUsableInJava
    public static class ib_flow_spec_esp
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_esp_filter val;
        public ib_flow_esp_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_esp_filter")
    @NotUsableInJava
    public static class ib_flow_esp_filter
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int spi;
        public @Unsigned @OriginalName(value="__be32") int seq;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_tunnel")
    @NotUsableInJava
    public static class ib_flow_spec_tunnel
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_tunnel_filter val;
        public ib_flow_tunnel_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_tunnel_filter")
    @NotUsableInJava
    public static class ib_flow_tunnel_filter
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int tunnel_id;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_tcp_udp")
    @NotUsableInJava
    public static class ib_flow_spec_tcp_udp
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_tcp_udp_filter val;
        public ib_flow_tcp_udp_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_tcp_udp_filter")
    @NotUsableInJava
    public static class ib_flow_tcp_udp_filter
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short dst_port;
        public @Unsigned @OriginalName(value="__be16") short src_port;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_ipv6")
    @NotUsableInJava
    public static class ib_flow_spec_ipv6
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_ipv6_filter val;
        public ib_flow_ipv6_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_ipv6_filter")
    @NotUsableInJava
    public static class ib_flow_ipv6_filter
    extends Struct {
        public char @Size(value=16) [] src_ip;
        public char @Size(value=16) [] dst_ip;
        public @Unsigned @OriginalName(value="__be32") int flow_label;
        public char next_hdr;
        public char traffic_class;
        public char hop_limit;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_ipv4")
    @NotUsableInJava
    public static class ib_flow_spec_ipv4
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_ipv4_filter val;
        public ib_flow_ipv4_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_ipv4_filter")
    @NotUsableInJava
    public static class ib_flow_ipv4_filter
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int src_ip;
        public @Unsigned @OriginalName(value="__be32") int dst_ip;
        public char proto;
        public char tos;
        public char ttl;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_ib")
    @NotUsableInJava
    public static class ib_flow_spec_ib
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_ib_filter val;
        public ib_flow_ib_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_ib_filter")
    @NotUsableInJava
    public static class ib_flow_ib_filter
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short dlid;
        public char sl;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_spec_eth")
    @NotUsableInJava
    public static class ib_flow_spec_eth
    extends Struct {
        public @Unsigned int type;
        public @Unsigned short size;
        public ib_flow_eth_filter val;
        public ib_flow_eth_filter mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_flow_eth_filter")
    @NotUsableInJava
    public static class ib_flow_eth_filter
    extends Struct {
        public char @Size(value=6) [] dst_mac;
        public char @Size(value=6) [] src_mac;
        public @Unsigned @OriginalName(value="__be16") short ether_type;
        public @Unsigned @OriginalName(value="__be16") short vlan_tag;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_flow_spec_type")
    public static enum ib_flow_spec_type implements Enum<ib_flow_spec_type>,
    TypedEnum<ib_flow_spec_type, Integer>
    {
        IB_FLOW_SPEC_ETH,
        IB_FLOW_SPEC_IB,
        IB_FLOW_SPEC_IPV4,
        IB_FLOW_SPEC_IPV6,
        IB_FLOW_SPEC_ESP,
        IB_FLOW_SPEC_TCP,
        IB_FLOW_SPEC_UDP,
        IB_FLOW_SPEC_VXLAN_TUNNEL,
        IB_FLOW_SPEC_GRE,
        IB_FLOW_SPEC_MPLS,
        IB_FLOW_SPEC_INNER,
        IB_FLOW_SPEC_ACTION_TAG,
        IB_FLOW_SPEC_ACTION_DROP,
        IB_FLOW_SPEC_ACTION_HANDLE,
        IB_FLOW_SPEC_ACTION_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_flow_attr_type")
    public static enum ib_flow_attr_type implements Enum<ib_flow_attr_type>,
    TypedEnum<ib_flow_attr_type, Integer>
    {
        IB_FLOW_ATTR_NORMAL,
        IB_FLOW_ATTR_ALL_DEFAULT,
        IB_FLOW_ATTR_MC_DEFAULT,
        IB_FLOW_ATTR_SNIFFER;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_mw")
    @NotUsableInJava
    public static class ib_mw
    extends Struct {
        public Ptr<ib_device> device;
        public Ptr<ib_pd> pd;
        public Ptr<ib_uobject> uobject;
        public @Unsigned int rkey;
        public ib_mw_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_dm")
    @NotUsableInJava
    public static class ib_dm
    extends Struct {
        public Ptr<ib_device> device;
        public @Unsigned int length;
        public @Unsigned int flags;
        public Ptr<ib_uobject> uobject;
        public AtomicDefinitions.atomic_t usecnt;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_ports_pkeys")
    @NotUsableInJava
    public static class ib_ports_pkeys
    extends Struct {
        public ib_port_pkey main;
        public ib_port_pkey alt;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_qp_security")
    @NotUsableInJava
    public static class ib_qp_security
    extends Struct {
        public Ptr<ib_qp> qp;
        public Ptr<ib_device> dev;
        public runtime.mutex mutex;
        public Ptr<ib_ports_pkeys> ports_pkeys;
        public ListDefinitions.list_head shared_qp_list;
        public Ptr<?> security;
        public boolean destroying;
        public AtomicDefinitions.atomic_t error_list_count;
        public runtime.completion error_complete;
        public int error_comps_pending;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_port_pkey")
    @NotUsableInJava
    public static class ib_port_pkey
    extends Struct {
        public PortDefinitions.port_pkey_state state;
        public @Unsigned short pkey_index;
        public @Unsigned int port_num;
        public ListDefinitions.list_head qp_list;
        public ListDefinitions.list_head to_error_list;
        public Ptr<ib_qp_security> sec;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_rwq_ind_table_init_attr")
    @NotUsableInJava
    public static class ib_rwq_ind_table_init_attr
    extends Struct {
        public @Unsigned int log_ind_tbl_size;
        public Ptr<Ptr<ib_wq>> ind_tbl;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_wq_attr")
    @NotUsableInJava
    public static class ib_wq_attr
    extends Struct {
        public ib_wq_state wq_state;
        public ib_wq_state curr_wq_state;
        public @Unsigned int flags;
        public @Unsigned int flags_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_wq_init_attr")
    @NotUsableInJava
    public static class ib_wq_init_attr
    extends Struct {
        public Ptr<?> wq_context;
        public ib_wq_type wq_type;
        public @Unsigned int max_wr;
        public @Unsigned int max_sge;
        public Ptr<ib_cq> cq;
        public Ptr<?> event_handler;
        public @Unsigned int create_flags;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_wq_state")
    public static enum ib_wq_state implements Enum<ib_wq_state>,
    TypedEnum<ib_wq_state, Integer>
    {
        IB_WQS_RESET,
        IB_WQS_RDY,
        IB_WQS_ERR;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_wq_type")
    public static enum ib_wq_type implements Enum<ib_wq_type>,
    TypedEnum<ib_wq_type, Integer>
    {
        IB_WQT_RQ;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_pd")
    @NotUsableInJava
    public static class ib_pd
    extends Struct {
        public @Unsigned int local_dma_lkey;
        public @Unsigned int flags;
        public Ptr<ib_device> device;
        public Ptr<ib_uobject> uobject;
        public AtomicDefinitions.atomic_t usecnt;
        public @Unsigned int unsafe_global_rkey;
        public Ptr<ib_mr> __internal_mr;
        public RdmaDefinitions.rdma_restrack_entry res;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_udata")
    @NotUsableInJava
    public static class ib_udata
    extends Struct {
        public Ptr<?> inbuf;
        public Ptr<?> outbuf;
        public @Unsigned long inlen;
        public @Unsigned long outlen;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_uobject")
    @NotUsableInJava
    public static class ib_uobject
    extends Struct {
        public @Unsigned long user_handle;
        public @OriginalName(value="ib_uverbs_file") Ptr<?> ufile;
        public Ptr<ib_ucontext> context;
        public Ptr<?> object;
        public ListDefinitions.list_head list;
        public ib_rdmacg_object cg_obj;
        public int id;
        public runtime.kref ref;
        public AtomicDefinitions.atomic_t usecnt;
        public misc.callback_head rcu;
        public @OriginalName(value="uverbs_api_object") Ptr<?> uapi_object;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_ucontext")
    @NotUsableInJava
    public static class ib_ucontext
    extends Struct {
        public Ptr<ib_device> device;
        public @OriginalName(value="ib_uverbs_file") Ptr<?> ufile;
        public ib_rdmacg_object cg_obj;
        public RdmaDefinitions.rdma_restrack_entry res;
        public runtime.xarray mmap_xa;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_rdmacg_object")
    @NotUsableInJava
    public static class ib_rdmacg_object
    extends Struct {
        public Ptr<RdmaDefinitions.rdma_cgroup> cg;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_recv_wr")
    @NotUsableInJava
    public static class ib_recv_wr
    extends Struct {
        public Ptr<ib_recv_wr> next;
        @InlineUnion(value=26202)
        public @InlineUnion(value=26202) @Unsigned long wr_id;
        @InlineUnion(value=26202)
        public @InlineUnion(value=26202) Ptr<ib_cqe> wr_cqe;
        public Ptr<ib_sge> sg_list;
        public int num_sge;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_mr")
    @NotUsableInJava
    public static class ib_mr
    extends Struct {
        public Ptr<ib_device> device;
        public Ptr<ib_pd> pd;
        public @Unsigned int lkey;
        public @Unsigned int rkey;
        public @Unsigned long iova;
        public @Unsigned long length;
        public @Unsigned int page_size;
        public ib_mr_type type;
        public boolean need_inval;
        @InlineUnion(value=26290)
        public @InlineUnion(value=26290) Ptr<ib_uobject> uobject;
        @InlineUnion(value=26290)
        public @InlineUnion(value=26290) ListDefinitions.list_head qp_entry;
        public Ptr<ib_dm> dm;
        public Ptr<ib_sig_attrs> sig_attrs;
        public RdmaDefinitions.rdma_restrack_entry res;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_ah")
    @NotUsableInJava
    public static class ib_ah
    extends Struct {
        public Ptr<ib_device> device;
        public Ptr<ib_pd> pd;
        public Ptr<ib_uobject> uobject;
        public Ptr<ib_gid_attr> sgid_attr;
        public RdmaDefinitions.rdma_ah_attr_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_send_wr")
    @NotUsableInJava
    public static class ib_send_wr
    extends Struct {
        public Ptr<ib_send_wr> next;
        @InlineUnion(value=26202)
        public @InlineUnion(value=26202) @Unsigned long wr_id;
        @InlineUnion(value=26202)
        public @InlineUnion(value=26202) Ptr<ib_cqe> wr_cqe;
        public Ptr<ib_sge> sg_list;
        public int num_sge;
        public ib_wr_opcode opcode;
        public int send_flags;
        public misc.ex_of_ib_send_wr_and_ex_of_ib_wc ex;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_sge")
    @NotUsableInJava
    public static class ib_sge
    extends Struct {
        public @Unsigned long addr;
        public @Unsigned int length;
        public @Unsigned int lkey;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_wr_opcode")
    public static enum ib_wr_opcode implements Enum<ib_wr_opcode>,
    TypedEnum<ib_wr_opcode, Integer>
    {
        IB_WR_RDMA_WRITE,
        IB_WR_RDMA_WRITE_WITH_IMM,
        IB_WR_SEND,
        IB_WR_SEND_WITH_IMM,
        IB_WR_RDMA_READ,
        IB_WR_ATOMIC_CMP_AND_SWP,
        IB_WR_ATOMIC_FETCH_AND_ADD,
        IB_WR_BIND_MW,
        IB_WR_LSO,
        IB_WR_SEND_WITH_INV,
        IB_WR_RDMA_READ_WITH_INV,
        IB_WR_LOCAL_INV,
        IB_WR_MASKED_ATOMIC_CMP_AND_SWP,
        IB_WR_MASKED_ATOMIC_FETCH_AND_ADD,
        IB_WR_FLUSH,
        IB_WR_ATOMIC_WRITE,
        IB_WR_REG_MR,
        IB_WR_REG_MR_INTEGRITY,
        IB_WR_RESERVED1,
        IB_WR_RESERVED2,
        IB_WR_RESERVED3,
        IB_WR_RESERVED4,
        IB_WR_RESERVED5,
        IB_WR_RESERVED6,
        IB_WR_RESERVED7,
        IB_WR_RESERVED8,
        IB_WR_RESERVED9,
        IB_WR_RESERVED10;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_qp_attr")
    @NotUsableInJava
    public static class ib_qp_attr
    extends Struct {
        public ib_qp_state qp_state;
        public ib_qp_state cur_qp_state;
        public ib_mtu path_mtu;
        public ib_mig_state path_mig_state;
        public @Unsigned int qkey;
        public @Unsigned int rq_psn;
        public @Unsigned int sq_psn;
        public @Unsigned int dest_qp_num;
        public int qp_access_flags;
        public ib_qp_cap cap;
        public RdmaDefinitions.rdma_ah_attr ah_attr;
        public RdmaDefinitions.rdma_ah_attr alt_ah_attr;
        public @Unsigned short pkey_index;
        public @Unsigned short alt_pkey_index;
        public char en_sqd_async_notify;
        public char sq_draining;
        public char max_rd_atomic;
        public char max_dest_rd_atomic;
        public char min_rnr_timer;
        public @Unsigned int port_num;
        public char timeout;
        public char retry_cnt;
        public char rnr_retry;
        public @Unsigned int alt_port_num;
        public char alt_timeout;
        public @Unsigned int rate_limit;
        public Ptr<NetDefinitions.net_device> xmit_slave;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_mw_type")
    public static enum ib_mw_type implements Enum<ib_mw_type>,
    TypedEnum<ib_mw_type, Integer>
    {
        IB_MW_TYPE_1,
        IB_MW_TYPE_2;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_mig_state")
    public static enum ib_mig_state implements Enum<ib_mig_state>,
    TypedEnum<ib_mig_state, Integer>
    {
        IB_MIG_MIGRATED,
        IB_MIG_REARM,
        IB_MIG_ARMED;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_qp_state")
    public static enum ib_qp_state implements Enum<ib_qp_state>,
    TypedEnum<ib_qp_state, Integer>
    {
        IB_QPS_RESET,
        IB_QPS_INIT,
        IB_QPS_RTR,
        IB_QPS_RTS,
        IB_QPS_SQD,
        IB_QPS_SQE,
        IB_QPS_ERR;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_rwq_ind_table")
    @NotUsableInJava
    public static class ib_rwq_ind_table
    extends Struct {
        public Ptr<ib_device> device;
        public Ptr<ib_uobject> uobject;
        public AtomicDefinitions.atomic_t usecnt;
        public @Unsigned int ind_tbl_num;
        public @Unsigned int log_ind_tbl_size;
        public Ptr<Ptr<ib_wq>> ind_tbl;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_qp_init_attr")
    @NotUsableInJava
    public static class ib_qp_init_attr
    extends Struct {
        public Ptr<?> event_handler;
        public Ptr<?> qp_context;
        public Ptr<ib_cq> send_cq;
        public Ptr<ib_cq> recv_cq;
        public Ptr<ib_srq> srq;
        public Ptr<ib_xrcd> xrcd;
        public ib_qp_cap cap;
        public ib_sig_type sq_sig_type;
        public ib_qp_type qp_type;
        public @Unsigned int create_flags;
        public @Unsigned int port_num;
        public Ptr<ib_rwq_ind_table> rwq_ind_tbl;
        public @Unsigned int source_qpn;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_qp_type")
    public static enum ib_qp_type implements Enum<ib_qp_type>,
    TypedEnum<ib_qp_type, Integer>
    {
        IB_QPT_SMI,
        IB_QPT_GSI,
        IB_QPT_RC,
        IB_QPT_UC,
        IB_QPT_UD,
        IB_QPT_RAW_IPV6,
        IB_QPT_RAW_ETHERTYPE,
        IB_QPT_RAW_PACKET,
        IB_QPT_XRC_INI,
        IB_QPT_XRC_TGT,
        IB_QPT_MAX,
        IB_QPT_DRIVER,
        IB_QPT_RESERVED1,
        IB_QPT_RESERVED2,
        IB_QPT_RESERVED3,
        IB_QPT_RESERVED4,
        IB_QPT_RESERVED5,
        IB_QPT_RESERVED6,
        IB_QPT_RESERVED7,
        IB_QPT_RESERVED8,
        IB_QPT_RESERVED9,
        IB_QPT_RESERVED10;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_sig_type")
    public static enum ib_sig_type implements Enum<ib_sig_type>,
    TypedEnum<ib_sig_type, Integer>
    {
        IB_SIGNAL_ALL_WR,
        IB_SIGNAL_REQ_WR;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_qp_cap")
    @NotUsableInJava
    public static class ib_qp_cap
    extends Struct {
        public @Unsigned int max_send_wr;
        public @Unsigned int max_recv_wr;
        public @Unsigned int max_send_sge;
        public @Unsigned int max_recv_sge;
        public @Unsigned int max_inline_data;
        public @Unsigned int max_rdma_ctxs;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_srq_init_attr")
    @NotUsableInJava
    public static class ib_srq_init_attr
    extends Struct {
        public Ptr<?> event_handler;
        public Ptr<?> srq_context;
        public ib_srq_attr attr;
        public ib_srq_type srq_type;
        public misc.ext_of_ib_srq_init_attr ext;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_xrcd")
    @NotUsableInJava
    public static class ib_xrcd
    extends Struct {
        public Ptr<ib_device> device;
        public AtomicDefinitions.atomic_t usecnt;
        public Ptr<runtime.inode> inode;
        public misc.rw_semaphore tgt_qps_rwsem;
        public runtime.xarray tgt_qps;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_srq_attr")
    @NotUsableInJava
    public static class ib_srq_attr
    extends Struct {
        public @Unsigned int max_wr;
        public @Unsigned int max_sge;
        public @Unsigned int srq_limit;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_srq_attr_mask")
    public static enum ib_srq_attr_mask implements Enum<ib_srq_attr_mask>,
    TypedEnum<ib_srq_attr_mask, Integer>
    {
        IB_SRQ_MAX_WR,
        IB_SRQ_LIMIT;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_srq_type")
    public static enum ib_srq_type implements Enum<ib_srq_type>,
    TypedEnum<ib_srq_type, Integer>
    {
        IB_SRQT_BASIC,
        IB_SRQT_XRC,
        IB_SRQT_TM;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_cq_notify_flags")
    public static enum ib_cq_notify_flags implements Enum<ib_cq_notify_flags>,
    TypedEnum<ib_cq_notify_flags, Integer>
    {
        IB_CQ_SOLICITED,
        IB_CQ_NEXT_COMP,
        IB_CQ_SOLICITED_MASK,
        IB_CQ_REPORT_MISSED_EVENTS;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_wc")
    @NotUsableInJava
    public static class ib_wc
    extends Struct {
        @InlineUnion(value=26202)
        public @InlineUnion(value=26202) @Unsigned long wr_id;
        @InlineUnion(value=26202)
        public @InlineUnion(value=26202) Ptr<ib_cqe> wr_cqe;
        public ib_wc_status status;
        public ib_wc_opcode opcode;
        public @Unsigned int vendor_err;
        public @Unsigned int byte_len;
        public Ptr<ib_qp> qp;
        public misc.ex_of_ib_send_wr_and_ex_of_ib_wc ex;
        public @Unsigned int src_qp;
        public @Unsigned int slid;
        public int wc_flags;
        public @Unsigned short pkey_index;
        public char sl;
        public char dlid_path_bits;
        public @Unsigned int port_num;
        public char @Size(value=6) [] smac;
        public @Unsigned short vlan_id;
        public char network_hdr_type;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_cqe")
    @NotUsableInJava
    public static class ib_cqe
    extends Struct {
        public Ptr<?> done;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_wc_opcode")
    public static enum ib_wc_opcode implements Enum<ib_wc_opcode>,
    TypedEnum<ib_wc_opcode, Integer>
    {
        IB_WC_SEND,
        IB_WC_RDMA_WRITE,
        IB_WC_RDMA_READ,
        IB_WC_COMP_SWAP,
        IB_WC_FETCH_ADD,
        IB_WC_BIND_MW,
        IB_WC_LOCAL_INV,
        IB_WC_LSO,
        IB_WC_ATOMIC_WRITE,
        IB_WC_REG_MR,
        IB_WC_MASKED_COMP_SWAP,
        IB_WC_MASKED_FETCH_ADD,
        IB_WC_FLUSH,
        IB_WC_RECV,
        IB_WC_RECV_RDMA_WITH_IMM;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_wc_status")
    public static enum ib_wc_status implements Enum<ib_wc_status>,
    TypedEnum<ib_wc_status, Integer>
    {
        IB_WC_SUCCESS,
        IB_WC_LOC_LEN_ERR,
        IB_WC_LOC_QP_OP_ERR,
        IB_WC_LOC_EEC_OP_ERR,
        IB_WC_LOC_PROT_ERR,
        IB_WC_WR_FLUSH_ERR,
        IB_WC_MW_BIND_ERR,
        IB_WC_BAD_RESP_ERR,
        IB_WC_LOC_ACCESS_ERR,
        IB_WC_REM_INV_REQ_ERR,
        IB_WC_REM_ACCESS_ERR,
        IB_WC_REM_OP_ERR,
        IB_WC_RETRY_EXC_ERR,
        IB_WC_RNR_RETRY_EXC_ERR,
        IB_WC_LOC_RDD_VIOL_ERR,
        IB_WC_REM_INV_RD_REQ_ERR,
        IB_WC_REM_ABORT_ERR,
        IB_WC_INV_EECN_ERR,
        IB_WC_INV_EEC_STATE_ERR,
        IB_WC_FATAL_ERR,
        IB_WC_RESP_TIMEOUT_ERR,
        IB_WC_GENERAL_ERR;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_ah_attr")
    @NotUsableInJava
    public static class ib_ah_attr
    extends Struct {
        public @Unsigned short dlid;
        public char src_path_bits;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_mr_status")
    @NotUsableInJava
    public static class ib_mr_status
    extends Struct {
        public @Unsigned int fail_status;
        public ib_sig_err sig_err;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_mr_type")
    public static enum ib_mr_type implements Enum<ib_mr_type>,
    TypedEnum<ib_mr_type, Integer>
    {
        IB_MR_TYPE_MEM_REG,
        IB_MR_TYPE_SG_GAPS,
        IB_MR_TYPE_DM,
        IB_MR_TYPE_USER,
        IB_MR_TYPE_DMA,
        IB_MR_TYPE_INTEGRITY;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_grh")
    @NotUsableInJava
    public static class ib_grh
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int version_tclass_flow;
        public @Unsigned @OriginalName(value="__be16") short paylen;
        public char next_hdr;
        public char hop_limit;
        public ib_gid sgid;
        public ib_gid dgid;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_global_route")
    @NotUsableInJava
    public static class ib_global_route
    extends Struct {
        public Ptr<ib_gid_attr> sgid_attr;
        public ib_gid dgid;
        public @Unsigned int flow_label;
        public char sgid_index;
        public char hop_limit;
        public char traffic_class;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_event")
    @NotUsableInJava
    public static class ib_event
    extends Struct {
        public Ptr<ib_device> device;
        public misc.element_of_ib_event element;
        public ib_event_type event;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_wq")
    @NotUsableInJava
    public static class ib_wq
    extends Struct {
        public Ptr<ib_device> device;
        public @OriginalName(value="ib_uwq_object") Ptr<?> uobject;
        public Ptr<?> wq_context;
        public Ptr<?> event_handler;
        public Ptr<ib_pd> pd;
        public Ptr<ib_cq> cq;
        public @Unsigned int wq_num;
        public ib_wq_state state;
        public ib_wq_type wq_type;
        public AtomicDefinitions.atomic_t usecnt;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_srq")
    @NotUsableInJava
    public static class ib_srq
    extends Struct {
        public Ptr<ib_device> device;
        public Ptr<ib_pd> pd;
        public @OriginalName(value="ib_usrq_object") Ptr<?> uobject;
        public Ptr<?> event_handler;
        public Ptr<?> srq_context;
        public ib_srq_type srq_type;
        public AtomicDefinitions.atomic_t usecnt;
        public misc.ext_of_ib_srq ext;
        public RdmaDefinitions.rdma_restrack_entry res;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_qp")
    @NotUsableInJava
    public static class ib_qp
    extends Struct {
        public Ptr<ib_device> device;
        public Ptr<ib_pd> pd;
        public Ptr<ib_cq> send_cq;
        public Ptr<ib_cq> recv_cq;
        public  @OriginalName(value="spinlock_t") runtime.spinlock mr_lock;
        public int mrs_used;
        public ListDefinitions.list_head rdma_mrs;
        public ListDefinitions.list_head sig_mrs;
        public Ptr<ib_srq> srq;
        public runtime.completion srq_completion;
        public Ptr<ib_xrcd> xrcd;
        public ListDefinitions.list_head xrcd_list;
        public AtomicDefinitions.atomic_t usecnt;
        public ListDefinitions.list_head open_list;
        public Ptr<ib_qp> real_qp;
        public @OriginalName(value="ib_uqp_object") Ptr<?> uobject;
        public Ptr<?> event_handler;
        public Ptr<?> registered_event_handler;
        public Ptr<?> qp_context;
        public Ptr<ib_gid_attr> av_sgid_attr;
        public Ptr<ib_gid_attr> alt_path_sgid_attr;
        public @Unsigned int qp_num;
        public @Unsigned int max_write_sge;
        public @Unsigned int max_read_sge;
        public ib_qp_type qp_type;
        public Ptr<ib_rwq_ind_table> rwq_ind_tbl;
        public Ptr<ib_qp_security> qp_sec;
        public @Unsigned int port;
        public boolean integrity_en;
        public RdmaDefinitions.rdma_restrack_entry res;
        public Ptr<RdmaDefinitions.rdma_counter> counter;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_cq")
    @NotUsableInJava
    public static class ib_cq
    extends Struct {
        public Ptr<ib_device> device;
        public @OriginalName(value="ib_ucq_object") Ptr<?> uobject;
        public @OriginalName(value="ib_comp_handler") Ptr<?> comp_handler;
        public Ptr<?> event_handler;
        public Ptr<?> cq_context;
        public int cqe;
        public @Unsigned int cqe_used;
        public AtomicDefinitions.atomic_t usecnt;
        public ib_poll_context poll_ctx;
        public Ptr<ib_wc> wc;
        public ListDefinitions.list_head pool_entry;
        @InlineUnion(value=26264)
        public @InlineUnion(value=26264) IrqDefinitions.irq_poll iop;
        @InlineUnion(value=26264)
        public @InlineUnion(value=26264) misc.work_struct work;
        public Ptr<WorkqueueDefinitions.workqueue_struct> comp_wq;
        public Ptr<runtime.dim> dim;
        public @OriginalName(value="ktime_t") long timestamp;
        public char interrupt;
        public char shared;
        public @Unsigned int comp_vector;
        public RdmaDefinitions.rdma_restrack_entry res;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_event_type")
    public static enum ib_event_type implements Enum<ib_event_type>,
    TypedEnum<ib_event_type, Integer>
    {
        IB_EVENT_CQ_ERR,
        IB_EVENT_QP_FATAL,
        IB_EVENT_QP_REQ_ERR,
        IB_EVENT_QP_ACCESS_ERR,
        IB_EVENT_COMM_EST,
        IB_EVENT_SQ_DRAINED,
        IB_EVENT_PATH_MIG,
        IB_EVENT_PATH_MIG_ERR,
        IB_EVENT_DEVICE_FATAL,
        IB_EVENT_PORT_ACTIVE,
        IB_EVENT_PORT_ERR,
        IB_EVENT_LID_CHANGE,
        IB_EVENT_PKEY_CHANGE,
        IB_EVENT_SM_CHANGE,
        IB_EVENT_SRQ_ERR,
        IB_EVENT_SRQ_LIMIT_REACHED,
        IB_EVENT_QP_LAST_WQE_REACHED,
        IB_EVENT_CLIENT_REREGISTER,
        IB_EVENT_GID_CHANGE,
        IB_EVENT_WQ_FATAL;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_port_modify")
    @NotUsableInJava
    public static class ib_port_modify
    extends Struct {
        public @Unsigned int set_port_cap_mask;
        public @Unsigned int clr_port_cap_mask;
        public char init_type;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_device_modify")
    @NotUsableInJava
    public static class ib_device_modify
    extends Struct {
        public @Unsigned long sys_image_guid;
        public char @Size(value=64) [] node_desc;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_port_attr")
    @NotUsableInJava
    public static class ib_port_attr
    extends Struct {
        public @Unsigned long subnet_prefix;
        public ib_port_state state;
        public ib_mtu max_mtu;
        public ib_mtu active_mtu;
        public @Unsigned int phys_mtu;
        public int gid_tbl_len;
        public @Unsigned int ip_gids;
        public @Unsigned int port_cap_flags;
        public @Unsigned int max_msg_sz;
        public @Unsigned int bad_pkey_cntr;
        public @Unsigned int qkey_viol_cntr;
        public @Unsigned short pkey_tbl_len;
        public @Unsigned int sm_lid;
        public @Unsigned int lid;
        public char lmc;
        public char max_vl_num;
        public char sm_sl;
        public char subnet_timeout;
        public char init_type_reply;
        public char active_width;
        public @Unsigned short active_speed;
        public char phys_state;
        public @Unsigned short port_cap_flags2;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_port_state")
    public static enum ib_port_state implements Enum<ib_port_state>,
    TypedEnum<ib_port_state, Integer>
    {
        IB_PORT_NOP,
        IB_PORT_DOWN,
        IB_PORT_INIT,
        IB_PORT_ARMED,
        IB_PORT_ACTIVE,
        IB_PORT_ACTIVE_DEFER;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_mtu")
    public static enum ib_mtu implements Enum<ib_mtu>,
    TypedEnum<ib_mtu, Integer>
    {
        IB_MTU_256,
        IB_MTU_512,
        IB_MTU_1024,
        IB_MTU_2048,
        IB_MTU_4096;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_device_attr")
    @NotUsableInJava
    public static class ib_device_attr
    extends Struct {
        public @Unsigned long fw_ver;
        public @Unsigned @OriginalName(value="__be64") long sys_image_guid;
        public @Unsigned long max_mr_size;
        public @Unsigned long page_size_cap;
        public @Unsigned int vendor_id;
        public @Unsigned int vendor_part_id;
        public @Unsigned int hw_ver;
        public int max_qp;
        public int max_qp_wr;
        public @Unsigned long device_cap_flags;
        public @Unsigned long kernel_cap_flags;
        public int max_send_sge;
        public int max_recv_sge;
        public int max_sge_rd;
        public int max_cq;
        public int max_cqe;
        public int max_mr;
        public int max_pd;
        public int max_qp_rd_atom;
        public int max_ee_rd_atom;
        public int max_res_rd_atom;
        public int max_qp_init_rd_atom;
        public int max_ee_init_rd_atom;
        public ib_atomic_cap atomic_cap;
        public ib_atomic_cap masked_atomic_cap;
        public int max_ee;
        public int max_rdd;
        public int max_mw;
        public int max_raw_ipv6_qp;
        public int max_raw_ethy_qp;
        public int max_mcast_grp;
        public int max_mcast_qp_attach;
        public int max_total_mcast_qp_attach;
        public int max_ah;
        public int max_srq;
        public int max_srq_wr;
        public int max_srq_sge;
        public @Unsigned int max_fast_reg_page_list_len;
        public @Unsigned int max_pi_fast_reg_page_list_len;
        public @Unsigned short max_pkeys;
        public char local_ca_ack_delay;
        public int sig_prot_cap;
        public int sig_guard_cap;
        public ib_odp_caps odp_caps;
        public @Unsigned @OriginalName(value="uint64_t") long timestamp_mask;
        public @Unsigned @OriginalName(value="uint64_t") long hca_core_clock;
        public ib_rss_caps rss_caps;
        public @Unsigned int max_wq_type_rq;
        public @Unsigned int raw_packet_caps;
        public ib_tm_caps tm_caps;
        public ib_cq_caps cq_caps;
        public @Unsigned long max_dm_size;
        public @Unsigned int max_sgl_rd;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_dm_alloc_attr")
    @NotUsableInJava
    public static class ib_dm_alloc_attr
    extends Struct {
        public @Unsigned long length;
        public @Unsigned int alignment;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_dm_mr_attr")
    @NotUsableInJava
    public static class ib_dm_mr_attr
    extends Struct {
        public @Unsigned long length;
        public @Unsigned long offset;
        public @Unsigned int access_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_cq_caps")
    @NotUsableInJava
    public static class ib_cq_caps
    extends Struct {
        public @Unsigned short max_cq_moderation_count;
        public @Unsigned short max_cq_moderation_period;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_cq_init_attr")
    @NotUsableInJava
    public static class ib_cq_init_attr
    extends Struct {
        public @Unsigned int cqe;
        public @Unsigned int comp_vector;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_tm_caps")
    @NotUsableInJava
    public static class ib_tm_caps
    extends Struct {
        public @Unsigned int max_rndv_hdr_size;
        public @Unsigned int max_num_tags;
        public @Unsigned int flags;
        public @Unsigned int max_ops;
        public @Unsigned int max_sge;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_rss_caps")
    @NotUsableInJava
    public static class ib_rss_caps
    extends Struct {
        public @Unsigned int supported_qpts;
        public @Unsigned int max_rwq_indirection_tables;
        public @Unsigned int max_rwq_indirection_table_size;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_odp_caps")
    @NotUsableInJava
    public static class ib_odp_caps
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long general_caps;
        public misc.per_transport_caps_of_ib_odp_caps per_transport_caps;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_atomic_cap")
    public static enum ib_atomic_cap implements Enum<ib_atomic_cap>,
    TypedEnum<ib_atomic_cap, Integer>
    {
        IB_ATOMIC_NONE,
        IB_ATOMIC_HCA,
        IB_ATOMIC_GLOB;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_gid_attr")
    @NotUsableInJava
    public static class ib_gid_attr
    extends Struct {
        public Ptr<NetDefinitions.net_device> ndev;
        public Ptr<ib_device> device;
        public ib_gid gid;
        public ib_gid_type gid_type;
        public @Unsigned short index;
        public @Unsigned int port_num;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_gid_type")
    public static enum ib_gid_type implements Enum<ib_gid_type>,
    TypedEnum<ib_gid_type, Integer>
    {
        IB_GID_TYPE_IB,
        IB_GID_TYPE_ROCE,
        IB_GID_TYPE_ROCE_UDP_ENCAP,
        IB_GID_TYPE_SIZE;

    }

    @Type(noCCodeGeneration=true, cType="union ib_gid")
    @NotUsableInJava
    public static class ib_gid
    extends Union {
        public char @Size(value=16) [] raw;
        public misc.global_of_ib_gid global;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_advise_mr_advice")
    public static enum ib_uverbs_advise_mr_advice implements Enum<ib_uverbs_advise_mr_advice>,
    TypedEnum<ib_uverbs_advise_mr_advice, Integer>
    {
        IB_UVERBS_ADVISE_MR_ADVICE_PREFETCH,
        IB_UVERBS_ADVISE_MR_ADVICE_PREFETCH_WRITE,
        IB_UVERBS_ADVISE_MR_ADVICE_PREFETCH_NO_FAULT;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_sig_err")
    @NotUsableInJava
    public static class ib_sig_err
    extends Struct {
        public ib_sig_err_type err_type;
        public @Unsigned int expected;
        public @Unsigned int actual;
        public @Unsigned long sig_err_offset;
        public @Unsigned int key;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_sig_err_type")
    public static enum ib_sig_err_type implements Enum<ib_sig_err_type>,
    TypedEnum<ib_sig_err_type, Integer>
    {
        IB_SIG_BAD_GUARD,
        IB_SIG_BAD_REFTAG,
        IB_SIG_BAD_APPTAG;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_sig_attrs")
    @NotUsableInJava
    public static class ib_sig_attrs
    extends Struct {
        public char check_mask;
        public ib_sig_domain mem;
        public ib_sig_domain wire;
        public int meta_length;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_sig_domain")
    @NotUsableInJava
    public static class ib_sig_domain
    extends Struct {
        public ib_signature_type sig_type;
        public misc.sig_of_ib_sig_domain sig;
    }

    @Type(noCCodeGeneration=true, cType="struct ib_t10_dif_domain")
    @NotUsableInJava
    public static class ib_t10_dif_domain
    extends Struct {
        public ib_t10_dif_bg_type bg_type;
        public @Unsigned short pi_interval;
        public @Unsigned short bg;
        public @Unsigned short app_tag;
        public @Unsigned int ref_tag;
        public boolean ref_remap;
        public boolean app_escape;
        public boolean ref_escape;
        public @Unsigned short apptag_check_mask;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_t10_dif_bg_type")
    public static enum ib_t10_dif_bg_type implements Enum<ib_t10_dif_bg_type>,
    TypedEnum<ib_t10_dif_bg_type, Integer>
    {
        IB_T10DIF_CRC,
        IB_T10DIF_CSUM;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_signature_type")
    public static enum ib_signature_type implements Enum<ib_signature_type>,
    TypedEnum<ib_signature_type, Integer>
    {
        IB_SIG_TYPE_NONE,
        IB_SIG_TYPE_T10_DIF;

    }

    @Type(noCCodeGeneration=true, cType="struct ib_device")
    @NotUsableInJava
    public static class ib_device
    extends Struct {
        public Ptr<runtime.device> dma_device;
        public ib_device_ops ops;
        public char @Size(value=64) [] name;
        public misc.callback_head callback_head;
        public ListDefinitions.list_head event_handler_list;
        public misc.rw_semaphore event_handler_rwsem;
        public  @OriginalName(value="spinlock_t") runtime.spinlock qp_open_list_lock;
        public misc.rw_semaphore client_data_rwsem;
        public runtime.xarray client_data;
        public runtime.mutex unregistration_lock;
        public misc.rwlock_t cache_lock;
        public Ptr<ib_port_data> port_data;
        public int num_comp_vectors;
        @InlineUnion(value=26584)
        public  @InlineUnion(value=26584) runtime.device dev;
        @InlineUnion(value=26584)
        public @InlineUnion(value=26584) ib_core_device coredev;
        public Ptr<AttributeDefinitions.attribute_group> @Size(value=4) [] groups;
        public @Unsigned long uverbs_cmd_mask;
        public char @Size(value=64) [] node_desc;
        public @Unsigned @OriginalName(value="__be64") long node_guid;
        public @Unsigned int local_dma_lkey;
        public @Unsigned short is_switch;
        public @Unsigned short kverbs_provider;
        public @Unsigned short use_cq_dim;
        public char node_type;
        public @Unsigned int phys_port_cnt;
        public ib_device_attr attrs;
        public @OriginalName(value="hw_stats_device_data") Ptr<?> hw_stats_data;
        public RdmacgDefinitions.rdmacg_device cg_device;
        public @Unsigned int index;
        public  @OriginalName(value="spinlock_t") runtime.spinlock cq_pools_lock;
        public ListDefinitions.list_head @Size(value=3) [] cq_pools;
        public @OriginalName(value="rdma_restrack_root") Ptr<?> res;
        public @OriginalName(value="uapi_definition") Ptr<?> driver_def;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public runtime.completion unreg_completion;
        public misc.work_struct unregistration_work;
        public Ptr<RdmaDefinitions.rdma_link_ops> link_ops;
        public runtime.mutex compat_devs_mutex;
        public runtime.xarray compat_devs;
        public char @Size(value=16) [] iw_ifname;
        public @Unsigned int iw_driver_flags;
        public @Unsigned int lag_flags;
        public runtime.mutex subdev_lock;
        public ListDefinitions.list_head subdev_list_head;
        public RdmaDefinitions.rdma_nl_dev_type type;
        public Ptr<ib_device> parent;
        public ListDefinitions.list_head subdev_list;
        public RdmaDefinitions.rdma_nl_name_assign_type name_assign_type;
    }

    @Type(noCCodeGeneration=true, cType="enum ib_poll_context")
    public static enum ib_poll_context implements Enum<ib_poll_context>,
    TypedEnum<ib_poll_context, Integer>
    {
        IB_POLL_SOFTIRQ,
        IB_POLL_WORKQUEUE,
        IB_POLL_UNBOUND_WORKQUEUE,
        IB_POLL_LAST_POOL_TYPE,
        IB_POLL_DIRECT;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_gid_type")
    public static enum ib_uverbs_gid_type implements Enum<ib_uverbs_gid_type>,
    TypedEnum<ib_uverbs_gid_type, Integer>
    {
        IB_UVERBS_GID_TYPE_IB,
        IB_UVERBS_GID_TYPE_ROCE_V1,
        IB_UVERBS_GID_TYPE_ROCE_V2;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_qp_create_flags")
    public static enum ib_uverbs_qp_create_flags implements Enum<ib_uverbs_qp_create_flags>,
    TypedEnum<ib_uverbs_qp_create_flags, Integer>
    {
        IB_UVERBS_QP_CREATE_BLOCK_MULTICAST_LOOPBACK,
        IB_UVERBS_QP_CREATE_SCATTER_FCS,
        IB_UVERBS_QP_CREATE_CVLAN_STRIPPING,
        IB_UVERBS_QP_CREATE_PCI_WRITE_END_PADDING,
        IB_UVERBS_QP_CREATE_SQ_SIG_ALL;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_qp_type")
    public static enum ib_uverbs_qp_type implements Enum<ib_uverbs_qp_type>,
    TypedEnum<ib_uverbs_qp_type, Integer>
    {
        IB_UVERBS_QPT_RC,
        IB_UVERBS_QPT_UC,
        IB_UVERBS_QPT_UD,
        IB_UVERBS_QPT_RAW_PACKET,
        IB_UVERBS_QPT_XRC_INI,
        IB_UVERBS_QPT_XRC_TGT,
        IB_UVERBS_QPT_DRIVER;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_wq_flags")
    public static enum ib_uverbs_wq_flags implements Enum<ib_uverbs_wq_flags>,
    TypedEnum<ib_uverbs_wq_flags, Integer>
    {
        IB_UVERBS_WQ_FLAGS_CVLAN_STRIPPING,
        IB_UVERBS_WQ_FLAGS_SCATTER_FCS,
        IB_UVERBS_WQ_FLAGS_DELAY_DROP,
        IB_UVERBS_WQ_FLAGS_PCI_WRITE_END_PADDING;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_wq_type")
    public static enum ib_uverbs_wq_type implements Enum<ib_uverbs_wq_type>,
    TypedEnum<ib_uverbs_wq_type, Integer>
    {
        IB_UVERBS_WQT_RQ;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_srq_type")
    public static enum ib_uverbs_srq_type implements Enum<ib_uverbs_srq_type>,
    TypedEnum<ib_uverbs_srq_type, Integer>
    {
        IB_UVERBS_SRQT_BASIC,
        IB_UVERBS_SRQT_XRC,
        IB_UVERBS_SRQT_TM;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_access_flags")
    public static enum ib_uverbs_access_flags implements Enum<ib_uverbs_access_flags>,
    TypedEnum<ib_uverbs_access_flags, Integer>
    {
        IB_UVERBS_ACCESS_LOCAL_WRITE,
        IB_UVERBS_ACCESS_REMOTE_WRITE,
        IB_UVERBS_ACCESS_REMOTE_READ,
        IB_UVERBS_ACCESS_REMOTE_ATOMIC,
        IB_UVERBS_ACCESS_MW_BIND,
        IB_UVERBS_ACCESS_ZERO_BASED,
        IB_UVERBS_ACCESS_ON_DEMAND,
        IB_UVERBS_ACCESS_HUGETLB,
        IB_UVERBS_ACCESS_FLUSH_GLOBAL,
        IB_UVERBS_ACCESS_FLUSH_PERSISTENT,
        IB_UVERBS_ACCESS_RELAXED_ORDERING,
        IB_UVERBS_ACCESS_OPTIONAL_RANGE;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_raw_packet_caps")
    public static enum ib_uverbs_raw_packet_caps implements Enum<ib_uverbs_raw_packet_caps>,
    TypedEnum<ib_uverbs_raw_packet_caps, Integer>
    {
        IB_UVERBS_RAW_PACKET_CAP_CVLAN_STRIPPING,
        IB_UVERBS_RAW_PACKET_CAP_SCATTER_FCS,
        IB_UVERBS_RAW_PACKET_CAP_IP_CSUM,
        IB_UVERBS_RAW_PACKET_CAP_DELAY_DROP;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_device_cap_flags")
    public static enum ib_uverbs_device_cap_flags implements Enum<ib_uverbs_device_cap_flags>,
    TypedEnum<ib_uverbs_device_cap_flags, Long>
    {
        IB_UVERBS_DEVICE_RESIZE_MAX_WR,
        IB_UVERBS_DEVICE_BAD_PKEY_CNTR,
        IB_UVERBS_DEVICE_BAD_QKEY_CNTR,
        IB_UVERBS_DEVICE_RAW_MULTI,
        IB_UVERBS_DEVICE_AUTO_PATH_MIG,
        IB_UVERBS_DEVICE_CHANGE_PHY_PORT,
        IB_UVERBS_DEVICE_UD_AV_PORT_ENFORCE,
        IB_UVERBS_DEVICE_CURR_QP_STATE_MOD,
        IB_UVERBS_DEVICE_SHUTDOWN_PORT,
        IB_UVERBS_DEVICE_PORT_ACTIVE_EVENT,
        IB_UVERBS_DEVICE_SYS_IMAGE_GUID,
        IB_UVERBS_DEVICE_RC_RNR_NAK_GEN,
        IB_UVERBS_DEVICE_SRQ_RESIZE,
        IB_UVERBS_DEVICE_N_NOTIFY_CQ,
        IB_UVERBS_DEVICE_MEM_WINDOW,
        IB_UVERBS_DEVICE_UD_IP_CSUM,
        IB_UVERBS_DEVICE_XRC,
        IB_UVERBS_DEVICE_MEM_MGT_EXTENSIONS,
        IB_UVERBS_DEVICE_MEM_WINDOW_TYPE_2A,
        IB_UVERBS_DEVICE_MEM_WINDOW_TYPE_2B,
        IB_UVERBS_DEVICE_RC_IP_CSUM,
        IB_UVERBS_DEVICE_RAW_IP_CSUM,
        IB_UVERBS_DEVICE_MANAGED_FLOW_STEERING,
        IB_UVERBS_DEVICE_RAW_SCATTER_FCS,
        IB_UVERBS_DEVICE_PCI_WRITE_END_PADDING,
        IB_UVERBS_DEVICE_FLUSH_GLOBAL,
        IB_UVERBS_DEVICE_FLUSH_PERSISTENT,
        IB_UVERBS_DEVICE_ATOMIC_WRITE;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_wr_opcode")
    public static enum ib_uverbs_wr_opcode implements Enum<ib_uverbs_wr_opcode>,
    TypedEnum<ib_uverbs_wr_opcode, Integer>
    {
        IB_UVERBS_WR_RDMA_WRITE,
        IB_UVERBS_WR_RDMA_WRITE_WITH_IMM,
        IB_UVERBS_WR_SEND,
        IB_UVERBS_WR_SEND_WITH_IMM,
        IB_UVERBS_WR_RDMA_READ,
        IB_UVERBS_WR_ATOMIC_CMP_AND_SWP,
        IB_UVERBS_WR_ATOMIC_FETCH_AND_ADD,
        IB_UVERBS_WR_LOCAL_INV,
        IB_UVERBS_WR_BIND_MW,
        IB_UVERBS_WR_SEND_WITH_INV,
        IB_UVERBS_WR_TSO,
        IB_UVERBS_WR_RDMA_READ_WITH_INV,
        IB_UVERBS_WR_MASKED_ATOMIC_CMP_AND_SWP,
        IB_UVERBS_WR_MASKED_ATOMIC_FETCH_AND_ADD,
        IB_UVERBS_WR_FLUSH,
        IB_UVERBS_WR_ATOMIC_WRITE;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_create_qp_mask")
    public static enum ib_uverbs_create_qp_mask implements Enum<ib_uverbs_create_qp_mask>,
    TypedEnum<ib_uverbs_create_qp_mask, Integer>
    {
        IB_UVERBS_CREATE_QP_MASK_IND_TABLE;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_wc_opcode")
    public static enum ib_uverbs_wc_opcode implements Enum<ib_uverbs_wc_opcode>,
    TypedEnum<ib_uverbs_wc_opcode, Integer>
    {
        IB_UVERBS_WC_SEND,
        IB_UVERBS_WC_RDMA_WRITE,
        IB_UVERBS_WC_RDMA_READ,
        IB_UVERBS_WC_COMP_SWAP,
        IB_UVERBS_WC_FETCH_ADD,
        IB_UVERBS_WC_BIND_MW,
        IB_UVERBS_WC_LOCAL_INV,
        IB_UVERBS_WC_TSO,
        IB_UVERBS_WC_FLUSH,
        IB_UVERBS_WC_ATOMIC_WRITE;

    }

    @Type(noCCodeGeneration=true, cType="enum ib_uverbs_write_cmds")
    public static enum ib_uverbs_write_cmds implements Enum<ib_uverbs_write_cmds>,
    TypedEnum<ib_uverbs_write_cmds, Integer>
    {
        IB_USER_VERBS_CMD_GET_CONTEXT,
        IB_USER_VERBS_CMD_QUERY_DEVICE,
        IB_USER_VERBS_CMD_QUERY_PORT,
        IB_USER_VERBS_CMD_ALLOC_PD,
        IB_USER_VERBS_CMD_DEALLOC_PD,
        IB_USER_VERBS_CMD_CREATE_AH,
        IB_USER_VERBS_CMD_MODIFY_AH,
        IB_USER_VERBS_CMD_QUERY_AH,
        IB_USER_VERBS_CMD_DESTROY_AH,
        IB_USER_VERBS_CMD_REG_MR,
        IB_USER_VERBS_CMD_REG_SMR,
        IB_USER_VERBS_CMD_REREG_MR,
        IB_USER_VERBS_CMD_QUERY_MR,
        IB_USER_VERBS_CMD_DEREG_MR,
        IB_USER_VERBS_CMD_ALLOC_MW,
        IB_USER_VERBS_CMD_BIND_MW,
        IB_USER_VERBS_CMD_DEALLOC_MW,
        IB_USER_VERBS_CMD_CREATE_COMP_CHANNEL,
        IB_USER_VERBS_CMD_CREATE_CQ,
        IB_USER_VERBS_CMD_RESIZE_CQ,
        IB_USER_VERBS_CMD_DESTROY_CQ,
        IB_USER_VERBS_CMD_POLL_CQ,
        IB_USER_VERBS_CMD_PEEK_CQ,
        IB_USER_VERBS_CMD_REQ_NOTIFY_CQ,
        IB_USER_VERBS_CMD_CREATE_QP,
        IB_USER_VERBS_CMD_QUERY_QP,
        IB_USER_VERBS_CMD_MODIFY_QP,
        IB_USER_VERBS_CMD_DESTROY_QP,
        IB_USER_VERBS_CMD_POST_SEND,
        IB_USER_VERBS_CMD_POST_RECV,
        IB_USER_VERBS_CMD_ATTACH_MCAST,
        IB_USER_VERBS_CMD_DETACH_MCAST,
        IB_USER_VERBS_CMD_CREATE_SRQ,
        IB_USER_VERBS_CMD_MODIFY_SRQ,
        IB_USER_VERBS_CMD_QUERY_SRQ,
        IB_USER_VERBS_CMD_DESTROY_SRQ,
        IB_USER_VERBS_CMD_POST_SRQ_RECV,
        IB_USER_VERBS_CMD_OPEN_XRCD,
        IB_USER_VERBS_CMD_CLOSE_XRCD,
        IB_USER_VERBS_CMD_CREATE_XSRQ,
        IB_USER_VERBS_CMD_OPEN_QP;

    }
}

