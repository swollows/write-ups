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
import me.bechberger.ebpf.runtime.Nl80211Definitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Ieee80211Definitions {

    @Type(noCCodeGeneration=true, cType="struct ieee80211_txrx_stypes")
    @NotUsableInJava
    public static class ieee80211_txrx_stypes
    extends Struct {
        public @Unsigned short tx;
        public @Unsigned short rx;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_iface_combination")
    @NotUsableInJava
    public static class ieee80211_iface_combination
    extends Struct {
        public Ptr<ieee80211_iface_limit> limits;
        public @Unsigned int num_different_channels;
        public @Unsigned short max_interfaces;
        public char n_limits;
        public boolean beacon_int_infra_match;
        public char radar_detect_widths;
        public char radar_detect_regions;
        public @Unsigned int beacon_int_min_gcd;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_iface_limit")
    @NotUsableInJava
    public static class ieee80211_iface_limit
    extends Struct {
        public @Unsigned short max;
        public @Unsigned short types;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_supported_band")
    @NotUsableInJava
    public static class ieee80211_supported_band
    extends Struct {
        public Ptr<ieee80211_channel> channels;
        public Ptr<ieee80211_rate> bitrates;
        public Nl80211Definitions.nl80211_band band;
        public int n_channels;
        public int n_bitrates;
        public ieee80211_sta_ht_cap ht_cap;
        public ieee80211_sta_vht_cap vht_cap;
        public ieee80211_sta_s1g_cap s1g_cap;
        public ieee80211_edmg edmg_cap;
        public @Unsigned short n_iftype_data;
        public Ptr<ieee80211_sband_iftype_data> iftype_data;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_sta_s1g_cap")
    @NotUsableInJava
    public static class ieee80211_sta_s1g_cap
    extends Struct {
        public boolean s1g;
        public char @Size(value=10) [] cap;
        public char @Size(value=5) [] nss_mcs;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_edmg")
    @NotUsableInJava
    public static class ieee80211_edmg
    extends Struct {
        public char channels;
        public ieee80211_edmg_bw_config bw_config;
    }

    @Type(noCCodeGeneration=true, cType="enum ieee80211_edmg_bw_config")
    public static enum ieee80211_edmg_bw_config implements Enum<ieee80211_edmg_bw_config>,
    TypedEnum<ieee80211_edmg_bw_config, Integer>
    {
        IEEE80211_EDMG_BW_CONFIG_4,
        IEEE80211_EDMG_BW_CONFIG_5,
        IEEE80211_EDMG_BW_CONFIG_6,
        IEEE80211_EDMG_BW_CONFIG_7,
        IEEE80211_EDMG_BW_CONFIG_8,
        IEEE80211_EDMG_BW_CONFIG_9,
        IEEE80211_EDMG_BW_CONFIG_10,
        IEEE80211_EDMG_BW_CONFIG_11,
        IEEE80211_EDMG_BW_CONFIG_12,
        IEEE80211_EDMG_BW_CONFIG_13,
        IEEE80211_EDMG_BW_CONFIG_14,
        IEEE80211_EDMG_BW_CONFIG_15;

    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_sband_iftype_data")
    @NotUsableInJava
    public static class ieee80211_sband_iftype_data
    extends Struct {
        public @Unsigned short types_mask;
        public ieee80211_sta_he_cap he_cap;
        public ieee80211_he_6ghz_capa he_6ghz_capa;
        public ieee80211_sta_eht_cap eht_cap;
        public misc.vendor_elems_of_ieee80211_sband_iftype_data vendor_elems;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_sta_eht_cap")
    @NotUsableInJava
    public static class ieee80211_sta_eht_cap
    extends Struct {
        public boolean has_eht;
        public ieee80211_eht_cap_elem_fixed eht_cap_elem;
        public ieee80211_eht_mcs_nss_supp eht_mcs_nss_supp;
        public char @Size(value=32) [] eht_ppe_thres;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_eht_mcs_nss_supp")
    @NotUsableInJava
    public static class ieee80211_eht_mcs_nss_supp
    extends Struct {
        @InlineUnion(value=34995)
        public @InlineUnion(value=34995) ieee80211_eht_mcs_nss_supp_20mhz_only only_20mhz;
        @InlineUnion(value=34995)
        public @InlineUnion(value=34995) misc.bw_of_anon_member_of_ieee80211_eht_mcs_nss_supp bw;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_sta_he_cap")
    @NotUsableInJava
    public static class ieee80211_sta_he_cap
    extends Struct {
        public boolean has_he;
        public ieee80211_he_cap_elem he_cap_elem;
        public ieee80211_he_mcs_nss_supp he_mcs_nss_supp;
        public char @Size(value=25) [] ppe_thres;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_sta_vht_cap")
    @NotUsableInJava
    public static class ieee80211_sta_vht_cap
    extends Struct {
        public boolean vht_supported;
        public @Unsigned int cap;
        public ieee80211_vht_mcs_info vht_mcs;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_sta_ht_cap")
    @NotUsableInJava
    public static class ieee80211_sta_ht_cap
    extends Struct {
        public @Unsigned short cap;
        public boolean ht_supported;
        public char ampdu_factor;
        public char ampdu_density;
        public ieee80211_mcs_info mcs;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_rate")
    @NotUsableInJava
    public static class ieee80211_rate
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned short bitrate;
        public @Unsigned short hw_value;
        public @Unsigned short hw_value_short;
    }

    @Type(noCCodeGeneration=true, cType="enum ieee80211_bss_type")
    public static enum ieee80211_bss_type implements Enum<ieee80211_bss_type>,
    TypedEnum<ieee80211_bss_type, Integer>
    {
        IEEE80211_BSS_TYPE_ESS,
        IEEE80211_BSS_TYPE_PBSS,
        IEEE80211_BSS_TYPE_IBSS,
        IEEE80211_BSS_TYPE_MBSS,
        IEEE80211_BSS_TYPE_ANY;

    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_channel")
    @NotUsableInJava
    public static class ieee80211_channel
    extends Struct {
        public Nl80211Definitions.nl80211_band band;
        public @Unsigned int center_freq;
        public @Unsigned short freq_offset;
        public @Unsigned short hw_value;
        public @Unsigned int flags;
        public int max_antenna_gain;
        public int max_power;
        public int max_reg_power;
        public boolean beacon_found;
        public @Unsigned int orig_flags;
        public int orig_mag;
        public int orig_mpwr;
        public Nl80211Definitions.nl80211_dfs_state dfs_state;
        public @Unsigned long dfs_state_entered;
        public @Unsigned int dfs_cac_ms;
        public @OriginalName(value="s8") byte psd;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_regdomain")
    @NotUsableInJava
    public static class ieee80211_regdomain
    extends Struct {
        public misc.callback_head callback_head;
        public @Unsigned int n_reg_rules;
        public char @Size(value=3) [] alpha2;
        public Nl80211Definitions.nl80211_dfs_regions dfs_region;
        public ieee80211_reg_rule @Size(value=0) [] reg_rules;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_reg_rule")
    @NotUsableInJava
    public static class ieee80211_reg_rule
    extends Struct {
        public ieee80211_freq_range freq_range;
        public ieee80211_power_rule power_rule;
        public ieee80211_wmm_rule wmm_rule;
        public @Unsigned int flags;
        public @Unsigned int dfs_cac_ms;
        public boolean has_wmm;
        public @OriginalName(value="s8") byte psd;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_wmm_rule")
    @NotUsableInJava
    public static class ieee80211_wmm_rule
    extends Struct {
        public ieee80211_wmm_ac @Size(value=4) [] client;
        public ieee80211_wmm_ac @Size(value=4) [] ap;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_wmm_ac")
    @NotUsableInJava
    public static class ieee80211_wmm_ac
    extends Struct {
        public @Unsigned short cw_min;
        public @Unsigned short cw_max;
        public @Unsigned short cot;
        public char aifsn;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_power_rule")
    @NotUsableInJava
    public static class ieee80211_power_rule
    extends Struct {
        public @Unsigned int max_antenna_gain;
        public @Unsigned int max_eirp;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_freq_range")
    @NotUsableInJava
    public static class ieee80211_freq_range
    extends Struct {
        public @Unsigned int start_freq_khz;
        public @Unsigned int end_freq_khz;
        public @Unsigned int max_bandwidth_khz;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_he_6ghz_capa")
    @NotUsableInJava
    public static class ieee80211_he_6ghz_capa
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short capa;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_eht_cap_elem_fixed")
    @NotUsableInJava
    public static class ieee80211_eht_cap_elem_fixed
    extends Struct {
        public char @Size(value=2) [] mac_cap_info;
        public char @Size(value=9) [] phy_cap_info;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_eht_mcs_nss_supp_bw")
    @NotUsableInJava
    public static class ieee80211_eht_mcs_nss_supp_bw
    extends Struct {
        @InlineUnion(value=34971)
        public  @InlineUnion(value=34971) AnonDefinitions.anon_member_of_anon_member_of_ieee80211_eht_mcs_nss_supp_bw anon0$0;
        @InlineUnion(value=34971)
        public @InlineUnion(value=34971) char @Size(value=3) [] rx_tx_max_nss;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_eht_mcs_nss_supp_20mhz_only")
    @NotUsableInJava
    public static class ieee80211_eht_mcs_nss_supp_20mhz_only
    extends Struct {
        @InlineUnion(value=34968)
        public  @InlineUnion(value=34968) AnonDefinitions.anon_member_of_anon_member_of_ieee80211_eht_mcs_nss_supp_20mhz_only anon0$0;
        @InlineUnion(value=34968)
        public @InlineUnion(value=34968) char @Size(value=4) [] rx_tx_max_nss;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_he_mcs_nss_supp")
    @NotUsableInJava
    public static class ieee80211_he_mcs_nss_supp
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short rx_mcs_80;
        public @Unsigned @OriginalName(value="__le16") short tx_mcs_80;
        public @Unsigned @OriginalName(value="__le16") short rx_mcs_160;
        public @Unsigned @OriginalName(value="__le16") short tx_mcs_160;
        public @Unsigned @OriginalName(value="__le16") short rx_mcs_80p80;
        public @Unsigned @OriginalName(value="__le16") short tx_mcs_80p80;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_he_cap_elem")
    @NotUsableInJava
    public static class ieee80211_he_cap_elem
    extends Struct {
        public char @Size(value=6) [] mac_cap_info;
        public char @Size(value=11) [] phy_cap_info;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_vht_cap")
    @NotUsableInJava
    public static class ieee80211_vht_cap
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int vht_cap_info;
        public ieee80211_vht_mcs_info supp_mcs;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_vht_mcs_info")
    @NotUsableInJava
    public static class ieee80211_vht_mcs_info
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short rx_mcs_map;
        public @Unsigned @OriginalName(value="__le16") short rx_highest;
        public @Unsigned @OriginalName(value="__le16") short tx_mcs_map;
        public @Unsigned @OriginalName(value="__le16") short tx_highest;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_ht_cap")
    @NotUsableInJava
    public static class ieee80211_ht_cap
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short cap_info;
        public char ampdu_params_info;
        public ieee80211_mcs_info mcs;
        public @Unsigned @OriginalName(value="__le16") short extended_ht_cap_info;
        public @Unsigned @OriginalName(value="__le32") int tx_BF_cap_info;
        public char antenna_selection_info;
    }

    @Type(noCCodeGeneration=true, cType="struct ieee80211_mcs_info")
    @NotUsableInJava
    public static class ieee80211_mcs_info
    extends Struct {
        public char @Size(value=10) [] rx_mask;
        public @Unsigned @OriginalName(value="__le16") short rx_highest;
        public char tx_params;
        public char @Size(value=3) [] reserved;
    }
}

