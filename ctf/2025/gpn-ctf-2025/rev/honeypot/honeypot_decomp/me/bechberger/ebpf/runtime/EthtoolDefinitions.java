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
import me.bechberger.ebpf.runtime.CmisDefinitions;
import me.bechberger.ebpf.runtime.CompatDefinitions;
import me.bechberger.ebpf.runtime.EthnlDefinitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LinkDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class EthtoolDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __ethtool_dev_mm_supported(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ethtool_dev_mm_supported(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_notify($arg1, $arg2, (const void*)$arg3)")
    public static void ethtool_notify(Ptr<NetDefinitions.net_device> dev, @Unsigned int cmd, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __ethtool_get_flags(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ethtool_get_link_ksettings(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_link_ksettings> link_ksettings) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ethtool_get_sset_count(Ptr<NetDefinitions.net_device> dev, int sset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __ethtool_get_strings(Ptr<NetDefinitions.net_device> dev, @Unsigned int stringset, Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ethtool_set_flags(Ptr<NetDefinitions.net_device> dev, @Unsigned int data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_aggregate_ctrl_stats(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_eth_ctrl_stats> ctrl_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_aggregate_mac_stats(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_eth_mac_stats> mac_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_aggregate_pause_stats(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_pause_stats> pause_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_aggregate_phy_stats(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_eth_phy_stats> phy_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_aggregate_rmon_stats(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_rmon_stats> rmon_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_cmis_cdb_check_completion_flag(char cmis_rev, Ptr<Character> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_cmis_cdb_compose_args(Ptr<ethtool_cmis_cdb_cmd_args> args, ethtool_cmis_cdb_cmd_id cmd, Ptr<Character> pl, char lpl_len, @Unsigned short max_duration, char read_write_len_ext, @Unsigned short msleep_pre_rpl, char rpl_exp_len, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_cmis_cdb_execute_cmd(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_cmis_cdb_cmd_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_cmis_cdb_fini(Ptr<ethtool_cmis_cdb> cdb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_cmis_cdb_init($arg1, (const struct ethtool_module_fw_flash_params*)$arg2, $arg3)")
    public static Ptr<ethtool_cmis_cdb> ethtool_cmis_cdb_init(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_module_fw_flash_params> params, Ptr<EthnlDefinitions.ethnl_module_fw_flash_ntf_params> ntf_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ethtool_cmis_get_max_payload_size(char num_of_byte_octs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_cmis_module_poll($arg1, $arg2, $arg3, (_Bool (*)(u8))$arg4, (_Bool (*)(u8))$arg5)")
    public static int ethtool_cmis_module_poll(Ptr<NetDefinitions.net_device> dev, Ptr<CmisDefinitions.cmis_wait_for_cond_rpl> rpl, @Unsigned int offset, Ptr<?> cond_success, Ptr<?> cond_fail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_cmis_page_init(Ptr<ethtool_module_eeprom> page_data, char page2, @Unsigned int offset, @Unsigned int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_cmis_wait_for_cond($arg1, $arg2, $arg3, $arg4, $arg5, (_Bool (*)(u8))$arg6, (_Bool (*)(u8))$arg7, $arg8)")
    public static int ethtool_cmis_wait_for_cond(Ptr<NetDefinitions.net_device> dev, char flags, char flag, @Unsigned short max_duration, @Unsigned int offset, Ptr<?> cond_success, Ptr<?> cond_fail, Ptr<Character> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_convert_legacy_u32_to_link_mode(Ptr<@Unsigned Long> dst, @Unsigned int legacy_u32) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_convert_link_mode_to_legacy_u32($arg1, (const long unsigned int*)$arg2)")
    public static boolean ethtool_convert_link_mode_to_legacy_u32(Ptr<@Unsigned Integer> legacy_u32, Ptr<@Unsigned Long> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_copy_validate_indir(Ptr<@Unsigned Integer> indir, Ptr<?> useraddr, Ptr<ethtool_rxnfc> rx_rings, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_fec_to_link_modes(@Unsigned int fec, Ptr<@Unsigned Long> link_modes, Ptr<Character> fec_auto) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_get_any_eeprom($arg1, $arg2, (int (*)(struct net_device*, struct ethtool_eeprom*, u8*))$arg3, $arg4)")
    public static int ethtool_get_any_eeprom(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr, Ptr<?> getter, @Unsigned int total_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_channels(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_coalesce(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_drvinfo(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_devlink_compat> rsp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_dump_data(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_eee(Ptr<NetDefinitions.net_device> dev, String useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_link_ksettings(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_module_eeprom_call(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_eeprom> ee, Ptr<Character> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_module_info_call(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_modinfo> modinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_per_queue_coalesce(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr, Ptr<ethtool_per_queue_op> per_queue_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_phy_stats(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_rxfh(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_rxfh_indir(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_rxnfc(Ptr<NetDefinitions.net_device> dev, @Unsigned int cmd, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_settings(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_sset_info(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_stats(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_intersect_link_masks(Ptr<ethtool_link_ksettings> dst, Ptr<ethtool_link_ksettings> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_link_modes_to_fecparam(Ptr<ethtool_fecparam> fec, Ptr<@Unsigned Long> link_modes, char fec_auto) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ethtool_op_get_link(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_op_get_ts_info(Ptr<NetDefinitions.net_device> dev, Ptr<KernelDefinitions.kernel_ethtool_ts_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_phys_id(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_puts($arg1, (const u8*)$arg2)")
    public static void ethtool_puts(Ptr<Ptr<Character>> data, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_rx_flow_rule_create((const struct ethtool_rx_flow_spec_input*)$arg1)")
    public static Ptr<ethtool_rx_flow_rule> ethtool_rx_flow_rule_create(Ptr<ethtool_rx_flow_spec_input> input) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_rx_flow_rule_destroy(Ptr<ethtool_rx_flow_rule> flow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_rxnfc_copy_from_compat($arg1, (const struct compat_ethtool_rxnfc*)$arg2, $arg3)")
    public static int ethtool_rxnfc_copy_from_compat(Ptr<ethtool_rxnfc> rxnfc, Ptr<CompatDefinitions.compat_ethtool_rxnfc> useraddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_rxnfc_copy_from_user($arg1, (const void*)$arg2, $arg3)")
    public static int ethtool_rxnfc_copy_from_user(Ptr<ethtool_rxnfc> rxnfc, Ptr<?> useraddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_rxnfc_copy_struct(@Unsigned int cmd, Ptr<ethtool_rxnfc> info2, Ptr<@Unsigned Long> info_size, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_rxnfc_copy_to_compat($arg1, (const struct ethtool_rxnfc*)$arg2, $arg3, (const unsigned int*)$arg4)")
    public static int ethtool_rxnfc_copy_to_compat(Ptr<?> useraddr, Ptr<ethtool_rxnfc> rxnfc, @Unsigned long size, Ptr<@Unsigned Integer> rule_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_rxnfc_copy_to_user($arg1, (const struct ethtool_rxnfc*)$arg2, $arg3, (const unsigned int*)$arg4)")
    public static int ethtool_rxnfc_copy_to_user(Ptr<?> useraddr, Ptr<ethtool_rxnfc> rxnfc, @Unsigned long size, Ptr<@Unsigned Integer> rule_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_self_test(Ptr<NetDefinitions.net_device> dev, String useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_channels(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_coalesce(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ethtool_set_coalesce_supported(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_coalesce> coalesce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_eee(Ptr<NetDefinitions.net_device> dev, String useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_eeprom(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_link_ksettings(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_per_queue(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr, @Unsigned int sub_cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_per_queue_coalesce(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr, Ptr<ethtool_per_queue_op> per_queue_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_rxfh(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_rxfh_indir(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_rxnfc(Ptr<NetDefinitions.net_device> dev, @Unsigned int cmd, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_set_settings(Ptr<NetDefinitions.net_device> dev, Ptr<?> useraddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_sprintf($arg1, (const u8*)$arg2, $arg3_)")
    public static void ethtool_sprintf(Ptr<Ptr<Character>> data, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_virtdev_set_link_ksettings($arg1, (const struct ethtool_link_ksettings*)$arg2, $arg3, $arg4)")
    public static int ethtool_virtdev_set_link_ksettings(Ptr<NetDefinitions.net_device> dev, Ptr<ethtool_link_ksettings> cmd, Ptr<@Unsigned Integer> dev_speed, Ptr<Character> dev_duplex) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_virtdev_validate_cmd((const struct ethtool_link_ksettings*)$arg1)")
    public static boolean ethtool_virtdev_validate_cmd(Ptr<ethtool_link_ksettings> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ethtool_get_link(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ethtool_get_ts_info(Ptr<NetDefinitions.net_device> dev, Ptr<KernelDefinitions.kernel_ethtool_ts_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_check_max_channel(Ptr<NetDefinitions.net_device> dev, ethtool_channels channels, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_check_ops((const struct ethtool_ops*)$arg1)")
    public static int ethtool_check_ops(Ptr<ethtool_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_cmis_fw_update(Ptr<ethtool_cmis_fw_update_params> fw_update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_forced_speed_maps_init(Ptr<ethtool_forced_speed_map> maps, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int ethtool_get_max_rxfh_channel(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_max_rxnfc_channel(Ptr<NetDefinitions.net_device> dev, Ptr<@Unsigned Long> max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_phc_vclocks(Ptr<NetDefinitions.net_device> dev, Ptr<Ptr<Integer>> vclock_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_rxnfc_rule_count(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ethtool_get_ts_info_by_layer(Ptr<NetDefinitions.net_device> dev, Ptr<KernelDefinitions.kernel_ethtool_ts_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_params_from_link_mode(Ptr<ethtool_link_ksettings> link_ksettings, ethtool_link_mode_bit_indices link_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ethtool_rxfh_context_lost(Ptr<NetDefinitions.net_device> dev, @Unsigned int context_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ethtool_set_ethtool_phy_ops((const struct ethtool_phy_ops*)$arg1)")
    public static void ethtool_set_ethtool_phy_ops(Ptr<ethtool_phy_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ethhdr")
    @NotUsableInJava
    public static class ethhdr
    extends Struct {
        public char @Size(value=6) [] h_dest;
        public char @Size(value=6) [] h_source;
        public @Unsigned @OriginalName(value="__be16") short h_proto;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_cmis_cdb_rpl")
    @NotUsableInJava
    public static class ethtool_cmis_cdb_rpl
    extends Struct {
        public ethtool_cmis_cdb_rpl_hdr hdr;
        public char @Size(value=120) [] payload;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_cmis_cdb_rpl_hdr")
    @NotUsableInJava
    public static class ethtool_cmis_cdb_rpl_hdr
    extends Struct {
        public char rpl_len;
        public char rpl_chk_code;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rx_flow_match")
    @NotUsableInJava
    public static class ethtool_rx_flow_match
    extends Struct {
        public FlowDefinitions.flow_dissector dissector;
        public ethtool_rx_flow_key key;
        public ethtool_rx_flow_key mask;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rx_flow_key")
    @NotUsableInJava
    public static class ethtool_rx_flow_key
    extends Struct {
        public FlowDefinitions.flow_dissector_key_basic basic;
        @InlineUnion(value=34634)
        public @InlineUnion(value=34634) FlowDefinitions.flow_dissector_key_ipv4_addrs ipv4;
        @InlineUnion(value=34634)
        public @InlineUnion(value=34634) FlowDefinitions.flow_dissector_key_ipv6_addrs ipv6;
        public FlowDefinitions.flow_dissector_key_ports tp;
        public FlowDefinitions.flow_dissector_key_ip ip;
        public FlowDefinitions.flow_dissector_key_vlan vlan;
        public FlowDefinitions.flow_dissector_key_eth_addrs eth_addrs;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_link_usettings")
    @NotUsableInJava
    public static class ethtool_link_usettings
    extends Struct {
        public ethtool_link_settings base;
        public LinkDefinitions.link_modes_of_ethtool_link_usettings link_modes;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_devlink_compat")
    @NotUsableInJava
    public static class ethtool_devlink_compat
    extends Struct {
        public Ptr<runtime.devlink> devlink;
        @InlineUnion(value=96066)
        public @InlineUnion(value=96066) ethtool_flash efl;
        @InlineUnion(value=96066)
        public @InlineUnion(value=96066) ethtool_drvinfo info;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rx_flow_spec_input")
    @NotUsableInJava
    public static class ethtool_rx_flow_spec_input
    extends Struct {
        public Ptr<ethtool_rx_flow_spec> fs;
        public @Unsigned int rss_ctx;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rx_flow_rule")
    @NotUsableInJava
    public static class ethtool_rx_flow_rule
    extends Struct {
        public Ptr<FlowDefinitions.flow_rule> rule;
        public @Unsigned long @Size(value=0) [] priv;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_fec_config_bits")
    public static enum ethtool_fec_config_bits implements Enum<ethtool_fec_config_bits>,
    TypedEnum<ethtool_fec_config_bits, Integer>
    {
        ETHTOOL_FEC_NONE_BIT,
        ETHTOOL_FEC_AUTO_BIT,
        ETHTOOL_FEC_OFF_BIT,
        ETHTOOL_FEC_RS_BIT,
        ETHTOOL_FEC_BASER_BIT,
        ETHTOOL_FEC_LLRS_BIT;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_per_queue_op")
    @NotUsableInJava
    public static class ethtool_per_queue_op
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int sub_command;
        public @Unsigned int @Size(value=128) [] queue_mask;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_sfeatures_retval_bits")
    public static enum ethtool_sfeatures_retval_bits implements Enum<ethtool_sfeatures_retval_bits>,
    TypedEnum<ethtool_sfeatures_retval_bits, Integer>
    {
        ETHTOOL_F_UNSUPPORTED__BIT,
        ETHTOOL_F_WISH__BIT,
        ETHTOOL_F_COMPAT__BIT;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_ts_info")
    @NotUsableInJava
    public static class ethtool_ts_info
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int so_timestamping;
        public int phc_index;
        public @Unsigned int tx_types;
        public @Unsigned int @Size(value=3) [] tx_reserved;
        public @Unsigned int rx_filters;
        public @Unsigned int @Size(value=3) [] rx_reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_sfeatures")
    @NotUsableInJava
    public static class ethtool_sfeatures
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int size;
        public ethtool_set_features_block @Size(value=0) [] features;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_set_features_block")
    @NotUsableInJava
    public static class ethtool_set_features_block
    extends Struct {
        public @Unsigned int valid;
        public @Unsigned int requested;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_gfeatures")
    @NotUsableInJava
    public static class ethtool_gfeatures
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int size;
        public ethtool_get_features_block @Size(value=0) [] features;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_get_features_block")
    @NotUsableInJava
    public static class ethtool_get_features_block
    extends Struct {
        public @Unsigned int available;
        public @Unsigned int requested;
        public @Unsigned int active;
        public @Unsigned int never_changed;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rxfh")
    @NotUsableInJava
    public static class ethtool_rxfh
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int rss_context;
        public @Unsigned int indir_size;
        public @Unsigned int key_size;
        public char hfunc;
        public char input_xfrm;
        public char @Size(value=2) [] rsvd8;
        public @Unsigned int rsvd32;
        public @Unsigned int @Size(value=0) [] rss_config;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_flags")
    public static enum ethtool_flags implements Enum<ethtool_flags>,
    TypedEnum<ethtool_flags, Integer>
    {
        ETH_FLAG_TXVLAN,
        ETH_FLAG_RXVLAN,
        ETH_FLAG_LRO,
        ETH_FLAG_NTUPLE,
        ETH_FLAG_RXHASH;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_perm_addr")
    @NotUsableInJava
    public static class ethtool_perm_addr
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int size;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_sset_info")
    @NotUsableInJava
    public static class ethtool_sset_info
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int reserved;
        public @Unsigned long sset_mask;
        public @Unsigned int @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_gstrings")
    @NotUsableInJava
    public static class ethtool_gstrings
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int string_set;
        public @Unsigned int len;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_eee")
    @NotUsableInJava
    public static class ethtool_eee
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int supported;
        public @Unsigned int advertised;
        public @Unsigned int lp_advertised;
        public @Unsigned int eee_active;
        public @Unsigned int eee_enabled;
        public @Unsigned int tx_lpi_enabled;
        public @Unsigned int tx_lpi_timer;
        public @Unsigned int @Size(value=2) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_value")
    @NotUsableInJava
    public static class ethtool_value
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int data;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_pse_types")
    public static enum ethtool_pse_types implements Enum<ethtool_pse_types>,
    TypedEnum<ethtool_pse_types, Integer>
    {
        ETHTOOL_PSE_UNKNOWN,
        ETHTOOL_PSE_PODL,
        ETHTOOL_PSE_C33;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_module_fw_flash")
    @NotUsableInJava
    public static class ethtool_module_fw_flash
    extends Struct {
        public ListDefinitions.list_head list;
        public @OriginalName(value="netdevice_tracker") misc.lockdep_map_p dev_tracker;
        public misc.work_struct work;
        public ethtool_cmis_fw_update_params fw_update;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_module_fw_flash_status")
    public static enum ethtool_module_fw_flash_status implements Enum<ethtool_module_fw_flash_status>,
    TypedEnum<ethtool_module_fw_flash_status, Integer>
    {
        ETHTOOL_MODULE_FW_FLASH_STATUS_STARTED,
        ETHTOOL_MODULE_FW_FLASH_STATUS_IN_PROGRESS,
        ETHTOOL_MODULE_FW_FLASH_STATUS_COMPLETED,
        ETHTOOL_MODULE_FW_FLASH_STATUS_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_multicast_groups")
    public static enum ethtool_multicast_groups implements Enum<ethtool_multicast_groups>,
    TypedEnum<ethtool_multicast_groups, Integer>
    {
        ETHNL_MCGRP_MONITOR;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_test_flags")
    public static enum ethtool_test_flags implements Enum<ethtool_test_flags>,
    TypedEnum<ethtool_test_flags, Integer>
    {
        ETH_TEST_FL_OFFLINE,
        ETH_TEST_FL_FAILED,
        ETH_TEST_FL_EXTERNAL_LB,
        ETH_TEST_FL_EXTERNAL_LB_DONE;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_c33_pse_pw_limit_range")
    @NotUsableInJava
    public static class ethtool_c33_pse_pw_limit_range
    extends Struct {
        public @Unsigned int min;
        public @Unsigned int max;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_c33_pse_ext_state_info")
    @NotUsableInJava
    public static class ethtool_c33_pse_ext_state_info
    extends Struct {
        public ethtool_c33_pse_ext_state c33_pse_ext_state;
        @InlineUnion(value=34304)
        public @InlineUnion(value=34304) ethtool_c33_pse_ext_substate_error_condition error_condition;
        @InlineUnion(value=34304)
        public @InlineUnion(value=34304) ethtool_c33_pse_ext_substate_mr_pse_enable mr_pse_enable;
        @InlineUnion(value=34304)
        public @InlineUnion(value=34304) ethtool_c33_pse_ext_substate_option_detect_ted option_detect_ted;
        @InlineUnion(value=34304)
        public @InlineUnion(value=34304) ethtool_c33_pse_ext_substate_option_vport_lim option_vport_lim;
        @InlineUnion(value=34304)
        public @InlineUnion(value=34304) ethtool_c33_pse_ext_substate_ovld_detected ovld_detected;
        @InlineUnion(value=34304)
        public @InlineUnion(value=34304) ethtool_c33_pse_ext_substate_power_not_available power_not_available;
        @InlineUnion(value=34304)
        public @InlineUnion(value=34304) ethtool_c33_pse_ext_substate_short_detected short_detected;
        @InlineUnion(value=34304)
        public @InlineUnion(value=34304) @Unsigned int __c33_pse_ext_substate;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_podl_pse_pw_d_status")
    public static enum ethtool_podl_pse_pw_d_status implements Enum<ethtool_podl_pse_pw_d_status>,
    TypedEnum<ethtool_podl_pse_pw_d_status, Integer>
    {
        ETHTOOL_PODL_PSE_PW_D_STATUS_UNKNOWN,
        ETHTOOL_PODL_PSE_PW_D_STATUS_DISABLED,
        ETHTOOL_PODL_PSE_PW_D_STATUS_SEARCHING,
        ETHTOOL_PODL_PSE_PW_D_STATUS_DELIVERING,
        ETHTOOL_PODL_PSE_PW_D_STATUS_SLEEP,
        ETHTOOL_PODL_PSE_PW_D_STATUS_IDLE,
        ETHTOOL_PODL_PSE_PW_D_STATUS_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_podl_pse_admin_state")
    public static enum ethtool_podl_pse_admin_state implements Enum<ethtool_podl_pse_admin_state>,
    TypedEnum<ethtool_podl_pse_admin_state, Integer>
    {
        ETHTOOL_PODL_PSE_ADMIN_STATE_UNKNOWN,
        ETHTOOL_PODL_PSE_ADMIN_STATE_DISABLED,
        ETHTOOL_PODL_PSE_ADMIN_STATE_ENABLED;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_pw_d_status")
    public static enum ethtool_c33_pse_pw_d_status implements Enum<ethtool_c33_pse_pw_d_status>,
    TypedEnum<ethtool_c33_pse_pw_d_status, Integer>
    {
        ETHTOOL_C33_PSE_PW_D_STATUS_UNKNOWN,
        ETHTOOL_C33_PSE_PW_D_STATUS_DISABLED,
        ETHTOOL_C33_PSE_PW_D_STATUS_SEARCHING,
        ETHTOOL_C33_PSE_PW_D_STATUS_DELIVERING,
        ETHTOOL_C33_PSE_PW_D_STATUS_TEST,
        ETHTOOL_C33_PSE_PW_D_STATUS_FAULT,
        ETHTOOL_C33_PSE_PW_D_STATUS_OTHERFAULT;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_admin_state")
    public static enum ethtool_c33_pse_admin_state implements Enum<ethtool_c33_pse_admin_state>,
    TypedEnum<ethtool_c33_pse_admin_state, Integer>
    {
        ETHTOOL_C33_PSE_ADMIN_STATE_UNKNOWN,
        ETHTOOL_C33_PSE_ADMIN_STATE_DISABLED,
        ETHTOOL_C33_PSE_ADMIN_STATE_ENABLED;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_ext_substate_short_detected")
    public static enum ethtool_c33_pse_ext_substate_short_detected implements Enum<ethtool_c33_pse_ext_substate_short_detected>,
    TypedEnum<ethtool_c33_pse_ext_substate_short_detected, Integer>
    {
        ETHTOOL_C33_PSE_EXT_SUBSTATE_SHORT_DETECTED_SHORT_CONDITION;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_ext_substate_power_not_available")
    public static enum ethtool_c33_pse_ext_substate_power_not_available implements Enum<ethtool_c33_pse_ext_substate_power_not_available>,
    TypedEnum<ethtool_c33_pse_ext_substate_power_not_available, Integer>
    {
        ETHTOOL_C33_PSE_EXT_SUBSTATE_POWER_NOT_AVAILABLE_BUDGET_EXCEEDED,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_POWER_NOT_AVAILABLE_PORT_PW_LIMIT_EXCEEDS_CONTROLLER_BUDGET,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_POWER_NOT_AVAILABLE_PD_REQUEST_EXCEEDS_PORT_LIMIT,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_POWER_NOT_AVAILABLE_HW_PW_LIMIT;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_ext_substate_ovld_detected")
    public static enum ethtool_c33_pse_ext_substate_ovld_detected implements Enum<ethtool_c33_pse_ext_substate_ovld_detected>,
    TypedEnum<ethtool_c33_pse_ext_substate_ovld_detected, Integer>
    {
        ETHTOOL_C33_PSE_EXT_SUBSTATE_OVLD_DETECTED_OVERLOAD;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_ext_substate_option_vport_lim")
    public static enum ethtool_c33_pse_ext_substate_option_vport_lim implements Enum<ethtool_c33_pse_ext_substate_option_vport_lim>,
    TypedEnum<ethtool_c33_pse_ext_substate_option_vport_lim, Integer>
    {
        ETHTOOL_C33_PSE_EXT_SUBSTATE_OPTION_VPORT_LIM_HIGH_VOLTAGE,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_OPTION_VPORT_LIM_LOW_VOLTAGE,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_OPTION_VPORT_LIM_VOLTAGE_INJECTION;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_ext_substate_option_detect_ted")
    public static enum ethtool_c33_pse_ext_substate_option_detect_ted implements Enum<ethtool_c33_pse_ext_substate_option_detect_ted>,
    TypedEnum<ethtool_c33_pse_ext_substate_option_detect_ted, Integer>
    {
        ETHTOOL_C33_PSE_EXT_SUBSTATE_OPTION_DETECT_TED_DET_IN_PROCESS,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_OPTION_DETECT_TED_CONNECTION_CHECK_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_ext_substate_mr_pse_enable")
    public static enum ethtool_c33_pse_ext_substate_mr_pse_enable implements Enum<ethtool_c33_pse_ext_substate_mr_pse_enable>,
    TypedEnum<ethtool_c33_pse_ext_substate_mr_pse_enable, Integer>
    {
        ETHTOOL_C33_PSE_EXT_SUBSTATE_MR_PSE_ENABLE_DISABLE_PIN_ACTIVE;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_ext_substate_error_condition")
    public static enum ethtool_c33_pse_ext_substate_error_condition implements Enum<ethtool_c33_pse_ext_substate_error_condition>,
    TypedEnum<ethtool_c33_pse_ext_substate_error_condition, Integer>
    {
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_NON_EXISTING_PORT,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_UNDEFINED_PORT,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_INTERNAL_HW_FAULT,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_COMM_ERROR_AFTER_FORCE_ON,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_UNKNOWN_PORT_STATUS,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_HOST_CRASH_TURN_OFF,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_HOST_CRASH_FORCE_SHUTDOWN,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_CONFIG_CHANGE,
        ETHTOOL_C33_PSE_EXT_SUBSTATE_ERROR_CONDITION_DETECTED_OVER_TEMP;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_c33_pse_ext_state")
    public static enum ethtool_c33_pse_ext_state implements Enum<ethtool_c33_pse_ext_state>,
    TypedEnum<ethtool_c33_pse_ext_state, Integer>
    {
        ETHTOOL_C33_PSE_EXT_STATE_ERROR_CONDITION,
        ETHTOOL_C33_PSE_EXT_STATE_MR_MPS_VALID,
        ETHTOOL_C33_PSE_EXT_STATE_MR_PSE_ENABLE,
        ETHTOOL_C33_PSE_EXT_STATE_OPTION_DETECT_TED,
        ETHTOOL_C33_PSE_EXT_STATE_OPTION_VPORT_LIM,
        ETHTOOL_C33_PSE_EXT_STATE_OVLD_DETECTED,
        ETHTOOL_C33_PSE_EXT_STATE_PD_DLL_POWER_TYPE,
        ETHTOOL_C33_PSE_EXT_STATE_POWER_NOT_AVAILABLE,
        ETHTOOL_C33_PSE_EXT_STATE_SHORT_DETECTED;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_cmis_cdb_cmd_args")
    @NotUsableInJava
    public static class ethtool_cmis_cdb_cmd_args
    extends Struct {
        public ethtool_cmis_cdb_request req;
        public @Unsigned short max_duration;
        public char read_write_len_ext;
        public char msleep_pre_rpl;
        public char rpl_exp_len;
        public char flags;
        public String err_msg;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_cmis_cdb_request")
    @NotUsableInJava
    public static class ethtool_cmis_cdb_request
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short id;
        @InlineUnion(value=25359)
        public  @InlineUnion(value=25359) AnonDefinitions.anon_member_of_anon_member_of_ethtool_cmis_cdb_request_and_body_of_anon_member_of_ethtool_cmis_cdb_request anon1$0;
        @InlineUnion(value=25359)
        public  @InlineUnion(value=25359) AnonDefinitions.anon_member_of_anon_member_of_ethtool_cmis_cdb_request_and_body_of_anon_member_of_ethtool_cmis_cdb_request body;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_cmis_cdb_cmd_id")
    public static enum ethtool_cmis_cdb_cmd_id implements Enum<ethtool_cmis_cdb_cmd_id>,
    TypedEnum<ethtool_cmis_cdb_cmd_id, Integer>
    {
        ETHTOOL_CMIS_CDB_CMD_QUERY_STATUS,
        ETHTOOL_CMIS_CDB_CMD_MODULE_FEATURES,
        ETHTOOL_CMIS_CDB_CMD_FW_MANAGMENT_FEATURES,
        ETHTOOL_CMIS_CDB_CMD_START_FW_DOWNLOAD,
        ETHTOOL_CMIS_CDB_CMD_WRITE_FW_BLOCK_LPL,
        ETHTOOL_CMIS_CDB_CMD_COMPLETE_FW_DOWNLOAD,
        ETHTOOL_CMIS_CDB_CMD_RUN_FW_IMAGE,
        ETHTOOL_CMIS_CDB_CMD_COMMIT_FW_IMAGE;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_cmis_cdb")
    @NotUsableInJava
    public static class ethtool_cmis_cdb
    extends Struct {
        public char cmis_rev;
        public char read_write_len_ext;
        public @Unsigned short max_completion_time;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_cmis_fw_update_params")
    @NotUsableInJava
    public static class ethtool_cmis_fw_update_params
    extends Struct {
        public Ptr<NetDefinitions.net_device> dev;
        public ethtool_module_fw_flash_params params;
        public EthnlDefinitions.ethnl_module_fw_flash_ntf_params ntf_params;
        public Ptr<runtime.firmware> fw;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_module_fw_flash_params")
    @NotUsableInJava
    public static class ethtool_module_fw_flash_params
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int password;
        public char password_valid;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_reset_flags")
    public static enum ethtool_reset_flags implements Enum<ethtool_reset_flags>,
    TypedEnum<ethtool_reset_flags, Integer>
    {
        ETH_RESET_MGMT,
        ETH_RESET_IRQ,
        ETH_RESET_DMA,
        ETH_RESET_FILTER,
        ETH_RESET_OFFLOAD,
        ETH_RESET_MAC,
        ETH_RESET_PHY,
        ETH_RESET_RAM,
        ETH_RESET_AP,
        ETH_RESET_DEDICATED,
        ETH_RESET_ALL;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_supported_ring_param")
    public static enum ethtool_supported_ring_param implements Enum<ethtool_supported_ring_param>,
    TypedEnum<ethtool_supported_ring_param, Integer>
    {
        ETHTOOL_RING_USE_RX_BUF_LEN,
        ETHTOOL_RING_USE_CQE_SIZE,
        ETHTOOL_RING_USE_TX_PUSH,
        ETHTOOL_RING_USE_RX_PUSH,
        ETHTOOL_RING_USE_TX_PUSH_BUF_LEN,
        ETHTOOL_RING_USE_TCP_DATA_SPLIT;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_header_flags")
    public static enum ethtool_header_flags implements Enum<ethtool_header_flags>,
    TypedEnum<ethtool_header_flags, Integer>
    {
        ETHTOOL_FLAG_COMPACT_BITSETS,
        ETHTOOL_FLAG_OMIT_REPLY,
        ETHTOOL_FLAG_STATS;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_forced_speed_map")
    @NotUsableInJava
    public static class ethtool_forced_speed_map
    extends Struct {
        public @Unsigned int speed;
        public @Unsigned long @Size(value=2) [] caps;
        public Ptr<@Unsigned Integer> cap_arr;
        public @Unsigned int arr_size;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_cmd")
    @NotUsableInJava
    public static class ethtool_cmd
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int supported;
        public @Unsigned int advertising;
        public @Unsigned short speed;
        public char duplex;
        public char port;
        public char phy_address;
        public char transceiver;
        public char autoneg;
        public char mdio_support;
        public @Unsigned int maxtxpkt;
        public @Unsigned int maxrxpkt;
        public @Unsigned short speed_hi;
        public char eth_tp_mdix;
        public char eth_tp_mdix_ctrl;
        public @Unsigned int lp_advertising;
        public @Unsigned int @Size(value=2) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_stringset")
    public static enum ethtool_stringset implements Enum<ethtool_stringset>,
    TypedEnum<ethtool_stringset, Integer>
    {
        ETH_SS_TEST,
        ETH_SS_STATS,
        ETH_SS_PRIV_FLAGS,
        ETH_SS_NTUPLE_FILTERS,
        ETH_SS_FEATURES,
        ETH_SS_RSS_HASH_FUNCS,
        ETH_SS_TUNABLES,
        ETH_SS_PHY_STATS,
        ETH_SS_PHY_TUNABLES,
        ETH_SS_LINK_MODES,
        ETH_SS_MSG_CLASSES,
        ETH_SS_WOL_MODES,
        ETH_SS_SOF_TIMESTAMPING,
        ETH_SS_TS_TX_TYPES,
        ETH_SS_TS_RX_FILTERS,
        ETH_SS_UDP_TUNNEL_TYPES,
        ETH_SS_STATS_STD,
        ETH_SS_STATS_ETH_PHY,
        ETH_SS_STATS_ETH_MAC,
        ETH_SS_STATS_ETH_CTRL,
        ETH_SS_STATS_RMON,
        ETH_SS_COUNT;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_phy_ops")
    @NotUsableInJava
    public static class ethtool_phy_ops
    extends Struct {
        public Ptr<?> get_sset_count;
        public Ptr<?> get_strings;
        public Ptr<?> get_stats;
        public Ptr<?> get_plca_cfg;
        public Ptr<?> set_plca_cfg;
        public Ptr<?> get_plca_status;
        public Ptr<?> start_cable_test;
        public Ptr<?> start_cable_test_tdr;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_netdev_state")
    @NotUsableInJava
    public static class ethtool_netdev_state
    extends Struct {
        public runtime.xarray rss_ctx;
        public runtime.mutex rss_lock;
        public @Unsigned int wol_enabled;
        public @Unsigned int module_fw_flash_in_progress;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rxfh_param")
    @NotUsableInJava
    public static class ethtool_rxfh_param
    extends Struct {
        public char hfunc;
        public @Unsigned int indir_size;
        public Ptr<@Unsigned Integer> indir;
        public @Unsigned int key_size;
        public Ptr<Character> key;
        public @Unsigned int rss_context;
        public char rss_delete;
        public char input_xfrm;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_mm_stats")
    @NotUsableInJava
    public static class ethtool_mm_stats
    extends Struct {
        public @Unsigned long MACMergeFrameAssErrorCount;
        public @Unsigned long MACMergeFrameSmdErrorCount;
        public @Unsigned long MACMergeFrameAssOkCount;
        public @Unsigned long MACMergeFragCountRx;
        public @Unsigned long MACMergeFragCountTx;
        public @Unsigned long MACMergeHoldCount;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_mm_cfg")
    @NotUsableInJava
    public static class ethtool_mm_cfg
    extends Struct {
        public @Unsigned int verify_time;
        public boolean verify_enabled;
        public boolean tx_enabled;
        public boolean pmac_enabled;
        public @Unsigned int tx_min_frag_size;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_mm_state")
    @NotUsableInJava
    public static class ethtool_mm_state
    extends Struct {
        public @Unsigned int verify_time;
        public @Unsigned int max_verify_time;
        public ethtool_mm_verify_status verify_status;
        public boolean tx_enabled;
        public boolean tx_active;
        public boolean pmac_enabled;
        public boolean verify_enabled;
        public @Unsigned int tx_min_frag_size;
        public @Unsigned int rx_min_frag_size;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_module_power_mode_params")
    @NotUsableInJava
    public static class ethtool_module_power_mode_params
    extends Struct {
        public ethtool_module_power_mode_policy policy;
        public ethtool_module_power_mode mode;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_module_eeprom")
    @NotUsableInJava
    public static class ethtool_module_eeprom
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int length;
        public char page;
        public char bank;
        public char i2c_address;
        public Ptr<Character> data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_ts_stats")
    @NotUsableInJava
    public static class ethtool_ts_stats
    extends Struct {
        @InlineUnion(value=12390)
        public  @InlineUnion(value=12390) AnonDefinitions.anon_member_of_anon_member_of_ethtool_ts_stats_and_tx_stats_of_anon_member_of_ethtool_ts_stats anon0$0;
        @InlineUnion(value=12390)
        public  @InlineUnion(value=12390) AnonDefinitions.anon_member_of_anon_member_of_ethtool_ts_stats_and_tx_stats_of_anon_member_of_ethtool_ts_stats tx_stats;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rmon_stats")
    @NotUsableInJava
    public static class ethtool_rmon_stats
    extends Struct {
        public ethtool_mac_stats_src src;
        @InlineUnion(value=12387)
        public  @InlineUnion(value=12387) AnonDefinitions.anon_member_of_anon_member_of_ethtool_rmon_stats_and_stats_of_anon_member_of_ethtool_rmon_stats anon1$0;
        @InlineUnion(value=12387)
        public  @InlineUnion(value=12387) AnonDefinitions.anon_member_of_anon_member_of_ethtool_rmon_stats_and_stats_of_anon_member_of_ethtool_rmon_stats stats;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rmon_hist_range")
    @NotUsableInJava
    public static class ethtool_rmon_hist_range
    extends Struct {
        public @Unsigned short low;
        public @Unsigned short high;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_fec_stats")
    @NotUsableInJava
    public static class ethtool_fec_stats
    extends Struct {
        public ethtool_fec_stat corrected_blocks;
        public ethtool_fec_stat uncorrectable_blocks;
        public ethtool_fec_stat corrected_bits;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_fec_stat")
    @NotUsableInJava
    public static class ethtool_fec_stat
    extends Struct {
        public @Unsigned long total;
        public @Unsigned long @Size(value=8) [] lanes;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_pause_stats")
    @NotUsableInJava
    public static class ethtool_pause_stats
    extends Struct {
        public ethtool_mac_stats_src src;
        @InlineUnion(value=12380)
        public  @InlineUnion(value=12380) AnonDefinitions.anon_member_of_anon_member_of_ethtool_pause_stats_and_stats_of_anon_member_of_ethtool_pause_stats anon1$0;
        @InlineUnion(value=12380)
        public  @InlineUnion(value=12380) AnonDefinitions.anon_member_of_anon_member_of_ethtool_pause_stats_and_stats_of_anon_member_of_ethtool_pause_stats stats;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_eth_ctrl_stats")
    @NotUsableInJava
    public static class ethtool_eth_ctrl_stats
    extends Struct {
        public ethtool_mac_stats_src src;
        @InlineUnion(value=12377)
        public  @InlineUnion(value=12377) AnonDefinitions.anon_member_of_anon_member_of_ethtool_eth_ctrl_stats_and_stats_of_anon_member_of_ethtool_eth_ctrl_stats anon1$0;
        @InlineUnion(value=12377)
        public  @InlineUnion(value=12377) AnonDefinitions.anon_member_of_anon_member_of_ethtool_eth_ctrl_stats_and_stats_of_anon_member_of_ethtool_eth_ctrl_stats stats;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_eth_phy_stats")
    @NotUsableInJava
    public static class ethtool_eth_phy_stats
    extends Struct {
        public ethtool_mac_stats_src src;
        @InlineUnion(value=12374)
        public  @InlineUnion(value=12374) AnonDefinitions.anon_member_of_anon_member_of_ethtool_eth_phy_stats_and_stats_of_anon_member_of_ethtool_eth_phy_stats anon1$0;
        @InlineUnion(value=12374)
        public  @InlineUnion(value=12374) AnonDefinitions.anon_member_of_anon_member_of_ethtool_eth_phy_stats_and_stats_of_anon_member_of_ethtool_eth_phy_stats stats;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_eth_mac_stats")
    @NotUsableInJava
    public static class ethtool_eth_mac_stats
    extends Struct {
        public ethtool_mac_stats_src src;
        @InlineUnion(value=12371)
        public  @InlineUnion(value=12371) AnonDefinitions.anon_member_of_anon_member_of_ethtool_eth_mac_stats_and_stats_of_anon_member_of_ethtool_eth_mac_stats anon1$0;
        @InlineUnion(value=12371)
        public  @InlineUnion(value=12371) AnonDefinitions.anon_member_of_anon_member_of_ethtool_eth_mac_stats_and_stats_of_anon_member_of_ethtool_eth_mac_stats stats;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_keee")
    @NotUsableInJava
    public static class ethtool_keee
    extends Struct {
        public @Unsigned long @Size(value=2) [] supported;
        public @Unsigned long @Size(value=2) [] advertised;
        public @Unsigned long @Size(value=2) [] lp_advertised;
        public @Unsigned int tx_lpi_timer;
        public boolean tx_lpi_enabled;
        public boolean eee_active;
        public boolean eee_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_link_ksettings")
    @NotUsableInJava
    public static class ethtool_link_ksettings
    extends Struct {
        public ethtool_link_settings base;
        public LinkDefinitions.link_modes_of_ethtool_link_ksettings link_modes;
        public @Unsigned int lanes;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rxfh_context")
    @NotUsableInJava
    public static class ethtool_rxfh_context
    extends Struct {
        public @Unsigned int indir_size;
        public @Unsigned int key_size;
        public @Unsigned short priv_size;
        public char hfunc;
        public char input_xfrm;
        public char indir_configured;
        public char key_configured;
        public @Unsigned int key_off;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_link_ext_stats")
    @NotUsableInJava
    public static class ethtool_link_ext_stats
    extends Struct {
        public @Unsigned long link_down_events;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_link_ext_state_info")
    @NotUsableInJava
    public static class ethtool_link_ext_state_info
    extends Struct {
        public ethtool_link_ext_state link_ext_state;
        @InlineUnion(value=12361)
        public @InlineUnion(value=12361) ethtool_link_ext_substate_autoneg autoneg;
        @InlineUnion(value=12361)
        public @InlineUnion(value=12361) ethtool_link_ext_substate_link_training link_training;
        @InlineUnion(value=12361)
        public @InlineUnion(value=12361) ethtool_link_ext_substate_link_logical_mismatch link_logical_mismatch;
        @InlineUnion(value=12361)
        public @InlineUnion(value=12361) ethtool_link_ext_substate_bad_signal_integrity bad_signal_integrity;
        @InlineUnion(value=12361)
        public @InlineUnion(value=12361) ethtool_link_ext_substate_cable_issue cable_issue;
        @InlineUnion(value=12361)
        public @InlineUnion(value=12361) ethtool_link_ext_substate_module module;
        @InlineUnion(value=12361)
        public @InlineUnion(value=12361) @Unsigned int __link_ext_substate;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_phys_id_state")
    public static enum ethtool_phys_id_state implements Enum<ethtool_phys_id_state>,
    TypedEnum<ethtool_phys_id_state, Integer>
    {
        ETHTOOL_ID_INACTIVE,
        ETHTOOL_ID_ACTIVE,
        ETHTOOL_ID_ON,
        ETHTOOL_ID_OFF;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_link_settings")
    @NotUsableInJava
    public static class ethtool_link_settings
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int speed;
        public char duplex;
        public char port;
        public char phy_address;
        public char autoneg;
        public char mdio_support;
        public char eth_tp_mdix;
        public char eth_tp_mdix_ctrl;
        public byte link_mode_masks_nwords;
        public char transceiver;
        public char master_slave_cfg;
        public char master_slave_state;
        public char rate_matching;
        public @Unsigned int @Size(value=7) [] reserved;
        public @Unsigned int @Size(value=0) [] link_mode_masks;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_link_mode_bit_indices")
    public static enum ethtool_link_mode_bit_indices implements Enum<ethtool_link_mode_bit_indices>,
    TypedEnum<ethtool_link_mode_bit_indices, Integer>
    {
        ETHTOOL_LINK_MODE_10baseT_Half_BIT,
        ETHTOOL_LINK_MODE_10baseT_Full_BIT,
        ETHTOOL_LINK_MODE_100baseT_Half_BIT,
        ETHTOOL_LINK_MODE_100baseT_Full_BIT,
        ETHTOOL_LINK_MODE_1000baseT_Half_BIT,
        ETHTOOL_LINK_MODE_1000baseT_Full_BIT,
        ETHTOOL_LINK_MODE_Autoneg_BIT,
        ETHTOOL_LINK_MODE_TP_BIT,
        ETHTOOL_LINK_MODE_AUI_BIT,
        ETHTOOL_LINK_MODE_MII_BIT,
        ETHTOOL_LINK_MODE_FIBRE_BIT,
        ETHTOOL_LINK_MODE_BNC_BIT,
        ETHTOOL_LINK_MODE_10000baseT_Full_BIT,
        ETHTOOL_LINK_MODE_Pause_BIT,
        ETHTOOL_LINK_MODE_Asym_Pause_BIT,
        ETHTOOL_LINK_MODE_2500baseX_Full_BIT,
        ETHTOOL_LINK_MODE_Backplane_BIT,
        ETHTOOL_LINK_MODE_1000baseKX_Full_BIT,
        ETHTOOL_LINK_MODE_10000baseKX4_Full_BIT,
        ETHTOOL_LINK_MODE_10000baseKR_Full_BIT,
        ETHTOOL_LINK_MODE_10000baseR_FEC_BIT,
        ETHTOOL_LINK_MODE_20000baseMLD2_Full_BIT,
        ETHTOOL_LINK_MODE_20000baseKR2_Full_BIT,
        ETHTOOL_LINK_MODE_40000baseKR4_Full_BIT,
        ETHTOOL_LINK_MODE_40000baseCR4_Full_BIT,
        ETHTOOL_LINK_MODE_40000baseSR4_Full_BIT,
        ETHTOOL_LINK_MODE_40000baseLR4_Full_BIT,
        ETHTOOL_LINK_MODE_56000baseKR4_Full_BIT,
        ETHTOOL_LINK_MODE_56000baseCR4_Full_BIT,
        ETHTOOL_LINK_MODE_56000baseSR4_Full_BIT,
        ETHTOOL_LINK_MODE_56000baseLR4_Full_BIT,
        ETHTOOL_LINK_MODE_25000baseCR_Full_BIT,
        ETHTOOL_LINK_MODE_25000baseKR_Full_BIT,
        ETHTOOL_LINK_MODE_25000baseSR_Full_BIT,
        ETHTOOL_LINK_MODE_50000baseCR2_Full_BIT,
        ETHTOOL_LINK_MODE_50000baseKR2_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseKR4_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseSR4_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseCR4_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseLR4_ER4_Full_BIT,
        ETHTOOL_LINK_MODE_50000baseSR2_Full_BIT,
        ETHTOOL_LINK_MODE_1000baseX_Full_BIT,
        ETHTOOL_LINK_MODE_10000baseCR_Full_BIT,
        ETHTOOL_LINK_MODE_10000baseSR_Full_BIT,
        ETHTOOL_LINK_MODE_10000baseLR_Full_BIT,
        ETHTOOL_LINK_MODE_10000baseLRM_Full_BIT,
        ETHTOOL_LINK_MODE_10000baseER_Full_BIT,
        ETHTOOL_LINK_MODE_2500baseT_Full_BIT,
        ETHTOOL_LINK_MODE_5000baseT_Full_BIT,
        ETHTOOL_LINK_MODE_FEC_NONE_BIT,
        ETHTOOL_LINK_MODE_FEC_RS_BIT,
        ETHTOOL_LINK_MODE_FEC_BASER_BIT,
        ETHTOOL_LINK_MODE_50000baseKR_Full_BIT,
        ETHTOOL_LINK_MODE_50000baseSR_Full_BIT,
        ETHTOOL_LINK_MODE_50000baseCR_Full_BIT,
        ETHTOOL_LINK_MODE_50000baseLR_ER_FR_Full_BIT,
        ETHTOOL_LINK_MODE_50000baseDR_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseKR2_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseSR2_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseCR2_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseLR2_ER2_FR2_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseDR2_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseKR4_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseSR4_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseLR4_ER4_FR4_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseDR4_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseCR4_Full_BIT,
        ETHTOOL_LINK_MODE_100baseT1_Full_BIT,
        ETHTOOL_LINK_MODE_1000baseT1_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseKR8_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseSR8_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseLR8_ER8_FR8_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseDR8_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseCR8_Full_BIT,
        ETHTOOL_LINK_MODE_FEC_LLRS_BIT,
        ETHTOOL_LINK_MODE_100000baseKR_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseSR_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseLR_ER_FR_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseCR_Full_BIT,
        ETHTOOL_LINK_MODE_100000baseDR_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseKR2_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseSR2_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseLR2_ER2_FR2_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseDR2_Full_BIT,
        ETHTOOL_LINK_MODE_200000baseCR2_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseKR4_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseSR4_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseLR4_ER4_FR4_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseDR4_Full_BIT,
        ETHTOOL_LINK_MODE_400000baseCR4_Full_BIT,
        ETHTOOL_LINK_MODE_100baseFX_Half_BIT,
        ETHTOOL_LINK_MODE_100baseFX_Full_BIT,
        ETHTOOL_LINK_MODE_10baseT1L_Full_BIT,
        ETHTOOL_LINK_MODE_800000baseCR8_Full_BIT,
        ETHTOOL_LINK_MODE_800000baseKR8_Full_BIT,
        ETHTOOL_LINK_MODE_800000baseDR8_Full_BIT,
        ETHTOOL_LINK_MODE_800000baseDR8_2_Full_BIT,
        ETHTOOL_LINK_MODE_800000baseSR8_Full_BIT,
        ETHTOOL_LINK_MODE_800000baseVR8_Full_BIT,
        ETHTOOL_LINK_MODE_10baseT1S_Full_BIT,
        ETHTOOL_LINK_MODE_10baseT1S_Half_BIT,
        ETHTOOL_LINK_MODE_10baseT1S_P2MP_Half_BIT,
        ETHTOOL_LINK_MODE_10baseT1BRR_Full_BIT,
        __ETHTOOL_LINK_MODE_MASK_NBITS;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_fecparam")
    @NotUsableInJava
    public static class ethtool_fecparam
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int active_fec;
        public @Unsigned int fec;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_dump")
    @NotUsableInJava
    public static class ethtool_dump
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int version;
        public @Unsigned int flag;
        public @Unsigned int len;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_flash")
    @NotUsableInJava
    public static class ethtool_flash
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int region;
        public char @Size(value=128) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rxnfc")
    @NotUsableInJava
    public static class ethtool_rxnfc
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int flow_type;
        public @Unsigned long data;
        public ethtool_rx_flow_spec fs;
        @InlineUnion(value=12350)
        public @InlineUnion(value=12350) @Unsigned int rule_cnt;
        @InlineUnion(value=12350)
        public @InlineUnion(value=12350) @Unsigned int rss_context;
        public @Unsigned int @Size(value=0) [] rule_locs;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_rx_flow_spec")
    @NotUsableInJava
    public static class ethtool_rx_flow_spec
    extends Struct {
        public @Unsigned int flow_type;
        public ethtool_flow_union h_u;
        public ethtool_flow_ext h_ext;
        public ethtool_flow_union m_u;
        public ethtool_flow_ext m_ext;
        public @Unsigned long ring_cookie;
        public @Unsigned int location;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_flow_ext")
    @NotUsableInJava
    public static class ethtool_flow_ext
    extends Struct {
        public char @Size(value=2) [] padding;
        public char @Size(value=6) [] h_dest;
        public @Unsigned @OriginalName(value="__be16") short vlan_etype;
        public @Unsigned @OriginalName(value="__be16") short vlan_tci;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=2) [] data;
    }

    @Type(noCCodeGeneration=true, cType="union ethtool_flow_union")
    @NotUsableInJava
    public static class ethtool_flow_union
    extends Union {
        public ethtool_tcpip4_spec tcp_ip4_spec;
        public ethtool_tcpip4_spec udp_ip4_spec;
        public ethtool_tcpip4_spec sctp_ip4_spec;
        public ethtool_ah_espip4_spec ah_ip4_spec;
        public ethtool_ah_espip4_spec esp_ip4_spec;
        public ethtool_usrip4_spec usr_ip4_spec;
        public ethtool_tcpip6_spec tcp_ip6_spec;
        public ethtool_tcpip6_spec udp_ip6_spec;
        public ethtool_tcpip6_spec sctp_ip6_spec;
        public ethtool_ah_espip6_spec ah_ip6_spec;
        public ethtool_ah_espip6_spec esp_ip6_spec;
        public ethtool_usrip6_spec usr_ip6_spec;
        public ethhdr ether_spec;
        public char @Size(value=52) [] hdata;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_usrip6_spec")
    @NotUsableInJava
    public static class ethtool_usrip6_spec
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] ip6src;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] ip6dst;
        public @Unsigned @OriginalName(value="__be32") int l4_4_bytes;
        public char tclass;
        public char l4_proto;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_ah_espip6_spec")
    @NotUsableInJava
    public static class ethtool_ah_espip6_spec
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] ip6src;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] ip6dst;
        public @Unsigned @OriginalName(value="__be32") int spi;
        public char tclass;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_tcpip6_spec")
    @NotUsableInJava
    public static class ethtool_tcpip6_spec
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] ip6src;
        public @Unsigned @OriginalName(value="__be32") int @Size(value=4) [] ip6dst;
        public @Unsigned @OriginalName(value="__be16") short psrc;
        public @Unsigned @OriginalName(value="__be16") short pdst;
        public char tclass;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_usrip4_spec")
    @NotUsableInJava
    public static class ethtool_usrip4_spec
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int ip4src;
        public @Unsigned @OriginalName(value="__be32") int ip4dst;
        public @Unsigned @OriginalName(value="__be32") int l4_4_bytes;
        public char tos;
        public char ip_ver;
        public char proto;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_ah_espip4_spec")
    @NotUsableInJava
    public static class ethtool_ah_espip4_spec
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int ip4src;
        public @Unsigned @OriginalName(value="__be32") int ip4dst;
        public @Unsigned @OriginalName(value="__be32") int spi;
        public char tos;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_tcpip4_spec")
    @NotUsableInJava
    public static class ethtool_tcpip4_spec
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int ip4src;
        public @Unsigned @OriginalName(value="__be32") int ip4dst;
        public @Unsigned @OriginalName(value="__be16") short psrc;
        public @Unsigned @OriginalName(value="__be16") short pdst;
        public char tos;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_stats")
    @NotUsableInJava
    public static class ethtool_stats
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int n_stats;
        public @Unsigned long @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_test")
    @NotUsableInJava
    public static class ethtool_test
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int flags;
        public @Unsigned int reserved;
        public @Unsigned int len;
        public @Unsigned long @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_mm_verify_status")
    public static enum ethtool_mm_verify_status implements Enum<ethtool_mm_verify_status>,
    TypedEnum<ethtool_mm_verify_status, Integer>
    {
        ETHTOOL_MM_VERIFY_STATUS_UNKNOWN,
        ETHTOOL_MM_VERIFY_STATUS_INITIAL,
        ETHTOOL_MM_VERIFY_STATUS_VERIFYING,
        ETHTOOL_MM_VERIFY_STATUS_SUCCEEDED,
        ETHTOOL_MM_VERIFY_STATUS_FAILED,
        ETHTOOL_MM_VERIFY_STATUS_DISABLED;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_module_power_mode")
    public static enum ethtool_module_power_mode implements Enum<ethtool_module_power_mode>,
    TypedEnum<ethtool_module_power_mode, Integer>
    {
        ETHTOOL_MODULE_POWER_MODE_LOW,
        ETHTOOL_MODULE_POWER_MODE_HIGH;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_module_power_mode_policy")
    public static enum ethtool_module_power_mode_policy implements Enum<ethtool_module_power_mode_policy>,
    TypedEnum<ethtool_module_power_mode_policy, Integer>
    {
        ETHTOOL_MODULE_POWER_MODE_POLICY_HIGH,
        ETHTOOL_MODULE_POWER_MODE_POLICY_AUTO;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_mac_stats_src")
    public static enum ethtool_mac_stats_src implements Enum<ethtool_mac_stats_src>,
    TypedEnum<ethtool_mac_stats_src, Integer>
    {
        ETHTOOL_MAC_STATS_SRC_AGGREGATE,
        ETHTOOL_MAC_STATS_SRC_EMAC,
        ETHTOOL_MAC_STATS_SRC_PMAC;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_link_ext_substate_module")
    public static enum ethtool_link_ext_substate_module implements Enum<ethtool_link_ext_substate_module>,
    TypedEnum<ethtool_link_ext_substate_module, Integer>
    {
        ETHTOOL_LINK_EXT_SUBSTATE_MODULE_CMIS_NOT_READY;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_link_ext_substate_cable_issue")
    public static enum ethtool_link_ext_substate_cable_issue implements Enum<ethtool_link_ext_substate_cable_issue>,
    TypedEnum<ethtool_link_ext_substate_cable_issue, Integer>
    {
        ETHTOOL_LINK_EXT_SUBSTATE_CI_UNSUPPORTED_CABLE,
        ETHTOOL_LINK_EXT_SUBSTATE_CI_CABLE_TEST_FAILURE;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_link_ext_substate_bad_signal_integrity")
    public static enum ethtool_link_ext_substate_bad_signal_integrity implements Enum<ethtool_link_ext_substate_bad_signal_integrity>,
    TypedEnum<ethtool_link_ext_substate_bad_signal_integrity, Integer>
    {
        ETHTOOL_LINK_EXT_SUBSTATE_BSI_LARGE_NUMBER_OF_PHYSICAL_ERRORS,
        ETHTOOL_LINK_EXT_SUBSTATE_BSI_UNSUPPORTED_RATE,
        ETHTOOL_LINK_EXT_SUBSTATE_BSI_SERDES_REFERENCE_CLOCK_LOST,
        ETHTOOL_LINK_EXT_SUBSTATE_BSI_SERDES_ALOS;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_link_ext_substate_link_logical_mismatch")
    public static enum ethtool_link_ext_substate_link_logical_mismatch implements Enum<ethtool_link_ext_substate_link_logical_mismatch>,
    TypedEnum<ethtool_link_ext_substate_link_logical_mismatch, Integer>
    {
        ETHTOOL_LINK_EXT_SUBSTATE_LLM_PCS_DID_NOT_ACQUIRE_BLOCK_LOCK,
        ETHTOOL_LINK_EXT_SUBSTATE_LLM_PCS_DID_NOT_ACQUIRE_AM_LOCK,
        ETHTOOL_LINK_EXT_SUBSTATE_LLM_PCS_DID_NOT_GET_ALIGN_STATUS,
        ETHTOOL_LINK_EXT_SUBSTATE_LLM_FC_FEC_IS_NOT_LOCKED,
        ETHTOOL_LINK_EXT_SUBSTATE_LLM_RS_FEC_IS_NOT_LOCKED;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_link_ext_substate_link_training")
    public static enum ethtool_link_ext_substate_link_training implements Enum<ethtool_link_ext_substate_link_training>,
    TypedEnum<ethtool_link_ext_substate_link_training, Integer>
    {
        ETHTOOL_LINK_EXT_SUBSTATE_LT_KR_FRAME_LOCK_NOT_ACQUIRED,
        ETHTOOL_LINK_EXT_SUBSTATE_LT_KR_LINK_INHIBIT_TIMEOUT,
        ETHTOOL_LINK_EXT_SUBSTATE_LT_KR_LINK_PARTNER_DID_NOT_SET_RECEIVER_READY,
        ETHTOOL_LINK_EXT_SUBSTATE_LT_REMOTE_FAULT;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_link_ext_substate_autoneg")
    public static enum ethtool_link_ext_substate_autoneg implements Enum<ethtool_link_ext_substate_autoneg>,
    TypedEnum<ethtool_link_ext_substate_autoneg, Integer>
    {
        ETHTOOL_LINK_EXT_SUBSTATE_AN_NO_PARTNER_DETECTED,
        ETHTOOL_LINK_EXT_SUBSTATE_AN_ACK_NOT_RECEIVED,
        ETHTOOL_LINK_EXT_SUBSTATE_AN_NEXT_PAGE_EXCHANGE_FAILED,
        ETHTOOL_LINK_EXT_SUBSTATE_AN_NO_PARTNER_DETECTED_FORCE_MODE,
        ETHTOOL_LINK_EXT_SUBSTATE_AN_FEC_MISMATCH_DURING_OVERRIDE,
        ETHTOOL_LINK_EXT_SUBSTATE_AN_NO_HCD;

    }

    @Type(noCCodeGeneration=true, cType="enum ethtool_link_ext_state")
    public static enum ethtool_link_ext_state implements Enum<ethtool_link_ext_state>,
    TypedEnum<ethtool_link_ext_state, Integer>
    {
        ETHTOOL_LINK_EXT_STATE_AUTONEG,
        ETHTOOL_LINK_EXT_STATE_LINK_TRAINING_FAILURE,
        ETHTOOL_LINK_EXT_STATE_LINK_LOGICAL_MISMATCH,
        ETHTOOL_LINK_EXT_STATE_BAD_SIGNAL_INTEGRITY,
        ETHTOOL_LINK_EXT_STATE_NO_CABLE,
        ETHTOOL_LINK_EXT_STATE_CABLE_ISSUE,
        ETHTOOL_LINK_EXT_STATE_EEPROM_ISSUE,
        ETHTOOL_LINK_EXT_STATE_CALIBRATION_FAILURE,
        ETHTOOL_LINK_EXT_STATE_POWER_BUDGET_EXCEEDED,
        ETHTOOL_LINK_EXT_STATE_OVERHEAT,
        ETHTOOL_LINK_EXT_STATE_MODULE;

    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_pauseparam")
    @NotUsableInJava
    public static class ethtool_pauseparam
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int autoneg;
        public @Unsigned int rx_pause;
        public @Unsigned int tx_pause;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_channels")
    @NotUsableInJava
    public static class ethtool_channels
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int max_rx;
        public @Unsigned int max_tx;
        public @Unsigned int max_other;
        public @Unsigned int max_combined;
        public @Unsigned int rx_count;
        public @Unsigned int tx_count;
        public @Unsigned int other_count;
        public @Unsigned int combined_count;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_ringparam")
    @NotUsableInJava
    public static class ethtool_ringparam
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int rx_max_pending;
        public @Unsigned int rx_mini_max_pending;
        public @Unsigned int rx_jumbo_max_pending;
        public @Unsigned int tx_max_pending;
        public @Unsigned int rx_pending;
        public @Unsigned int rx_mini_pending;
        public @Unsigned int rx_jumbo_pending;
        public @Unsigned int tx_pending;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_coalesce")
    @NotUsableInJava
    public static class ethtool_coalesce
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int rx_coalesce_usecs;
        public @Unsigned int rx_max_coalesced_frames;
        public @Unsigned int rx_coalesce_usecs_irq;
        public @Unsigned int rx_max_coalesced_frames_irq;
        public @Unsigned int tx_coalesce_usecs;
        public @Unsigned int tx_max_coalesced_frames;
        public @Unsigned int tx_coalesce_usecs_irq;
        public @Unsigned int tx_max_coalesced_frames_irq;
        public @Unsigned int stats_block_coalesce_usecs;
        public @Unsigned int use_adaptive_rx_coalesce;
        public @Unsigned int use_adaptive_tx_coalesce;
        public @Unsigned int pkt_rate_low;
        public @Unsigned int rx_coalesce_usecs_low;
        public @Unsigned int rx_max_coalesced_frames_low;
        public @Unsigned int tx_coalesce_usecs_low;
        public @Unsigned int tx_max_coalesced_frames_low;
        public @Unsigned int pkt_rate_high;
        public @Unsigned int rx_coalesce_usecs_high;
        public @Unsigned int rx_max_coalesced_frames_high;
        public @Unsigned int tx_coalesce_usecs_high;
        public @Unsigned int tx_max_coalesced_frames_high;
        public @Unsigned int rate_sample_interval;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_modinfo")
    @NotUsableInJava
    public static class ethtool_modinfo
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int type;
        public @Unsigned int eeprom_len;
        public @Unsigned int @Size(value=8) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_eeprom")
    @NotUsableInJava
    public static class ethtool_eeprom
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int magic;
        public @Unsigned int offset;
        public @Unsigned int len;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_regs")
    @NotUsableInJava
    public static class ethtool_regs
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int version;
        public @Unsigned int len;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_tunable")
    @NotUsableInJava
    public static class ethtool_tunable
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int id;
        public @Unsigned int type_id;
        public @Unsigned int len;
        public Ptr<?> @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_wolinfo")
    @NotUsableInJava
    public static class ethtool_wolinfo
    extends Struct {
        public @Unsigned int cmd;
        public @Unsigned int supported;
        public @Unsigned int wolopts;
        public char @Size(value=6) [] sopass;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_drvinfo")
    @NotUsableInJava
    public static class ethtool_drvinfo
    extends Struct {
        public @Unsigned int cmd;
        public char @Size(value=32) [] driver;
        public char @Size(value=32) [] version;
        public char @Size(value=32) [] fw_version;
        public char @Size(value=32) [] bus_info;
        public char @Size(value=32) [] erom_version;
        public char @Size(value=12) [] reserved2;
        public @Unsigned int n_priv_flags;
        public @Unsigned int n_stats;
        public @Unsigned int testinfo_len;
        public @Unsigned int eedump_len;
        public @Unsigned int regdump_len;
    }

    @Type(noCCodeGeneration=true, cType="struct ethtool_ops")
    @NotUsableInJava
    public static class ethtool_ops
    extends Struct {
        public @Unsigned int cap_link_lanes_supported;
        public @Unsigned int cap_rss_ctx_supported;
        public @Unsigned int cap_rss_sym_xor_supported;
        public @Unsigned int rxfh_per_ctx_key;
        public @Unsigned int rxfh_indir_space;
        public @Unsigned short rxfh_key_space;
        public @Unsigned short rxfh_priv_size;
        public @Unsigned int rxfh_max_num_contexts;
        public @Unsigned int supported_coalesce_params;
        public @Unsigned int supported_ring_params;
        public Ptr<?> get_drvinfo;
        public Ptr<?> get_regs_len;
        public Ptr<?> get_regs;
        public Ptr<?> get_wol;
        public Ptr<?> set_wol;
        public Ptr<?> get_msglevel;
        public Ptr<?> set_msglevel;
        public Ptr<?> nway_reset;
        public Ptr<?> get_link;
        public Ptr<?> get_link_ext_state;
        public Ptr<?> get_link_ext_stats;
        public Ptr<?> get_eeprom_len;
        public Ptr<?> get_eeprom;
        public Ptr<?> set_eeprom;
        public Ptr<?> get_coalesce;
        public Ptr<?> set_coalesce;
        public Ptr<?> get_ringparam;
        public Ptr<?> set_ringparam;
        public Ptr<?> get_pause_stats;
        public Ptr<?> get_pauseparam;
        public Ptr<?> set_pauseparam;
        public Ptr<?> self_test;
        public Ptr<?> get_strings;
        public Ptr<?> set_phys_id;
        public Ptr<?> get_ethtool_stats;
        public Ptr<?> begin;
        public Ptr<?> complete;
        public Ptr<?> get_priv_flags;
        public Ptr<?> set_priv_flags;
        public Ptr<?> get_sset_count;
        public Ptr<?> get_rxnfc;
        public Ptr<?> set_rxnfc;
        public Ptr<?> flash_device;
        public Ptr<?> reset;
        public Ptr<?> get_rxfh_key_size;
        public Ptr<?> get_rxfh_indir_size;
        public Ptr<?> get_rxfh;
        public Ptr<?> set_rxfh;
        public Ptr<?> create_rxfh_context;
        public Ptr<?> modify_rxfh_context;
        public Ptr<?> remove_rxfh_context;
        public Ptr<?> get_channels;
        public Ptr<?> set_channels;
        public Ptr<?> get_dump_flag;
        public Ptr<?> get_dump_data;
        public Ptr<?> set_dump;
        public Ptr<?> get_ts_info;
        public Ptr<?> get_ts_stats;
        public Ptr<?> get_module_info;
        public Ptr<?> get_module_eeprom;
        public Ptr<?> get_eee;
        public Ptr<?> set_eee;
        public Ptr<?> get_tunable;
        public Ptr<?> set_tunable;
        public Ptr<?> get_per_queue_coalesce;
        public Ptr<?> set_per_queue_coalesce;
        public Ptr<?> get_link_ksettings;
        public Ptr<?> set_link_ksettings;
        public Ptr<?> get_fec_stats;
        public Ptr<?> get_fecparam;
        public Ptr<?> set_fecparam;
        public Ptr<?> get_ethtool_phy_stats;
        public Ptr<?> get_phy_tunable;
        public Ptr<?> set_phy_tunable;
        public Ptr<?> get_module_eeprom_by_page;
        public Ptr<?> set_module_eeprom_by_page;
        public Ptr<?> get_eth_phy_stats;
        public Ptr<?> get_eth_mac_stats;
        public Ptr<?> get_eth_ctrl_stats;
        public Ptr<?> get_rmon_stats;
        public Ptr<?> get_module_power_mode;
        public Ptr<?> set_module_power_mode;
        public Ptr<?> get_mm;
        public Ptr<?> set_mm;
        public Ptr<?> get_mm_stats;
    }
}

