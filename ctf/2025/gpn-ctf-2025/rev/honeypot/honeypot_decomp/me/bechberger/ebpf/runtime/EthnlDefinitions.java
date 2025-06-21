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
import me.bechberger.ebpf.runtime.DimDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class EthnlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ethnl_auto_linkmodes(Ptr<EthtoolDefinitions.ethtool_link_ksettings> ksettings, boolean req_speed, boolean req_lanes, boolean req_duplex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_bitmap32_clear(Ptr<@Unsigned Integer> dst, @Unsigned int start, @Unsigned int end, Ptr<@OriginalName(value="bool") Boolean> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_bitset32_size((const unsigned int*)$arg1, (const unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static int ethnl_bitset32_size(Ptr<@Unsigned Integer> val, Ptr<@Unsigned Integer> mask, @Unsigned int nbits, @OriginalName(value="ethnl_string_array_t") Ptr<char @Size(value=32) []> names, boolean compact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_bitset_is_compact((const struct nlattr*)$arg1, $arg2)")
    public static int ethnl_bitset_is_compact(Ptr<runtime.nlattr> bitset, Ptr<@OriginalName(value="bool") Boolean> compact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_bitset_size((const long unsigned int*)$arg1, (const long unsigned int*)$arg2, $arg3, $arg4, $arg5)")
    public static int ethnl_bitset_size(Ptr<@Unsigned Long> val, Ptr<@Unsigned Long> mask, @Unsigned int nbits, @OriginalName(value="ethnl_string_array_t") Ptr<char @Size(value=32) []> names, boolean compact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_compact_sanity_checks($arg1, (const struct nlattr*)$arg2, $arg3, $arg4)")
    public static int ethnl_compact_sanity_checks(@Unsigned int nbits, Ptr<runtime.nlattr> nest, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_parse_bit($arg1, $arg2, $arg3, (const struct nlattr*)$arg4, $arg5, $arg6, $arg7)")
    public static int ethnl_parse_bit(Ptr<@Unsigned Integer> index2, Ptr<@OriginalName(value="bool") Boolean> val, @Unsigned int nbits, Ptr<runtime.nlattr> bit_attr, boolean no_mask, @OriginalName(value="ethnl_string_array_t") Ptr<char @Size(value=32) []> names, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_parse_bitset($arg1, $arg2, $arg3, (const struct nlattr*)$arg4, $arg5, $arg6)")
    public static int ethnl_parse_bitset(Ptr<@Unsigned Long> val, Ptr<@Unsigned Long> mask, @Unsigned int nbits, Ptr<runtime.nlattr> attr2, @OriginalName(value="ethnl_string_array_t") Ptr<char @Size(value=32) []> names, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_put_bitset($arg1, $arg2, (const long unsigned int*)$arg3, (const long unsigned int*)$arg4, $arg5, $arg6, $arg7)")
    public static int ethnl_put_bitset(Ptr<SkDefinitions.sk_buff> skb, int attrtype, Ptr<@Unsigned Long> val, Ptr<@Unsigned Long> mask, @Unsigned int nbits, @OriginalName(value="ethnl_string_array_t") Ptr<char @Size(value=32) []> names, boolean compact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_put_bitset32($arg1, $arg2, (const unsigned int*)$arg3, (const unsigned int*)$arg4, $arg5, $arg6, $arg7)")
    public static int ethnl_put_bitset32(Ptr<SkDefinitions.sk_buff> skb, int attrtype, Ptr<@Unsigned Integer> val, Ptr<@Unsigned Integer> mask, @Unsigned int nbits, @OriginalName(value="ethnl_string_array_t") Ptr<char @Size(value=32) []> names, boolean compact) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_channels(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_channels_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_linkmodes(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_linkmodes_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_mm(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_mm_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_pse(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_wol(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_wol_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_update_bitset($arg1, $arg2, (const struct nlattr*)$arg3, $arg4, $arg5, $arg6)")
    public static int ethnl_update_bitset(Ptr<@Unsigned Long> bitmap2, @Unsigned int nbits, Ptr<runtime.nlattr> attr2, @OriginalName(value="ethnl_string_array_t") Ptr<char @Size(value=32) []> names, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<@OriginalName(value="bool") Boolean> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_update_bitset32($arg1, $arg2, (const struct nlattr*)$arg3, $arg4, $arg5, $arg6)")
    public static int ethnl_update_bitset32(Ptr<@Unsigned Integer> bitmap2, @Unsigned int nbits, Ptr<runtime.nlattr> attr2, @OriginalName(value="ethnl_string_array_t") Ptr<char @Size(value=32) []> names, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, Ptr<@OriginalName(value="bool") Boolean> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_update_linkmodes($arg1, $arg2, $arg3, $arg4, (const struct net_device*)$arg5)")
    public static int ethnl_update_linkmodes(Ptr<GenlDefinitions.genl_info> info2, Ptr<Ptr<runtime.nlattr>> tb, Ptr<EthtoolDefinitions.ethtool_link_ksettings> ksettings, Ptr<@OriginalName(value="bool") Boolean> mod, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_act_cable_test(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_act_cable_test_tdr(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_act_cable_test_tdr_cfg((const struct nlattr*)$arg1, $arg2, $arg3)")
    public static int ethnl_act_cable_test_tdr_cfg(Ptr<runtime.nlattr> nest, Ptr<GenlDefinitions.genl_info> info2, Ptr<PhyDefinitions.phy_tdr_config> cfg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_act_module_fw_flash(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ethnl_bcastmsg_put(Ptr<SkDefinitions.sk_buff> skb, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_cable_test_alloc(Ptr<PhyDefinitions.phy_device> phydev, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_cable_test_amplitude(Ptr<PhyDefinitions.phy_device> phydev, char pair, short mV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_cable_test_fault_length_with_src(Ptr<PhyDefinitions.phy_device> phydev, char pair, @Unsigned int cm, @Unsigned int src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_cable_test_finished(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_cable_test_free(Ptr<PhyDefinitions.phy_device> phydev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_cable_test_pulse(Ptr<PhyDefinitions.phy_device> phydev, @Unsigned short mV) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_cable_test_result_with_src(Ptr<PhyDefinitions.phy_device> phydev, char pair, char result, @Unsigned int src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_cable_test_started(Ptr<PhyDefinitions.phy_device> phydev, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_cable_test_step(Ptr<PhyDefinitions.phy_device> phydev, @Unsigned int first, @Unsigned int last, @Unsigned int step) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_default_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_default_done(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_default_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_default_notify($arg1, $arg2, (const void*)$arg3)")
    public static void ethnl_default_notify(Ptr<NetDefinitions.net_device> dev, @Unsigned int cmd, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_default_parse($arg1, (const struct genl_info*)$arg2, (const struct ethnl_request_ops*)$arg3, $arg4)")
    public static int ethnl_default_parse(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2, Ptr<ethnl_request_ops> request_ops, boolean require_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_default_set_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_default_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ethnl_dump_put(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_fill_reply_header(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned short attrtype) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_module_fw_flash_ntf(Ptr<NetDefinitions.net_device> dev, EthtoolDefinitions.ethtool_module_fw_flash_status status, Ptr<ethnl_module_fw_flash_ntf_params> ntf_params, String err_msg, String sub_err_msg, @Unsigned long done, @Unsigned long total) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_module_fw_flash_ntf_complete(Ptr<NetDefinitions.net_device> dev, Ptr<ethnl_module_fw_flash_ntf_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_module_fw_flash_ntf_err(Ptr<NetDefinitions.net_device> dev, Ptr<ethnl_module_fw_flash_ntf_params> params, String err_msg, String sub_err_msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_module_fw_flash_ntf_in_progress(Ptr<NetDefinitions.net_device> dev, Ptr<ethnl_module_fw_flash_ntf_params> params, @Unsigned long done, @Unsigned long total) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_module_fw_flash_ntf_put_err(Ptr<SkDefinitions.sk_buff> skb, String err_msg, String sub_err_msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_module_fw_flash_ntf_start(Ptr<NetDefinitions.net_device> dev, Ptr<ethnl_module_fw_flash_ntf_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_module_fw_flash_sock_destroy(Ptr<ethnl_sock_priv> sk_priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_multicast(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_netdev_event(Ptr<misc.notifier_block> _this, @Unsigned long event2, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_ops_begin(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_ops_complete(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_parse_header_dev_get($arg1, (const struct nlattr*)$arg2, $arg3, $arg4, $arg5)")
    public static int ethnl_parse_header_dev_get(Ptr<ethnl_req_info> req_info, Ptr<runtime.nlattr> header, Ptr<runtime.net> net2, Ptr<NetlinkDefinitions.netlink_ext_ack> extack, boolean require_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> ethnl_reply_init(@Unsigned long payload, Ptr<NetDefinitions.net_device> dev, char cmd, @Unsigned short hdr_attrtype, Ptr<GenlDefinitions.genl_info> info2, Ptr<Ptr<?>> ehdrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_req_get_phydev((const struct ethnl_req_info*)$arg1, (const struct nlattr*)$arg2, $arg3)")
    public static Ptr<PhyDefinitions.phy_device> ethnl_req_get_phydev(Ptr<ethnl_req_info> req_info, Ptr<runtime.nlattr> header, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_rss_dump_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_rss_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_coalesce(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_coalesce_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_features(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_module(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_module_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_plca(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethnl_sock_priv_destroy(Ptr<?> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_sock_priv_set(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, @Unsigned int portid, ethnl_sock_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ethnl_unicast_put(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int portid, @Unsigned int seq, char cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_update_profile($arg1, $arg2, (const struct nlattr*)$arg3, $arg4, $arg5)")
    public static int ethnl_update_profile(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<DimDefinitions.dim_cq_moder>> dst, Ptr<runtime.nlattr> nests, Ptr<@OriginalName(value="bool") Boolean> mod, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_get_priv_flags_info($arg1, $arg2, (const u8[32]**)$arg3)")
    public static int ethnl_get_priv_flags_info(Ptr<NetDefinitions.net_device> dev, Ptr<@Unsigned Integer> count, Ptr<Ptr<char @Size(value=32) []>> names) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_fec(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_fec_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_pause(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_pause_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_privflags(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_privflags_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_phy_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_phy_done(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_phy_dump_one_dev(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_phy_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_phy_fill_reply((const struct ethnl_req_info*)$arg1, $arg2)")
    public static int ethnl_phy_fill_reply(Ptr<ethnl_req_info> req_base, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_phy_reply_size((const struct ethnl_req_info*)$arg1, $arg2)")
    public static @OriginalName(value="ssize_t") long ethnl_phy_reply_size(Ptr<ethnl_req_info> req_base, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_phy_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_debug(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_debug_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_eee(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_eee_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_linkinfo(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_linkinfo_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_rings(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_set_rings_validate(Ptr<ethnl_req_info> req_info, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_tunnel_info_doit(Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_tunnel_info_dumpit(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethnl_tunnel_info_fill_reply((const struct ethnl_req_info*)$arg1, $arg2)")
    public static int ethnl_tunnel_info_fill_reply(Ptr<ethnl_req_info> req_base, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethnl_tunnel_info_start(Ptr<NetlinkDefinitions.netlink_callback> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ethnl_dump_ctx")
    @NotUsableInJava
    public static class ethnl_dump_ctx
    extends Struct {
        public Ptr<ethnl_request_ops> ops;
        public Ptr<ethnl_req_info> req_info;
        public Ptr<ethnl_reply_data> reply_data;
        public @Unsigned long pos_ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct ethnl_sock_priv")
    @NotUsableInJava
    public static class ethnl_sock_priv
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned int portid;
        public ethnl_sock_type type;
    }

    @Type(noCCodeGeneration=true, cType="enum ethnl_sock_type")
    public static enum ethnl_sock_type implements Enum<ethnl_sock_type>,
    TypedEnum<ethnl_sock_type, Integer>
    {
        ETHTOOL_SOCK_TYPE_MODULE_FW_FLASH;

    }

    @Type(noCCodeGeneration=true, cType="struct ethnl_phy_dump_ctx")
    @NotUsableInJava
    public static class ethnl_phy_dump_ctx
    extends Struct {
        public Ptr<PhyDefinitions.phy_req_info> phy_req_info;
        public @Unsigned long ifindex;
        public @Unsigned long phy_index;
    }

    @Type(noCCodeGeneration=true, cType="struct ethnl_module_fw_flash_ntf_params")
    @NotUsableInJava
    public static class ethnl_module_fw_flash_ntf_params
    extends Struct {
        public @Unsigned int portid;
        public @Unsigned int seq;
        public boolean closed_sock;
    }

    @Type(noCCodeGeneration=true, cType="struct ethnl_tunnel_info_dump_ctx")
    @NotUsableInJava
    public static class ethnl_tunnel_info_dump_ctx
    extends Struct {
        public ethnl_req_info req_info;
        public @Unsigned long ifindex;
    }

    @Type(noCCodeGeneration=true, cType="struct ethnl_request_ops")
    @NotUsableInJava
    public static class ethnl_request_ops
    extends Struct {
        public char request_cmd;
        public char reply_cmd;
        public @Unsigned short hdr_attr;
        public @Unsigned int req_info_size;
        public @Unsigned int reply_data_size;
        public boolean allow_nodev_do;
        public char set_ntf_cmd;
        public Ptr<?> parse_request;
        public Ptr<?> prepare_data;
        public Ptr<?> reply_size;
        public Ptr<?> fill_reply;
        public Ptr<?> cleanup_data;
        public Ptr<?> set_validate;
        public Ptr<?> set;
    }

    @Type(noCCodeGeneration=true, cType="struct ethnl_reply_data")
    @NotUsableInJava
    public static class ethnl_reply_data
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
    }

    @Type(noCCodeGeneration=true, cType="struct ethnl_req_info")
    @NotUsableInJava
    public static class ethnl_req_info
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public @Unsigned int flags;
        public @Unsigned int phy_index;
    }
}

