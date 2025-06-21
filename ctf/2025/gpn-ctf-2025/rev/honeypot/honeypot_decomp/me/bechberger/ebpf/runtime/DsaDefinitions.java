/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DevlinkDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.TypeDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DsaDefinitions {

    @Type(noCCodeGeneration=true, cType="struct dsa_stubs")
    @NotUsableInJava
    public static class dsa_stubs
    extends Struct {
        public Ptr<?> conduit_hwtstamp_validate;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_switch_ops")
    @NotUsableInJava
    public static class dsa_switch_ops
    extends Struct {
        public Ptr<?> get_tag_protocol;
        public Ptr<?> change_tag_protocol;
        public Ptr<?> connect_tag_protocol;
        public Ptr<?> port_change_conduit;
        public Ptr<?> setup;
        public Ptr<?> teardown;
        public Ptr<?> port_setup;
        public Ptr<?> port_teardown;
        public Ptr<?> get_phy_flags;
        public Ptr<?> phy_read;
        public Ptr<?> phy_write;
        public Ptr<?> phylink_get_caps;
        public Ptr<?> phylink_mac_select_pcs;
        public Ptr<?> phylink_mac_config;
        public Ptr<?> phylink_mac_link_down;
        public Ptr<?> phylink_mac_link_up;
        public Ptr<?> phylink_fixed_state;
        public Ptr<?> get_strings;
        public Ptr<?> get_ethtool_stats;
        public Ptr<?> get_sset_count;
        public Ptr<?> get_ethtool_phy_stats;
        public Ptr<?> get_eth_phy_stats;
        public Ptr<?> get_eth_mac_stats;
        public Ptr<?> get_eth_ctrl_stats;
        public Ptr<?> get_rmon_stats;
        public Ptr<?> get_stats64;
        public Ptr<?> get_pause_stats;
        public Ptr<?> self_test;
        public Ptr<?> get_wol;
        public Ptr<?> set_wol;
        public Ptr<?> get_ts_info;
        public Ptr<?> get_mm;
        public Ptr<?> set_mm;
        public Ptr<?> get_mm_stats;
        public Ptr<?> port_get_default_prio;
        public Ptr<?> port_set_default_prio;
        public Ptr<?> port_get_dscp_prio;
        public Ptr<?> port_add_dscp_prio;
        public Ptr<?> port_del_dscp_prio;
        public Ptr<?> port_set_apptrust;
        public Ptr<?> port_get_apptrust;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public Ptr<?> port_enable;
        public Ptr<?> port_disable;
        public Ptr<?> port_set_mac_address;
        public Ptr<?> preferred_default_local_cpu_port;
        public Ptr<?> set_mac_eee;
        public Ptr<?> get_mac_eee;
        public Ptr<?> get_eeprom_len;
        public Ptr<?> get_eeprom;
        public Ptr<?> set_eeprom;
        public Ptr<?> get_regs_len;
        public Ptr<?> get_regs;
        public Ptr<?> port_prechangeupper;
        public Ptr<?> set_ageing_time;
        public Ptr<?> port_bridge_join;
        public Ptr<?> port_bridge_leave;
        public Ptr<?> port_stp_state_set;
        public Ptr<?> port_mst_state_set;
        public Ptr<?> port_fast_age;
        public Ptr<?> port_vlan_fast_age;
        public Ptr<?> port_pre_bridge_flags;
        public Ptr<?> port_bridge_flags;
        public Ptr<?> port_set_host_flood;
        public Ptr<?> port_vlan_filtering;
        public Ptr<?> port_vlan_add;
        public Ptr<?> port_vlan_del;
        public Ptr<?> vlan_msti_set;
        public Ptr<?> port_fdb_add;
        public Ptr<?> port_fdb_del;
        public Ptr<?> port_fdb_dump;
        public Ptr<?> lag_fdb_add;
        public Ptr<?> lag_fdb_del;
        public Ptr<?> port_mdb_add;
        public Ptr<?> port_mdb_del;
        public Ptr<?> get_rxnfc;
        public Ptr<?> set_rxnfc;
        public Ptr<?> cls_flower_add;
        public Ptr<?> cls_flower_del;
        public Ptr<?> cls_flower_stats;
        public Ptr<?> port_mirror_add;
        public Ptr<?> port_mirror_del;
        public Ptr<?> port_policer_add;
        public Ptr<?> port_policer_del;
        public Ptr<?> port_setup_tc;
        public Ptr<?> crosschip_bridge_join;
        public Ptr<?> crosschip_bridge_leave;
        public Ptr<?> crosschip_lag_change;
        public Ptr<?> crosschip_lag_join;
        public Ptr<?> crosschip_lag_leave;
        public Ptr<?> port_hwtstamp_get;
        public Ptr<?> port_hwtstamp_set;
        public Ptr<?> port_txtstamp;
        public Ptr<?> port_rxtstamp;
        public Ptr<?> devlink_param_get;
        public Ptr<?> devlink_param_set;
        public Ptr<?> devlink_info_get;
        public Ptr<?> devlink_sb_pool_get;
        public Ptr<?> devlink_sb_pool_set;
        public Ptr<?> devlink_sb_port_pool_get;
        public Ptr<?> devlink_sb_port_pool_set;
        public Ptr<?> devlink_sb_tc_pool_bind_get;
        public Ptr<?> devlink_sb_tc_pool_bind_set;
        public Ptr<?> devlink_sb_occ_snapshot;
        public Ptr<?> devlink_sb_occ_max_clear;
        public Ptr<?> devlink_sb_occ_port_pool_get;
        public Ptr<?> devlink_sb_occ_tc_port_bind_get;
        public Ptr<?> port_change_mtu;
        public Ptr<?> port_max_mtu;
        public Ptr<?> port_lag_change;
        public Ptr<?> port_lag_join;
        public Ptr<?> port_lag_leave;
        public Ptr<?> port_hsr_join;
        public Ptr<?> port_hsr_leave;
        public Ptr<?> port_mrp_add;
        public Ptr<?> port_mrp_del;
        public Ptr<?> port_mrp_add_ring_role;
        public Ptr<?> port_mrp_del_ring_role;
        public Ptr<?> tag_8021q_vlan_add;
        public Ptr<?> tag_8021q_vlan_del;
        public Ptr<?> conduit_state_change;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_db")
    @NotUsableInJava
    public static class dsa_db
    extends Struct {
        public dsa_db_type type;
        @InlineUnion(value=26757)
        public @InlineUnion(value=26757) Ptr<dsa_port> dp;
        @InlineUnion(value=26757)
        public @InlineUnion(value=26757) dsa_lag lag;
        @InlineUnion(value=26757)
        public @InlineUnion(value=26757) dsa_bridge bridge;
    }

    @Type(noCCodeGeneration=true, cType="enum dsa_db_type")
    public static enum dsa_db_type implements Enum<dsa_db_type>,
    TypedEnum<dsa_db_type, Integer>
    {
        DSA_DB_PORT,
        DSA_DB_LAG,
        DSA_DB_BRIDGE;

    }

    @Type(noCCodeGeneration=true, cType="struct dsa_bridge")
    @NotUsableInJava
    public static class dsa_bridge
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned int num;
        public boolean tx_fwd_offload;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_mall_policer_tc_entry")
    @NotUsableInJava
    public static class dsa_mall_policer_tc_entry
    extends Struct {
        public @Unsigned int burst;
        public @Unsigned long rate_bytes_per_sec;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_mall_mirror_tc_entry")
    @NotUsableInJava
    public static class dsa_mall_mirror_tc_entry
    extends Struct {
        public char to_local_port;
        public boolean ingress;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_switch_tree")
    @NotUsableInJava
    public static class dsa_switch_tree
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head ports;
        public RawDefinitions.raw_notifier_head nh;
        public @Unsigned int index;
        public runtime.kref refcount;
        public Ptr<Ptr<dsa_lag>> lags;
        public Ptr<dsa_device_ops> tag_ops;
        public dsa_tag_protocol default_proto;
        public boolean setup;
        public Ptr<dsa_platform_data> pd;
        public ListDefinitions.list_head rtable;
        public @Unsigned int lags_len;
        public @Unsigned int last_switch;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_lag")
    @NotUsableInJava
    public static class dsa_lag
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned int id;
        public runtime.mutex fdb_lock;
        public ListDefinitions.list_head fdbs;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_switch")
    @NotUsableInJava
    public static class dsa_switch
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<dsa_switch_tree> dst;
        public @Unsigned int index;
        public @Unsigned int setup;
        public @Unsigned int vlan_filtering_is_global;
        public @Unsigned int needs_standalone_vlan_filtering;
        public @Unsigned int configure_vlan_while_not_filtering;
        public @Unsigned int untag_bridge_pvid;
        public @Unsigned int untag_vlan_aware_bridge_pvid;
        public @Unsigned int assisted_learning_on_cpu_port;
        public @Unsigned int vlan_filtering;
        public @Unsigned int mtu_enforcement_ingress;
        public @Unsigned int fdb_isolation;
        public @Unsigned int dscp_prio_mapping_is_global;
        public misc.notifier_block nb;
        public Ptr<?> priv;
        public Ptr<?> tagger_data;
        public Ptr<dsa_chip_data> cd;
        public Ptr<dsa_switch_ops> ops;
        public Ptr<misc.phylink_mac_ops> phylink_mac_ops;
        public @Unsigned int phys_mii_mask;
        public Ptr<misc.mii_bus> user_mii_bus;
        public @Unsigned int ageing_time_min;
        public @Unsigned int ageing_time_max;
        public @OriginalName(value="dsa_8021q_context") Ptr<?> tag_8021q_ctx;
        public Ptr<runtime.devlink> devlink;
        public @Unsigned int num_tx_queues;
        public @Unsigned int num_lag_ids;
        public @Unsigned int max_num_bridges;
        public @Unsigned int num_ports;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_device_ops")
    @NotUsableInJava
    public static class dsa_device_ops
    extends Struct {
        public Ptr<?> xmit;
        public Ptr<?> rcv;
        public Ptr<?> flow_dissect;
        public Ptr<?> connect;
        public Ptr<?> disconnect;
        public @Unsigned int needed_headroom;
        public @Unsigned int needed_tailroom;
        public String name;
        public dsa_tag_protocol proto;
        public boolean promisc_on_conduit;
    }

    @Type(noCCodeGeneration=true, cType="enum dsa_tag_protocol")
    public static enum dsa_tag_protocol implements Enum<dsa_tag_protocol>,
    TypedEnum<dsa_tag_protocol, Integer>
    {
        DSA_TAG_PROTO_NONE,
        DSA_TAG_PROTO_BRCM,
        DSA_TAG_PROTO_BRCM_LEGACY,
        DSA_TAG_PROTO_BRCM_PREPEND,
        DSA_TAG_PROTO_DSA,
        DSA_TAG_PROTO_EDSA,
        DSA_TAG_PROTO_GSWIP,
        DSA_TAG_PROTO_KSZ9477,
        DSA_TAG_PROTO_KSZ9893,
        DSA_TAG_PROTO_LAN9303,
        DSA_TAG_PROTO_MTK,
        DSA_TAG_PROTO_QCA,
        DSA_TAG_PROTO_TRAILER,
        DSA_TAG_PROTO_8021Q,
        DSA_TAG_PROTO_SJA1105,
        DSA_TAG_PROTO_KSZ8795,
        DSA_TAG_PROTO_OCELOT,
        DSA_TAG_PROTO_AR9331,
        DSA_TAG_PROTO_RTL4_A,
        DSA_TAG_PROTO_HELLCREEK,
        DSA_TAG_PROTO_XRS700X,
        DSA_TAG_PROTO_OCELOT_8021Q,
        DSA_TAG_PROTO_SEVILLE,
        DSA_TAG_PROTO_SJA1110,
        DSA_TAG_PROTO_RTL8_4,
        DSA_TAG_PROTO_RTL8_4T,
        DSA_TAG_PROTO_RZN1_A5PSW,
        DSA_TAG_PROTO_LAN937X,
        DSA_TAG_PROTO_VSC73XX_8021Q;

    }

    @Type(noCCodeGeneration=true, cType="struct dsa_platform_data")
    @NotUsableInJava
    public static class dsa_platform_data
    extends Struct {
        public Ptr<runtime.device> netdev;
        public Ptr<NetDefinitions.net_device> of_netdev;
        public int nr_chips;
        public Ptr<dsa_chip_data> chip;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_chip_data")
    @NotUsableInJava
    public static class dsa_chip_data
    extends Struct {
        public Ptr<runtime.device> host_dev;
        public int sw_addr;
        public Ptr<runtime.device> @Size(value=12) [] netdev;
        public int eeprom_len;
        public Ptr<DeviceDefinitions.device_node> of_node;
        public String @Size(value=12) [] port_names;
        public Ptr<DeviceDefinitions.device_node> @Size(value=12) [] port_dn;
        public @OriginalName(value="s8") byte @Size(value=4) [] rtable;
    }

    @Type(noCCodeGeneration=true, cType="struct dsa_port")
    @NotUsableInJava
    public static class dsa_port
    extends Struct {
        @InlineUnion(value=26751)
        public @InlineUnion(value=26751) Ptr<NetDefinitions.net_device> conduit;
        @InlineUnion(value=26751)
        public @InlineUnion(value=26751) Ptr<NetDefinitions.net_device> user;
        public Ptr<dsa_device_ops> tag_ops;
        public Ptr<dsa_switch_tree> dst;
        public Ptr<?> rcv;
        public Ptr<dsa_switch> ds;
        public @Unsigned int index;
        public TypeDefinitions.type_of_dsa_port type;
        public String name;
        public Ptr<dsa_port> cpu_dp;
        public char @Size(value=6) [] mac;
        public char stp_state;
        public char vlan_filtering;
        public char learning;
        public char lag_tx_enabled;
        public char conduit_admin_up;
        public char conduit_oper_up;
        public char cpu_port_in_lag;
        public char setup;
        public Ptr<DeviceDefinitions.device_node> dn;
        public @Unsigned int ageing_time;
        public Ptr<dsa_bridge> bridge;
        public DevlinkDefinitions.devlink_port devlink_port;
        public @OriginalName(value="phylink") Ptr<?> pl;
        public misc.phylink_config pl_config;
        public Ptr<dsa_lag> lag;
        public Ptr<NetDefinitions.net_device> hsr_dev;
        public ListDefinitions.list_head list;
        public Ptr<EthtoolDefinitions.ethtool_ops> orig_ethtool_ops;
        public runtime.mutex addr_lists_lock;
        public ListDefinitions.list_head fdbs;
        public ListDefinitions.list_head mdbs;
        public runtime.mutex vlans_lock;
        @InlineUnion(value=26753)
        public  @InlineUnion(value=26753) ListDefinitions.list_head vlans;
        @InlineUnion(value=26753)
        public  @InlineUnion(value=26753) ListDefinitions.list_head user_vlans;
    }

    @Type(noCCodeGeneration=true, cType="struct { int port; short unsigned int proto; }")
    @NotUsableInJava
    public static class dsa_of_anon_member_of_net_device_path
    extends Struct {
        public int port;
        public @Unsigned short proto;
    }
}

