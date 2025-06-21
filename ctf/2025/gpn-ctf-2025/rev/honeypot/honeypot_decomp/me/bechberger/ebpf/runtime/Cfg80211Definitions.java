/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.Ieee80211Definitions;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.Nl80211Definitions;
import me.bechberger.ebpf.runtime.ParamDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class Cfg80211Definitions {

    @Type(noCCodeGeneration=true, cType="struct cfg80211_pmsr_capabilities")
    @NotUsableInJava
    public static class cfg80211_pmsr_capabilities
    extends Struct {
        public @Unsigned int max_peers;
        public char report_ap_tsf;
        public char randomize_mac_addr;
        public misc.ftm_of_cfg80211_pmsr_capabilities ftm;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_wowlan")
    @NotUsableInJava
    public static class cfg80211_wowlan
    extends Struct {
        public boolean any;
        public boolean disconnect;
        public boolean magic_pkt;
        public boolean gtk_rekey_failure;
        public boolean eap_identity_req;
        public boolean four_way_handshake;
        public boolean rfkill_release;
        public Ptr<cfg80211_pkt_pattern> patterns;
        public Ptr<cfg80211_wowlan_tcp> tcp;
        public int n_patterns;
        public Ptr<cfg80211_sched_scan_request> nd_config;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_wowlan_tcp")
    @NotUsableInJava
    public static class cfg80211_wowlan_tcp
    extends Struct {
        public Ptr<runtime.socket> sock;
        public @Unsigned @OriginalName(value="__be32") int src;
        public @Unsigned @OriginalName(value="__be32") int dst;
        public @Unsigned short src_port;
        public @Unsigned short dst_port;
        public char @Size(value=6) [] dst_mac;
        public int payload_len;
        public Ptr<Character> payload;
        public Nl80211Definitions.nl80211_wowlan_tcp_data_seq payload_seq;
        public @Unsigned int data_interval;
        public @Unsigned int wake_len;
        public Ptr<Character> wake_data;
        public Ptr<Character> wake_mask;
        public @Unsigned int tokens_size;
        public Nl80211Definitions.nl80211_wowlan_tcp_data_token payload_tok;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_pkt_pattern")
    @NotUsableInJava
    public static class cfg80211_pkt_pattern
    extends Struct {
        public Ptr<Character> mask;
        public Ptr<Character> pattern;
        public int pattern_len;
        public int pkt_offset;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_connect_params")
    @NotUsableInJava
    public static class cfg80211_connect_params
    extends Struct {
        public Ptr<Ieee80211Definitions.ieee80211_channel> channel;
        public Ptr<Ieee80211Definitions.ieee80211_channel> channel_hint;
        public Ptr<Character> bssid;
        public Ptr<Character> bssid_hint;
        public Ptr<Character> ssid;
        public @Unsigned long ssid_len;
        public Nl80211Definitions.nl80211_auth_type auth_type;
        public Ptr<Character> ie;
        public @Unsigned long ie_len;
        public boolean privacy;
        public Nl80211Definitions.nl80211_mfp mfp;
        public cfg80211_crypto_settings crypto;
        public Ptr<Character> key;
        public char key_len;
        public char key_idx;
        public @Unsigned int flags;
        public int bg_scan_period;
        public Ieee80211Definitions.ieee80211_ht_cap ht_capa;
        public Ieee80211Definitions.ieee80211_ht_cap ht_capa_mask;
        public Ieee80211Definitions.ieee80211_vht_cap vht_capa;
        public Ieee80211Definitions.ieee80211_vht_cap vht_capa_mask;
        public boolean pbss;
        public cfg80211_bss_selection bss_select;
        public Ptr<Character> prev_bssid;
        public Ptr<Character> fils_erp_username;
        public @Unsigned long fils_erp_username_len;
        public Ptr<Character> fils_erp_realm;
        public @Unsigned long fils_erp_realm_len;
        public @Unsigned short fils_erp_next_seq_num;
        public Ptr<Character> fils_erp_rrk;
        public @Unsigned long fils_erp_rrk_len;
        public boolean want_1x;
        public Ieee80211Definitions.ieee80211_edmg edmg;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_bss_selection")
    @NotUsableInJava
    public static class cfg80211_bss_selection
    extends Struct {
        public Nl80211Definitions.nl80211_bss_select_attr behaviour;
        public ParamDefinitions.param_of_cfg80211_bss_selection param;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_ibss_params")
    @NotUsableInJava
    public static class cfg80211_ibss_params
    extends Struct {
        public Ptr<Character> ssid;
        public Ptr<Character> bssid;
        public cfg80211_chan_def chandef;
        public Ptr<Character> ie;
        public char ssid_len;
        public char ie_len;
        public @Unsigned short beacon_interval;
        public @Unsigned int basic_rates;
        public boolean channel_fixed;
        public boolean privacy;
        public boolean control_port;
        public boolean control_port_over_nl80211;
        public boolean userspace_handles_dfs;
        public int @Size(value=6) [] mcast_rate;
        public Ieee80211Definitions.ieee80211_ht_cap ht_capa;
        public Ieee80211Definitions.ieee80211_ht_cap ht_capa_mask;
        public Ptr<KeyDefinitions.key_params> wep_keys;
        public int wep_tx_key;
    }

    @Type(noCCodeGeneration=true, cType="enum cfg80211_signal_type")
    public static enum cfg80211_signal_type implements Enum<cfg80211_signal_type>,
    TypedEnum<cfg80211_signal_type, Integer>
    {
        CFG80211_SIGNAL_TYPE_NONE,
        CFG80211_SIGNAL_TYPE_MBM,
        CFG80211_SIGNAL_TYPE_UNSPEC;

    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_sched_scan_request")
    @NotUsableInJava
    public static class cfg80211_sched_scan_request
    extends Struct {
        public @Unsigned long reqid;
        public Ptr<cfg80211_ssid> ssids;
        public int n_ssids;
        public @Unsigned int n_channels;
        public Ptr<Character> ie;
        public @Unsigned long ie_len;
        public @Unsigned int flags;
        public Ptr<cfg80211_match_set> match_sets;
        public int n_match_sets;
        public int min_rssi_thold;
        public @Unsigned int delay;
        public Ptr<cfg80211_sched_scan_plan> scan_plans;
        public int n_scan_plans;
        public char @Size(value=6) [] mac_addr;
        public char @Size(value=6) [] mac_addr_mask;
        public boolean relative_rssi_set;
        public @OriginalName(value="s8") byte relative_rssi;
        public cfg80211_bss_select_adjust rssi_adjust;
        public Ptr<runtime.wiphy> wiphy;
        public Ptr<NetDefinitions.net_device> dev;
        public @Unsigned long scan_start;
        public boolean report_results;
        public misc.callback_head callback_head;
        public @Unsigned int owner_nlportid;
        public boolean nl_owner_dead;
        public ListDefinitions.list_head list;
        public Ptr<Ieee80211Definitions.ieee80211_channel> @Size(value=0) [] channels;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_bss_select_adjust")
    @NotUsableInJava
    public static class cfg80211_bss_select_adjust
    extends Struct {
        public Nl80211Definitions.nl80211_band band;
        public @OriginalName(value="s8") byte delta;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_sched_scan_plan")
    @NotUsableInJava
    public static class cfg80211_sched_scan_plan
    extends Struct {
        public @Unsigned int interval;
        public @Unsigned int iterations;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_match_set")
    @NotUsableInJava
    public static class cfg80211_match_set
    extends Struct {
        public cfg80211_ssid ssid;
        public char @Size(value=6) [] bssid;
        public int rssi_thold;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_ssid")
    @NotUsableInJava
    public static class cfg80211_ssid
    extends Struct {
        public char @Size(value=32) [] ssid;
        public char ssid_len;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_sar_capa")
    @NotUsableInJava
    public static class cfg80211_sar_capa
    extends Struct {
        public Nl80211Definitions.nl80211_sar_type type;
        public @Unsigned int num_freq_ranges;
        public Ptr<cfg80211_sar_freq_ranges> freq_ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_sar_freq_ranges")
    @NotUsableInJava
    public static class cfg80211_sar_freq_ranges
    extends Struct {
        public @Unsigned int start_freq;
        public @Unsigned int end_freq;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_crypto_settings")
    @NotUsableInJava
    public static class cfg80211_crypto_settings
    extends Struct {
        public @Unsigned int wpa_versions;
        public @Unsigned int cipher_group;
        public int n_ciphers_pairwise;
        public @Unsigned int @Size(value=5) [] ciphers_pairwise;
        public int n_akm_suites;
        public @Unsigned int @Size(value=10) [] akm_suites;
        public boolean control_port;
        public @Unsigned @OriginalName(value="__be16") short control_port_ethertype;
        public boolean control_port_no_encrypt;
        public boolean control_port_over_nl80211;
        public boolean control_port_no_preauth;
        public Ptr<Character> psk;
        public Ptr<Character> sae_pwd;
        public char sae_pwd_len;
        public Nl80211Definitions.nl80211_sae_pwe_mechanism sae_pwe;
    }

    @Type(noCCodeGeneration=true, cType="struct cfg80211_chan_def")
    @NotUsableInJava
    public static class cfg80211_chan_def
    extends Struct {
        public Ptr<Ieee80211Definitions.ieee80211_channel> chan;
        public Nl80211Definitions.nl80211_chan_width width;
        public @Unsigned int center_freq1;
        public @Unsigned int center_freq2;
        public Ieee80211Definitions.ieee80211_edmg edmg;
        public @Unsigned short freq1_offset;
        public @Unsigned short punctured;
    }
}

