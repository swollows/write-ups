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
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
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

public class bpf_tcp_sock {
    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("snd_cwnd"), Lib.C_INT.withName("srtt_us"), Lib.C_INT.withName("rtt_min"), Lib.C_INT.withName("snd_ssthresh"), Lib.C_INT.withName("rcv_nxt"), Lib.C_INT.withName("snd_nxt"), Lib.C_INT.withName("snd_una"), Lib.C_INT.withName("mss_cache"), Lib.C_INT.withName("ecn_flags"), Lib.C_INT.withName("rate_delivered"), Lib.C_INT.withName("rate_interval_us"), Lib.C_INT.withName("packets_out"), Lib.C_INT.withName("retrans_out"), Lib.C_INT.withName("total_retrans"), Lib.C_INT.withName("segs_in"), Lib.C_INT.withName("data_segs_in"), Lib.C_INT.withName("segs_out"), Lib.C_INT.withName("data_segs_out"), Lib.C_INT.withName("lost_out"), Lib.C_INT.withName("sacked_out"), Lib.C_LONG_LONG.withName("bytes_received"), Lib.C_LONG_LONG.withName("bytes_acked"), Lib.C_INT.withName("dsack_dups"), Lib.C_INT.withName("delivered"), Lib.C_INT.withName("delivered_ce"), Lib.C_INT.withName("icsk_retransmits")}).withName("bpf_tcp_sock");
    private static final ValueLayout.OfInt snd_cwnd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_cwnd")});
    private static final long snd_cwnd$OFFSET = 0L;
    private static final ValueLayout.OfInt srtt_us$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"srtt_us")});
    private static final long srtt_us$OFFSET = 4L;
    private static final ValueLayout.OfInt rtt_min$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rtt_min")});
    private static final long rtt_min$OFFSET = 8L;
    private static final ValueLayout.OfInt snd_ssthresh$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_ssthresh")});
    private static final long snd_ssthresh$OFFSET = 12L;
    private static final ValueLayout.OfInt rcv_nxt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rcv_nxt")});
    private static final long rcv_nxt$OFFSET = 16L;
    private static final ValueLayout.OfInt snd_nxt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_nxt")});
    private static final long snd_nxt$OFFSET = 20L;
    private static final ValueLayout.OfInt snd_una$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"snd_una")});
    private static final long snd_una$OFFSET = 24L;
    private static final ValueLayout.OfInt mss_cache$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"mss_cache")});
    private static final long mss_cache$OFFSET = 28L;
    private static final ValueLayout.OfInt ecn_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ecn_flags")});
    private static final long ecn_flags$OFFSET = 32L;
    private static final ValueLayout.OfInt rate_delivered$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rate_delivered")});
    private static final long rate_delivered$OFFSET = 36L;
    private static final ValueLayout.OfInt rate_interval_us$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"rate_interval_us")});
    private static final long rate_interval_us$OFFSET = 40L;
    private static final ValueLayout.OfInt packets_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"packets_out")});
    private static final long packets_out$OFFSET = 44L;
    private static final ValueLayout.OfInt retrans_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"retrans_out")});
    private static final long retrans_out$OFFSET = 48L;
    private static final ValueLayout.OfInt total_retrans$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"total_retrans")});
    private static final long total_retrans$OFFSET = 52L;
    private static final ValueLayout.OfInt segs_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"segs_in")});
    private static final long segs_in$OFFSET = 56L;
    private static final ValueLayout.OfInt data_segs_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_segs_in")});
    private static final long data_segs_in$OFFSET = 60L;
    private static final ValueLayout.OfInt segs_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"segs_out")});
    private static final long segs_out$OFFSET = 64L;
    private static final ValueLayout.OfInt data_segs_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_segs_out")});
    private static final long data_segs_out$OFFSET = 68L;
    private static final ValueLayout.OfInt lost_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"lost_out")});
    private static final long lost_out$OFFSET = 72L;
    private static final ValueLayout.OfInt sacked_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"sacked_out")});
    private static final long sacked_out$OFFSET = 76L;
    private static final ValueLayout.OfLong bytes_received$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bytes_received")});
    private static final long bytes_received$OFFSET = 80L;
    private static final ValueLayout.OfLong bytes_acked$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bytes_acked")});
    private static final long bytes_acked$OFFSET = 88L;
    private static final ValueLayout.OfInt dsack_dups$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"dsack_dups")});
    private static final long dsack_dups$OFFSET = 96L;
    private static final ValueLayout.OfInt delivered$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"delivered")});
    private static final long delivered$OFFSET = 100L;
    private static final ValueLayout.OfInt delivered_ce$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"delivered_ce")});
    private static final long delivered_ce$OFFSET = 104L;
    private static final ValueLayout.OfInt icsk_retransmits$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"icsk_retransmits")});
    private static final long icsk_retransmits$OFFSET = 108L;

    bpf_tcp_sock() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt snd_cwnd$layout() {
        return snd_cwnd$LAYOUT;
    }

    public static final long snd_cwnd$offset() {
        return 0L;
    }

    public static int snd_cwnd(MemorySegment struct) {
        return struct.get(snd_cwnd$LAYOUT, 0L);
    }

    public static void snd_cwnd(MemorySegment struct, int fieldValue) {
        struct.set(snd_cwnd$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt srtt_us$layout() {
        return srtt_us$LAYOUT;
    }

    public static final long srtt_us$offset() {
        return 4L;
    }

    public static int srtt_us(MemorySegment struct) {
        return struct.get(srtt_us$LAYOUT, 4L);
    }

    public static void srtt_us(MemorySegment struct, int fieldValue) {
        struct.set(srtt_us$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt rtt_min$layout() {
        return rtt_min$LAYOUT;
    }

    public static final long rtt_min$offset() {
        return 8L;
    }

    public static int rtt_min(MemorySegment struct) {
        return struct.get(rtt_min$LAYOUT, 8L);
    }

    public static void rtt_min(MemorySegment struct, int fieldValue) {
        struct.set(rtt_min$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_ssthresh$layout() {
        return snd_ssthresh$LAYOUT;
    }

    public static final long snd_ssthresh$offset() {
        return 12L;
    }

    public static int snd_ssthresh(MemorySegment struct) {
        return struct.get(snd_ssthresh$LAYOUT, 12L);
    }

    public static void snd_ssthresh(MemorySegment struct, int fieldValue) {
        struct.set(snd_ssthresh$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt rcv_nxt$layout() {
        return rcv_nxt$LAYOUT;
    }

    public static final long rcv_nxt$offset() {
        return 16L;
    }

    public static int rcv_nxt(MemorySegment struct) {
        return struct.get(rcv_nxt$LAYOUT, 16L);
    }

    public static void rcv_nxt(MemorySegment struct, int fieldValue) {
        struct.set(rcv_nxt$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_nxt$layout() {
        return snd_nxt$LAYOUT;
    }

    public static final long snd_nxt$offset() {
        return 20L;
    }

    public static int snd_nxt(MemorySegment struct) {
        return struct.get(snd_nxt$LAYOUT, 20L);
    }

    public static void snd_nxt(MemorySegment struct, int fieldValue) {
        struct.set(snd_nxt$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt snd_una$layout() {
        return snd_una$LAYOUT;
    }

    public static final long snd_una$offset() {
        return 24L;
    }

    public static int snd_una(MemorySegment struct) {
        return struct.get(snd_una$LAYOUT, 24L);
    }

    public static void snd_una(MemorySegment struct, int fieldValue) {
        struct.set(snd_una$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt mss_cache$layout() {
        return mss_cache$LAYOUT;
    }

    public static final long mss_cache$offset() {
        return 28L;
    }

    public static int mss_cache(MemorySegment struct) {
        return struct.get(mss_cache$LAYOUT, 28L);
    }

    public static void mss_cache(MemorySegment struct, int fieldValue) {
        struct.set(mss_cache$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt ecn_flags$layout() {
        return ecn_flags$LAYOUT;
    }

    public static final long ecn_flags$offset() {
        return 32L;
    }

    public static int ecn_flags(MemorySegment struct) {
        return struct.get(ecn_flags$LAYOUT, 32L);
    }

    public static void ecn_flags(MemorySegment struct, int fieldValue) {
        struct.set(ecn_flags$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt rate_delivered$layout() {
        return rate_delivered$LAYOUT;
    }

    public static final long rate_delivered$offset() {
        return 36L;
    }

    public static int rate_delivered(MemorySegment struct) {
        return struct.get(rate_delivered$LAYOUT, 36L);
    }

    public static void rate_delivered(MemorySegment struct, int fieldValue) {
        struct.set(rate_delivered$LAYOUT, 36L, fieldValue);
    }

    public static final ValueLayout.OfInt rate_interval_us$layout() {
        return rate_interval_us$LAYOUT;
    }

    public static final long rate_interval_us$offset() {
        return 40L;
    }

    public static int rate_interval_us(MemorySegment struct) {
        return struct.get(rate_interval_us$LAYOUT, 40L);
    }

    public static void rate_interval_us(MemorySegment struct, int fieldValue) {
        struct.set(rate_interval_us$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt packets_out$layout() {
        return packets_out$LAYOUT;
    }

    public static final long packets_out$offset() {
        return 44L;
    }

    public static int packets_out(MemorySegment struct) {
        return struct.get(packets_out$LAYOUT, 44L);
    }

    public static void packets_out(MemorySegment struct, int fieldValue) {
        struct.set(packets_out$LAYOUT, 44L, fieldValue);
    }

    public static final ValueLayout.OfInt retrans_out$layout() {
        return retrans_out$LAYOUT;
    }

    public static final long retrans_out$offset() {
        return 48L;
    }

    public static int retrans_out(MemorySegment struct) {
        return struct.get(retrans_out$LAYOUT, 48L);
    }

    public static void retrans_out(MemorySegment struct, int fieldValue) {
        struct.set(retrans_out$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt total_retrans$layout() {
        return total_retrans$LAYOUT;
    }

    public static final long total_retrans$offset() {
        return 52L;
    }

    public static int total_retrans(MemorySegment struct) {
        return struct.get(total_retrans$LAYOUT, 52L);
    }

    public static void total_retrans(MemorySegment struct, int fieldValue) {
        struct.set(total_retrans$LAYOUT, 52L, fieldValue);
    }

    public static final ValueLayout.OfInt segs_in$layout() {
        return segs_in$LAYOUT;
    }

    public static final long segs_in$offset() {
        return 56L;
    }

    public static int segs_in(MemorySegment struct) {
        return struct.get(segs_in$LAYOUT, 56L);
    }

    public static void segs_in(MemorySegment struct, int fieldValue) {
        struct.set(segs_in$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfInt data_segs_in$layout() {
        return data_segs_in$LAYOUT;
    }

    public static final long data_segs_in$offset() {
        return 60L;
    }

    public static int data_segs_in(MemorySegment struct) {
        return struct.get(data_segs_in$LAYOUT, 60L);
    }

    public static void data_segs_in(MemorySegment struct, int fieldValue) {
        struct.set(data_segs_in$LAYOUT, 60L, fieldValue);
    }

    public static final ValueLayout.OfInt segs_out$layout() {
        return segs_out$LAYOUT;
    }

    public static final long segs_out$offset() {
        return 64L;
    }

    public static int segs_out(MemorySegment struct) {
        return struct.get(segs_out$LAYOUT, 64L);
    }

    public static void segs_out(MemorySegment struct, int fieldValue) {
        struct.set(segs_out$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt data_segs_out$layout() {
        return data_segs_out$LAYOUT;
    }

    public static final long data_segs_out$offset() {
        return 68L;
    }

    public static int data_segs_out(MemorySegment struct) {
        return struct.get(data_segs_out$LAYOUT, 68L);
    }

    public static void data_segs_out(MemorySegment struct, int fieldValue) {
        struct.set(data_segs_out$LAYOUT, 68L, fieldValue);
    }

    public static final ValueLayout.OfInt lost_out$layout() {
        return lost_out$LAYOUT;
    }

    public static final long lost_out$offset() {
        return 72L;
    }

    public static int lost_out(MemorySegment struct) {
        return struct.get(lost_out$LAYOUT, 72L);
    }

    public static void lost_out(MemorySegment struct, int fieldValue) {
        struct.set(lost_out$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt sacked_out$layout() {
        return sacked_out$LAYOUT;
    }

    public static final long sacked_out$offset() {
        return 76L;
    }

    public static int sacked_out(MemorySegment struct) {
        return struct.get(sacked_out$LAYOUT, 76L);
    }

    public static void sacked_out(MemorySegment struct, int fieldValue) {
        struct.set(sacked_out$LAYOUT, 76L, fieldValue);
    }

    public static final ValueLayout.OfLong bytes_received$layout() {
        return bytes_received$LAYOUT;
    }

    public static final long bytes_received$offset() {
        return 80L;
    }

    public static long bytes_received(MemorySegment struct) {
        return struct.get(bytes_received$LAYOUT, 80L);
    }

    public static void bytes_received(MemorySegment struct, long fieldValue) {
        struct.set(bytes_received$LAYOUT, 80L, fieldValue);
    }

    public static final ValueLayout.OfLong bytes_acked$layout() {
        return bytes_acked$LAYOUT;
    }

    public static final long bytes_acked$offset() {
        return 88L;
    }

    public static long bytes_acked(MemorySegment struct) {
        return struct.get(bytes_acked$LAYOUT, 88L);
    }

    public static void bytes_acked(MemorySegment struct, long fieldValue) {
        struct.set(bytes_acked$LAYOUT, 88L, fieldValue);
    }

    public static final ValueLayout.OfInt dsack_dups$layout() {
        return dsack_dups$LAYOUT;
    }

    public static final long dsack_dups$offset() {
        return 96L;
    }

    public static int dsack_dups(MemorySegment struct) {
        return struct.get(dsack_dups$LAYOUT, 96L);
    }

    public static void dsack_dups(MemorySegment struct, int fieldValue) {
        struct.set(dsack_dups$LAYOUT, 96L, fieldValue);
    }

    public static final ValueLayout.OfInt delivered$layout() {
        return delivered$LAYOUT;
    }

    public static final long delivered$offset() {
        return 100L;
    }

    public static int delivered(MemorySegment struct) {
        return struct.get(delivered$LAYOUT, 100L);
    }

    public static void delivered(MemorySegment struct, int fieldValue) {
        struct.set(delivered$LAYOUT, 100L, fieldValue);
    }

    public static final ValueLayout.OfInt delivered_ce$layout() {
        return delivered_ce$LAYOUT;
    }

    public static final long delivered_ce$offset() {
        return 104L;
    }

    public static int delivered_ce(MemorySegment struct) {
        return struct.get(delivered_ce$LAYOUT, 104L);
    }

    public static void delivered_ce(MemorySegment struct, int fieldValue) {
        struct.set(delivered_ce$LAYOUT, 104L, fieldValue);
    }

    public static final ValueLayout.OfInt icsk_retransmits$layout() {
        return icsk_retransmits$LAYOUT;
    }

    public static final long icsk_retransmits$offset() {
        return 108L;
    }

    public static int icsk_retransmits(MemorySegment struct) {
        return struct.get(icsk_retransmits$LAYOUT, 108L);
    }

    public static void icsk_retransmits(MemorySegment struct, int fieldValue) {
        struct.set(icsk_retransmits$LAYOUT, 108L, fieldValue);
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_tcp_sock.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_tcp_sock.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_tcp_sock.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_tcp_sock.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_tcp_sock.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_tcp_sock.layout().byteSize() * elementCount, arena, cleanup);
    }
}

