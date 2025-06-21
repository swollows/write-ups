/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.EthnlDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.MacsecDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class StatsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stats_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stats_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_fill_reply($arg1, (const struct ethnl_req_info*)$arg2, (const struct ethnl_reply_data*)$arg3)")
    public static int stats_fill_reply(Ptr<SkDefinitions.sk_buff> skb, Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stats_parse_request(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<Ptr<runtime.nlattr>> tb, Ptr<NetlinkDefinitions.netlink_ext_ack> extack) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_prepare_data((const struct ethnl_req_info*)$arg1, $arg2, (const struct genl_info*)$arg3)")
    public static int stats_prepare_data(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_put_ctrl_stats($arg1, (const struct stats_reply_data*)$arg2)")
    public static int stats_put_ctrl_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<stats_reply_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_put_mac_stats($arg1, (const struct stats_reply_data*)$arg2)")
    public static int stats_put_mac_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<stats_reply_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_put_phy_stats($arg1, (const struct stats_reply_data*)$arg2)")
    public static int stats_put_phy_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<stats_reply_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_put_rmon_hist($arg1, $arg2, (const long long unsigned int*)$arg3, (const struct ethtool_rmon_hist_range*)$arg4)")
    public static int stats_put_rmon_hist(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int attr2, Ptr<@Unsigned Long> hist, Ptr<EthtoolDefinitions.ethtool_rmon_hist_range> ranges) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_put_rmon_stats($arg1, (const struct stats_reply_data*)$arg2)")
    public static int stats_put_rmon_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<stats_reply_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_put_stats($arg1, (const struct stats_reply_data*)$arg2, $arg3, $arg4, (int (*)(struct sk_buff*, const struct stats_reply_data*))$arg5)")
    public static int stats_put_stats(Ptr<SkDefinitions.sk_buff> skb, Ptr<stats_reply_data> data, @Unsigned int id, @Unsigned int ss_id, Ptr<?> cb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="stats_reply_size((const struct ethnl_req_info*)$arg1, (const struct ethnl_reply_data*)$arg2)")
    public static int stats_reply_size(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stats_request(Ptr<runtime.virtqueue> vq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct stats_reply_data")
    @NotUsableInJava
    public static class stats_reply_data
    extends Struct {
        public EthnlDefinitions.ethnl_reply_data base;
        @InlineUnion(value=96140)
        public @InlineUnion(value=96140) AnonDefinitions.anon_member_of_anon_member_of_stats_reply_data_and_stats_of_anon_member_of_stats_reply_data anon1$0;
        @InlineUnion(value=96140)
        public @InlineUnion(value=96140) AnonDefinitions.anon_member_of_anon_member_of_stats_reply_data_and_stats_of_anon_member_of_stats_reply_data stats;
        public Ptr<EthtoolDefinitions.ethtool_rmon_hist_range> rmon_ranges;
    }

    @Type(noCCodeGeneration=true, cType="struct stats_req_info")
    @NotUsableInJava
    public static class stats_req_info
    extends Struct {
        public EthnlDefinitions.ethnl_req_info base;
        public @Unsigned long @Size(value=1) [] stat_mask;
        public EthtoolDefinitions.ethtool_mac_stats_src src;
    }

    @Type(noCCodeGeneration=true, cType="struct { int promotion_count; int demotion_count; }")
    @NotUsableInJava
    public static class stats_of_ladder_device_state
    extends Struct {
        public int promotion_count;
        public int demotion_count;
    }

    @Type(noCCodeGeneration=true, cType="union { struct macsec_tx_sc_stats *tx_sc_stats; struct macsec_tx_sa_stats *tx_sa_stats; struct macsec_rx_sc_stats *rx_sc_stats; struct macsec_rx_sa_stats *rx_sa_stats; struct macsec_dev_stats *dev_stats; }")
    @NotUsableInJava
    public static class stats_of_macsec_context
    extends Union {
        public Ptr<MacsecDefinitions.macsec_tx_sc_stats> tx_sc_stats;
        public Ptr<MacsecDefinitions.macsec_tx_sa_stats> tx_sa_stats;
        public Ptr<MacsecDefinitions.macsec_rx_sc_stats> rx_sc_stats;
        public Ptr<MacsecDefinitions.macsec_rx_sa_stats> rx_sa_stats;
        public Ptr<MacsecDefinitions.macsec_dev_stats> dev_stats;
    }
}

