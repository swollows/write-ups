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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.CpuDefinitions;
import me.bechberger.ebpf.runtime.DcbnlDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.DevlinkDefinitions;
import me.bechberger.ebpf.runtime.DimDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DpllDefinitions;
import me.bechberger.ebpf.runtime.DsaDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.GenDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.GnetDefinitions;
import me.bechberger.ebpf.runtime.InDefinitions;
import me.bechberger.ebpf.runtime.Inet6Definitions;
import me.bechberger.ebpf.runtime.IwDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.L3mdevDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.MacsecDefinitions;
import me.bechberger.ebpf.runtime.MctpDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NdiscDefinitions;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.NetpollDefinitions;
import me.bechberger.ebpf.runtime.NfDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.PageDefinitions;
import me.bechberger.ebpf.runtime.PcpuDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.RtnlDefinitions;
import me.bechberger.ebpf.runtime.RxDefinitions;
import me.bechberger.ebpf.runtime.SfpDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.UdpDefinitions;
import me.bechberger.ebpf.runtime.VlanDefinitions;
import me.bechberger.ebpf.runtime.WirelessDefinitions;
import me.bechberger.ebpf.runtime.XdpDefinitions;
import me.bechberger.ebpf.runtime.XskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class NetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_change_mtu(Ptr<net_device> dev, int new_mtu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_close(Ptr<net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_failover_compute_features(Ptr<net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.failover> net_failover_create(Ptr<net_device> standby_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_failover_destroy(Ptr<runtime.failover> failover2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_failover_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_failover_fold_stats($arg1, (const struct rtnl_link_stats64*)$arg2, (const struct rtnl_link_stats64*)$arg3)")
    public static void net_failover_fold_stats(Ptr<RtnlDefinitions.rtnl_link_stats64> _res, Ptr<RtnlDefinitions.rtnl_link_stats64> _new, Ptr<RtnlDefinitions.rtnl_link_stats64> _old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_failover_get_stats(Ptr<net_device> dev, Ptr<RtnlDefinitions.rtnl_link_stats64> stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="rx_handler_result_t") RxDefinitions.rx_handler_result net_failover_handle_frame(Ptr<Ptr<SkDefinitions.sk_buff>> pskb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_failover_lower_state_changed(Ptr<net_device> slave_dev, Ptr<net_device> primary_dev, Ptr<net_device> standby_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_open(Ptr<net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short net_failover_select_queue(Ptr<net_device> dev, Ptr<SkDefinitions.sk_buff> skb, Ptr<net_device> sb_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_failover_set_rx_mode(Ptr<net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_slave_link_change(Ptr<net_device> slave_dev, Ptr<net_device> failover_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_slave_name_change(Ptr<net_device> slave_dev, Ptr<net_device> failover_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_slave_pre_register(Ptr<net_device> slave_dev, Ptr<net_device> failover_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_slave_pre_unregister(Ptr<net_device> slave_dev, Ptr<net_device> failover_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_slave_register(Ptr<net_device> slave_dev, Ptr<net_device> failover_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_slave_unregister(Ptr<net_device> slave_dev, Ptr<net_device> failover_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="netdev_tx_t") NetdevDefinitions.netdev_tx net_failover_start_xmit(Ptr<SkDefinitions.sk_buff> skb, Ptr<net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_vlan_rx_add_vid(Ptr<net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_failover_vlan_rx_kill_vid(Ptr<net_device> dev, @Unsigned @OriginalName(value="__be16") short proto2, @Unsigned short vid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean net_failover_xmit_ready(Ptr<net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_prio_attach(Ptr<CgroupDefinitions.cgroup_taskset> tset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __net_devmem_dmabuf_binding_free(Ptr<net_devmem_dmabuf_binding> binding) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __net_test_loopback(Ptr<net_device> ndev, Ptr<net_packet_attrs> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.ctl_table_set> net_ctl_header_lookup(Ptr<misc.ctl_table_root> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_ctl_permissions($arg1, (const struct ctl_table*)$arg2)")
    public static int net_ctl_permissions(Ptr<misc.ctl_table_header> head, Ptr<misc.ctl_table> table) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_ctl_set_ownership(Ptr<misc.ctl_table_header> head, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean net_current_may_mount() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<net_iov> net_devmem_alloc_dmabuf(Ptr<net_devmem_dmabuf_binding> binding) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<net_devmem_dmabuf_binding> net_devmem_bind_dmabuf(Ptr<net_device> dev, @Unsigned int dmabuf_fd, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_devmem_bind_dmabuf_to_queue(Ptr<net_device> dev, @Unsigned int rxq_idx, Ptr<net_devmem_dmabuf_binding> binding, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_devmem_dmabuf_free_chunk_owner(Ptr<GenDefinitions.gen_pool> genpool, Ptr<GenDefinitions.gen_pool_chunk> chunk, Ptr<?> not_used) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_devmem_free_dmabuf(Ptr<net_iov> niov) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_devmem_unbind_dmabuf(Ptr<net_devmem_dmabuf_binding> binding) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_get_ownership((const struct device*)$arg1, $arg2, $arg3)")
    public static void net_get_ownership(Ptr<runtime.device> d, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> net_grab_current_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)net_initial_ns())")
    public static Ptr<?> net_initial_ns() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_inuse_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)net_namespace((const struct device*)$arg1))")
    public static Ptr<?> net_namespace(Ptr<runtime.device> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const void*)net_netlink_ns($arg1))")
    public static Ptr<?> net_netlink_ns(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_ratelimit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_rx_queue_update_kobjects(Ptr<net_device> dev, int old_num, int new_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_selftest(Ptr<net_device> ndev, Ptr<EthtoolDefinitions.ethtool_test> etest, Ptr<@Unsigned Long> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_selftest_get_count() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_selftest_get_strings(Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_sysctl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> net_test_get_skb(Ptr<net_device> ndev, Ptr<net_packet_attrs> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_test_loopback_validate(Ptr<SkDefinitions.sk_buff> skb, Ptr<net_device> ndev, Ptr<PacketDefinitions.packet_type> pt2, Ptr<net_device> orig_ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_test_netif_carrier(Ptr<net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_test_phy_loopback_disable(Ptr<net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_test_phy_loopback_enable(Ptr<net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_test_phy_loopback_tcp(Ptr<net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_test_phy_loopback_udp(Ptr<net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_test_phy_loopback_udp_mtu(Ptr<net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_test_phy_phydev(Ptr<net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<net_generic> net_alloc_generic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_assign_generic(Ptr<runtime.net> net2, @Unsigned int id, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dec_egress_queue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dec_ingress_queue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dev_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dim(Ptr<runtime.dim> dim2, DimDefinitions.dim_sample end_sample) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dim_free_irq_moder(Ptr<net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_dim_init_irq_moder($arg1, $arg2, $arg3, $arg4, $arg5, (void (*)(struct work_struct*))$arg6, (void (*)(struct work_struct*))$arg7)")
    public static int net_dim_init_irq_moder(Ptr<net_device> dev, char profile_flags, char coal_flags, char rx_mode, char tx_mode, Ptr<?> rx_dim_work, Ptr<?> tx_dim_work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dim_set_rx_mode(Ptr<net_device> dev, char rx_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dim_set_tx_mode(Ptr<net_device> dev, char tx_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dim_setting(Ptr<net_device> dev, Ptr<runtime.dim> dim2, boolean is_tx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dim_stats_compare(Ptr<DimDefinitions.dim_stats> curr, Ptr<DimDefinitions.dim_stats> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dim_step(Ptr<runtime.dim> dim2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dim_work_cancel(Ptr<runtime.dim> dim2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_disable_timestamp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dm_cmd_config(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dm_cmd_config_get(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dm_cmd_stats_get(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dm_cmd_trace(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dm_hw_monitor_start(Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dm_hw_monitor_stop(Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dm_hw_packet_report_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<SkDefinitions.sk_buff> skb, @Unsigned long payload_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_dm_hw_packet_report_size($arg1, (const struct devlink_trap_metadata*)$arg2)")
    public static @Unsigned long net_dm_hw_packet_report_size(@Unsigned long payload_len, Ptr<DevlinkDefinitions.devlink_trap_metadata> hw_metadata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dm_hw_packet_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<net_dm_hw_entries> net_dm_hw_reset_per_cpu_data(Ptr<misc.per_cpu_dm_data> hw_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_dm_hw_summary_report_fill($arg1, (const struct net_dm_hw_entries*)$arg2)")
    public static int net_dm_hw_summary_report_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<net_dm_hw_entries> hw_entries) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dm_hw_summary_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_dm_hw_trap_packet_probe($arg1, (const struct devlink*)$arg2, $arg3, (const struct devlink_trap_metadata*)$arg4)")
    public static void net_dm_hw_trap_packet_probe(Ptr<?> ignore, Ptr<runtime.devlink> devlink2, Ptr<SkDefinitions.sk_buff> skb, Ptr<DevlinkDefinitions.devlink_trap_metadata> metadata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_dm_hw_trap_summary_probe($arg1, (const struct devlink*)$arg2, $arg3, (const struct devlink_trap_metadata*)$arg4)")
    public static void net_dm_hw_trap_summary_probe(Ptr<?> ignore, Ptr<runtime.devlink> devlink2, Ptr<SkDefinitions.sk_buff> skb, Ptr<DevlinkDefinitions.devlink_trap_metadata> metadata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_dm_nl_post_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static void net_dm_nl_post_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_dm_nl_pre_doit((const struct genl_split_ops*)$arg1, $arg2, $arg3)")
    public static int net_dm_nl_pre_doit(Ptr<GenlDefinitions.genl_split_ops> ops, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dm_packet_report_fill(Ptr<SkDefinitions.sk_buff> msg, Ptr<SkDefinitions.sk_buff> skb, @Unsigned long payload_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_dm_packet_report_in_port_put($arg1, $arg2, (const u8*)$arg3)")
    public static int net_dm_packet_report_in_port_put(Ptr<SkDefinitions.sk_buff> msg, int ifindex, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dm_packet_trace_kfree_skb_hit(Ptr<?> ignore, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> location2, SkbDefinitions.skb_drop_reason reason, Ptr<runtime.sock> rx_sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dm_packet_trace_napi_poll_hit(Ptr<?> ignore, Ptr<NapiDefinitions.napi_struct> napi, int work, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dm_packet_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_dm_trace_off_set() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_dm_trace_on_set(Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_drop_ns(Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_enable_timestamp() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_eq_idr(int id, Ptr<?> net2, Ptr<?> peer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_inc_egress_queue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_inc_ingress_queue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_ns_barrier() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="net_ns_get_ownership((const struct net*)$arg1, $arg2, $arg3)")
    public static void net_ns_get_ownership(Ptr<runtime.net> net2, Ptr<misc.kuid_t> uid, Ptr<misc.kgid_t> gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_ns_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_ns_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int net_ns_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_rps_action_and_irq_enable(Ptr<misc.softnet_data> sd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_rps_send_ipi(Ptr<misc.softnet_data> remsd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_rx_action() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void net_tx_action() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int id; short unsigned int proto; }")
    @NotUsableInJava
    public static class AnonymousType1270383967C63
    extends Struct {
        public @Unsigned short id;
        public @Unsigned @OriginalName(value="__be16") short proto;
    }

    @Type(noCCodeGeneration=true, cType="struct net_dm_skb_cb")
    @NotUsableInJava
    public static class net_dm_skb_cb
    extends Struct {
        @InlineUnion(value=95965)
        public @InlineUnion(value=95965) Ptr<DevlinkDefinitions.devlink_trap_metadata> hw_metadata;
        @InlineUnion(value=95965)
        public @InlineUnion(value=95965) Ptr<?> pc;
        public SkbDefinitions.skb_drop_reason reason;
    }

    @Type(noCCodeGeneration=true, cType="struct net_dm_alert_ops")
    @NotUsableInJava
    public static class net_dm_alert_ops
    extends Struct {
        public Ptr<?> kfree_skb_probe;
        public Ptr<?> napi_poll_probe;
        public Ptr<?> work_item_func;
        public Ptr<?> hw_work_item_func;
        public Ptr<?> hw_trap_probe;
    }

    @Type(noCCodeGeneration=true, cType="struct net_dm_hw_entries")
    @NotUsableInJava
    public static class net_dm_hw_entries
    extends Struct {
        public @Unsigned int num_entries;
        public net_dm_hw_entry @Size(value=0) [] entries;
    }

    @Type(noCCodeGeneration=true, cType="struct net_dm_hw_entry")
    @NotUsableInJava
    public static class net_dm_hw_entry
    extends Struct {
        public char @Size(value=40) [] trap_name;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="struct net_dm_stats")
    @NotUsableInJava
    public static class net_dm_stats
    extends Struct {
        public misc.u64_stats_t dropped;
        public misc.u64_stats_sync syncp;
    }

    @Type(noCCodeGeneration=true, cType="enum net_dm_origin")
    public static enum net_dm_origin implements Enum<net_dm_origin>,
    TypedEnum<net_dm_origin, Integer>
    {
        NET_DM_ORIGIN_SW,
        NET_DM_ORIGIN_HW;

    }

    @Type(noCCodeGeneration=true, cType="enum net_dm_alert_mode")
    public static enum net_dm_alert_mode implements Enum<net_dm_alert_mode>,
    TypedEnum<net_dm_alert_mode, Integer>
    {
        NET_DM_ALERT_MODE_SUMMARY,
        NET_DM_ALERT_MODE_PACKET;

    }

    @Type(noCCodeGeneration=true, cType="enum net_dm_attr")
    public static enum net_dm_attr implements Enum<net_dm_attr>,
    TypedEnum<net_dm_attr, Integer>
    {
        NET_DM_ATTR_UNSPEC,
        NET_DM_ATTR_ALERT_MODE,
        NET_DM_ATTR_PC,
        NET_DM_ATTR_SYMBOL,
        NET_DM_ATTR_IN_PORT,
        NET_DM_ATTR_TIMESTAMP,
        NET_DM_ATTR_PROTO,
        NET_DM_ATTR_PAYLOAD,
        NET_DM_ATTR_PAD,
        NET_DM_ATTR_TRUNC_LEN,
        NET_DM_ATTR_ORIG_LEN,
        NET_DM_ATTR_QUEUE_LEN,
        NET_DM_ATTR_STATS,
        NET_DM_ATTR_HW_STATS,
        NET_DM_ATTR_ORIGIN,
        NET_DM_ATTR_HW_TRAP_GROUP_NAME,
        NET_DM_ATTR_HW_TRAP_NAME,
        NET_DM_ATTR_HW_ENTRIES,
        NET_DM_ATTR_HW_ENTRY,
        NET_DM_ATTR_HW_TRAP_COUNT,
        NET_DM_ATTR_SW_DROPS,
        NET_DM_ATTR_HW_DROPS,
        NET_DM_ATTR_FLOW_ACTION_COOKIE,
        NET_DM_ATTR_REASON,
        __NET_DM_ATTR_MAX,
        NET_DM_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct net_dm_alert_msg")
    @NotUsableInJava
    public static class net_dm_alert_msg
    extends Struct {
        public @Unsigned int entries;
        public net_dm_drop_point @Size(value=0) [] points;
    }

    @Type(noCCodeGeneration=true, cType="struct net_dm_drop_point")
    @NotUsableInJava
    public static class net_dm_drop_point
    extends Struct {
        public char @Size(value=8) [] pc;
        public @Unsigned int count;
    }

    @Type(noCCodeGeneration=true, cType="struct net_device_path_stack")
    @NotUsableInJava
    public static class net_device_path_stack
    extends Struct {
        public int num_paths;
        public net_device_path @Size(value=5) [] path;
    }

    @Type(noCCodeGeneration=true, cType="struct net_fill_args")
    @NotUsableInJava
    public static class net_fill_args
    extends Struct {
        public @Unsigned int portid;
        public @Unsigned int seq;
        public int flags;
        public int cmd;
        public int nsid;
        public boolean add_ref;
        public int ref_nsid;
    }

    @Type(noCCodeGeneration=true, cType="struct net_device_devres")
    @NotUsableInJava
    public static class net_device_devres
    extends Struct {
        public Ptr<net_device> ndev;
    }

    @Type(noCCodeGeneration=true, cType="struct net_test")
    @NotUsableInJava
    public static class net_test
    extends Struct {
        public char @Size(value=32) [] name;
        public Ptr<?> fn;
    }

    @Type(noCCodeGeneration=true, cType="struct net_test_priv")
    @NotUsableInJava
    public static class net_test_priv
    extends Struct {
        public Ptr<net_packet_attrs> packet;
        public PacketDefinitions.packet_type pt;
        public runtime.completion comp;
        public int double_vlan;
        public int vlan_id;
        public int ok;
    }

    @Type(noCCodeGeneration=true, cType="struct net_packet_attrs")
    @NotUsableInJava
    public static class net_packet_attrs
    extends Struct {
        public String src;
        public String dst;
        public @Unsigned int ip_src;
        public @Unsigned int ip_dst;
        public boolean tcp;
        public @Unsigned short sport;
        public @Unsigned short dport;
        public int timeout;
        public int size;
        public int max_size;
        public char id;
        public @Unsigned short queue_mapping;
    }

    @Type(noCCodeGeneration=true, cType="struct net_rate_estimator")
    @NotUsableInJava
    public static class net_rate_estimator
    extends Struct {
        public Ptr<GnetDefinitions.gnet_stats_basic_sync> bstats;
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> stats_lock;
        public boolean running;
        public Ptr<GnetDefinitions.gnet_stats_basic_sync> cpu_bstats;
        public char ewma_log;
        public char intvl_log;
        public  @OriginalName(value="seqcount_t") runtime.seqcount seq;
        public @Unsigned long last_packets;
        public @Unsigned long last_bytes;
        public @Unsigned long avpps;
        public @Unsigned long avbps;
        public @Unsigned long next_jiffies;
        public TimerDefinitions.timer_list timer;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct net_iov")
    @NotUsableInJava
    public static class net_iov
    extends Struct {
        public @Unsigned long __unused_padding;
        public @Unsigned long pp_magic;
        public Ptr<PageDefinitions.page_pool> pp;
        public Ptr<misc.dmabuf_genpool_chunk_owner> owner;
        public @Unsigned long dma_addr;
        public @OriginalName(value="atomic_long_t") misc.atomic64_t pp_ref_count;
    }

    @Type(noCCodeGeneration=true, cType="enum net_xmit_qdisc_t")
    public static enum net_xmit_qdisc_t implements Enum<net_xmit_qdisc_t>,
    TypedEnum<net_xmit_qdisc_t, Integer>
    {
        __NET_XMIT_STOLEN,
        __NET_XMIT_BYPASS;

    }

    @Type(noCCodeGeneration=true, cType="struct net_failover_info")
    @NotUsableInJava
    public static class net_failover_info
    extends Struct {
        public Ptr<net_device> primary_dev;
        public Ptr<net_device> standby_dev;
        public RtnlDefinitions.rtnl_link_stats64 primary_stats;
        public RtnlDefinitions.rtnl_link_stats64 standby_stats;
        public RtnlDefinitions.rtnl_link_stats64 failover_stats;
        public  @OriginalName(value="spinlock_t") runtime.spinlock stats_lock;
    }

    @Type(noCCodeGeneration=true, cType="struct net_proto_family")
    @NotUsableInJava
    public static class net_proto_family
    extends Struct {
        public int family;
        public Ptr<?> create;
        public Ptr<runtime.module> owner;
    }

    @Type(noCCodeGeneration=true, cType="struct net_bridge_fdb_entry")
    @NotUsableInJava
    public static class net_bridge_fdb_entry
    extends Struct {
        public misc.rhash_head rhnode;
        public Ptr<net_bridge_port> dst;
        public net_bridge_fdb_key key;
        public misc.hlist_node fdb_node;
        public @Unsigned long flags;
        public @Unsigned long updated;
        public @Unsigned long used;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct net_bridge_fdb_key")
    @NotUsableInJava
    public static class net_bridge_fdb_key
    extends Struct {
        public misc.mac_addr addr;
        public @Unsigned short vlan_id;
    }

    @Type(noCCodeGeneration=true, cType="struct net_bridge_vlan_group")
    @NotUsableInJava
    public static class net_bridge_vlan_group
    extends Struct {
        public runtime.rhashtable vlan_hash;
        public runtime.rhashtable tunnel_hash;
        public ListDefinitions.list_head vlan_list;
        public @Unsigned short num_vlans;
        public @Unsigned short pvid;
        public char pvid_state;
    }

    @Type(noCCodeGeneration=true, cType="struct net_bridge_mcast")
    @NotUsableInJava
    public static class net_bridge_mcast
    extends Struct {
        public Ptr<net_bridge> br;
        public Ptr<net_bridge_vlan> vlan;
        public @Unsigned int multicast_last_member_count;
        public @Unsigned int multicast_startup_query_count;
        public char multicast_querier;
        public char multicast_igmp_version;
        public char multicast_router;
        public char multicast_mld_version;
        public @Unsigned long multicast_last_member_interval;
        public @Unsigned long multicast_membership_interval;
        public @Unsigned long multicast_querier_interval;
        public @Unsigned long multicast_query_interval;
        public @Unsigned long multicast_query_response_interval;
        public @Unsigned long multicast_startup_query_interval;
        public misc.hlist_head ip4_mc_router_list;
        public TimerDefinitions.timer_list ip4_mc_router_timer;
        public misc.bridge_mcast_other_query ip4_other_query;
        public misc.bridge_mcast_own_query ip4_own_query;
        public misc.bridge_mcast_querier ip4_querier;
        public misc.hlist_head ip6_mc_router_list;
        public TimerDefinitions.timer_list ip6_mc_router_timer;
        public misc.bridge_mcast_other_query ip6_other_query;
        public misc.bridge_mcast_own_query ip6_own_query;
        public misc.bridge_mcast_querier ip6_querier;
    }

    @Type(noCCodeGeneration=true, cType="struct net_bridge_vlan")
    @NotUsableInJava
    public static class net_bridge_vlan
    extends Struct {
        public misc.rhash_head vnode;
        public misc.rhash_head tnode;
        public @Unsigned short vid;
        public @Unsigned short flags;
        public @Unsigned short priv_flags;
        public char state;
        public Ptr<PcpuDefinitions.pcpu_sw_netstats> stats;
        @InlineUnion(value=24795)
        public @InlineUnion(value=24795) Ptr<net_bridge> br;
        @InlineUnion(value=24795)
        public @InlineUnion(value=24795) Ptr<net_bridge_port> port;
        @InlineUnion(value=24796)
        public @InlineUnion(value=24796) @OriginalName(value="refcount_t") misc.refcount_struct refcnt;
        @InlineUnion(value=24796)
        public @InlineUnion(value=24796) Ptr<net_bridge_vlan> brvlan;
        public misc.br_tunnel_info tinfo;
        @InlineUnion(value=24797)
        public @InlineUnion(value=24797) net_bridge_mcast br_mcast_ctx;
        @InlineUnion(value=24797)
        public @InlineUnion(value=24797) net_bridge_mcast_port port_mcast_ctx;
        public @Unsigned short msti;
        public ListDefinitions.list_head vlist;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct net_bridge_mcast_port")
    @NotUsableInJava
    public static class net_bridge_mcast_port
    extends Struct {
        public Ptr<net_bridge_port> port;
        public Ptr<net_bridge_vlan> vlan;
        public misc.bridge_mcast_own_query ip4_own_query;
        public TimerDefinitions.timer_list ip4_mc_router_timer;
        public misc.hlist_node ip4_rlist;
        public misc.bridge_mcast_own_query ip6_own_query;
        public TimerDefinitions.timer_list ip6_mc_router_timer;
        public misc.hlist_node ip6_rlist;
        public char multicast_router;
        public @Unsigned int mdb_n_entries;
        public @Unsigned int mdb_max_entries;
    }

    @Type(noCCodeGeneration=true, cType="struct net_bridge_port")
    @NotUsableInJava
    public static class net_bridge_port
    extends Struct {
        public Ptr<net_bridge> br;
        public Ptr<net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public ListDefinitions.list_head list;
        public @Unsigned long flags;
        public Ptr<net_bridge_vlan_group> vlgrp;
        public Ptr<net_bridge_port> backup_port;
        public @Unsigned int backup_nhid;
        public char priority;
        public char state;
        public @Unsigned short port_no;
        public char topology_change_ack;
        public char config_pending;
        public @Unsigned @OriginalName(value="port_id") short port_id;
        public @Unsigned @OriginalName(value="port_id") short designated_port;
        public misc.bridge_id designated_root;
        public misc.bridge_id designated_bridge;
        public @Unsigned int path_cost;
        public @Unsigned int designated_cost;
        public @Unsigned long designated_age;
        public TimerDefinitions.timer_list forward_delay_timer;
        public TimerDefinitions.timer_list hold_timer;
        public TimerDefinitions.timer_list message_age_timer;
        public runtime.kobject kobj;
        public misc.callback_head rcu;
        public net_bridge_mcast_port multicast_ctx;
        public Ptr<misc.bridge_mcast_stats> mcast_stats;
        public @Unsigned int multicast_eht_hosts_limit;
        public @Unsigned int multicast_eht_hosts_cnt;
        public misc.hlist_head mglist;
        public char @Size(value=16) [] sysfs_name;
        public Ptr<runtime.netpoll> np;
        public int hwdom;
        public int offload_count;
        public NetdevDefinitions.netdev_phys_item_id ppid;
        public @Unsigned short group_fwd_mask;
        public @Unsigned short backup_redirected_cnt;
        public misc.bridge_stp_xstats stp_xstats;
    }

    @Type(noCCodeGeneration=true, cType="struct net_bridge")
    @NotUsableInJava
    public static class net_bridge
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public  @OriginalName(value="spinlock_t") runtime.spinlock hash_lock;
        public misc.hlist_head frame_type_list;
        public Ptr<net_device> dev;
        public @Unsigned long options;
        public @Unsigned @OriginalName(value="__be16") short vlan_proto;
        public @Unsigned short default_pvid;
        public Ptr<net_bridge_vlan_group> vlgrp;
        public runtime.rhashtable fdb_hash_tbl;
        public ListDefinitions.list_head port_list;
        @InlineUnion(value=24803)
        public  @InlineUnion(value=24803) runtime.rtable fake_rtable;
        @InlineUnion(value=24803)
        public  @InlineUnion(value=24803) Rt6Definitions.rt6_info fake_rt6_info;
        public @Unsigned short group_fwd_mask;
        public @Unsigned short group_fwd_mask_required;
        public misc.bridge_id designated_root;
        public misc.bridge_id bridge_id;
        public char topology_change;
        public char topology_change_detected;
        public @Unsigned short root_port;
        public @Unsigned long max_age;
        public @Unsigned long hello_time;
        public @Unsigned long forward_delay;
        public @Unsigned long ageing_time;
        public @Unsigned long bridge_max_age;
        public @Unsigned long bridge_hello_time;
        public @Unsigned long bridge_forward_delay;
        public @Unsigned long bridge_ageing_time;
        public @Unsigned int root_path_cost;
        public char @Size(value=6) [] group_addr;
        public misc.stp_enabled_of_net_bridge stp_enabled;
        public net_bridge_mcast multicast_ctx;
        public Ptr<misc.bridge_mcast_stats> mcast_stats;
        public @Unsigned int hash_max;
        public  @OriginalName(value="spinlock_t") runtime.spinlock multicast_lock;
        public runtime.rhashtable mdb_hash_tbl;
        public runtime.rhashtable sg_port_tbl;
        public misc.hlist_head mcast_gc_list;
        public misc.hlist_head mdb_list;
        public misc.work_struct mcast_gc_work;
        public TimerDefinitions.timer_list hello_timer;
        public TimerDefinitions.timer_list tcn_timer;
        public TimerDefinitions.timer_list topology_change_timer;
        public DelayedDefinitions.delayed_work gc_work;
        public Ptr<runtime.kobject> ifobj;
        public @Unsigned int auto_cnt;
        public AtomicDefinitions.atomic_t fdb_n_learned;
        public @Unsigned int fdb_max_learned;
        public int last_hwdom;
        public @Unsigned long busy_hwdoms;
        public misc.hlist_head fdb_list;
        public misc.hlist_head mrp_list;
        public misc.hlist_head mep_list;
    }

    @Type(noCCodeGeneration=true, cType="struct net_hotdata")
    @NotUsableInJava
    public static class net_hotdata
    extends Struct {
        public PacketDefinitions.packet_offload ip_packet_offload;
        public net_offload tcpv4_offload;
        public net_protocol tcp_protocol;
        public net_offload udpv4_offload;
        public net_protocol udp_protocol;
        public PacketDefinitions.packet_offload ipv6_packet_offload;
        public net_offload tcpv6_offload;
        public Inet6Definitions.inet6_protocol tcpv6_protocol;
        public Inet6Definitions.inet6_protocol udpv6_protocol;
        public net_offload udpv6_offload;
        public ListDefinitions.list_head offload_base;
        public ListDefinitions.list_head ptype_all;
        public Ptr<KmemDefinitions.kmem_cache> skbuff_cache;
        public Ptr<KmemDefinitions.kmem_cache> skbuff_fclone_cache;
        public Ptr<KmemDefinitions.kmem_cache> skb_small_head_cache;
        public Ptr<misc.rps_sock_flow_table> rps_sock_flow_table;
        public @Unsigned int rps_cpu_mask;
        public int gro_normal_batch;
        public int netdev_budget;
        public int netdev_budget_usecs;
        public int tstamp_prequeue;
        public int max_backlog;
        public int dev_tx_weight;
        public int dev_rx_weight;
        public int sysctl_max_skb_frags;
        public int sysctl_skb_defer_max;
        public int sysctl_mem_pcpu_rsv;
    }

    @Type(noCCodeGeneration=true, cType="struct net_offload")
    @NotUsableInJava
    public static class net_offload
    extends Struct {
        public misc.offload_callbacks callbacks;
        public @Unsigned int flags;
        public @Unsigned int secret;
    }

    @Type(noCCodeGeneration=true, cType="struct net_protocol")
    @NotUsableInJava
    public static class net_protocol
    extends Struct {
        public Ptr<?> handler;
        public Ptr<?> err_handler;
        public @Unsigned int no_policy;
        public @Unsigned int icmp_strict_tag_validation;
        public @Unsigned int secret;
    }

    @Type(noCCodeGeneration=true, cType="struct net_devmem_dmabuf_binding")
    @NotUsableInJava
    public static class net_devmem_dmabuf_binding
    extends Struct {
        public Ptr<DmaDefinitions.dma_buf> dmabuf;
        public Ptr<DmaDefinitions.dma_buf_attachment> attachment;
        public Ptr<SgDefinitions.sg_table> sgt;
        public Ptr<net_device> dev;
        public Ptr<GenDefinitions.gen_pool> chunk_pool;
        public @OriginalName(value="refcount_t") misc.refcount_struct ref;
        public ListDefinitions.list_head list;
        public runtime.xarray bound_rxqs;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct net_generic")
    @NotUsableInJava
    public static class net_generic
    extends Struct {
        @InlineUnion(value=23801)
        public  @InlineUnion(value=23801) SDefinitions.s_of_anon_member_of_net_generic s;
        @InlineUnion(value=23801)
        public  @InlineUnion(value=23801) AnonDefinitions.anon_member_of_anon_member_of_net_generic anon0$1;
    }

    @Type(noCCodeGeneration=true, cType="enum net_device_flags")
    public static enum net_device_flags implements Enum<net_device_flags>,
    TypedEnum<net_device_flags, Integer>
    {
        IFF_UP,
        IFF_BROADCAST,
        IFF_DEBUG,
        IFF_LOOPBACK,
        IFF_POINTOPOINT,
        IFF_NOTRAILERS,
        IFF_RUNNING,
        IFF_NOARP,
        IFF_PROMISC,
        IFF_ALLMULTI,
        IFF_MASTER,
        IFF_SLAVE,
        IFF_MULTICAST,
        IFF_PORTSEL,
        IFF_AUTOMEDIA,
        IFF_DYNAMIC,
        IFF_LOWER_UP,
        IFF_DORMANT,
        IFF_ECHO;

    }

    @Type(noCCodeGeneration=true, cType="struct { int type; int protocol; struct sock *peer_sk; void *addr; int addrlen; }")
    @NotUsableInJava
    public static class net_of_anon_member_of_anon_member_of_anon_member_of_apparmor_audit_data
    extends Struct {
        public int type;
        public int protocol;
        public Ptr<runtime.sock> peer_sk;
        public Ptr<?> addr;
        public int addrlen;
    }

    @Type(noCCodeGeneration=true, cType="struct net_device_ops")
    @NotUsableInJava
    public static class net_device_ops
    extends Struct {
        public Ptr<?> ndo_init;
        public Ptr<?> ndo_uninit;
        public Ptr<?> ndo_open;
        public Ptr<?> ndo_stop;
        public Ptr<?> ndo_start_xmit;
        public Ptr<?> ndo_features_check;
        public Ptr<?> ndo_select_queue;
        public Ptr<?> ndo_change_rx_flags;
        public Ptr<?> ndo_set_rx_mode;
        public Ptr<?> ndo_set_mac_address;
        public Ptr<?> ndo_validate_addr;
        public Ptr<?> ndo_do_ioctl;
        public Ptr<?> ndo_eth_ioctl;
        public Ptr<?> ndo_siocbond;
        public Ptr<?> ndo_siocwandev;
        public Ptr<?> ndo_siocdevprivate;
        public Ptr<?> ndo_set_config;
        public Ptr<?> ndo_change_mtu;
        public Ptr<?> ndo_neigh_setup;
        public Ptr<?> ndo_tx_timeout;
        public Ptr<?> ndo_get_stats64;
        public Ptr<?> ndo_has_offload_stats;
        public Ptr<?> ndo_get_offload_stats;
        public Ptr<?> ndo_get_stats;
        public Ptr<?> ndo_vlan_rx_add_vid;
        public Ptr<?> ndo_vlan_rx_kill_vid;
        public Ptr<?> ndo_poll_controller;
        public Ptr<?> ndo_netpoll_setup;
        public Ptr<?> ndo_netpoll_cleanup;
        public Ptr<?> ndo_set_vf_mac;
        public Ptr<?> ndo_set_vf_vlan;
        public Ptr<?> ndo_set_vf_rate;
        public Ptr<?> ndo_set_vf_spoofchk;
        public Ptr<?> ndo_set_vf_trust;
        public Ptr<?> ndo_get_vf_config;
        public Ptr<?> ndo_set_vf_link_state;
        public Ptr<?> ndo_get_vf_stats;
        public Ptr<?> ndo_set_vf_port;
        public Ptr<?> ndo_get_vf_port;
        public Ptr<?> ndo_get_vf_guid;
        public Ptr<?> ndo_set_vf_guid;
        public Ptr<?> ndo_set_vf_rss_query_en;
        public Ptr<?> ndo_setup_tc;
        public Ptr<?> ndo_fcoe_enable;
        public Ptr<?> ndo_fcoe_disable;
        public Ptr<?> ndo_fcoe_ddp_setup;
        public Ptr<?> ndo_fcoe_ddp_done;
        public Ptr<?> ndo_fcoe_ddp_target;
        public Ptr<?> ndo_fcoe_get_hbainfo;
        public Ptr<?> ndo_fcoe_get_wwn;
        public Ptr<?> ndo_rx_flow_steer;
        public Ptr<?> ndo_add_slave;
        public Ptr<?> ndo_del_slave;
        public Ptr<?> ndo_get_xmit_slave;
        public Ptr<?> ndo_sk_get_lower_dev;
        public Ptr<?> ndo_fix_features;
        public Ptr<?> ndo_set_features;
        public Ptr<?> ndo_neigh_construct;
        public Ptr<?> ndo_neigh_destroy;
        public Ptr<?> ndo_fdb_add;
        public Ptr<?> ndo_fdb_del;
        public Ptr<?> ndo_fdb_del_bulk;
        public Ptr<?> ndo_fdb_dump;
        public Ptr<?> ndo_fdb_get;
        public Ptr<?> ndo_mdb_add;
        public Ptr<?> ndo_mdb_del;
        public Ptr<?> ndo_mdb_del_bulk;
        public Ptr<?> ndo_mdb_dump;
        public Ptr<?> ndo_mdb_get;
        public Ptr<?> ndo_bridge_setlink;
        public Ptr<?> ndo_bridge_getlink;
        public Ptr<?> ndo_bridge_dellink;
        public Ptr<?> ndo_change_carrier;
        public Ptr<?> ndo_get_phys_port_id;
        public Ptr<?> ndo_get_port_parent_id;
        public Ptr<?> ndo_get_phys_port_name;
        public Ptr<?> ndo_dfwd_add_station;
        public Ptr<?> ndo_dfwd_del_station;
        public Ptr<?> ndo_set_tx_maxrate;
        public Ptr<?> ndo_get_iflink;
        public Ptr<?> ndo_fill_metadata_dst;
        public Ptr<?> ndo_set_rx_headroom;
        public Ptr<?> ndo_bpf;
        public Ptr<?> ndo_xdp_xmit;
        public Ptr<?> ndo_xdp_get_xmit_slave;
        public Ptr<?> ndo_xsk_wakeup;
        public Ptr<?> ndo_tunnel_ctl;
        public Ptr<?> ndo_get_peer_dev;
        public Ptr<?> ndo_fill_forward_path;
        public Ptr<?> ndo_get_tstamp;
        public Ptr<?> ndo_hwtstamp_get;
        public Ptr<?> ndo_hwtstamp_set;
    }

    @Type(noCCodeGeneration=true, cType="struct net_device_path_ctx")
    @NotUsableInJava
    public static class net_device_path_ctx
    extends Struct {
        public Ptr<net_device> dev;
        public char @Size(value=6) [] daddr;
        public int num_vlans;
        public AnonymousType1270383967C63 @Size(value=2) [] vlan;
    }

    @Type(noCCodeGeneration=true, cType="struct net_device_path")
    @NotUsableInJava
    public static class net_device_path
    extends Struct {
        public net_device_path_type type;
        public Ptr<net_device> dev;
        @InlineUnion(value=5760)
        public @InlineUnion(value=5760) misc.encap_of_anon_member_of_net_device_path encap;
        @InlineUnion(value=5760)
        public @InlineUnion(value=5760) misc.bridge_of_anon_member_of_net_device_path bridge;
        @InlineUnion(value=5760)
        public @InlineUnion(value=5760) DsaDefinitions.dsa_of_anon_member_of_net_device_path dsa;
        @InlineUnion(value=5760)
        public @InlineUnion(value=5760) misc.mtk_wdma_of_anon_member_of_net_device_path mtk_wdma;
    }

    @Type(noCCodeGeneration=true, cType="enum net_device_path_type")
    public static enum net_device_path_type implements Enum<net_device_path_type>,
    TypedEnum<net_device_path_type, Integer>
    {
        DEV_PATH_ETHERNET,
        DEV_PATH_VLAN,
        DEV_PATH_BRIDGE,
        DEV_PATH_PPPOE,
        DEV_PATH_DSA,
        DEV_PATH_MTK_WDMA;

    }

    @Type(noCCodeGeneration=true, cType="struct net_device_core_stats")
    @NotUsableInJava
    public static class net_device_core_stats
    extends Struct {
        public @Unsigned long rx_dropped;
        public @Unsigned long tx_dropped;
        public @Unsigned long rx_nohandler;
        public @Unsigned long rx_otherhost_dropped;
    }

    @Type(noCCodeGeneration=true, cType="struct net_device_stats")
    @NotUsableInJava
    public static class net_device_stats
    extends Struct {
        @InlineUnion(value=5684)
        public @InlineUnion(value=5684) @Unsigned long rx_packets;
        @InlineUnion(value=5684)
        public @InlineUnion(value=5684) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_packets;
        @InlineUnion(value=5685)
        public @InlineUnion(value=5685) @Unsigned long tx_packets;
        @InlineUnion(value=5685)
        public @InlineUnion(value=5685) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_packets;
        @InlineUnion(value=5686)
        public @InlineUnion(value=5686) @Unsigned long rx_bytes;
        @InlineUnion(value=5686)
        public @InlineUnion(value=5686) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_bytes;
        @InlineUnion(value=5687)
        public @InlineUnion(value=5687) @Unsigned long tx_bytes;
        @InlineUnion(value=5687)
        public @InlineUnion(value=5687) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_bytes;
        @InlineUnion(value=5688)
        public @InlineUnion(value=5688) @Unsigned long rx_errors;
        @InlineUnion(value=5688)
        public @InlineUnion(value=5688) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_errors;
        @InlineUnion(value=5689)
        public @InlineUnion(value=5689) @Unsigned long tx_errors;
        @InlineUnion(value=5689)
        public @InlineUnion(value=5689) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_errors;
        @InlineUnion(value=5690)
        public @InlineUnion(value=5690) @Unsigned long rx_dropped;
        @InlineUnion(value=5690)
        public @InlineUnion(value=5690) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_dropped;
        @InlineUnion(value=5691)
        public @InlineUnion(value=5691) @Unsigned long tx_dropped;
        @InlineUnion(value=5691)
        public @InlineUnion(value=5691) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_dropped;
        @InlineUnion(value=5692)
        public @InlineUnion(value=5692) @Unsigned long multicast;
        @InlineUnion(value=5692)
        public @InlineUnion(value=5692) @OriginalName(value="atomic_long_t") misc.atomic64_t __multicast;
        @InlineUnion(value=5693)
        public @InlineUnion(value=5693) @Unsigned long collisions;
        @InlineUnion(value=5693)
        public @InlineUnion(value=5693) @OriginalName(value="atomic_long_t") misc.atomic64_t __collisions;
        @InlineUnion(value=5694)
        public @InlineUnion(value=5694) @Unsigned long rx_length_errors;
        @InlineUnion(value=5694)
        public @InlineUnion(value=5694) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_length_errors;
        @InlineUnion(value=5695)
        public @InlineUnion(value=5695) @Unsigned long rx_over_errors;
        @InlineUnion(value=5695)
        public @InlineUnion(value=5695) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_over_errors;
        @InlineUnion(value=5696)
        public @InlineUnion(value=5696) @Unsigned long rx_crc_errors;
        @InlineUnion(value=5696)
        public @InlineUnion(value=5696) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_crc_errors;
        @InlineUnion(value=5697)
        public @InlineUnion(value=5697) @Unsigned long rx_frame_errors;
        @InlineUnion(value=5697)
        public @InlineUnion(value=5697) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_frame_errors;
        @InlineUnion(value=5698)
        public @InlineUnion(value=5698) @Unsigned long rx_fifo_errors;
        @InlineUnion(value=5698)
        public @InlineUnion(value=5698) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_fifo_errors;
        @InlineUnion(value=5699)
        public @InlineUnion(value=5699) @Unsigned long rx_missed_errors;
        @InlineUnion(value=5699)
        public @InlineUnion(value=5699) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_missed_errors;
        @InlineUnion(value=5700)
        public @InlineUnion(value=5700) @Unsigned long tx_aborted_errors;
        @InlineUnion(value=5700)
        public @InlineUnion(value=5700) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_aborted_errors;
        @InlineUnion(value=5701)
        public @InlineUnion(value=5701) @Unsigned long tx_carrier_errors;
        @InlineUnion(value=5701)
        public @InlineUnion(value=5701) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_carrier_errors;
        @InlineUnion(value=5702)
        public @InlineUnion(value=5702) @Unsigned long tx_fifo_errors;
        @InlineUnion(value=5702)
        public @InlineUnion(value=5702) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_fifo_errors;
        @InlineUnion(value=5703)
        public @InlineUnion(value=5703) @Unsigned long tx_heartbeat_errors;
        @InlineUnion(value=5703)
        public @InlineUnion(value=5703) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_heartbeat_errors;
        @InlineUnion(value=5704)
        public @InlineUnion(value=5704) @Unsigned long tx_window_errors;
        @InlineUnion(value=5704)
        public @InlineUnion(value=5704) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_window_errors;
        @InlineUnion(value=5705)
        public @InlineUnion(value=5705) @Unsigned long rx_compressed;
        @InlineUnion(value=5705)
        public @InlineUnion(value=5705) @OriginalName(value="atomic_long_t") misc.atomic64_t __rx_compressed;
        @InlineUnion(value=5706)
        public @InlineUnion(value=5706) @Unsigned long tx_compressed;
        @InlineUnion(value=5706)
        public @InlineUnion(value=5706) @OriginalName(value="atomic_long_t") misc.atomic64_t __tx_compressed;
    }

    @Type(noCCodeGeneration=true, cType="struct net_device")
    @NotUsableInJava
    public static class net_device
    extends Struct {
        public char @Size(value=0) [] __cacheline_group_begin__net_device_read_tx;
        @InlineUnion(value=5964)
        public  @InlineUnion(value=5964) AnonDefinitions.anon_member_of_anon_member_of_net_device_and_priv_flags_fast_of_anon_member_of_net_device anon1$0;
        @InlineUnion(value=5964)
        public  @InlineUnion(value=5964) AnonDefinitions.anon_member_of_anon_member_of_net_device_and_priv_flags_fast_of_anon_member_of_net_device priv_flags_fast;
        public Ptr<net_device_ops> netdev_ops;
        public Ptr<misc.header_ops> header_ops;
        public Ptr<NetdevDefinitions.netdev_queue> _tx;
        public @Unsigned @OriginalName(value="netdev_features_t") long gso_partial_features;
        public @Unsigned int real_num_tx_queues;
        public @Unsigned int gso_max_size;
        public @Unsigned int gso_ipv4_max_size;
        public @Unsigned short gso_max_segs;
        public short num_tc;
        public @Unsigned int mtu;
        public @Unsigned short needed_headroom;
        public NetdevDefinitions.netdev_tc_txq @Size(value=16) [] tc_to_txq;
        public Ptr<misc.xps_dev_maps> @Size(value=2) [] xps_maps;
        public Ptr<NfDefinitions.nf_hook_entries> nf_hooks_egress;
        public Ptr<BpfDefinitions.bpf_mprog_entry> tcx_egress;
        public char @Size(value=0) [] __cacheline_group_end__net_device_read_tx;
        public char @Size(value=0) [] __cacheline_group_begin__net_device_read_txrx;
        @InlineUnion(value=5965)
        public @InlineUnion(value=5965) Ptr<PcpuDefinitions.pcpu_lstats> lstats;
        @InlineUnion(value=5965)
        public @InlineUnion(value=5965) Ptr<PcpuDefinitions.pcpu_sw_netstats> tstats;
        @InlineUnion(value=5965)
        public @InlineUnion(value=5965) Ptr<PcpuDefinitions.pcpu_dstats> dstats;
        public @Unsigned long state;
        public @Unsigned int flags;
        public @Unsigned short hard_header_len;
        public @Unsigned @OriginalName(value="netdev_features_t") long features;
        public Ptr<Inet6Definitions.inet6_dev> ip6_ptr;
        public char @Size(value=0) [] __cacheline_group_end__net_device_read_txrx;
        public char @Size(value=0) [] __cacheline_group_begin__net_device_read_rx;
        public Ptr<BpfDefinitions.bpf_prog> xdp_prog;
        public ListDefinitions.list_head ptype_specific;
        public int ifindex;
        public @Unsigned int real_num_rx_queues;
        public Ptr<NetdevDefinitions.netdev_rx_queue> _rx;
        public @Unsigned long gro_flush_timeout;
        public @Unsigned int napi_defer_hard_irqs;
        public @Unsigned int gro_max_size;
        public @Unsigned int gro_ipv4_max_size;
        public Ptr<?> rx_handler;
        public Ptr<?> rx_handler_data;
        public misc.possible_net_t nd_net;
        public Ptr<NetpollDefinitions.netpoll_info> npinfo;
        public Ptr<BpfDefinitions.bpf_mprog_entry> tcx_ingress;
        public char @Size(value=0) [] __cacheline_group_end__net_device_read_rx;
        public char @Size(value=16) [] name;
        public Ptr<NetdevDefinitions.netdev_name_node> name_node;
        public Ptr<DevDefinitions.dev_ifalias> ifalias;
        public @Unsigned long mem_end;
        public @Unsigned long mem_start;
        public @Unsigned long base_addr;
        public ListDefinitions.list_head dev_list;
        public ListDefinitions.list_head napi_list;
        public ListDefinitions.list_head unreg_list;
        public ListDefinitions.list_head close_list;
        public ListDefinitions.list_head ptype_all;
        public misc.adj_list_of_net_device adj_list;
        public @Unsigned @OriginalName(value="xdp_features_t") int xdp_features;
        public Ptr<XdpDefinitions.xdp_metadata_ops> xdp_metadata_ops;
        public Ptr<XskDefinitions.xsk_tx_metadata_ops> xsk_tx_metadata_ops;
        public @Unsigned short gflags;
        public @Unsigned short needed_tailroom;
        public @Unsigned @OriginalName(value="netdev_features_t") long hw_features;
        public @Unsigned @OriginalName(value="netdev_features_t") long wanted_features;
        public @Unsigned @OriginalName(value="netdev_features_t") long vlan_features;
        public @Unsigned @OriginalName(value="netdev_features_t") long hw_enc_features;
        public @Unsigned @OriginalName(value="netdev_features_t") long mpls_features;
        public @Unsigned int min_mtu;
        public @Unsigned int max_mtu;
        public @Unsigned short type;
        public char min_header_len;
        public char name_assign_type;
        public int group;
        public net_device_stats stats;
        public Ptr<net_device_core_stats> core_stats;
        public AtomicDefinitions.atomic_t carrier_up_count;
        public AtomicDefinitions.atomic_t carrier_down_count;
        public Ptr<IwDefinitions.iw_handler_def> wireless_handlers;
        public Ptr<IwDefinitions.iw_public_data> wireless_data;
        public Ptr<EthtoolDefinitions.ethtool_ops> ethtool_ops;
        public Ptr<L3mdevDefinitions.l3mdev_ops> l3mdev_ops;
        public Ptr<NdiscDefinitions.ndisc_ops> ndisc_ops;
        public Ptr<misc.xfrmdev_ops> xfrmdev_ops;
        public Ptr<misc.tlsdev_ops> tlsdev_ops;
        public @Unsigned int operstate;
        public char link_mode;
        public char if_port;
        public char dma;
        public char @Size(value=32) [] perm_addr;
        public char addr_assign_type;
        public char addr_len;
        public char upper_level;
        public char lower_level;
        public @Unsigned short neigh_priv_len;
        public @Unsigned short dev_id;
        public @Unsigned short dev_port;
        public int irq;
        public @Unsigned int priv_len;
        public  @OriginalName(value="spinlock_t") runtime.spinlock addr_list_lock;
        public NetdevDefinitions.netdev_hw_addr_list uc;
        public NetdevDefinitions.netdev_hw_addr_list mc;
        public NetdevDefinitions.netdev_hw_addr_list dev_addrs;
        public Ptr<runtime.kset> queues_kset;
        public @Unsigned int promiscuity;
        public @Unsigned int allmulti;
        public boolean uc_promisc;
        public Ptr<InDefinitions.in_device> ip_ptr;
        public Ptr<VlanDefinitions.vlan_info> vlan_info;
        public Ptr<DsaDefinitions.dsa_port> dsa_ptr;
        public @OriginalName(value="tipc_bearer") Ptr<?> tipc_ptr;
        public Ptr<?> atalk_ptr;
        public Ptr<?> ax25_ptr;
        public Ptr<WirelessDefinitions.wireless_dev> ieee80211_ptr;
        public Ptr<misc.wpan_dev> ieee802154_ptr;
        public @OriginalName(value="mpls_dev") Ptr<?> mpls_ptr;
        public Ptr<MctpDefinitions.mctp_dev> mctp_ptr;
        public String dev_addr;
        public @Unsigned int num_rx_queues;
        public @Unsigned int xdp_zc_max_segs;
        public Ptr<NetdevDefinitions.netdev_queue> ingress_queue;
        public Ptr<NfDefinitions.nf_hook_entries> nf_hooks_ingress;
        public char @Size(value=32) [] broadcast;
        public Ptr<CpuDefinitions.cpu_rmap> rx_cpu_rmap;
        public misc.hlist_node index_hlist;
        public @Unsigned int num_tx_queues;
        public Ptr<runtime.Qdisc> qdisc;
        public @Unsigned int tx_queue_len;
        public  @OriginalName(value="spinlock_t") runtime.spinlock tx_global_lock;
        public Ptr<XdpDefinitions.xdp_dev_bulk_queue> xdp_bulkq;
        public misc.hlist_head @Size(value=16) [] qdisc_hash;
        public TimerDefinitions.timer_list watchdog_timer;
        public int watchdog_timeo;
        public @Unsigned int proto_down_reason;
        public ListDefinitions.list_head todo_list;
        public Ptr<Integer> pcpu_refcnt;
        public misc.ref_tracker_dir refcnt_tracker;
        public ListDefinitions.list_head link_watch_list;
        public char reg_state;
        public boolean dismantle;
        public RtnlDefinitions.rtnl_link_state_of_net_device rtnl_link_state;
        public boolean needs_free_netdev;
        public Ptr<?> priv_destructor;
        public Ptr<?> ml_priv;
        public NetdevDefinitions.netdev_ml_priv_type ml_priv_type;
        public NetdevDefinitions.netdev_stat_type pcpu_stat_type;
        public @OriginalName(value="garp_port") Ptr<?> garp_port;
        public @OriginalName(value="mrp_port") Ptr<?> mrp_port;
        public Ptr<DmDefinitions.dm_hw_stat_delta> dm_private;
        public runtime.device dev;
        public Ptr<AttributeDefinitions.attribute_group> @Size(value=4) [] sysfs_groups;
        public Ptr<AttributeDefinitions.attribute_group> sysfs_rx_queue_group;
        public Ptr<RtnlDefinitions.rtnl_link_ops> rtnl_link_ops;
        public Ptr<NetdevDefinitions.netdev_stat_ops> stat_ops;
        public Ptr<NetdevDefinitions.netdev_queue_mgmt_ops> queue_mgmt_ops;
        public @Unsigned int tso_max_size;
        public @Unsigned short tso_max_segs;
        public Ptr<DcbnlDefinitions.dcbnl_rtnl_ops> dcbnl_ops;
        public char @Size(value=16) [] prio_tc_map;
        public @Unsigned int fcoe_ddp_xid;
        public Ptr<misc.netprio_map> priomap;
        public Ptr<PhyDefinitions.phy_link_topology> link_topo;
        public Ptr<PhyDefinitions.phy_device> phydev;
        public Ptr<SfpDefinitions.sfp_bus> sfp_bus;
        public Ptr<LockDefinitions.lock_class_key> qdisc_tx_busylock;
        public boolean proto_down;
        public boolean threaded;
        public @Unsigned long see_all_hwtstamp_requests;
        public @Unsigned long change_proto_down;
        public @Unsigned long netns_local;
        public @Unsigned long fcoe_mtu;
        public ListDefinitions.list_head net_notifier_list;
        public Ptr<MacsecDefinitions.macsec_ops> macsec_ops;
        public Ptr<UdpDefinitions.udp_tunnel_nic_info> udp_tunnel_nic_info;
        public @OriginalName(value="udp_tunnel_nic") Ptr<?> udp_tunnel_nic;
        public Ptr<EthtoolDefinitions.ethtool_netdev_state> ethtool;
        public BpfDefinitions.bpf_xdp_entity @Size(value=3) [] xdp_state;
        public char @Size(value=32) [] dev_addr_shadow;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p linkwatch_dev_tracker;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p watchdog_dev_tracker;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_registered_tracker;
        public Ptr<RtnlDefinitions.rtnl_hw_stats64> offload_xstats_l3;
        public Ptr<DevlinkDefinitions.devlink_port> devlink_port;
        public Ptr<DpllDefinitions.dpll_pin> dpll_pin;
        public misc.hlist_head page_pools;
        public Ptr<DimDefinitions.dim_irq_moder> irq_moder;
        public char @Size(value=0) [] priv;
    }
}

