/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 *  java.lang.foreign.ValueLayout$OfByte
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.foreign.ValueLayout$OfShort
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class tcp_info {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_CHAR.withName("tcpi_state"), Lib.C_CHAR.withName("tcpi_ca_state"), Lib.C_CHAR.withName("tcpi_retransmits"), Lib.C_CHAR.withName("tcpi_probes"), Lib.C_CHAR.withName("tcpi_backoff"), Lib.C_CHAR.withName("tcpi_options"), MemoryLayout.paddingLayout((long)2L), Lib.C_INT.withName("tcpi_rto"), Lib.C_INT.withName("tcpi_ato"), Lib.C_INT.withName("tcpi_snd_mss"), Lib.C_INT.withName("tcpi_rcv_mss"), Lib.C_INT.withName("tcpi_unacked"), Lib.C_INT.withName("tcpi_sacked"), Lib.C_INT.withName("tcpi_lost"), Lib.C_INT.withName("tcpi_retrans"), Lib.C_INT.withName("tcpi_fackets"), Lib.C_INT.withName("tcpi_last_data_sent"), Lib.C_INT.withName("tcpi_last_ack_sent"), Lib.C_INT.withName("tcpi_last_data_recv"), Lib.C_INT.withName("tcpi_last_ack_recv"), Lib.C_INT.withName("tcpi_pmtu"), Lib.C_INT.withName("tcpi_rcv_ssthresh"), Lib.C_INT.withName("tcpi_rtt"), Lib.C_INT.withName("tcpi_rttvar"), Lib.C_INT.withName("tcpi_snd_ssthresh"), Lib.C_INT.withName("tcpi_snd_cwnd"), Lib.C_INT.withName("tcpi_advmss"), Lib.C_INT.withName("tcpi_reordering"), Lib.C_INT.withName("tcpi_rcv_rtt"), Lib.C_INT.withName("tcpi_rcv_space"), Lib.C_INT.withName("tcpi_total_retrans"), Lib.C_LONG_LONG.withName("tcpi_pacing_rate"), Lib.C_LONG_LONG.withName("tcpi_max_pacing_rate"), Lib.C_LONG_LONG.withName("tcpi_bytes_acked"), Lib.C_LONG_LONG.withName("tcpi_bytes_received"), Lib.C_INT.withName("tcpi_segs_out"), Lib.C_INT.withName("tcpi_segs_in"), Lib.C_INT.withName("tcpi_notsent_bytes"), Lib.C_INT.withName("tcpi_min_rtt"), Lib.C_INT.withName("tcpi_data_segs_in"), Lib.C_INT.withName("tcpi_data_segs_out"), Lib.C_LONG_LONG.withName("tcpi_delivery_rate"), Lib.C_LONG_LONG.withName("tcpi_busy_time"), Lib.C_LONG_LONG.withName("tcpi_rwnd_limited"), Lib.C_LONG_LONG.withName("tcpi_sndbuf_limited"), Lib.C_INT.withName("tcpi_delivered"), Lib.C_INT.withName("tcpi_delivered_ce"), Lib.C_LONG_LONG.withName("tcpi_bytes_sent"), Lib.C_LONG_LONG.withName("tcpi_bytes_retrans"), Lib.C_INT.withName("tcpi_dsack_dups"), Lib.C_INT.withName("tcpi_reord_seen"), Lib.C_INT.withName("tcpi_rcv_ooopack"), Lib.C_INT.withName("tcpi_snd_wnd"), Lib.C_INT.withName("tcpi_rcv_wnd"), Lib.C_INT.withName("tcpi_rehash"), Lib.C_SHORT.withName("tcpi_total_rto"), Lib.C_SHORT.withName("tcpi_total_rto_recoveries"), Lib.C_INT.withName("tcpi_total_rto_time")}).withName("tcp_info");
    private static final ValueLayout.OfByte tcpi_state$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_state")});
    private static final long tcpi_state$OFFSET = 0L;
    private static final ValueLayout.OfByte tcpi_ca_state$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_ca_state")});
    private static final long tcpi_ca_state$OFFSET = 1L;
    private static final ValueLayout.OfByte tcpi_retransmits$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_retransmits")});
    private static final long tcpi_retransmits$OFFSET = 2L;
    private static final ValueLayout.OfByte tcpi_probes$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_probes")});
    private static final long tcpi_probes$OFFSET = 3L;
    private static final ValueLayout.OfByte tcpi_backoff$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_backoff")});
    private static final long tcpi_backoff$OFFSET = 4L;
    private static final ValueLayout.OfByte tcpi_options$LAYOUT = (ValueLayout.OfByte)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_options")});
    private static final long tcpi_options$OFFSET = 5L;
    private static final ValueLayout.OfInt tcpi_rto$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rto")});
    private static final long tcpi_rto$OFFSET = 8L;
    private static final ValueLayout.OfInt tcpi_ato$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_ato")});
    private static final long tcpi_ato$OFFSET = 12L;
    private static final ValueLayout.OfInt tcpi_snd_mss$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_snd_mss")});
    private static final long tcpi_snd_mss$OFFSET = 16L;
    private static final ValueLayout.OfInt tcpi_rcv_mss$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rcv_mss")});
    private static final long tcpi_rcv_mss$OFFSET = 20L;
    private static final ValueLayout.OfInt tcpi_unacked$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_unacked")});
    private static final long tcpi_unacked$OFFSET = 24L;
    private static final ValueLayout.OfInt tcpi_sacked$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_sacked")});
    private static final long tcpi_sacked$OFFSET = 28L;
    private static final ValueLayout.OfInt tcpi_lost$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_lost")});
    private static final long tcpi_lost$OFFSET = 32L;
    private static final ValueLayout.OfInt tcpi_retrans$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_retrans")});
    private static final long tcpi_retrans$OFFSET = 36L;
    private static final ValueLayout.OfInt tcpi_fackets$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_fackets")});
    private static final long tcpi_fackets$OFFSET = 40L;
    private static final ValueLayout.OfInt tcpi_last_data_sent$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_last_data_sent")});
    private static final long tcpi_last_data_sent$OFFSET = 44L;
    private static final ValueLayout.OfInt tcpi_last_ack_sent$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_last_ack_sent")});
    private static final long tcpi_last_ack_sent$OFFSET = 48L;
    private static final ValueLayout.OfInt tcpi_last_data_recv$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_last_data_recv")});
    private static final long tcpi_last_data_recv$OFFSET = 52L;
    private static final ValueLayout.OfInt tcpi_last_ack_recv$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_last_ack_recv")});
    private static final long tcpi_last_ack_recv$OFFSET = 56L;
    private static final ValueLayout.OfInt tcpi_pmtu$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_pmtu")});
    private static final long tcpi_pmtu$OFFSET = 60L;
    private static final ValueLayout.OfInt tcpi_rcv_ssthresh$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rcv_ssthresh")});
    private static final long tcpi_rcv_ssthresh$OFFSET = 64L;
    private static final ValueLayout.OfInt tcpi_rtt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rtt")});
    private static final long tcpi_rtt$OFFSET = 68L;
    private static final ValueLayout.OfInt tcpi_rttvar$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rttvar")});
    private static final long tcpi_rttvar$OFFSET = 72L;
    private static final ValueLayout.OfInt tcpi_snd_ssthresh$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_snd_ssthresh")});
    private static final long tcpi_snd_ssthresh$OFFSET = 76L;
    private static final ValueLayout.OfInt tcpi_snd_cwnd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_snd_cwnd")});
    private static final long tcpi_snd_cwnd$OFFSET = 80L;
    private static final ValueLayout.OfInt tcpi_advmss$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_advmss")});
    private static final long tcpi_advmss$OFFSET = 84L;
    private static final ValueLayout.OfInt tcpi_reordering$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_reordering")});
    private static final long tcpi_reordering$OFFSET = 88L;
    private static final ValueLayout.OfInt tcpi_rcv_rtt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rcv_rtt")});
    private static final long tcpi_rcv_rtt$OFFSET = 92L;
    private static final ValueLayout.OfInt tcpi_rcv_space$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rcv_space")});
    private static final long tcpi_rcv_space$OFFSET = 96L;
    private static final ValueLayout.OfInt tcpi_total_retrans$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_total_retrans")});
    private static final long tcpi_total_retrans$OFFSET = 100L;
    private static final ValueLayout.OfLong tcpi_pacing_rate$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_pacing_rate")});
    private static final long tcpi_pacing_rate$OFFSET = 104L;
    private static final ValueLayout.OfLong tcpi_max_pacing_rate$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_max_pacing_rate")});
    private static final long tcpi_max_pacing_rate$OFFSET = 112L;
    private static final ValueLayout.OfLong tcpi_bytes_acked$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_bytes_acked")});
    private static final long tcpi_bytes_acked$OFFSET = 120L;
    private static final ValueLayout.OfLong tcpi_bytes_received$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_bytes_received")});
    private static final long tcpi_bytes_received$OFFSET = 128L;
    private static final ValueLayout.OfInt tcpi_segs_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_segs_out")});
    private static final long tcpi_segs_out$OFFSET = 136L;
    private static final ValueLayout.OfInt tcpi_segs_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_segs_in")});
    private static final long tcpi_segs_in$OFFSET = 140L;
    private static final ValueLayout.OfInt tcpi_notsent_bytes$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_notsent_bytes")});
    private static final long tcpi_notsent_bytes$OFFSET = 144L;
    private static final ValueLayout.OfInt tcpi_min_rtt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_min_rtt")});
    private static final long tcpi_min_rtt$OFFSET = 148L;
    private static final ValueLayout.OfInt tcpi_data_segs_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_data_segs_in")});
    private static final long tcpi_data_segs_in$OFFSET = 152L;
    private static final ValueLayout.OfInt tcpi_data_segs_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_data_segs_out")});
    private static final long tcpi_data_segs_out$OFFSET = 156L;
    private static final ValueLayout.OfLong tcpi_delivery_rate$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_delivery_rate")});
    private static final long tcpi_delivery_rate$OFFSET = 160L;
    private static final ValueLayout.OfLong tcpi_busy_time$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_busy_time")});
    private static final long tcpi_busy_time$OFFSET = 168L;
    private static final ValueLayout.OfLong tcpi_rwnd_limited$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rwnd_limited")});
    private static final long tcpi_rwnd_limited$OFFSET = 176L;
    private static final ValueLayout.OfLong tcpi_sndbuf_limited$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_sndbuf_limited")});
    private static final long tcpi_sndbuf_limited$OFFSET = 184L;
    private static final ValueLayout.OfInt tcpi_delivered$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_delivered")});
    private static final long tcpi_delivered$OFFSET = 192L;
    private static final ValueLayout.OfInt tcpi_delivered_ce$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_delivered_ce")});
    private static final long tcpi_delivered_ce$OFFSET = 196L;
    private static final ValueLayout.OfLong tcpi_bytes_sent$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_bytes_sent")});
    private static final long tcpi_bytes_sent$OFFSET = 200L;
    private static final ValueLayout.OfLong tcpi_bytes_retrans$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_bytes_retrans")});
    private static final long tcpi_bytes_retrans$OFFSET = 208L;
    private static final ValueLayout.OfInt tcpi_dsack_dups$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_dsack_dups")});
    private static final long tcpi_dsack_dups$OFFSET = 216L;
    private static final ValueLayout.OfInt tcpi_reord_seen$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_reord_seen")});
    private static final long tcpi_reord_seen$OFFSET = 220L;
    private static final ValueLayout.OfInt tcpi_rcv_ooopack$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rcv_ooopack")});
    private static final long tcpi_rcv_ooopack$OFFSET = 224L;
    private static final ValueLayout.OfInt tcpi_snd_wnd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_snd_wnd")});
    private static final long tcpi_snd_wnd$OFFSET = 228L;
    private static final ValueLayout.OfInt tcpi_rcv_wnd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rcv_wnd")});
    private static final long tcpi_rcv_wnd$OFFSET = 232L;
    private static final ValueLayout.OfInt tcpi_rehash$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_rehash")});
    private static final long tcpi_rehash$OFFSET = 236L;
    private static final ValueLayout.OfShort tcpi_total_rto$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_total_rto")});
    private static final long tcpi_total_rto$OFFSET = 240L;
    private static final ValueLayout.OfShort tcpi_total_rto_recoveries$LAYOUT = (ValueLayout.OfShort)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_total_rto_recoveries")});
    private static final long tcpi_total_rto_recoveries$OFFSET = 242L;
    private static final ValueLayout.OfInt tcpi_total_rto_time$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"tcpi_total_rto_time")});
    private static final long tcpi_total_rto_time$OFFSET = 244L;

    tcp_info() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfByte tcpi_state$layout() {
        return tcpi_state$LAYOUT;
    }

    public static final long tcpi_state$offset() {
        return 0L;
    }

    public static byte tcpi_state(MemorySegment struct) {
        return struct.get(tcpi_state$LAYOUT, 0L);
    }

    public static void tcpi_state(MemorySegment struct, byte fieldValue) {
        struct.set(tcpi_state$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfByte tcpi_ca_state$layout() {
        return tcpi_ca_state$LAYOUT;
    }

    public static final long tcpi_ca_state$offset() {
        return 1L;
    }

    public static byte tcpi_ca_state(MemorySegment struct) {
        return struct.get(tcpi_ca_state$LAYOUT, 1L);
    }

    public static void tcpi_ca_state(MemorySegment struct, byte fieldValue) {
        struct.set(tcpi_ca_state$LAYOUT, 1L, fieldValue);
    }

    public static final ValueLayout.OfByte tcpi_retransmits$layout() {
        return tcpi_retransmits$LAYOUT;
    }

    public static final long tcpi_retransmits$offset() {
        return 2L;
    }

    public static byte tcpi_retransmits(MemorySegment struct) {
        return struct.get(tcpi_retransmits$LAYOUT, 2L);
    }

    public static void tcpi_retransmits(MemorySegment struct, byte fieldValue) {
        struct.set(tcpi_retransmits$LAYOUT, 2L, fieldValue);
    }

    public static final ValueLayout.OfByte tcpi_probes$layout() {
        return tcpi_probes$LAYOUT;
    }

    public static final long tcpi_probes$offset() {
        return 3L;
    }

    public static byte tcpi_probes(MemorySegment struct) {
        return struct.get(tcpi_probes$LAYOUT, 3L);
    }

    public static void tcpi_probes(MemorySegment struct, byte fieldValue) {
        struct.set(tcpi_probes$LAYOUT, 3L, fieldValue);
    }

    public static final ValueLayout.OfByte tcpi_backoff$layout() {
        return tcpi_backoff$LAYOUT;
    }

    public static final long tcpi_backoff$offset() {
        return 4L;
    }

    public static byte tcpi_backoff(MemorySegment struct) {
        return struct.get(tcpi_backoff$LAYOUT, 4L);
    }

    public static void tcpi_backoff(MemorySegment struct, byte fieldValue) {
        struct.set(tcpi_backoff$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfByte tcpi_options$layout() {
        return tcpi_options$LAYOUT;
    }

    public static final long tcpi_options$offset() {
        return 5L;
    }

    public static byte tcpi_options(MemorySegment struct) {
        return struct.get(tcpi_options$LAYOUT, 5L);
    }

    public static void tcpi_options(MemorySegment struct, byte fieldValue) {
        struct.set(tcpi_options$LAYOUT, 5L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rto$layout() {
        return tcpi_rto$LAYOUT;
    }

    public static final long tcpi_rto$offset() {
        return 8L;
    }

    public static int tcpi_rto(MemorySegment struct) {
        return struct.get(tcpi_rto$LAYOUT, 8L);
    }

    public static void tcpi_rto(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rto$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_ato$layout() {
        return tcpi_ato$LAYOUT;
    }

    public static final long tcpi_ato$offset() {
        return 12L;
    }

    public static int tcpi_ato(MemorySegment struct) {
        return struct.get(tcpi_ato$LAYOUT, 12L);
    }

    public static void tcpi_ato(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_ato$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_snd_mss$layout() {
        return tcpi_snd_mss$LAYOUT;
    }

    public static final long tcpi_snd_mss$offset() {
        return 16L;
    }

    public static int tcpi_snd_mss(MemorySegment struct) {
        return struct.get(tcpi_snd_mss$LAYOUT, 16L);
    }

    public static void tcpi_snd_mss(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_snd_mss$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rcv_mss$layout() {
        return tcpi_rcv_mss$LAYOUT;
    }

    public static final long tcpi_rcv_mss$offset() {
        return 20L;
    }

    public static int tcpi_rcv_mss(MemorySegment struct) {
        return struct.get(tcpi_rcv_mss$LAYOUT, 20L);
    }

    public static void tcpi_rcv_mss(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rcv_mss$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_unacked$layout() {
        return tcpi_unacked$LAYOUT;
    }

    public static final long tcpi_unacked$offset() {
        return 24L;
    }

    public static int tcpi_unacked(MemorySegment struct) {
        return struct.get(tcpi_unacked$LAYOUT, 24L);
    }

    public static void tcpi_unacked(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_unacked$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_sacked$layout() {
        return tcpi_sacked$LAYOUT;
    }

    public static final long tcpi_sacked$offset() {
        return 28L;
    }

    public static int tcpi_sacked(MemorySegment struct) {
        return struct.get(tcpi_sacked$LAYOUT, 28L);
    }

    public static void tcpi_sacked(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_sacked$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_lost$layout() {
        return tcpi_lost$LAYOUT;
    }

    public static final long tcpi_lost$offset() {
        return 32L;
    }

    public static int tcpi_lost(MemorySegment struct) {
        return struct.get(tcpi_lost$LAYOUT, 32L);
    }

    public static void tcpi_lost(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_lost$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_retrans$layout() {
        return tcpi_retrans$LAYOUT;
    }

    public static final long tcpi_retrans$offset() {
        return 36L;
    }

    public static int tcpi_retrans(MemorySegment struct) {
        return struct.get(tcpi_retrans$LAYOUT, 36L);
    }

    public static void tcpi_retrans(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_retrans$LAYOUT, 36L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_fackets$layout() {
        return tcpi_fackets$LAYOUT;
    }

    public static final long tcpi_fackets$offset() {
        return 40L;
    }

    public static int tcpi_fackets(MemorySegment struct) {
        return struct.get(tcpi_fackets$LAYOUT, 40L);
    }

    public static void tcpi_fackets(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_fackets$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_last_data_sent$layout() {
        return tcpi_last_data_sent$LAYOUT;
    }

    public static final long tcpi_last_data_sent$offset() {
        return 44L;
    }

    public static int tcpi_last_data_sent(MemorySegment struct) {
        return struct.get(tcpi_last_data_sent$LAYOUT, 44L);
    }

    public static void tcpi_last_data_sent(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_last_data_sent$LAYOUT, 44L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_last_ack_sent$layout() {
        return tcpi_last_ack_sent$LAYOUT;
    }

    public static final long tcpi_last_ack_sent$offset() {
        return 48L;
    }

    public static int tcpi_last_ack_sent(MemorySegment struct) {
        return struct.get(tcpi_last_ack_sent$LAYOUT, 48L);
    }

    public static void tcpi_last_ack_sent(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_last_ack_sent$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_last_data_recv$layout() {
        return tcpi_last_data_recv$LAYOUT;
    }

    public static final long tcpi_last_data_recv$offset() {
        return 52L;
    }

    public static int tcpi_last_data_recv(MemorySegment struct) {
        return struct.get(tcpi_last_data_recv$LAYOUT, 52L);
    }

    public static void tcpi_last_data_recv(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_last_data_recv$LAYOUT, 52L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_last_ack_recv$layout() {
        return tcpi_last_ack_recv$LAYOUT;
    }

    public static final long tcpi_last_ack_recv$offset() {
        return 56L;
    }

    public static int tcpi_last_ack_recv(MemorySegment struct) {
        return struct.get(tcpi_last_ack_recv$LAYOUT, 56L);
    }

    public static void tcpi_last_ack_recv(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_last_ack_recv$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_pmtu$layout() {
        return tcpi_pmtu$LAYOUT;
    }

    public static final long tcpi_pmtu$offset() {
        return 60L;
    }

    public static int tcpi_pmtu(MemorySegment struct) {
        return struct.get(tcpi_pmtu$LAYOUT, 60L);
    }

    public static void tcpi_pmtu(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_pmtu$LAYOUT, 60L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rcv_ssthresh$layout() {
        return tcpi_rcv_ssthresh$LAYOUT;
    }

    public static final long tcpi_rcv_ssthresh$offset() {
        return 64L;
    }

    public static int tcpi_rcv_ssthresh(MemorySegment struct) {
        return struct.get(tcpi_rcv_ssthresh$LAYOUT, 64L);
    }

    public static void tcpi_rcv_ssthresh(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rcv_ssthresh$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rtt$layout() {
        return tcpi_rtt$LAYOUT;
    }

    public static final long tcpi_rtt$offset() {
        return 68L;
    }

    public static int tcpi_rtt(MemorySegment struct) {
        return struct.get(tcpi_rtt$LAYOUT, 68L);
    }

    public static void tcpi_rtt(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rtt$LAYOUT, 68L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rttvar$layout() {
        return tcpi_rttvar$LAYOUT;
    }

    public static final long tcpi_rttvar$offset() {
        return 72L;
    }

    public static int tcpi_rttvar(MemorySegment struct) {
        return struct.get(tcpi_rttvar$LAYOUT, 72L);
    }

    public static void tcpi_rttvar(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rttvar$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_snd_ssthresh$layout() {
        return tcpi_snd_ssthresh$LAYOUT;
    }

    public static final long tcpi_snd_ssthresh$offset() {
        return 76L;
    }

    public static int tcpi_snd_ssthresh(MemorySegment struct) {
        return struct.get(tcpi_snd_ssthresh$LAYOUT, 76L);
    }

    public static void tcpi_snd_ssthresh(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_snd_ssthresh$LAYOUT, 76L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_snd_cwnd$layout() {
        return tcpi_snd_cwnd$LAYOUT;
    }

    public static final long tcpi_snd_cwnd$offset() {
        return 80L;
    }

    public static int tcpi_snd_cwnd(MemorySegment struct) {
        return struct.get(tcpi_snd_cwnd$LAYOUT, 80L);
    }

    public static void tcpi_snd_cwnd(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_snd_cwnd$LAYOUT, 80L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_advmss$layout() {
        return tcpi_advmss$LAYOUT;
    }

    public static final long tcpi_advmss$offset() {
        return 84L;
    }

    public static int tcpi_advmss(MemorySegment struct) {
        return struct.get(tcpi_advmss$LAYOUT, 84L);
    }

    public static void tcpi_advmss(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_advmss$LAYOUT, 84L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_reordering$layout() {
        return tcpi_reordering$LAYOUT;
    }

    public static final long tcpi_reordering$offset() {
        return 88L;
    }

    public static int tcpi_reordering(MemorySegment struct) {
        return struct.get(tcpi_reordering$LAYOUT, 88L);
    }

    public static void tcpi_reordering(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_reordering$LAYOUT, 88L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rcv_rtt$layout() {
        return tcpi_rcv_rtt$LAYOUT;
    }

    public static final long tcpi_rcv_rtt$offset() {
        return 92L;
    }

    public static int tcpi_rcv_rtt(MemorySegment struct) {
        return struct.get(tcpi_rcv_rtt$LAYOUT, 92L);
    }

    public static void tcpi_rcv_rtt(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rcv_rtt$LAYOUT, 92L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rcv_space$layout() {
        return tcpi_rcv_space$LAYOUT;
    }

    public static final long tcpi_rcv_space$offset() {
        return 96L;
    }

    public static int tcpi_rcv_space(MemorySegment struct) {
        return struct.get(tcpi_rcv_space$LAYOUT, 96L);
    }

    public static void tcpi_rcv_space(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rcv_space$LAYOUT, 96L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_total_retrans$layout() {
        return tcpi_total_retrans$LAYOUT;
    }

    public static final long tcpi_total_retrans$offset() {
        return 100L;
    }

    public static int tcpi_total_retrans(MemorySegment struct) {
        return struct.get(tcpi_total_retrans$LAYOUT, 100L);
    }

    public static void tcpi_total_retrans(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_total_retrans$LAYOUT, 100L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_pacing_rate$layout() {
        return tcpi_pacing_rate$LAYOUT;
    }

    public static final long tcpi_pacing_rate$offset() {
        return 104L;
    }

    public static long tcpi_pacing_rate(MemorySegment struct) {
        return struct.get(tcpi_pacing_rate$LAYOUT, 104L);
    }

    public static void tcpi_pacing_rate(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_pacing_rate$LAYOUT, 104L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_max_pacing_rate$layout() {
        return tcpi_max_pacing_rate$LAYOUT;
    }

    public static final long tcpi_max_pacing_rate$offset() {
        return 112L;
    }

    public static long tcpi_max_pacing_rate(MemorySegment struct) {
        return struct.get(tcpi_max_pacing_rate$LAYOUT, 112L);
    }

    public static void tcpi_max_pacing_rate(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_max_pacing_rate$LAYOUT, 112L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_bytes_acked$layout() {
        return tcpi_bytes_acked$LAYOUT;
    }

    public static final long tcpi_bytes_acked$offset() {
        return 120L;
    }

    public static long tcpi_bytes_acked(MemorySegment struct) {
        return struct.get(tcpi_bytes_acked$LAYOUT, 120L);
    }

    public static void tcpi_bytes_acked(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_bytes_acked$LAYOUT, 120L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_bytes_received$layout() {
        return tcpi_bytes_received$LAYOUT;
    }

    public static final long tcpi_bytes_received$offset() {
        return 128L;
    }

    public static long tcpi_bytes_received(MemorySegment struct) {
        return struct.get(tcpi_bytes_received$LAYOUT, 128L);
    }

    public static void tcpi_bytes_received(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_bytes_received$LAYOUT, 128L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_segs_out$layout() {
        return tcpi_segs_out$LAYOUT;
    }

    public static final long tcpi_segs_out$offset() {
        return 136L;
    }

    public static int tcpi_segs_out(MemorySegment struct) {
        return struct.get(tcpi_segs_out$LAYOUT, 136L);
    }

    public static void tcpi_segs_out(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_segs_out$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_segs_in$layout() {
        return tcpi_segs_in$LAYOUT;
    }

    public static final long tcpi_segs_in$offset() {
        return 140L;
    }

    public static int tcpi_segs_in(MemorySegment struct) {
        return struct.get(tcpi_segs_in$LAYOUT, 140L);
    }

    public static void tcpi_segs_in(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_segs_in$LAYOUT, 140L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_notsent_bytes$layout() {
        return tcpi_notsent_bytes$LAYOUT;
    }

    public static final long tcpi_notsent_bytes$offset() {
        return 144L;
    }

    public static int tcpi_notsent_bytes(MemorySegment struct) {
        return struct.get(tcpi_notsent_bytes$LAYOUT, 144L);
    }

    public static void tcpi_notsent_bytes(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_notsent_bytes$LAYOUT, 144L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_min_rtt$layout() {
        return tcpi_min_rtt$LAYOUT;
    }

    public static final long tcpi_min_rtt$offset() {
        return 148L;
    }

    public static int tcpi_min_rtt(MemorySegment struct) {
        return struct.get(tcpi_min_rtt$LAYOUT, 148L);
    }

    public static void tcpi_min_rtt(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_min_rtt$LAYOUT, 148L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_data_segs_in$layout() {
        return tcpi_data_segs_in$LAYOUT;
    }

    public static final long tcpi_data_segs_in$offset() {
        return 152L;
    }

    public static int tcpi_data_segs_in(MemorySegment struct) {
        return struct.get(tcpi_data_segs_in$LAYOUT, 152L);
    }

    public static void tcpi_data_segs_in(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_data_segs_in$LAYOUT, 152L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_data_segs_out$layout() {
        return tcpi_data_segs_out$LAYOUT;
    }

    public static final long tcpi_data_segs_out$offset() {
        return 156L;
    }

    public static int tcpi_data_segs_out(MemorySegment struct) {
        return struct.get(tcpi_data_segs_out$LAYOUT, 156L);
    }

    public static void tcpi_data_segs_out(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_data_segs_out$LAYOUT, 156L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_delivery_rate$layout() {
        return tcpi_delivery_rate$LAYOUT;
    }

    public static final long tcpi_delivery_rate$offset() {
        return 160L;
    }

    public static long tcpi_delivery_rate(MemorySegment struct) {
        return struct.get(tcpi_delivery_rate$LAYOUT, 160L);
    }

    public static void tcpi_delivery_rate(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_delivery_rate$LAYOUT, 160L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_busy_time$layout() {
        return tcpi_busy_time$LAYOUT;
    }

    public static final long tcpi_busy_time$offset() {
        return 168L;
    }

    public static long tcpi_busy_time(MemorySegment struct) {
        return struct.get(tcpi_busy_time$LAYOUT, 168L);
    }

    public static void tcpi_busy_time(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_busy_time$LAYOUT, 168L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_rwnd_limited$layout() {
        return tcpi_rwnd_limited$LAYOUT;
    }

    public static final long tcpi_rwnd_limited$offset() {
        return 176L;
    }

    public static long tcpi_rwnd_limited(MemorySegment struct) {
        return struct.get(tcpi_rwnd_limited$LAYOUT, 176L);
    }

    public static void tcpi_rwnd_limited(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_rwnd_limited$LAYOUT, 176L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_sndbuf_limited$layout() {
        return tcpi_sndbuf_limited$LAYOUT;
    }

    public static final long tcpi_sndbuf_limited$offset() {
        return 184L;
    }

    public static long tcpi_sndbuf_limited(MemorySegment struct) {
        return struct.get(tcpi_sndbuf_limited$LAYOUT, 184L);
    }

    public static void tcpi_sndbuf_limited(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_sndbuf_limited$LAYOUT, 184L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_delivered$layout() {
        return tcpi_delivered$LAYOUT;
    }

    public static final long tcpi_delivered$offset() {
        return 192L;
    }

    public static int tcpi_delivered(MemorySegment struct) {
        return struct.get(tcpi_delivered$LAYOUT, 192L);
    }

    public static void tcpi_delivered(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_delivered$LAYOUT, 192L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_delivered_ce$layout() {
        return tcpi_delivered_ce$LAYOUT;
    }

    public static final long tcpi_delivered_ce$offset() {
        return 196L;
    }

    public static int tcpi_delivered_ce(MemorySegment struct) {
        return struct.get(tcpi_delivered_ce$LAYOUT, 196L);
    }

    public static void tcpi_delivered_ce(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_delivered_ce$LAYOUT, 196L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_bytes_sent$layout() {
        return tcpi_bytes_sent$LAYOUT;
    }

    public static final long tcpi_bytes_sent$offset() {
        return 200L;
    }

    public static long tcpi_bytes_sent(MemorySegment struct) {
        return struct.get(tcpi_bytes_sent$LAYOUT, 200L);
    }

    public static void tcpi_bytes_sent(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_bytes_sent$LAYOUT, 200L, fieldValue);
    }

    public static final ValueLayout.OfLong tcpi_bytes_retrans$layout() {
        return tcpi_bytes_retrans$LAYOUT;
    }

    public static final long tcpi_bytes_retrans$offset() {
        return 208L;
    }

    public static long tcpi_bytes_retrans(MemorySegment struct) {
        return struct.get(tcpi_bytes_retrans$LAYOUT, 208L);
    }

    public static void tcpi_bytes_retrans(MemorySegment struct, long fieldValue) {
        struct.set(tcpi_bytes_retrans$LAYOUT, 208L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_dsack_dups$layout() {
        return tcpi_dsack_dups$LAYOUT;
    }

    public static final long tcpi_dsack_dups$offset() {
        return 216L;
    }

    public static int tcpi_dsack_dups(MemorySegment struct) {
        return struct.get(tcpi_dsack_dups$LAYOUT, 216L);
    }

    public static void tcpi_dsack_dups(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_dsack_dups$LAYOUT, 216L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_reord_seen$layout() {
        return tcpi_reord_seen$LAYOUT;
    }

    public static final long tcpi_reord_seen$offset() {
        return 220L;
    }

    public static int tcpi_reord_seen(MemorySegment struct) {
        return struct.get(tcpi_reord_seen$LAYOUT, 220L);
    }

    public static void tcpi_reord_seen(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_reord_seen$LAYOUT, 220L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rcv_ooopack$layout() {
        return tcpi_rcv_ooopack$LAYOUT;
    }

    public static final long tcpi_rcv_ooopack$offset() {
        return 224L;
    }

    public static int tcpi_rcv_ooopack(MemorySegment struct) {
        return struct.get(tcpi_rcv_ooopack$LAYOUT, 224L);
    }

    public static void tcpi_rcv_ooopack(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rcv_ooopack$LAYOUT, 224L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_snd_wnd$layout() {
        return tcpi_snd_wnd$LAYOUT;
    }

    public static final long tcpi_snd_wnd$offset() {
        return 228L;
    }

    public static int tcpi_snd_wnd(MemorySegment struct) {
        return struct.get(tcpi_snd_wnd$LAYOUT, 228L);
    }

    public static void tcpi_snd_wnd(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_snd_wnd$LAYOUT, 228L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rcv_wnd$layout() {
        return tcpi_rcv_wnd$LAYOUT;
    }

    public static final long tcpi_rcv_wnd$offset() {
        return 232L;
    }

    public static int tcpi_rcv_wnd(MemorySegment struct) {
        return struct.get(tcpi_rcv_wnd$LAYOUT, 232L);
    }

    public static void tcpi_rcv_wnd(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rcv_wnd$LAYOUT, 232L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_rehash$layout() {
        return tcpi_rehash$LAYOUT;
    }

    public static final long tcpi_rehash$offset() {
        return 236L;
    }

    public static int tcpi_rehash(MemorySegment struct) {
        return struct.get(tcpi_rehash$LAYOUT, 236L);
    }

    public static void tcpi_rehash(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_rehash$LAYOUT, 236L, fieldValue);
    }

    public static final ValueLayout.OfShort tcpi_total_rto$layout() {
        return tcpi_total_rto$LAYOUT;
    }

    public static final long tcpi_total_rto$offset() {
        return 240L;
    }

    public static short tcpi_total_rto(MemorySegment struct) {
        return struct.get(tcpi_total_rto$LAYOUT, 240L);
    }

    public static void tcpi_total_rto(MemorySegment struct, short fieldValue) {
        struct.set(tcpi_total_rto$LAYOUT, 240L, fieldValue);
    }

    public static final ValueLayout.OfShort tcpi_total_rto_recoveries$layout() {
        return tcpi_total_rto_recoveries$LAYOUT;
    }

    public static final long tcpi_total_rto_recoveries$offset() {
        return 242L;
    }

    public static short tcpi_total_rto_recoveries(MemorySegment struct) {
        return struct.get(tcpi_total_rto_recoveries$LAYOUT, 242L);
    }

    public static void tcpi_total_rto_recoveries(MemorySegment struct, short fieldValue) {
        struct.set(tcpi_total_rto_recoveries$LAYOUT, 242L, fieldValue);
    }

    public static final ValueLayout.OfInt tcpi_total_rto_time$layout() {
        return tcpi_total_rto_time$LAYOUT;
    }

    public static final long tcpi_total_rto_time$offset() {
        return 244L;
    }

    public static int tcpi_total_rto_time(MemorySegment struct) {
        return struct.get(tcpi_total_rto_time$LAYOUT, 244L);
    }

    public static void tcpi_total_rto_time(MemorySegment struct, int fieldValue) {
        struct.set(tcpi_total_rto_time$LAYOUT, 244L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(tcp_info.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return tcp_info.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)tcp_info.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcp_info.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return tcp_info.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(tcp_info.layout().byteSize() * elementCount, arena, cleanup);
    }
}

