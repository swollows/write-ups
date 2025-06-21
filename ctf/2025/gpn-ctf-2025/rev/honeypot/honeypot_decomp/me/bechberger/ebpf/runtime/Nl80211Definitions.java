/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Nl80211Definitions {

    @Type(noCCodeGeneration=true, cType="enum nl80211_sar_type")
    public static enum nl80211_sar_type implements Enum<nl80211_sar_type>,
    TypedEnum<nl80211_sar_type, Integer>
    {
        NL80211_SAR_TYPE_POWER,
        NUM_NL80211_SAR_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_sae_pwe_mechanism")
    public static enum nl80211_sae_pwe_mechanism implements Enum<nl80211_sae_pwe_mechanism>,
    TypedEnum<nl80211_sae_pwe_mechanism, Integer>
    {
        NL80211_SAE_PWE_UNSPECIFIED,
        NL80211_SAE_PWE_HUNT_AND_PECK,
        NL80211_SAE_PWE_HASH_TO_ELEMENT,
        NL80211_SAE_PWE_BOTH;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_bss_select_attr")
    public static enum nl80211_bss_select_attr implements Enum<nl80211_bss_select_attr>,
    TypedEnum<nl80211_bss_select_attr, Integer>
    {
        __NL80211_BSS_SELECT_ATTR_INVALID,
        NL80211_BSS_SELECT_ATTR_RSSI,
        NL80211_BSS_SELECT_ATTR_BAND_PREF,
        NL80211_BSS_SELECT_ATTR_RSSI_ADJUST,
        __NL80211_BSS_SELECT_ATTR_AFTER_LAST,
        NL80211_BSS_SELECT_ATTR_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct nl80211_vendor_cmd_info")
    @NotUsableInJava
    public static class nl80211_vendor_cmd_info
    extends Struct {
        public @Unsigned int vendor_id;
        public @Unsigned int subcmd;
    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_dfs_state")
    public static enum nl80211_dfs_state implements Enum<nl80211_dfs_state>,
    TypedEnum<nl80211_dfs_state, Integer>
    {
        NL80211_DFS_USABLE,
        NL80211_DFS_UNAVAILABLE,
        NL80211_DFS_AVAILABLE;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_ext_feature_index")
    public static enum nl80211_ext_feature_index implements Enum<nl80211_ext_feature_index>,
    TypedEnum<nl80211_ext_feature_index, Integer>
    {
        NL80211_EXT_FEATURE_VHT_IBSS,
        NL80211_EXT_FEATURE_RRM,
        NL80211_EXT_FEATURE_MU_MIMO_AIR_SNIFFER,
        NL80211_EXT_FEATURE_SCAN_START_TIME,
        NL80211_EXT_FEATURE_BSS_PARENT_TSF,
        NL80211_EXT_FEATURE_SET_SCAN_DWELL,
        NL80211_EXT_FEATURE_BEACON_RATE_LEGACY,
        NL80211_EXT_FEATURE_BEACON_RATE_HT,
        NL80211_EXT_FEATURE_BEACON_RATE_VHT,
        NL80211_EXT_FEATURE_FILS_STA,
        NL80211_EXT_FEATURE_MGMT_TX_RANDOM_TA,
        NL80211_EXT_FEATURE_MGMT_TX_RANDOM_TA_CONNECTED,
        NL80211_EXT_FEATURE_SCHED_SCAN_RELATIVE_RSSI,
        NL80211_EXT_FEATURE_CQM_RSSI_LIST,
        NL80211_EXT_FEATURE_FILS_SK_OFFLOAD,
        NL80211_EXT_FEATURE_4WAY_HANDSHAKE_STA_PSK,
        NL80211_EXT_FEATURE_4WAY_HANDSHAKE_STA_1X,
        NL80211_EXT_FEATURE_FILS_MAX_CHANNEL_TIME,
        NL80211_EXT_FEATURE_ACCEPT_BCAST_PROBE_RESP,
        NL80211_EXT_FEATURE_OCE_PROBE_REQ_HIGH_TX_RATE,
        NL80211_EXT_FEATURE_OCE_PROBE_REQ_DEFERRAL_SUPPRESSION,
        NL80211_EXT_FEATURE_MFP_OPTIONAL,
        NL80211_EXT_FEATURE_LOW_SPAN_SCAN,
        NL80211_EXT_FEATURE_LOW_POWER_SCAN,
        NL80211_EXT_FEATURE_HIGH_ACCURACY_SCAN,
        NL80211_EXT_FEATURE_DFS_OFFLOAD,
        NL80211_EXT_FEATURE_CONTROL_PORT_OVER_NL80211,
        NL80211_EXT_FEATURE_ACK_SIGNAL_SUPPORT,
        NL80211_EXT_FEATURE_DATA_ACK_SIGNAL_SUPPORT,
        NL80211_EXT_FEATURE_TXQS,
        NL80211_EXT_FEATURE_SCAN_RANDOM_SN,
        NL80211_EXT_FEATURE_SCAN_MIN_PREQ_CONTENT,
        NL80211_EXT_FEATURE_CAN_REPLACE_PTK0,
        NL80211_EXT_FEATURE_ENABLE_FTM_RESPONDER,
        NL80211_EXT_FEATURE_AIRTIME_FAIRNESS,
        NL80211_EXT_FEATURE_AP_PMKSA_CACHING,
        NL80211_EXT_FEATURE_SCHED_SCAN_BAND_SPECIFIC_RSSI_THOLD,
        NL80211_EXT_FEATURE_EXT_KEY_ID,
        NL80211_EXT_FEATURE_STA_TX_PWR,
        NL80211_EXT_FEATURE_SAE_OFFLOAD,
        NL80211_EXT_FEATURE_VLAN_OFFLOAD,
        NL80211_EXT_FEATURE_AQL,
        NL80211_EXT_FEATURE_BEACON_PROTECTION,
        NL80211_EXT_FEATURE_CONTROL_PORT_NO_PREAUTH,
        NL80211_EXT_FEATURE_PROTECTED_TWT,
        NL80211_EXT_FEATURE_DEL_IBSS_STA,
        NL80211_EXT_FEATURE_MULTICAST_REGISTRATIONS,
        NL80211_EXT_FEATURE_BEACON_PROTECTION_CLIENT,
        NL80211_EXT_FEATURE_SCAN_FREQ_KHZ,
        NL80211_EXT_FEATURE_CONTROL_PORT_OVER_NL80211_TX_STATUS,
        NL80211_EXT_FEATURE_OPERATING_CHANNEL_VALIDATION,
        NL80211_EXT_FEATURE_4WAY_HANDSHAKE_AP_PSK,
        NL80211_EXT_FEATURE_SAE_OFFLOAD_AP,
        NL80211_EXT_FEATURE_FILS_DISCOVERY,
        NL80211_EXT_FEATURE_UNSOL_BCAST_PROBE_RESP,
        NL80211_EXT_FEATURE_BEACON_RATE_HE,
        NL80211_EXT_FEATURE_SECURE_LTF,
        NL80211_EXT_FEATURE_SECURE_RTT,
        NL80211_EXT_FEATURE_PROT_RANGE_NEGO_AND_MEASURE,
        NL80211_EXT_FEATURE_BSS_COLOR,
        NL80211_EXT_FEATURE_FILS_CRYPTO_OFFLOAD,
        NL80211_EXT_FEATURE_RADAR_BACKGROUND,
        NL80211_EXT_FEATURE_POWERED_ADDR_CHANGE,
        NL80211_EXT_FEATURE_PUNCT,
        NL80211_EXT_FEATURE_SECURE_NAN,
        NL80211_EXT_FEATURE_AUTH_AND_DEAUTH_RANDOM_TA,
        NL80211_EXT_FEATURE_OWE_OFFLOAD,
        NL80211_EXT_FEATURE_OWE_OFFLOAD_AP,
        NL80211_EXT_FEATURE_DFS_CONCURRENT,
        NL80211_EXT_FEATURE_SPP_AMSDU_SUPPORT,
        NUM_NL80211_EXT_FEATURES,
        MAX_NL80211_EXT_FEATURES;

    }

    @Type(noCCodeGeneration=true, cType="struct nl80211_wowlan_tcp_data_token_feature")
    @NotUsableInJava
    public static class nl80211_wowlan_tcp_data_token_feature
    extends Struct {
        public @Unsigned int min_len;
        public @Unsigned int max_len;
        public @Unsigned int bufsize;
    }

    @Type(noCCodeGeneration=true, cType="struct nl80211_wowlan_tcp_data_token")
    @NotUsableInJava
    public static class nl80211_wowlan_tcp_data_token
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int len;
        public char @Size(value=0) [] token_stream;
    }

    @Type(noCCodeGeneration=true, cType="struct nl80211_wowlan_tcp_data_seq")
    @NotUsableInJava
    public static class nl80211_wowlan_tcp_data_seq
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int offset;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_band")
    public static enum nl80211_band implements Enum<nl80211_band>,
    TypedEnum<nl80211_band, Integer>
    {
        NL80211_BAND_2GHZ,
        NL80211_BAND_5GHZ,
        NL80211_BAND_60GHZ,
        NL80211_BAND_6GHZ,
        NL80211_BAND_S1GHZ,
        NL80211_BAND_LC,
        NUM_NL80211_BANDS;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_mfp")
    public static enum nl80211_mfp implements Enum<nl80211_mfp>,
    TypedEnum<nl80211_mfp, Integer>
    {
        NL80211_MFP_NO,
        NL80211_MFP_REQUIRED,
        NL80211_MFP_OPTIONAL;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_auth_type")
    public static enum nl80211_auth_type implements Enum<nl80211_auth_type>,
    TypedEnum<nl80211_auth_type, Integer>
    {
        NL80211_AUTHTYPE_OPEN_SYSTEM,
        NL80211_AUTHTYPE_SHARED_KEY,
        NL80211_AUTHTYPE_FT,
        NL80211_AUTHTYPE_NETWORK_EAP,
        NL80211_AUTHTYPE_SAE,
        NL80211_AUTHTYPE_FILS_SK,
        NL80211_AUTHTYPE_FILS_SK_PFS,
        NL80211_AUTHTYPE_FILS_PK,
        __NL80211_AUTHTYPE_NUM,
        NL80211_AUTHTYPE_MAX,
        NL80211_AUTHTYPE_AUTOMATIC;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_chan_width")
    public static enum nl80211_chan_width implements Enum<nl80211_chan_width>,
    TypedEnum<nl80211_chan_width, Integer>
    {
        NL80211_CHAN_WIDTH_20_NOHT,
        NL80211_CHAN_WIDTH_20,
        NL80211_CHAN_WIDTH_40,
        NL80211_CHAN_WIDTH_80,
        NL80211_CHAN_WIDTH_80P80,
        NL80211_CHAN_WIDTH_160,
        NL80211_CHAN_WIDTH_5,
        NL80211_CHAN_WIDTH_10,
        NL80211_CHAN_WIDTH_1,
        NL80211_CHAN_WIDTH_2,
        NL80211_CHAN_WIDTH_4,
        NL80211_CHAN_WIDTH_8,
        NL80211_CHAN_WIDTH_16,
        NL80211_CHAN_WIDTH_320;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_key_mode")
    public static enum nl80211_key_mode implements Enum<nl80211_key_mode>,
    TypedEnum<nl80211_key_mode, Integer>
    {
        NL80211_KEY_RX_TX,
        NL80211_KEY_NO_TX,
        NL80211_KEY_SET_TX;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_mntr_flags")
    public static enum nl80211_mntr_flags implements Enum<nl80211_mntr_flags>,
    TypedEnum<nl80211_mntr_flags, Integer>
    {
        __NL80211_MNTR_FLAG_INVALID,
        NL80211_MNTR_FLAG_FCSFAIL,
        NL80211_MNTR_FLAG_PLCPFAIL,
        NL80211_MNTR_FLAG_CONTROL,
        NL80211_MNTR_FLAG_OTHER_BSS,
        NL80211_MNTR_FLAG_COOK_FRAMES,
        NL80211_MNTR_FLAG_ACTIVE,
        __NL80211_MNTR_FLAG_AFTER_LAST,
        NL80211_MNTR_FLAG_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_user_reg_hint_type")
    public static enum nl80211_user_reg_hint_type implements Enum<nl80211_user_reg_hint_type>,
    TypedEnum<nl80211_user_reg_hint_type, Integer>
    {
        NL80211_USER_REG_HINT_USER,
        NL80211_USER_REG_HINT_CELL_BASE,
        NL80211_USER_REG_HINT_INDOOR;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_dfs_regions")
    public static enum nl80211_dfs_regions implements Enum<nl80211_dfs_regions>,
    TypedEnum<nl80211_dfs_regions, Integer>
    {
        NL80211_DFS_UNSET,
        NL80211_DFS_FCC,
        NL80211_DFS_ETSI,
        NL80211_DFS_JP;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_reg_initiator")
    public static enum nl80211_reg_initiator implements Enum<nl80211_reg_initiator>,
    TypedEnum<nl80211_reg_initiator, Integer>
    {
        NL80211_REGDOM_SET_BY_CORE,
        NL80211_REGDOM_SET_BY_USER,
        NL80211_REGDOM_SET_BY_DRIVER,
        NL80211_REGDOM_SET_BY_COUNTRY_IE;

    }

    @Type(noCCodeGeneration=true, cType="enum nl80211_iftype")
    public static enum nl80211_iftype implements Enum<nl80211_iftype>,
    TypedEnum<nl80211_iftype, Integer>
    {
        NL80211_IFTYPE_UNSPECIFIED,
        NL80211_IFTYPE_ADHOC,
        NL80211_IFTYPE_STATION,
        NL80211_IFTYPE_AP,
        NL80211_IFTYPE_AP_VLAN,
        NL80211_IFTYPE_WDS,
        NL80211_IFTYPE_MONITOR,
        NL80211_IFTYPE_MESH_POINT,
        NL80211_IFTYPE_P2P_CLIENT,
        NL80211_IFTYPE_P2P_GO,
        NL80211_IFTYPE_P2P_DEVICE,
        NL80211_IFTYPE_OCB,
        NL80211_IFTYPE_NAN,
        NUM_NL80211_IFTYPES,
        NL80211_IFTYPE_MAX;

    }
}

