/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Struct;

public final class IflaDefinitions {

    @Type(noCCodeGeneration=true, cType="struct ifla_cacheinfo")
    @NotUsableInJava
    public static class ifla_cacheinfo
    extends Struct {
        public @Unsigned int max_reasm_len;
        public @Unsigned int tstamp;
        public @Unsigned int reachable_time;
        public @Unsigned int retrans_time;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_trust")
    @NotUsableInJava
    public static class ifla_vf_trust
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned int setting;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_rss_query_en")
    @NotUsableInJava
    public static class ifla_vf_rss_query_en
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned int setting;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_link_state")
    @NotUsableInJava
    public static class ifla_vf_link_state
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned int link_state;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_spoofchk")
    @NotUsableInJava
    public static class ifla_vf_spoofchk
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned int setting;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_rate")
    @NotUsableInJava
    public static class ifla_vf_rate
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned int min_tx_rate;
        public @Unsigned int max_tx_rate;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_tx_rate")
    @NotUsableInJava
    public static class ifla_vf_tx_rate
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned int rate;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_vlan_info")
    @NotUsableInJava
    public static class ifla_vf_vlan_info
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned int vlan;
        public @Unsigned int qos;
        public @Unsigned @OriginalName(value="__be16") short vlan_proto;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_vlan")
    @NotUsableInJava
    public static class ifla_vf_vlan
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned int vlan;
        public @Unsigned int qos;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_broadcast")
    @NotUsableInJava
    public static class ifla_vf_broadcast
    extends Struct {
        public char @Size(value=32) [] broadcast;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_mac")
    @NotUsableInJava
    public static class ifla_vf_mac
    extends Struct {
        public @Unsigned int vf;
        public char @Size(value=32) [] mac;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_info")
    @NotUsableInJava
    public static class ifla_vf_info
    extends Struct {
        public @Unsigned int vf;
        public char @Size(value=32) [] mac;
        public @Unsigned int vlan;
        public @Unsigned int qos;
        public @Unsigned int spoofchk;
        public @Unsigned int linkstate;
        public @Unsigned int min_tx_rate;
        public @Unsigned int max_tx_rate;
        public @Unsigned int rss_query_en;
        public @Unsigned int trusted;
        public @Unsigned @OriginalName(value="__be16") short vlan_proto;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_stats")
    @NotUsableInJava
    public static class ifla_vf_stats
    extends Struct {
        public @Unsigned long rx_packets;
        public @Unsigned long tx_packets;
        public @Unsigned long rx_bytes;
        public @Unsigned long tx_bytes;
        public @Unsigned long broadcast;
        public @Unsigned long multicast;
        public @Unsigned long rx_dropped;
        public @Unsigned long tx_dropped;
    }

    @Type(noCCodeGeneration=true, cType="struct ifla_vf_guid")
    @NotUsableInJava
    public static class ifla_vf_guid
    extends Struct {
        public @Unsigned int vf;
        public @Unsigned long guid;
    }
}

