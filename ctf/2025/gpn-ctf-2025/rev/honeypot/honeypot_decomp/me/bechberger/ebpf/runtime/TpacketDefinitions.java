/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class TpacketDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpacket_destruct_skb(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpacket_fill_skb($arg1, $arg2, $arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, (const struct sockcm_cookie*)$arg11)")
    public static int tpacket_fill_skb(Ptr<PacketDefinitions.packet_sock> po, Ptr<SkDefinitions.sk_buff> skb, Ptr<?> frame, Ptr<NetDefinitions.net_device> dev, Ptr<?> data, int tp_len, @Unsigned @OriginalName(value="__be16") short proto2, String addr2, int hlen, int copylen, Ptr<misc.sockcm_cookie> sockc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tpacket_get_timestamp(Ptr<SkDefinitions.sk_buff> skb, Ptr<runtime.timespec64> ts, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpacket_rcv(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetDefinitions.net_device> dev, Ptr<PacketDefinitions.packet_type> pt2, Ptr<NetDefinitions.net_device> orig_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpacket_snd(Ptr<PacketDefinitions.packet_sock> po, Ptr<runtime.msghdr> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union tpacket_uhdr")
    @NotUsableInJava
    public static class tpacket_uhdr
    extends Union {
        public Ptr<tpacket_hdr> h1;
        public Ptr<misc.tpacket2_hdr> h2;
        public Ptr<misc.tpacket3_hdr> h3;
        public Ptr<?> raw;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_kbdq_core")
    @NotUsableInJava
    public static class tpacket_kbdq_core
    extends Struct {
        public Ptr<runtime.pgv> pkbdq;
        public @Unsigned int feature_req_word;
        public @Unsigned int hdrlen;
        public char reset_pending_on_curr_blk;
        public char delete_blk_timer;
        public @Unsigned short kactive_blk_num;
        public @Unsigned short blk_sizeof_priv;
        public @Unsigned short last_kactive_blk_num;
        public String pkblk_start;
        public String pkblk_end;
        public int kblk_size;
        public @Unsigned int max_frame_len;
        public @Unsigned int knum_blocks;
        public @Unsigned @OriginalName(value="uint64_t") long knxt_seq_num;
        public String prev;
        public String nxt_offset;
        public Ptr<SkDefinitions.sk_buff> skb;
        public misc.rwlock_t blk_fill_in_prog_lock;
        public @Unsigned short retire_blk_tov;
        public @Unsigned short version;
        public @Unsigned long tov_in_jiffies;
        public TimerDefinitions.timer_list retire_blk_timer;
    }

    @Type(noCCodeGeneration=true, cType="union tpacket_req_u")
    @NotUsableInJava
    public static class tpacket_req_u
    extends Union {
        public tpacket_req req;
        public tpacket_req3 req3;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_req3")
    @NotUsableInJava
    public static class tpacket_req3
    extends Struct {
        public @Unsigned int tp_block_size;
        public @Unsigned int tp_block_nr;
        public @Unsigned int tp_frame_size;
        public @Unsigned int tp_frame_nr;
        public @Unsigned int tp_retire_blk_tov;
        public @Unsigned int tp_sizeof_priv;
        public @Unsigned int tp_feature_req_word;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_req")
    @NotUsableInJava
    public static class tpacket_req
    extends Struct {
        public @Unsigned int tp_block_size;
        public @Unsigned int tp_block_nr;
        public @Unsigned int tp_frame_size;
        public @Unsigned int tp_frame_nr;
    }

    @Type(noCCodeGeneration=true, cType="enum tpacket_versions")
    public static enum tpacket_versions implements Enum<tpacket_versions>,
    TypedEnum<tpacket_versions, Integer>
    {
        TPACKET_V1,
        TPACKET_V2,
        TPACKET_V3;

    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_block_desc")
    @NotUsableInJava
    public static class tpacket_block_desc
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int offset_to_priv;
        public tpacket_bd_header_u hdr;
    }

    @Type(noCCodeGeneration=true, cType="union tpacket_bd_header_u")
    @NotUsableInJava
    public static class tpacket_bd_header_u
    extends Union {
        public tpacket_hdr_v1 bh1;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_hdr_v1")
    @NotUsableInJava
    public static class tpacket_hdr_v1
    extends Struct {
        public @Unsigned int block_status;
        public @Unsigned int num_pkts;
        public @Unsigned int offset_to_first_pkt;
        public @Unsigned int blk_len;
        public @Unsigned long seq_num;
        public tpacket_bd_ts ts_first_pkt;
        public tpacket_bd_ts ts_last_pkt;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_bd_ts")
    @NotUsableInJava
    public static class tpacket_bd_ts
    extends Struct {
        public @Unsigned int ts_sec;
        @InlineUnion(value=66612)
        public @InlineUnion(value=66612) @Unsigned int ts_usec;
        @InlineUnion(value=66612)
        public @InlineUnion(value=66612) @Unsigned int ts_nsec;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_hdr_variant1")
    @NotUsableInJava
    public static class tpacket_hdr_variant1
    extends Struct {
        public @Unsigned int tp_rxhash;
        public @Unsigned int tp_vlan_tci;
        public @Unsigned short tp_vlan_tpid;
        public @Unsigned short tp_padding;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_hdr")
    @NotUsableInJava
    public static class tpacket_hdr
    extends Struct {
        public @Unsigned long tp_status;
        public @Unsigned int tp_len;
        public @Unsigned int tp_snaplen;
        public @Unsigned short tp_mac;
        public @Unsigned short tp_net;
        public @Unsigned int tp_sec;
        public @Unsigned int tp_usec;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_auxdata")
    @NotUsableInJava
    public static class tpacket_auxdata
    extends Struct {
        public @Unsigned int tp_status;
        public @Unsigned int tp_len;
        public @Unsigned int tp_snaplen;
        public @Unsigned short tp_mac;
        public @Unsigned short tp_net;
        public @Unsigned short tp_vlan_tci;
        public @Unsigned short tp_vlan_tpid;
    }

    @Type(noCCodeGeneration=true, cType="union tpacket_stats_u")
    @NotUsableInJava
    public static class tpacket_stats_u
    extends Union {
        public tpacket_stats stats1;
        public tpacket_stats_v3 stats3;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_rollover_stats")
    @NotUsableInJava
    public static class tpacket_rollover_stats
    extends Struct {
        public @Unsigned long tp_all;
        public @Unsigned long tp_huge;
        public @Unsigned long tp_failed;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_stats_v3")
    @NotUsableInJava
    public static class tpacket_stats_v3
    extends Struct {
        public @Unsigned int tp_packets;
        public @Unsigned int tp_drops;
        public @Unsigned int tp_freeze_q_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct tpacket_stats")
    @NotUsableInJava
    public static class tpacket_stats
    extends Struct {
        public @Unsigned int tp_packets;
        public @Unsigned int tp_drops;
    }
}

